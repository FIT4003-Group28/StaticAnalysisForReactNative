package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: aahx  reason: default package */
/* loaded from: classes2.dex */
public final class aahx extends dbrh<diwb, dppl> {
    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ diwb b(dppl dpplVar) {
        throw new UnsupportedOperationException("This method has not been implemented yet.");
    }

    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ dppl c(diwb diwbVar) {
        dpum dpumVar;
        diwb diwbVar2 = diwbVar;
        dpoy bZ = dppl.m.bZ();
        String str = diwbVar2.c;
        ditt dittVar = diwbVar2.e;
        if (dittVar == null) {
            dittVar = ditt.n;
        }
        String str2 = dittVar.f;
        dppq bZ2 = dppt.e.bZ();
        dppw bZ3 = dppz.c.bZ();
        dppy dppyVar = dppy.EXPERIENCE_ENTITY_LIST_ITEM;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dppz dppzVar = (dppz) bZ3.b;
        dppzVar.b = dppyVar.e;
        dppzVar.a |= 1;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dppt dpptVar = (dppt) bZ2.b;
        dppz bK = bZ3.bK();
        bK.getClass();
        dpptVar.d = bK;
        dpptVar.a |= 1;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dppt dpptVar2 = (dppt) bZ2.b;
        str.getClass();
        dpptVar2.b = 4;
        dpptVar2.c = str;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dppl dpplVar = (dppl) bZ.b;
        dppt bK2 = bZ2.bK();
        bK2.getClass();
        dpplVar.d = bK2;
        dpplVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dppl dpplVar2 = (dppl) bZ.b;
        str2.getClass();
        dpplVar2.a |= 16;
        dpplVar2.e = str2;
        dppf bZ4 = dppi.h.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dppi dppiVar = (dppi) bZ4.b;
        str.getClass();
        dppiVar.a |= 1;
        dppiVar.b = str;
        dpuk b = dpuk.b(diwbVar2.d);
        if (b == null) {
            b = dpuk.UNKNOWN_KNOWLEDGE_ENTITY;
        }
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dppi dppiVar2 = (dppi) bZ4.b;
        dppiVar2.c = b.e;
        dppiVar2.a |= 2;
        String str3 = diwbVar2.l;
        if (!dbsj.d(str3)) {
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dppi dppiVar3 = (dppi) bZ4.b;
            str3.getClass();
            dppiVar3.a |= 16;
            dppiVar3.f = str3;
        }
        dppu bZ5 = dppv.g.bZ();
        String a = aahv.a(diwbVar2);
        if (!dbsj.d(a)) {
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dppi dppiVar4 = (dppi) bZ4.b;
            a.getClass();
            dppiVar4.a |= 8;
            dppiVar4.e = a;
        }
        ditt dittVar2 = diwbVar2.e;
        if (dittVar2 == null) {
            dittVar2 = ditt.n;
        }
        dpum dpumVar2 = null;
        if ((dittVar2.a & 1024) != 0) {
            ditt dittVar3 = diwbVar2.e;
            if (dittVar3 == null) {
                dittVar3 = ditt.n;
            }
            dpumVar = dittVar3.l;
            if (dpumVar == null) {
                dpumVar = dpum.d;
            }
        } else {
            dpumVar = null;
        }
        if (dpumVar == null) {
            ditt dittVar4 = diwbVar2.e;
            if (dittVar4 == null) {
                dittVar4 = ditt.n;
            }
            if ((dittVar4.a & 256) != 0) {
                ditt dittVar5 = diwbVar2.e;
                if (dittVar5 == null) {
                    dittVar5 = ditt.n;
                }
                dmni a2 = aknz.a(dittVar5.j);
                akqn a3 = aafr.a(a2);
                if (a3 != null) {
                    dmqi dmqiVar = a2.d;
                    if (dmqiVar == null) {
                        dmqiVar = dmqi.b;
                    }
                    if (dmqiVar.a.size() > 0) {
                        dmqi dmqiVar2 = a2.d;
                        if (dmqiVar2 == null) {
                            dmqiVar2 = dmqi.b;
                        }
                        try {
                            akrk j = a3.j(dmqiVar2.a.get(0).b, 1);
                            if (j.l() > 0) {
                                dpumVar2 = j.m(0).S().h();
                            }
                        } catch (IOException unused) {
                        }
                    }
                }
            }
        } else {
            dpumVar2 = dpumVar;
        }
        dbsk.s(dpumVar2);
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dppv dppvVar = (dppv) bZ5.b;
        dpumVar2.getClass();
        dppvVar.c = dpumVar2;
        dppvVar.a |= 2;
        String b2 = aahv.b(diwbVar2);
        if (!dbsj.d(b2)) {
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dppv dppvVar2 = (dppv) bZ5.b;
            b2.getClass();
            dppvVar2.a |= 8;
            dppvVar2.e = b2;
        }
        String c = aahv.c(diwbVar2);
        if (!dbsj.d(c)) {
            akqi b3 = akqi.b(c);
            dpsm bZ6 = dpsn.d.bZ();
            long j2 = b3.b;
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            dpsn dpsnVar = (dpsn) bZ6.b;
            int i = dpsnVar.a | 1;
            dpsnVar.a = i;
            dpsnVar.b = j2;
            long j3 = b3.c;
            dpsnVar.a = i | 2;
            dpsnVar.c = j3;
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dppv dppvVar3 = (dppv) bZ5.b;
            dpsn bK3 = bZ6.bK();
            bK3.getClass();
            dppvVar3.b = bK3;
            dppvVar3.a |= 1;
        }
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dppi dppiVar5 = (dppi) bZ4.b;
        dppv bK4 = bZ5.bK();
        bK4.getClass();
        dppiVar5.d = bK4;
        dppiVar5.a |= 4;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dppl dpplVar3 = (dppl) bZ.b;
        dppi bK5 = bZ4.bK();
        bK5.getClass();
        dpplVar3.c = bK5;
        dpplVar3.b = 12;
        return bZ.bK();
    }
}
