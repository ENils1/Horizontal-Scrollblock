package eirik.scrollblock.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.client.Mouse;

@Mixin(Mouse.class)
public class MouseMixin {

	@Inject(method = "onMouseScroll", at = @At("HEAD"), cancellable = true)
	private void onMouseScroll(long window, double horizontal, double vertical, CallbackInfo info) {
		if (horizontal != 0) {
			info.cancel();
		}

	}
}
