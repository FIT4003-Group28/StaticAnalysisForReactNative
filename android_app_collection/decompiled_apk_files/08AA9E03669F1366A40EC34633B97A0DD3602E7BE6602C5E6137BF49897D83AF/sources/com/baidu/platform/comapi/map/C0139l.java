package com.baidu.platform.comapi.map;

import android.annotation.SuppressLint;
import android.graphics.SurfaceTexture;
import android.opengl.GLUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;
@SuppressLint({"NewApi"})
/* renamed from: com.baidu.platform.comapi.map.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0139l extends Thread {

    /* renamed from: a  reason: collision with root package name */
    private AtomicBoolean f2073a;

    /* renamed from: b  reason: collision with root package name */
    private SurfaceTexture f2074b;

    /* renamed from: c  reason: collision with root package name */
    private a f2075c;

    /* renamed from: d  reason: collision with root package name */
    private EGL10 f2076d;
    private GL10 h;
    private final E k;
    private EGLDisplay e = EGL10.EGL_NO_DISPLAY;
    private EGLContext f = EGL10.EGL_NO_CONTEXT;
    private EGLSurface g = EGL10.EGL_NO_SURFACE;
    private int i = 1;
    private boolean j = false;

    /* renamed from: com.baidu.platform.comapi.map.l$a */
    /* loaded from: classes.dex */
    public interface a {
        int a();
    }

    public C0139l(SurfaceTexture surfaceTexture, a aVar, AtomicBoolean atomicBoolean, E e) {
        this.f2074b = surfaceTexture;
        this.f2075c = aVar;
        this.f2073a = atomicBoolean;
        this.k = e;
    }

    private boolean a(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f2076d = (EGL10) EGLContext.getEGL();
        this.e = this.f2076d.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (this.e == EGL10.EGL_NO_DISPLAY) {
            throw new RuntimeException("eglGetdisplay failed : " + GLUtils.getEGLErrorString(this.f2076d.eglGetError()));
        } else if (!this.f2076d.eglInitialize(this.e, new int[2])) {
            throw new RuntimeException("eglInitialize failed : " + GLUtils.getEGLErrorString(this.f2076d.eglGetError()));
        } else {
            EGLConfig[] eGLConfigArr = new EGLConfig[100];
            int[] iArr = new int[1];
            if (!this.f2076d.eglChooseConfig(this.e, new int[]{12324, i, 12323, i2, 12322, i3, 12321, i4, 12325, i5, 12326, i6, 12344}, eGLConfigArr, 100, iArr) || iArr[0] <= 0) {
                return false;
            }
            this.f = this.f2076d.eglCreateContext(this.e, eGLConfigArr[0], EGL10.EGL_NO_CONTEXT, new int[]{12440, 1, 12344});
            this.g = this.f2076d.eglCreateWindowSurface(this.e, eGLConfigArr[0], this.f2074b, null);
            if (this.g == EGL10.EGL_NO_SURFACE || this.f == EGL10.EGL_NO_CONTEXT) {
                if (this.f2076d.eglGetError() == 12299) {
                    throw new RuntimeException("eglCreateWindowSurface returned  EGL_BAD_NATIVE_WINDOW. ");
                }
                GLUtils.getEGLErrorString(this.f2076d.eglGetError());
            }
            if (this.f2076d.eglMakeCurrent(this.e, this.g, this.g, this.f)) {
                this.h = (GL10) this.f.getGL();
                return true;
            }
            GLUtils.getEGLErrorString(this.f2076d.eglGetError());
            throw new RuntimeException("eglMakeCurrent failed : " + GLUtils.getEGLErrorString(this.f2076d.eglGetError()));
        }
    }

    private static boolean b(int i, int i2, int i3, int i4, int i5, int i6) {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        egl10.eglInitialize(eglGetDisplay, new int[2]);
        int[] iArr = new int[1];
        return egl10.eglChooseConfig(eglGetDisplay, new int[]{12324, i, 12323, i2, 12322, i3, 12321, i4, 12325, i5, 12326, i6, 12344}, new EGLConfig[100], 100, iArr) && iArr[0] > 0;
    }

    private void d() {
        try {
            if (b(5, 6, 5, 0, 24, 0)) {
                a(5, 6, 5, 0, 24, 0);
            } else {
                a(8, 8, 8, 0, 16, 0);
            }
        } catch (IllegalArgumentException unused) {
            a(8, 8, 8, 0, 16, 0);
        }
        MapRenderer.nativeInit(this.k.b().h);
        MapRenderer.nativeResize(this.k.b().h, E.f2038a, E.f2039b);
    }

    private void e() {
        this.f2076d.eglDestroyContext(this.e, this.f);
        this.f2076d.eglDestroySurface(this.e, this.g);
        this.f2076d.eglTerminate(this.e);
        this.f = EGL10.EGL_NO_CONTEXT;
        this.g = EGL10.EGL_NO_SURFACE;
    }

    public void a() {
        this.i = 1;
        synchronized (this) {
            if (getState() == Thread.State.WAITING) {
                notify();
            }
        }
    }

    public void b() {
        this.i = 0;
    }

    public void c() {
        this.j = true;
        synchronized (this) {
            if (getState() == Thread.State.WAITING) {
                notify();
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        d();
        while (this.f2075c != null) {
            if (this.i != 1) {
                try {
                    synchronized (this) {
                        wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else if (this.k.b() == null) {
                break;
            } else {
                synchronized (this.k.b()) {
                    this.i = this.f2075c.a();
                    for (InterfaceC0138k interfaceC0138k : this.k.b().f) {
                        D H = this.k.b().H();
                        if (this.h == null) {
                            return;
                        }
                        this.h.glPushMatrix();
                        this.h.glRotatef(H.f2028c, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                        this.h.glRotatef(H.f2027b, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f);
                        interfaceC0138k.a(this.h, H);
                        this.h.glPopMatrix();
                        this.h.glColor4f(0.96f, 0.95f, 0.94f, 1.0f);
                    }
                    this.f2076d.eglSwapBuffers(this.e, this.g);
                }
            }
            if (this.j) {
                break;
            }
        }
        e();
    }
}
