package name.modid.mixin.client;

import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Pseudo
@Mixin(targets = "moe.nea.firmament.features.misc.ModAnnouncer", remap = false)
public class ModHider {

    @Inject(method = "onServerJoin", at = @At("HEAD"), cancellable = true)
    private void onServerJoin(CallbackInfo ci) {
        ci.cancel();

        Minecraft mc = Minecraft.getInstance();
        if (mc.player != null) {
            mc.player.displayClientMessage(
                Component.literal("§d[Estrogen Lite] §7Firmament ModAnnouncer blocked."),
                false
            );
        }
    }
}
