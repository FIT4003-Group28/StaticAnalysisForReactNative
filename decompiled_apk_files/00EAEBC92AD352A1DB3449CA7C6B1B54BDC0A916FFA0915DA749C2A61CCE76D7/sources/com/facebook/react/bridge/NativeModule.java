package com.facebook.react.bridge;

import c.d.l.a.a;
@a
/* loaded from: classes.dex */
public interface NativeModule {

    /* loaded from: classes.dex */
    public interface NativeMethod {
        String getType();

        void invoke(JSInstance jSInstance, ReadableArray readableArray);
    }

    boolean canOverrideExistingModule();

    String getName();

    void initialize();

    void onCatalystInstanceDestroy();
}
