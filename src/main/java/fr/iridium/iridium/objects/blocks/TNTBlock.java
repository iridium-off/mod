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
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;


public class TNTBlock extends Block implements IHasModel {

    public int lvl;

    public TNTBlock(Material material, String name, CreativeTabs tabs, int lvl){
        super(material);
        this.lvl = lvl;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tabs);
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
        return list;
    }

    @Override
    public void onBlockDestroyedByPlayer(World worldIn, BlockPos pos, IBlockState state) {
        worldIn.createExplosion(null, pos.getX(), pos.getY(), pos.getZ(), this.lvl * 3, true);
    }

    @Override
    public void onBlockDestroyedByExplosion(World worldIn, BlockPos pos, Explosion explosionIn) {
        worldIn.createExplosion(null, pos.getX(), pos.getY(), pos.getZ(), this.lvl * 3, true);
    }



}
