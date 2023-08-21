package fr.iridium.iridium.objects.items.tools.cerium;

import fr.iridium.iridium.Main;
import fr.iridium.iridium.init.ItemInit;
import fr.iridium.iridium.utils.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class CeriumPickaxe extends ItemPickaxe implements IHasModel {
    public CeriumPickaxe(ToolMaterial material, String name, CreativeTabs tabs) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tabs);
        ItemInit.ITEMS.add(this);

    }

    @Override
    public void registerModel() {
        Main.proxy.registerItemRenderer(this, 0);
    }



}
