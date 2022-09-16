package defpackage;
/* compiled from: PG */
/* renamed from: qrv  reason: default package */
/* loaded from: classes7.dex */
public final class qrv implements qjl {
    private static final dcqe a = dcqe.c("qrv");
    private final bvjj b;

    public qrv(bvjj bvjjVar) {
        this.b = bvjjVar;
    }

    private final synchronized rld c() {
        return (rld) this.b.L(bvjk.jc, (dssr) rld.b.cu(7), rld.b);
    }

    private final synchronized void d(rld rldVar) {
        this.b.al(bvjk.jc, rldVar);
    }

    private static dbsg<Integer> e(rld rldVar, qjj qjjVar, String str) {
        for (int i = 0; i < rldVar.a.size(); i++) {
            rlc rlcVar = rldVar.a.get(i);
            if ((rlcVar.a & 1) != 0) {
                rlb rlbVar = rlcVar.b;
                if (rlbVar == null) {
                    rlbVar = rlb.d;
                }
                if (str.equals(rlbVar.b) && qjjVar.e == rlbVar.c) {
                    return dbsg.i(Integer.valueOf(i));
                }
            } else {
                bvoo.h("CurrentStage is missing key.", new Object[0]);
            }
        }
        return dbpy.a;
    }

    @Override // defpackage.qjl
    public final synchronized void a(qjj qjjVar, String str, int i) {
        rld bK;
        rld c = c();
        dbsg<Integer> e = e(c, qjjVar, str);
        if (e.a()) {
            rlc rlcVar = c.a.get(e.b().intValue());
            if (rlcVar.c < i) {
                dsqp dsqpVar = (dsqp) rlcVar.cu(5);
                dsqpVar.bC(rlcVar);
                rkz rkzVar = (rkz) dsqpVar;
                if (rkzVar.c) {
                    rkzVar.bF();
                    rkzVar.c = false;
                }
                rlc rlcVar2 = (rlc) rkzVar.b;
                rlcVar2.a |= 2;
                rlcVar2.c = i;
                rlcVar = rkzVar.bK();
            }
            dsqp dsqpVar2 = (dsqp) c.cu(5);
            dsqpVar2.bC(c);
            rky rkyVar = (rky) dsqpVar2;
            int intValue = e.b().intValue();
            if (rkyVar.c) {
                rkyVar.bF();
                rkyVar.c = false;
            }
            rld rldVar = (rld) rkyVar.b;
            rldVar.b();
            rldVar.a.remove(intValue);
            if (rkyVar.c) {
                rkyVar.bF();
                rkyVar.c = false;
            }
            rld rldVar2 = (rld) rkyVar.b;
            rlcVar.getClass();
            rldVar2.b();
            rldVar2.a.add(rlcVar);
            bK = rkyVar.bK();
        } else {
            dcba a2 = dcba.a(25);
            a2.addAll(c.a);
            rkz bZ = rlc.d.bZ();
            rla bZ2 = rlb.d.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            rlb rlbVar = (rlb) bZ2.b;
            str.getClass();
            int i2 = rlbVar.a | 1;
            rlbVar.a = i2;
            rlbVar.b = str;
            int i3 = qjjVar.e;
            rlbVar.a = i2 | 2;
            rlbVar.c = i3;
            rlb bK2 = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            rlc rlcVar3 = (rlc) bZ.b;
            bK2.getClass();
            rlcVar3.b = bK2;
            int i4 = rlcVar3.a | 1;
            rlcVar3.a = i4;
            rlcVar3.a = i4 | 2;
            rlcVar3.c = i;
            a2.add(bZ.bK());
            dsqp dsqpVar3 = (dsqp) c.cu(5);
            dsqpVar3.bC(c);
            rky rkyVar2 = (rky) dsqpVar3;
            if (rkyVar2.c) {
                rkyVar2.bF();
                rkyVar2.c = false;
            }
            ((rld) rkyVar2.b).a = rld.ck();
            if (rkyVar2.c) {
                rkyVar2.bF();
                rkyVar2.c = false;
            }
            rld rldVar3 = (rld) rkyVar2.b;
            rldVar3.b();
            dsod.bv(a2, rldVar3.a);
            bK = rkyVar2.bK();
        }
        d(bK);
    }

    @Override // defpackage.qjl
    public final int b(qjj qjjVar, String str) {
        rlc rlcVar;
        rld c = c();
        dbsg<Integer> e = e(c, qjjVar, str);
        if (e.a()) {
            rlcVar = c.a.get(e.b().intValue());
        } else {
            rlcVar = null;
        }
        if (rlcVar != null) {
            return rlcVar.c;
        }
        return 0;
    }
}
