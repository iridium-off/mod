package fr.iridium.iridium.objects.blocks;

import fr.iridium.iridium.Main;
import fr.iridium.iridium.init.BlockInit;
import fr.iridium.iridium.init.ItemInit;
import fr.iridium.iridium.utils.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

    public BlockBase(Material material, String name, CreativeTabs tabs){
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tabs);
        setHardness(8);
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(name));
    }
    @Override
    public void registerModel() {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0);
    }
}
