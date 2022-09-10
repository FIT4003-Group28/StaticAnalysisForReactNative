package defpackage;
/* compiled from: PG */
/* renamed from: btul  reason: default package */
/* loaded from: classes4.dex */
public final class btul {
    public static dwir a(dwir dwirVar) {
        dnqh dnqhVar = dwirVar.s;
        if (dnqhVar == null) {
            dnqhVar = dnqh.p;
        }
        dsqp dsqpVar = (dsqp) dnqhVar.cu(5);
        dsqpVar.bC(dnqhVar);
        dnqg dnqgVar = (dnqg) dsqpVar;
        if (dnqgVar.c) {
            dnqgVar.bF();
            dnqgVar.c = false;
        }
        dnqh dnqhVar2 = (dnqh) dnqgVar.b;
        dnqhVar2.a |= 2048;
        dnqhVar2.j = true;
        dsqp dsqpVar2 = (dsqp) dwirVar.cu(5);
        dsqpVar2.bC(dwirVar);
        dwim dwimVar = (dwim) dsqpVar2;
        if (dwimVar.c) {
            dwimVar.bF();
            dwimVar.c = false;
        }
        dwir dwirVar2 = (dwir) dwimVar.b;
        dnqh bK = dnqgVar.bK();
        bK.getClass();
        dwirVar2.s = bK;
        dwirVar2.a |= 33554432;
        return dwimVar.bK();
    }

    public static void b(dssj dssjVar, cjqy cjqyVar) {
        cjqyVar.p(dvnp.SEARCH, ((dwiv) dssjVar).q, null);
    }

    public static void c(cqat cqatVar, dcdc<dtaq> dcdcVar, dssj dssjVar, dssj dssjVar2, cjqy cjqyVar) {
        if (!(dssjVar instanceof dwir) || !(dssjVar2 instanceof dwiv)) {
            return;
        }
        dwiv dwivVar = (dwiv) dssjVar2;
        if ((dwivVar.a & 131072) != 0) {
            dnqh dnqhVar = ((dwir) dssjVar).s;
            if (dnqhVar == null) {
                dnqhVar = dnqh.p;
            }
            dsqp dsqpVar = (dsqp) dnqhVar.cu(5);
            dsqpVar.bC(dnqhVar);
            dnqg dnqgVar = (dnqg) dsqpVar;
            String str = dwivVar.q;
            if (dnqgVar.c) {
                dnqgVar.bF();
                dnqgVar.c = false;
            }
            dnqh dnqhVar2 = (dnqh) dnqgVar.b;
            str.getClass();
            dnqhVar2.a |= 1;
            dnqhVar2.b = str;
            dsqw dsqwVar = (dsqw) dssjVar;
            dsqp dsqpVar2 = (dsqp) dsqwVar.cu(5);
            dsqpVar2.bC(dsqwVar);
            dwim dwimVar = (dwim) dsqpVar2;
            if (dwimVar.c) {
                dwimVar.bF();
                dwimVar.c = false;
            }
            dwir dwirVar = (dwir) dwimVar.b;
            dnqh bK = dnqgVar.bK();
            bK.getClass();
            dwirVar.s = bK;
            dwirVar.a |= 33554432;
            dssjVar = dwimVar.bK();
        }
        cjqyVar.u(new avtw(cqatVar, dcdcVar, (dwir) dssjVar, dwivVar));
    }
}
