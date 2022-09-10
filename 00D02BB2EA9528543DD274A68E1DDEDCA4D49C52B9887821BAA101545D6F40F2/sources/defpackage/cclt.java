package defpackage;
/* compiled from: PG */
/* renamed from: cclt  reason: default package */
/* loaded from: classes4.dex */
public final class cclt {
    public static final dbrn<djul, ccln> a = new ccls();

    public static ccxa a(ilo iloVar) {
        dbsk.a(akqi.d(iloVar.ai()));
        dbsk.a(!iloVar.n().isEmpty());
        ccwz bZ = ccxa.f.bZ();
        String o = iloVar.ai().o();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ccxa ccxaVar = (ccxa) bZ.b;
        o.getClass();
        ccxaVar.a |= 1;
        ccxaVar.b = o;
        dcep<String> as = iloVar.as();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ccxa ccxaVar2 = (ccxa) bZ.b;
        dsrj<String> dsrjVar = ccxaVar2.c;
        if (!dsrjVar.a()) {
            ccxaVar2.c = dsqw.cl(dsrjVar);
        }
        dsod.bv(as, ccxaVar2.c);
        String n = iloVar.n();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ccxa ccxaVar3 = (ccxa) bZ.b;
        n.getClass();
        ccxaVar3.a |= 8;
        ccxaVar3.e = n;
        if (!iloVar.cG().isEmpty()) {
            String cG = iloVar.cG();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ccxa ccxaVar4 = (ccxa) bZ.b;
            cG.getClass();
            ccxaVar4.a |= 2;
            ccxaVar4.d = cG;
        }
        return bZ.bK();
    }

    public static ccln b(@dzsi djul djulVar, @dzsi djqc djqcVar) {
        cclm cclmVar;
        boolean z = true;
        if (djulVar == null && djqcVar == null) {
            z = false;
        }
        dbsk.a(z);
        if (djulVar == null) {
            cclmVar = ccln.p.bZ();
        } else {
            ccln a2 = a.a(djulVar);
            dsqp dsqpVar = (dsqp) a2.cu(5);
            dsqpVar.bC(a2);
            cclmVar = (cclm) dsqpVar;
        }
        if (djqcVar != null) {
            if (djulVar != null) {
                dbsk.m(djulVar.f.equals(djqcVar.a), "TactileOffering and RestaurantMenuItem must have matching names.");
            }
            String str = djqcVar.a;
            if (cclmVar.c) {
                cclmVar.bF();
                cclmVar.c = false;
            }
            ccln cclnVar = (ccln) cclmVar.b;
            ccln cclnVar2 = ccln.p;
            str.getClass();
            int i = cclnVar.a | 8;
            cclnVar.a = i;
            cclnVar.f = str;
            String str2 = djqcVar.b;
            str2.getClass();
            cclnVar.a = i | 64;
            cclnVar.j = str2;
            djqi djqiVar = djqcVar.c;
            if (djqiVar == null) {
                djqiVar = djqi.b;
            }
            String str3 = djqiVar.a;
            if (cclmVar.c) {
                cclmVar.bF();
                cclmVar.c = false;
            }
            ccln cclnVar3 = (ccln) cclmVar.b;
            str3.getClass();
            cclnVar3.a |= 512;
            cclnVar3.m = str3;
            dcbg s = dcbg.b(djqcVar.d).s(cclr.a);
            if (cclmVar.c) {
                cclmVar.bF();
                cclmVar.c = false;
            }
            ccln cclnVar4 = (ccln) cclmVar.b;
            dsrj<cclv> dsrjVar = cclnVar4.n;
            if (!dsrjVar.a()) {
                cclnVar4.n = dsqw.cl(dsrjVar);
            }
            dsod.bv(s, cclnVar4.n);
        }
        return cclmVar.bK();
    }
}
