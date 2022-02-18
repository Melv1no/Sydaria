package fr.crazzoxx.sydaria.server;

import net.labymod.api.events.TabListEvent;
import net.labymod.servermanager.ChatDisplayAction;
import net.labymod.servermanager.Server;
import net.labymod.settings.elements.SettingsElement;
import net.labymod.user.User;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.PacketBuffer;
import net.minecraft.server.management.PlayerManager;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import tv.twitch.chat.ChatRawMessage;

import java.util.List;

public class SydariaServer extends Server {
    public SydariaServer() {
        super("sydaria", "play.sydaria.fr");
    }

    @Override
    public void onJoin(ServerData serverData) {
    }

    @Override
    public ChatDisplayAction handleChatMessage(String s, String s1) throws Exception {
      if(s.contains("Bienvenue")){
          Minecraft.getMinecraft().thePlayer.sendChatMessage("/b");
      }
        return null;
    }

    @Override
    public void handlePluginMessage(String s, PacketBuffer packetBuffer) throws Exception {

    }

    @Override
    public void handleTabInfoMessage(TabListEvent.Type type, String s, String s1) throws Exception {

    }

    @Override
    public void fillSubSettings(List<SettingsElement> list) {

    }
}
