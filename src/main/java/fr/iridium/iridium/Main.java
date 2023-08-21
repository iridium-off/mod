package fr.iridium.iridium;

import fr.iridium.iridium.proxy.CommonProxy;
import fr.iridium.iridium.tabs.TabBase;
import fr.iridium.iridium.utils.Ref;
import fr.iridium.iridium.utils.handlers.RegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Ref.MODID,
        name = Ref.NAME,
        version = Ref.VERSION,
        acceptedMinecraftVersions = Ref.MCVERSION)
public class Main {

    @Mod.Instance
    public static Main instance;

    public static CreativeTabs iridiumTab = new TabBase("iridium");

    @SidedProxy(clientSide = Ref.CLIENT, serverSide = Ref.COMMON)
    public static CommonProxy proxy;

    public static Logger logger;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent e){
        logger = e.getModLog();

        proxy.preInit();

        RegistryHandler.preInitRegistries();
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent e){
        RegistryHandler.initRegistries();
    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent e){

    }

}
