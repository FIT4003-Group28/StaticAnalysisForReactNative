package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bqyy  reason: default package */
/* loaded from: classes4.dex */
public final class bqyy implements axub {
    public dzsj<brba> a;
    public cjqy b;
    private final bqyz c;

    public bqyy(Activity activity, bqyz bqyzVar) {
        this.c = bqyzVar;
        ((bqyx) btsq.c(bqyx.class, activity)).xy(this);
        dbsk.s(this.a);
        dbsk.s(this.b);
    }

    private final void c(ddfv ddfvVar) {
        cjqy cjqyVar = this.b;
        cjsx i = cjsy.i();
        i.b(ddfvVar);
        cjqyVar.k(i.a());
    }

    @Override // defpackage.axub
    public final void a(@dzsi azvc azvcVar) {
        brln c = this.c.b().c();
        if (c != null) {
            c.e = new brlu();
            dwir b = c.b();
            dsqp dsqpVar = (dsqp) b.cu(5);
            dsqpVar.bC(b);
            this.a.a().m((dwim) dsqpVar, null);
            c(this.c.c());
        }
    }

    @Override // defpackage.axub
    public final void b() {
        c(this.c.d());
    }
}
