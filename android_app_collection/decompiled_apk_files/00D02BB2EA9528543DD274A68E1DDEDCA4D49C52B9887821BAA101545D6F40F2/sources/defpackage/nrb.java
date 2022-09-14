package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: nrb  reason: default package */
/* loaded from: classes7.dex */
public abstract class nrb {
    protected abstract nrc a();

    public abstract void b(cqss cqssVar);

    public abstract void c(cqjb<? extends cqkp, cqss> cqjbVar);

    public abstract void d(cqlc<? extends cqkp, cqss> cqlcVar);

    protected abstract void e(cqtv cqtvVar);

    public abstract void f(float f);

    public abstract void g(cqtv cqtvVar);

    public abstract void h(dbsg<? extends cqtv> dbsgVar);

    public abstract void i(cqtv cqtvVar);

    public abstract void j(dbsg<? extends cqtv> dbsgVar);

    protected abstract void k(cqtv cqtvVar);

    public abstract void l(TextUtils.TruncateAt truncateAt);

    public final <T extends cqkp> cqmn<T> m() {
        nrc a = a();
        dbsk.m(a.e().a() || a.f().a() || a.g().a(), "Either a color, a color callback, or a color VmFunction must be specified");
        cqtv c = a.c();
        cqtv f = cqsg.f(c, Float.valueOf(0.5f));
        return cqmn.a(cqgr.fe(a.a()), cqgr.fh(a.b()), cqgr.aZ(false), cqgr.co(c, false), cqgr.dU(nre.y(f, a.h())), cqgr.dB(nre.y(f, a.i())), (cqnf) a.g().h(nra.a).d(a.f().h(nqz.a)).d(a.e().h(nqy.a)).b(), cqgr.ar(a.j()), cqgr.cj(Float.valueOf(a.d())));
    }

    public final void n(cqtv cqtvVar, cqtv cqtvVar2) {
        k(cqtvVar);
        e(cqtvVar2);
    }
}
