package github.devhrytsan.radialhotbar;

import github.devhrytsan.radialhotbar.platform.Platform;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//? fabric {
import github.devhrytsan.radialhotbar.platform.fabric.FabricPlatform;
//?} neoforge {
/*import github.devhrytsan.radialhotbar.platform.neoforge.NeoforgePlatform;
 *///?} forge {
/*import github.devhrytsan.radialhotbar.platform.forge.ForgePlatform;
*///?}

@SuppressWarnings("LoggingSimilarMessage")
public class RadialHotBarMod {

	public static final String MOD_ID = /*$ mod_id*/ "mod";
	public static final String MOD_VERSION = /*$ mod_version*/ "0.0.0";
	public static final String MOD_FRIENDLY_NAME = /*$ mod_name*/ "Mod";
	public static final Logger MAIN_LOGGER = LoggerFactory.getLogger(MOD_ID);

	private static final Platform PLATFORM = createPlatformInstance();

	public static void onInitialize() {
		MAIN_LOGGER.info("Initializing {} on {}", MOD_ID, RadialHotBarMod.xplat().loader());
		MAIN_LOGGER.debug("{}: { version: {}; friendly_name: {} }", MOD_ID, MOD_VERSION, MOD_FRIENDLY_NAME);
	}

	public static void onInitializeClient() {
		MAIN_LOGGER.info("Initializing {} Client on {}", MOD_ID, RadialHotBarMod.xplat().loader());
		MAIN_LOGGER.debug("{}: { version: {}; friendly_name: {} }", MOD_ID, MOD_VERSION, MOD_FRIENDLY_NAME);


	}

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
