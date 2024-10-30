package svenhjol.charmony.ambient_music.client;

import net.fabricmc.api.ClientModInitializer;
import svenhjol.charmony.ambient_music.AmbientMusic;
import svenhjol.charmony.core.enums.Side;

public class ClientInitializer implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Init charmony first.
        svenhjol.charmony.core.client.ClientInitializer.init();

        // Bootstrap and run the mod.
        var ambientMusic = AmbientMusic.instance();
        ambientMusic.run(Side.Client);
    }
}
