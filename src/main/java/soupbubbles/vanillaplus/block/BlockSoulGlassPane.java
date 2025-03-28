package soupbubbles.vanillaplus.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import soupbubbles.vanillaplus.block.base.BlockPaneBase;
import soupbubbles.vanillaplus.lib.BlockValues;

public class BlockSoulGlassPane extends BlockPaneBase
{
    public BlockSoulGlassPane(String name)
    {
        super(Material.GLASS, name + "_pane", SoundType.GLASS, false);
        setHardness(BlockValues.GLASS_HARDNESS);
        setResistance(BlockValues.GLASS_RESISTANCE);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.TRANSLUCENT;
    }
}
