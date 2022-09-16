package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: nxn  reason: default package */
/* loaded from: classes7.dex */
public class nxn {
    public static final dcqe a = dcqe.c("nxn");
    public final dtid b;
    public final dtmr c;
    @dzsi
    public final String d;
    @dzsi
    public final dvnp e;
    @dzsi
    public nvf f;

    public nxn(bwnf bwnfVar, dtid dtidVar) {
        dtmr a2 = bwnfVar.a();
        String str = bwnfVar.a;
        dvnp dvnpVar = bwnfVar.b;
        this.c = a2;
        this.b = dtidVar;
        this.d = str;
        this.e = dvnpVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static List<bwns> b(List<dtkx> list, dtmr dtmrVar) {
        Long l;
        dthj dthjVar = dtmrVar.n;
        if (dthjVar == null) {
            dthjVar = dthj.b;
        }
        dsri dsriVar = dthjVar.a;
        dccx dccxVar = new dccx();
        int i = 0;
        for (dtkx dtkxVar : list) {
            bwnr bZ = bwns.d.bZ();
            if (dtmrVar.b == 1) {
                dtku dtkuVar = dtkxVar.b;
                if (dtkuVar == null) {
                    dtkuVar = dtku.p;
                }
                dtkf dtkfVar = dtkuVar.b;
                if (dtkfVar == null) {
                    dtkfVar = dtkf.n;
                }
                if (dtkfVar.l != 4887) {
                    if (i < 0 || i >= dsriVar.size()) {
                        l = -1L;
                    } else {
                        l = dsriVar.get(i);
                    }
                    if (l.longValue() > 0) {
                        long longValue = l.longValue();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        bwns bwnsVar = (bwns) bZ.b;
                        bwnsVar.a |= 2;
                        bwnsVar.c = longValue;
                    }
                    i++;
                }
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bwns bwnsVar2 = (bwns) bZ.b;
            dtkxVar.getClass();
            bwnsVar2.b = dtkxVar;
            bwnsVar2.a |= 1;
            dccxVar.g(bZ.bK());
        }
        return dccxVar.f();
    }

    public List<cjys> a(@dzsi bwne bwneVar) {
        List<bwns> b = b(this.b.b, this.c);
        String str = this.d;
        dvnp dvnpVar = this.e;
        ArrayList a2 = dchl.a();
        dccx F = dcdc.F();
        for (int i = 0; i < b.size(); i++) {
            bwns bwnsVar = b.get(i);
            dtkx dtkxVar = bwnsVar.b;
            if (dtkxVar == null) {
                dtkxVar = dtkx.e;
            }
            if (!dtkxVar.d) {
                dcdc f = F.f();
                if (!f.isEmpty()) {
                    a2.add(new cjzs(f, str, dvnpVar));
                    F = dcdc.F();
                }
            }
            F.g(bwnsVar);
        }
        dcdc f2 = F.f();
        if (!f2.isEmpty()) {
            a2.add(new cjzs(f2, str, dvnpVar));
        }
        return a2;
    }
}
