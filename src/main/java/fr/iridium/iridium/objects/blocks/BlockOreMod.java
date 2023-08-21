package fr.iridium.iridium.objects.blocks;

import fr.iridium.iridium.Main;
import fr.iridium.iridium.init.BlockInit;
import fr.iridium.iridium.init.ItemInit;
import fr.iridium.iridium.utils.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import java.util.ArrayList;
import java.util.List;

public class BlockOreMod extends Block implements IHasModel {

    public ItemStack drop;
    public int count;
    public BlockOreMod(Material material, String name, CreativeTabs tabs, Item drop, int count){
        super(material);
        this.drop = drop.getDefaultInstance();
        this.count = count;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tabs);
        setHardness(8);
        setHarvestLevel("pickaxe", 3);
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(name));
    }

    @Override
    public void registerModel() {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0);
    }

    @Override
    public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        List<ItemStack> list = new ArrayList<ItemStack>();
        list.add(new ItemStack(this.drop.getItem(), this.count));
        return list;
    }
}
