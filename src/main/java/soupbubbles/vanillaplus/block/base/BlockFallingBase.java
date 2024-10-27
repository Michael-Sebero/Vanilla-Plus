package soupbubbles.vanillaplus.block.base;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import soupbubbles.vanillaplus.creativetab.CreativeTab;
import soupbubbles.vanillaplus.lib.Assets;

public class BlockFallingBase extends BlockFalling
{
    protected final String BASE_NAME;

    public BlockFallingBase(String name)
    {
        this(name, SoundType.SAND);
    }
    
    public BlockFallingBase(String name, SoundType sound)
    {
        super();
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(CreativeTab.MINECRAFTBOOM_TAB);
        setSoundType(sound);
        
        BASE_NAME = name;
    }
    
    @Override
    public String getUnlocalizedName()
    {
        return String.format(Assets.BLOCK_PREFIX, Assets.ASSET_PREFIX, BASE_NAME);
    }
}
