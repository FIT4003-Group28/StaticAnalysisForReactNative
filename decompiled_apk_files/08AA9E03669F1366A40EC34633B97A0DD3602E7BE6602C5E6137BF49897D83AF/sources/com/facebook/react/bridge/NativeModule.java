package com.facebook.react.bridge;
@com.facebook.k.a.a
/* loaded from: classes.dex */
public interface NativeModule {

    /* loaded from: classes.dex */
    public interface a {
        void a(q qVar, ReadableNativeArray readableNativeArray);
    }

    boolean canOverrideExistingModule();

    String getName();

    void initialize();

    void onCatalystInstanceDestroy();
}
