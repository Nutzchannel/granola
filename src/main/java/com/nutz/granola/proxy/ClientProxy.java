package com.nutz.granola.proxy;

import com.nutz.granola.init.GranolaItems;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenders()
	{
		GranolaItems.registerRenders();
	}
}
