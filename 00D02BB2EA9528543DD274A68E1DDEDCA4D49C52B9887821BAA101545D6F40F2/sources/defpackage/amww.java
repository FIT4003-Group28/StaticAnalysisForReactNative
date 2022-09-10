package defpackage;

import androidx.work.WorkerParameters;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: amww  reason: default package */
/* loaded from: classes2.dex */
public final class amww implements irw {
    public final amwz a;
    public final ckcw b;
    public final isa c;
    private final dehp d;

    public amww(amwz amwzVar, ckcw ckcwVar, isa isaVar, dehp dehpVar) {
        this.a = amwzVar;
        this.b = ckcwVar;
        this.c = isaVar;
        this.d = dehpVar;
    }

    @Override // defpackage.irw
    public final dehn<bbx> a(final WorkerParameters workerParameters) {
        try {
            this.b.f(ckhc.FCM_SERVICE);
            dehn<bbx> c = this.d.c(new Callable(this, workerParameters) { // from class: amws
                private final amww a;
                private final WorkerParameters b;

                {
                    this.a = this;
                    this.b = workerParameters;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Object take;
                    amww amwwVar = this.a;
                    try {
                        dbsg r = dcbg.b(this.b.c).r(new dbsl() { // from class: amwu
                            private final String a = "TRACKED_TILE_PREFETCHER";

                            @Override // defpackage.dbsl
                            public final boolean a(Object obj) {
                                return this.a.equals((String) obj);
                            }
                        });
                        if (!r.a()) {
                            return bbx.c();
                        }
                        r.b();
                        amwz amwzVar = amwwVar.a;
                        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
                        amwzVar.a(new amwv(arrayBlockingQueue));
                        boolean z = false;
                        while (true) {
                            try {
                                take = arrayBlockingQueue.take();
                                break;
                            } catch (InterruptedException unused) {
                                z = true;
                            } catch (Throwable th) {
                                if (z) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th;
                            }
                        }
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        return ((Boolean) take).booleanValue() ? bbx.a() : bbx.b();
                    } catch (RuntimeException e) {
                        amwwVar.c.b(20, e);
                        return bbx.c();
                    }
                }
            });
            c.Pk(new Runnable(this) { // from class: amwt
                private final amww a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b.g(ckhc.FCM_SERVICE);
                }
            }, dege.a);
            return c;
        } catch (RuntimeException e) {
            this.c.b(20, e);
            return deha.a(bbx.c());
        }
    }
}
