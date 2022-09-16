package com.google.vr.ndk.base;
/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ExtensionManager {
    void onPause();

    void onResume();

    void reportTelemetry(axgo axgoVar);

    void setEnabled(boolean z);

    void shutdown();
}
