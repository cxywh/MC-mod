package player.PKmod;

import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PkMod.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ClientEvents {
    @SubscribeEvent
    public static void onKeyRegister(RegisterKeyMappingsEvent event) {
        event.register(KeyBindings.SPAWN_VILLAGER);
        event.register(KeyBindings.SPAWN_ZOMBIE);
    }

    @SubscribeEvent
    public static void onKeyInput(InputEvent.Key event) {
        if (Minecraft.getInstance().player == null) return;

        if (KeyBindings.SPAWN_VILLAGER.consumeClick()) {
            PkMod.CHANNEL.sendToServer(new PkMod.SpawnPacket(0));
        }

        if (KeyBindings.SPAWN_ZOMBIE.consumeClick()) {
            PkMod.CHANNEL.sendToServer(new PkMod.SpawnPacket(1));
        }
    }
}