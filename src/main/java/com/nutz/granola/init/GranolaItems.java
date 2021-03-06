package com.nutz.granola.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.nutz.granola.GranolaMod;
import com.nutz.granola.Reference;
import com.nutz.granola.item.ItemGranolaAxeI;
import com.nutz.granola.item.ItemGranolaHoeI;
import com.nutz.granola.item.ItemGranolaPickI;
import com.nutz.granola.item.ItemGranolaShovelI;
import com.nutz.granola.item.ItemGranolaSwordI;

public class GranolaItems {
	
	public static Item granola_bit;
	public static Item granola_bar;
	public static Item roasted_bar;
	public static Item good_bar;
	
	// public static final ItemArmor.ArmorMaterial armour_i = EnumHelper.addArmorMaterial("armour_i", null, 256, new int[]{5, 10, 5, 3}, 3);
	
	public static final Item.ToolMaterial tier_i_mat = EnumHelper.addToolMaterial("tier_i_mat", 1, 256, 5.0F, 0.5F, 2);
	public static Item pick_i;
	public static Item axe_i;
	public static Item shovel_i;
	public static Item hoe_i;
	public static Item sword_i;
	
	public static void init()
	{
		// ITEMS \\
		granola_bit = new Item().setUnlocalizedName("granola_bit").setCreativeTab(GranolaMod.tabGranola);
		granola_bar = new ItemFood(2, 0.3F, false).setUnlocalizedName("granola_bar").setCreativeTab(GranolaMod.tabGranola);
		roasted_bar = new ItemFood(3, 0.5F, true).setUnlocalizedName("roasted_bar").setCreativeTab(GranolaMod.tabGranola);
		good_bar = new ItemFood(5, 0.7F, true).setUnlocalizedName("good_bar").setCreativeTab(GranolaMod.tabGranola);
		
		// TOOLS \\
		pick_i = new ItemGranolaPickI(tier_i_mat).setUnlocalizedName("pick_i").setCreativeTab(GranolaMod.tabTools);
		axe_i = new ItemGranolaAxeI(tier_i_mat).setUnlocalizedName("axe_i").setCreativeTab(GranolaMod.tabTools);
		shovel_i = new ItemGranolaShovelI(tier_i_mat).setUnlocalizedName("shovel_i").setCreativeTab(GranolaMod.tabTools);
		hoe_i = new ItemGranolaHoeI(tier_i_mat).setUnlocalizedName("hoe_i").setCreativeTab(GranolaMod.tabTools);
		sword_i = new ItemGranolaSwordI(tier_i_mat).setUnlocalizedName("sword_i").setCreativeTab(GranolaMod.tabTools);
	}
	
	public static void register()
	{   // REGISTER \\
		// regular
		GameRegistry.registerItem(granola_bit, granola_bit.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(granola_bar, granola_bar.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(roasted_bar, roasted_bar.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(good_bar, good_bar.getUnlocalizedName().substring(5));
		// tools
		// tier i \\
		GameRegistry.registerItem(pick_i, pick_i.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(axe_i, axe_i.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(shovel_i, shovel_i.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(hoe_i, hoe_i.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sword_i, sword_i.getUnlocalizedName().substring(5));
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
		registerRender(good_bar);
		
		registerRender(pick_i);
		registerRender(axe_i);
		registerRender(shovel_i);
		registerRender(hoe_i);
		registerRender(sword_i);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
