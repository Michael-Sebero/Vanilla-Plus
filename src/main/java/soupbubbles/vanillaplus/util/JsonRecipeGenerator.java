package soupbubbles.vanillaplus.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.google.common.collect.ImmutableMap;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import soupbubbles.vanillaplus.handler.ConfigurationHandler;
import soupbubbles.vanillaplus.init.ModBlocks;

/**
 * @author williewillus Temporarily here while new recipes are still being
 *         added. Will eventually be removed from the mod. Big thanks to
 *         williewillus for saving me some hassle :)
 */

public class JsonRecipeGenerator
{
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static File RECIPE_DIR = new File("F:\\Programming\\Minecraft\\1.12.2\\Minecraft-Boom\\src\\main\\resources\\assets\\vanillaplus\\recipes");
    private static final Set<String> USED_OD_NAMES = new TreeSet<>();

    public static void init()
    {
        Block[] dyeList = {ModBlocks.BLOCK_WHITE_STAINED_SOUL_GLASS_PANE, ModBlocks.BLOCK_ORANGE_STAINED_SOUL_GLASS_PANE, ModBlocks.BLOCK_MAGENTA_STAINED_SOUL_GLASS_PANE, ModBlocks.BLOCK_LIGHT_BLUE_STAINED_SOUL_GLASS_PANE, ModBlocks.BLOCK_YELLOW_STAINED_SOUL_GLASS_PANE, ModBlocks.BLOCK_LIME_STAINED_SOUL_GLASS_PANE, ModBlocks.BLOCK_PINK_STAINED_SOUL_GLASS_PANE, ModBlocks.BLOCK_GRAY_STAINED_SOUL_GLASS_PANE, ModBlocks.BLOCK_SILVER_STAINED_SOUL_GLASS_PANE, ModBlocks.BLOCK_CYAN_STAINED_SOUL_GLASS_PANE, ModBlocks.BLOCK_PURPLE_STAINED_SOUL_GLASS_PANE, ModBlocks.BLOCK_BLUE_STAINED_SOUL_GLASS_PANE, ModBlocks.BLOCK_BROWN_STAINED_SOUL_GLASS_PANE, ModBlocks.BLOCK_GREEN_STAINED_SOUL_GLASS_PANE, ModBlocks.BLOCK_RED_STAINED_SOUL_GLASS_PANE, ModBlocks.BLOCK_BLACK_STAINED_SOUL_GLASS_PANE};

        for (int i = 0; i < dyeList.length; i++)
        {
            //addShapedRecipe(new ItemStack(dyeList[i], 16), "xxx", "xxx", 'x', soulList[i]);
        }
    }

    private static void setupDir()
    {
        if (RECIPE_DIR == null)
        {
            RECIPE_DIR = ConfigurationHandler.configuration.getConfigFile().toPath().resolve("../recipes/").toFile();
        }

        if (!RECIPE_DIR.exists())
        {
            RECIPE_DIR.mkdir();
        }
    }

    private static void addShapedRecipe(ItemStack result, Object... components)
    {
        setupDir();

        Map<String, Object> json = new HashMap<>();

        List<String> pattern = new ArrayList<>();
        int i = 0;
        while (i < components.length && components[i] instanceof String)
        {
            pattern.add((String) components[i]);
            i++;
        }
        json.put("pattern", pattern);

        boolean isOreDict = false;
        Map<String, Map<String, Object>> key = new HashMap<>();
        Character curKey = null;
        for (; i < components.length; i++)
        {
            Object o = components[i];
            if (o instanceof Character)
            {
                if (curKey != null)
                    throw new IllegalArgumentException("Provided two char keys in a row");
                curKey = (Character) o;
            }
            else
            {
                if (curKey == null)
                    throw new IllegalArgumentException("Providing object without a char key");
                if (o instanceof String)
                    isOreDict = true;
                key.put(Character.toString(curKey), serializeItem(o));
                curKey = null;
            }
        }
        json.put("key", key);
        json.put("type", isOreDict ? "forge:ore_shaped" : "minecraft:crafting_shaped");
        json.put("result", serializeItem(result));

        String suffix = result.getItem().getHasSubtypes() ? "_" + result.getItemDamage() : "";
        File f = new File(RECIPE_DIR, result.getItem().getRegistryName().getResourcePath() + suffix + ".json");

        while (f.exists())
        {
            suffix += "_alt";
            f = new File(RECIPE_DIR, result.getItem().getRegistryName().getResourcePath() + suffix + ".json");
        }

        try (FileWriter w = new FileWriter(f))
        {
            GSON.toJson(json, w);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private static void addShapelessRecipe(ItemStack result, Object... components)
    {
        setupDir();

        Map<String, Object> json = new HashMap<>();

        boolean isOreDict = false;
        List<Map<String, Object>> ingredients = new ArrayList<>();
        for (Object o : components)
        {
            if (o instanceof String)
                isOreDict = true;
            ingredients.add(serializeItem(o));
        }
        json.put("ingredients", ingredients);
        json.put("type", isOreDict ? "forge:ore_shapeless" : "minecraft:crafting_shapeless");
        json.put("result", serializeItem(result));

        String suffix = result.getItem().getHasSubtypes() ? "_" + result.getItemDamage() : "";
        File f = new File(RECIPE_DIR, result.getItem().getRegistryName().getResourcePath() + suffix + ".json");

        while (f.exists())
        {
            suffix += "_alt";
            f = new File(RECIPE_DIR, result.getItem().getRegistryName().getResourcePath() + suffix + ".json");
        }

        try (FileWriter w = new FileWriter(f))
        {
            GSON.toJson(json, w);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private static Map<String, Object> serializeItem(Object thing)
    {
        if (thing instanceof Item)
        {
            return serializeItem(new ItemStack((Item) thing));
        }
        if (thing instanceof Block)
        {
            return serializeItem(new ItemStack((Block) thing));
        }
        if (thing instanceof ItemStack)
        {
            ItemStack stack = (ItemStack) thing;
            Map<String, Object> ret = new HashMap<>();
            ret.put("item", stack.getItem().getRegistryName().toString());
            if (stack.getItem().getHasSubtypes() || stack.getItemDamage() != 0)
            {
                ret.put("data", stack.getItemDamage());
            }
            if (stack.getCount() > 1)
            {
                ret.put("count", stack.getCount());
            }

            if (stack.hasTagCompound())
            {
                ret.put("type", "minecraft:item_nbt");
                ret.put("nbt", stack.getTagCompound().toString());
            }

            return ret;
        }
        if (thing instanceof String)
        {
            Map<String, Object> ret = new HashMap<>();
            USED_OD_NAMES.add((String) thing);
            ret.put("item", "#" + ((String) thing).toUpperCase(Locale.ROOT));
            return ret;
        }

        throw new IllegalArgumentException("Not a block, item, stack, or od name");
    }

    private static void generateConstants()
    {
        List<Map<String, Object>> json = new ArrayList<>();

        for (String s : USED_OD_NAMES)
        {
            Map<String, Object> entry = new HashMap<>();
            entry.put("name", s.toUpperCase(Locale.ROOT));
            entry.put("ingredient", ImmutableMap.of("type", "forge:ore_dict", "ore", s));
            json.add(entry);
        }

        try (FileWriter w = new FileWriter(new File(RECIPE_DIR, "_constants.json")))
        {
            GSON.toJson(json, w);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
