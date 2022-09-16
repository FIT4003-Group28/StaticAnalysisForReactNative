package com.google.vr.cardboard;

import android.content.Context;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Choreographer;
import android.view.Display;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class DisplaySynchronizer implements Choreographer.FrameCallback {
    public static final long a = TimeUnit.SECONDS.toNanos(1);
    public volatile long b;
    public axei c;
    private volatile Display d;
    private DisplayMetrics e;
    private volatile int f = -1;
    private long g = 0;

    public DisplaySynchronizer(Context context, Display display) {
        this.b = nativeCreate(getClass().getClassLoader(), context.getApplicationContext());
        if (this.b == 0) {
            throw new IllegalStateException("Native DisplaySynchronizer creation failed, implementation unavailable.");
        }
        d(display);
        axei axeiVar = new axei(this);
        this.c = axeiVar;
        axeiVar.a.start();
        axeiVar.b = new Handler(axeiVar.a.getLooper(), axeiVar);
        axeiVar.b.sendEmptyMessage(0);
    }

    public final void a() {
        if (this.b != 0) {
            return;
        }
        throw new IllegalStateException("DisplaySynchronizer has already been shut down.");
    }

    public final void b() {
        this.f = -1;
        DisplayMetrics g = axds.g(this.d);
        if (!g.equals(this.e)) {
            if (this.e != null) {
                nativeOnMetricsChanged(this.b);
            }
            this.e = g;
        }
    }

    public final void c() {
        axei axeiVar = this.c;
        if (axeiVar != null) {
            axeiVar.a();
        }
    }

    public final void d(Display display) {
        a();
        this.d = display;
        b();
        float refreshRate = display.getRefreshRate();
        long nanos = refreshRate >= 30.0f ? ((float) TimeUnit.SECONDS.toNanos(1L)) / refreshRate : 0L;
        nativeReset(this.b, nanos, display.getAppVsyncOffsetNanos());
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int i;
        a();
        if (this.f == -1 || j - this.g > a) {
            int rotation = this.d.getRotation();
            if (rotation != 0) {
                if (rotation == 1) {
                    i = 90;
                } else if (rotation == 2) {
                    i = 180;
                } else if (rotation != 3) {
                    Log.e("DisplaySynchronizer", "Unknown display rotation, defaulting to 0");
                    this.f = 0;
                } else {
                    i = 270;
                }
                this.f = i;
            } else {
                this.f = 0;
            }
            this.g = j;
        }
        nativeUpdate(this.b, j, this.f);
    }

    protected final void finalize() {
        try {
            if (this.b != 0) {
                Log.w("DisplaySynchronizer", "DisplaySynchronizer.shutdown() should be called to ensure resource cleanup");
                nativeDestroy(this.b);
            }
        } finally {
            super.finalize();
        }
    }

    protected native long nativeCreate(ClassLoader classLoader, Context context);

    public native void nativeDestroy(long j);

    protected native void nativeOnMetricsChanged(long j);

    protected native void nativeReset(long j, long j2, long j3);

    protected native void nativeUpdate(long j, long j2, int i);
}
