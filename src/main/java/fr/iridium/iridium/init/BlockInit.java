package fr.iridium.iridium.init;

import fr.iridium.iridium.Main;
import fr.iridium.iridium.objects.blocks.BlockBase;
import fr.iridium.iridium.objects.blocks.TNTBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block IRIDIUM_BLOCK = new BlockBase(Material.ROCK, "iridium_block", Main.iridiumTab);
    // ore
    public static final Block IRIDIUM_ORE = new BlockBase(Material.ROCK, "iridium_ore", Main.iridiumTab);
    public static final Block CERIUM_ORE = new BlockBase(Material.ROCK, "cerium_ore", Main.iridiumTab);
    public static final Block CERIUM_BLOCK = new BlockBase(Material.ROCK, "cerium_block", Main.iridiumTab);

    public static final Block DIAMOND_TNT = new TNTBlock(Material.TNT, "diamond_tnt", Main.iridiumTab, 1);
    public static final Block IRIDIUM_TNT = new TNTBlock(Material.TNT, "iridium_tnt", Main.iridiumTab, 2);
    public static final Block CERIUM_TNT = new TNTBlock(Material.TNT, "cerium_tnt", Main.iridiumTab, 3);

}
