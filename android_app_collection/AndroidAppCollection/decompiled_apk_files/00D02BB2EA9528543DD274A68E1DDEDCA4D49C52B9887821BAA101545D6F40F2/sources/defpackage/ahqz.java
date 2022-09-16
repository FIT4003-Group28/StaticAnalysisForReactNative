package defpackage;

import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ahqz  reason: default package */
/* loaded from: classes.dex */
public final class ahqz implements ahkl {
    public final cqat a;
    final ahqy b;
    private final btrm k;
    private final dehq l;
    private final Executor m;
    public final Object c = new Object();
    public final WeakHashMap<ahkh, Object> d = new WeakHashMap<>();
    public volatile float e = -1.0f;
    public volatile float f = Float.NaN;
    public volatile int g = -1;
    private boolean n = false;
    public volatile boolean h = false;
    public long i = 0;
    public boolean j = false;
    private final Runnable o = new ahqx(this);

    public ahqz(btrm btrmVar, dehq dehqVar, Executor executor, cqat cqatVar) {
        this.k = btrmVar;
        this.l = dehqVar;
        this.m = executor;
        this.a = cqatVar;
        ahqy ahqyVar = new ahqy(this);
        this.b = ahqyVar;
        dceq a = dcet.a();
        a.b(ahlb.class, new ahra(ahlb.class, ahqyVar, bvrj.UI_THREAD));
        btrmVar.g(ahqyVar, a.a());
    }

    @Override // defpackage.ahkl
    public final float a() {
        return this.f;
    }

    @Override // defpackage.ahkl
    public final void b() {
        this.h = true;
    }

    @Override // defpackage.ahkl
    public final void c() {
        this.h = false;
    }

    @Override // defpackage.ahkl
    public final void d(ahkj ahkjVar) {
    }

    @Override // defpackage.ahkl
    public final void e(ahkh ahkhVar) {
        synchronized (this.c) {
            this.d.put(ahkhVar, null);
        }
    }

    @Override // defpackage.ahkl
    public final void f(ahkh ahkhVar) {
        synchronized (this.c) {
            this.d.remove(ahkhVar);
        }
    }

    @Override // defpackage.ahkl
    public final boolean g() {
        return true;
    }

    public final void h() {
        bvrj.UI_THREAD.c();
        if (!this.j) {
            try {
                bvqd.b(this.l.d(this.o, Math.max(0L, (this.i + 2000) - this.a.e()), TimeUnit.MILLISECONDS), this.m);
            } catch (RejectedExecutionException unused) {
                i(false);
            }
            this.j = true;
        }
    }

    public final void i(boolean z) {
        bvrj.UI_THREAD.c();
        if (z == this.n) {
            return;
        }
        this.n = z;
        if (!z) {
            this.e = -1.0f;
            this.f = Float.NaN;
            this.g = -1;
        }
        this.k.b(new ahla(z));
    }
}
