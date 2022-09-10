package defpackage;
/* compiled from: PG */
/* renamed from: bnxw  reason: default package */
/* loaded from: classes3.dex */
public class bnxw implements cpnm {
    public final bokk a;
    private final buny b;

    public bnxw(bokk bokkVar, buny bunyVar) {
        this.b = bunyVar;
        this.a = bokkVar;
    }

    @Override // defpackage.cpnm
    public final dehn<dgzr> a(dhaf dhafVar) {
        dhki bZ = dhkj.c.bZ();
        dqns bZ2 = dqnt.e.bZ();
        if (!dhafVar.c.trim().isEmpty()) {
            String str = dhafVar.c;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dqnt dqntVar = (dqnt) bZ2.b;
            str.getClass();
            dqntVar.a |= 4;
            dqntVar.d = str;
        }
        dhab dhabVar = dhafVar.a;
        if (dhabVar != null) {
            dqno bZ3 = dqnp.d.bZ();
            dhah dhahVar = dhabVar.a;
            if (dhahVar != null) {
                dpum h = akqq.d(dhahVar.a, dhahVar.b).h();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dqnp dqnpVar = (dqnp) bZ3.b;
                h.getClass();
                dqnpVar.b = h;
                dqnpVar.a |= 1;
            }
            dgzz dgzzVar = dhabVar.b;
            if (dgzzVar != null) {
                dqnn c = bnxy.c(dgzzVar);
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dqnp dqnpVar2 = (dqnp) bZ3.b;
                c.getClass();
                dqnpVar2.c = c;
                dqnpVar2.a |= 2;
            }
            dqnp bK = bZ3.bK();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dqnt dqntVar2 = (dqnt) bZ2.b;
            bK.getClass();
            dqntVar2.b = bK;
            dqntVar2.a |= 1;
        }
        dhad dhadVar = dhafVar.b;
        if (dhadVar != null) {
            dqnq bZ4 = dqnr.d.bZ();
            dqnw bZ5 = dqnx.d.bZ();
            dhaj dhajVar = dhadVar.a;
            if (dhajVar == null) {
                dhajVar = dhaj.c;
            }
            bZ5.a(dhajVar.a);
            dhaj dhajVar2 = dhadVar.a;
            if (dhajVar2 == null) {
                dhajVar2 = dhaj.c;
            }
            dstn dstnVar = dhajVar2.b;
            if (dstnVar == null) {
                dstnVar = dstn.b;
            }
            String str2 = dstnVar.a;
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dqnx dqnxVar = (dqnx) bZ5.b;
            str2.getClass();
            dqnxVar.a |= 1;
            dqnxVar.c = str2;
            dqnx bK2 = bZ5.bK();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dqnr dqnrVar = (dqnr) bZ4.b;
            bK2.getClass();
            dqnrVar.b = bK2;
            dqnrVar.a |= 1;
            dgzz dgzzVar2 = dhadVar.b;
            if (dgzzVar2 != null) {
                dqnn c2 = bnxy.c(dgzzVar2);
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                dqnr dqnrVar2 = (dqnr) bZ4.b;
                c2.getClass();
                dqnrVar2.c = c2;
                dqnrVar2.a |= 2;
            }
            dqnr bK3 = bZ4.bK();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dqnt dqntVar3 = (dqnt) bZ2.b;
            bK3.getClass();
            dqntVar3.c = bK3;
            dqntVar3.a |= 2;
        }
        dqnt bK4 = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhkj dhkjVar = (dhkj) bZ.b;
        bK4.getClass();
        dhkjVar.b = bK4;
        dhkjVar.a |= 1;
        deig d = deig.d();
        this.b.a(bZ.bK(), new bnxv(this, d), bvrj.BACKGROUND_THREADPOOL);
        return d;
    }
}
