package defpackage;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Handler;
import android.os.SystemClock;
import android.view.PixelCopy;
import android.view.Surface;
import java.util.Locale;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: afnr  reason: default package */
/* loaded from: classes.dex */
public final class afnr {
    public final Bitmap a;
    public final aewk b;
    private final zgz c;
    private final zgz d;
    private final ScheduledExecutorService e;
    private final axnm f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final float k;
    private int l;
    private int m;
    private Future n;
    private long o;
    private final long p;

    public afnr(ScheduledExecutorService scheduledExecutorService, axnm axnmVar, afjz afjzVar, aewk aewkVar, zgz zgzVar, zgz zgzVar2) {
        this.e = scheduledExecutorService;
        this.b = aewkVar;
        this.c = zgzVar;
        this.d = zgzVar2;
        this.k = afjzVar.o().ap;
        this.j = afjzVar.o().aq;
        this.p = afjzVar.o().ar;
        int i = afjzVar.o().ao;
        this.g = Color.red(i);
        this.h = Color.green(i);
        this.i = Color.blue(i);
        this.a = Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
        this.f = axnmVar;
    }

    private final Future f(final Runnable runnable, final TimeUnit timeUnit) {
        return this.e.schedule(new Runnable() { // from class: afnq
            @Override // java.lang.Runnable
            public final void run() {
                afnr afnrVar = afnr.this;
                Runnable runnable2 = runnable;
                TimeUnit timeUnit2 = timeUnit;
                afnrVar.c();
                afnrVar.e(runnable2, timeUnit2);
            }
        }, 1000L, timeUnit);
    }

    public final synchronized String a() {
        Future future = this.n;
        if (future != null) {
            future.cancel(false);
            this.n = null;
        }
        if (this.l == 0) {
            return "";
        }
        String format = String.format(Locale.US, "m.%.2f;t.%d", Float.valueOf(this.m / this.l), Integer.valueOf(this.l));
        this.l = 0;
        this.m = 0;
        return format;
    }

    public final synchronized void b(Bitmap bitmap) {
        int[] iArr = new int[100];
        bitmap.getPixels(iArr, 0, 10, 0, 0, 10, 10);
        float f = 0.0f;
        for (int i = 0; i < 100; i++) {
            int i2 = iArr[i];
            if (Math.sqrt(Math.pow(this.g - Color.red(i2), 2.0d) + Math.pow(this.h - Color.green(i2), 2.0d) + Math.pow(this.i - Color.blue(i2), 2.0d)) < this.j) {
                f += 1.0f;
            }
        }
        if (f / 100.0f >= this.k) {
            this.m++;
        }
        this.l++;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [afnh, java.lang.Object] */
    public final synchronized void c() {
        if (Boolean.TRUE.equals(this.c.a())) {
            return;
        }
        ?? a = this.d.a();
        if (a != 0 && a.C() != afnk.SECURE_SURFACE) {
            Surface A = a.A();
            if (A != null && A.isValid()) {
                PixelCopy.request(A, this.a, new PixelCopy.OnPixelCopyFinishedListener() { // from class: afno
                    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                    public final void onPixelCopyFinished(final int i) {
                        afnr afnrVar = afnr.this;
                        if (i == 0) {
                            afnrVar.b(afnrVar.a);
                        } else if (i == 3) {
                        } else {
                            final aewx aewxVar = afnrVar.b.a;
                            aewxVar.k.post(new Runnable() { // from class: aewe
                                @Override // java.lang.Runnable
                                public final void run() {
                                    aewx.this.ac(i);
                                }
                            });
                        }
                    }
                }, (Handler) this.f.get());
            }
        }
    }

    public final synchronized void d() {
        this.o = SystemClock.elapsedRealtime();
        if (this.n != null) {
            return;
        }
        this.n = f(new Runnable() { // from class: afnp
            @Override // java.lang.Runnable
            public final void run() {
                afnr.this.c();
            }
        }, TimeUnit.MILLISECONDS);
    }

    public final synchronized void e(Runnable runnable, TimeUnit timeUnit) {
        afms.a(this.n);
        if (this.n.isCancelled()) {
            return;
        }
        if (this.p == 0 || SystemClock.elapsedRealtime() - this.o <= this.p) {
            this.n = f(runnable, timeUnit);
        } else {
            this.n = null;
        }
    }
}
