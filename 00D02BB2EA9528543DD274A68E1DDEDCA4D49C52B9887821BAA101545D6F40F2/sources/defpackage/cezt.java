package defpackage;

import android.app.Application;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cezt  reason: default package */
/* loaded from: classes4.dex */
public class cezt {
    public static final dnzj a;
    private final Map<dpum, dwhj> b = new aif();
    private final dcka<dpum, cfiq> c = dbyv.N();
    private final Executor d;
    private final dhkd e;
    private final buxk f;

    static {
        dnyc bZ = dnzj.Z.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnzj dnzjVar = (dnzj) bZ.b;
        dnzjVar.a |= 512;
        dnzjVar.j = true;
        dnzj.c(dnzjVar);
        a = bZ.bK();
    }

    public cezt(Application application, buxk buxkVar, Executor executor) {
        this.f = buxkVar;
        this.d = executor;
        dhkc bZ = dhkd.d.bZ();
        int a2 = jmj.a(application, 88);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhkd dhkdVar = (dhkd) bZ.b;
        dhkdVar.a |= 1;
        dhkdVar.b = a2;
        int a3 = jmj.a(application, 52);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhkd dhkdVar2 = (dhkd) bZ.b;
        dhkdVar2.a |= 2;
        dhkdVar2.c = a3;
        this.e = bZ.bK();
    }

    public static dcdc<dpum> e(dlno dlnoVar) {
        dccx F = dcdc.F();
        for (dlnm dlnmVar : dlnoVar.c) {
            dlmc dlmcVar = dlnmVar.j;
            if (dlmcVar == null) {
                dlmcVar = dlmc.j;
            }
            dlmb dlmbVar = dlmcVar.i;
            if (dlmbVar == null) {
                dlmbVar = dlmb.c;
            }
            if ((dlmbVar.a & 1) != 0) {
                dlmc dlmcVar2 = dlnmVar.j;
                if (dlmcVar2 == null) {
                    dlmcVar2 = dlmc.j;
                }
                dlmb dlmbVar2 = dlmcVar2.i;
                if (dlmbVar2 == null) {
                    dlmbVar2 = dlmb.c;
                }
                dpum dpumVar = dlmbVar2.b;
                if (dpumVar == null) {
                    dpumVar = dpum.d;
                }
                F.g(dpumVar);
            }
        }
        return F.f();
    }

    private final synchronized dbsg<dwfl> h(dpum dpumVar) {
        if (this.b.containsKey(dpumVar)) {
            dvyw dvywVar = this.b.get(dpumVar).d;
            if (dvywVar == null) {
                dvywVar = dvyw.bv;
            }
            if (dvywVar.I.size() > 0) {
                dvyw dvywVar2 = this.b.get(dpumVar).d;
                if (dvywVar2 == null) {
                    dvywVar2 = dvyw.bv;
                }
                return dbsg.i(dvywVar2.I.get(0));
            }
        }
        return dbpy.a;
    }

    private final void i(dpum dpumVar) {
        dhjy bZ = dhjz.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhjz dhjzVar = (dhjz) bZ.b;
        int i = dhjzVar.a | 4;
        dhjzVar.a = i;
        dhjzVar.d = 100.0d;
        double d = dpumVar.c;
        int i2 = i | 1;
        dhjzVar.a = i2;
        dhjzVar.b = d;
        double d2 = dpumVar.b;
        dhjzVar.a = i2 | 2;
        dhjzVar.c = d2;
        dhjz bK = bZ.bK();
        buxk buxkVar = this.f;
        dwhe bZ2 = dwhf.i.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dwhf dwhfVar = (dwhf) bZ2.b;
        bK.getClass();
        dwhfVar.b = bK;
        dwhfVar.a |= 1;
        dwhf dwhfVar2 = (dwhf) bZ2.b;
        dwhfVar2.e = 0;
        dwhfVar2.a |= 8;
        dhjw bZ3 = dhjx.f.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dhjx dhjxVar = (dhjx) bZ3.b;
        bK.getClass();
        dhjxVar.b = bK;
        int i3 = dhjxVar.a | 1;
        dhjxVar.a = i3;
        int i4 = i3 | 8;
        dhjxVar.a = i4;
        dhjxVar.e = 30.0f;
        dhkd dhkdVar = this.e;
        dhkdVar.getClass();
        dhjxVar.d = dhkdVar;
        dhjxVar.a = i4 | 4;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dwhf dwhfVar3 = (dwhf) bZ2.b;
        dhjx bK2 = bZ3.bK();
        bK2.getClass();
        dwhfVar3.c = bK2;
        dwhfVar3.a |= 2;
        dnzj dnzjVar = a;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dwhf dwhfVar4 = (dwhf) bZ2.b;
        dnzjVar.getClass();
        dwhfVar4.d = dnzjVar;
        dwhfVar4.a |= 4;
        dnqg bZ4 = dnqh.p.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dnqh.b((dnqh) bZ4.b);
        dnqh bK3 = bZ4.bK();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dwhf dwhfVar5 = (dwhf) bZ2.b;
        bK3.getClass();
        dwhfVar5.h = bK3;
        dwhfVar5.a |= 64;
        buxkVar.b(bZ2.bK(), new cezs(this, dpumVar), this.d);
    }

    private final synchronized void j(dpum dpumVar, String str) {
        if (this.c.m(dpumVar)) {
            for (cfiq cfiqVar : ((dbxj) this.c).f(dpumVar)) {
                cfiqVar.a(str);
            }
        }
        ((dbxj) this.c).g(dpumVar);
    }

    public final synchronized void a(dcdc<dpum> dcdcVar) {
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dpum dpumVar = dcdcVar.get(i);
            dbsg<String> b = b(dpumVar);
            if (!b.a()) {
                i(dpumVar);
            } else {
                j(dpumVar, b.b());
                return;
            }
        }
    }

    public final synchronized dbsg<String> b(dpum dpumVar) {
        return h(dpumVar).h(cezp.a);
    }

    public final synchronized dbsg<dggg> c(dpum dpumVar) {
        return h(dpumVar).h(cezq.a);
    }

    public final synchronized dbsg<dhjx> d(dpum dpumVar) {
        return h(dpumVar).h(cezr.a);
    }

    public final synchronized void f(dpum dpumVar, dwhj dwhjVar) {
        this.b.put(dpumVar, dwhjVar);
        dbsg<String> b = b(dpumVar);
        if (b.a()) {
            j(dpumVar, b.b());
        }
    }

    public final synchronized void g(dpum dpumVar, cfiq cfiqVar) {
        dbsg<String> b = b(dpumVar);
        if (b.a()) {
            cfiqVar.a(b.b());
            return;
        }
        this.c.n(dpumVar, cfiqVar);
        i(dpumVar);
    }
}
