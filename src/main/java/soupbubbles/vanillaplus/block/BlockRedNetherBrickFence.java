package soupbubbles.vanillaplus.block;

import net.minecraft.block.BlockFence;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import soupbubbles.vanillaplus.creativetab.CreativeTab;
import soupbubbles.vanillaplus.lib.Assets;
import soupbubbles.vanillaplus.lib.BlockValues;
import soupbubbles.vanillaplus.lib.Names;

public class BlockRedNetherBrickFence extends BlockFence
{
    protected final String BASE_NAME = Names.BLOCK_RED_NETHER_FENCE;

    public BlockRedNetherBrickFence()
    {
        super(Material.ROCK, MapColor.NETHERRACK);
        setRegistryName(BASE_NAME);
        setUnlocalizedName(BASE_NAME);
        setCreativeTab(CreativeTab.MINECRAFTBOOM_TAB);
        setHardness(BlockValues.NETHER_BRICKS_HARDNESS);
        setResistance(BlockValues.NETHER_BRICKS_RESISTANCE);
        setSoundType(SoundType.STONE);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format(Assets.BLOCK_PREFIX, Assets.ASSET_PREFIX, BASE_NAME);
    }
}
