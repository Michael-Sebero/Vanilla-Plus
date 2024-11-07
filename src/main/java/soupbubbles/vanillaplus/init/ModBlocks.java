package soupbubbles.vanillaplus.init;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Nullable;

import com.google.common.base.Function;

import net.minecraft.block.Block;
import net.minecraft.block.BlockColored;
import net.minecraft.block.BlockPrismarine;
import net.minecraft.block.BlockRedSandstone;
import net.minecraft.block.BlockSandStone;
import net.minecraft.block.BlockStone;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import soupbubbles.vanillaplus.block.BlockBookShelf;
import soupbubbles.vanillaplus.block.BlockFacelessPumpkin;
import soupbubbles.vanillaplus.block.BlockMagmaCream;
import soupbubbles.vanillaplus.block.BlockNetherBrickFenceGate;
import soupbubbles.vanillaplus.block.BlockPrismarineCrystal;
import soupbubbles.vanillaplus.block.BlockRedNetherBrickFence;
import soupbubbles.vanillaplus.block.BlockRose;
import soupbubbles.vanillaplus.block.BlockSoulGlass;
import soupbubbles.vanillaplus.block.BlockSoulGlassPane;
import soupbubbles.vanillaplus.block.BlockWoodenButton;
import soupbubbles.vanillaplus.block.BlockWoodenLadder;
import soupbubbles.vanillaplus.block.BlockWoodenTrapDoor;
import soupbubbles.vanillaplus.block.base.BlockBase;
import soupbubbles.vanillaplus.block.base.BlockFallingBase;
import soupbubbles.vanillaplus.block.base.BlockPaneBase;
import soupbubbles.vanillaplus.block.base.BlockPillarBase;
import soupbubbles.vanillaplus.block.base.BlockSlabBase;
import soupbubbles.vanillaplus.block.base.BlockStairBase;
import soupbubbles.vanillaplus.creativetab.CreativeTab;
import soupbubbles.vanillaplus.handler.ConfigurationHandler;
import soupbubbles.vanillaplus.item.base.ItemBlockSlab;
import soupbubbles.vanillaplus.lib.BlockValues;
import soupbubbles.vanillaplus.lib.Names;
import soupbubbles.vanillaplus.util.IStairSlab;
import soupbubbles.vanillaplus.util.Utils;

public class ModBlocks
{
    public static final Set<Block> BLOCKS = new HashSet<>();
    public static final List<Block> STAIRSLAB_LIST = new ArrayList<Block>();

    //Mod Blocks
    public static final Block BLOCK_TERRACOTTA_BRICKS;
    public static final Block BLOCK_WHITE_TERRACOTTA_BRICKS;
    public static final Block BLOCK_ORANGE_TERRACOTTA_BRICKS;
    public static final Block BLOCK_MAGENTA_TERRACOTTA_BRICKS;
    public static final Block BLOCK_LIGHT_BLUE_TERRACOTTA_BRICKS;
    public static final Block BLOCK_YELLOW_TERRACOTTA_BRICKS;
    public static final Block BLOCK_LIME_TERRACOTTA_BRICKS;
    public static final Block BLOCK_PINK_TERRACOTTA_BRICKS;
    public static final Block BLOCK_GRAY_TERRACOTTA_BRICKS;
    public static final Block BLOCK_SILVER_TERRACOTTA_BRICKS;
    public static final Block BLOCK_CYAN_TERRACOTTA_BRICKS;
    public static final Block BLOCK_PURPLE_TERRACOTTA_BRICKS;
    public static final Block BLOCK_BLUE_TERRACOTTA_BRICKS;
    public static final Block BLOCK_BROWN_TERRACOTTA_BRICKS;
    public static final Block BLOCK_GREEN_TERRACOTTA_BRICKS;
    public static final Block BLOCK_RED_TERRACOTTA_BRICKS;
    public static final Block BLOCK_BLACK_TERRACOTTA_BRICKS;
    public static final Block BLOCK_OBSIDIAN_BRICKS;
    public static final Block BLOCK_POLISHED_PRISMARINE;
    public static final Block BLOCK_POLISHED_DARK_PRISMARINE;
    public static final Block BLOCK_POLISHED_END_STONE;
    public static final Block BLOCK_POLISHED_NETHERRACK;
    public static final Block BLOCK_FACELESS_PUMPKIN;
    public static final Block BLOCK_FINE_GRAVEL;
    public static final Block BLOCK_GRAVEL_STONE;
    public static final Block BLOCK_FINE_GRAVEL_STONE;
    public static final Block BLOCK_GRAVEL_BRICKS;

    //Storage Blocks
    public static final Block BLOCK_SUGAR_CANE;
    public static final Block BLOCK_BLAZE_POWDER;
    public static final Block BLOCK_MAGMA_CREAM;
    public static final Block BLOCK_PRISMARINE_CRYSTAL;
    public static final Block BLOCK_CHARRED_BONE;
    public static final Block BLOCK_WHITE_DYE_BLOCK;
    public static final Block BLOCK_ORANGE_DYE_BLOCK;
    public static final Block BLOCK_MAGENTA_DYE_BLOCK;
    public static final Block BLOCK_LIGHT_BLUE_DYE_BLOCK;
    public static final Block BLOCK_YELLOW_DYE_BLOCK;
    public static final Block BLOCK_LIME_DYE_BLOCK;
    public static final Block BLOCK_PINK_DYE_BLOCK;
    public static final Block BLOCK_GRAY_DYE_BLOCK;
    public static final Block BLOCK_SILVER_DYE_BLOCK;
    public static final Block BLOCK_CYAN_DYE_BLOCK;
    public static final Block BLOCK_PURPLE_DYE_BLOCK;
    public static final Block BLOCK_BROWN_DYE_BLOCK;
    public static final Block BLOCK_GREEN_DYE_BLOCK;
    public static final Block BLOCK_RED_DYE_BLOCK;
    public static final Block BLOCK_BLACK_DYE_BLOCK;

    //Glass
    public static final Block BLOCK_SOUL_GLASS;
    public static final Block BLOCK_WHITE_STAINED_SOUL_GLASS;
    public static final Block BLOCK_ORANGE_STAINED_SOUL_GLASS;
    public static final Block BLOCK_MAGENTA_STAINED_SOUL_GLASS;
    public static final Block BLOCK_LIGHT_BLUE_STAINED_SOUL_GLASS;
    public static final Block BLOCK_YELLOW_STAINED_SOUL_GLASS;
    public static final Block BLOCK_LIME_STAINED_SOUL_GLASS;
    public static final Block BLOCK_PINK_STAINED_SOUL_GLASS;
    public static final Block BLOCK_GRAY_STAINED_SOUL_GLASS;
    public static final Block BLOCK_SILVER_STAINED_SOUL_GLASS;
    public static final Block BLOCK_CYAN_STAINED_SOUL_GLASS;
    public static final Block BLOCK_PURPLE_STAINED_SOUL_GLASS;
    public static final Block BLOCK_BLUE_STAINED_SOUL_GLASS;
    public static final Block BLOCK_BROWN_STAINED_SOUL_GLASS;
    public static final Block BLOCK_GREEN_STAINED_SOUL_GLASS;
    public static final Block BLOCK_RED_STAINED_SOUL_GLASS;
    public static final Block BLOCK_BLACK_STAINED_SOUL_GLASS;

    //Pillars
    public static final Block BLOCK_PILLAR_GRANITE;
    public static final Block BLOCK_PILLAR_DIORITE;
    public static final Block BLOCK_PILLAR_ANDESITE;
    public static final Block BLOCK_PILLAR_PRISMARINE;
    public static final Block BLOCK_PILLAR_DARK_PRISMARINE;
    public static final Block BLOCK_PILLAR_END_STONE;
    public static final Block BLOCK_PILLAR_NETHERRACK;

    //Wood Variations
    public static final Block BLOCK_SPRUCE_BOOKSHELF;
    public static final Block BLOCK_BIRCH_BOOKSHELF;
    public static final Block BLOCK_JUNGLE_BOOKSHELF;
    public static final Block BLOCK_ACACIA_BOOKSHELF;
    public static final Block BLOCK_DARK_OAK_BOOKSHELF;

    public static final Block BLOCK_SPRUCE_LADDER;
    public static final Block BLOCK_BIRCH_LADDER;
    public static final Block BLOCK_JUNGLE_LADDER;
    public static final Block BLOCK_ACACIA_LADDER;
    public static final Block BLOCK_DARK_OAK_LADDER;

    public static final Block BLOCK_SPRUCE_TRAP_DOOR;
    public static final Block BLOCK_BIRCH_TRAP_DOOR;
    public static final Block BLOCK_JUNGLE_TRAP_DOOR;
    public static final Block BLOCK_ACACIA_TRAP_DOOR;
    public static final Block BLOCK_DARK_OAK_TRAP_DOOR;

    public static final Block BLOCK_SPRUCE_BUTTON;
    public static final Block BLOCK_BIRCH_BUTTON;
    public static final Block BLOCK_JUNGLE_BUTTON;
    public static final Block BLOCK_ACACIA_BUTTON;
    public static final Block BLOCK_DARK_OAK_BUTTON;

    //Decoration
    public static final Block BLOCK_GOLDEN_BARS;
    public static final Block BLOCK_RED_NETHER_BRICK_FENCE;
    public static final Block BLOCK_NETHER_BRICK_FENCE_GATE;
    public static final Block BLOCK_RED_NETHER_BRICK_FENCE_GATE;

    public static final Block BLOCK_SOUL_GLASS_PANE;
    public static final Block BLOCK_WHITE_STAINED_SOUL_GLASS_PANE;
    public static final Block BLOCK_ORANGE_STAINED_SOUL_GLASS_PANE;
    public static final Block BLOCK_MAGENTA_STAINED_SOUL_GLASS_PANE;
    public static final Block BLOCK_LIGHT_BLUE_STAINED_SOUL_GLASS_PANE;
    public static final Block BLOCK_YELLOW_STAINED_SOUL_GLASS_PANE;
    public static final Block BLOCK_LIME_STAINED_SOUL_GLASS_PANE;
    public static final Block BLOCK_PINK_STAINED_SOUL_GLASS_PANE;
    public static final Block BLOCK_GRAY_STAINED_SOUL_GLASS_PANE;
    public static final Block BLOCK_SILVER_STAINED_SOUL_GLASS_PANE;
    public static final Block BLOCK_CYAN_STAINED_SOUL_GLASS_PANE;
    public static final Block BLOCK_PURPLE_STAINED_SOUL_GLASS_PANE;
    public static final Block BLOCK_BLUE_STAINED_SOUL_GLASS_PANE;
    public static final Block BLOCK_BROWN_STAINED_SOUL_GLASS_PANE;
    public static final Block BLOCK_GREEN_STAINED_SOUL_GLASS_PANE;
    public static final Block BLOCK_RED_STAINED_SOUL_GLASS_PANE;
    public static final Block BLOCK_BLACK_STAINED_SOUL_GLASS_PANE;
    public static final Block BLOCK_ROSE;

    static
    {
        BLOCK_SPRUCE_BOOKSHELF = registerBlock(new BlockBookShelf(Names.BLOCK_SPRUCE_BOOKSHELF));
        BLOCK_BIRCH_BOOKSHELF = registerBlock(new BlockBookShelf(Names.BLOCK_BIRCH_BOOKSHELF));
        BLOCK_JUNGLE_BOOKSHELF = registerBlock(new BlockBookShelf(Names.BLOCK_JUNGLE_BOOKSHELF));
        BLOCK_ACACIA_BOOKSHELF = registerBlock(new BlockBookShelf(Names.BLOCK_ACACIA_BOOKSHELF));
        BLOCK_DARK_OAK_BOOKSHELF = registerBlock(new BlockBookShelf(Names.BLOCK_DARK_OAK_BOOKSHELF));

        BLOCK_TERRACOTTA_BRICKS = ((BlockBase) registerBlock(new BlockBase(Names.BLOCK_TERRACOTTA_BRICKS).setHardness(BlockValues.TERRACOTTA_HARDNESS).setResistance(BlockValues.TERRACOTTA_RESISTANCE))).addStairSlab();
        BLOCK_WHITE_TERRACOTTA_BRICKS = ((BlockBase) registerBlock(new BlockBase(Names.BLOCK_WHITE_TERRACOTTA_BRICKS).setHardness(BlockValues.TERRACOTTA_HARDNESS).setResistance(BlockValues.TERRACOTTA_RESISTANCE))).addStairSlab();
        BLOCK_ORANGE_TERRACOTTA_BRICKS = ((BlockBase) registerBlock(new BlockBase(Names.BLOCK_ORANGE_TERRACOTTA_BRICKS).setHardness(BlockValues.TERRACOTTA_HARDNESS).setResistance(BlockValues.TERRACOTTA_RESISTANCE))).addStairSlab();
        BLOCK_MAGENTA_TERRACOTTA_BRICKS = ((BlockBase) registerBlock(new BlockBase(Names.BLOCK_MAGENTA_TERRACOTTA_BRICKS).setHardness(BlockValues.TERRACOTTA_HARDNESS).setResistance(BlockValues.TERRACOTTA_RESISTANCE))).addStairSlab();
        BLOCK_LIGHT_BLUE_TERRACOTTA_BRICKS = ((BlockBase) registerBlock(new BlockBase(Names.BLOCK_LIGHT_BLUE_TERRACOTTA_BRICKS).setHardness(BlockValues.TERRACOTTA_HARDNESS).setResistance(BlockValues.TERRACOTTA_RESISTANCE))).addStairSlab();
        BLOCK_YELLOW_TERRACOTTA_BRICKS = ((BlockBase) registerBlock(new BlockBase(Names.BLOCK_YELLOW_TERRACOTTA_BRICKS).setHardness(BlockValues.TERRACOTTA_HARDNESS).setResistance(BlockValues.TERRACOTTA_RESISTANCE))).addStairSlab();
        BLOCK_LIME_TERRACOTTA_BRICKS = ((BlockBase) registerBlock(new BlockBase(Names.BLOCK_LIME_TERRACOTTA_BRICKS).setHardness(BlockValues.TERRACOTTA_HARDNESS).setResistance(BlockValues.TERRACOTTA_RESISTANCE))).addStairSlab();
        BLOCK_PINK_TERRACOTTA_BRICKS = ((BlockBase) registerBlock(new BlockBase(Names.BLOCK_PINK_TERRACOTTA_BRICKS).setHardness(BlockValues.TERRACOTTA_HARDNESS).setResistance(BlockValues.TERRACOTTA_RESISTANCE))).addStairSlab();
        BLOCK_GRAY_TERRACOTTA_BRICKS = ((BlockBase) registerBlock(new BlockBase(Names.BLOCK_GRAY_TERRACOTTA_BRICKS).setHardness(BlockValues.TERRACOTTA_HARDNESS).setResistance(BlockValues.TERRACOTTA_RESISTANCE))).addStairSlab();
        BLOCK_SILVER_TERRACOTTA_BRICKS = ((BlockBase) registerBlock(new BlockBase(Names.BLOCK_SILVER_TERRACOTTA_BRICKS).setHardness(BlockValues.TERRACOTTA_HARDNESS).setResistance(BlockValues.TERRACOTTA_RESISTANCE))).addStairSlab();
        BLOCK_CYAN_TERRACOTTA_BRICKS = ((BlockBase) registerBlock(new BlockBase(Names.BLOCK_CYAN_TERRACOTTA_BRICKS).setHardness(BlockValues.TERRACOTTA_HARDNESS).setResistance(BlockValues.TERRACOTTA_RESISTANCE))).addStairSlab();
        BLOCK_PURPLE_TERRACOTTA_BRICKS = ((BlockBase) registerBlock(new BlockBase(Names.BLOCK_PURPLE_TERRACOTTA_BRICKS).setHardness(BlockValues.TERRACOTTA_HARDNESS).setResistance(BlockValues.TERRACOTTA_RESISTANCE))).addStairSlab();
        BLOCK_BLUE_TERRACOTTA_BRICKS = ((BlockBase) registerBlock(new BlockBase(Names.BLOCK_BLUE_TERRACOTTA_BRICKS).setHardness(BlockValues.TERRACOTTA_HARDNESS).setResistance(BlockValues.TERRACOTTA_RESISTANCE))).addStairSlab();
        BLOCK_BROWN_TERRACOTTA_BRICKS = ((BlockBase) registerBlock(new BlockBase(Names.BLOCK_BROWN_TERRACOTTA_BRICKS).setHardness(BlockValues.TERRACOTTA_HARDNESS).setResistance(BlockValues.TERRACOTTA_RESISTANCE))).addStairSlab();
        BLOCK_GREEN_TERRACOTTA_BRICKS = ((BlockBase) registerBlock(new BlockBase(Names.BLOCK_GREEN_TERRACOTTA_BRICKS).setHardness(BlockValues.TERRACOTTA_HARDNESS).setResistance(BlockValues.TERRACOTTA_RESISTANCE))).addStairSlab();
        BLOCK_RED_TERRACOTTA_BRICKS = ((BlockBase) registerBlock(new BlockBase(Names.BLOCK_RED_TERRACOTTA_BRICKS).setHardness(BlockValues.TERRACOTTA_HARDNESS).setResistance(BlockValues.TERRACOTTA_RESISTANCE))).addStairSlab();
        BLOCK_BLACK_TERRACOTTA_BRICKS = ((BlockBase) registerBlock(new BlockBase(Names.BLOCK_BLACK_TERRACOTTA_BRICKS).setHardness(BlockValues.TERRACOTTA_HARDNESS).setResistance(BlockValues.TERRACOTTA_RESISTANCE))).addStairSlab();
        BLOCK_OBSIDIAN_BRICKS = ((BlockBase) registerBlock(new BlockBase(Names.BLOCK_OBSIDIAN_BRICKS).setHardness(BlockValues.OBSIDIAN_HARDNESS).setResistance(BlockValues.OBSIDIAN_RESISTANCE))).addStairSlab();
        BLOCK_POLISHED_PRISMARINE = registerBlock(((BlockBase) new BlockBase(Names.BLOCK_POLISHED_PRISMARINE).setHardness(BlockValues.STONE_HARDNESS).setResistance(BlockValues.STONE_RESISTANCE)).addStairSlab());
        BLOCK_POLISHED_DARK_PRISMARINE = registerBlock(((BlockBase) new BlockBase(Names.BLOCK_POLISHED_DARK_PRISMARINE).setHardness(BlockValues.STONE_HARDNESS).setResistance(BlockValues.STONE_RESISTANCE)).addStairSlab());
        BLOCK_POLISHED_END_STONE = registerBlock(((BlockBase) new BlockBase(Names.BLOCK_POLISHED_END_STONE).setHardness(BlockValues.STONE_HARDNESS).setResistance(BlockValues.STONE_RESISTANCE)).addStairSlab());
        BLOCK_POLISHED_NETHERRACK = registerBlock(((BlockBase) new BlockBase(Names.BLOCK_POLISHED_NETHERRACK).setHardness(BlockValues.STONE_HARDNESS).setResistance(BlockValues.STONE_RESISTANCE)).addStairSlab());
        BLOCK_FACELESS_PUMPKIN = registerBlock(new BlockFacelessPumpkin());
        BLOCK_FINE_GRAVEL = registerBlock(new BlockFallingBase(Names.BLOCK_FINE_GRAVEL, SoundType.GROUND).setHardness(BlockValues.SAND_HARDNESS).setResistance(BlockValues.SAND_RESISTANCE));
        BLOCK_GRAVEL_STONE = ((BlockBase) registerBlock(new BlockBase(Names.BLOCK_GRAVEL_STONE).setHardness(BlockValues.STONE_HARDNESS).setResistance(BlockValues.STONE_RESISTANCE))).addStairSlab();
        BLOCK_FINE_GRAVEL_STONE = ((BlockBase) registerBlock(new BlockBase(Names.BLOCK_FINE_GRAVEL_STONE).setHardness(BlockValues.STONE_HARDNESS).setResistance(BlockValues.STONE_RESISTANCE))).addStairSlab();
        BLOCK_GRAVEL_BRICKS = ((BlockBase) registerBlock(new BlockBase(Names.BLOCK_GRAVEL_BRICKS).setHardness(BlockValues.STONE_HARDNESS).setResistance(BlockValues.STONE_RESISTANCE))).addStairSlab();

        BLOCK_SUGAR_CANE = registerBlock(new BlockPillarBase(Material.LEAVES, Names.BLOCK_SUGAR_CANE, SoundType.PLANT).setHardness(BlockValues.PLANT_BLOCK_HARDNESS).setResistance(BlockValues.PLANT_BLOCK_RESISTANCE));
        BLOCK_BLAZE_POWDER = registerBlock(new BlockFallingBase(Names.BLOCK_BLAZE_POWDER, SoundType.SNOW).setHardness(BlockValues.SAND_HARDNESS).setResistance(BlockValues.SAND_RESISTANCE));
        BLOCK_MAGMA_CREAM = registerBlock(new BlockMagmaCream());
        BLOCK_PRISMARINE_CRYSTAL = registerBlock(new BlockPrismarineCrystal());
        BLOCK_CHARRED_BONE = registerBlock(new BlockPillarBase(Names.BLOCK_CHARRED_BONE)).setHardness(BlockValues.BONE_BLOCK_HARDNESS).setResistance(BlockValues.BONE_BLOCK_RESISTANCE);
        BLOCK_WHITE_DYE_BLOCK = registerBlock(new BlockBase(Names.BLOCK_WHITE_DYE_BLOCK).setHardness(BlockValues.DYE_BLOCK_HARDNESS).setResistance(BlockValues.DYE_BLOCK_RESISTANCE));
        BLOCK_ORANGE_DYE_BLOCK = registerBlock(new BlockBase(Names.BLOCK_ORANGE_DYE_BLOCK).setHardness(BlockValues.DYE_BLOCK_HARDNESS).setResistance(BlockValues.DYE_BLOCK_RESISTANCE));
        BLOCK_MAGENTA_DYE_BLOCK = registerBlock(new BlockBase(Names.BLOCK_MAGENTA_DYE_BLOCK).setHardness(BlockValues.DYE_BLOCK_HARDNESS).setResistance(BlockValues.DYE_BLOCK_RESISTANCE));
        BLOCK_LIGHT_BLUE_DYE_BLOCK = registerBlock(new BlockBase(Names.BLOCK_LIGHT_BLUE_DYE_BLOCK).setHardness(BlockValues.DYE_BLOCK_HARDNESS).setResistance(BlockValues.DYE_BLOCK_RESISTANCE));
        BLOCK_YELLOW_DYE_BLOCK = registerBlock(new BlockBase(Names.BLOCK_YELLOW_DYE_BLOCK).setHardness(BlockValues.DYE_BLOCK_HARDNESS).setResistance(BlockValues.DYE_BLOCK_RESISTANCE));
        BLOCK_LIME_DYE_BLOCK = registerBlock(new BlockBase(Names.BLOCK_LIME_DYE_BLOCK).setHardness(BlockValues.DYE_BLOCK_HARDNESS).setResistance(BlockValues.DYE_BLOCK_RESISTANCE));
        BLOCK_PINK_DYE_BLOCK = registerBlock(new BlockBase(Names.BLOCK_PINK_DYE_BLOCK).setHardness(BlockValues.DYE_BLOCK_HARDNESS).setResistance(BlockValues.DYE_BLOCK_RESISTANCE));
        BLOCK_GRAY_DYE_BLOCK = registerBlock(new BlockBase(Names.BLOCK_GRAY_DYE_BLOCK).setHardness(BlockValues.DYE_BLOCK_HARDNESS).setResistance(BlockValues.DYE_BLOCK_RESISTANCE));
        BLOCK_SILVER_DYE_BLOCK = registerBlock(new BlockBase(Names.BLOCK_SILVER_DYE_BLOCK).setHardness(BlockValues.DYE_BLOCK_HARDNESS).setResistance(BlockValues.DYE_BLOCK_RESISTANCE));
        BLOCK_CYAN_DYE_BLOCK = registerBlock(new BlockBase(Names.BLOCK_CYAN_DYE_BLOCK).setHardness(BlockValues.DYE_BLOCK_HARDNESS).setResistance(BlockValues.DYE_BLOCK_RESISTANCE));
        BLOCK_PURPLE_DYE_BLOCK = registerBlock(new BlockBase(Names.BLOCK_PURPLE_DYE_BLOCK).setHardness(BlockValues.DYE_BLOCK_HARDNESS).setResistance(BlockValues.DYE_BLOCK_RESISTANCE));
        BLOCK_BROWN_DYE_BLOCK = registerBlock(new BlockBase(Names.BLOCK_BROWN_DYE_BLOCK).setHardness(BlockValues.DYE_BLOCK_HARDNESS).setResistance(BlockValues.DYE_BLOCK_RESISTANCE));
        BLOCK_GREEN_DYE_BLOCK = registerBlock(new BlockBase(Names.BLOCK_GREEN_DYE_BLOCK).setHardness(BlockValues.DYE_BLOCK_HARDNESS).setResistance(BlockValues.DYE_BLOCK_RESISTANCE));
        BLOCK_RED_DYE_BLOCK = registerBlock(new BlockBase(Names.BLOCK_RED_DYE_BLOCK).setHardness(BlockValues.DYE_BLOCK_HARDNESS).setResistance(BlockValues.DYE_BLOCK_RESISTANCE));
        BLOCK_BLACK_DYE_BLOCK = registerBlock(new BlockBase(Names.BLOCK_BLACK_DYE_BLOCK).setHardness(BlockValues.DYE_BLOCK_HARDNESS).setResistance(BlockValues.DYE_BLOCK_RESISTANCE));

        BLOCK_SOUL_GLASS = registerBlock(new BlockSoulGlass(Names.BLOCK_SOUL_GLASS));
        BLOCK_WHITE_STAINED_SOUL_GLASS = registerBlock(new BlockSoulGlass(Names.BLOCK_WHITE_STAINED_SOUL_GLASS));
        BLOCK_ORANGE_STAINED_SOUL_GLASS = registerBlock(new BlockSoulGlass(Names.BLOCK_ORANGE_STAINED_SOUL_GLASS));
        BLOCK_MAGENTA_STAINED_SOUL_GLASS = registerBlock(new BlockSoulGlass(Names.BLOCK_MAGENTA_STAINED_SOUL_GLASS));
        BLOCK_LIGHT_BLUE_STAINED_SOUL_GLASS = registerBlock(new BlockSoulGlass(Names.BLOCK_LIGHT_BLUE_STAINED_SOUL_GLASS));
        BLOCK_YELLOW_STAINED_SOUL_GLASS = registerBlock(new BlockSoulGlass(Names.BLOCK_YELLOW_STAINED_SOUL_GLASS));
        BLOCK_LIME_STAINED_SOUL_GLASS = registerBlock(new BlockSoulGlass(Names.BLOCK_LIME_STAINED_SOUL_GLASS));
        BLOCK_PINK_STAINED_SOUL_GLASS = registerBlock(new BlockSoulGlass(Names.BLOCK_PINK_STAINED_SOUL_GLASS));
        BLOCK_GRAY_STAINED_SOUL_GLASS = registerBlock(new BlockSoulGlass(Names.BLOCK_GRAY_STAINED_SOUL_GLASS));
        BLOCK_SILVER_STAINED_SOUL_GLASS = registerBlock(new BlockSoulGlass(Names.BLOCK_SILVER_STAINED_SOUL_GLASS));
        BLOCK_CYAN_STAINED_SOUL_GLASS = registerBlock(new BlockSoulGlass(Names.BLOCK_CYAN_STAINED_SOUL_GLASS));
        BLOCK_PURPLE_STAINED_SOUL_GLASS = registerBlock(new BlockSoulGlass(Names.BLOCK_PURPLE_STAINED_SOUL_GLASS));
        BLOCK_BLUE_STAINED_SOUL_GLASS = registerBlock(new BlockSoulGlass(Names.BLOCK_BLUE_STAINED_SOUL_GLASS));
        BLOCK_BROWN_STAINED_SOUL_GLASS = registerBlock(new BlockSoulGlass(Names.BLOCK_BROWN_STAINED_SOUL_GLASS));
        BLOCK_GREEN_STAINED_SOUL_GLASS = registerBlock(new BlockSoulGlass(Names.BLOCK_GREEN_STAINED_SOUL_GLASS));
        BLOCK_RED_STAINED_SOUL_GLASS = registerBlock(new BlockSoulGlass(Names.BLOCK_RED_STAINED_SOUL_GLASS));
        BLOCK_BLACK_STAINED_SOUL_GLASS = registerBlock(new BlockSoulGlass(Names.BLOCK_BLACK_STAINED_SOUL_GLASS));

        BLOCK_PILLAR_GRANITE = registerBlock(new BlockPillarBase(Names.BLOCK_PILLAR_GRANITE).setHardness(BlockValues.STONE_HARDNESS).setResistance(BlockValues.STONE_RESISTANCE));
        BLOCK_PILLAR_DIORITE = registerBlock(new BlockPillarBase(Names.BLOCK_PILLAR_DIORITE).setHardness(BlockValues.STONE_HARDNESS).setResistance(BlockValues.STONE_RESISTANCE));
        BLOCK_PILLAR_ANDESITE = registerBlock(new BlockPillarBase(Names.BLOCK_PILLAR_ANDESITE).setHardness(BlockValues.STONE_HARDNESS).setResistance(BlockValues.STONE_RESISTANCE));
        BLOCK_PILLAR_PRISMARINE = registerBlock(new BlockPillarBase(Names.BLOCK_PILLAR_PRISMARINE).setHardness(BlockValues.STONE_HARDNESS).setResistance(BlockValues.STONE_RESISTANCE));
        BLOCK_PILLAR_DARK_PRISMARINE = registerBlock(new BlockPillarBase(Names.BLOCK_PILLAR_DARK_PRISMARINE).setHardness(BlockValues.STONE_HARDNESS).setResistance(BlockValues.STONE_RESISTANCE));
        BLOCK_PILLAR_END_STONE = registerBlock(new BlockPillarBase(Names.BLOCK_PILLAR_END_STONE).setHardness(BlockValues.END_STONE_HARDNESS).setResistance(BlockValues.END_STONE_RESISTANCE));
        BLOCK_PILLAR_NETHERRACK = registerBlock(new BlockPillarBase(Names.BLOCK_PILLAR_NETHERRACK).setHardness(BlockValues.NETHER_BRICKS_HARDNESS).setResistance(BlockValues.NETHERRACK_RESISTANCE));

        BLOCK_SPRUCE_LADDER = registerBlock(new BlockWoodenLadder(Names.BLOCK_SPRUCE_LADDER));
        BLOCK_BIRCH_LADDER = registerBlock(new BlockWoodenLadder(Names.BLOCK_BIRCH_LADDER));
        BLOCK_JUNGLE_LADDER = registerBlock(new BlockWoodenLadder(Names.BLOCK_JUNGLE_LADDER));
        BLOCK_ACACIA_LADDER = registerBlock(new BlockWoodenLadder(Names.BLOCK_ACACIA_LADDER));
        BLOCK_DARK_OAK_LADDER = registerBlock(new BlockWoodenLadder(Names.BLOCK_DARK_OAK_LADDER));

        BLOCK_SPRUCE_TRAP_DOOR = registerBlock(new BlockWoodenTrapDoor(Names.BLOCK_SPRUCE_TRAP_DOOR));
        BLOCK_BIRCH_TRAP_DOOR = registerBlock(new BlockWoodenTrapDoor(Names.BLOCK_BIRCH_TRAP_DOOR));
        BLOCK_JUNGLE_TRAP_DOOR = registerBlock(new BlockWoodenTrapDoor(Names.BLOCK_JUNGLE_TRAP_DOOR));
        BLOCK_ACACIA_TRAP_DOOR = registerBlock(new BlockWoodenTrapDoor(Names.BLOCK_ACACIA_TRAP_DOOR));
        BLOCK_DARK_OAK_TRAP_DOOR = registerBlock(new BlockWoodenTrapDoor(Names.BLOCK_DARK_OAK_TRAP_DOOR));

        BLOCK_SPRUCE_BUTTON = registerBlock(new BlockWoodenButton(Names.BLOCK_SPRUCE_BUTTON));
        BLOCK_BIRCH_BUTTON = registerBlock(new BlockWoodenButton(Names.BLOCK_BIRCH_BUTTON));
        BLOCK_JUNGLE_BUTTON = registerBlock(new BlockWoodenButton(Names.BLOCK_JUNGLE_BUTTON));
        BLOCK_ACACIA_BUTTON = registerBlock(new BlockWoodenButton(Names.BLOCK_ACACIA_BUTTON));
        BLOCK_DARK_OAK_BUTTON = registerBlock(new BlockWoodenButton(Names.BLOCK_DARK_OAK_BUTTON));

        BLOCK_GOLDEN_BARS = registerBlock(new BlockPaneBase(Material.IRON, Names.BLOCK_GOLDEN_BARS, SoundType.METAL, true).setHardness(5.0F).setResistance(10.0F));
        BLOCK_RED_NETHER_BRICK_FENCE = registerBlock(new BlockRedNetherBrickFence());
        BLOCK_NETHER_BRICK_FENCE_GATE = registerBlock(new BlockNetherBrickFenceGate(Names.BLOCK_NETHER_FENCE_GATE));
        BLOCK_RED_NETHER_BRICK_FENCE_GATE = registerBlock(new BlockNetherBrickFenceGate(Names.BLOCK_RED_NETHER_FENCE_GATE));
        BLOCK_SOUL_GLASS_PANE = registerBlock(new BlockSoulGlassPane(Names.BLOCK_SOUL_GLASS));
        BLOCK_WHITE_STAINED_SOUL_GLASS_PANE = registerBlock(new BlockSoulGlassPane(Names.BLOCK_WHITE_STAINED_SOUL_GLASS));
        BLOCK_ORANGE_STAINED_SOUL_GLASS_PANE = registerBlock(new BlockSoulGlassPane(Names.BLOCK_ORANGE_STAINED_SOUL_GLASS));
        BLOCK_MAGENTA_STAINED_SOUL_GLASS_PANE = registerBlock(new BlockSoulGlassPane(Names.BLOCK_MAGENTA_STAINED_SOUL_GLASS));
        BLOCK_LIGHT_BLUE_STAINED_SOUL_GLASS_PANE = registerBlock(new BlockSoulGlassPane(Names.BLOCK_LIGHT_BLUE_STAINED_SOUL_GLASS));
        BLOCK_YELLOW_STAINED_SOUL_GLASS_PANE = registerBlock(new BlockSoulGlassPane(Names.BLOCK_YELLOW_STAINED_SOUL_GLASS));
        BLOCK_LIME_STAINED_SOUL_GLASS_PANE = registerBlock(new BlockSoulGlassPane(Names.BLOCK_LIME_STAINED_SOUL_GLASS));
        BLOCK_PINK_STAINED_SOUL_GLASS_PANE = registerBlock(new BlockSoulGlassPane(Names.BLOCK_PINK_STAINED_SOUL_GLASS));
        BLOCK_GRAY_STAINED_SOUL_GLASS_PANE = registerBlock(new BlockSoulGlassPane(Names.BLOCK_GRAY_STAINED_SOUL_GLASS));
        BLOCK_SILVER_STAINED_SOUL_GLASS_PANE = registerBlock(new BlockSoulGlassPane(Names.BLOCK_SILVER_STAINED_SOUL_GLASS));
        BLOCK_CYAN_STAINED_SOUL_GLASS_PANE = registerBlock(new BlockSoulGlassPane(Names.BLOCK_CYAN_STAINED_SOUL_GLASS));
        BLOCK_PURPLE_STAINED_SOUL_GLASS_PANE = registerBlock(new BlockSoulGlassPane(Names.BLOCK_PURPLE_STAINED_SOUL_GLASS));
        BLOCK_BLUE_STAINED_SOUL_GLASS_PANE = registerBlock(new BlockSoulGlassPane(Names.BLOCK_BLUE_STAINED_SOUL_GLASS));
        BLOCK_BROWN_STAINED_SOUL_GLASS_PANE = registerBlock(new BlockSoulGlassPane(Names.BLOCK_BROWN_STAINED_SOUL_GLASS));
        BLOCK_GREEN_STAINED_SOUL_GLASS_PANE = registerBlock(new BlockSoulGlassPane(Names.BLOCK_GREEN_STAINED_SOUL_GLASS));
        BLOCK_RED_STAINED_SOUL_GLASS_PANE = registerBlock(new BlockSoulGlassPane(Names.BLOCK_RED_STAINED_SOUL_GLASS));
        BLOCK_BLACK_STAINED_SOUL_GLASS_PANE = registerBlock(new BlockSoulGlassPane(Names.BLOCK_BLACK_STAINED_SOUL_GLASS));
        BLOCK_ROSE = registerBlock(new BlockRose());

        addVanillaStairSlab(Blocks.STONE.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.STONE), Names.STONE);
        addVanillaStairSlab(Blocks.STONE.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.GRANITE_SMOOTH), Names.SMOOTH_GRANITE);
        addVanillaStairSlab(Blocks.STONE.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.DIORITE_SMOOTH), Names.SMOOTH_DIORITE);
        addVanillaStairSlab(Blocks.STONE.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.ANDESITE_SMOOTH), Names.SMOOTH_ANDESITE);
        addVanillaStairSlab(Blocks.STONEBRICK.getDefaultState().withProperty(BlockStoneBrick.VARIANT, BlockStoneBrick.EnumType.CRACKED), Names.CRACKED_STONEBRICK);
        addVanillaStairSlab(Blocks.STONEBRICK.getDefaultState().withProperty(BlockStoneBrick.VARIANT, BlockStoneBrick.EnumType.CHISELED), Names.CHISELED_STONEBRICK);
        addVanillaStairSlab(Blocks.SANDSTONE.getDefaultState().withProperty(BlockSandStone.TYPE, BlockSandStone.EnumType.CHISELED), Names.CHISELED_SANDSTONE);
        addVanillaStairSlab(Blocks.SANDSTONE.getDefaultState().withProperty(BlockSandStone.TYPE, BlockSandStone.EnumType.SMOOTH), Names.SMOOTH_SANDSTONE);
        addVanillaStairSlab(Blocks.RED_SANDSTONE.getDefaultState().withProperty(BlockRedSandstone.TYPE, BlockRedSandstone.EnumType.CHISELED), Names.CHISELED_RED_SANDSTONE);
        addVanillaStairSlab(Blocks.RED_SANDSTONE.getDefaultState().withProperty(BlockRedSandstone.TYPE, BlockRedSandstone.EnumType.SMOOTH), Names.SMOOTH_RED_SANDSTONE);
        addVanillaStairSlab(Blocks.PRISMARINE.getDefaultState().withProperty(BlockPrismarine.VARIANT, BlockPrismarine.EnumType.BRICKS), Names.PRISMARINE_BRICKS);
        addVanillaStairSlab(Blocks.PRISMARINE.getDefaultState().withProperty(BlockPrismarine.VARIANT, BlockPrismarine.EnumType.DARK), Names.DARK_PRISMARINE);
        addVanillaStairSlab(Blocks.END_BRICKS, Names.END_BRICKS);
        addVanillaStairSlab(Blocks.RED_NETHER_BRICK.getDefaultState(), Names.RED_NETHER_BRICK);
        addVanillaStairSlab(Blocks.STAINED_HARDENED_CLAY, Names.TERRACOTTA);
        addVanillaStairSlab(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.WHITE), Names.WHITE + "_" + Names.TERRACOTTA);
        addVanillaStairSlab(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.ORANGE), Names.ORANGE + "_" + Names.TERRACOTTA);
        addVanillaStairSlab(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.MAGENTA), Names.MAGENTA + "_" + Names.TERRACOTTA);
        addVanillaStairSlab(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.LIGHT_BLUE), Names.LIGHT_BLUE + "_" + Names.TERRACOTTA);
        addVanillaStairSlab(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.YELLOW), Names.YELLOW + "_" + Names.TERRACOTTA);
        addVanillaStairSlab(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.LIME), Names.LIME + "_" + Names.TERRACOTTA);
        addVanillaStairSlab(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.PINK), Names.PINK + "_" + Names.TERRACOTTA);
        addVanillaStairSlab(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.GRAY), Names.GRAY + "_" + Names.TERRACOTTA);
        addVanillaStairSlab(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.SILVER), Names.SILVER + "_" + Names.TERRACOTTA);
        addVanillaStairSlab(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.CYAN), Names.CYAN + "_" + Names.TERRACOTTA);
        addVanillaStairSlab(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.PURPLE), Names.PURPLE + "_" + Names.TERRACOTTA);
        addVanillaStairSlab(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BLUE), Names.BLUE + "_" + Names.TERRACOTTA);
        addVanillaStairSlab(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BROWN), Names.BROWN + "_" + Names.TERRACOTTA);
        addVanillaStairSlab(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.GREEN), Names.GREEN + "_" + Names.TERRACOTTA);
        addVanillaStairSlab(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.RED), Names.RED + "_" + Names.TERRACOTTA);
        addVanillaStairSlab(Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BLACK), Names.BLACK + "_" + Names.TERRACOTTA);
        addVanillaStairSlab(Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.WHITE), Names.WHITE + "_" + Names.CONCRETE);
        addVanillaStairSlab(Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.ORANGE), Names.ORANGE + "_" + Names.CONCRETE);
        addVanillaStairSlab(Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.MAGENTA), Names.MAGENTA + "_" + Names.CONCRETE);
        addVanillaStairSlab(Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.LIGHT_BLUE), Names.LIGHT_BLUE + "_" + Names.CONCRETE);
        addVanillaStairSlab(Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.YELLOW), Names.YELLOW + "_" + Names.CONCRETE);
        addVanillaStairSlab(Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.LIME), Names.LIME + "_" + Names.CONCRETE);
        addVanillaStairSlab(Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.PINK), Names.PINK + "_" + Names.CONCRETE);
        addVanillaStairSlab(Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.GRAY), Names.GRAY + "_" + Names.CONCRETE);
        addVanillaStairSlab(Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.SILVER), Names.SILVER + "_" + Names.CONCRETE);
        addVanillaStairSlab(Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.CYAN), Names.CYAN + "_" + Names.CONCRETE);
        addVanillaStairSlab(Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.PURPLE), Names.PURPLE + "_" + Names.CONCRETE);
        addVanillaStairSlab(Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BLUE), Names.BLUE + "_" + Names.CONCRETE);
        addVanillaStairSlab(Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BROWN), Names.BROWN + "_" + Names.CONCRETE);
        addVanillaStairSlab(Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.GREEN), Names.GREEN + "_" + Names.CONCRETE);
        addVanillaStairSlab(Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.RED), Names.RED + "_" + Names.CONCRETE);
        addVanillaStairSlab(Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BLACK), Names.BLACK + "_" + Names.CONCRETE);
        addVanillaStairSlab(Blocks.OBSIDIAN.getDefaultState(), Names.OBSIDIAN);
        addStairSlabs();
    }

    public static void registerBlocks()
    {
    }

    private static void addStairSlabs()
    {
        for (Block block : STAIRSLAB_LIST)
        {
            addStairSlab(block.getDefaultState(), Utils.getBaseBlockName(block), false);
        }
    }

    private static void addVanillaStairSlab(Block block, String name)
    {
        addVanillaStairSlab(block.getDefaultState(), name);
    }

    private static void addVanillaStairSlab(IBlockState state, String name)
    {
        addStairSlab(state, name, true);
    }

    private static void addStairSlab(IBlockState state, String name, boolean vanilla)
    {
        BlockStairBase stair = state.getBlock() instanceof IStairSlab ? ((IStairSlab) state.getBlock()).setStair(new BlockStairBase(state, name, vanilla)) : new BlockStairBase(state, name, vanilla);
        registerBlock(stair);

        if (!name.equals(Names.STONE))
        {
            BlockSlabBase slab = state.getBlock() instanceof IStairSlab ? ((IStairSlab) state.getBlock()).setSlab(new BlockSlabBase(state, name, vanilla)) : new BlockSlabBase(state, name, vanilla);
            registerBlock(slab, ItemBlockSlab::new);
        }
    }

    protected static <BLOCK extends Block> BLOCK registerBlock(BLOCK block)
    {
        return registerBlock(block, ItemBlock::new);
    }

    protected static <BLOCK extends Block> BLOCK registerBlock(BLOCK block, @Nullable Function<BLOCK, ItemBlock> itemFactory)
    {
        ForgeRegistries.BLOCKS.register(block);

        if (itemFactory != null)
        {
            final ItemBlock itemBlock = itemFactory.apply(block);

            ForgeRegistries.ITEMS.register(itemBlock.setRegistryName(block.getRegistryName()));
        }

        BLOCKS.add(block);
        addCreativeList(block);
        addConfig(block);

        return block;
    }

    private static void addConfig(Block block)
    {
        if (block instanceof BlockStairBase)
        {
            if (((BlockStairBase) block).isVanilla())
            {
                ConfigurationHandler.createVanillaConfig(block);
            }

            return;
        }
        else if (block instanceof BlockSlabBase)
        {
            if (((BlockSlabBase) block).isVanilla())
            {
                ConfigurationHandler.createVanillaConfig(block);
            }

            return;
        }

        ConfigurationHandler.createBlockConfig(block);
    }

    private static void addCreativeList(Block block)
    {
        Item item = Item.getItemFromBlock(block);

        if (block instanceof BlockStairBase || block instanceof BlockSlabBase)
        {
            CreativeTab.stairAndSlabList.add(item);
        }
        else
        {
            CreativeTab.tabList.add(item);
        }
    }
}
