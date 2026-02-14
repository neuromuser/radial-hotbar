package github.devhrytsan.radialhotbar.platform.fabric;

//? fabric {

import github.devhrytsan.radialhotbar.RadialHotBarMod;
import dev.kikugie.fletching_table.annotation.fabric.Entrypoint;
import net.fabricmc.api.ClientModInitializer;

@Entrypoint("client")
public class FabricClientEntrypoint implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		RadialHotBarMod.onInitializeClient();
		RadialHotBarMod.InitializeModFabric();
	}

}
//?}
