package swordmod;

import swordmod.CodakidFiles.Codakid;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(SwordMod.MODID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SwordMod
{
    public static final String MODID = "forgeyoursword";
    public static final String MODNAME = "Neon Sword";
    public static String VERSION = "0.0.1";

    public static SwordMod instance;
    private static final Logger LOGGER = LogManager.getLogger();

    //*********** DECLARE VARIABLES ******************
    public static CustomSword mySword;
    public static Tier myTier;

    public SwordMod() {

        //*********** INITIALIZE MATERIALS ******************
       myTier = Codakid.addTier(5, 4000, 20, 8F, 44);
        
        //*********** INITIALIZE VARIABLES ******************
        mySword = new CustomSword();

        // ****************** REGISTER ITEMS ******************
        Codakid.registerItem(mySword, "my_sword");
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){ Codakid.doItemRegistry(event); }

}
