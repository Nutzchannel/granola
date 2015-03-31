package com.nutz.granola.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.nutz.granola.blocks.GranolaBlock;

public class GranolaBlocks {
	public static Block granola_block_i;
	
	public static void init()
	{
		granola_block_i = new GranolaBlock(Material.cake).setUnlocalizedName("granola_block_i");
	}
	
	public static void register()
	{
		GameRegistry.registerBlock(granola_block_i, granola_block_i.getUnlocalizedName().substring(5));
	}
}
