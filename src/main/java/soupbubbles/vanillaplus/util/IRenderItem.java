package soupbubbles.vanillaplus.util;

import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyEnum;
import soupbubbles.vanillaplus.lib.Assets;

public interface IRenderItem
{
    public static final IProperty<Boolean> ITEM = PropertyBool.create(Assets.VARIANT_NAME_ITEM);

    public PropertyEnum getVariants();
}
