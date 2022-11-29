package com.example.apomod.core.init;

import com.example.apomod.APOMod;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			ExampleMod.MOD_ID);

	public static final RegistryObject<Block> LIANA_BLOCK = BLOCKS
			.register("liana_block",
					() -> new Block(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.GREEN)
							.hardnessAndResistance(0.2f, 1f).harvestTool(ToolType.SHOVEL).harvestLevel(1)
							.sound(SoundType.ANVIL)));

}
