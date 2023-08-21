package fr.iridium.iridium.objects.items.random.stick;

import fr.iridium.iridium.Main;
import fr.iridium.iridium.init.ItemInit;
import fr.iridium.iridium.utils.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class MineralRandomStick extends Item implements IHasModel {

    private int lvl;

    public MineralRandomStick(String name, CreativeTabs tabs, int lvl){
        this.lvl = lvl;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tabs);
        setMaxStackSize(1);
        setMaxDamage(5);
        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModel() {
        Main.proxy.registerItemRenderer(this, 0);
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if(!worldIn.isRemote){
            ItemStack stack = player.getHeldItem(hand);
            Random item = new Random();
            Random number = new Random();

            if (this.lvl == 1){
                int n = number.nextInt(5) + 1;
                if (item.nextInt(5) == 0){
                    player.addItemStackToInventory(new ItemStack(Items.IRON_INGOT, n));
                }
                if (item.nextInt(5) == 1){
                    player.addItemStackToInventory(new ItemStack(Items.GOLD_INGOT, n));
                }
                if (item.nextInt(5) == 2){
                    player.addItemStackToInventory(new ItemStack(Items.DIAMOND, n));
                }
                if (item.nextInt(5) == 3){
                    player.addItemStackToInventory(new ItemStack(Items.EMERALD, n));
                }
                if (item.nextInt(5) == 4){
                    player.addItemStackToInventory(new ItemStack(ItemInit.IRIDIUM_INGOT, n));
                }
            }
            if (this.lvl == 2){
                int n = number.nextInt(5) + 1;
                if (item.nextInt(5) == 0){
                    player.addItemStackToInventory(new ItemStack(Items.IRON_INGOT, n));
                }
                if (item.nextInt(5) == 1){
                    player.addItemStackToInventory(new ItemStack(Items.GOLD_INGOT, n));
                }
                if (item.nextInt(5) == 2){
                    player.addItemStackToInventory(new ItemStack(Items.DIAMOND, n));
                }
                if (item.nextInt(5) == 3){
                    player.addItemStackToInventory(new ItemStack(Items.EMERALD, n));
                }
                if (item.nextInt(5) == 4){
                    player.addItemStackToInventory(new ItemStack(ItemInit.IRIDIUM_INGOT, n));
                }
            }
            if (this.lvl == 3){
                int n = number.nextInt(5) + 1;
                if (item.nextInt(5) == 0){
                    player.addItemStackToInventory(new ItemStack(Items.IRON_INGOT, n));
                }
                if (item.nextInt(5) == 1){
                    player.addItemStackToInventory(new ItemStack(Items.GOLD_INGOT, n));
                }
                if (item.nextInt(5) == 2){
                    player.addItemStackToInventory(new ItemStack(Items.DIAMOND, n));
                }
                if (item.nextInt(5) == 3){
                    player.addItemStackToInventory(new ItemStack(Items.EMERALD, n));
                }
                if (item.nextInt(5) == 4){
                    player.addItemStackToInventory(new ItemStack(ItemInit.IRIDIUM_INGOT, n));
                }
            }
            stack.damageItem(1, player);

            return EnumActionResult.SUCCESS;
        } else {
            return EnumActionResult.PASS;
        }
    }
}
