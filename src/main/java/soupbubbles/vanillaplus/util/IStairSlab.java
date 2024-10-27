package soupbubbles.vanillaplus.util;

import net.minecraft.block.Block;
import soupbubbles.vanillaplus.block.base.BlockSlabBase;
import soupbubbles.vanillaplus.block.base.BlockStairBase;

public interface IStairSlab
{
    public Block addStairSlab();
    
    public boolean hasStairSlab();

    public BlockStairBase setStair(BlockStairBase stair);
    
    public BlockSlabBase setSlab(BlockSlabBase slab);
    
    public BlockStairBase getStair();
    
    public BlockSlabBase getSlab();
}
