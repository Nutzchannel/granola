package com.nutz.granola.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.nutz.granola.Reference;

public class GranolaItems {
	
	public static Item granola_bit;
	public static Item granola_bar;
	public static Item roasted_bar;
	
	public static void init()
	{
		granola_bit = new Item().setUnlocalizedName("granola_bit");
		granola_bar = new ItemFood(2, 0.3F, false).setUnlocalizedName("granola_bar");
		roasted_bar = new ItemFood(3, 0.5F, true).setUnlocalizedName("roasted_bar");
	}
	
	public static void register()
	{   // ITEMS \\
		GameRegistry.registerItem(granola_bit, granola_bit.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(granola_bar, granola_bar.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(roasted_bar, roasted_bar.getUnlocalizedName().substring(5));
		
		// RECIPIES \\
		GameRegistry.addRecipe(new ItemStack(granola_bit, 5), new Object[]{" W "," W ", "   ", 'W', Items.wheat});
		GameRegistry.addRecipe(new ItemStack(granola_bar), new Object[]{"   ","BBB","   ", 'B', granola_bit});
		
		// SMELTING \\
		GameRegistry.addSmelting(granola_bar, new ItemStack(roasted_bar), 2.5F);
	}
	
	public static void registerRenders()
	{
		registerRender(granola_bit);
		registerRender(granola_bar);
		registerRender(roasted_bar);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
