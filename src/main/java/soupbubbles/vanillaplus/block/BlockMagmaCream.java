package soupbubbles.vanillaplus.block;

import net.minecraft.block.BlockSlime;
import net.minecraft.block.SoundType;
import soupbubbles.vanillaplus.creativetab.CreativeTab;
import soupbubbles.vanillaplus.lib.Assets;
import soupbubbles.vanillaplus.lib.BlockValues;
import soupbubbles.vanillaplus.lib.Names;

public class BlockMagmaCream extends BlockSlime
{
    protected final String BASE_NAME = Names.BLOCK_MAGMA_CREAM;

    public BlockMagmaCream()
    {
        super();
        setRegistryName(BASE_NAME);
        setUnlocalizedName(BASE_NAME);
        setCreativeTab(CreativeTab.MINECRAFTBOOM_TAB);
        setHardness(BlockValues.SLIME_HARDNESS);
        setResistance(BlockValues.SLIME_RESISTANCE);
        setSoundType(SoundType.SLIME);
    }
    
    @Override
    public String getUnlocalizedName()
    {
        return String.format(Assets.BLOCK_PREFIX, Assets.ASSET_PREFIX, BASE_NAME);
    }
}
