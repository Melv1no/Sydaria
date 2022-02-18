package fr.crazzoxx.sydaria;

import com.example.examplemod.ExampleMod;
import fr.crazzoxx.sydaria.server.SydariaServer;
import net.labymod.api.LabyModAddon;
import net.labymod.settings.elements.BooleanElement;
import net.labymod.settings.elements.ControlElement;
import net.labymod.settings.elements.SettingsElement;
import net.labymod.utils.Material;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

public class Sydaria extends LabyModAddon {
    boolean pluginAutoWelcome;
    @Override
    public void onEnable() {
            getApi().registerServerSupport(this, new SydariaServer());
    }
    @Override
    public void onDisable() {
        saveConfig();
    }
    @Override
    public void loadConfig() {
        this.pluginAutoWelcome = getConfig().has("pluginAutoWelcome") ? getConfig().get( "pluginAutoWelcome" ).getAsBoolean() : true;
    }
    @Override
    protected void fillSettings(List<SettingsElement> subSettings) {
        subSettings.add( new BooleanElement( "Auto Bienvenue", this, new ControlElement.IconData( Material.YELLOW_FLOWER ), "pluginAutoWelcome", this.pluginAutoWelcome ) );
    }
}
