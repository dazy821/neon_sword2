package swordmod.CodakidFiles;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.event.RegistryEvent;

import java.util.*;

public class Codakid {

    public static ArrayList<Item> itemsToRegister = new ArrayList<>();

    public static void registerItem(Item item, String registryName) {
        item.setRegistryName(registryName);
        itemsToRegister.add(item);
    }

    public static void doItemRegistry(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(itemsToRegister.toArray(new Item[itemsToRegister.size()]));
    }

    public static Tier addTier(int miningLevel, int maxUses, float miningSpeed, float damageBonus, int enchantability){

        return new Tier() {
            @Override
            public int getUses() {return maxUses;}

            @Override
            public float getSpeed() {return miningSpeed;}

            @Override
            public float getAttackDamageBonus() {return damageBonus;}

            @Override
            public int getLevel() {return miningLevel;}

            @Override
            public int getEnchantmentValue() {return enchantability;}

            @Override
            public Ingredient getRepairIngredient() {return null;}
        };
    }

}
