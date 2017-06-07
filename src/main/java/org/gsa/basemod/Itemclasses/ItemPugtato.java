package org.gsa.basemod.Itemclasses;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class ItemPugtato extends Item{
	
	public int click = 1;
	
	public boolean message = true;
			
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn){
			ItemStack itemstack = playerIn.getHeldItem(handIn);
			
			if(click == 1 && message == true){
				playerIn.sendMessage(new TextComponentString("pug potato?"));
				click = 2;
				message = false;
				return new ActionResult(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
			}
			if(click == 2 && message == true){
				playerIn.sendMessage(new TextComponentString("pugtato?"));
				click = 3;
				message = false;
				return new ActionResult(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
			}
			if(click == 3 && message == true){
				playerIn.sendMessage(new TextComponentString("pugggggggggtato!"));
				click = 1;
				message = false;
				return new ActionResult(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
			}
			
			message = true;
			//playerIn.sendMessage(new TextComponentString("pugggggggggtato!"));
			return new ActionResult(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
			
		}
		
	public ItemPugtato(){	
		setRegistryName("item_pugtato");
		setUnlocalizedName("pugtato");
		setCreativeTab(CreativeTabs.MISC);
		
	}
	
	
		
	

	/*public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn){
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		playerIn.sendMessage(new TextComponentString("pugggggggggtato!"));
		return new ActionResult(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
	}*/

}
