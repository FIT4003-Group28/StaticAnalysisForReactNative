package com.baidu.platform.comapi.map;

import android.opengl.GLSurfaceView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
/* loaded from: classes.dex */
public class MapRenderer implements GLSurfaceView.Renderer {

    /* renamed from: d  reason: collision with root package name */
    private static final String f2044d = "MapRenderer";

    /* renamed from: a  reason: collision with root package name */
    public int f2045a;

    /* renamed from: b  reason: collision with root package name */
    public int f2046b;

    /* renamed from: c  reason: collision with root package name */
    public int f2047c;
    private long e;
    private a f;
    private final GestureDetector$OnDoubleTapListenerC0136i g;

    /* loaded from: classes.dex */
    public interface a {
        void e();
    }

    public MapRenderer(GestureDetector$OnDoubleTapListenerC0136i gestureDetector$OnDoubleTapListenerC0136i, a aVar) {
        this.f = aVar;
        this.g = gestureDetector$OnDoubleTapListenerC0136i;
    }

    private void a(GL10 gl10) {
        gl10.glClear(16640);
        gl10.glClearColor(0.85f, 0.8f, 0.8f, BitmapDescriptorFactory.HUE_RED);
    }

    private boolean a() {
        return this.e != 0;
    }

    public static native void nativeInit(long j);

    public static native int nativeRender(long j);

    public static native void nativeResize(long j, int i, int i2);

    public void a(long j) {
        this.e = j;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        if (!a()) {
            a(gl10);
            return;
        }
        if (this.f2047c <= 1) {
            nativeResize(this.e, this.f2045a, this.f2046b);
            this.f2047c++;
        }
        this.f.e();
        int nativeRender = nativeRender(this.e);
        for (InterfaceC0138k interfaceC0138k : this.g.a().f) {
            D H = this.g.a().H();
            gl10.glPushMatrix();
            gl10.glRotatef(H.f2028c, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            gl10.glRotatef(H.f2027b, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f);
            interfaceC0138k.a(gl10, H);
            gl10.glPopMatrix();
            gl10.glColor4f(0.96f, 0.95f, 0.94f, 1.0f);
        }
        GestureDetector$OnDoubleTapListenerC0136i gestureDetector$OnDoubleTapListenerC0136i = this.g;
        if (nativeRender == 1) {
            gestureDetector$OnDoubleTapListenerC0136i.requestRender();
        } else if (!this.g.a().c()) {
            if (gestureDetector$OnDoubleTapListenerC0136i.getRenderMode() == 0) {
                return;
            }
            gestureDetector$OnDoubleTapListenerC0136i.setRenderMode(0);
        } else if (gestureDetector$OnDoubleTapListenerC0136i.getRenderMode() != 1) {
            gestureDetector$OnDoubleTapListenerC0136i.setRenderMode(1);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        if (this.e != 0) {
            nativeResize(this.e, i, i2);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        nativeInit(this.e);
        if (!a()) {
            return;
        }
        this.f.e();
    }
}
