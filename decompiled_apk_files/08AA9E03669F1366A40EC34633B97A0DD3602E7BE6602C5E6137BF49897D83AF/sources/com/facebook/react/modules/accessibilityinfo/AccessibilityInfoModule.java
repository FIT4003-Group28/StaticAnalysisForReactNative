package com.facebook.react.modules.accessibilityinfo;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.al;
import com.facebook.react.bridge.d;
import com.facebook.react.bridge.x;
import com.facebook.react.modules.core.DeviceEventManagerModule;
/* loaded from: classes.dex */
public class AccessibilityInfoModule extends ReactContextBaseJavaModule implements x {
    private static final String EVENT_NAME = "touchExplorationDidChange";
    private AccessibilityManager mAccessibilityManager;
    private boolean mEnabled;
    private a mTouchExplorationStateChangeListener;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AccessibilityInfo";
    }

    @Override // com.facebook.react.bridge.x
    public void onHostDestroy() {
    }

    @TargetApi(19)
    /* loaded from: classes.dex */
    private class a implements AccessibilityManager.TouchExplorationStateChangeListener {
        private a() {
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z) {
            AccessibilityInfoModule.this.updateAndSendChangeEvent(z);
        }
    }

    public AccessibilityInfoModule(ah ahVar) {
        super(ahVar);
        this.mEnabled = false;
        this.mAccessibilityManager = (AccessibilityManager) ahVar.getApplicationContext().getSystemService("accessibility");
        this.mEnabled = this.mAccessibilityManager.isTouchExplorationEnabled();
        if (Build.VERSION.SDK_INT >= 19) {
            this.mTouchExplorationStateChangeListener = new a();
        }
    }

    @al
    public void isTouchExplorationEnabled(d dVar) {
        dVar.a(Boolean.valueOf(this.mEnabled));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateAndSendChangeEvent(boolean z) {
        if (this.mEnabled != z) {
            this.mEnabled = z;
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().a(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(EVENT_NAME, Boolean.valueOf(this.mEnabled));
        }
    }

    @Override // com.facebook.react.bridge.x
    public void onHostResume() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.mAccessibilityManager.addTouchExplorationStateChangeListener(this.mTouchExplorationStateChangeListener);
        }
        updateAndSendChangeEvent(this.mAccessibilityManager.isTouchExplorationEnabled());
    }

    @Override // com.facebook.react.bridge.x
    public void onHostPause() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.mAccessibilityManager.removeTouchExplorationStateChangeListener(this.mTouchExplorationStateChangeListener);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        getReactApplicationContext().a(this);
        updateAndSendChangeEvent(this.mAccessibilityManager.isTouchExplorationEnabled());
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        getReactApplicationContext().b(this);
    }
}
