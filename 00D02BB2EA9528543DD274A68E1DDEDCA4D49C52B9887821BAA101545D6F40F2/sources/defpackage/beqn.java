package defpackage;
/* compiled from: PG */
/* renamed from: beqn  reason: default package */
/* loaded from: classes3.dex */
public class beqn {
    public final axwi a;
    private final dxio<akfa> b;
    private final dxio<baju> c;

    public beqn(axwi axwiVar, dxio<akfa> dxioVar, dxio<baju> dxioVar2) {
        this.a = axwiVar;
        this.b = dxioVar;
        this.c = dxioVar2;
    }

    public static void b(axwi axwiVar, deig<baad> deigVar) {
        dehn<baad> i = axwiVar.i(baab.LOCAL_DEAL);
        if (i == null) {
            return;
        }
        deigVar.p(i);
    }

    public final void a(beqm beqmVar) {
        final deig d = deig.d();
        if (this.b.a().j() != null) {
            btlu j = this.b.a().j();
            dbsk.s(j);
            if (j.u()) {
                this.c.a().a(new bvqg(this, d) { // from class: beqh
                    private final beqn a;
                    private final deig b;

                    {
                        this.a = this;
                        this.b = d;
                    }

                    @Override // defpackage.bvqg
                    public final void NU(Object obj) {
                        beqn beqnVar = this.a;
                        Boolean bool = (Boolean) obj;
                        beqn.b(beqnVar.a, this.b);
                    }
                });
                deha.q(d, new beqi(beqmVar), dege.a);
            }
        }
        b(this.a, d);
        deha.q(d, new beqi(beqmVar), dege.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final baal c(baad baadVar, ccln cclnVar, ilo iloVar) {
        dgev dgevVar;
        dgev dgevVar2;
        dgev dgevVar3;
        axwi axwiVar = this.a;
        dpoy bZ = dppl.m.bZ();
        if (cclnVar.b == 10) {
            dgevVar = (dgev) cclnVar.c;
        } else {
            dgevVar = dgev.g;
        }
        String str = dgevVar.b;
        String str2 = cclnVar.f;
        dppq bZ2 = dppt.e.bZ();
        dppw bZ3 = dppz.c.bZ();
        dppy dppyVar = dppy.DEAL_ENTITY_LIST_ITEM;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dppz dppzVar = (dppz) bZ3.b;
        dppzVar.b = dppyVar.e;
        dppzVar.a |= 1;
        dppz bK = bZ3.bK();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dppt dpptVar = (dppt) bZ2.b;
        bK.getClass();
        dpptVar.d = bK;
        dpptVar.a |= 1;
        str.getClass();
        dpptVar.b = 6;
        dpptVar.c = str;
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
        dppb bZ4 = dppe.g.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dppe dppeVar = (dppe) bZ4.b;
        str.getClass();
        dppeVar.a |= 2;
        dppeVar.c = str;
        dppu bZ5 = dppv.g.bZ();
        String n = iloVar.n();
        if (!dbsj.d(n)) {
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dppe dppeVar2 = (dppe) bZ4.b;
            n.getClass();
            dppeVar2.a |= 4;
            dppeVar2.d = n;
        }
        String str3 = cclnVar.j;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dppe dppeVar3 = (dppe) bZ4.b;
        str3.getClass();
        dppeVar3.a |= 8;
        dppeVar3.e = str3;
        if (cclnVar.b == 10) {
            dgevVar2 = (dgev) cclnVar.c;
        } else {
            dgevVar2 = dgev.g;
        }
        if ((dgevVar2.a & 16) != 0) {
            if (cclnVar.b == 10) {
                dgevVar3 = (dgev) cclnVar.c;
            } else {
                dgevVar3 = dgev.g;
            }
            dgeu dgeuVar = dgevVar3.d;
            if (dgeuVar == null) {
                dgeuVar = dgeu.c;
            }
            dppc bZ6 = dppd.d.bZ();
            dqjs bZ7 = dqjt.d.bZ();
            long j = dgeuVar.a;
            if (bZ7.c) {
                bZ7.bF();
                bZ7.c = false;
            }
            dqjt dqjtVar = (dqjt) bZ7.b;
            dqjtVar.a |= 1;
            dqjtVar.b = j;
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            dppd dppdVar = (dppd) bZ6.b;
            dqjt bK3 = bZ7.bK();
            bK3.getClass();
            dppdVar.b = bK3;
            dppdVar.a |= 1;
            dqjs bZ8 = dqjt.d.bZ();
            long j2 = dgeuVar.b;
            if (bZ8.c) {
                bZ8.bF();
                bZ8.c = false;
            }
            dqjt dqjtVar2 = (dqjt) bZ8.b;
            dqjtVar2.a |= 1;
            dqjtVar2.b = j2;
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            dppd dppdVar2 = (dppd) bZ6.b;
            dqjt bK4 = bZ8.bK();
            bK4.getClass();
            dppdVar2.c = bK4;
            dppdVar2.a |= 2;
            dppd bK5 = bZ6.bK();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dppe dppeVar4 = (dppe) bZ4.b;
            bK5.getClass();
            dppeVar4.f = bK5;
            dppeVar4.a |= 16;
        }
        if (iloVar.aj() != null) {
            dpul bZ9 = dpum.d.bZ();
            akqq aj = iloVar.aj();
            dbsk.s(aj);
            double d = aj.a;
            if (bZ9.c) {
                bZ9.bF();
                bZ9.c = false;
            }
            dpum dpumVar = (dpum) bZ9.b;
            dpumVar.a |= 1;
            dpumVar.b = d;
            akqq aj2 = iloVar.aj();
            dbsk.s(aj2);
            double d2 = aj2.b;
            if (bZ9.c) {
                bZ9.bF();
                bZ9.c = false;
            }
            dpum dpumVar2 = (dpum) bZ9.b;
            dpumVar2.a |= 2;
            dpumVar2.c = d2;
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dppv dppvVar = (dppv) bZ5.b;
            dpum bK6 = bZ9.bK();
            bK6.getClass();
            dppvVar.c = bK6;
            dppvVar.a |= 2;
        }
        dpsm bZ10 = dpsn.d.bZ();
        long j3 = iloVar.ai().b;
        if (bZ10.c) {
            bZ10.bF();
            bZ10.c = false;
        }
        dpsn dpsnVar = (dpsn) bZ10.b;
        dpsnVar.a |= 1;
        dpsnVar.b = j3;
        long j4 = iloVar.ai().c;
        if (bZ10.c) {
            bZ10.bF();
            bZ10.c = false;
        }
        dpsn dpsnVar2 = (dpsn) bZ10.b;
        dpsnVar2.a |= 2;
        dpsnVar2.c = j4;
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dppv dppvVar2 = (dppv) bZ5.b;
        dpsn bK7 = bZ10.bK();
        bK7.getClass();
        dppvVar2.b = bK7;
        dppvVar2.a |= 1;
        String B = iloVar.B();
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dppv dppvVar3 = (dppv) bZ5.b;
        B.getClass();
        dppvVar3.a |= 8;
        dppvVar3.e = B;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dppe dppeVar5 = (dppe) bZ4.b;
        dppv bK8 = bZ5.bK();
        bK8.getClass();
        dppeVar5.b = bK8;
        dppeVar5.a |= 1;
        dppe bK9 = bZ4.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dppl dpplVar3 = (dppl) bZ.b;
        bK9.getClass();
        dpplVar3.c = bK9;
        dpplVar3.b = 17;
        return axwiVar.e(baadVar, bZ.bK());
    }

    public final void d(ccln cclnVar, ilo iloVar) {
        a(new beqk(this, cclnVar, iloVar));
    }

    public final void e(baad baadVar) {
        this.a.j(baadVar);
    }
}
