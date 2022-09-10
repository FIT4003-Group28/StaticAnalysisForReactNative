package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: abfg  reason: default package */
/* loaded from: classes2.dex */
public final class abfg {
    public final anhk a;
    private final bupb b;
    private final btvo c;

    public abfg(bupb bupbVar, anhk anhkVar, btvo btvoVar) {
        this.b = bupbVar;
        this.a = anhkVar;
        this.c = btvoVar;
    }

    public final dehn<dhym> a(dhyh dhyhVar) {
        deig d = deig.d();
        ((bupc) this.b).b().a(dhyhVar, new abff(d), bvrj.BACKGROUND_THREADPOOL);
        return d;
    }

    public final dehn<dhym> b(dpsv dpsvVar, int i, List<dpva> list, dhjx dhjxVar) {
        dhyg bZ = dhyh.k.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhyh dhyhVar = (dhyh) bZ.b;
        int i2 = i - 1;
        dhyhVar.d = i2;
        int i3 = dhyhVar.a | 8;
        dhyhVar.a = i3;
        dhjxVar.getClass();
        dhyhVar.b = dhjxVar;
        dhyhVar.a = i3 | 2;
        dnwb a = this.a.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhyh dhyhVar2 = (dhyh) bZ.b;
        a.getClass();
        dhyhVar2.e = a;
        dhyhVar2.a |= 16;
        dwfs o = cknx.o(false);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhyh dhyhVar3 = (dhyh) bZ.b;
        dwfv bK = o.bK();
        bK.getClass();
        dhyhVar3.f = bK;
        dhyhVar3.a |= 32;
        if (i2 == 1 || i2 == 2 || i2 == 4) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhyh dhyhVar4 = (dhyh) bZ.b;
            dhyhVar4.c = dpsvVar.i;
            dhyhVar4.a |= 4;
            dpsg bZ2 = dpsh.e.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dpsh dpshVar = (dpsh) bZ2.b;
            dpshVar.a |= 4;
            dpshVar.c = true;
            dpsh bK2 = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhyh dhyhVar5 = (dhyh) bZ.b;
            bK2.getClass();
            dhyhVar5.h = bK2;
            dhyhVar5.a |= 512;
            dqgx bZ3 = dqgy.e.bZ();
            dqcx bZ4 = dqcy.a.bZ();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dqcy.b((dqcy) bZ4.b);
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dqgy dqgyVar = (dqgy) bZ3.b;
            dqcy bK3 = bZ4.bK();
            bK3.getClass();
            dqgyVar.b = bK3;
            dqgyVar.a |= 1;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhyh dhyhVar6 = (dhyh) bZ.b;
            dqgy bK4 = bZ3.bK();
            bK4.getClass();
            dhyhVar6.g = bK4;
            dhyhVar6.a |= 64;
            dqeu bZ5 = dqex.e.bZ();
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dqex dqexVar = (dqex) bZ5.b;
            dqexVar.a |= 1;
            dqexVar.b = true;
            for (dpva dpvaVar : list) {
                if (bZ5.c) {
                    bZ5.bF();
                    bZ5.c = false;
                }
                dqex dqexVar2 = (dqex) bZ5.b;
                dpvaVar.getClass();
                dsrj<dpva> dsrjVar = dqexVar2.c;
                if (!dsrjVar.a()) {
                    dqexVar2.c = dsqw.cl(dsrjVar);
                }
                dqexVar2.c.add(dpvaVar);
            }
            bZ5.a(dqew.PLACE);
            if (this.c.getEnableFeatureParameters().aN) {
                bZ5.a(dqew.EXPERIENCE);
            }
            dqex bK5 = bZ5.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhyh dhyhVar7 = (dhyh) bZ.b;
            bK5.getClass();
            dhyhVar7.i = bK5;
            dhyhVar7.a |= 1024;
        }
        return a(bZ.bK());
    }
}
