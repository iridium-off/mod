package fr.iridium.iridium.tabs;

import fr.iridium.iridium.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabBase extends CreativeTabs {

    public TabBase(String label){
        super(label);
        this.setBackgroundImageName(label + ".png");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemInit.IRIDIUM_INGOT);
    }
}
