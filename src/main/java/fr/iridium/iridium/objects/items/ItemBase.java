package fr.iridium.iridium.objects.items;

import fr.iridium.iridium.Main;
import fr.iridium.iridium.init.ItemInit;
import fr.iridium.iridium.utils.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name, CreativeTabs tabs){
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
