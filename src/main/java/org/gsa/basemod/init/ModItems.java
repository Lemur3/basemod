package org.gsa.basemod.init;

import org.gsa.basemod.Itemclasses.ItemPugtato;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item pugtato;
	
	public static void init(){
		pugtato = new ItemPugtato();

	}
	
	public static void register(){
		GameRegistry.register(pugtato);
	}
	
	public static void registerRenders(){
		registerRender(pugtato);
	}
	
	private static void registerRender(Item item){
		//Method registers item with texture, DO NOT CHANGE!
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
}
