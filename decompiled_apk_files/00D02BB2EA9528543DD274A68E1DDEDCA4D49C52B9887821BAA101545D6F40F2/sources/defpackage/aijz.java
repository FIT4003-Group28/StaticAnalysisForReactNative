package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
import com.google.android.apps.gmm.locationsharing.api.Profile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aijz  reason: default package */
/* loaded from: classes2.dex */
public final class aijz {
    public final aiki a;
    public final akfa b;
    public final cqat c;
    public final ajfc d;
    public final aija e;
    public final aikh f;
    public final bvjj g;
    public final ailf h;
    public final aihe<aimj, aiig> i;
    public final aihe<ailh, aigm> j;
    public final aihe<ailz, aihs> k;
    public final dcba<aijy> l = dcba.a(10);
    public final Map<btlu, aijw> m = new HashMap();
    public final Map<btlu, dehn<Boolean>> n = new HashMap();
    public int o = 0;
    @dzsi
    public bvpk p = null;
    public btlu q;
    private final bvrb r;
    private final ajsj s;
    private final btvo t;
    private final aigw u;

    public aijz(bvrb bvrbVar, cqat cqatVar, btrm btrmVar, akfa akfaVar, ajsj ajsjVar, aigw aigwVar, ajfc ajfcVar, aija aijaVar, aiki aikiVar, aikh aikhVar, btvo btvoVar, bvjj bvjjVar, ailf ailfVar, aihe aiheVar, aihe aiheVar2, aihe aiheVar3) {
        this.r = bvrbVar;
        this.c = cqatVar;
        this.b = akfaVar;
        this.s = ajsjVar;
        this.u = aigwVar;
        this.d = ajfcVar;
        this.e = aijaVar;
        this.a = aikiVar;
        this.f = aikhVar;
        this.t = btvoVar;
        this.g = bvjjVar;
        this.h = ailfVar;
        this.i = aiheVar;
        this.j = aiheVar2;
        this.k = aiheVar3;
        this.q = btlu.q(akfaVar.j());
        aijx aijxVar = new aijx(this);
        dceq a = dcet.a();
        a.b(gds.class, new aika(gds.class, aijxVar, bvrj.UI_THREAD));
        btrmVar.g(aijxVar, a.a());
    }

    private final void f() {
        aijw g;
        eaow e;
        aijw g2;
        bvrj.UI_THREAD.c();
        if (this.p == null && this.o != 0) {
            if (g(this.q).h < 5) {
                bvpk a = bvpk.a(new Runnable(this) { // from class: aiju
                    private final aijz a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        aijz aijzVar = this.a;
                        aijzVar.p = null;
                        aijzVar.c(aijzVar.q, false);
                    }
                });
                this.p = a;
                if (this.a.b()) {
                    aiki aikiVar = this.a;
                    btlu btluVar = this.q;
                    for (ahwl ahwlVar : aikiVar.f(btluVar, this.f.z(btluVar))) {
                        if (ahwlVar.w()) {
                            dbsg<eaow> dbsgVar = g(this.q).e;
                            e = eaow.d(g2.a.getLocationSharingParameters().o);
                            dbsgVar.c(e);
                            break;
                        }
                    }
                }
                eaow e2 = eaow.e(g(this.q).d.c(eaow.d(g.a.getLocationSharingParameters().i)).b * ((long) Math.pow(2.0d, g.h)));
                double random = Math.random();
                double d = e2.b;
                Double.isNaN(d);
                e = eaow.e((long) (d * ((((random + random) - 1.0d) * 0.2d) + 1.0d)));
                eapv.a(easy.d(e.g()));
                this.r.a(a, bvrj.UI_THREAD, e.b);
                return;
            }
            this.a.u(this.q);
        }
    }

    private final aijw g(@dzsi btlu btluVar) {
        aijw aijwVar = this.m.get(btluVar);
        if (aijwVar == null) {
            aijw aijwVar2 = new aijw(this.t);
            this.m.put(btluVar, aijwVar2);
            return aijwVar2;
        }
        return aijwVar;
    }

    public final dehn<Boolean> a(@dzsi final btlu btluVar) {
        final deig d = deig.d();
        this.r.h().execute(new Runnable(this, d, btluVar) { // from class: aijq
            private final aijz a;
            private final deig b;
            private final btlu c;

            {
                this.a = this;
                this.b = d;
                this.c = btluVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.b.p(this.a.b(this.c));
            }
        });
        return d;
    }

    public final dehn<Boolean> b(@dzsi btlu btluVar) {
        bvrj.UI_THREAD.c();
        dehn<Boolean> c = c(btlu.q(btluVar), true);
        dbsk.s(c);
        return c;
    }

    @dzsi
    public final dehn<Boolean> c(final btlu btluVar, final boolean z) {
        boolean x;
        bvrj.UI_THREAD.c();
        final eapd eapdVar = new eapd(this.c.b());
        if (z) {
            dehn<Boolean> dehnVar = this.n.get(btluVar);
            if (dehnVar != null) {
                dehnVar.cancel(false);
                this.n.remove(btluVar);
            }
            bvpk bvpkVar = this.p;
            if (bvpkVar != null) {
                bvpkVar.b();
                this.p = null;
            }
        }
        if (this.n.get(btluVar) != null) {
            return null;
        }
        if (!z) {
            aigw aigwVar = this.u;
            if (aigwVar.b.getLocationSharingParameters().k) {
                eapd eapdVar2 = new eapd(aigwVar.a.b());
                long x2 = aigwVar.c.x(bvjk.gx, btluVar, -1L);
                if (x2 >= 0) {
                    eapd eapdVar3 = new eapd(x2);
                    if (!eapdVar3.w(eapdVar2)) {
                        if (eapdVar3.e(eaow.c(aigwVar.b.getLocationSharingParameters().l)).w(eapdVar2)) {
                            aigwVar.c(2);
                        }
                    }
                    aigwVar.b(btluVar);
                }
                long x3 = aigwVar.c.x(bvjk.gw, btluVar, -1L);
                if (x3 >= 0) {
                    eapd eapdVar4 = new eapd(x3);
                    if (!eapdVar4.w(eapdVar2)) {
                        if (eapdVar4.e(eaow.c(aigwVar.b.getLocationSharingParameters().m)).w(eapdVar2)) {
                            aigwVar.c(3);
                            return null;
                        }
                    }
                    aigwVar.b(btluVar);
                }
                aigwVar.c(4);
            }
        }
        dcdc<PersonId> z2 = this.f.z(btluVar);
        eapd eapdVar5 = g(btluVar).b;
        int i = 1;
        if (!d()) {
            x = false;
        } else if (!z2.isEmpty()) {
            x = true;
        } else {
            x = eapdVar5.e(eaow.d(this.t.getLocationSharingParameters().j)).x(new eapd(this.c.e()));
            if (x) {
                new eapd(this.c.e());
            } else {
                new eapd(this.c.e());
            }
        }
        if (!z && !x) {
            f();
            return null;
        }
        this.a.q(btluVar);
        final deig d = deig.d();
        bvrj.UI_THREAD.c();
        final aijw g = g(btluVar);
        final dwdf bZ = dwdg.h.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwdg dwdgVar = (dwdg) bZ.b;
        dwdgVar.a |= 4;
        dwdgVar.d = true;
        dwdg dwdgVar2 = (dwdg) bZ.b;
        dwdgVar2.a |= 128;
        dwdgVar2.g = true;
        if (!g.c.u()) {
            dspd dspdVar = g.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwdg dwdgVar3 = (dwdg) bZ.b;
            dspdVar.getClass();
            dwdgVar3.a |= 16;
            dwdgVar3.e = dspdVar;
        }
        if (this.a.b()) {
            dcdc<ahwl> c = this.a.c(btluVar);
            int size = c.size();
            int i2 = 0;
            while (i2 < size) {
                ahwl ahwlVar = c.get(i2);
                dqyj r = ahwlVar.r();
                if (r != null && !r.b.equals("0111001101100001011011100111010001100001")) {
                    dqzy bZ2 = dqzz.e.bZ();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dqzz dqzzVar = (dqzz) bZ2.b;
                    r.getClass();
                    dqzzVar.b = r;
                    dqzzVar.a |= i;
                    boolean y = this.f.y(btluVar, ahwlVar.q());
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dqzz dqzzVar2 = (dqzz) bZ2.b;
                    dqzzVar2.a |= 2;
                    dqzzVar2.c = y;
                    boolean x4 = this.f.x(btluVar, ahwlVar.q(), aikg.PERSON_CARD);
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dqzz dqzzVar3 = (dqzz) bZ2.b;
                    dqzzVar3.a |= 4;
                    dqzzVar3.d = x4;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dwdg dwdgVar4 = (dwdg) bZ.b;
                    dqzz bK = bZ2.bK();
                    bK.getClass();
                    dsrj<dqzz> dsrjVar = dwdgVar4.c;
                    if (!dsrjVar.a()) {
                        dwdgVar4.c = dsqw.cl(dsrjVar);
                    }
                    dwdgVar4.c.add(bK);
                }
                i2++;
                i = 1;
            }
        }
        final dehn g2 = deew.g(this.e.a(), new defg(this, bZ, btluVar, g) { // from class: aijr
            private final aijz a;
            private final dwdf b;
            private final btlu c;
            private final aijw d;

            {
                this.a = this;
                this.b = bZ;
                this.c = btluVar;
                this.d = g;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                int i3;
                String j;
                aijz aijzVar = this.a;
                dwdf dwdfVar = this.b;
                btlu btluVar2 = this.c;
                aijw aijwVar = this.d;
                Void r10 = (Void) obj;
                aija aijaVar = aijzVar.e;
                bvrj.UI_THREAD.c();
                deig<Void> deigVar = aijaVar.g;
                dbsk.l(deigVar != null && deigVar.isDone());
                ArrayList arrayList = new ArrayList();
                if (btluVar2 != null && btluVar2.l() && (j = btluVar2.j()) != null) {
                    for (ajji ajjiVar : aijaVar.d(j).K()) {
                        dobx dobxVar = ajjiVar.c;
                        if (dobxVar == null) {
                            dobxVar = dobx.d;
                        }
                        arrayList.add(dobxVar);
                    }
                }
                for (ajji ajjiVar2 : aijaVar.d("").K()) {
                    dobx dobxVar2 = ajjiVar2.c;
                    if (dobxVar2 == null) {
                        dobxVar2 = dobx.d;
                    }
                    arrayList.add(dobxVar2);
                }
                List unmodifiableList = Collections.unmodifiableList(arrayList);
                if (dwdfVar.c) {
                    dwdfVar.bF();
                    dwdfVar.c = false;
                }
                dwdg dwdgVar5 = (dwdg) dwdfVar.b;
                dwdg dwdgVar6 = dwdg.h;
                dsrj<dobx> dsrjVar2 = dwdgVar5.b;
                if (!dsrjVar2.a()) {
                    dwdgVar5.b = dsqw.cl(dsrjVar2);
                }
                dsod.bv(unmodifiableList, dwdgVar5.b);
                ajfc ajfcVar = aijzVar.d;
                if (!aijzVar.f.z(btluVar2).isEmpty()) {
                    i3 = aijwVar.f == 0 ? aijwVar.h == 0 ? 1 : 7 : aijwVar.g == 0 ? aijwVar.h == 0 ? 2 : 8 : aijwVar.h == 0 ? 3 : 9;
                } else if (aijwVar.f == 0) {
                    i3 = aijwVar.h == 0 ? 4 : 10;
                } else {
                    i3 = aijwVar.g == 0 ? aijwVar.h == 0 ? 5 : 11 : aijwVar.h == 0 ? 6 : 12;
                }
                dwdg bK2 = dwdfVar.bK();
                ((ckco) ajfcVar.c.a(ckgd.h)).a(i3 - 1);
                deig d2 = deig.d();
                boolean l = btluVar2.l();
                dsqp dsqpVar = (dsqp) bK2.cu(5);
                dsqpVar.bC(bK2);
                dwdf dwdfVar2 = (dwdf) dsqpVar;
                if (dwdfVar2.c) {
                    dwdfVar2.bF();
                    dwdfVar2.c = false;
                }
                dwdg dwdgVar7 = (dwdg) dwdfVar2.b;
                dwdgVar7.a |= 32;
                dwdgVar7.f = l;
                dwdg bK3 = dwdfVar2.bK();
                buac buacVar = ((bvct) ajfcVar.b).c;
                btyq btyqVar = buacVar.a().a;
                dsqp dsqpVar2 = (dsqp) btyqVar.cu(5);
                dsqpVar2.bC(btyqVar);
                btyp btypVar = (btyp) dsqpVar2;
                if (btypVar.c) {
                    btypVar.bF();
                    btypVar.c = false;
                }
                btyq btyqVar2 = (btyq) btypVar.b;
                btyqVar2.a |= 1;
                btyqVar2.b = l;
                buacVar.a = btypVar.bK();
                if (true == btluVar2.o()) {
                    btluVar2 = null;
                }
                buacVar.e = btluVar2;
                btzc a = ((bvct) ajfcVar.b).c().a(bK3, new ajey(d2), bvrj.UI_THREAD);
                deha.q(d2, new ajez(d2, a), ajfcVar.d.h());
                ajfcVar.d.a(new ajfa(d2, a), bvrj.UI_THREAD, ajfc.a);
                return d2;
            }
        }, this.r.h());
        final dehn<Boolean> b = deha.k(g2, this.a.a()).b(new Callable(this, g2, btluVar, g) { // from class: aijs
            private final aijz a;
            private final dehn b;
            private final btlu c;
            private final aijw d;

            {
                this.a = this;
                this.b = g2;
                this.c = btluVar;
                this.d = g;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                dwdh dwdhVar;
                aijz aijzVar = this.a;
                dehn dehnVar2 = this.b;
                btlu btluVar2 = this.c;
                aijw aijwVar = this.d;
                dwdi dwdiVar = (dwdi) deha.r(dehnVar2);
                long b2 = aijzVar.c.b() - dwdiVar.f;
                aijzVar.g.Z(bvjk.gB, b2);
                aijzVar.i.b(aimj.b, dbsg.j(btluVar2));
                dccx F = dcdc.F();
                eapd eapdVar6 = new eapd(dwdiVar.f);
                for (doep doepVar : dwdiVar.b) {
                    PersonId a = PersonId.a(doepVar);
                    if (a.c.equals(ahwj.GAIA)) {
                        dqyj dqyjVar = doepVar.c;
                        if (dqyjVar == null) {
                            dqyjVar = dqyj.f;
                        }
                        ahwk g3 = Profile.g();
                        ahuw ahuwVar = (ahuw) g3;
                        ahuwVar.a = a;
                        ahuwVar.b = aiij.j(dqyjVar.d);
                        ahuwVar.c = aiij.j(dqyjVar.e);
                        ahuwVar.d = aiij.j(dqyjVar.c);
                        F.g(new aiid(eapdVar6, g3.a()));
                    }
                }
                for (dqzv dqzvVar : dwdiVar.c) {
                    dbsg<Profile> h = aiij.h(dqzvVar);
                    if (h.a()) {
                        F.g(new aiid(eapdVar6, h.b()));
                    }
                }
                dcdc f = F.f();
                int size2 = f.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    aiig aiigVar = (aiig) f.get(i3);
                    aihe<aimj, aiig> aiheVar = aijzVar.i;
                    if (aiheVar != null) {
                        aiheVar.a(aiigVar, dbsg.j(btluVar2));
                    }
                }
                aihe<ailz, aihs> aiheVar2 = aijzVar.k;
                aily bZ3 = ailz.b.bZ();
                for (dqzv dqzvVar2 : dwdiVar.c) {
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    ailz ailzVar = (ailz) bZ3.b;
                    dqzvVar2.getClass();
                    dsrj<dqzv> dsrjVar2 = ailzVar.a;
                    if (!dsrjVar2.a()) {
                        ailzVar.a = dsqw.cl(dsrjVar2);
                    }
                    ailzVar.a.add(dqzvVar2);
                }
                aiheVar2.b(bZ3.bK(), dbsg.j(btluVar2));
                aihe<ailh, aigm> aiheVar3 = aijzVar.j;
                ailg bZ4 = ailh.b.bZ();
                bZ4.a(dwdiVar.b);
                aiheVar3.b(bZ4.bK(), dbsg.j(btluVar2));
                ailf ailfVar = aijzVar.h;
                dbsg<btlu> j = dbsg.j(btluVar2);
                dqzl dqzlVar = dwdiVar.h;
                if (dqzlVar == null) {
                    dqzlVar = dqzl.j;
                }
                ailfVar.f(j, dqzlVar);
                int i4 = 5;
                dsqp dsqpVar = (dsqp) dwdiVar.cu(5);
                dsqpVar.bC(dwdiVar);
                dwdh dwdhVar2 = (dwdh) dsqpVar;
                if (dwdhVar2.c) {
                    dwdhVar2.bF();
                    dwdhVar2.c = false;
                }
                ((dwdi) dwdhVar2.b).b = dwdi.ck();
                for (doep doepVar2 : dwdiVar.b) {
                    dsqp dsqpVar2 = (dsqp) doepVar2.cu(i4);
                    dsqpVar2.bC(doepVar2);
                    doeo doeoVar = (doeo) dsqpVar2;
                    if ((doepVar2.a & 8) != 0) {
                        dnol dnolVar = doepVar2.d;
                        if (dnolVar == null) {
                            dnolVar = dnol.g;
                        }
                        dsqp dsqpVar3 = (dsqp) dnolVar.cu(i4);
                        dsqpVar3.bC(dnolVar);
                        dnok dnokVar = (dnok) dsqpVar3;
                        dnol dnolVar2 = doepVar2.d;
                        if (dnolVar2 == null) {
                            dnolVar2 = dnol.g;
                        }
                        if ((dnolVar2.a & 4) != 0) {
                            dnol dnolVar3 = doepVar2.d;
                            if (dnolVar3 == null) {
                                dnolVar3 = dnol.g;
                            }
                            dwdhVar = dwdhVar2;
                            long j2 = dnolVar3.c + b2;
                            if (dnokVar.c) {
                                dnokVar.bF();
                                dnokVar.c = false;
                            }
                            dnol dnolVar4 = (dnol) dnokVar.b;
                            dnolVar4.a |= 4;
                            dnolVar4.c = j2;
                        } else {
                            dwdhVar = dwdhVar2;
                        }
                        dnol bK2 = dnokVar.bK();
                        if (doeoVar.c) {
                            doeoVar.bF();
                            doeoVar.c = false;
                        }
                        doep doepVar3 = (doep) doeoVar.b;
                        bK2.getClass();
                        doepVar3.d = bK2;
                        doepVar3.a |= 8;
                    } else {
                        dwdhVar = dwdhVar2;
                    }
                    if ((doepVar2.a & 64) != 0) {
                        doek doekVar = doepVar2.f;
                        if (doekVar == null) {
                            doekVar = doek.f;
                        }
                        dsqp dsqpVar4 = (dsqp) doekVar.cu(5);
                        dsqpVar4.bC(doekVar);
                        doej doejVar = (doej) dsqpVar4;
                        doek doekVar2 = doepVar2.f;
                        if (doekVar2 == null) {
                            doekVar2 = doek.f;
                        }
                        if ((doekVar2.a & 8) != 0) {
                            doek doekVar3 = doepVar2.f;
                            if (doekVar3 == null) {
                                doekVar3 = doek.f;
                            }
                            long j3 = doekVar3.e + b2;
                            if (doejVar.c) {
                                doejVar.bF();
                                doejVar.c = false;
                            }
                            doek doekVar4 = (doek) doejVar.b;
                            doekVar4.a |= 8;
                            doekVar4.e = j3;
                        }
                        if (doeoVar.c) {
                            doeoVar.bF();
                            doeoVar.c = false;
                        }
                        doep doepVar4 = (doep) doeoVar.b;
                        doek bK3 = doejVar.bK();
                        bK3.getClass();
                        doepVar4.f = bK3;
                        doepVar4.a |= 64;
                    }
                    dwdhVar2 = dwdhVar;
                    if (dwdhVar2.c) {
                        dwdhVar2.bF();
                        dwdhVar2.c = false;
                    }
                    dwdi dwdiVar2 = (dwdi) dwdhVar2.b;
                    doep bK4 = doeoVar.bK();
                    bK4.getClass();
                    dsrj<doep> dsrjVar3 = dwdiVar2.b;
                    if (!dsrjVar3.a()) {
                        dwdiVar2.b = dsqw.cl(dsrjVar3);
                    }
                    dwdiVar2.b.add(bK4);
                    i4 = 5;
                }
                if (dwdhVar2.c) {
                    dwdhVar2.bF();
                    dwdhVar2.c = false;
                }
                ((dwdi) dwdhVar2.b).c = dwdi.ck();
                for (dqzv dqzvVar3 : dwdiVar.c) {
                    dsqp dsqpVar5 = (dsqp) dqzvVar3.cu(5);
                    dsqpVar5.bC(dqzvVar3);
                    dqzo dqzoVar = (dqzo) dsqpVar5;
                    if ((dqzvVar3.a & 16) != 0) {
                        long seconds = dqzvVar3.f + TimeUnit.MILLISECONDS.toSeconds(b2);
                        if (dqzoVar.c) {
                            dqzoVar.bF();
                            dqzoVar.c = false;
                        }
                        dqzv dqzvVar4 = (dqzv) dqzoVar.b;
                        dqzvVar4.a |= 16;
                        dqzvVar4.f = seconds;
                    }
                    if (dwdhVar2.c) {
                        dwdhVar2.bF();
                        dwdhVar2.c = false;
                    }
                    dwdi dwdiVar3 = (dwdi) dwdhVar2.b;
                    dqzv bK5 = dqzoVar.bK();
                    bK5.getClass();
                    dsrj<dqzv> dsrjVar4 = dwdiVar3.c;
                    if (!dsrjVar4.a()) {
                        dwdiVar3.c = dsqw.cl(dsrjVar4);
                    }
                    dwdiVar3.c.add(bK5);
                }
                if ((dwdiVar.a & 8) != 0) {
                    long j4 = dwdiVar.f + b2;
                    if (dwdhVar2.c) {
                        dwdhVar2.bF();
                        dwdhVar2.c = false;
                    }
                    dwdi dwdiVar4 = (dwdi) dwdhVar2.b;
                    dwdiVar4.a |= 8;
                    dwdiVar4.f = j4;
                }
                dwda dwdaVar = dwdiVar.g;
                if (dwdaVar == null) {
                    dwdaVar = dwda.c;
                }
                if ((dwdaVar.a & 2) != 0) {
                    dwda dwdaVar2 = dwdiVar.g;
                    if (dwdaVar2 == null) {
                        dwdaVar2 = dwda.c;
                    }
                    dnol dnolVar5 = dwdaVar2.b;
                    if (dnolVar5 == null) {
                        dnolVar5 = dnol.g;
                    }
                    dsqp dsqpVar6 = (dsqp) dnolVar5.cu(5);
                    dsqpVar6.bC(dnolVar5);
                    dnok dnokVar2 = (dnok) dsqpVar6;
                    dwda dwdaVar3 = dwdiVar.g;
                    if (dwdaVar3 == null) {
                        dwdaVar3 = dwda.c;
                    }
                    dnol dnolVar6 = dwdaVar3.b;
                    if (dnolVar6 == null) {
                        dnolVar6 = dnol.g;
                    }
                    if ((dnolVar6.a & 4) != 0) {
                        dwda dwdaVar4 = dwdiVar.g;
                        if (dwdaVar4 == null) {
                            dwdaVar4 = dwda.c;
                        }
                        dnol dnolVar7 = dwdaVar4.b;
                        if (dnolVar7 == null) {
                            dnolVar7 = dnol.g;
                        }
                        long j5 = dnolVar7.c + b2;
                        if (dnokVar2.c) {
                            dnokVar2.bF();
                            dnokVar2.c = false;
                        }
                        dnol dnolVar8 = (dnol) dnokVar2.b;
                        dnolVar8.a |= 4;
                        dnolVar8.c = j5;
                    }
                    dwda dwdaVar5 = dwdiVar.g;
                    if (dwdaVar5 == null) {
                        dwdaVar5 = dwda.c;
                    }
                    dsqp dsqpVar7 = (dsqp) dwdaVar5.cu(5);
                    dsqpVar7.bC(dwdaVar5);
                    dwcz dwczVar = (dwcz) dsqpVar7;
                    if (dwczVar.c) {
                        dwczVar.bF();
                        dwczVar.c = false;
                    }
                    dwda dwdaVar6 = (dwda) dwczVar.b;
                    dnol bK6 = dnokVar2.bK();
                    bK6.getClass();
                    dwdaVar6.b = bK6;
                    dwdaVar6.a |= 2;
                    if (dwdhVar2.c) {
                        dwdhVar2.bF();
                        dwdhVar2.c = false;
                    }
                    dwdi dwdiVar5 = (dwdi) dwdhVar2.b;
                    dwda bK7 = dwczVar.bK();
                    bK7.getClass();
                    dwdiVar5.g = bK7;
                    dwdiVar5.a |= 16;
                }
                if ((dwdiVar.a & 64) != 0) {
                    doep doepVar5 = dwdiVar.i;
                    if (doepVar5 == null) {
                        doepVar5 = doep.i;
                    }
                    dsqp dsqpVar8 = (dsqp) doepVar5.cu(5);
                    dsqpVar8.bC(doepVar5);
                    doeo doeoVar2 = (doeo) dsqpVar8;
                    doep doepVar6 = dwdiVar.i;
                    if (doepVar6 == null) {
                        doepVar6 = doep.i;
                    }
                    if ((doepVar6.a & 8) != 0) {
                        doep doepVar7 = dwdiVar.i;
                        if (doepVar7 == null) {
                            doepVar7 = doep.i;
                        }
                        dnol dnolVar9 = doepVar7.d;
                        if (dnolVar9 == null) {
                            dnolVar9 = dnol.g;
                        }
                        dsqp dsqpVar9 = (dsqp) dnolVar9.cu(5);
                        dsqpVar9.bC(dnolVar9);
                        dnok dnokVar3 = (dnok) dsqpVar9;
                        doep doepVar8 = dwdiVar.i;
                        if (doepVar8 == null) {
                            doepVar8 = doep.i;
                        }
                        dnol dnolVar10 = doepVar8.d;
                        if (dnolVar10 == null) {
                            dnolVar10 = dnol.g;
                        }
                        if ((dnolVar10.a & 4) != 0) {
                            doep doepVar9 = dwdiVar.i;
                            if (doepVar9 == null) {
                                doepVar9 = doep.i;
                            }
                            dnol dnolVar11 = doepVar9.d;
                            if (dnolVar11 == null) {
                                dnolVar11 = dnol.g;
                            }
                            long j6 = dnolVar11.c + b2;
                            if (dnokVar3.c) {
                                dnokVar3.bF();
                                dnokVar3.c = false;
                            }
                            dnol dnolVar12 = (dnol) dnokVar3.b;
                            dnolVar12.a |= 4;
                            dnolVar12.c = j6;
                        }
                        if (doeoVar2.c) {
                            doeoVar2.bF();
                            doeoVar2.c = false;
                        }
                        doep doepVar10 = (doep) doeoVar2.b;
                        dnol bK8 = dnokVar3.bK();
                        bK8.getClass();
                        doepVar10.d = bK8;
                        doepVar10.a |= 8;
                    }
                    doep doepVar11 = dwdiVar.i;
                    if (doepVar11 == null) {
                        doepVar11 = doep.i;
                    }
                    if ((doepVar11.a & 64) != 0) {
                        doep doepVar12 = dwdiVar.i;
                        if (doepVar12 == null) {
                            doepVar12 = doep.i;
                        }
                        doek doekVar5 = doepVar12.f;
                        if (doekVar5 == null) {
                            doekVar5 = doek.f;
                        }
                        dsqp dsqpVar10 = (dsqp) doekVar5.cu(5);
                        dsqpVar10.bC(doekVar5);
                        doej doejVar2 = (doej) dsqpVar10;
                        doep doepVar13 = dwdiVar.i;
                        if (doepVar13 == null) {
                            doepVar13 = doep.i;
                        }
                        doek doekVar6 = doepVar13.f;
                        if (doekVar6 == null) {
                            doekVar6 = doek.f;
                        }
                        if ((doekVar6.a & 8) != 0) {
                            doep doepVar14 = dwdiVar.i;
                            if (doepVar14 == null) {
                                doepVar14 = doep.i;
                            }
                            doek doekVar7 = doepVar14.f;
                            if (doekVar7 == null) {
                                doekVar7 = doek.f;
                            }
                            long j7 = doekVar7.e + b2;
                            if (doejVar2.c) {
                                doejVar2.bF();
                                doejVar2.c = false;
                            }
                            doek doekVar8 = (doek) doejVar2.b;
                            doekVar8.a |= 8;
                            doekVar8.e = j7;
                        }
                        if (doeoVar2.c) {
                            doeoVar2.bF();
                            doeoVar2.c = false;
                        }
                        doep doepVar15 = (doep) doeoVar2.b;
                        doek bK9 = doejVar2.bK();
                        bK9.getClass();
                        doepVar15.f = bK9;
                        doepVar15.a |= 64;
                    }
                    if (dwdhVar2.c) {
                        dwdhVar2.bF();
                        dwdhVar2.c = false;
                    }
                    dwdi dwdiVar6 = (dwdi) dwdhVar2.b;
                    doep bK10 = doeoVar2.bK();
                    bK10.getClass();
                    dwdiVar6.i = bK10;
                    dwdiVar6.a |= 64;
                }
                dwdi bK11 = dwdhVar2.bK();
                aijwVar.b = new eapd(aijzVar.c.e());
                int i5 = bK11.e;
                if (i5 > 0) {
                    aijwVar.d = dbsg.i(eaow.d(i5));
                }
                if ((bK11.a & 2) != 0) {
                    aijwVar.c = bK11.d;
                }
                aijwVar.f++;
                aijwVar.g++;
                aijzVar.a.n(bK11, btluVar2);
                return true;
            }
        }, this.r.h());
        this.n.put(btluVar, b);
        b.Pk(new Runnable(this, b, btluVar, eapdVar, z, d) { // from class: aijt
            private final aijz a;
            private final dehn b;
            private final btlu c;
            private final eapd d;
            private final boolean e;
            private final deig f;

            {
                this.a = this;
                this.b = b;
                this.c = btluVar;
                this.d = eapdVar;
                this.e = z;
                this.f = d;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.e(this.b, this.c, this.d, this.e, this.f);
            }
        }, dege.a);
        return d;
    }

    public final boolean d() {
        return !this.s.f() && this.o != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
        if (r0 == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
        g(r11).a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
        f();
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
        if (r0 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void e(defpackage.dehn r10, defpackage.btlu r11, defpackage.eapd r12, boolean r13, defpackage.deig r14) {
        /*
            r9 = this;
            bvrj r0 = defpackage.bvrj.UI_THREAD
            r0.c()
            r0 = 1
            r1 = 0
            java.lang.Object r10 = defpackage.deha.s(r10)     // Catch: java.lang.Throwable -> L39 defpackage.deiw -> L3c java.util.concurrent.CancellationException -> L7d
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L39 defpackage.deiw -> L3c java.util.concurrent.CancellationException -> L7d
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L39 defpackage.deiw -> L3c java.util.concurrent.CancellationException -> L7d
            if (r10 == 0) goto L20
            aijw r10 = r9.g(r11)     // Catch: java.lang.Throwable -> L1a defpackage.deiw -> L1c java.util.concurrent.CancellationException -> L1e
            r10.h = r1     // Catch: java.lang.Throwable -> L1a defpackage.deiw -> L1c java.util.concurrent.CancellationException -> L1e
            goto L21
        L1a:
            r10 = move-exception
            goto L66
        L1c:
            r10 = move-exception
            goto L3e
        L1e:
            r1 = 1
            goto L7e
        L20:
            r0 = 0
        L21:
            aiki r10 = r9.a
            r10.r(r0, r11)
            java.util.Map<btlu, dehn<java.lang.Boolean>> r10 = r9.n
            r10.remove(r11)
            if (r0 != 0) goto L34
        L2d:
            aijw r10 = r9.g(r11)
            r10.a()
        L34:
            r9.f()
            r7 = 0
            goto L8a
        L39:
            r10 = move-exception
            r0 = 0
            goto L66
        L3c:
            r10 = move-exception
            r0 = 0
        L3e:
            java.lang.Throwable r2 = r10.getCause()     // Catch: java.lang.Throwable -> L1a
            boolean r3 = r2 instanceof defpackage.ajfb     // Catch: java.lang.Throwable -> L1a
            if (r3 == 0) goto L47
            goto L59
        L47:
            boolean r2 = r2 instanceof java.util.concurrent.TimeoutException     // Catch: java.lang.Throwable -> L1a
            if (r2 != 0) goto L59
            bvrb r2 = r9.r     // Catch: java.lang.Throwable -> L1a
            java.util.concurrent.Executor r2 = r2.h()     // Catch: java.lang.Throwable -> L1a
            aijv r3 = new aijv     // Catch: java.lang.Throwable -> L1a
            r3.<init>(r10)     // Catch: java.lang.Throwable -> L1a
            r2.execute(r3)     // Catch: java.lang.Throwable -> L1a
        L59:
            aiki r10 = r9.a
            r10.r(r0, r11)
            java.util.Map<btlu, dehn<java.lang.Boolean>> r10 = r9.n
            r10.remove(r11)
            if (r0 != 0) goto L34
            goto L2d
        L66:
            aiki r12 = r9.a
            r12.r(r0, r11)
            java.util.Map<btlu, dehn<java.lang.Boolean>> r12 = r9.n
            r12.remove(r11)
            if (r0 != 0) goto L79
            aijw r11 = r9.g(r11)
            r11.a()
        L79:
            r9.f()
            throw r10
        L7d:
        L7e:
            aiki r10 = r9.a
            r10.r(r1, r11)
            java.util.Map<btlu, dehn<java.lang.Boolean>> r10 = r9.n
            r10.remove(r11)
            r0 = r1
            r7 = 1
        L8a:
            dcba<aijy> r10 = r9.l
            eapd r5 = new eapd
            cqat r1 = r9.c
            long r1 = r1.b()
            r5.<init>(r1)
            aigi r1 = new aigi
            r2 = r1
            r3 = r11
            r4 = r12
            r6 = r0
            r8 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r10.add(r1)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)
            r14.j(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aijz.e(dehn, btlu, eapd, boolean, deig):void");
    }
}
