package defpackage;

import android.app.Activity;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: byjy  reason: default package */
/* loaded from: classes4.dex */
public final class byjy implements byio, byjd {
    static final eaow a = eaow.c(5);
    public final byip b;
    public final byje c;
    @dzsi
    public byjx d;
    public final btrm e;
    public final boolean f;
    @dzsi
    public GmmLocation g;
    private final dxio<ahjq> h;
    private final axru i;

    public byjy(dxio<ahjq> dxioVar, axru axruVar, btrm btrmVar, btvo btvoVar, byiq byiqVar, byjf byjfVar, @dzsi dljj dljjVar) {
        this.h = dxioVar;
        this.i = axruVar;
        this.e = btrmVar;
        this.f = btvoVar.getTrafficHubParameters().a;
        bvjj a2 = byjfVar.a.a();
        byjf.a(a2, 1);
        axwq a3 = byjfVar.b.a();
        byjf.a(a3, 2);
        btrm a4 = byjfVar.c.a();
        byjf.a(a4, 3);
        dzsj<srv> dzsjVar = byjfVar.d;
        vxa a5 = byjfVar.e.a();
        byjf.a(a5, 5);
        acyr a6 = byjfVar.f.a();
        byjf.a(a6, 6);
        dxio a7 = ((dxjh) byjfVar.g).a();
        byjf.a(a7, 7);
        Activity activity = (Activity) ((dxjd) byjfVar.h).a;
        byjf.a(activity, 8);
        byex a8 = byjfVar.i.a();
        byjf.a(a8, 9);
        btvo a9 = byjfVar.j.a();
        byjf.a(a9, 10);
        this.c = new byje(a2, a3, a4, dzsjVar, a5, a6, a7, activity, a8, a9, dljjVar);
        eaow eaowVar = a;
        bvgj a10 = byiqVar.a.a();
        byiq.a(a10, 1);
        cqat a11 = byiqVar.b.a();
        byiq.a(a11, 2);
        byiq.a(eaowVar, 3);
        this.b = new byip(a10, a11, eaowVar);
    }

    public final void a() {
        dljj dljjVar;
        if (this.g == null) {
            return;
        }
        byjw c = c();
        boolean b = this.b.b();
        byjw byjwVar = byjw.WAITING_TO_REQUEST;
        int ordinal = c.ordinal();
        if (ordinal != 0 && ordinal != 3 && (ordinal != 5 || b)) {
            return;
        }
        byip byipVar = this.b;
        byipVar.d = byjw.LOADING;
        byipVar.a();
        dhle bZ = dhlj.c.bZ();
        dhli dhliVar = dhli.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhlj dhljVar = (dhlj) bZ.b;
        dhliVar.getClass();
        dhljVar.b = dhliVar;
        dhljVar.a = 2;
        byipVar.g.a(bZ.bK(), byipVar.f, bvrj.UI_THREAD);
        byje byjeVar = this.c;
        if (!byjeVar.d) {
            byjeVar.n = byjw.SUCCESS;
            return;
        }
        GmmLocation a2 = byjeVar.h.a().a();
        if (a2 == null) {
            byjeVar.n = byjw.SUCCESS;
            return;
        }
        akqq B = a2.B();
        amvh g = amvh.g(byjeVar.i, B);
        if (!byjeVar.k || (dljjVar = byjeVar.p) == null || dljjVar.a.size() <= 0 || (byjeVar.p.a.get(0).a & 1) == 0) {
            dcdc<azva> n = byjeVar.a.n();
            int size = n.size();
            azva azvaVar = null;
            azva azvaVar2 = null;
            for (int i = 0; i < size; i++) {
                azva azvaVar3 = n.get(i);
                dndr dndrVar = azvaVar3.a;
                if (dndrVar == dndr.HOME) {
                    azvaVar = azvaVar3;
                } else if (dndrVar == dndr.WORK) {
                    azvaVar2 = azvaVar3;
                }
            }
            azva azvaVar4 = (azvaVar == null || akqq.v(azvaVar.e, B, (double) byjeVar.b) || !akqq.v(azvaVar.e, B, (double) byjeVar.c)) ? (azvaVar2 == null || akqq.v(azvaVar2.e, B, (double) byjeVar.b) || !akqq.v(azvaVar2.e, B, (double) byjeVar.c)) ? null : azvaVar2 : azvaVar;
            if (azvaVar4 == null) {
                byjeVar.n = byjw.SUCCESS;
                return;
            }
            dpjs g2 = amvj.g(azvaVar4.a);
            if (g2 == null) {
                byjeVar.n = byjw.SUCCESS;
                return;
            }
            dpjq bZ2 = dpjx.n.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dpjx dpjxVar = (dpjx) bZ2.b;
            dpjxVar.f = g2.h;
            dpjxVar.a |= 256;
            String o = azvaVar4.c.o();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dpjx dpjxVar2 = (dpjx) bZ2.b;
            o.getClass();
            dpjxVar2.a = 2 | dpjxVar2.a;
            dpjxVar2.c = o;
            String e = azvaVar4.e(byjeVar.i);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dpjx dpjxVar3 = (dpjx) bZ2.b;
            e.getClass();
            dpjxVar3.a |= 128;
            dpjxVar3.e = e;
            akqq akqqVar = azvaVar4.e;
            if (akqqVar != null) {
                dnoh g3 = akqqVar.g();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dpjx dpjxVar4 = (dpjx) bZ2.b;
                g3.getClass();
                dpjxVar4.d = g3;
                dpjxVar4.a |= 4;
            }
            dljh bZ3 = dlji.d.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dlji dljiVar = (dlji) bZ3.b;
            dpjx bK = bZ2.bK();
            bK.getClass();
            dljiVar.b = bK;
            dljiVar.a |= 1;
            byjeVar.q = bZ3.bK();
        } else {
            byjeVar.q = byjeVar.p.a.get(0);
        }
        byjeVar.n = byjw.LOADING;
        byjeVar.a();
        dbsk.s(byjeVar.q);
        dpjx dpjxVar5 = byjeVar.q.b;
        if (dpjxVar5 == null) {
            dpjxVar5 = dpjx.n;
        }
        amvh O = amvh.O(dpjxVar5);
        dwao b2 = byjeVar.f.b(dqvj.DRIVE, 3, vul.COMMUTE_IMMERSIVE);
        dsqp dsqpVar = (dsqp) b2.cu(5);
        dsqpVar.bC(b2);
        dowa a3 = bvsl.a(byjeVar.g);
        vum vumVar = new vum();
        vumVar.a = ((dwal) dsqpVar).bK();
        vumVar.g = a3;
        vumVar.b(g);
        vumVar.b(O);
        srv a4 = byjeVar.e.a();
        dbsk.s(a4);
        byjeVar.l = a4;
        byjeVar.l.p(vumVar.a());
    }

    public final void b() {
        byjx byjxVar = this.d;
        if (byjxVar != null) {
            byip byipVar = this.b;
            byjw byjwVar = byipVar.d;
            byje byjeVar = this.c;
            byjxVar.s(byjwVar, byjeVar.n, byjeVar.q, byipVar.c, byjeVar.m);
        }
    }

    public final byjw c() {
        if (this.g == null && (!this.i.a("android.permission.ACCESS_FINE_LOCATION") || this.h.a().h().b())) {
            return byjw.ERROR_LOCATION_DISABLED;
        }
        byjw byjwVar = this.c.n;
        byjw byjwVar2 = this.b.d;
        return (byjwVar2 == byjw.ERROR_OFFLINE || byjwVar == byjw.ERROR_OFFLINE) ? byjw.ERROR_OFFLINE : byjwVar2 == byjw.ERROR_GENERIC ? byjw.ERROR_GENERIC : (byjwVar2 == byjw.LOADING || byjwVar == byjw.LOADING) ? byjw.LOADING : (byjwVar2 == byjw.SUCCESS && byjwVar == byjw.SUCCESS) ? byjw.SUCCESS : byjw.WAITING_TO_REQUEST;
    }
}
