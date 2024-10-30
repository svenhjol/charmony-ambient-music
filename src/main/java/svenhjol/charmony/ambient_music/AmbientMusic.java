package svenhjol.charmony.ambient_music;

import svenhjol.charmony.core.annotations.ModDefinition;
import svenhjol.charmony.core.base.Mod;
import svenhjol.charmony.core.enums.Side;

@ModDefinition(id = AmbientMusic.ID, sides = {Side.Client},
    name = "Ambient music",
    description = "Music tweaks and additional background music. Compatible with vanilla servers such as Realms.")
public class AmbientMusic extends Mod {
    public static final String ID = "charmony-ambient-music";

    private static AmbientMusic instance;

    public static AmbientMusic instance() {
        if (instance == null) {
            instance = new AmbientMusic();
        }
        return instance;
    }

    @Override
    public String id() {
        return ID;
    }
}
