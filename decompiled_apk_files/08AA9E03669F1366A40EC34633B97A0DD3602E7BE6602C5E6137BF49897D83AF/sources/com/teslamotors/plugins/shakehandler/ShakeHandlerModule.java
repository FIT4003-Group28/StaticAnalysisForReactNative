package com.teslamotors.plugins.shakehandler;

import android.hardware.SensorManager;
import com.facebook.react.b.g;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.al;
import com.facebook.react.modules.core.DeviceEventManagerModule;
/* loaded from: classes.dex */
public class ShakeHandlerModule extends ReactContextBaseJavaModule {
    private static final String REACT_CLASS = "TMShakeHandler";
    private static final String SHAKE_EVENT_IDENTIFIER = "TMShakeEventIdentifier";
    private com.teslamotors.plugins.shakehandler.a mShakeDetector;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* loaded from: classes.dex */
    private class a implements g.a {
        private a() {
        }

        @Override // com.facebook.react.b.g.a
        public void a() {
            if (ShakeHandlerModule.this.getReactApplicationContext().b()) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) ShakeHandlerModule.this.getReactApplicationContext().a(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(ShakeHandlerModule.SHAKE_EVENT_IDENTIFIER, null);
            }
        }
    }

    public ShakeHandlerModule(ah ahVar) {
        super(ahVar);
        this.mShakeDetector = new com.teslamotors.plugins.shakehandler.a(new a());
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        if (this.mShakeDetector != null) {
            this.mShakeDetector.a();
            this.mShakeDetector = null;
        }
    }

    @al
    public void startMonitoringDeviceMotion() {
        if (this.mShakeDetector != null) {
            this.mShakeDetector.a((SensorManager) getReactApplicationContext().getSystemService("sensor"));
        }
    }

    @al
    public void stopMonitoringDeviceMotion() {
        if (this.mShakeDetector != null) {
            this.mShakeDetector.a();
        }
    }
}
