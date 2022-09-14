package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: yuw  reason: default package */
/* loaded from: classes7.dex */
public class yuw {
    public final akpm a;
    private final gll b;

    public yuw(akpm akpmVar, gll gllVar) {
        this.a = akpmVar;
        this.b = gllVar;
    }

    public final void a(yvn yvnVar) {
        akqq akqqVar;
        if ((yvnVar.c().a & 4) != 0) {
            dpum dpumVar = yvnVar.c().d;
            if (dpumVar == null) {
                dpumVar = dpum.d;
            }
            akqqVar = akqq.f(dpumVar);
        } else {
            akqqVar = null;
        }
        if (akqqVar == null) {
            return;
        }
        akzh l = this.a.l();
        float k = l.k();
        akqs b = b();
        if (k > 17.0f && (b == null || !b.b(akqqVar))) {
            k = 15.0f;
        }
        this.a.p(akyt.k(akqqVar, k, l.p().n));
    }

    @dzsi
    public final akqs b() {
        alrh ak = this.a.ak();
        if (ak == null) {
            return null;
        }
        Rect e = this.b.e();
        akqq a = ak.a(new Point(e.left, e.bottom));
        akqq a2 = ak.a(new Point(e.right, e.top));
        if (a == null || a2 == null) {
            return null;
        }
        akqr a3 = akqs.a();
        a3.d(a);
        a3.d(a2);
        return a3.b();
    }
}
