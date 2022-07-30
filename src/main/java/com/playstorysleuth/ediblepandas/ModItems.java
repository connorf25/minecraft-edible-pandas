package com.playstorysleuth.ediblepandas;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
//import net.minecraft.world.item.ItemGroup;
//import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS
            = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);

    public static final RegistryObject<Item> RAW_PANDA_MEAT = ITEMS.register("raw_panda_meat",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
}