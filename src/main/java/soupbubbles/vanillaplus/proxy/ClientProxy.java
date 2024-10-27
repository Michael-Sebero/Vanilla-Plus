package soupbubbles.vanillaplus.proxy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import soupbubbles.vanillaplus.client.ModelManager;
import soupbubbles.vanillaplus.handler.GuiEventHandler;
import soupbubbles.vanillaplus.init.ModBlocks;
import soupbubbles.vanillaplus.init.ModEntities;

public class ClientProxy extends CommonProxy
{
    @Override
    public void preInit(FMLPreInitializationEvent event)
    {
        super.preInit(event);
        
        ModelManager.INSTANCE.registerAllModels();
        ModEntities.registerEntityRenderers();
    }

    @Override
    public void init(FMLInitializationEvent event)
    {
        super.init(event);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event)
    {
        super.postInit(event);
    }
}
