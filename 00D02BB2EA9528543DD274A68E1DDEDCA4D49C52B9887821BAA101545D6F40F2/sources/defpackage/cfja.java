package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.Base64;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.apps.gmm.base.views.map.MapViewContainer;
import com.google.android.apps.gmm.streetview.model.UserOrientation;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cfja  reason: default package */
/* loaded from: classes4.dex */
public class cfja extends cfhs implements cfhe {
    private static final dcqe t = dcqe.c("cfja");
    private final cfij A;
    private final cfjm B;
    private final bwsh C;
    private final cezt D;
    private final gga E;
    private final dddi F;
    private final cfkm G;
    private final cfks H;
    private final mw<Boolean> I;
    public final ceze e;
    public final Executor f;
    public final cezu g;
    public final dxio<hwd> h;
    public dbsg<jic> i;
    public final cfkk j;
    public final cfgv k;
    public final cfgl l;
    public cfje m;
    public dlnm n;
    @dzsi
    public MapViewContainer o;
    @dzsi
    public cqtd p;
    public boolean q;
    public boolean r;
    public boolean s;
    private final cfjv u;
    private final cfki v;
    private final cfhw w;
    private final cflc x;
    private final cfkx y;
    private final cfie z;

    public cfja(cfgm cfgmVar, dxio<hwd> dxioVar, Executor executor, cqhn cqhnVar, ceze cezeVar, cfjv cfjvVar, cfki cfkiVar, cfhw cfhwVar, cflc cflcVar, cfkx cfkxVar, cfie cfieVar, cfij cfijVar, cfks cfksVar, bwsh bwshVar, cezt ceztVar, gga ggaVar, cfkl cfklVar, cfgv cfgvVar, cqhu cqhuVar, cpv cpvVar, btvo btvoVar, cfgl cfglVar, cfjm cfjmVar, cezu cezuVar, dspd dspdVar, dlnm dlnmVar, cfhr cfhrVar, cfkj cfkjVar, @dzsi Runnable runnable, boolean z, boolean z2) {
        super(cfgmVar, cfhrVar, cpvVar);
        dlnd dlndVar;
        this.o = null;
        this.p = null;
        this.q = false;
        this.r = false;
        this.s = false;
        this.e = cezeVar;
        this.h = dxioVar;
        this.C = bwshVar;
        this.f = executor;
        this.u = cfjvVar;
        this.v = cfkiVar;
        this.w = cfhwVar;
        this.x = cflcVar;
        this.y = cfkxVar;
        this.z = cfieVar;
        this.A = cfijVar;
        this.B = cfjmVar;
        this.g = cezuVar;
        this.n = dlnmVar;
        this.i = dbpy.a;
        this.D = ceztVar;
        this.E = ggaVar;
        this.k = cfgvVar;
        this.l = cfglVar;
        dddh bZ = dddi.f.bZ();
        dspd dspdVar2 = dlnmVar.g;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dddi dddiVar = (dddi) bZ.b;
        dspdVar2.getClass();
        int i = dddiVar.a | 1;
        dddiVar.a = i;
        dddiVar.b = dspdVar2;
        dspd dspdVar3 = dlnmVar.f;
        dspdVar3.getClass();
        int i2 = i | 8;
        dddiVar.a = i2;
        dddiVar.e = dspdVar3;
        dspdVar.getClass();
        dddiVar.a = i2 | 4;
        dddiVar.d = dspdVar;
        this.F = bZ.bK();
        dspd dspdVar4 = dlnmVar.g;
        dlmc dlmcVar = dlnmVar.j;
        boolean z3 = (dlmcVar == null ? dlmc.j : dlmcVar).e;
        cqhn a = cfklVar.a.a();
        cfkl.a(a, 1);
        cfgv a2 = cfklVar.b.a();
        cfkl.a(a2, 2);
        Activity activity = (Activity) ((dxjd) cfklVar.c).a;
        cfkl.a(activity, 3);
        cfkl.a(cfkjVar, 4);
        cfkl.a(dspdVar4, 5);
        this.j = new cfkk(a, a2, activity, cfkjVar, dspdVar4, z2, z3);
        if (dlnmVar.d == 13) {
            dlndVar = (dlnd) dlnmVar.e;
        } else {
            dlndVar = dlnd.c;
        }
        this.G = new cfkm(ggaVar, dlndVar, runnable);
        this.I = new mw(this) { // from class: cfik
            private final cfja a;

            {
                this.a = this;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                this.a.j.g(!((Boolean) obj).booleanValue());
            }
        };
        this.m = C();
        this.H = cfksVar;
    }

    public final void A(cfgd cfgdVar) {
        this.I.a(false);
        this.B.a(cfgdVar);
    }

    public final void B() {
        this.m = C();
        cqkx.p(this);
    }

    final cfje C() {
        dlmm dlmmVar;
        dlms dlmsVar;
        dlmv dlmvVar;
        dlnh dlnhVar;
        dlnl dlnlVar;
        dlle dlleVar;
        int a = dlmt.a(this.n.b);
        int i = a - 1;
        if (a != 0) {
            switch (i) {
                case 0:
                    cfie cfieVar = this.z;
                    dddi dddiVar = this.F;
                    dlnm dlnmVar = this.n;
                    dspd dspdVar = dlnmVar.g;
                    if (dlnmVar.b == 3) {
                        dlmmVar = (dlmm) dlnmVar.c;
                    } else {
                        dlmmVar = dlmm.f;
                    }
                    cfjm cfjmVar = new cfjm(this) { // from class: cfiw
                        private final cfja a;

                        {
                            this.a = this;
                        }

                        @Override // defpackage.cfjm
                        public final void a(cfgd cfgdVar) {
                            this.a.A(cfgdVar);
                        }
                    };
                    cfgv a2 = cfieVar.a.a();
                    cfie.a(a2, 1);
                    cfia a3 = cfieVar.b.a();
                    cfie.a(a3, 2);
                    cfie.a(dddiVar, 3);
                    cfie.a(dspdVar, 4);
                    cfie.a(dlmmVar, 5);
                    cfie.a(cfjmVar, 6);
                    return new cfid(a2, a3, dddiVar, dspdVar, dlmmVar, cfjmVar);
                case 1:
                    cfij cfijVar = this.A;
                    dddi dddiVar2 = this.F;
                    dlnm dlnmVar2 = this.n;
                    dspd dspdVar2 = dlnmVar2.g;
                    if (dlnmVar2.b == 6) {
                        dlmsVar = (dlms) dlnmVar2.c;
                    } else {
                        dlmsVar = dlms.e;
                    }
                    cfjm cfjmVar2 = new cfjm(this) { // from class: cfix
                        private final cfja a;

                        {
                            this.a = this;
                        }

                        @Override // defpackage.cfjm
                        public final void a(cfgd cfgdVar) {
                            this.a.A(cfgdVar);
                        }
                    };
                    cfgv a4 = cfijVar.a.a();
                    cfij.a(a4, 1);
                    cfig a5 = cfijVar.b.a();
                    cfij.a(a5, 2);
                    cfij.a(dddiVar2, 3);
                    cfij.a(dspdVar2, 4);
                    cfij.a(dlmsVar, 5);
                    cfij.a(cfjmVar2, 6);
                    return new cfii(a4, a5, dddiVar2, dspdVar2, dlmsVar, cfjmVar2);
                case 2:
                    cfjv cfjvVar = this.u;
                    dddi dddiVar3 = this.F;
                    dlnm dlnmVar3 = this.n;
                    dspd dspdVar3 = dlnmVar3.g;
                    if (dlnmVar3.b == 9) {
                        dlmvVar = (dlmv) dlnmVar3.c;
                    } else {
                        dlmvVar = dlmv.f;
                    }
                    cfjm cfjmVar3 = new cfjm(this) { // from class: cfiy
                        private final cfja a;

                        {
                            this.a = this;
                        }

                        @Override // defpackage.cfjm
                        public final void a(cfgd cfgdVar) {
                            this.a.A(cfgdVar);
                        }
                    };
                    mw<Boolean> mwVar = this.I;
                    cfgv a6 = cfjvVar.a.a();
                    cfjv.a(a6, 1);
                    dxio a7 = ((dxjh) cfjvVar.b).a();
                    cfjv.a(a7, 2);
                    cfjv.a(cfjvVar.c.a(), 3);
                    cfjq a8 = cfjvVar.d.a();
                    cfjv.a(a8, 4);
                    cfjv.a(dddiVar3, 5);
                    cfjv.a(dspdVar3, 6);
                    cfjv.a(dlmvVar, 7);
                    cfjv.a(cfjmVar3, 8);
                    cfjv.a(mwVar, 9);
                    return new cfju(a6, a7, a8, dddiVar3, dspdVar3, dlmvVar, cfjmVar3, mwVar);
                case 3:
                    this.s = true;
                    dlnm dlnmVar4 = this.n;
                    cfgv cfgvVar = this.k;
                    dlmc dlmcVar = dlnmVar4.j;
                    if (dlmcVar == null) {
                        dlmcVar = dlmc.j;
                    }
                    dsqp dsqpVar = (dsqp) dlmcVar.cu(5);
                    dsqpVar.bC(dlmcVar);
                    dllf dllfVar = (dllf) dsqpVar;
                    List<dllx> unmodifiableList = Collections.unmodifiableList(((dlmc) dllfVar.b).h);
                    if (dllfVar.c) {
                        dllfVar.bF();
                        dllfVar.c = false;
                    }
                    ((dlmc) dllfVar.b).h = dlmc.ck();
                    for (dllx dllxVar : unmodifiableList) {
                        dsqp dsqpVar2 = (dsqp) dllxVar.cu(5);
                        dsqpVar2.bC(dllxVar);
                        dllu dlluVar = (dllu) dsqpVar2;
                        dbsg<cfgc> c = cfgvVar.c(dlnmVar4.g, ((dllx) dlluVar.b).e);
                        if (c.a() && (c.b().a & 2) != 0) {
                            dpum dpumVar = c.b().c;
                            if (dpumVar == null) {
                                dpumVar = dpum.d;
                            }
                            if (dlluVar.c) {
                                dlluVar.bF();
                                dlluVar.c = false;
                            }
                            dllx dllxVar2 = (dllx) dlluVar.b;
                            dpumVar.getClass();
                            dllxVar2.b = dpumVar;
                            dllxVar2.a |= 1;
                        }
                        boolean equals = ((dllx) dlluVar.b).e.equals(cfkh.f(dlnmVar4, cfgvVar).c(dspd.b));
                        if (dlluVar.c) {
                            dlluVar.bF();
                            dlluVar.c = false;
                        }
                        dllx dllxVar3 = (dllx) dlluVar.b;
                        dllxVar3.a |= 16;
                        dllxVar3.f = equals;
                        if (dllfVar.c) {
                            dllfVar.bF();
                            dllfVar.c = false;
                        }
                        dlmc dlmcVar2 = (dlmc) dllfVar.b;
                        dllx bK = dlluVar.bK();
                        bK.getClass();
                        dsrj<dllx> dsrjVar = dlmcVar2.h;
                        if (!dsrjVar.a()) {
                            dlmcVar2.h = dsqw.cl(dsrjVar);
                        }
                        dlmcVar2.h.add(bK);
                    }
                    dsqp dsqpVar3 = (dsqp) dlnmVar4.cu(5);
                    dsqpVar3.bC(dlnmVar4);
                    dlla dllaVar = (dlla) dsqpVar3;
                    if (dllaVar.c) {
                        dllaVar.bF();
                        dllaVar.c = false;
                    }
                    dlnm dlnmVar5 = (dlnm) dllaVar.b;
                    dlmc bK2 = dllfVar.bK();
                    bK2.getClass();
                    dlnmVar5.j = bK2;
                    dlnmVar5.a |= 1024;
                    dlnm bK3 = dllaVar.bK();
                    this.n = bK3;
                    cfki cfkiVar = this.v;
                    dddi dddiVar4 = this.F;
                    Runnable runnable = new Runnable(this) { // from class: cfil
                        private final cfja a;

                        {
                            this.a = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.B();
                        }
                    };
                    Runnable runnable2 = new Runnable(this) { // from class: cfim
                        private final cfja a;

                        {
                            this.a = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.B();
                        }
                    };
                    mw<Boolean> mwVar2 = this.I;
                    Resources a9 = cfkiVar.a.a();
                    cfki.a(a9, 1);
                    cqhu a10 = cfkiVar.b.a();
                    cfki.a(a10, 2);
                    cfgv a11 = cfkiVar.c.a();
                    cfki.a(a11, 3);
                    dxio a12 = ((dxjh) cfkiVar.d).a();
                    cfki.a(a12, 4);
                    cjnf a13 = cfkiVar.e.a();
                    cfki.a(a13, 5);
                    gce a14 = cfkiVar.f.a();
                    cfki.a(a14, 6);
                    cfjy a15 = cfkiVar.g.a();
                    cfki.a(a15, 7);
                    cfhy a16 = cfkiVar.h.a();
                    cfki.a(a16, 8);
                    cfki.a(dddiVar4, 9);
                    cfki.a(bK3, 10);
                    cfki.a(runnable, 11);
                    cfki.a(runnable2, 12);
                    cfki.a(mwVar2, 13);
                    return new cfkh(a9, a10, a11, a12, a13, a14, a15, a16, dddiVar4, bK3, runnable, runnable2, mwVar2);
                case 4:
                    cfkx cfkxVar = this.y;
                    dddi dddiVar5 = this.F;
                    dlnm dlnmVar6 = this.n;
                    dspd dspdVar4 = dlnmVar6.g;
                    if (dlnmVar6.b == 10) {
                        dlnhVar = (dlnh) dlnmVar6.c;
                    } else {
                        dlnhVar = dlnh.d;
                    }
                    cfjm cfjmVar4 = new cfjm(this) { // from class: cfin
                        private final cfja a;

                        {
                            this.a = this;
                        }

                        @Override // defpackage.cfjm
                        public final void a(cfgd cfgdVar) {
                            this.a.A(cfgdVar);
                        }
                    };
                    cezu cezuVar = this.g;
                    cfgv a17 = cfkxVar.a.a();
                    cfkx.a(a17, 1);
                    cfku a18 = cfkxVar.b.a();
                    cfkx.a(a18, 2);
                    cfkx.a(dddiVar5, 3);
                    cfkx.a(dspdVar4, 4);
                    cfkx.a(dlnhVar, 5);
                    cfkx.a(cfjmVar4, 6);
                    cfkx.a(cezuVar, 7);
                    return new cfkw(a17, a18, dddiVar5, dspdVar4, dlnhVar, cfjmVar4, cezuVar);
                case 5:
                    cflc cflcVar = this.x;
                    dddi dddiVar6 = this.F;
                    dlnm dlnmVar7 = this.n;
                    dspd dspdVar5 = dlnmVar7.g;
                    if (dlnmVar7.b == 15) {
                        dlnlVar = (dlnl) dlnmVar7.c;
                    } else {
                        dlnlVar = dlnl.c;
                    }
                    mw<Boolean> mwVar3 = this.I;
                    cfkz a19 = cflcVar.a.a();
                    cflc.a(a19, 1);
                    cflc.a(dddiVar6, 2);
                    cflc.a(dspdVar5, 3);
                    cflc.a(dlnlVar, 4);
                    cflc.a(mwVar3, 5);
                    return new cflb(a19, dddiVar6, dspdVar5, dlnlVar, mwVar3);
                case 6:
                    cfhw cfhwVar = this.w;
                    dddi dddiVar7 = this.F;
                    dlnm dlnmVar8 = this.n;
                    dspd dspdVar6 = dlnmVar8.g;
                    if (dlnmVar8.b == 11) {
                        dlleVar = (dlle) dlnmVar8.c;
                    } else {
                        dlleVar = dlle.c;
                    }
                    cfjm cfjmVar5 = new cfjm(this) { // from class: cfio
                        private final cfja a;

                        {
                            this.a = this;
                        }

                        @Override // defpackage.cfjm
                        public final void a(cfgd cfgdVar) {
                            this.a.A(cfgdVar);
                        }
                    };
                    mw<Boolean> mwVar4 = this.I;
                    cfhw.a(cfhwVar.a.a(), 1);
                    cfgv a20 = cfhwVar.b.a();
                    cfhw.a(a20, 2);
                    cfhw.a(dddiVar7, 3);
                    cfhw.a(dspdVar6, 4);
                    cfhw.a(dlleVar, 5);
                    cfhw.a(cfjmVar5, 6);
                    cfhw.a(mwVar4, 7);
                    return new cfhv(a20, dddiVar7, dspdVar6, dlleVar, cfjmVar5, mwVar4);
                default:
                    bvoo.h("Unrecognized question type in post-trip. Question ID was %s", Base64.encode(this.n.g.G(), 0));
                    return new cfje();
            }
        }
        throw null;
    }

    @Override // defpackage.cfhe
    public cqfc g() {
        return new cqfc(this) { // from class: cfir
            private final cfja a;

            {
                this.a = this;
            }

            @Override // defpackage.cqfc
            public final void a(View view, boolean z) {
                akqs akqsVar;
                akqs akqsVar2;
                cfja cfjaVar = this.a;
                if (view instanceof MapViewContainer) {
                    cfjaVar.o = (MapViewContainer) view;
                    boolean z2 = cfjaVar.r;
                    if (!z2) {
                        cfjaVar.o.h(cfjaVar.h.a());
                        cfjaVar.r = true;
                    }
                    if (z2 && !cfjaVar.s) {
                        return;
                    }
                    ceze cezeVar = cfjaVar.e;
                    dlmc dlmcVar = cfjaVar.n.j;
                    if (dlmcVar == null) {
                        dlmcVar = dlmc.j;
                    }
                    cfgl cfglVar = cfjaVar.l;
                    dlnm dlnmVar = cfjaVar.n;
                    dbsg<cfgd> e = cfjaVar.k.e(dlnmVar.g);
                    boolean z3 = !z2;
                    if ((dlnmVar.a & 512) != 0) {
                        dpuq dpuqVar = dlnmVar.i;
                        if (dpuqVar == null) {
                            dpuqVar = dpuq.d;
                        }
                        akqsVar = new akqs(dpuqVar);
                    } else {
                        dlmc dlmcVar2 = dlnmVar.j;
                        if (dlmcVar2 == null) {
                            dlmcVar2 = dlmc.j;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (dllp dllpVar : dlmcVar2.g) {
                            dpum dpumVar = dllpVar.a;
                            if (dpumVar == null) {
                                dpumVar = dpum.d;
                            }
                            arrayList.add(akra.f(akqq.f(dpumVar)));
                        }
                        for (dllx dllxVar : dlmcVar2.h) {
                            dpum dpumVar2 = dllxVar.b;
                            if (dpumVar2 == null) {
                                dpumVar2 = dpum.d;
                            }
                            arrayList.add(akra.f(akqq.f(dpumVar2)));
                        }
                        for (dlln dllnVar : dlmcVar2.f) {
                            dvzn dvznVar = dllnVar.b;
                            if (dvznVar == null) {
                                dvznVar = dvzn.e;
                            }
                            arrayList.addAll(akrk.h(dvznVar).q());
                        }
                        if (!arrayList.isEmpty()) {
                            akqsVar = akrk.e(arrayList).b();
                        } else {
                            akqsVar = new akqs();
                        }
                    }
                    int a = dlmt.a(dlnmVar.b);
                    int i = a - 1;
                    if (a == 0) {
                        throw null;
                    }
                    if (i == 2) {
                        if (e.a() && (e.b().a & 4) != 0) {
                            dpum dpumVar3 = e.b().e;
                            if (dpumVar3 == null) {
                                dpumVar3 = dpum.d;
                            }
                            akqsVar2 = new akqs(akqq.f(dpumVar3), akqo.a(akqsVar), akqo.b(akqsVar));
                            akqsVar = akqsVar2;
                        }
                        cezeVar.e(dlmcVar, akqsVar, cfjaVar.m.i(), cfjaVar.m.k());
                    }
                    if (i == 3) {
                        dlmc dlmcVar3 = dlnmVar.j;
                        if (dlmcVar3 == null) {
                            dlmcVar3 = dlmc.j;
                        }
                        dbsg r = dcbg.b(dlmcVar3.h).r(cfgk.a);
                        if (r.a()) {
                            if (!z3) {
                                akqsVar = akyx.l(cfglVar.a.a().p(), cfglVar.a.a().y() - 200, cfglVar.a.a().z() - 250, cfglVar.a.a().B());
                            }
                            dpum dpumVar4 = ((dllx) r.b()).b;
                            if (dpumVar4 == null) {
                                dpumVar4 = dpum.d;
                            }
                            akqsVar2 = new akqs(akqq.f(dpumVar4), akqo.a(akqsVar), akqo.b(akqsVar));
                            akqsVar = akqsVar2;
                        }
                    }
                    cezeVar.e(dlmcVar, akqsVar, cfjaVar.m.i(), cfjaVar.m.k());
                }
            }
        };
    }

    @Override // defpackage.cfhe
    public cflf h() {
        return new cflf(this) { // from class: cfis
            private final cfja a;

            {
                this.a = this;
            }

            @Override // defpackage.cflf
            public final void a() {
                this.a.m.h().a();
            }
        };
    }

    @Override // defpackage.cfhe
    @dzsi
    public cqtd i() {
        return this.p;
    }

    @Override // defpackage.cfhe
    @dzsi
    public cfgz j() {
        return this.m.j();
    }

    @Override // defpackage.cfhe
    public Boolean k() {
        dlmc dlmcVar = this.n.j;
        if (dlmcVar == null) {
            dlmcVar = dlmc.j;
        }
        return Boolean.valueOf(dlmcVar.e);
    }

    @Override // defpackage.cfhe
    public Boolean l() {
        boolean z = false;
        if (this.i.a() && !dbsj.d(this.i.b().a)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cfhe
    @dzsi
    public jic m() {
        return this.i.f();
    }

    @Override // defpackage.cfhe
    public cqkl n() {
        if (this.i.a()) {
            dlmc dlmcVar = this.n.j;
            if (dlmcVar == null) {
                dlmcVar = dlmc.j;
            }
            dlmb dlmbVar = dlmcVar.i;
            if (dlmbVar == null) {
                dlmbVar = dlmb.c;
            }
            dpum dpumVar = dlmbVar.b;
            if (dpumVar == null) {
                dpumVar = dpum.d;
            }
            dbsg<dhjx> d = this.D.d(dpumVar);
            dbsg<dggg> c = this.D.c(dpumVar);
            if (d.a() && c.a()) {
                bwsh bwshVar = this.C;
                dggg b = c.b();
                dhjz dhjzVar = d.b().b;
                if (dhjzVar == null) {
                    dhjzVar = dhjz.e;
                }
                bwshVar.p(b, akqq.j(dhjzVar), new UserOrientation(d.b()));
                this.r = false;
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.cfhe
    @dzsi
    public cfgy o() {
        int a = dlmt.a(this.n.b);
        if (a != 0) {
            if (a == 7) {
                return (cfhv) this.m;
            }
            return null;
        }
        throw null;
    }

    @Override // defpackage.cfhe
    public Boolean p() {
        return Boolean.valueOf(this.m.l());
    }

    @Override // defpackage.cfhe
    public jar q() {
        cfks cfksVar = this.H;
        boolean l = this.m.l();
        Runnable runnable = new Runnable(this) { // from class: cfiv
            private final cfja a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cfja cfjaVar = this.a;
                cfgv cfgvVar = cfjaVar.k;
                dspd dspdVar = cfjaVar.n.g;
                for (int i = 0; i < ((cfgj) cfgvVar.a.b).g.size(); i++) {
                    if (dspdVar.equals(cfgvVar.a.a(i).b)) {
                        cfgi cfgiVar = cfgvVar.a;
                        if (cfgiVar.c) {
                            cfgiVar.bF();
                            cfgiVar.c = false;
                        }
                        cfgj cfgjVar = (cfgj) cfgiVar.b;
                        cfgjVar.c();
                        cfgjVar.g.remove(i);
                    }
                }
                cfgv cfgvVar2 = cfjaVar.k;
                dspd dspdVar2 = cfjaVar.n.g;
                dlno dlnoVar = ((cfgj) cfgvVar2.a.b).b;
                if (dlnoVar == null) {
                    dlnoVar = dlno.f;
                }
                cfjaVar.n = (dlnm) dcbg.b(dlnoVar.c).r(new dbsl(dspdVar2) { // from class: cfgq
                    private final dspd a;

                    {
                        this.a = dspdVar2;
                    }

                    @Override // defpackage.dbsl
                    public final boolean a(Object obj) {
                        return ((dlnm) obj).g.equals(this.a);
                    }
                }).c(cfjaVar.n);
                cfjaVar.B();
            }
        };
        gga a = cfksVar.a.a();
        cfks.a(a, 1);
        cfks.a(runnable, 3);
        return new cfkr(a, l, runnable);
    }

    @Override // defpackage.cfhs
    public final boolean s() {
        return super.s() || this.q;
    }

    @Override // defpackage.cfhs
    public final void w(final Runnable runnable) {
        View view;
        EditText editText;
        if (s()) {
            return;
        }
        this.s = false;
        InputMethodManager inputMethodManager = (InputMethodManager) this.E.getSystemService("input_method");
        fd K = this.E.K();
        if (K != null && (view = K.P) != null && (editText = (EditText) cqhu.a(view, cezw.a)) != null) {
            editText.clearFocus();
            inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }
        MapViewContainer mapViewContainer = this.o;
        if (mapViewContainer == null) {
            runnable.run();
            return;
        }
        akox l = mapViewContainer.l();
        if (l == null) {
            runnable.run();
            return;
        }
        this.q = true;
        l.aj().ah().b(new bnte(this, runnable) { // from class: cfit
            private final cfja a;
            private final Runnable b;

            {
                this.a = this;
                this.b = runnable;
            }

            @Override // defpackage.bnte
            public final ByteBuffer c(int i) {
                return null;
            }

            @Override // defpackage.bnte
            public final void f(Bitmap bitmap) {
                cfja cfjaVar = this.a;
                Runnable runnable2 = this.b;
                if (bitmap != null) {
                    cfjaVar.p = cqtt.a(bitmap);
                } else {
                    cfjaVar.p = null;
                }
                cfjaVar.f.execute(new Runnable(cfjaVar, runnable2) { // from class: cfip
                    private final cfja a;
                    private final Runnable b;

                    {
                        this.a = cfjaVar;
                        this.b = runnable2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        cfja cfjaVar2 = this.a;
                        this.b.run();
                        cfjaVar2.q = false;
                    }
                });
            }

            @Override // defpackage.bnte
            public final Bitmap g(int i, int i2) {
                return null;
            }
        });
    }

    @Override // defpackage.cfhs
    public final void x() {
        this.m.h().a();
    }

    public void y() {
        dlmc dlmcVar = this.n.j;
        if (dlmcVar == null) {
            dlmcVar = dlmc.j;
        }
        if ((dlmcVar.a & 16) != 0) {
            cezt ceztVar = this.D;
            dlmc dlmcVar2 = this.n.j;
            if (dlmcVar2 == null) {
                dlmcVar2 = dlmc.j;
            }
            dlmb dlmbVar = dlmcVar2.i;
            if (dlmbVar == null) {
                dlmbVar = dlmb.c;
            }
            dpum dpumVar = dlmbVar.b;
            if (dpumVar == null) {
                dpumVar = dpum.d;
            }
            ceztVar.g(dpumVar, new cfiq(this));
        }
    }

    @Override // defpackage.cfhe
    /* renamed from: z */
    public cfkk f() {
        return this.j;
    }

    @Override // defpackage.cfhe
    public void d(cqiv cqivVar) {
        int i = this.n.d;
        int i2 = i != 0 ? i != 13 ? i != 14 ? 0 : 2 : 1 : 3;
        int i3 = i2 - 1;
        if (i2 != 0) {
            if (i3 == 0) {
                cqivVar.a(new cffz(), this.G);
                return;
            } else if (i3 == 1) {
                cqivVar.c(new cfiz(this));
                return;
            } else {
                bvoo.h("Unrecognized header type in post-trip. Question ID was %s", Base64.encode(this.n.g.G(), 0));
                return;
            }
        }
        throw null;
    }

    @Override // defpackage.cfhe
    public void e(cqiv cqivVar) {
        int a = dlmt.a(this.n.b);
        int i = a - 1;
        if (a == 0) {
            throw null;
        }
        switch (i) {
            case 0:
                cqivVar.a(new cfbp(), (cfid) this.m);
                return;
            case 1:
                cqivVar.a(new cfcb(), (cfii) this.m);
                return;
            case 2:
                cqivVar.a(new cfbp(), (cfju) this.m);
                return;
            case 3:
                cqivVar.a(new cfdr(), (cfkh) this.m);
                return;
            case 4:
                cqivVar.a(new cfek(), (cfkw) this.m);
                return;
            case 5:
                cqivVar.a(new cfew(), (cflb) this.m);
                return;
            case 6:
                return;
            default:
                bvoo.h("Unrecognized question type in post-trip. Question ID was %s", Base64.encode(this.n.g.G(), 0));
                return;
        }
    }
}
