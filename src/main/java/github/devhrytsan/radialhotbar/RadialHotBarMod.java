package github.devhrytsan.radialhotbar;

import com.mojang.blaze3d.platform.InputConstants;
import github.devhrytsan.radialhotbar.config.FileConfigHandler;
import github.devhrytsan.radialhotbar.menu.RadialMenuController;
import github.devhrytsan.radialhotbar.platform.Platform;

import net.minecraft.client.KeyMapping;
import net.minecraft.resources.ResourceLocation;
import org.lwjgl.glfw.GLFW;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//? fabric {
import github.devhrytsan.radialhotbar.platform.fabric.FabricPlatform;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;

//?} neoforge {
/*import github.devhrytsan.radialhotbar.platform.neoforge.NeoforgePlatform;
 *///?} forge {
/*import github.devhrytsan.radialhotbar.platform.forge.ForgePlatform;
 *///?}

@SuppressWarnings("LoggingSimilarMessage")
public class RadialHotBarMod {

	// General
	public static final String MOD_ID = /*$ mod_id*/ "radialhotbar";
	public static final String MOD_VERSION = /*$ mod_version*/ "0.3.0";
	public static final String MOD_FRIENDLY_NAME = /*$ mod_name*/ "Radial Hot Bar";
	public static final Logger MAIN_LOGGER = LoggerFactory.getLogger(MOD_ID);
	// Keys
	public static KeyMapping OPEN_RADIAL_MENU_KEY;

	//? if >=1.21.5 {
	public static final KeyMapping.Category KEYBIND_CATEGORY = KeyMapping.Category.register(ResourceLocation.fromNamespaceAndPath(RadialHotBarMod.MOD_ID, "general"));
	//? } else {
	
	/*public static final String KEYBIND_CATEGORY = "key.category." + MOD_ID + ".general";
	
	*///? }

	private static final Platform PLATFORM = createPlatformInstance();

	public static void onInitialize() {
		MAIN_LOGGER.info("Initializing {} on {}", MOD_ID, RadialHotBarMod.xplat().loader());
		MAIN_LOGGER.debug("{}: { version: {}; friendly_name: {} }", MOD_ID, MOD_VERSION, MOD_FRIENDLY_NAME);
	}

	public static void onInitializeClient() {
		MAIN_LOGGER.info("Initializing {} Client on {}", MOD_ID, RadialHotBarMod.xplat().loader());
		MAIN_LOGGER.debug("{}: { version: {}; friendly_name: {} }", MOD_ID, MOD_VERSION, MOD_FRIENDLY_NAME);

		FileConfigHandler.loadConfig();
	}

	//? fabric {
	public static void InitializeModFabric() {
		OPEN_RADIAL_MENU_KEY = new KeyMapping(
				"key.category.radialhotbar.openkey",
				InputConstants.Type.KEYSYM,
				GLFW.GLFW_KEY_R,
				KEYBIND_CATEGORY
		);

		KeyBindingHelper.registerKeyBinding(OPEN_RADIAL_MENU_KEY);

		ClientTickEvents.END_CLIENT_TICK.register(client -> {
			RadialMenuController.INSTANCE.HandleUpdate(client);
		});
	}
	//?} neoforge {
	/*
	//TODO: NeoForgeInit
	*/
	//?} forge {
    /*
   	//TODO: ForgeInit
    */
    //?}

	static Platform xplat() {
		return PLATFORM;
	}

	private static Platform createPlatformInstance() {
		//? fabric {
		return new FabricPlatform();
		//?} neoforge {
		/*return new NeoforgePlatform();
		 *///?} forge {
		/*return new ForgePlatform();
		 *///?}
	}
}
