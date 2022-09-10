package defpackage;

import com.google.android.apps.gmm.directions.routepreview.routefetching.RoutePreviewLauncherParameters;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: wbe  reason: default package */
/* loaded from: classes7.dex */
public final class wbe {
    public static final dcqe a = dcqe.c("wbe");
    public final btrm b;
    public final dzsj<srv> c;
    @dzsi
    public srv d;
    public final wbd e = new wbd(this);
    @dzsi
    public wbh f;
    private final Executor g;

    public wbe(Executor executor, btrm btrmVar, dzsj dzsjVar, wbh wbhVar) {
        bvrj.UI_THREAD.c();
        this.g = executor;
        this.b = btrmVar;
        this.c = dzsjVar;
        this.f = wbhVar;
        boolean z = true;
        if (wbhVar.a().d == 1) {
            RoutePreviewLauncherParameters a2 = wbhVar.a();
            dbsk.l(a2.d != 1 ? false : z);
            wbhVar.b(new RoutePreviewLauncherParameters(a2.a, a2.b, 2, a2.c));
        }
    }

    private final void e(Runnable runnable) {
        this.g.execute(runnable);
    }

    public final void a() {
        if (this.d != null) {
            this.d = null;
            this.b.a(this.e);
        }
    }

    public final void b() {
        bvrj.UI_THREAD.c();
        wbh wbhVar = this.f;
        if (wbhVar == null) {
            return;
        }
        wbhVar.b(wbhVar.a().a());
        d();
    }

    public final void c() {
        bvrj.UI_THREAD.c();
        wbh wbhVar = this.f;
        if (wbhVar == null) {
            return;
        }
        dbsk.l(wbhVar.a().d == 3);
        wbh wbhVar2 = this.f;
        dbsk.s(wbhVar2);
        final amte amteVar = wbhVar2.a().c;
        dbsk.s(amteVar);
        e(new Runnable(this, amteVar) { // from class: wbb
            private final wbe a;
            private final amte b;

            {
                this.a = this;
                this.b = amteVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                wbe wbeVar = this.a;
                amte amteVar2 = this.b;
                bvrj.UI_THREAD.c();
                wbh wbhVar3 = wbeVar.f;
                if (wbhVar3 == null) {
                    return;
                }
                wbhVar3.b(wbhVar3.a().a());
                wbh wbhVar4 = wbeVar.f;
                bvrj.UI_THREAD.c();
                wbhVar4.a.b.a().a(wbhVar4.a.c, amteVar2, 0, 0);
            }
        });
    }

    public final void d() {
        e(new Runnable(this) { // from class: wbc
            private final wbe a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                gn gnVar;
                wbe wbeVar = this.a;
                bvrj.UI_THREAD.c();
                wbh wbhVar = wbeVar.f;
                if (wbhVar == null || (gnVar = wbhVar.a.A) == null || gnVar.J()) {
                    return;
                }
                gnVar.e();
            }
        });
    }
}
