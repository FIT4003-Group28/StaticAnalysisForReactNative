package defpackage;
/* compiled from: PG */
/* renamed from: ddt  reason: default package */
/* loaded from: classes6.dex */
public final class ddt<T> extends btrh<T> {
    public ddt(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        dad h;
        ddr ddrVar = (ddr) this.a;
        bvkb bvkbVar = (bvkb) obj;
        synchronized (ddrVar.l) {
            czv czvVar = ddrVar.n;
            h = czvVar != null ? czvVar.a().h() : null;
        }
        if (h != null) {
            double c = h.c();
            akqq f = h.f();
            alaa a = alad.a();
            a.c(f);
            a.c = 17.0f;
            a.e = (float) c;
            akyc e = akyt.e(a.a());
            e.b = 1000;
            ddrVar.f.q(e, new ddq(ddrVar));
        }
        ddrVar.h.a(ddrVar);
    }
}
