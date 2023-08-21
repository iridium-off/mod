package fr.iridium.iridium.utils.handlers;

import fr.iridium.iridium.init.BlockInit;
import fr.iridium.iridium.init.ItemInit;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipesHandler {
    public static void registerRecipes(){
        GameRegistry.addSmelting(new ItemStack(BlockInit.IRIDIUM_ORE), new ItemStack(ItemInit.IRIDIUM_INGOT), 5);
    }
}
