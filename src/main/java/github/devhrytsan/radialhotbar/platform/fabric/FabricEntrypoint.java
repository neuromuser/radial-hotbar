package github.devhrytsan.radialhotbar.platform.fabric;

//? fabric {

import github.devhrytsan.radialhotbar.RadialHotBarMod;
import dev.kikugie.fletching_table.annotation.fabric.Entrypoint;
import net.fabricmc.api.ModInitializer;

@Entrypoint("main")
public class FabricEntrypoint implements ModInitializer {

	@Override
	public void onInitialize() {
		RadialHotBarMod.onInitialize();
	}
}
//?}
