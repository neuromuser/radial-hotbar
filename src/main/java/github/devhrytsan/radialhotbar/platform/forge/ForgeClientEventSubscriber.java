package github.devhrytsan.radialhotbar.platform.forge;

//? forge {

/*import github.devhrytsan.radialhotbar.RadialHotBarMod;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = RadialHotBarMod.MOD_ID, value = Dist.CLIENT)
public class ForgeClientEventSubscriber {

	@SubscribeEvent
	public static void onClientSetup(final FMLClientSetupEvent event) {
		RadialHotBarMod.onInitializeClient();
	}
	@SubscribeEvent
    public void registerBindings(RegisterKeyMappingsEvent event) {
    event.register();
    }
}
*///?}
