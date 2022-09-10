package defpackage;

import android.util.Base64;
import java.util.List;
/* compiled from: PG */
/* renamed from: qsm  reason: default package */
/* loaded from: classes7.dex */
public class qsm {
    public static final dwbk a;
    public static final dwbk b;
    private static final dwbk f;
    private static final dwbk g;
    @dzsi
    public srv c;
    @dzsi
    public degu<amte> d;
    final qsj e = new qsj(this);
    private final btrm h;
    private final vxa i;
    private final dzsj<srv> j;

    static {
        dwbd bZ = dwbk.s.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwbk dwbkVar = (dwbk) bZ.b;
        dwbkVar.k = 6;
        dwbkVar.a |= 2048;
        dwbk.f(dwbkVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwbk.h((dwbk) bZ.b);
        dwbk bK = bZ.bK();
        f = bK;
        dwbd ca = dwbk.s.ca(bK);
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        dwbk dwbkVar2 = (dwbk) ca.b;
        dwbkVar2.l = 2;
        dwbkVar2.a |= 4096;
        g = ca.bK();
        dwbd bZ2 = dwbk.s.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dwbk dwbkVar3 = (dwbk) bZ2.b;
        dwbkVar3.k = 7;
        dwbkVar3.a |= 2048;
        dwbk.f(dwbkVar3);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dwbk.h((dwbk) bZ2.b);
        a = bZ2.bK();
        dwbd bZ3 = dwbk.s.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dwbk dwbkVar4 = (dwbk) bZ3.b;
        dwbkVar4.k = 7;
        dwbkVar4.a |= 2048;
        dwbk.f(dwbkVar4);
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dwbk dwbkVar5 = (dwbk) bZ3.b;
        dwbkVar5.l = 2;
        dwbkVar5.a |= 4096;
        dwbk.h(dwbkVar5);
        dwbe bZ4 = dwbh.g.bZ();
        dwbf bZ5 = dwbg.g.bZ();
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dwbg dwbgVar = (dwbg) bZ5.b;
        dwbgVar.a |= 1;
        dwbgVar.b = true;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dwbh dwbhVar = (dwbh) bZ4.b;
        dwbg bK2 = bZ5.bK();
        bK2.getClass();
        dwbhVar.b = bK2;
        dwbhVar.a |= 1;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dwbk dwbkVar6 = (dwbk) bZ3.b;
        dwbh bK3 = bZ4.bK();
        bK3.getClass();
        dwbkVar6.o = bK3;
        dwbkVar6.a |= 32768;
        b = bZ3.bK();
    }

    public qsm(btrm btrmVar, vxa vxaVar, dzsj<srv> dzsjVar) {
        dbsk.s(btrmVar);
        this.h = btrmVar;
        dbsk.s(vxaVar);
        this.i = vxaVar;
        dbsk.s(dzsjVar);
        this.j = dzsjVar;
    }

    public final boolean a() {
        return this.c != null;
    }

    public final void b(List<amvh> list, dwbk dwbkVar, @dzsi dspd dspdVar, eaph eaphVar, degu<amte> deguVar) {
        d(list, vul.TRANSIT_ROUTE_SELECTION, dwbkVar, null, qsq.a(eaphVar, 2), dspdVar, null, false, dbpy.a, deguVar);
    }

    public final void c(List<amvh> list, dwbk dwbkVar, @dzsi dspd dspdVar, eaph eaphVar, dbsg<dnqh> dbsgVar, degu<amte> deguVar) {
        d(list, vul.TRANSIT_ROUTE_SELECTION, dwbkVar, null, qsq.a(eaphVar, 1), dspdVar, null, false, dbsgVar, deguVar);
    }

    public final void d(List<amvh> list, vul vulVar, dwbk dwbkVar, @dzsi Integer num, @dzsi dosz doszVar, @dzsi dspd dspdVar, @dzsi dspd dspdVar2, boolean z, dbsg<dnqh> dbsgVar, degu<amte> deguVar) {
        vxa vxaVar = this.i;
        dbsk.a(vulVar == vul.TRANSIT_COMMUTE_IMMERSIVE || vulVar == vul.TRANSIT_ROUTE_SELECTION || vulVar == vul.SAVED_TRANSIT_ROUTES);
        dwal ca = dwao.R.ca(vxaVar.b(dqvj.TRANSIT, 3, vulVar));
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        dwao dwaoVar = (dwao) ca.b;
        int i = dwaoVar.a | 536870912;
        dwaoVar.a = i;
        dwaoVar.A = true;
        dwbkVar.getClass();
        dwaoVar.f = dwbkVar;
        dwaoVar.a = i | 2;
        if (num != null) {
            int intValue = num.intValue();
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            dwao dwaoVar2 = (dwao) ca.b;
            dwaoVar2.a |= 128;
            dwaoVar2.l = intValue;
        }
        if (doszVar != null) {
            dwao dwaoVar3 = (dwao) ca.b;
            doszVar.getClass();
            dwaoVar3.B = doszVar;
            dwaoVar3.a |= 1073741824;
        }
        vum vumVar = new vum();
        vumVar.c(list);
        vumVar.a = ca.bK();
        if (dspdVar == null && (vulVar == vul.TRANSIT_COMMUTE_IMMERSIVE || vulVar == vul.SAVED_TRANSIT_ROUTES)) {
            vumVar.j = dvzx.BEST_TRANSIT_PATTERN;
        } else if (dspdVar != null) {
            Base64.encodeToString(dspdVar.G(), 11);
            vumVar.i = dspdVar;
            vumVar.k = dquz.STRICT_MATCHING;
        }
        if (dspdVar2 != null) {
            vumVar.m = dspdVar2;
        }
        if (dbsgVar.a()) {
            vumVar.o = dbsgVar.b();
        }
        if (z) {
            vumVar.n = true;
        }
        vun a2 = vumVar.a();
        srv a3 = this.j.a();
        this.c = a3;
        this.d = deguVar;
        a3.k(a2, true);
    }

    public final void e() {
        btrm btrmVar = this.h;
        qsj qsjVar = this.e;
        dceq a2 = dcet.a();
        a2.b(srf.class, new qsn(srf.class, qsjVar, bvrj.UI_THREAD));
        btrmVar.g(qsjVar, a2.a());
    }

    public final void f() {
        g();
        this.h.a(this.e);
    }

    public final void g() {
        this.c = null;
        this.d = null;
    }

    public final void h(List<amvh> list, eaph eaphVar, degu<amte> deguVar) {
        b(list, g, null, eaphVar, deguVar);
    }

    public final void i(List<amvh> list, eaph eaphVar, degu<amte> deguVar) {
        c(list, g, null, eaphVar, dbpy.a, deguVar);
    }
}
