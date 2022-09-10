package defpackage;
/* compiled from: PG */
/* renamed from: cbsg  reason: default package */
/* loaded from: classes4.dex */
public final class cbsg {
    public final buyl a;
    private final buyc b;

    public cbsg(buyc buycVar, buyl buylVar) {
        this.b = buycVar;
        this.a = buylVar;
    }

    public static <I, O> btzi<I, O> b(String str) {
        return new cbsf();
    }

    public final void a(Iterable<djtf> iterable, cbtv cbtvVar) {
        cbtx cbtxVar = cbtvVar.c;
        if (cbtxVar == null) {
            cbtxVar = cbtx.c;
        }
        String str = cbtxVar.b;
        akqi b = akqi.b(cbtvVar.e);
        djtg bZ = djth.b.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djth djthVar = (djth) bZ.b;
        dsrj<djtf> dsrjVar = djthVar.a;
        if (!dsrjVar.a()) {
            djthVar.a = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, djthVar.a);
        djth bK = bZ.bK();
        djtb bZ2 = djti.f.bZ();
        dpsm bZ3 = dpsn.d.bZ();
        long j = b.b;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dpsn dpsnVar = (dpsn) bZ3.b;
        int i = dpsnVar.a | 1;
        dpsnVar.a = i;
        dpsnVar.b = j;
        long j2 = b.c;
        dpsnVar.a = i | 2;
        dpsnVar.c = j2;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        djti djtiVar = (djti) bZ2.b;
        dpsn bK2 = bZ3.bK();
        bK2.getClass();
        djtiVar.d = bK2;
        djtiVar.a |= 1;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        djti djtiVar2 = (djti) bZ2.b;
        str.getClass();
        djtiVar2.a |= 2;
        djtiVar2.e = str;
        bK.getClass();
        djtiVar2.c = bK;
        djtiVar2.b = 4;
        this.b.b(bZ2.bK(), b("Failed to submit review feedback answers"), dege.a);
    }
}
