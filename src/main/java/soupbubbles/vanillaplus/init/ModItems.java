package soupbubbles.vanillaplus.init;

import java.util.HashSet;
import java.util.Set;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import soupbubbles.vanillaplus.creativetab.CreativeTab;
import soupbubbles.vanillaplus.handler.ConfigurationHandler;
import soupbubbles.vanillaplus.item.ItemGrenade;
import soupbubbles.vanillaplus.item.ItemPrismarineArrow;
import soupbubbles.vanillaplus.item.base.ItemBase;
import soupbubbles.vanillaplus.item.base.ItemFoodBase;
import soupbubbles.vanillaplus.lib.Names;

public class ModItems
{
    public static final Set<Item> ITEMS = new HashSet<>();

    public static final Item ITEM_ELDER_GUARDIAN_SPIKE;
    public static final Item ITEM_WITHER_BONE;
    public static final Item ITEM_POLAR_BEAR_FUR;
    public static final Item ITEM_PUMPKIN_SLICE;
    public static final Item ITEM_PRISMARINE_ARROW;
    public static final Item ITEM_WHEAT_ON_A_STICK;
    public static final Item ITEM_POPPED_CHORUS_GRENADE;
    public static final Item ITEM_LEVITATION_DUST;
    public static final Item ITEM_COOKED_EGG;

    static
    {
        ITEM_ELDER_GUARDIAN_SPIKE = registerItem(new ItemBase(Names.ITEM_ELDER_GUARDIAN_SPIKE));
        ITEM_POLAR_BEAR_FUR = registerItem(new ItemBase(Names.ITEM_POLAR_BEAR_FUR));
        ITEM_WITHER_BONE = registerItem(new ItemBase(Names.ITEM_WITHER_BONE));
        ITEM_PRISMARINE_ARROW = registerItem(new ItemPrismarineArrow());
        ITEM_WHEAT_ON_A_STICK = registerItem(new ItemBase(Names.ITEM_WHEAT_ON_A_STICK));
        ITEM_PUMPKIN_SLICE = registerItem(new ItemFoodBase(Names.ITEM_PUMPKIN_SLICE, 2, 1.2F, false));
        ITEM_POPPED_CHORUS_GRENADE = registerItem(new ItemGrenade());
        ITEM_LEVITATION_DUST = registerItem(new ItemBase(Names.ITEM_LEVITATION_DUST));
        ITEM_COOKED_EGG = registerItem(new ItemFoodBase(Names.ITEM_COOKED_EGG, 6, 2.8F, false));
    }

    public static void registerItems()
    {
    }

    private static <T extends Item> T registerItem(T item)
    {
        ForgeRegistries.ITEMS.register(item);
        ITEMS.add(item);
        ConfigurationHandler.createItemConfig(item);
        CreativeTab.tabList.add(item);

        return item;
    }
}
