package fr.iridium.iridium.objects.items;

import fr.iridium.iridium.Main;
import fr.iridium.iridium.init.BlockInit;
import fr.iridium.iridium.init.ItemInit;
import fr.iridium.iridium.utils.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.items.ItemHandlerHelper;

public class SuperStick extends Item implements IHasModel {

    public SuperStick(String name, CreativeTabs tabs){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tabs);
        ItemInit.ITEMS.add(this);
    }
    @Override
    public void registerModel() {
        Main.proxy.registerItemRenderer(this, 0);
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if(!worldIn.isRemote) {
            if (worldIn.getBlockState(new BlockPos(pos)).getBlock() == BlockInit.DIAMOND_TNT) {
                worldIn.setBlockToAir(pos);
                ItemStack stack = new ItemStack(BlockInit.DIAMOND_TNT, 1, 0);
                stack.getItem();
                ItemHandlerHelper.giveItemToPlayer(player, stack);
            }
            if (worldIn.getBlockState(new BlockPos(pos)).getBlock() == BlockInit.IRIDIUM_TNT) {
                worldIn.setBlockToAir(pos);
                ItemStack stack = new ItemStack(BlockInit.IRIDIUM_TNT, 1, 0);
                stack.getItem();
                ItemHandlerHelper.giveItemToPlayer(player, stack);
            }
            if (worldIn.getBlockState(new BlockPos(pos)).getBlock() == BlockInit.CERIUM_TNT) {
                worldIn.setBlockToAir(pos);
                ItemStack stack = new ItemStack(BlockInit.CERIUM_TNT, 1, 0);
                stack.getItem();
                ItemHandlerHelper.giveItemToPlayer(player, stack);
            }
            return EnumActionResult.SUCCESS;
        } else {
            return EnumActionResult.PASS;
        }

    }
}
