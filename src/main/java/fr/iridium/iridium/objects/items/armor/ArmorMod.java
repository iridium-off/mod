package fr.iridium.iridium.objects.items.armor;

import fr.iridium.iridium.Main;
import fr.iridium.iridium.init.ItemInit;
import fr.iridium.iridium.utils.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;


public class ArmorMod extends ItemArmor implements IHasModel {

    // HELMET : 3
    // CHESTPLATE : 2
    // LEGGINGS : 1
    // BOOTS : 0


    public ArmorMod(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, String name, CreativeTabs tabs) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
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
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {

        if(player.inventory.armorItemInSlot(3).getItem() == ItemInit.IRIDIUM_HELMET){
            player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 20*10, 0));
        }
        if(player.inventory.armorItemInSlot(1).getItem() == ItemInit.IRIDIUM_LEGGINGS){
            player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 20*10, 0));
        }
        if(player.inventory.armorItemInSlot(0).getItem() == ItemInit.IRIDIUM_BOOTS){
            player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20*10, 0));
        }


        if(player.inventory.armorItemInSlot(3).getItem() == ItemInit.CERIUM_HELMET){
            player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 20*10, 0));
        }
        if(player.inventory.armorItemInSlot(2).getItem() == ItemInit.CERIUM_CHESTPLATE){
            player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20*10, 0));
        }
        if(player.inventory.armorItemInSlot(1).getItem() == ItemInit.CERIUM_LEGGINGS){
            player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 20*10, 1));
        }
        if(player.inventory.armorItemInSlot(0).getItem() == ItemInit.CERIUM_BOOTS){
            player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20*10, 1));
        }
    }


}
