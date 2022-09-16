package defpackage;

import androidx.work.WorkerParameters;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: awkh  reason: default package */
/* loaded from: classes3.dex */
public final class awkh implements irw {
    public final dxio<ckcw> a;
    public final gdo b;
    private final dxio<avjo> c;
    private final dxio<awjv> d;
    private final dxio<avij> e;
    private final dxio<isa> f;
    private final dehp g;
    private final Executor h;

    public awkh(dxio<avjo> dxioVar, dxio<awjv> dxioVar2, dxio<avij> dxioVar3, dxio<ckcw> dxioVar4, dxio<isa> dxioVar5, gdo gdoVar, dehp dehpVar, Executor executor) {
        this.c = dxioVar;
        this.d = dxioVar2;
        this.e = dxioVar3;
        this.a = dxioVar4;
        this.f = dxioVar5;
        this.b = gdoVar;
        this.g = dehpVar;
        this.h = executor;
    }

    @Override // defpackage.irw
    public final dehn<bbx> a(final WorkerParameters workerParameters) {
        try {
            this.a.a().f(ckhc.OFFLINE_SERVICE);
            this.b.b();
            dehn<bbx> c = this.g.c(new Callable(this, workerParameters) { // from class: awkd
                private final awkh a;
                private final WorkerParameters b;

                {
                    this.a = this;
                    this.b = workerParameters;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.b(this.b);
                }
            });
            c.Pk(new Runnable(this) { // from class: awke
                private final awkh a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.a().g(ckhc.OFFLINE_SERVICE);
                }
            }, this.g);
            c.Pk(new Runnable(this) { // from class: awkf
                private final awkh a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b.e();
                }
            }, this.h);
            return c;
        } catch (RuntimeException e) {
            this.f.a().b(15, e);
            return deha.a(bbx.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ bbx b(WorkerParameters workerParameters) {
        avjy bK;
        try {
            dbsg r = dcbg.b(workerParameters.c).r(new dbsl() { // from class: awkg
                private final String a = "OfflineAutoUpdateService";

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    return this.a.equals((String) obj);
                }
            });
            if (!r.a()) {
                return bbx.c();
            }
            r.b();
            avjo a = this.c.a();
            if (!a.f((String) r.b())) {
                r.b();
                return bbx.c();
            }
            bbp bbpVar = workerParameters.b;
            avjr bZ = avjy.l.bZ();
            if (bbpVar == null) {
                bK = bZ.bK();
            } else {
                avjz.b(bbpVar.c("options"), bZ);
                if (bbpVar.e("locationRequired", Boolean.class)) {
                    boolean n = bbpVar.n("locationRequired");
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    avjy avjyVar = (avjy) bZ.b;
                    avjyVar.a |= 1;
                    avjyVar.b = n;
                }
                if (bbpVar.e("connectivityRequired", Boolean.class)) {
                    boolean n2 = bbpVar.n("connectivityRequired");
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    avjy avjyVar2 = (avjy) bZ.b;
                    avjyVar2.a |= 2;
                    avjyVar2.c = n2;
                }
                if (bbpVar.e("batteryCheckRequired", Boolean.class)) {
                    boolean n3 = bbpVar.n("batteryCheckRequired");
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    avjy avjyVar3 = (avjy) bZ.b;
                    avjyVar3.a |= 4;
                    avjyVar3.d = n3;
                }
                if (bbpVar.e("batteryCheckType", Integer.class)) {
                    avjq g = avjz.g(bbpVar.b("batteryCheckType", 0));
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    avjy avjyVar4 = (avjy) bZ.b;
                    avjyVar4.e = g.d;
                    avjyVar4.a |= 8;
                }
                if (bbpVar.e("intervalCheckType", Integer.class)) {
                    avjt e = avjz.e(bbpVar.b("intervalCheckType", 0));
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    avjy avjyVar5 = (avjy) bZ.b;
                    avjyVar5.f = e.d;
                    avjyVar5.a |= 16;
                }
                if (bbpVar.e("screenCheckType", Integer.class)) {
                    avjv f = avjz.f(bbpVar.b("screenCheckType", 0));
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    avjy avjyVar6 = (avjy) bZ.b;
                    avjyVar6.g = f.d;
                    avjyVar6.a |= 32;
                }
                if (bbpVar.e("timeBudget", Integer.class)) {
                    avjx d = avjz.d(bbpVar.b("timeBudget", 0));
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    avjy avjyVar7 = (avjy) bZ.b;
                    avjyVar7.j = d.d;
                    avjyVar7.a |= 256;
                }
                if (bbpVar.e("idx", Integer.class)) {
                    int b = bbpVar.b("idx", 0);
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    avjy avjyVar8 = (avjy) bZ.b;
                    avjyVar8.a |= 64;
                    avjyVar8.h = b;
                }
                if (bbpVar.e("policyId", String.class)) {
                    String c = bbpVar.c("policyId");
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    avjy avjyVar9 = (avjy) bZ.b;
                    c.getClass();
                    avjyVar9.a |= 128;
                    avjyVar9.i = c;
                }
                bK = bZ.bK();
            }
            avjy avjyVar10 = bK;
            a.g(avjyVar10);
            this.e.a().A();
            dehn<avjg> a2 = this.d.a().a(avjyVar10);
            if (a2 == null) {
                bbx b2 = bbx.b();
                this.e.a().B();
                return b2;
            }
            try {
                try {
                    if (a.h(avjyVar10, a2.get(3L, TimeUnit.MINUTES)) == 1) {
                        bbx b3 = bbx.b();
                        this.e.a().B();
                        return b3;
                    }
                    bbx a3 = bbx.a();
                    this.e.a().B();
                    return a3;
                } catch (InterruptedException | CancellationException | ExecutionException unused) {
                    bbx c2 = bbx.c();
                    this.e.a().B();
                    return c2;
                }
            } catch (TimeoutException unused2) {
                bbx b4 = bbx.b();
                this.e.a().B();
                return b4;
            }
        } catch (RuntimeException e2) {
            this.f.a().b(15, e2);
            return bbx.c();
        }
    }
}
