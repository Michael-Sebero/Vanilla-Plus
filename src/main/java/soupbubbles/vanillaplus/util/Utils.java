package soupbubbles.vanillaplus.util;

import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import soupbubbles.vanillaplus.block.base.BlockSlabBase;
import soupbubbles.vanillaplus.block.base.BlockStairBase;
import soupbubbles.vanillaplus.handler.ConfigurationHandler;
import soupbubbles.vanillaplus.lib.Reference;

public class Utils
{
    public static void spawnEntityItem(World world, BlockPos pos, Item item)
    {
        spawnEntityItem(world, pos, new ItemStack(item));
    }

    public static void spawnEntityItem(World world, BlockPos pos, ItemStack stack)
    {
        if (!world.isRemote)
        {
            world.spawnEntity(new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), stack));
        }
    }

    public static String getBaseBlockName(Block block)
    {
        return getBaseBlockName(block.getUnlocalizedName());
    }

    public static String getBaseBlockName(String name)
    {
        return name.replace("tile.", "").replace(Reference.MOD_ID + ".", "");
    }

    public static String getBaseItemName(Item item)
    {
        return getBaseItemName(item.getUnlocalizedName());
    }

    public static String getBaseItemName(String name)
    {
        return name.replace("item.", "");
    }

    public static String getConfigName(Block block)
    {
        return capitalize(getBaseBlockName(block));
    }

    public static String getConfigName(Item item)
    {
        return capitalize(getBaseItemName(item));
    }

    public static String getConfigName(String s)
    {
        return capitalize(getBaseBlockName(s));
    }

    public static String getStairSlabConfigName(String s, Block block)
    {
        return block instanceof BlockStairBase ? "Add " + s.replace("Stairs ", "") + " Stair Block" : "Add " + s.replace("Slab ", "") + " Slab Block";
    }

    public static String capitalize(String s)
    {
        String[] split = s.split("_");
        String result = "";

        for (int i = 0; i < split.length; i++)
        {
            if (i != 0)
            {
                result += " " + split[i].substring(0, 1).toUpperCase() + split[i].substring(1);
            }
            else
            {
                result += split[i].substring(0, 1).toUpperCase() + split[i].substring(1);
            }
        }

        return result;
    }

    public static boolean isItemEnabled(Item item)
    {
        if (item instanceof ItemBlock)
        {
            return isBlockEnabled(Block.getBlockFromItem(item));
        }

        return ConfigurationHandler.configuration.get(ConfigurationHandler.CATEGORY_ITEMS + "." + getConfigName(item), getConfigName(item), true).getBoolean();
    }

    public static boolean isBlockEnabled(Block block)
    {
        return block instanceof BlockStairBase ? isStairEnabled((BlockStairBase) block) : block instanceof BlockSlabBase ? isSlabEnabled((BlockSlabBase) block) : ConfigurationHandler.configuration.get(ConfigurationHandler.CATEGORY_BLOCKS + "." + getConfigName(block), getConfigName(block), true).getBoolean();
    }

    private static boolean isStairEnabled(BlockStairBase block)
    {
        if (!block.isVanilla())
        {
            if (!isBlockEnabled(block.getStairBlockState().getBlock()) && ConfigurationHandler.removeBlockChildren)
            {
                return false;
            }
        }

        return ConfigurationHandler.configuration.get(ConfigurationHandler.CATEGORY_BLOCKS + "." + (block.isVanilla() ? "Vanilla Stairs and Slabs" : getConfigName(block.getStairBlockState().getBlock())), getStairSlabConfigName(Utils.getConfigName(block), block), true).getBoolean();
    }

    private static boolean isSlabEnabled(BlockSlabBase block)
    {
        if (!block.isVanilla())
        {
            if (!isBlockEnabled(block.getSlabBlockState().getBlock()) && ConfigurationHandler.removeBlockChildren)
            {
                return false;
            }
        }

        return ConfigurationHandler.configuration.get(ConfigurationHandler.CATEGORY_BLOCKS + "." + (block.isVanilla() ? "Vanilla Stairs and Slabs" : getConfigName(block.getSlabBlockState().getBlock())), getStairSlabConfigName(Utils.getConfigName(block), block), true).getBoolean();
    }
}
