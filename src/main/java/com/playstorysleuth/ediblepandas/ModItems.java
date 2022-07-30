package com.playstorysleuth.ediblepandas;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.IEventBus;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS
            = DeferredRegister.create(ForgeRegistries.ITEMS, EdiblePandas.MOD_ID);

    public static final RegistryObject<Item> RAW_PANDA_MEAT = ITEMS.register("raw_panda_meat",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}