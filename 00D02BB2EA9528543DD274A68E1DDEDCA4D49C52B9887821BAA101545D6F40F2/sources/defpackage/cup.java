package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cup  reason: default package */
/* loaded from: classes5.dex */
public final class cup {
    public static final dcqe a = dcqe.c("cup");
    public final cuo b;
    private final btrm c;
    private boolean d = false;

    public cup(btrm btrmVar, dxio<amfi> dxioVar, cqat cqatVar, dxio<ckcw> dxioVar2, cjqy cjqyVar, dehq dehqVar, cvv cvvVar, dxio<akox> dxioVar3, cvj cvjVar) {
        this.c = btrmVar;
        this.b = new cuo(dxioVar, cqatVar, dxioVar2, cjqyVar, dehqVar, cvvVar, dxioVar3, cvjVar);
    }

    public final void a() {
        if (bvrj.a() != bvrj.UI_THREAD) {
            bvoo.h("startLogging() must called from UI_THREAD", new Object[0]);
        }
        final cuo cuoVar = this.b;
        if (bvrj.a() != bvrj.UI_THREAD) {
            bvoo.h("startRetryLogging must called from UI_THREAD", new Object[0]);
        }
        ScheduledFuture<?> scheduledFuture = cuoVar.e;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            cuoVar.e = cuoVar.d.f(new Runnable(cuoVar) { // from class: cuj
                private final cuo a;

                {
                    this.a = cuoVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    djie djieVar;
                    cuo cuoVar2 = this.a;
                    for (String str : cuoVar2.b.j()) {
                        if (cuoVar2.b.a(str) < 3 && (djieVar = cuoVar2.c.get(cuo.a(str))) != null) {
                            cuoVar2.c(djieVar);
                        }
                    }
                }
            }, 5L, 5L, TimeUnit.SECONDS);
        }
        if (!this.d) {
            this.d = true;
            btrm btrmVar = this.c;
            cuo cuoVar2 = this.b;
            dceq a2 = dcet.a();
            a2.b(alim.class, new cur(alim.class, cuoVar2, bvrj.UI_THREAD));
            btrmVar.g(cuoVar2, a2.a());
        }
    }

    public final void b() {
        if (bvrj.a() != bvrj.UI_THREAD) {
            bvoo.h("pauseLogging() must called from UI_THREAD", new Object[0]);
        }
        cuo cuoVar = this.b;
        if (bvrj.a() != bvrj.UI_THREAD) {
            bvoo.h("pauseRetryLogging must called from UI_THREAD", new Object[0]);
        }
        ScheduledFuture<?> scheduledFuture = cuoVar.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        if (this.d) {
            this.d = false;
            this.c.a(this.b);
        }
    }
}
