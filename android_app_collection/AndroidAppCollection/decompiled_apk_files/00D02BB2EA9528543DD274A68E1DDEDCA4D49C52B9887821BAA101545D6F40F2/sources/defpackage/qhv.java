package defpackage;
/* compiled from: PG */
/* renamed from: qhv  reason: default package */
/* loaded from: classes7.dex */
public final class qhv {
    public static final qhu a(amuk amukVar, dott dottVar) {
        dbsk.a(amsr.f(dottVar));
        qhf qhfVar = new qhf();
        qhfVar.g = dbpy.a;
        dnoh dnohVar = dottVar.c;
        if (dnohVar == null) {
            dnohVar = dnoh.d;
        }
        qhfVar.a = akqq.e(dnohVar);
        dqdk dqdkVar = dottVar.d;
        if (dqdkVar == null) {
            dqdkVar = dqdk.e;
        }
        dplx dplxVar = dqdkVar.b;
        if (dplxVar == null) {
            dplxVar = dplx.g;
        }
        qhfVar.b = bvrq.a(dplxVar);
        qhfVar.c = amukVar;
        qhfVar.g = dbsg.i(dottVar.b);
        int i = dottVar.a;
        if ((i & 64) != 0) {
            qhfVar.e = dottVar.e;
        }
        if ((i & 256) != 0) {
            dotr dotrVar = dottVar.g;
            if (dotrVar == null) {
                dotrVar = dotr.c;
            }
            dowb dowbVar = dotrVar.b;
            if (dowbVar == null) {
                dowbVar = dowb.d;
            }
            dotr dotrVar2 = dottVar.g;
            if (dotrVar2 == null) {
                dotrVar2 = dotr.c;
            }
            qhfVar.f = new qhh(dowbVar, dotrVar2.a);
        }
        if ((dottVar.a & 128) != 0) {
            douj doujVar = dottVar.f;
            if (doujVar == null) {
                doujVar = douj.h;
            }
            String str = alca.l(doujVar).a;
            if (str != null) {
                qhfVar.d = str;
            }
        }
        String str2 = qhfVar.a == null ? " location" : "";
        if (qhfVar.b == null) {
            str2 = str2.concat(" intent");
        }
        if (qhfVar.c == null) {
            str2 = String.valueOf(str2).concat(" provider");
        }
        if (!str2.isEmpty()) {
            String valueOf = String.valueOf(str2);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new qhg(qhfVar.a, qhfVar.b, qhfVar.c, qhfVar.d, qhfVar.e, qhfVar.f, qhfVar.g);
    }
}
