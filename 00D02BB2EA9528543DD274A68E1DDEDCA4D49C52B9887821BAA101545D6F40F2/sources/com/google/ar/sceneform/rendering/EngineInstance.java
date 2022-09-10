package com.google.ar.sceneform.rendering;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import com.google.android.filament.Engine;
import com.google.android.filament.Filament;
import com.google.ar.sceneform.assets.Loader;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class EngineInstance {
    public static EGLContext a = null;
    public static dbet b = null;
    private static boolean c = false;

    public static dbet a() {
        b();
        dbet dbetVar = b;
        if (dbetVar != null) {
            return dbetVar;
        }
        throw new IllegalStateException("Filament Engine creation has failed.");
    }

    private static void b() {
        if (b == null) {
            if (!c) {
                try {
                    int i = Filament.a;
                    c = true;
                } catch (UnsatisfiedLinkError e) {
                    if (!Loader.a()) {
                        throw e;
                    }
                    c = true;
                }
            }
            EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            EGL14.eglInitialize(eglGetDisplay, null, 0, null, 0);
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            EGL14.eglChooseConfig(eglGetDisplay, new int[]{12352, 64, 12344}, 0, eGLConfigArr, 0, 1, new int[]{0}, 0);
            EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfigArr[0], eGLContext, new int[]{12440, 3, 12344}, 0);
            EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfigArr[0], new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext)) {
                a = eglCreateContext;
                dbet dbetVar = new dbet(Engine.create(eglCreateContext));
                b = dbetVar;
                if (dbetVar == null) {
                    throw new IllegalStateException("Filament Engine creation has failed.");
                }
                return;
            }
            throw new IllegalStateException("Error making GL context.");
        }
    }
}
