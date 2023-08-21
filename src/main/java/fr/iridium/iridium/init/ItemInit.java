package fr.iridium.iridium.init;

import fr.iridium.iridium.Main;
import fr.iridium.iridium.objects.items.*;
import fr.iridium.iridium.objects.items.armor.ArmorMod;
import fr.iridium.iridium.objects.items.random.stick.MineralRandomStick;
import fr.iridium.iridium.objects.items.tools.ItemAxeMod;
import fr.iridium.iridium.objects.items.tools.ItemPickaxeMod;
import fr.iridium.iridium.objects.items.tools.ItemShovelMod;
import fr.iridium.iridium.objects.items.tools.ItemSwordMod;
import fr.iridium.iridium.objects.items.tools.cerium.CeriumPickaxe;
import fr.iridium.iridium.utils.Ref;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    //  Material
    public static final Item.ToolMaterial IRIDIUM_MATERIAL_TOOL = EnumHelper.addToolMaterial("iridium_tool", 5, 5000, 12, 10, 18);
    public static final ItemArmor.ArmorMaterial IRIDIUM_MATERIAL_ARMOR = EnumHelper.addArmorMaterial("iridium_armor", Ref.MODID + ":iridium", 200, new int[]{5, 7, 5, 3}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1);

    public static final Item.ToolMaterial CERIUM_MATERIAL_TOOL = EnumHelper.addToolMaterial("cerium_tool", 5, 6000, 15, 12, 18);
    public static final ItemArmor.ArmorMaterial CERIUM_MATERIAL_ARMOR = EnumHelper.addArmorMaterial("cerium_material", Ref.MODID + ":cerium", 250, new int[]{5, 7, 5, 3}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1);

    public static final Item IRIDIUM_INGOT = new ItemBase("iridium_ingot", Main.iridiumTab);

    // Tool iridium
    public static final Item IRIDIUM_SWORD = new ItemSwordMod(IRIDIUM_MATERIAL_TOOL, "iridium_sword", Main.iridiumTab);
    public static final Item IRIDIUM_PICKAXE = new ItemPickaxeMod(IRIDIUM_MATERIAL_TOOL, "iridium_pickaxe", Main.iridiumTab);
    public static final Item IRIDIUM_SHOVEL = new ItemShovelMod(IRIDIUM_MATERIAL_TOOL, "iridium_shovel", Main.iridiumTab);
    public static final Item IRIDIUM_AXE = new ItemAxeMod(IRIDIUM_MATERIAL_TOOL, "iridium_axe", Main.iridiumTab);

    // Armor iridium

    public static final Item IRIDIUM_HELMET = new ArmorMod(IRIDIUM_MATERIAL_ARMOR, 1, EntityEquipmentSlot.HEAD, "iridium_helmet", Main.iridiumTab);
    public static final Item IRIDIUM_CHESTPLATE = new ArmorMod(IRIDIUM_MATERIAL_ARMOR, 1, EntityEquipmentSlot.CHEST, "iridium_chestplate", Main.iridiumTab);
    public static final Item IRIDIUM_LEGGINGS = new ArmorMod(IRIDIUM_MATERIAL_ARMOR, 2, EntityEquipmentSlot.LEGS, "iridium_leggings", Main.iridiumTab);
    public static final Item IRIDIUM_BOOTS = new ArmorMod(IRIDIUM_MATERIAL_ARMOR, 1, EntityEquipmentSlot.FEET, "iridium_boots", Main.iridiumTab);

    // Cerium
    public static final Item CERIUM_INGOT = new ItemBase("cerium_ingot", Main.iridiumTab);
    public static final Item CERIUM_NUGGET = new ItemBase("cerium_nugget", Main.iridiumTab);

    public static final Item CERIUM_SWORD = new ItemSwordMod(CERIUM_MATERIAL_TOOL, "cerium_sword", Main.iridiumTab);
    public static final Item CERIUM_PICKAXE = new CeriumPickaxe(CERIUM_MATERIAL_TOOL, "cerium_pickaxe", Main.iridiumTab);
    public static final Item CERIUM_AXE = new ItemAxeMod(CERIUM_MATERIAL_TOOL, "cerium_axe", Main.iridiumTab);
    public static final Item CERIUM_SHOVEL = new ItemShovelMod(CERIUM_MATERIAL_TOOL, "cerium_shovel", Main.iridiumTab);

    public static final Item CERIUM_HELMET = new ArmorMod(CERIUM_MATERIAL_ARMOR, 1, EntityEquipmentSlot.HEAD, "cerium_helmet", Main.iridiumTab);
    public static final Item CERIUM_CHESTPLATE = new ArmorMod(CERIUM_MATERIAL_ARMOR, 1, EntityEquipmentSlot.CHEST, "cerium_chestplate", Main.iridiumTab);
    public static final Item CERIUM_LEGGINGS = new ArmorMod(CERIUM_MATERIAL_ARMOR, 2, EntityEquipmentSlot.LEGS, "cerium_leggings", Main.iridiumTab);
    public static final Item CERIUM_BOOTS = new ArmorMod(CERIUM_MATERIAL_ARMOR, 1, EntityEquipmentSlot.FEET, "cerium_boots", Main.iridiumTab);

    public static final Item SUPER_STICK = new SuperStick("super_stick", Main.iridiumTab).setMaxStackSize(1);

    // Mineral Random Stick
    public static final Item MINERAL_RANDOM_STICK = new MineralRandomStick("mineral_random_stick", Main.iridiumTab, 1);
    public static final Item SECOND_MINERAL_RANDOM_STICK = new MineralRandomStick("second_mineral_random_stick", Main.iridiumTab, 2);

    public static final Item THIRD_MINERAL_RANDOM_STICK = new MineralRandomStick("third_mineral_random_stick", Main.iridiumTab, 3);

}
