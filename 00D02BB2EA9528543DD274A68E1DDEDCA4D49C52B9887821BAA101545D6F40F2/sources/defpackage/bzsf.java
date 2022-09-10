package defpackage;

import androidx.work.WorkerParameters;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bzsf  reason: default package */
/* loaded from: classes4.dex */
public final class bzsf implements irw {
    public final bttf a;
    public final bztp b;
    public final ckcw c;
    public final bzsa d;
    public final isa e;
    public final gdo f;
    private final dehp g;
    private final Executor h;

    public bzsf(bttf bttfVar, bztp bztpVar, ckcw ckcwVar, bzsa bzsaVar, isa isaVar, gdo gdoVar, dehp dehpVar, Executor executor) {
        this.a = bttfVar;
        this.b = bztpVar;
        this.c = ckcwVar;
        this.d = bzsaVar;
        this.e = isaVar;
        this.f = gdoVar;
        this.g = dehpVar;
        this.h = executor;
    }

    @Override // defpackage.irw
    public final dehn<bbx> a(final WorkerParameters workerParameters) {
        try {
            this.c.f(ckhc.PHOTO_METADATA_DATABASE_SCHEDULED_CLEANER_SERVICE);
            this.f.b();
            dehn<bbx> c = this.g.c(new Callable(this, workerParameters) { // from class: bzsb
                private final bzsf a;
                private final WorkerParameters b;

                {
                    this.a = this;
                    this.b = workerParameters;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    bzsf bzsfVar = this.a;
                    WorkerParameters workerParameters2 = this.b;
                    try {
                        if (!((List) deha.s(bzsfVar.b.c(new bztm[0]))).isEmpty()) {
                            dbsg r = dcbg.b(workerParameters2.c).r(new dbsl() { // from class: bzse
                                private final String a = "CLEAN_PHOTO_DATABASE";

                                @Override // defpackage.dbsl
                                public final boolean a(Object obj) {
                                    return this.a.equals((String) obj);
                                }
                            });
                            if (!r.a()) {
                                ((ckco) bzsfVar.c.a(ckdz.K)).a(ckdt.a(3));
                                return bbx.c();
                            }
                            r.b();
                            if (!bzsfVar.a.b()) {
                                ((ckco) bzsfVar.c.a(ckdz.K)).a(ckdt.a(4));
                                return bbx.c();
                            }
                            boolean isEmpty = ((List) deha.s(bzsfVar.b.c(new bztm[0]))).isEmpty();
                            ((ckco) bzsfVar.c.a(ckdz.K)).a(ckdt.a(2));
                            if (isEmpty) {
                                bzsa bzsaVar = bzsfVar.d;
                                try {
                                    bzsaVar.a.c("CLEAN_PHOTO_DATABASE");
                                } catch (RuntimeException e) {
                                    bzsaVar.c.a(19, e);
                                }
                            }
                            return bbx.a();
                        }
                        return bbx.c();
                    } catch (RuntimeException e2) {
                        bzsfVar.e.b(19, e2);
                        return bbx.c();
                    }
                }
            });
            c.Pk(new Runnable(this) { // from class: bzsc
                private final bzsf a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.c.g(ckhc.PHOTO_METADATA_DATABASE_SCHEDULED_CLEANER_SERVICE);
                }
            }, this.g);
            c.Pk(new Runnable(this) { // from class: bzsd
                private final bzsf a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.f.e();
                }
            }, this.h);
            return c;
        } catch (RuntimeException e) {
            this.e.b(19, e);
            return deha.a(bbx.c());
        }
    }
}
