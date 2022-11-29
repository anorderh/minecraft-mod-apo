package com.example.apomod.core.itemgroup;

import com.example.apomod.core.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class APOItems extends ItemGroup {

	public static final APOItems APO_ITEMGROUP = new APOItems(ItemGroup.GROUPS.length, "apo_items");
	
	public APOItems(int index, String label) {
		super(index, label);
		
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(ItemInit.APO_MURAL.get());
	}

}
