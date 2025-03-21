package soupbubbles.vanillaplus.handler;

import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistryModifiable;
import soupbubbles.vanillaplus.lib.Assets;

@Mod.EventBusSubscriber
public class RegistryHandler
{
    private static String[] override = {"bookshelf", "bone_block", "purpur_pillar", "wooden_button", "trapdoor", "stone_brick_stairs", "sandstone_stairs", "red_sandstone_stairs", "stone_brick_slab", "sandstone_slab", "red_sandstone_slab", "pumpkin_pie", "pumpkin_seeds"};

    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event)
    {
        IForgeRegistryModifiable modRegistry = (IForgeRegistryModifiable) event.getRegistry();

        for (int i = 0; i < override.length; i++)
        {
            modRegistry.remove(new ResourceLocation(Assets.MINECRAFT_PREFIX + override[i]));
        }
    }
}
