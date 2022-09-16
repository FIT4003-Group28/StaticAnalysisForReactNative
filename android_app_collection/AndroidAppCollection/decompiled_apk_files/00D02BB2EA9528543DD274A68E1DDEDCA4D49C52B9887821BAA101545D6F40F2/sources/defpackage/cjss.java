package defpackage;
/* compiled from: PG */
/* renamed from: cjss  reason: default package */
/* loaded from: classes4.dex */
public final class cjss {
    private static final dcqe a = dcqe.c("cjss");
    private static final cjso b = new cjso();

    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ddet a(defpackage.dnpo r11) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjss.a(dnpo):ddet");
    }

    public static dbsg<deak> b(dnpo dnpoVar, dnpd dnpdVar) {
        for (dnpb dnpbVar : dnpoVar.s) {
            dnpd b2 = dnpd.b(dnpbVar.c);
            if (b2 == null) {
                b2 = dnpd.UNKNOWN_LABEL_CONTENT_LOCATION;
                continue;
            }
            if (b2 == dnpdVar) {
                return dbsg.i(cjsl.b(dnpbVar));
            }
        }
        return dbpy.a;
    }

    public static deap c(dnpo dnpoVar) {
        ddet a2 = a(dnpoVar);
        deao bZ = deap.d.bZ();
        dean deanVar = a2.d;
        if (deanVar == null) {
            deanVar = dean.p;
        }
        dsrh<dpkj> dsrhVar = new dsrh(deanVar.b, dean.c);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deap deapVar = (deap) bZ.b;
        dsrf dsrfVar = deapVar.b;
        if (!dsrfVar.a()) {
            deapVar.b = dsqw.cg(dsrfVar);
        }
        for (dpkj dpkjVar : dsrhVar) {
            deapVar.b.h(dpkjVar.O);
        }
        dean deanVar2 = a2.d;
        if (deanVar2 == null) {
            deanVar2 = dean.p;
        }
        int i = deanVar2.l;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deap deapVar2 = (deap) bZ.b;
        deapVar2.a |= 1;
        deapVar2.c = i;
        return bZ.bK();
    }
}
