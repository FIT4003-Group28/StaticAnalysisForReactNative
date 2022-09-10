package defpackage;

import android.app.Application;
import android.os.Looper;
import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: amwp  reason: default package */
/* loaded from: classes2.dex */
public final class amwp implements amwz {
    public final ambz a;
    public final btvo b;
    public final bvjj c;
    public long d;
    public final amwo e;
    public final amwh f;
    public final cqat g;
    public final Semaphore h = new Semaphore(0);
    public volatile boolean i = false;
    final alwb j;
    private final Application k;
    private final Looper l;

    public amwp(Application application, cqat cqatVar, alwc alwcVar, ambz ambzVar, btvo btvoVar, bvjj bvjjVar, amwh amwhVar) {
        amwj amwjVar = new amwj(this);
        this.j = amwjVar;
        this.k = application;
        this.g = cqatVar;
        this.a = ambzVar;
        this.b = btvoVar;
        this.c = bvjjVar;
        this.f = amwhVar;
        bvqm bvqmVar = new bvqm(application, bvrj.PREFETCHER, "PrefetcherService");
        bvqmVar.start();
        Looper looper = bvqmVar.getLooper();
        this.l = looper;
        amwo amwoVar = new amwo(this, looper);
        this.e = amwoVar;
        alwcVar.d(amwjVar);
        amwoVar.sendEmptyMessage(0);
    }

    private final void f(int i, Object obj) {
        this.e.sendMessage(this.e.obtainMessage(i, obj));
    }

    @Override // defpackage.amwz
    public final void a(amwy amwyVar) {
        long b = this.g.b();
        if (b - this.d <= TimeUnit.MINUTES.toMillis(b().c) || !btox.a(this.k)) {
            amwyVar.a(1);
        } else {
            f(1, amwyVar);
        }
    }

    public final dvnt b() {
        return this.b.getPrefetcherSettingsParameters();
    }

    @Override // defpackage.amwz
    public final void c() {
        this.a.c(akry.BASE).E();
    }

    public final boolean d(int i, amwf amwfVar, amco amcoVar, amwy amwyVar) {
        boolean n = ambv.n(i);
        if (!this.i) {
            try {
                if (this.h.tryAcquire(true != n ? 60L : 10L, TimeUnit.SECONDS)) {
                    this.h.release();
                } else {
                    amwyVar.a(6);
                    return false;
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                amwyVar.a(6);
                return false;
            }
        }
        this.f.c();
        f(2, new amwm(i, amwfVar, amcoVar, n ? Integer.MAX_VALUE : b().b, amwyVar));
        return true;
    }

    @Override // defpackage.amwz
    public final void e(int i, Queue<alyh> queue, amwy amwyVar, akry akryVar) {
        this.a.c(akry.BASE).C(dchl.i(queue));
        f(3, new amwl(5, queue, amwyVar, akryVar, 3));
    }
}
