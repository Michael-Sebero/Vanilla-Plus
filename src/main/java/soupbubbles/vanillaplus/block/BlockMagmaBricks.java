package soupbubbles.vanillaplus.block;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import soupbubbles.vanillaplus.block.base.BlockBase;
import soupbubbles.vanillaplus.lib.BlockValues;
import soupbubbles.vanillaplus.lib.Names;

public class BlockMagmaBricks extends BlockBase
{
    public BlockMagmaBricks()
    {
        super(Names.BLOCK_MAGMA_BRICKS);
        setHardness(BlockValues.MAGMA_HARDNESS);
        setResistance(BlockValues.MAGMA_RESISTANCE);
        setLightLevel(0.2F);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public int getPackedLightmapCoords(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return Blocks.MAGMA.getPackedLightmapCoords(state, source, pos);
    }
}
