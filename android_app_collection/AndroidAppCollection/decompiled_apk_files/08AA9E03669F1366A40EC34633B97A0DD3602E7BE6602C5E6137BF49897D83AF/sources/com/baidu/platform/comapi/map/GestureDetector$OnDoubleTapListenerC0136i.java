package com.baidu.platform.comapi.map;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import com.baidu.mapapi.common.EnvironmentUtilities;
import com.baidu.mapapi.common.SysOSUtil;
import com.baidu.mapapi.model.inner.GeoPoint;
import com.baidu.platform.comapi.map.MapRenderer;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
@SuppressLint({"NewApi"})
/* renamed from: com.baidu.platform.comapi.map.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class GestureDetector$OnDoubleTapListenerC0136i extends GLSurfaceView implements GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener, MapRenderer.a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f2064a = "i";

    /* renamed from: b  reason: collision with root package name */
    private Handler f2065b;

    /* renamed from: c  reason: collision with root package name */
    private MapRenderer f2066c;

    /* renamed from: d  reason: collision with root package name */
    private int f2067d;
    private int e;
    private GestureDetector f;
    private C0132e g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.baidu.platform.comapi.map.i$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        float f2068a;

        /* renamed from: b  reason: collision with root package name */
        float f2069b;

        /* renamed from: c  reason: collision with root package name */
        float f2070c;

        /* renamed from: d  reason: collision with root package name */
        float f2071d;
        boolean e;
        float f;
        float g;
        double h;
    }

    public GestureDetector$OnDoubleTapListenerC0136i(Context context, B b2, String str) {
        super(context);
        if (context == null) {
            throw new RuntimeException("when you create an mapview, the context can not be null");
        }
        this.f = new GestureDetector(context, this);
        EnvironmentUtilities.initAppDirectory(context);
        if (this.g == null) {
            this.g = new C0132e(context, str);
        }
        this.g.a();
        f();
        this.g.b();
        this.g.a(b2);
        g();
        this.g.a(this.f2065b);
        this.g.e();
        setBackgroundColor(0);
    }

    public static void a(boolean z) {
        C0132e.j(z);
    }

    private static boolean a(int i, int i2, int i3, int i4, int i5, int i6) {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        egl10.eglInitialize(eglGetDisplay, new int[2]);
        int[] iArr = new int[1];
        return egl10.eglChooseConfig(eglGetDisplay, new int[]{12324, i, 12323, i2, 12322, i3, 12321, i4, 12325, i5, 12326, i6, 12344}, new EGLConfig[100], 100, iArr) && iArr[0] > 0;
    }

    private void f() {
        try {
            if (a(5, 6, 5, 0, 24, 0)) {
                setEGLConfigChooser(5, 6, 5, 0, 24, 0);
            } else {
                setEGLConfigChooser(true);
            }
        } catch (IllegalArgumentException unused) {
            setEGLConfigChooser(true);
        }
        this.f2066c = new MapRenderer(this, this);
        this.f2066c.a(this.g.h);
        setRenderer(this.f2066c);
        setRenderMode(1);
    }

    private void g() {
        this.f2065b = new HandlerC0137j(this);
    }

    public C0132e a() {
        return this.g;
    }

    public void a(int i) {
        int i2;
        if (this.g == null) {
            return;
        }
        Message message = new Message();
        message.what = 50;
        message.obj = Long.valueOf(this.g.h);
        boolean p = this.g.p();
        if (i != 3) {
            if (p) {
                i2 = 1;
            }
            this.f2065b.sendMessage(message);
        }
        i2 = 0;
        message.arg1 = i2;
        this.f2065b.sendMessage(message);
    }

    public void a(String str, Rect rect) {
        if (this.g == null || this.g.g == null) {
            return;
        }
        if (rect != null) {
            int i = rect.left;
            int i2 = this.e < rect.bottom ? 0 : this.e - rect.bottom;
            int width = rect.width();
            int height = rect.height();
            if (i < 0 || i2 < 0 || width <= 0 || height <= 0) {
                return;
            }
            if (width > this.f2067d) {
                width = Math.abs(rect.width()) - (rect.right - this.f2067d);
            }
            if (height > this.e) {
                height = Math.abs(rect.height()) - (rect.bottom - this.e);
            }
            if (i > SysOSUtil.getScreenSizeX() || i2 > SysOSUtil.getScreenSizeY()) {
                this.g.g.a(str, (Bundle) null);
                requestRender();
                return;
            }
            this.f2067d = width;
            this.e = height;
            Bundle bundle = new Bundle();
            bundle.putInt("x", i);
            bundle.putInt("y", i2);
            bundle.putInt("width", width);
            bundle.putInt("height", height);
            this.g.g.a(str, bundle);
        } else {
            this.g.g.a(str, (Bundle) null);
        }
        requestRender();
    }

    public void b() {
        if (this.g != null) {
            for (InterfaceC0138k interfaceC0138k : this.g.f) {
                interfaceC0138k.e();
            }
            this.g.b(this.f2065b);
            this.g.M();
            this.g = null;
        }
    }

    public void c() {
        if (this.g == null) {
            return;
        }
        this.g.t();
    }

    public void d() {
        if (this.g == null) {
            return;
        }
        this.g.u();
    }

    @Override // com.baidu.platform.comapi.map.MapRenderer.a
    public void e() {
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        if (this.g == null || this.g.g == null || !this.g.i) {
            return true;
        }
        GeoPoint b2 = this.g.b((int) motionEvent.getX(), (int) motionEvent.getY());
        if (b2 != null) {
            for (InterfaceC0138k interfaceC0138k : this.g.f) {
                interfaceC0138k.b(b2);
            }
            if (this.g.e) {
                D D = this.g.D();
                D.f2026a += 1.0f;
                D.f2029d = b2.getLongitudeE6();
                D.e = b2.getLatitudeE6();
                this.g.a(D, 300);
                C0132e c0132e = this.g;
                C0132e.k = System.currentTimeMillis();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.g == null || this.g.g == null || !this.g.i) {
            return true;
        }
        if (!this.g.f2059d) {
            return false;
        }
        float sqrt = (float) Math.sqrt((f * f) + (f2 * f2));
        if (sqrt <= 500.0f) {
            return false;
        }
        this.g.z();
        this.g.a(34, (int) (sqrt * 0.6f), ((int) motionEvent2.getX()) | (((int) motionEvent2.getY()) << 16));
        this.g.L();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        if (this.g == null || this.g.g == null || !this.g.i) {
            return;
        }
        String a2 = this.g.g.a(-1, (int) motionEvent.getX(), (int) motionEvent.getY(), this.g.j);
        if (a2 == null || a2.equals("")) {
            for (InterfaceC0138k interfaceC0138k : this.g.f) {
                interfaceC0138k.c(this.g.b((int) motionEvent.getX(), (int) motionEvent.getY()));
            }
            return;
        }
        for (InterfaceC0138k interfaceC0138k2 : this.g.f) {
            if (interfaceC0138k2.b(a2)) {
                this.g.n = true;
            } else {
                interfaceC0138k2.c(this.g.b((int) motionEvent.getX(), (int) motionEvent.getY()));
            }
        }
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        super.onPause();
        if (this.g == null || this.g.g == null) {
            return;
        }
        this.g.g.e();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        if (this.g == null || this.g.g == null) {
            return;
        }
        for (InterfaceC0138k interfaceC0138k : this.g.f) {
            interfaceC0138k.c();
        }
        this.g.g.i();
        this.g.g.f();
        this.g.g.p();
        setRenderMode(1);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.g == null || this.g.g == null || !this.g.i) {
            return true;
        }
        String a2 = this.g.g.a(-1, (int) motionEvent.getX(), (int) motionEvent.getY(), this.g.j);
        if (a2 == null || a2.equals("")) {
            for (InterfaceC0138k interfaceC0138k : this.g.f) {
                interfaceC0138k.a(this.g.b((int) motionEvent.getX(), (int) motionEvent.getY()));
            }
        } else {
            for (InterfaceC0138k interfaceC0138k2 : this.g.f) {
                interfaceC0138k2.a(a2);
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.g == null || this.g.g == null) {
            return true;
        }
        super.onTouchEvent(motionEvent);
        for (InterfaceC0138k interfaceC0138k : this.g.f) {
            interfaceC0138k.a(motionEvent);
        }
        if (!this.f.onTouchEvent(motionEvent)) {
            return this.g.a(motionEvent);
        }
        return true;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        super.surfaceChanged(surfaceHolder, i, i2, i3);
        if (this.g == null || this.g.g == null) {
            return;
        }
        this.f2066c.f2045a = i2;
        this.f2066c.f2046b = i3;
        this.f2067d = i2;
        this.e = i3;
        this.f2066c.f2047c = 0;
        D D = this.g.D();
        if (D.f == 0 || D.f == -1 || D.f == (D.j.f2034a - D.j.f2035b) / 2) {
            D.f = -1;
        }
        if (D.g == 0 || D.g == -1 || D.g == (D.j.f2037d - D.j.f2036c) / 2) {
            D.g = -1;
        }
        D.j.f2034a = 0;
        D.j.f2036c = 0;
        D.j.f2037d = i3;
        D.j.f2035b = i2;
        this.g.a(D);
        this.g.a(this.f2067d, this.e);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        super.surfaceCreated(surfaceHolder);
        if (surfaceHolder == null || surfaceHolder.getSurface().isValid()) {
            return;
        }
        surfaceDestroyed(surfaceHolder);
    }
}
