package com.example.mixins;


import com.google.common.base.MoreObjects;
import com.velocitypowered.api.util.ProxyVersion;
import com.velocitypowered.proxy.VelocityServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(VelocityServer.class)
public class ExampleRebrandMixin {
  @Inject(method = "getVersion", at = @At("HEAD"), cancellable = true)
  private void implName(CallbackInfoReturnable<ProxyVersion> cir){
    Package pkg = VelocityServer.class.getPackage();
    String implVersion = MoreObjects.firstNonNull(pkg.getImplementationVersion(), "<unknown>");
    String implVendor = MoreObjects.firstNonNull(pkg.getImplementationVendor(), "Velocity Contributors");
    cir.setReturnValue(new ProxyVersion("Ignite with velocity", implVendor, implVersion));
  }
}
