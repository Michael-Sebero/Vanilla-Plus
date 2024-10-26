package soupbubbles.minecraftboom.handler;

import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockPumpkin;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import soupbubbles.minecraftboom.init.ModBlocks;
import soupbubbles.minecraftboom.init.ModItems;
import soupbubbles.minecraftboom.util.Utils;

@Mod.EventBusSubscriber
public class BlockEventHandler
{
    @SubscribeEvent
    public void onBlockDropItems(BlockEvent.HarvestDropsEvent event)
    {
        if(event.isCanceled())
        {
            return;
        }
        
        if (event.getState().getBlock() instanceof BlockOldLeaf)
        {
            event.setDropChance(1.0F);
            
            if (event.getWorld().rand.nextFloat() < ConfigurationHandler.stickDropRate && ConfigurationHandler.leavesDropSticks)
            {
                event.getDrops().add(new ItemStack(Items.STICK));
            }
        }
        else if (event.getState().getBlock() instanceof BlockPumpkin && ConfigurationHandler.generatePumpkins && Utils.isItemEnabled(ModItems.ITEM_PUMPKIN_SLICE))
        {
            event.getDrops().clear();
            event.getDrops().add(new ItemStack(ModItems.ITEM_PUMPKIN_SLICE, ModBlocks.BLOCK_FACELESS_PUMPKIN.quantityDropped(event.getWorld().rand)));
            
            if (event.getState().getBlock() == Blocks.LIT_PUMPKIN)
            {
                event.getDrops().add(new ItemStack(Blocks.TORCH));
            }
        }
    }
}
