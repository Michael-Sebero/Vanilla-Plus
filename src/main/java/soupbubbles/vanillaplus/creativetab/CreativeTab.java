package soupbubbles.vanillaplus.creativetab;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.google.common.collect.Ordering;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import soupbubbles.vanillaplus.block.base.BlockSlabBase;
import soupbubbles.vanillaplus.block.base.BlockStairBase;
import soupbubbles.vanillaplus.init.ModBlocks;
import soupbubbles.vanillaplus.lib.Reference;
import soupbubbles.vanillaplus.util.IStairSlab;
import soupbubbles.vanillaplus.util.Utils;

public class CreativeTab
{
    public static List<Item> tabList = new ArrayList();
    public static List<Item> stairAndSlabList = new ArrayList();
    private static Comparator<ItemStack> tabSorter;

    public static void init()
    {
    }

    public static final CreativeTabs MINECRAFTBOOM_TAB = new CreativeTabs(Reference.MOD_ID + "_tab")
    {
        @Override
        public ItemStack getTabIconItem()
        {
            return new ItemStack(ModBlocks.BLOCK_TERRACOTTA_BRICKS);
        }

        @SideOnly(Side.CLIENT)
        @Override
        public void displayAllRelevantItems(NonNullList<ItemStack> list)
        {
            super.displayAllRelevantItems(list);
            List<ItemStack> removeList = new ArrayList<ItemStack>();

            for (ItemStack stack : list)
            {
                if (!Utils.isItemEnabled(stack.getItem()))
                {
                    removeList.add(stack);
                }
            }

            for (ItemStack stack : removeList)
            {
                list.remove(stack);
            }

            tabSorter = Ordering.explicit(tabList).onResultOf(ItemStack::getItem);
            list.sort(tabSorter);
        }
    };

    public static final CreativeTabs MINECRAFTBOOM_STAIRS_AND_SLABS_TAB = new CreativeTabs(Reference.MOD_ID + "_stairs_and_slabs_tab")
    {
        @Override
        public ItemStack getTabIconItem()
        {
            return new ItemStack(ModBlocks.BLOCK_TERRACOTTA_BRICKS); // Changed icon to BLOCK_TERRACOTTA_BRICKS for consistency
        }

        @SideOnly(Side.CLIENT)
        @Override
        public void displayAllRelevantItems(NonNullList<ItemStack> list)
        {
            super.displayAllRelevantItems(list);
            List<ItemStack> removeList = new ArrayList<ItemStack>();

            for (ItemStack stack : list)
            {
                if (!Utils.isBlockEnabled(Block.getBlockFromItem(stack.getItem())))
                {
                    removeList.add(stack);
                }
            }

            for (ItemStack stack : removeList)
            {
                list.remove(stack);
            }

            tabSorter = Ordering.explicit(stairAndSlabList).onResultOf(ItemStack::getItem);
            list.sort(tabSorter);
        }
    };
}
