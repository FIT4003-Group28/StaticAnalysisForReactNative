package com.google.vr.dynamite.client;

import android.os.IInterface;
/* compiled from: PG */
/* loaded from: classes5.dex */
public interface INativeLibraryLoader extends IInterface {
    int checkVersion(String str);

    long initializeAndLoadNativeLibrary(String str);
}
