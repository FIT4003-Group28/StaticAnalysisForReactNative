package defpackage;
/* compiled from: PG */
/* renamed from: bpsj  reason: default package */
/* loaded from: classes4.dex */
public final class bpsj {
    private final akzh a;

    public bpsj(akzh akzhVar) {
        this.a = akzhVar;
    }

    public final dbsg<akqq> a(akqq akqqVar, akqq akqqVar2) {
        akzh b = bnuq.b() ? this.a : this.a.b();
        int[] n = akyx.n(b, akra.f(akqqVar));
        int[] n2 = akyx.n(b, akra.f(akqqVar2));
        if (n == null || n2 == null) {
            return dbpy.a;
        }
        akse akseVar = new akse(n[0] - n2[0], n[1] - n2[1]);
        akse.o(akseVar, akseVar);
        akseVar.q(b.B() * 42.0f);
        akra s = akyx.s(b, n[0] + akseVar.b, n[1] + akseVar.c, new float[8]);
        return s == null ? dbpy.a : dbsg.i(s.S());
    }
}
