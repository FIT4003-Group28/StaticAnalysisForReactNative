package com.baidu.platform.comapi.map;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TextureView;
import com.baidu.mapapi.common.EnvironmentUtilities;
import com.baidu.mapapi.common.SysOSUtil;
import com.baidu.mapapi.model.inner.GeoPoint;
import com.baidu.platform.comapi.map.C0139l;
import java.util.concurrent.atomic.AtomicBoolean;
@SuppressLint({"NewApi"})
/* loaded from: classes.dex */
public class E extends TextureView implements GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener, TextureView.SurfaceTextureListener, C0139l.a {

    /* renamed from: a  reason: collision with root package name */
    public static int f2038a;

    /* renamed from: b  reason: collision with root package name */
    public static int f2039b;

    /* renamed from: c  reason: collision with root package name */
    private GestureDetector f2040c;

    /* renamed from: d  reason: collision with root package name */
    private Handler f2041d;
    private C0139l e;
    private C0132e f;

    public E(Context context, B b2, String str) {
        super(context);
        this.e = null;
        a(context, b2, str);
    }

    private void a(Context context, B b2, String str) {
        setSurfaceTextureListener(this);
        if (context == null) {
            throw new RuntimeException("when you create an mapview, the context can not be null");
        }
        this.f2040c = new GestureDetector(context, this);
        EnvironmentUtilities.initAppDirectory(context);
        if (this.f == null) {
            this.f = new C0132e(context, str);
        }
        this.f.a();
        this.f.b();
        this.f.a(b2);
        f();
        this.f.a(this.f2041d);
        this.f.e();
    }

    public static void a(boolean z) {
        C0132e.j(z);
    }

    private void f() {
        this.f2041d = new F(this);
    }

    @Override // com.baidu.platform.comapi.map.C0139l.a
    public int a() {
        if (this.f == null) {
            return 0;
        }
        return MapRenderer.nativeRender(this.f.h);
    }

    public void a(String str, Rect rect) {
        if (this.f == null || this.f.g == null) {
            return;
        }
        if (rect != null) {
            int i = rect.left;
            int i2 = f2039b < rect.bottom ? 0 : f2039b - rect.bottom;
            int width = rect.width();
            int height = rect.height();
            if (i < 0 || i2 < 0 || width <= 0 || height <= 0) {
                return;
            }
            if (width > f2038a) {
                width = Math.abs(rect.width()) - (rect.right - f2038a);
            }
            if (height > f2039b) {
                height = Math.abs(rect.height()) - (rect.bottom - f2039b);
            }
            if (i > SysOSUtil.getScreenSizeX() || i2 > SysOSUtil.getScreenSizeY()) {
                this.f.g.a(str, (Bundle) null);
                if (this.e == null) {
                    return;
                }
                this.e.a();
                return;
            }
            f2038a = width;
            f2039b = height;
            Bundle bundle = new Bundle();
            bundle.putInt("x", i);
            bundle.putInt("y", i2);
            bundle.putInt("width", width);
            bundle.putInt("height", height);
            this.f.g.a(str, bundle);
            if (this.e == null) {
                return;
            }
        } else {
            this.f.g.a(str, (Bundle) null);
            if (this.e == null) {
                return;
            }
        }
        this.e.a();
    }

    public C0132e b() {
        return this.f;
    }

    public void c() {
        if (this.f == null || this.f.g == null) {
            return;
        }
        for (InterfaceC0138k interfaceC0138k : this.f.f) {
            interfaceC0138k.c();
        }
        this.f.g.i();
        this.f.g.f();
        this.f.g.p();
        if (this.e == null) {
            return;
        }
        this.e.a();
    }

    public void d() {
        if (this.f == null || this.f.g == null) {
            return;
        }
        this.f.g.e();
        synchronized (this.f) {
            this.f.g.e();
            if (this.e != null) {
                this.e.b();
            }
        }
    }

    public void e() {
        synchronized (this.f) {
            for (InterfaceC0138k interfaceC0138k : this.f.f) {
                interfaceC0138k.e();
            }
            if (this.f != null) {
                this.f.b(this.f2041d);
                this.f.M();
                this.f = null;
            }
            this.f2041d.removeCallbacksAndMessages(null);
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        if (this.f == null || this.f.g == null || !this.f.i) {
            return true;
        }
        GeoPoint b2 = this.f.b((int) motionEvent.getX(), (int) motionEvent.getY());
        if (b2 != null) {
            for (InterfaceC0138k interfaceC0138k : this.f.f) {
                interfaceC0138k.b(b2);
            }
            if (this.f.e) {
                D D = this.f.D();
                D.f2026a += 1.0f;
                D.f2029d = b2.getLongitudeE6();
                D.e = b2.getLatitudeE6();
                this.f.a(D, 300);
                C0132e c0132e = this.f;
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
        if (this.f == null || this.f.g == null || !this.f.i) {
            return true;
        }
        if (!this.f.f2059d) {
            return false;
        }
        float sqrt = (float) Math.sqrt((f * f) + (f2 * f2));
        if (sqrt <= 500.0f) {
            return false;
        }
        this.f.z();
        this.f.a(34, (int) (sqrt * 0.6f), ((int) motionEvent2.getX()) | (((int) motionEvent2.getY()) << 16));
        this.f.L();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        if (this.f == null || this.f.g == null || !this.f.i) {
            return;
        }
        String a2 = this.f.g.a(-1, (int) motionEvent.getX(), (int) motionEvent.getY(), this.f.j);
        if (a2 == null || a2.equals("")) {
            for (InterfaceC0138k interfaceC0138k : this.f.f) {
                interfaceC0138k.c(this.f.b((int) motionEvent.getX(), (int) motionEvent.getY()));
            }
            return;
        }
        for (InterfaceC0138k interfaceC0138k2 : this.f.f) {
            if (interfaceC0138k2.b(a2)) {
                this.f.n = true;
            } else {
                interfaceC0138k2.c(this.f.b((int) motionEvent.getX(), (int) motionEvent.getY()));
            }
        }
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
        if (this.f == null || this.f.g == null || !this.f.i) {
            return true;
        }
        String a2 = this.f.g.a(-1, (int) motionEvent.getX(), (int) motionEvent.getY(), this.f.j);
        if (a2 == null || a2.equals("")) {
            for (InterfaceC0138k interfaceC0138k : this.f.f) {
                interfaceC0138k.a(this.f.b((int) motionEvent.getX(), (int) motionEvent.getY()));
            }
        } else {
            for (InterfaceC0138k interfaceC0138k2 : this.f.f) {
                interfaceC0138k2.a(a2);
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.f == null) {
            return;
        }
        this.e = new C0139l(surfaceTexture, this, new AtomicBoolean(true), this);
        this.e.start();
        f2038a = i;
        f2039b = i2;
        D D = this.f.D();
        if (D == null) {
            return;
        }
        if (D.f == 0 || D.f == -1 || D.f == (D.j.f2034a - D.j.f2035b) / 2) {
            D.f = -1;
        }
        if (D.g == 0 || D.g == -1 || D.g == (D.j.f2037d - D.j.f2036c) / 2) {
            D.g = -1;
        }
        D.j.f2034a = 0;
        D.j.f2036c = 0;
        D.j.f2037d = i2;
        D.j.f2035b = i;
        this.f.a(D);
        this.f.a(f2038a, f2039b);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        if (this.e != null) {
            this.e.c();
            this.e = null;
            return true;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.f == null) {
            return;
        }
        f2038a = i;
        f2039b = i2;
        this.f.a(f2038a, f2039b);
        MapRenderer.nativeResize(this.f.h, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f == null || this.f.g == null) {
            return true;
        }
        super.onTouchEvent(motionEvent);
        for (InterfaceC0138k interfaceC0138k : this.f.f) {
            interfaceC0138k.a(motionEvent);
        }
        if (!this.f2040c.onTouchEvent(motionEvent)) {
            return this.f.a(motionEvent);
        }
        return true;
    }
}
