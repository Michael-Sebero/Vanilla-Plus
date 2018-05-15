package soupbubbles.minecraftboom.world;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class WorldGenSpikes extends WorldGenerator
{
    public boolean generate(World world, Random rand, BlockPos position)
    {
        while (world.isAirBlock(position) && position.getY() > 2)
        {
            position = position.down();
        }

        if (world.getBlockState(position).getBlock() != Blocks.END_STONE)
        {
            return false;
        }
        else
        {
            position = position.up(rand.nextInt(4));
            int i = rand.nextInt(4) + 7;
            int j = i / 4 + rand.nextInt(2);

            if (j > 1 && rand.nextInt(60) == 0)
            {
                position = position.up(10 + rand.nextInt(30));
            }

            for (int k = 0; k < i; ++k)
            {
                float f = (1.0F - (float)k / (float)i) * (float)j;
                int l = MathHelper.ceil(f);

                for (int i1 = -l; i1 <= l; ++i1)
                {
                    float f1 = (float)MathHelper.abs(i1) - 0.25F;

                    for (int j1 = -l; j1 <= l; ++j1)
                    {
                        float f2 = (float)MathHelper.abs(j1) - 0.25F;

                        if ((i1 == 0 && j1 == 0 || f1 * f1 + f2 * f2 <= f * f) && (i1 != -l && i1 != l && j1 != -l && j1 != l || rand.nextFloat() <= 0.75F))
                        {
                            IBlockState iblockstate = world.getBlockState(position.add(i1, k, j1));
                            Block block = iblockstate.getBlock();

                            if (iblockstate.getBlock().isAir(iblockstate, world, position.add(i1, k, j1)))
                            {
                                world.setBlockState(position.add(i1, k, j1), Blocks.OBSIDIAN.getDefaultState());
                            }

                            if (k != 0 && l > 1)
                            {
                                iblockstate = world.getBlockState(position.add(i1, -k, j1));
                                block = iblockstate.getBlock();

                                if (iblockstate.getBlock().isAir(iblockstate, world, position.add(i1, -k, j1)))
                                {
                                    world.setBlockState(position.add(i1, -k, j1), Blocks.OBSIDIAN.getDefaultState());
                                }
                            }
                        }
                    }
                }
            }

            int k1 = j - 1;

            if (k1 < 0)
            {
                k1 = 0;
            }
            else if (k1 > 1)
            {
                k1 = 1;
            }

            for (int l1 = -k1; l1 <= k1; ++l1)
            {
                for (int i2 = -k1; i2 <= k1; ++i2)
                {
                    BlockPos blockpos = position.add(l1, -1, i2);
                    int j2 = 50;

                    if (Math.abs(l1) == 1 && Math.abs(i2) == 1)
                    {
                        j2 = rand.nextInt(5);
                    }

                    while (blockpos.getY() > 50)
                    {
                        IBlockState iblockstate1 = world.getBlockState(blockpos);
                        Block block1 = iblockstate1.getBlock();

                        if (!iblockstate1.getBlock().isAir(iblockstate1, world, blockpos) && block1 != Blocks.OBSIDIAN)
                        {
                            break;
                        }

                        world.setBlockState(blockpos, Blocks.OBSIDIAN.getDefaultState());
                        blockpos = blockpos.down();
                        --j2;

                        if (j2 <= 0)
                        {
                            blockpos = blockpos.down(rand.nextInt(5) + 1);
                            j2 = rand.nextInt(5);
                        }
                    }
                }
            }

            return true;
        }
    }
}