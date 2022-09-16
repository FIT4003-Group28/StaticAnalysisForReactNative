package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bxsk  reason: default package */
/* loaded from: classes4.dex */
public final class bxsk implements bxsj {
    private final Activity a;
    private final dxio<qbt> b;

    public bxsk(Activity activity, dxio<qbt> dxioVar) {
        this.a = activity;
        this.b = dxioVar;
    }

    @Override // defpackage.bxsj
    public final void a(azva azvaVar) {
        amvh a;
        Activity activity = this.a;
        dpjs g = amvj.g(azvaVar.a);
        if (g == null) {
            a = null;
        } else {
            amvg P = amvh.P();
            P.c = azvaVar.c;
            P.a = g;
            P.j = azvaVar.e(activity);
            P.d = azvaVar.e;
            P.b = azvaVar.d;
            a = P.a();
        }
        if (a != null) {
            qcw x = qcx.x();
            x.u(a);
            x.r(amvh.i(this.a));
            x.k(qbs.DEFAULT);
            this.b.a().m(x.a());
        }
    }
}
