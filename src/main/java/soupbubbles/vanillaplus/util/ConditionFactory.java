package soupbubbles.vanillaplus.util;

import java.util.function.BooleanSupplier;

import com.google.gson.JsonObject;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.JsonUtils;
import net.minecraftforge.common.crafting.IConditionFactory;
import net.minecraftforge.common.crafting.JsonContext;
import soupbubbles.vanillaplus.init.ModBlocks;
import soupbubbles.vanillaplus.init.ModItems;
import soupbubbles.vanillaplus.lib.Assets;

public class ConditionFactory implements IConditionFactory
{
    @Override
    public BooleanSupplier parse(JsonContext context, JsonObject json)
    {
        boolean value = JsonUtils.getBoolean(json, "value", true);
        String key = JsonUtils.getString(json, "type");

        for (Item item : ModItems.ITEMS)
        {
            if (key.equals(Assets.TEXTURE_PREFIX + Utils.getBaseItemName(item)))
            {
                return () -> Utils.isItemEnabled(item) == value;
            }
        }

        for (Block block : ModBlocks.BLOCKS)
        {
            if (key.equals(Assets.TEXTURE_PREFIX + Utils.getBaseBlockName(block)))
            {
                return () -> Utils.isBlockEnabled(block) == value;
            }
        }

        return null;
    }
}