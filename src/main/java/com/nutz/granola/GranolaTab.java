package com.nutz.granola;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.nutz.granola.init.GranolaItems;

public class GranolaTab extends CreativeTabs {
	public GranolaTab(String label) {
		super(label);
		this.setBackgroundImageName("granola.png");
	}
	
	@Override
	public Item getTabIconItem() {
		return GranolaItems.granola_bit;
	}
}
