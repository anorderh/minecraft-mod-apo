package com.example.apomod.core.init;

import com.example.apomod.APOMod;
import com.example.apomod.core.itemgroup.APOItems;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			ExampleMod.MOD_ID);

	public static final RegistryObject<Item> APO_MURAL = ITEMS.register("apo_mural",
			() -> new Item(new Item.Properties().group(APOItems.APO_ITEMGROUP)));
	
	
}
