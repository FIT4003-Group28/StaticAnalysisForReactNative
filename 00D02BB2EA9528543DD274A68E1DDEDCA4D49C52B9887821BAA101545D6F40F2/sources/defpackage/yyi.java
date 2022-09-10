package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: yyi  reason: default package */
/* loaded from: classes7.dex */
public final class yyi implements axub {
    public dzsj<qbt> a;
    public cjqy b;
    private final yyj c;

    public yyi(Activity activity, yyj yyjVar) {
        this.c = yyjVar;
        ((yyr) btsq.c(yyr.class, activity)).wH(this);
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
        qcw x = qcx.x();
        x.r(this.c.b());
        x.b(this.c.c());
        x.s(this.c.d());
        x.w(this.c.e().e((dssr) dwao.R.cu(7), dwao.R));
        x.k(this.c.f());
        x.j(true);
        x.c(this.c.g());
        this.a.a().m(x.a());
        c(this.c.h());
    }

    @Override // defpackage.axub
    public final void b() {
        c(this.c.i());
    }
}
