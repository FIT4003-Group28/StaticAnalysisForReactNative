package defpackage;
/* compiled from: PG */
/* renamed from: bgqn  reason: default package */
/* loaded from: classes3.dex */
public final class bgqn implements cjqo {
    private final btvo a;
    private final dbty<bwrs<ilo>> b;

    public bgqn(btvo btvoVar, dbty<bwrs<ilo>> dbtyVar) {
        this.a = btvoVar;
        this.b = dbtyVar;
    }

    private static void b(ddeo ddeoVar, dcvs dcvsVar) {
        int b = dcvsVar.f().b();
        if (ddeoVar.c) {
            ddeoVar.bF();
            ddeoVar.c = false;
        }
        ddep ddepVar = (ddep) ddeoVar.b;
        ddep ddepVar2 = ddep.f;
        ddepVar.a |= 4;
        ddepVar.d = b;
        int b2 = dcvsVar.h().b();
        if (ddeoVar.c) {
            ddeoVar.bF();
            ddeoVar.c = false;
        }
        ddep ddepVar3 = (ddep) ddeoVar.b;
        ddepVar3.a |= 8;
        ddepVar3.e = b2;
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ cjtd a(cjtd cjtdVar) {
        ilo iloVar;
        ddet bK;
        ddet bK2;
        cjtd cjtdVar2 = cjtdVar;
        if ((this.a.getPlaceSheetParameters().Q() || this.a.getPlaceSheetParameters().R()) && (iloVar = (ilo) bwrs.b(this.b.a())) != null && !cjtdVar2.equals(cjtd.b)) {
            cjta c = cjtd.c(cjtdVar2);
            akqi ai = iloVar.ai();
            decs a = decs.a(ai.c);
            if (a.a != 0 && !ai.equals(akqi.a)) {
                if (cjtdVar2.i == null && this.a.getPlaceSheetParameters().Q()) {
                    c.g = a;
                }
                if (this.a.getPlaceSheetParameters().R()) {
                    ddet e = c.e();
                    if (e == null) {
                        ddeo bZ = ddep.f.bZ();
                        dtbk g = ai.g();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        ddep ddepVar = (ddep) bZ.b;
                        g.getClass();
                        ddepVar.b = g;
                        ddepVar.a |= 1;
                        ddep bK3 = bZ.bK();
                        ddes bZ2 = ddet.D.bZ();
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        ddet ddetVar = (ddet) bZ2.b;
                        bK3.getClass();
                        ddetVar.c = bK3;
                        ddetVar.a |= 1;
                        bK2 = bZ2.bK();
                    } else {
                        ddep ddepVar2 = e.c;
                        if (ddepVar2 == null) {
                            ddepVar2 = ddep.f;
                        }
                        if ((ddepVar2.a & 1) == 0) {
                            ddep ddepVar3 = e.c;
                            if (ddepVar3 == null) {
                                ddepVar3 = ddep.f;
                            }
                            dsqp dsqpVar = (dsqp) ddepVar3.cu(5);
                            dsqpVar.bC(ddepVar3);
                            ddeo ddeoVar = (ddeo) dsqpVar;
                            dtbk g2 = ai.g();
                            if (ddeoVar.c) {
                                ddeoVar.bF();
                                ddeoVar.c = false;
                            }
                            ddep ddepVar4 = (ddep) ddeoVar.b;
                            g2.getClass();
                            ddepVar4.b = g2;
                            ddepVar4.a |= 1;
                            ddep bK4 = ddeoVar.bK();
                            dsqp dsqpVar2 = (dsqp) e.cu(5);
                            dsqpVar2.bC(e);
                            ddes ddesVar = (ddes) dsqpVar2;
                            if (ddesVar.c) {
                                ddesVar.bF();
                                ddesVar.c = false;
                            }
                            ddet ddetVar2 = (ddet) ddesVar.b;
                            bK4.getClass();
                            ddetVar2.c = bK4;
                            ddetVar2.a |= 1;
                            bK2 = ddesVar.bK();
                        }
                    }
                    c.s(bK2);
                }
            }
            dvxb dvxbVar = iloVar.h().V;
            if (dvxbVar == null) {
                dvxbVar = dvxb.d;
            }
            String str = dvxbVar.c;
            if (dbsj.d(cjtdVar2.d) && !dbsj.d(str)) {
                c.g(str);
            }
            if (this.a.getPlaceSheetParameters().R()) {
                dbsg h = dbsg.j(iloVar.aj()).h(bgqm.a);
                ddet e2 = c.e();
                if (e2 == null && h.a()) {
                    ddeo bZ3 = ddep.f.bZ();
                    b(bZ3, (dcvs) h.b());
                    ddes bZ4 = ddet.D.bZ();
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    ddet ddetVar3 = (ddet) bZ4.b;
                    ddep bK5 = bZ3.bK();
                    bK5.getClass();
                    ddetVar3.c = bK5;
                    ddetVar3.a |= 1;
                    bK = bZ4.bK();
                } else if (e2 != null) {
                    ddep ddepVar5 = e2.c;
                    if (ddepVar5 == null) {
                        ddepVar5 = ddep.f;
                    }
                    if ((ddepVar5.a & 4) == 0) {
                        ddep ddepVar6 = e2.c;
                        if (ddepVar6 == null) {
                            ddepVar6 = ddep.f;
                        }
                        if ((ddepVar6.a & 8) == 0 && h.a()) {
                            dsqp dsqpVar3 = (dsqp) e2.cu(5);
                            dsqpVar3.bC(e2);
                            ddes ddesVar2 = (ddes) dsqpVar3;
                            ddep ddepVar7 = ((ddet) ddesVar2.b).c;
                            if (ddepVar7 == null) {
                                ddepVar7 = ddep.f;
                            }
                            dsqp dsqpVar4 = (dsqp) ddepVar7.cu(5);
                            dsqpVar4.bC(ddepVar7);
                            ddeo ddeoVar2 = (ddeo) dsqpVar4;
                            b(ddeoVar2, (dcvs) h.b());
                            if (ddesVar2.c) {
                                ddesVar2.bF();
                                ddesVar2.c = false;
                            }
                            ddet ddetVar4 = (ddet) ddesVar2.b;
                            ddep bK6 = ddeoVar2.bK();
                            bK6.getClass();
                            ddetVar4.c = bK6;
                            ddetVar4.a |= 1;
                            bK = ddesVar2.bK();
                        }
                    }
                }
                c.s(bK);
            }
            return c.a();
        }
        return cjtdVar2;
    }
}
