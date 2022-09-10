package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: bnxv  reason: default package */
/* loaded from: classes3.dex */
final class bnxv implements btzi<dhkj, dhkl> {
    final /* synthetic */ deig a;
    final /* synthetic */ bnxw b;

    public bnxv(bnxw bnxwVar, deig deigVar) {
        this.b = bnxwVar;
        this.a = deigVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dhkj> btzrVar, btzy btzyVar) {
        this.b.a.n = -1;
        deig deigVar = this.a;
        String valueOf = String.valueOf(btzyVar.p);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
        sb.append("Error: ");
        sb.append(valueOf);
        deigVar.k(new Exception(sb.toString()));
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dhkj> btzrVar, dhkl dhklVar) {
        dhab dhabVar;
        dhkl dhklVar2 = dhklVar;
        if (dhklVar2.equals(dhkl.c)) {
            this.b.a.n = -1;
            this.a.k(new Exception("Invalid response received"));
            return;
        }
        dgzq bZ = dgzr.c.bZ();
        dqnt dqntVar = dhklVar2.a;
        if (dqntVar == null) {
            dqntVar = dqnt.e;
        }
        dhae bZ2 = dhaf.d.bZ();
        if ((dqntVar.a & 4) != 0) {
            String str = dqntVar.d;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            str.getClass();
            ((dhaf) bZ2.b).c = str;
        }
        if ((dqntVar.a & 1) != 0) {
            dqnp dqnpVar = dqntVar.b;
            if (dqnpVar == null) {
                dqnpVar = dqnp.d;
            }
            if ((dqnpVar.a & 1) != 0) {
                dpum dpumVar = dqnpVar.b;
                if (dpumVar == null) {
                    dpumVar = dpum.d;
                }
                dgrn n = akqq.f(dpumVar).n();
                dhaa bZ3 = dhab.c.bZ();
                dhag bZ4 = dhah.c.bZ();
                int i = n.b;
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                dhah dhahVar = (dhah) bZ4.b;
                dhahVar.a = i;
                dhahVar.b = n.c;
                dhah bK = bZ4.bK();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                bK.getClass();
                ((dhab) bZ3.b).a = bK;
                if ((dqnpVar.a & 2) != 0) {
                    dqnn dqnnVar = dqnpVar.c;
                    if (dqnnVar == null) {
                        dqnnVar = dqnn.e;
                    }
                    dgzz a = bnxy.a(dqnnVar);
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    a.getClass();
                    ((dhab) bZ3.b).b = a;
                }
                dhabVar = bZ3.bK();
            } else {
                dhabVar = dhab.c;
            }
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dhabVar.getClass();
            ((dhaf) bZ2.b).a = dhabVar;
        }
        if ((dqntVar.a & 2) != 0) {
            dqnr dqnrVar = dqntVar.c;
            if (dqnrVar == null) {
                dqnrVar = dqnr.d;
            }
            dhad b = bnxy.b(dqnrVar);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            b.getClass();
            ((dhaf) bZ2.b).b = b;
        }
        dhaf bK2 = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bK2.getClass();
        ((dgzr) bZ.b).a = bK2;
        dsrj<dqnf> dsrjVar = dhklVar2.b;
        ArrayList a2 = dchl.a();
        for (dqnf dqnfVar : dsrjVar) {
            dgzs bZ5 = dgzv.c.bZ();
            if ((dqnfVar.a & 1) != 0) {
                dqnr dqnrVar2 = dqnfVar.b;
                if (dqnrVar2 == null) {
                    dqnrVar2 = dqnr.d;
                }
                dhad b2 = bnxy.b(dqnrVar2);
                if (bZ5.c) {
                    bZ5.bF();
                    bZ5.c = false;
                }
                b2.getClass();
                ((dgzv) bZ5.b).a = b2;
            }
            if ((dqnfVar.a & 2) != 0) {
                dqne dqneVar = dqnfVar.c;
                if (dqneVar == null) {
                    dqneVar = dqne.b;
                }
                dpum dpumVar2 = dqneVar.a;
                if (dpumVar2 == null) {
                    dpumVar2 = dpum.d;
                }
                dgrn n2 = akqq.f(dpumVar2).n();
                dgzt bZ6 = dgzu.b.bZ();
                dhag bZ7 = dhah.c.bZ();
                int i2 = n2.b;
                if (bZ7.c) {
                    bZ7.bF();
                    bZ7.c = false;
                }
                dhah dhahVar2 = (dhah) bZ7.b;
                dhahVar2.a = i2;
                dhahVar2.b = n2.c;
                dhah bK3 = bZ7.bK();
                if (bZ6.c) {
                    bZ6.bF();
                    bZ6.c = false;
                }
                bK3.getClass();
                ((dgzu) bZ6.b).a = bK3;
                if (bZ5.c) {
                    bZ5.bF();
                    bZ5.c = false;
                }
                dgzu bK4 = bZ6.bK();
                bK4.getClass();
                ((dgzv) bZ5.b).b = bK4;
            }
            a2.add(bZ5.bK());
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dgzr dgzrVar = (dgzr) bZ.b;
        dsrj<dgzv> dsrjVar2 = dgzrVar.b;
        if (!dsrjVar2.a()) {
            dgzrVar.b = dsqw.cl(dsrjVar2);
        }
        dsod.bv(a2, dgzrVar.b);
        dgzr bK5 = bZ.bK();
        this.b.a.n = Integer.valueOf(bK5.b.size());
        this.a.j(bK5);
    }
}
