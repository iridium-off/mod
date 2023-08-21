package fr.iridium.iridium.init;

import fr.iridium.iridium.Main;
import fr.iridium.iridium.utils.Ref;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit {

    public static void registerEntities(){
        // registerEntity("scorpion", EntityScorpion.class, 111, 50, 4673858, 16711680);
    }
    private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2){
        EntityRegistry.registerModEntity(new ResourceLocation(Ref.MODID + ":" + name), entity,
                name, id, Main.instance, range, 1, true, color1, color2);
    }
}
