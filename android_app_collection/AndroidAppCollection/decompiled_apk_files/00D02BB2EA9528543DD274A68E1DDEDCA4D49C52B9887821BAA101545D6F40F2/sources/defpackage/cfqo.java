package defpackage;

import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: cfqo  reason: default package */
/* loaded from: classes4.dex */
public final class cfqo extends hxf implements egq {
    public acyp ad;
    public cfvz ae;
    public cklq af;
    public dxio<ixr> ag;
    public dxio<akfa> ah;
    public cgcv ai;
    public cfwr aj;
    public cgak ak;
    public dxio<acwo> al;
    public dehq am;
    public cqkf<cfra> an;
    public cfrb ao;
    private final cfqm ap = new cfqm();
    private final cfqn aq = new cfqn(this);
    private cqkf<?> ar;
    public cqkj b;
    public cfrc c;
    public aedv d;
    public efg e;
    public cfrq f;
    public btpc g;

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        cqkf<cfra> cqkfVar = this.an;
        dbsk.s(cqkfVar);
        cqkfVar.e(null);
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(Object obj) {
        if (obj != null) {
            cfrb cfrbVar = this.ao;
            dbsk.s(cfrbVar);
            if (cfrbVar.E(obj)) {
            }
        }
    }

    @Override // defpackage.egq
    public final void Qs(egu eguVar) {
        cklq cklqVar = this.af;
        dbsk.s(cklqVar);
        cklt ckltVar = cklt.UGC_TAB_LAYOUT;
        dcdc e = dcdc.e();
        cxdh cxdhVar = cklqVar.d;
        if (cxdhVar == null) {
            return;
        }
        cklqVar.b.execute(new cklp(cklqVar.a, cklo.END_TO_FIRST_CONTENT, ckltVar, e, cklqVar.c, cxdhVar.c(), cklqVar.e));
        cklqVar.e = null;
    }

    @Override // defpackage.ges, defpackage.ggg
    public final /* bridge */ /* synthetic */ List aO() {
        return this.o.getBoolean("has_fragment_search_tag", false) ? dcdc.f(gfs.HOMETAB) : dcdc.e();
    }

    public final cfrb aR() {
        cfrc cfrcVar = this.c;
        dbsk.s(cfrcVar);
        Runnable runnable = new Runnable(this) { // from class: cfqc
            private final cfqo a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cfqo cfqoVar = this.a;
                cfrq cfrqVar = cfqoVar.f;
                dbsk.s(cfrqVar);
                cfrqVar.e.b((gga) cfqoVar.J());
            }
        };
        Runnable runnable2 = new Runnable(this) { // from class: cfqd
            private final cfqo a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cfqo cfqoVar = this.a;
                cgcv cgcvVar = cfqoVar.ai;
                dbsk.s(cgcvVar);
                if (cgcvVar.a()) {
                    cfrq cfrqVar = cfqoVar.f;
                    dbsk.s(cfrqVar);
                    cfrqVar.h.a();
                    z<cgcr> zVar = cfrqVar.u;
                    cgcr h = zVar.h();
                    dbsk.s(h);
                    zVar.g(cfrqVar.j(h));
                    return;
                }
                cfvz cfvzVar = cfqoVar.ae;
                dbsk.s(cfvzVar);
                cfvzVar.a();
            }
        };
        Runnable runnable3 = new Runnable(this) { // from class: cfqe
            private final cfqo a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.aT();
            }
        };
        cqhn a = cfrcVar.a.a();
        cfrc.a(a, 1);
        cgbl a2 = cfrcVar.b.a();
        cfrc.a(a2, 2);
        cfyp a3 = cfrcVar.c.a();
        cfrc.a(a3, 3);
        cfzb a4 = cfrcVar.d.a();
        cfrc.a(a4, 4);
        cfso a5 = cfrcVar.e.a();
        cfrc.a(a5, 5);
        cfvt a6 = cfrcVar.f.a();
        cfrc.a(a6, 6);
        cftd a7 = cfrcVar.g.a();
        cfrc.a(a7, 7);
        cfth a8 = cfrcVar.h.a();
        cfrc.a(a8, 8);
        bzrc a9 = cfrcVar.i.a();
        cfrc.a(a9, 9);
        cfxj a10 = cfrcVar.j.a();
        cfrc.a(a10, 10);
        acyp a11 = cfrcVar.k.a();
        cfrc.a(a11, 11);
        btvo a12 = cfrcVar.l.a();
        cfrc.a(a12, 12);
        cgcv a13 = cfrcVar.m.a();
        cfrc.a(a13, 13);
        ccct a14 = cfrcVar.n.a();
        cfrc.a(a14, 14);
        cfrc.a(this, 15);
        cfrc.a(runnable, 16);
        cfrc.a(runnable2, 17);
        cfrc.a(runnable3, 18);
        return new cfrb(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, this, runnable, runnable2, runnable3);
    }

    public final void aS() {
        cfrq cfrqVar = this.f;
        dbsk.s(cfrqVar);
        cfrqVar.w = true;
        cfrqVar.g.c = new z<>();
        cfvz cfvzVar = cfrqVar.h;
        cfvzVar.a = new z<>();
        cfvzVar.b = new z<>();
        cfvzVar.b();
        cgak cgakVar = cfrqVar.i;
        cgakVar.a = new z<>();
        cgakVar.b = new HashMap<>();
        cfrqVar.f();
        dbsk.s(this.ao);
        z<List<dwmk>> zVar = this.f.i.a;
        final cfrb cfrbVar = this.ao;
        cfrbVar.getClass();
        zVar.b(this, new aa(cfrbVar) { // from class: cfqf
            private final cfrb a;

            {
                this.a = cfrbVar;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                this.a.p((List) obj);
            }
        });
        x<List<dwue>> xVar = this.f.m;
        final cfrb cfrbVar2 = this.ao;
        cfrbVar2.getClass();
        xVar.b(this, new aa(cfrbVar2) { // from class: cfqg
            private final cfrb a;

            {
                this.a = cfrbVar2;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                this.a.q((List) obj);
            }
        });
        v<cqeo> vVar = this.f.r;
        final cfrb cfrbVar3 = this.ao;
        cfrbVar3.getClass();
        vVar.b(this, new aa(cfrbVar3) { // from class: cfqh
            private final cfrb a;

            {
                this.a = cfrbVar3;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                this.a.t((cqeo) obj);
            }
        });
        v<dwtu> vVar2 = this.f.q;
        final cfrb cfrbVar4 = this.ao;
        cfrbVar4.getClass();
        vVar2.b(this, new aa(cfrbVar4) { // from class: cfqi
            private final cfrb a;

            {
                this.a = cfrbVar4;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                this.a.u((dwtu) obj);
            }
        });
        cgcv cgcvVar = this.ai;
        dbsk.s(cgcvVar);
        if (cgcvVar.a()) {
            z<cgcr> zVar2 = this.f.u;
            final cfrb cfrbVar5 = this.ao;
            cfrbVar5.getClass();
            zVar2.b(this, new aa(cfrbVar5) { // from class: cfqj
                private final cfrb a;

                {
                    this.a = cfrbVar5;
                }

                @Override // defpackage.aa
                public final void m(Object obj) {
                    this.a.x((cgcr) obj);
                }
            });
            z<cgbt> zVar3 = this.f.s;
            final cfrb cfrbVar6 = this.ao;
            cfrbVar6.getClass();
            zVar3.b(this, new aa(cfrbVar6) { // from class: cfqk
                private final cfrb a;

                {
                    this.a = cfrbVar6;
                }

                @Override // defpackage.aa
                public final void m(Object obj) {
                    this.a.y((cgbt) obj);
                }
            });
            z<cgci> zVar4 = this.f.t;
            final cfrb cfrbVar7 = this.ao;
            cfrbVar7.getClass();
            zVar4.b(this, new aa(cfrbVar7) { // from class: cfps
                private final cfrb a;

                {
                    this.a = cfrbVar7;
                }

                @Override // defpackage.aa
                public final void m(Object obj) {
                    this.a.z((cgci) obj);
                }
            });
            z<cgcg> zVar5 = this.f.h.b;
            final cfrb cfrbVar8 = this.ao;
            cfrbVar8.getClass();
            zVar5.b(this, new aa(cfrbVar8) { // from class: cfpt
                private final cfrb a;

                {
                    this.a = cfrbVar8;
                }

                @Override // defpackage.aa
                public final void m(Object obj) {
                    this.a.A((cgcg) obj);
                }
            });
            z<cgby> zVar6 = this.f.g.c;
            final cfrb cfrbVar9 = this.ao;
            cfrbVar9.getClass();
            zVar6.b(this, new aa(cfrbVar9) { // from class: cfpu
                private final cfrb a;

                {
                    this.a = cfrbVar9;
                }

                @Override // defpackage.aa
                public final void m(Object obj) {
                    this.a.B((cgby) obj);
                }
            });
        } else {
            x<dqam> xVar2 = this.f.n;
            final cfrb cfrbVar10 = this.ao;
            cfrbVar10.getClass();
            xVar2.b(this, new aa(cfrbVar10) { // from class: cfpv
                private final cfrb a;

                {
                    this.a = cfrbVar10;
                }

                @Override // defpackage.aa
                public final void m(Object obj) {
                    this.a.r((dqam) obj);
                }
            });
            z<dqwa> zVar7 = this.f.o;
            final cfrb cfrbVar11 = this.ao;
            cfrbVar11.getClass();
            zVar7.b(this, new aa(cfrbVar11) { // from class: cfpw
                private final cfrb a;

                {
                    this.a = cfrbVar11;
                }

                @Override // defpackage.aa
                public final void m(Object obj) {
                    this.a.s((dqwa) obj);
                }
            });
            cfvz cfvzVar2 = this.ae;
            dbsk.s(cfvzVar2);
            z<Boolean> zVar8 = cfvzVar2.a;
            final cfrb cfrbVar12 = this.ao;
            cfrbVar12.getClass();
            zVar8.b(this, new aa(cfrbVar12) { // from class: cfpx
                private final cfrb a;

                {
                    this.a = cfrbVar12;
                }

                @Override // defpackage.aa
                public final void m(Object obj) {
                    this.a.w(((Boolean) obj).booleanValue());
                }
            });
        }
        cfqm cfqmVar = this.ap;
        final cfrb cfrbVar13 = this.ao;
        dbsk.s(cfrbVar13);
        cfrbVar13.getClass();
        cfqmVar.b(this, new aa(cfrbVar13) { // from class: cfpy
            private final cfrb a;

            {
                this.a = cfrbVar13;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                this.a.v(((Boolean) obj).booleanValue());
            }
        });
        this.ap.b(this, new aa(this) { // from class: cfpz
            private final cfqo a;

            {
                this.a = this;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                cfqo cfqoVar = this.a;
                if (!((Boolean) obj).booleanValue()) {
                    return;
                }
                cfqoVar.aT();
            }
        });
    }

    public final void aT() {
        cfrq cfrqVar = this.f;
        dbsk.s(cfrqVar);
        if (cfrqVar.f.a()) {
            int d = cfrqVar.d();
            if (d <= 0) {
                dixm dixmVar = dixm.b;
                cfrqVar.v.g(dixmVar);
                cfrqVar.i.a(dixmVar.a);
            } else {
                buqf buqfVar = cfrqVar.y;
                dixj bZ = dixk.b.bZ();
                djvi bZ2 = djvj.e.bZ();
                dqjx bZ3 = dqjy.j.bZ();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dqjy dqjyVar = (dqjy) bZ3.b;
                dqjyVar.a |= 2;
                dqjyVar.c = false;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                djvj djvjVar = (djvj) bZ2.b;
                dqjy bK = bZ3.bK();
                bK.getClass();
                djvjVar.d = bK;
                djvjVar.a |= 8;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                djvj djvjVar2 = (djvj) bZ2.b;
                djvjVar2.a |= 2;
                djvjVar2.c = d;
                djvk bZ4 = djvl.c.bZ();
                drrx drrxVar = drrx.RATING;
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                djvl djvlVar = (djvl) bZ4.b;
                djvlVar.b = Integer.valueOf(drrxVar.i);
                djvlVar.a = 1;
                djvl bK2 = bZ4.bK();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                djvj djvjVar3 = (djvj) bZ2.b;
                bK2.getClass();
                djvjVar3.b = bK2;
                djvjVar3.a |= 1;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dixk dixkVar = (dixk) bZ.b;
                djvj bK3 = bZ2.bK();
                bK3.getClass();
                dsrj<djvj> dsrjVar = dixkVar.a;
                if (!dsrjVar.a()) {
                    dixkVar.a = dsqw.cl(dsrjVar);
                }
                dixkVar.a.add(bK3);
                buqfVar.b(bZ.bK(), new cfrm(cfrqVar), cfrqVar.a);
            }
        }
        if (cfrqVar.i()) {
            cfrqVar.g();
        } else if (!cfrqVar.f.a()) {
            buva buvaVar = cfrqVar.x;
            int d2 = cfrqVar.d();
            dwtk bZ5 = dwtl.d.bZ();
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dwtl dwtlVar = (dwtl) bZ5.b;
            dwtlVar.a |= 1;
            dwtlVar.b = d2;
            cfrqVar.k.P(bZ5);
            dwtj dwtjVar = (dwtj) dwtm.l.bZ();
            if (dwtjVar.c) {
                dwtjVar.bF();
                dwtjVar.c = false;
            }
            dwtm dwtmVar = (dwtm) dwtjVar.b;
            dwtmVar.a |= 128;
            dwtmVar.i = false;
            dwtl bK4 = bZ5.bK();
            bK4.getClass();
            dwtmVar.k = bK4;
            dwtmVar.a |= 512;
            dpvl bZ6 = dpvm.c.bZ();
            dpne bZ7 = dpnf.c.bZ();
            if (bZ7.c) {
                bZ7.bF();
                bZ7.c = false;
            }
            dpnf dpnfVar = (dpnf) bZ7.b;
            dpnfVar.b = 1;
            dpnfVar.a |= 1;
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            dpvm dpvmVar = (dpvm) bZ6.b;
            dpnf bK5 = bZ7.bK();
            bK5.getClass();
            dsrj<dpnf> dsrjVar2 = dpvmVar.a;
            if (!dsrjVar2.a()) {
                dpvmVar.a = dsqw.cl(dsrjVar2);
            }
            dpvmVar.a.add(bK5);
            dpnb bZ8 = dpnc.c.bZ();
            if (bZ8.c) {
                bZ8.bF();
                bZ8.c = false;
            }
            dpnc dpncVar = (dpnc) bZ8.b;
            dpncVar.b = 1;
            dpncVar.a |= 1;
            bZ6.a(bZ8);
            dpnb bZ9 = dpnc.c.bZ();
            if (bZ9.c) {
                bZ9.bF();
                bZ9.c = false;
            }
            dpnc dpncVar2 = (dpnc) bZ9.b;
            dpncVar2.b = 2;
            dpncVar2.a |= 1;
            bZ6.a(bZ9);
            dpnb bZ10 = dpnc.c.bZ();
            if (bZ10.c) {
                bZ10.bF();
                bZ10.c = false;
            }
            dpnc dpncVar3 = (dpnc) bZ10.b;
            dpncVar3.b = 3;
            dpncVar3.a |= 1;
            bZ6.a(bZ10);
            dpnb bZ11 = dpnc.c.bZ();
            if (bZ11.c) {
                bZ11.bF();
                bZ11.c = false;
            }
            dpnc dpncVar4 = (dpnc) bZ11.b;
            dpncVar4.b = 4;
            dpncVar4.a |= 1;
            bZ6.a(bZ11);
            dpnb bZ12 = dpnc.c.bZ();
            if (bZ12.c) {
                bZ12.bF();
                bZ12.c = false;
            }
            dpnc dpncVar5 = (dpnc) bZ12.b;
            dpncVar5.b = 5;
            dpncVar5.a = 1 | dpncVar5.a;
            bZ6.a(bZ12);
            if (dwtjVar.c) {
                dwtjVar.bF();
                dwtjVar.c = false;
            }
            dwtm dwtmVar2 = (dwtm) dwtjVar.b;
            dpvm bK6 = bZ6.bK();
            bK6.getClass();
            dwtmVar2.g = bK6;
            dwtmVar2.a |= 16;
            buvaVar.b((dwtm) dwtjVar.bK(), new cfro(cfrqVar), cfrqVar.a);
        } else {
            bvcc bvccVar = cfrqVar.z;
            diad bZ13 = diae.d.bZ();
            dqqb bZ14 = dqqc.i.bZ();
            dqqh bZ15 = dqqk.b.bZ();
            dcdc i = dcdc.i(cgbm.a(2), cgbm.a(3), cgbm.a(4), cgbm.a(5));
            if (bZ15.c) {
                bZ15.bF();
                bZ15.c = false;
            }
            dqqk dqqkVar = (dqqk) bZ15.b;
            dsrj<dqqj> dsrjVar3 = dqqkVar.a;
            if (!dsrjVar3.a()) {
                dqqkVar.a = dsqw.cl(dsrjVar3);
            }
            dsod.bv(i, dqqkVar.a);
            if (bZ14.c) {
                bZ14.bF();
                bZ14.c = false;
            }
            dqqc dqqcVar = (dqqc) bZ14.b;
            dqqk bK7 = bZ15.bK();
            bK7.getClass();
            dqqcVar.b = bK7;
            dqqcVar.a |= 1;
            dqqp bZ16 = dqqs.b.bZ();
            dqqq bZ17 = dqqr.c.bZ();
            if (bZ17.c) {
                bZ17.bF();
                bZ17.c = false;
            }
            dqqr dqqrVar = (dqqr) bZ17.b;
            dqqrVar.b = 1;
            dqqrVar.a |= 1;
            dcdc f = dcdc.f(bZ17.bK());
            if (bZ16.c) {
                bZ16.bF();
                bZ16.c = false;
            }
            dqqs dqqsVar = (dqqs) bZ16.b;
            dsrj<dqqr> dsrjVar4 = dqqsVar.a;
            if (!dsrjVar4.a()) {
                dqqsVar.a = dsqw.cl(dsrjVar4);
            }
            dsod.bv(f, dqqsVar.a);
            if (bZ14.c) {
                bZ14.bF();
                bZ14.c = false;
            }
            dqqc dqqcVar2 = (dqqc) bZ14.b;
            dqqs bK8 = bZ16.bK();
            bK8.getClass();
            dqqcVar2.c = bK8;
            dqqcVar2.a |= 2;
            dqra bZ18 = dqrb.c.bZ();
            drnt bZ19 = drnu.d.bZ();
            dcdc g = dcdc.g(cgbm.c(2), cgbm.c(3));
            if (bZ19.c) {
                bZ19.bF();
                bZ19.c = false;
            }
            drnu drnuVar = (drnu) bZ19.b;
            dsrj<drly> dsrjVar5 = drnuVar.a;
            if (!dsrjVar5.a()) {
                drnuVar.a = dsqw.cl(dsrjVar5);
            }
            dsod.bv(g, drnuVar.a);
            dcdc j = dcdc.j(cgbm.d(2), cgbm.d(3), cgbm.d(4), cgbm.d(5), cgbm.d(6));
            if (bZ19.c) {
                bZ19.bF();
                bZ19.c = false;
            }
            drnu drnuVar2 = (drnu) bZ19.b;
            dsrj<drlt> dsrjVar6 = drnuVar2.b;
            if (!dsrjVar6.a()) {
                drnuVar2.b = dsqw.cl(dsrjVar6);
            }
            dsod.bv(j, drnuVar2.b);
            drnc bZ20 = drnd.c.bZ();
            if (bZ20.c) {
                bZ20.bF();
                bZ20.c = false;
            }
            drnd drndVar = (drnd) bZ20.b;
            drndVar.b = 1;
            drndVar.a |= 1;
            dcdc f2 = dcdc.f(bZ20.bK());
            if (bZ19.c) {
                bZ19.bF();
                bZ19.c = false;
            }
            drnu drnuVar3 = (drnu) bZ19.b;
            dsrj<drnd> dsrjVar7 = drnuVar3.c;
            if (!dsrjVar7.a()) {
                drnuVar3.c = dsqw.cl(dsrjVar7);
            }
            dsod.bv(f2, drnuVar3.c);
            if (bZ18.c) {
                bZ18.bF();
                bZ18.c = false;
            }
            dqrb dqrbVar = (dqrb) bZ18.b;
            drnu bK9 = bZ19.bK();
            bK9.getClass();
            dqrbVar.b = bK9;
            dqrbVar.a |= 1;
            dqrb bK10 = bZ18.bK();
            if (bZ14.c) {
                bZ14.bF();
                bZ14.c = false;
            }
            dqqc dqqcVar3 = (dqqc) bZ14.b;
            bK10.getClass();
            dqqcVar3.d = bK10;
            dqqcVar3.a |= 4;
            dqrh dqrhVar = dqrh.a;
            if (bZ14.c) {
                bZ14.bF();
                bZ14.c = false;
            }
            dqqc dqqcVar4 = (dqqc) bZ14.b;
            dqrhVar.getClass();
            dqqcVar4.e = dqrhVar;
            dqqcVar4.a |= 8;
            dqrm bZ21 = dqrp.b.bZ();
            dcdc i2 = dcdc.i(cgbm.b(2), cgbm.b(3), cgbm.b(4), cgbm.b(5));
            if (bZ21.c) {
                bZ21.bF();
                bZ21.c = false;
            }
            dqrp dqrpVar = (dqrp) bZ21.b;
            dsrj<dqro> dsrjVar8 = dqrpVar.a;
            if (!dsrjVar8.a()) {
                dqrpVar.a = dsqw.cl(dsrjVar8);
            }
            dsod.bv(i2, dqrpVar.a);
            if (bZ14.c) {
                bZ14.bF();
                bZ14.c = false;
            }
            dqqc dqqcVar5 = (dqqc) bZ14.b;
            dqrp bK11 = bZ21.bK();
            bK11.getClass();
            dqqcVar5.f = bK11;
            dqqcVar5.a |= 16;
            dqrt dqrtVar = dqrt.a;
            if (bZ14.c) {
                bZ14.bF();
                bZ14.c = false;
            }
            dqqc dqqcVar6 = (dqqc) bZ14.b;
            dqrtVar.getClass();
            dqqcVar6.g = dqrtVar;
            dqqcVar6.a |= 32;
            dqrx dqrxVar = dqrx.a;
            if (bZ14.c) {
                bZ14.bF();
                bZ14.c = false;
            }
            dqqc dqqcVar7 = (dqqc) bZ14.b;
            dqrxVar.getClass();
            dqqcVar7.h = dqrxVar;
            dqqcVar7.a |= 64;
            dqqc bK12 = bZ14.bK();
            if (bZ13.c) {
                bZ13.bF();
                bZ13.c = false;
            }
            diae diaeVar = (diae) bZ13.b;
            bK12.getClass();
            diaeVar.b = bK12;
            diaeVar.a = 1 | diaeVar.a;
            dnqg bZ22 = dnqh.p.bZ();
            dnmu dnmuVar = dnmu.PROPERTY_GMM;
            if (bZ22.c) {
                bZ22.bF();
                bZ22.c = false;
            }
            dnqh dnqhVar = (dnqh) bZ22.b;
            dnqhVar.l = dnmuVar.ap;
            dnqhVar.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
            int i3 = ddda.cD.b;
            if (bZ22.c) {
                bZ22.bF();
                bZ22.c = false;
            }
            dnqh dnqhVar2 = (dnqh) bZ22.b;
            dnqhVar2.a |= 64;
            dnqhVar2.g = i3;
            dnqh bK13 = bZ22.bK();
            if (bZ13.c) {
                bZ13.bF();
                bZ13.c = false;
            }
            diae diaeVar2 = (diae) bZ13.b;
            bK13.getClass();
            diaeVar2.c = bK13;
            diaeVar2.a = 2 | diaeVar2.a;
            bvccVar.b(bZ13.bK(), new cfrp(cfrqVar), cfrqVar.a);
        }
    }

    @Override // defpackage.hxf, defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        acyp acypVar = this.ad;
        dbsk.s(acypVar);
        if (acypVar.f()) {
            return i(layoutInflater, bundle);
        }
        return super.ag(layoutInflater, viewGroup, bundle);
    }

    @Override // defpackage.fd
    public final void ah(View view, Bundle bundle) {
        view.setPadding(0, 0, 0, aece.a.e(H()));
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        cgak cgakVar = this.ak;
        dbsk.s(cgakVar);
        cgakVar.d();
        super.am();
    }

    @Override // defpackage.hxf
    protected final jib g() {
        acyp acypVar = this.ad;
        dbsk.s(acypVar);
        dklk dklkVar = acypVar.e().c;
        if (dklkVar == null) {
            dklkVar = dklk.c;
        }
        int a = dklj.a(dklkVar.b);
        int i = R.string.CONTRIBUTE_TAB_BUTTON;
        if (a != 0 && a == 3) {
            i = R.string.POST_TAB_BUTTON;
        }
        acyp acypVar2 = this.ad;
        dbsk.s(acypVar2);
        dklk dklkVar2 = acypVar2.e().c;
        if (dklkVar2 == null) {
            dklkVar2 = dklk.c;
        }
        int a2 = dklj.a(dklkVar2.b);
        int i2 = R.string.CONTRIBUTE_PAGE_TITLE_CONTENT_DESCRIPTION;
        if (a2 != 0 && a2 == 3) {
            i2 = R.string.POST_PAGE_TITLE_CONTENT_DESCRIPTION;
        }
        jhz a3 = jhz.a();
        a3.a = Ro(i);
        a3.n = Ro(i2);
        a3.i = null;
        a3.f(null);
        a3.j = null;
        return a3.b();
    }

    @Override // defpackage.hxf
    protected final View i(LayoutInflater layoutInflater, Bundle bundle) {
        aedv aedvVar = this.d;
        dbsk.s(aedvVar);
        this.ar = aedvVar.d(null);
        cqkj cqkjVar = this.b;
        dbsk.s(cqkjVar);
        cqkf<cfra> e = cqkjVar.e(new cfqz());
        this.an = e;
        e.e(this.ao);
        return this.an.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(Bundle bundle) {
        super.l(bundle);
        this.ao = aR();
        aS();
        cfwr cfwrVar = this.aj;
        dbsk.s(cfwrVar);
        final cfwp<cfwq> cfwpVar = cfwrVar.a;
        final aa aaVar = new aa(this) { // from class: cfqa
            private final cfqo a;

            {
                this.a = this;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                cfqo cfqoVar = this.a;
                ckos.a(cfqoVar.J().findViewById(16908290), ((cfwq) obj).a().a(cfqoVar.H()), 0).c();
            }
        };
        if (cfwpVar.c.k()) {
            bvoo.h("One active observer already exists. Only one observer should subscribe at any given moment.", new Object[0]);
        }
        cfwpVar.c.b(this, new aa(cfwpVar, aaVar) { // from class: cfwo
            private final cfwp a;
            private final aa b;

            {
                this.a = cfwpVar;
                this.b = aaVar;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                cfwp cfwpVar2 = this.a;
                aa aaVar2 = this.b;
                if (cfwpVar2.b.compareAndSet(true, false)) {
                    aaVar2.m(obj);
                }
            }
        });
        btpc btpcVar = this.g;
        dbsk.s(btpcVar);
        z<NetworkInfo> zVar = btpcVar.c;
        final cfqm cfqmVar = this.ap;
        cfqmVar.getClass();
        zVar.b(this, new aa(cfqmVar) { // from class: cfpr
            private final cfqm a;

            {
                this.a = cfqmVar;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                this.a.m((NetworkInfo) obj);
            }
        });
        cgak cgakVar = this.ak;
        dbsk.s(cgakVar);
        cgakVar.c();
        if (bundle != null) {
            this.ao.C(bundle.getBundle("vm"));
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxl.er;
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        aedv aedvVar = this.d;
        dbsk.s(aedvVar);
        aedvVar.b(this);
        this.d.g(dktk.CONTRIBUTE);
        acyp acypVar = this.ad;
        dbsk.s(acypVar);
        if (acypVar.f()) {
            dxio<akfa> dxioVar = this.ah;
            dbsk.s(dxioVar);
            crzm<btlu> C = dxioVar.a().C();
            cfqn cfqnVar = this.aq;
            dehq dehqVar = this.am;
            dbsk.s(dehqVar);
            C.a(cfqnVar, dehqVar);
        }
        cfrq cfrqVar = this.f;
        dbsk.s(cfrqVar);
        cfrqVar.c();
        efg efgVar = this.e;
        dbsk.s(efgVar);
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        egjVar.w(this.P);
        egjVar.av((View) dbsg.j(this.ar).h(cfqb.a).f());
        egjVar.au();
        egjVar.J(this);
        acyp acypVar2 = this.ad;
        dbsk.s(acypVar2);
        if (acypVar2.f()) {
            dxio<ixr> dxioVar2 = this.ag;
            dbsk.s(dxioVar2);
            ixr a = dxioVar2.a();
            a.o(false);
            a.ak(false);
            a.al(true);
            egjVar.Z();
            egjVar.W(a);
        }
        acyp acypVar3 = this.ad;
        dbsk.s(acypVar3);
        if (acypVar3.g()) {
            egjVar.h();
        }
        efgVar.a(egjVar.a());
        dxio<acwo> dxioVar3 = this.al;
        dbsk.s(dxioVar3);
        dxioVar3.a().i(dvum.CONTRIBUTE_TAB, null);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        cfrb cfrbVar = this.ao;
        dbsk.s(cfrbVar);
        bundle.putBundle("vm", cfrbVar.D());
        super.t(bundle);
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void u() {
        aedv aedvVar = this.d;
        dbsk.s(aedvVar);
        aedvVar.c(this);
        acyp acypVar = this.ad;
        dbsk.s(acypVar);
        if (acypVar.f()) {
            dxio<akfa> dxioVar = this.ah;
            dbsk.s(dxioVar);
            dxioVar.a().C().c(this.aq);
        }
        super.u();
    }
}
