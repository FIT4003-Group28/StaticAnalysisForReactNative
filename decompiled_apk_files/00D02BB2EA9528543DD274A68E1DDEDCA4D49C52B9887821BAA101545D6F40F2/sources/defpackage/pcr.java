package defpackage;

import androidx.work.WorkerParameters;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: pcr  reason: default package */
/* loaded from: classes7.dex */
public final class pcr implements irw {
    public final ckcw a;
    public final cqat b;
    public final pci c;
    public final isa d;
    public final dehp e;
    public final buss f;
    private final gdo g;
    private final Executor h;

    public pcr(ckcw ckcwVar, cqat cqatVar, buss bussVar, pci pciVar, gdo gdoVar, isa isaVar, dehp dehpVar, Executor executor) {
        this.a = ckcwVar;
        this.b = cqatVar;
        this.f = bussVar;
        this.c = pciVar;
        this.g = gdoVar;
        this.d = isaVar;
        this.e = dehpVar;
        this.h = executor;
    }

    @Override // defpackage.irw
    public final dehn<bbx> a(final WorkerParameters workerParameters) {
        try {
            this.a.f(ckhc.FCM_SERVICE);
            this.g.b();
            dehn<bbx> c = this.e.c(new Callable(this, workerParameters) { // from class: pcl
                private final pcr a;
                private final WorkerParameters b;

                {
                    this.a = this;
                    this.b = workerParameters;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    pcr pcrVar = this.a;
                    WorkerParameters workerParameters2 = this.b;
                    try {
                        dbsg r = dcbg.b(workerParameters2.c).r(new dbsl() { // from class: pcp
                            private final String a = "guns.notification.fetcher";

                            @Override // defpackage.dbsl
                            public final boolean a(Object obj) {
                                return this.a.equals((String) obj);
                            }
                        });
                        if (!r.a()) {
                            return bbx.c();
                        }
                        r.b();
                        bbp bbpVar = workerParameters2.b;
                        Object obj = bbpVar.b.get("ktf");
                        dcdc t = dcdc.t(obj instanceof String[] ? (String[]) obj : null);
                        String c2 = bbpVar.c("roid");
                        long o = bbpVar.o("st");
                        ((ckcp) pcrVar.a.a(ckht.aQ)).a(pcrVar.b.e() - o);
                        dust bZ = dusu.d.bZ();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dusu dusuVar = (dusu) bZ.b;
                        dsrj<String> dsrjVar = dusuVar.b;
                        if (!dsrjVar.a()) {
                            dusuVar.b = dsqw.cl(dsrjVar);
                        }
                        dsod.bv(t, dusuVar.b);
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dusu dusuVar2 = (dusu) bZ.b;
                        dusuVar2.a |= 1;
                        dusuVar2.c = "GMM_VIEW";
                        final deig d = deig.d();
                        final btzc b = pcrVar.f.b(bZ.bK(), new pcq(d), pcrVar.e);
                        d.Pk(new Runnable(d, b) { // from class: pco
                            private final deig a;
                            private final btzc b;

                            {
                                this.a = d;
                                this.b = b;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                deig deigVar = this.a;
                                btzc btzcVar = this.b;
                                if (deigVar.isCancelled()) {
                                    btzcVar.a();
                                }
                            }
                        }, dege.a);
                        try {
                            ((ckcp) pcrVar.a.a(ckht.aR)).a(pcrVar.b.e() - o);
                            pci pciVar = pcrVar.c;
                            dsrj<dutk> dsrjVar2 = ((dusw) d.get()).b;
                            dccx F = dcdc.F();
                            for (dutk dutkVar : dsrjVar2) {
                                dawj bZ2 = dawm.g.bZ();
                                String str = dutkVar.a;
                                if (bZ2.c) {
                                    bZ2.bF();
                                    bZ2.c = false;
                                }
                                dawm dawmVar = (dawm) bZ2.b;
                                str.getClass();
                                int i = dawmVar.a | 1;
                                dawmVar.a = i;
                                dawmVar.b = str;
                                long j = dutkVar.e;
                                dawmVar.a = i | 128;
                                dawmVar.e = j;
                                int a = dawl.a(dutkVar.b);
                                if (a == 0) {
                                    a = 1;
                                }
                                if (bZ2.c) {
                                    bZ2.bF();
                                    bZ2.c = false;
                                }
                                dawm dawmVar2 = (dawm) bZ2.b;
                                dawmVar2.d = a - 1;
                                int i2 = dawmVar2.a | 8;
                                dawmVar2.a = i2;
                                boolean z = dutkVar.d;
                                dawmVar2.a = i2 | 512;
                                dawmVar2.f = z;
                                daww dawwVar = dutkVar.c;
                                if (dawwVar == null) {
                                    dawwVar = daww.e;
                                }
                                if (bZ2.c) {
                                    bZ2.bF();
                                    bZ2.c = false;
                                }
                                dawm dawmVar3 = (dawm) bZ2.b;
                                dawwVar.getClass();
                                dawmVar3.c = dawwVar;
                                dawmVar3.a |= 4;
                                F.g(bZ2.bK());
                            }
                            pciVar.b(F.f(), c2);
                            return bbx.a();
                        } catch (InterruptedException | ExecutionException unused) {
                            ((ckcn) pcrVar.a.a(ckht.aS)).a();
                            return bbx.c();
                        }
                    } catch (RuntimeException e) {
                        pcrVar.d.b(9, e);
                        return bbx.c();
                    }
                }
            });
            c.Pk(new Runnable(this) { // from class: pcm
                private final pcr a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.g(ckhc.FCM_SERVICE);
                }
            }, this.e);
            final gdo gdoVar = this.g;
            gdoVar.getClass();
            c.Pk(new Runnable(gdoVar) { // from class: pcn
                private final gdo a;

                {
                    this.a = gdoVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.e();
                }
            }, this.h);
            return c;
        } catch (RuntimeException e) {
            this.d.b(9, e);
            return deha.a(bbx.c());
        }
    }
}
