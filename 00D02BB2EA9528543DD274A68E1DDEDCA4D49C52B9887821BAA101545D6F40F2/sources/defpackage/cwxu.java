package defpackage;

import android.content.Context;
import com.google.android.libraries.performance.primes.metrics.crash.NativeCrashHandlerImpl;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cwxu  reason: default package */
/* loaded from: classes5.dex */
public final class cwxu extends cwxq implements cwwr, cwtw {
    volatile cwsv a;
    public final dxio<cwxp> b;
    volatile cwxs c;
    private final cwrb e;
    private final Context f;
    private final Executor g;
    private final cwwo h;
    private final cxew i;
    private final AtomicBoolean d = new AtomicBoolean();
    private final AtomicInteger j = new AtomicInteger();
    private final AtomicInteger k = new AtomicInteger();
    private final AtomicInteger l = new AtomicInteger();

    public cwxu(cwwp cwwpVar, Context context, Executor executor, dxio<cwxp> dxioVar, dbsg<dzsj<NativeCrashHandlerImpl>> dbsgVar, cwrb cwrbVar, cxew cxewVar) {
        this.b = dxioVar;
        this.i = cxewVar;
        this.h = cwwpVar.a(dege.a, dxioVar, null);
        this.f = context;
        this.g = executor;
        this.e = cwrbVar;
        if (dbsgVar.a()) {
            dbsgVar.b().a().a(this);
        }
    }

    private final dehn<Void> h(final int i, final AtomicInteger atomicInteger) {
        atomicInteger.getAndIncrement();
        return deha.f(new deff(this, atomicInteger, i) { // from class: cwxr
            private final cwxu a;
            private final AtomicInteger b;
            private final int c;

            {
                this.a = this;
                this.b = atomicInteger;
                this.c = i;
            }

            @Override // defpackage.deff
            public final dehn a() {
                cwxu cwxuVar = this.a;
                AtomicInteger atomicInteger2 = this.b;
                int i2 = this.c;
                if (atomicInteger2.getAndDecrement() <= 0) {
                    return dehk.a;
                }
                return cwxuVar.f(i2, cwxuVar.b.a());
            }
        }, this.g);
    }

    @Override // defpackage.cwud
    public final void Sz() {
        if (this.c != null) {
            this.e.b(this.c);
            this.c = null;
        }
        if (!this.d.get() || !(Thread.getDefaultUncaughtExceptionHandler() instanceof cwxt)) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(((cwxt) Thread.getDefaultUncaughtExceptionHandler()).a);
    }

    @Override // defpackage.cwxq
    public final void a() {
        if (this.d.compareAndSet(false, true)) {
            Thread.setDefaultUncaughtExceptionHandler(new cwxt(this, Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    @Override // defpackage.cwtw
    public final void c() {
        cwtl.a(h(4, this.k));
        this.c = new cwxs(this);
        this.e.a(this.c);
    }

    public final eabd d() {
        eabd bZ = eabf.k.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        eabf eabfVar = (eabf) bZ.b;
        eabfVar.a |= 1;
        eabfVar.b = true;
        String d = cwsv.d(this.a);
        if (d != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            eabf eabfVar2 = (eabf) bZ.b;
            d.getClass();
            eabfVar2.a |= 4;
            eabfVar2.d = d;
        }
        try {
            eaau bZ2 = eaav.c.bZ();
            eaat a = cwuv.a(this.f);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            eaav eaavVar = (eaav) bZ2.b;
            a.getClass();
            eaavVar.b = a;
            eaavVar.a |= 1;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            eabf eabfVar3 = (eabf) bZ.b;
            eaav bK = bZ2.bK();
            bK.getClass();
            eabfVar3.c = bK;
            eabfVar3.a |= 2;
        } catch (RuntimeException unused) {
        }
        return bZ;
    }

    public final void e(eabf eabfVar) {
        dzze dzzeVar;
        cwxp a = this.b.a();
        if (a.e()) {
            while (this.j.getAndDecrement() > 0) {
                cwtl.a(f(3, a));
            }
            while (this.k.getAndDecrement() > 0) {
                cwtl.a(f(4, a));
            }
            while (this.l.getAndDecrement() > 0) {
                cwtl.a(f(3, a));
            }
            dzsj<dzze> d = a.d();
            dzze dzzeVar2 = null;
            if (d != null) {
                try {
                    dzzeVar = d.a();
                } catch (RuntimeException unused) {
                    dzzeVar = null;
                }
                if (!dzze.a.equals(dzzeVar)) {
                    dzzeVar2 = dzzeVar;
                }
            }
            cwwo cwwoVar = this.h;
            cwwi f = cwwj.f();
            eacc bZ = eacd.u.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            eacd eacdVar = (eacd) bZ.b;
            eabfVar.getClass();
            eacdVar.h = eabfVar;
            eacdVar.a |= 64;
            f.c(bZ.bK());
            ((cwwf) f).b = dzzeVar2;
            cwtl.a(cwwoVar.c(f.a()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dehn<Void> f(int i, cwxp cwxpVar) {
        if (!cwxpVar.e()) {
            return dehk.a;
        }
        float c = cwxpVar.c();
        if (!cxew.a(c / 100.0f).a()) {
            return dehk.a;
        }
        cwwo cwwoVar = this.h;
        cwwi f = cwwj.f();
        eacc bZ = eacd.u.bZ();
        eabq bZ2 = eabu.d.bZ();
        int i2 = (int) (100.0f / c);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        eabu eabuVar = (eabu) bZ2.b;
        int i3 = eabuVar.a | 2;
        eabuVar.a = i3;
        eabuVar.c = i2;
        eabuVar.b = i - 1;
        eabuVar.a = i3 | 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        eacd eacdVar = (eacd) bZ.b;
        eabu bK = bZ2.bK();
        bK.getClass();
        eacdVar.i = bK;
        eacdVar.a |= 128;
        f.c(bZ.bK());
        return cwwoVar.c(f.a());
    }

    @Override // defpackage.cwwr
    public final void g() {
        cwtl.a(h(3, this.j));
    }
}
