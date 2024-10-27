package soupbubbles.vanillaplus.block;

import net.minecraft.block.BlockLadder;
import net.minecraft.block.SoundType;
import soupbubbles.vanillaplus.creativetab.CreativeTab;
import soupbubbles.vanillaplus.lib.Assets;

public class BlockWoodenLadder extends BlockLadder
{
    protected final String BASE_NAME;

    public BlockWoodenLadder(String name)
    {
        super();
        setRegistryName(name);
        setUnlocalizedName(name);
        setHardness(0.4F);
        setSoundType(SoundType.WOOD);
        setCreativeTab(CreativeTab.MINECRAFTBOOM_TAB);
        
        BASE_NAME = name;
    }
    
    @Override
    public String getUnlocalizedName()
    {
        return String.format(Assets.BLOCK_PREFIX, Assets.ASSET_PREFIX, BASE_NAME);
    }
}
