package com.example.mixins;

import com.velocitypowered.proxy.Velocity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.tinylog.Logger;

@Mixin(Velocity.class)
public class ExampleVelocityMixin {
  @Inject(method = "main",at = @At("HEAD"))
  private static void test(String[] args, CallbackInfo ci){
    Logger.info("Hello");
  }
}
