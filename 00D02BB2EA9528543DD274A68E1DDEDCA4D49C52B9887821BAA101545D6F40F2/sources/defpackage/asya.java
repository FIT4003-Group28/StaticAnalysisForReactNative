package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: asya  reason: default package */
/* loaded from: classes2.dex */
public final class asya {
    private final Activity a;
    private final dxio<ascb> b;
    private final btrm c;
    private final gfq d;
    private final cjqy e;

    public asya(Activity activity, dxio<ascb> dxioVar, btrm btrmVar, gfq gfqVar, cjqy cjqyVar) {
        this.a = activity;
        this.b = dxioVar;
        this.c = btrmVar;
        this.d = gfqVar;
        this.e = cjqyVar;
    }

    public final void a(ges gesVar, dpjx dpjxVar) {
        int i = dpjxVar.a;
        if ((i & 4) != 0) {
            c(gesVar, amvh.M(dpjxVar, this.a));
        } else if ((i & 1) == 0) {
        } else {
            b(dpjxVar.b);
        }
    }

    public final void b(String str) {
        astd s = aste.s();
        assw asswVar = (assw) s;
        asswVar.a = cjqg.b(this.e);
        asswVar.b = str;
        s.d(str);
        s.f(dtxp.ay);
        this.b.a().l(s.a());
    }

    public final void c(ges gesVar, amvh amvhVar) {
        if (this.d.e(gesVar.getClass())) {
            gfq.k(gesVar);
        } else {
            this.d.c();
        }
        this.c.b(new crhz(amvhVar));
    }
}
