package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
@com.facebook.k.a.a
/* loaded from: classes.dex */
public class CxxModuleWrapperBase implements NativeModule {
    @com.facebook.k.a.a
    private HybridData mHybridData;

    @Override // com.facebook.react.bridge.NativeModule
    public boolean canOverrideExistingModule() {
        return false;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public native String getName();

    @Override // com.facebook.react.bridge.NativeModule
    public void initialize() {
    }

    static {
        ai.a();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.mHybridData.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public CxxModuleWrapperBase(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    protected void resetModule(HybridData hybridData) {
        if (hybridData != this.mHybridData) {
            this.mHybridData.a();
            this.mHybridData = hybridData;
        }
    }
}
