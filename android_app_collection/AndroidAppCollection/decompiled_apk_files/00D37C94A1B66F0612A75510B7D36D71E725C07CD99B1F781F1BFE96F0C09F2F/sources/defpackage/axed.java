package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: axed  reason: default package */
/* loaded from: classes2.dex */
public final class axed {
    public final int a;
    public final axee b;
    public final float[] c;
    public volatile SurfaceTexture g;
    public volatile Surface h;
    private final int l;
    private final int m;
    private final boolean n;
    private HandlerThread o;
    public final AtomicInteger d = new AtomicInteger(0);
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final int[] f = new int[1];
    public volatile boolean i = false;
    public volatile boolean j = false;
    public final Object k = new Object();

    public axed(int i, int i2, int i3, axee axeeVar, boolean z) {
        float[] fArr = new float[16];
        this.c = fArr;
        this.a = i;
        this.l = i2;
        this.m = i3;
        this.b = axeeVar;
        this.n = z;
        Matrix.setIdentityM(fArr, 0);
        if (z) {
            HandlerThread handlerThread = new HandlerThread("SurfaceTexture Callback Thread");
            this.o = handlerThread;
            handlerThread.start();
        }
    }

    public final void a() {
        if (this.i) {
            return;
        }
        GLES20.glGenTextures(1, this.f, 0);
        b(this.f[0]);
    }

    public final void b(int i) {
        Handler handler;
        if (this.i) {
            return;
        }
        this.f[0] = i;
        if (this.n) {
            handler = new Handler(this.o.getLooper());
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        if (this.g == null) {
            this.g = new SurfaceTexture(this.f[0]);
            if (this.l > 0 && this.m > 0) {
                this.g.setDefaultBufferSize(this.l, this.m);
            }
            this.g.setOnFrameAvailableListener(new axec(this), handler);
            this.h = new Surface(this.g);
        } else {
            this.g.attachToGLContext(this.f[0]);
        }
        this.i = true;
        axee axeeVar = this.b;
        if (axeeVar == null) {
            return;
        }
        axeeVar.c();
    }

    public final void c(axea axeaVar) {
        synchronized (this.k) {
            this.j = true;
        }
        if (this.e.getAndSet(true)) {
            return;
        }
        axee axeeVar = this.b;
        if (axeeVar != null) {
            axeeVar.a();
        }
        if (this.g != null) {
            this.g.release();
            this.g = null;
            if (this.h != null) {
                this.h.release();
            }
            this.h = null;
        }
        axeaVar.a(this.a, 0, 0L, this.c);
    }
}
