package com.google.android.filament;

import android.opengl.EGLContext;
/* compiled from: PG */
/* loaded from: classes5.dex */
final class AndroidPlatform21 {
    AndroidPlatform21() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long getSharedContextNativeHandle(Object obj) {
        return ((EGLContext) obj).getNativeHandle();
    }
}
