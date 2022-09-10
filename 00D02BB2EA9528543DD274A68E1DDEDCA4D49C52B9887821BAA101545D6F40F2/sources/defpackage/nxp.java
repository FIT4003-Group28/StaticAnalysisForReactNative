package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: nxp  reason: default package */
/* loaded from: classes7.dex */
public final class nxp extends nxn {
    private final int g;

    public nxp(bwnf bwnfVar, dtid dtidVar) {
        super(bwnfVar, dtidVar);
        int i = bwni.a(bwnfVar.a()).b;
        this.g = i;
        if (i == 1 || i == 3) {
            return;
        }
        StringBuilder sb = new StringBuilder(34);
        sb.append("moduleType:");
        sb.append(i);
        sb.append(" is invalid.");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.nxn
    public final List<cjys> a(@dzsi bwne bwneVar) {
        List<bwns> a;
        ArrayList<bwns> a2 = dchl.a();
        if (bwneVar == null) {
            a = dchl.a();
        } else {
            int i = this.g;
            if (i == 1) {
                a = bwneVar.i(this.c.h);
            } else if (i == 3) {
                a = bwneVar.j(this.c.h);
            } else {
                a = dchl.a();
            }
        }
        int i2 = 0;
        for (bwns bwnsVar : a) {
            String d = owy.d(0, i2, this.g == 1 ? dtyi.cd : dtyi.bZ);
            dtkx dtkxVar = bwnsVar.b;
            if (dtkxVar == null) {
                dtkxVar = dtkx.e;
            }
            dtku dtkuVar = dtkxVar.b;
            if (dtkuVar == null) {
                dtkuVar = dtku.p;
            }
            if ((dtkuVar.a & 1) == 0) {
                bvoo.h("setClientGeneratedVed is called though the data is not GenericItemData", new Object[0]);
            } else {
                dtkx dtkxVar2 = bwnsVar.b;
                if (dtkxVar2 == null) {
                    dtkxVar2 = dtkx.e;
                }
                dtku dtkuVar2 = dtkxVar2.b;
                if (dtkuVar2 == null) {
                    dtkuVar2 = dtku.p;
                }
                dtkf dtkfVar = dtkuVar2.b;
                if (dtkfVar == null) {
                    dtkfVar = dtkf.n;
                }
                if ((dtkfVar.a & 16) != 0) {
                    bvoo.h("setClientGeneratedVed is called though the data already have GenericItemData", new Object[0]);
                }
                dtkx dtkxVar3 = bwnsVar.b;
                if (dtkxVar3 == null) {
                    dtkxVar3 = dtkx.e;
                }
                dtku dtkuVar3 = dtkxVar3.b;
                if (dtkuVar3 == null) {
                    dtkuVar3 = dtku.p;
                }
                dtkf dtkfVar2 = dtkuVar3.b;
                if (dtkfVar2 == null) {
                    dtkfVar2 = dtkf.n;
                }
                dthb dthbVar = dtkfVar2.h;
                if (dthbVar == null) {
                    dthbVar = dthb.F;
                }
                dsqp dsqpVar = (dsqp) dthbVar.cu(5);
                dsqpVar.bC(dthbVar);
                dtha dthaVar = (dtha) dsqpVar;
                dthb dthbVar2 = (dthb) dthaVar.b;
                if ((dthbVar2.a & 1) != 0) {
                    dtov dtovVar = dthbVar2.c;
                    if (dtovVar == null) {
                        dtovVar = dtov.o;
                    }
                    dsqp dsqpVar2 = (dsqp) dtovVar.cu(5);
                    dsqpVar2.bC(dtovVar);
                    dtou dtouVar = (dtou) dsqpVar2;
                    if (dtouVar.c) {
                        dtouVar.bF();
                        dtouVar.c = false;
                    }
                    dtov dtovVar2 = (dtov) dtouVar.b;
                    d.getClass();
                    dtovVar2.a |= 8192;
                    dtovVar2.k = d;
                    if (dthaVar.c) {
                        dthaVar.bF();
                        dthaVar.c = false;
                    }
                    dthb dthbVar3 = (dthb) dthaVar.b;
                    dtov bK = dtouVar.bK();
                    bK.getClass();
                    dthbVar3.c = bK;
                    dthbVar3.a |= 1;
                }
                dtkw dtkwVar = (dtkw) dtkx.e.bZ();
                dtkt dtktVar = (dtkt) dtku.p.bZ();
                dtkx dtkxVar4 = bwnsVar.b;
                if (dtkxVar4 == null) {
                    dtkxVar4 = dtkx.e;
                }
                dtku dtkuVar4 = dtkxVar4.b;
                if (dtkuVar4 == null) {
                    dtkuVar4 = dtku.p;
                }
                dtkf dtkfVar3 = dtkuVar4.b;
                if (dtkfVar3 == null) {
                    dtkfVar3 = dtkf.n;
                }
                dsqp dsqpVar3 = (dsqp) dtkfVar3.cu(5);
                dsqpVar3.bC(dtkfVar3);
                dtke dtkeVar = (dtke) dsqpVar3;
                if (dtkeVar.c) {
                    dtkeVar.bF();
                    dtkeVar.c = false;
                }
                dtkf dtkfVar4 = (dtkf) dtkeVar.b;
                d.getClass();
                dtkfVar4.a |= 16;
                dtkfVar4.k = d;
                dthb bK2 = dthaVar.bK();
                bK2.getClass();
                dtkfVar4.h = bK2;
                dtkfVar4.a |= 2;
                dtkf dtkfVar5 = (dtkf) dtkeVar.bK();
                if (dtktVar.c) {
                    dtktVar.bF();
                    dtktVar.c = false;
                }
                dtku dtkuVar5 = (dtku) dtktVar.b;
                dtkfVar5.getClass();
                dtkuVar5.b = dtkfVar5;
                dtkuVar5.a |= 1;
                if (dtkwVar.c) {
                    dtkwVar.bF();
                    dtkwVar.c = false;
                }
                dtkx dtkxVar5 = (dtkx) dtkwVar.b;
                dtku dtkuVar6 = (dtku) dtktVar.bK();
                dtkuVar6.getClass();
                dtkxVar5.b = dtkuVar6;
                dtkxVar5.a |= 1;
                dtkx dtkxVar6 = bwnsVar.b;
                if (dtkxVar6 == null) {
                    dtkxVar6 = dtkx.e;
                }
                for (dtlf dtlfVar : dtkxVar6.c) {
                    if (dtkwVar.c) {
                        dtkwVar.bF();
                        dtkwVar.c = false;
                    }
                    dtkx dtkxVar7 = (dtkx) dtkwVar.b;
                    dtlfVar.getClass();
                    dtkxVar7.c();
                    dtkxVar7.c.add(dtlfVar);
                }
                dsqp dsqpVar4 = (dsqp) bwnsVar.cu(5);
                dsqpVar4.bC(bwnsVar);
                bwnr bwnrVar = (bwnr) dsqpVar4;
                if (bwnrVar.c) {
                    bwnrVar.bF();
                    bwnrVar.c = false;
                }
                bwns bwnsVar2 = (bwns) bwnrVar.b;
                dtkx dtkxVar8 = (dtkx) dtkwVar.bK();
                dtkxVar8.getClass();
                bwnsVar2.b = dtkxVar8;
                bwnsVar2.a |= 1;
                bwnsVar = bwnrVar.bK();
            }
            a2.add(bwnsVar);
            i2++;
        }
        dtid dtidVar = this.b;
        dtmr dtmrVar = this.c;
        String str = this.d;
        dvnp dvnpVar = this.e;
        a2.size();
        ArrayList<cjys> a3 = dchl.a();
        for (bwns bwnsVar3 : a2) {
            a3.add(new cjzs(bwnsVar3, (String) null, dvnpVar));
        }
        for (bwns bwnsVar4 : b(dtidVar.b, dtmrVar)) {
            a3.add(new cjzs(bwnsVar4, str, dvnpVar));
        }
        ArrayList a4 = dchl.a();
        HashSet c = dcnm.c();
        for (cjys cjysVar : a3) {
            if (cjysVar.a.size() == 1) {
                dtkx dtkxVar9 = cjysVar.a.get(0);
                dtku dtkuVar7 = dtkxVar9.b;
                if (dtkuVar7 == null) {
                    dtkuVar7 = dtku.p;
                }
                if ((dtkuVar7.a & 1) != 0) {
                    dtku dtkuVar8 = dtkxVar9.b;
                    if (dtkuVar8 == null) {
                        dtkuVar8 = dtku.p;
                    }
                    dtkf dtkfVar6 = dtkuVar8.b;
                    if (dtkfVar6 == null) {
                        dtkfVar6 = dtkf.n;
                    }
                    if (!dtkfVar6.b.isEmpty()) {
                        String str2 = dtkfVar6.b.get(0);
                        if (!c.contains(str2)) {
                            c.add(str2);
                            a4.add(cjysVar);
                        }
                    }
                }
            } else {
                a4.add(cjysVar);
            }
        }
        return a4;
    }
}
