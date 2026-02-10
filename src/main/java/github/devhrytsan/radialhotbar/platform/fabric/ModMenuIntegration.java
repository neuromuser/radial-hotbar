package github.devhrytsan.radialhotbar.platform.fabric;
//? fabric {
import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import github.devhrytsan.radialhotbar.config.RadialHotBarConfigScreen;

public class ModMenuIntegration implements ModMenuApi {

    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return RadialHotBarConfigScreen::createConfigScreen;
    }
}
//?}
