package com.google.android.filament;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.view.Surface;
/* compiled from: PG */
/* loaded from: classes5.dex */
final class AndroidPlatform extends Platform {
    private static final String LOG_TAG = "Filament";

    static {
        EGL14.eglGetDisplay(0);
    }

    @Override // com.google.android.filament.Platform
    public long getSharedContextNativeHandle(Object obj) {
        return AndroidPlatform21.getSharedContextNativeHandle(obj);
    }

    @Override // com.google.android.filament.Platform
    void log(String str) {
    }

    @Override // com.google.android.filament.Platform
    public boolean validateSharedContext(Object obj) {
        return obj instanceof EGLContext;
    }

    @Override // com.google.android.filament.Platform
    public boolean validateStreamSource(Object obj) {
        return obj instanceof SurfaceTexture;
    }

    @Override // com.google.android.filament.Platform
    public boolean validateSurface(Object obj) {
        return obj instanceof Surface;
    }

    @Override // com.google.android.filament.Platform
    public void warn(String str) {
    }
}
