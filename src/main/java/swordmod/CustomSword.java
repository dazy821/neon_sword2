package swordmod;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;

public class CustomSword extends SwordItem {

    public CustomSword(){
        super(SwordMod.myTier, 0, 2F, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
        
    }
}
