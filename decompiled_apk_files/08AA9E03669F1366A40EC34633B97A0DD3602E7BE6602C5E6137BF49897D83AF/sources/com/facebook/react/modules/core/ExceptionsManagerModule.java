package com.facebook.react.modules.core;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.al;
import com.facebook.react.bridge.am;
/* loaded from: classes.dex */
public class ExceptionsManagerModule extends BaseJavaModule {
    protected static final String NAME = "ExceptionsManager";
    private final com.facebook.react.devsupport.a.b mDevSupportManager;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public ExceptionsManagerModule(com.facebook.react.devsupport.a.b bVar) {
        this.mDevSupportManager = bVar;
    }

    @al
    public void reportFatalException(String str, am amVar, int i) {
        showOrThrowError(str, amVar, i);
    }

    @al
    public void reportSoftException(String str, am amVar, int i) {
        if (this.mDevSupportManager.d()) {
            this.mDevSupportManager.a(str, amVar, i);
        } else {
            com.facebook.common.e.a.d("ReactNative", com.facebook.react.h.a.a(str, amVar));
        }
    }

    private void showOrThrowError(String str, am amVar, int i) {
        if (this.mDevSupportManager.d()) {
            this.mDevSupportManager.a(str, amVar, i);
            return;
        }
        throw new com.facebook.react.b.c(com.facebook.react.h.a.a(str, amVar));
    }

    @al
    public void updateExceptionMessage(String str, am amVar, int i) {
        if (this.mDevSupportManager.d()) {
            this.mDevSupportManager.b(str, amVar, i);
        }
    }

    @al
    public void dismissRedbox() {
        if (this.mDevSupportManager.d()) {
            this.mDevSupportManager.a();
        }
    }
}
