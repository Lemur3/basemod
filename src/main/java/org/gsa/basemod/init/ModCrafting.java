package org.gsa.basemod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	
	public static void register(){
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.pugtato), "LHL"," A ","   ", 'A', Items.POTATO, 'L', Items.LEATHER, 'H', Items.LEATHER_HELMET );
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.pugtato), new ItemStack(Items.ARROW), new ItemStack(Items.BED));
		
		GameRegistry.addSmelting(Blocks.DIRT, new ItemStack(ModItems.pugtato), 5.0F);
	}

}
