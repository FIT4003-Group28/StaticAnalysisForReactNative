package defpackage;

import android.view.ViewGroup;
import java.util.concurrent.ScheduledFuture;
/* compiled from: PG */
/* renamed from: dgb  reason: default package */
/* loaded from: classes6.dex */
public final class dgb {
    private static final dcqe c = dcqe.c("dgb");
    public final dgs a;
    public boolean b;
    private final dehq d;
    private final dgd e;
    private final ViewGroup f;
    private final dfy g;
    @dzsi
    private ScheduledFuture<?> h;
    private boolean i;

    public dgb(dehq dehqVar, ViewGroup viewGroup, ViewGroup viewGroup2, dfy dfyVar) {
        dgs dgsVar = new dgs(viewGroup2, dfyVar, bvlo.a());
        dgd dgdVar = new dgd(dgsVar, viewGroup, dfyVar);
        this.h = null;
        this.i = false;
        this.b = false;
        this.d = dehqVar;
        this.f = viewGroup2;
        this.a = dgsVar;
        this.e = dgdVar;
        this.g = dfyVar;
    }

    private final void g() {
        ScheduledFuture<?> scheduledFuture = this.h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.h = null;
    }

    public final void a() {
        if (this.b) {
            return;
        }
        this.a.a();
        g();
        this.b = true;
    }

    public final void b(boolean z) {
        if (this.i == z) {
            return;
        }
        this.i = z;
        if (c()) {
            this.e.g.b();
        } else if (this.b) {
        } else {
            g();
            this.a.a();
        }
    }

    public final boolean c() {
        return !this.b && this.i && this.f.getVisibility() == 0;
    }

    public final void d(String str) {
        if (!this.g.a().h) {
            bvoo.h("Calling setHintText() but %s is configured *not* to show the hint text", this.g.a());
        }
        this.a.e.a.setText(str);
    }

    public final void e(boolean z) {
        dgi dgiVar = this.a.e;
        if (dgiVar.k == z) {
            return;
        }
        dgiVar.k = z;
        dgiVar.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0270, code lost:
        if (r13.g.c() != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x02a1, code lost:
        if (r2.c() != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x02c0, code lost:
        if (r5.a == 3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02cf, code lost:
        if (r13.p.a < r13.k.centerX()) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02d1, code lost:
        r2 = 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(float r12, int r13, float r14, float r15) {
        /*
            Method dump skipped, instructions count: 1210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgb.f(float, int, float, float):void");
    }
}
