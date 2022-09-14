package defpackage;
/* compiled from: PG */
/* renamed from: tof  reason: default package */
/* loaded from: classes7.dex */
public abstract class tof {
    public abstract dcep<tnz> a();

    public abstract dcep<tob> b();

    public abstract dcep<drsm> c();

    public abstract tog d();

    public abstract void e(dcep<tnz> dcepVar);

    public abstract void f(dcep<tob> dcepVar);

    public abstract void g(dcep<drsm> dcepVar);

    public final void h(final tnz tnzVar, boolean z) {
        dcep<tnz> K;
        if (z) {
            dcen N = dcep.N();
            N.i(a());
            N.b(tnzVar);
            K = N.f();
        } else {
            K = dcep.K(dbze.a(a(), new dbsl(tnzVar) { // from class: toe
                private final tnz a;

                {
                    this.a = tnzVar;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    return ((tnz) obj) != this.a;
                }
            }));
        }
        e(K);
    }

    public final void i(final tob tobVar, boolean z) {
        dcep<tob> K;
        if (z) {
            dcen N = dcep.N();
            N.i(b());
            N.b(tobVar);
            K = N.f();
        } else {
            K = dcep.K(dbze.a(b(), new dbsl(tobVar) { // from class: toc
                private final tob a;

                {
                    this.a = tobVar;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    return ((tob) obj) != this.a;
                }
            }));
        }
        f(K);
    }
}
