package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cfrq  reason: default package */
/* loaded from: classes4.dex */
public final class cfrq implements cccs {
    private final bvjj A;
    private final btvo B;
    public final Executor a;
    public final Executor b;
    public final akfa c;
    public final ccie d;
    public final bzyk e;
    public final cgcv f;
    public final cfur g;
    public final cfvz h;
    public final cgak i;
    public final cfry j;
    public final axjh k;
    public final axhq l;
    public x<List<dwue>> m;
    public x<dqam> n;
    public z<dqwa> o;
    public z<dwul> p;
    public v<dwtu> q;
    public v<cqeo> r;
    public z<cgbt> s;
    public z<cgci> t;
    public z<cgcr> u;
    public z<dixm> v;
    public boolean w = false;
    public final buva x;
    public final buqf y;
    public final bvcc z;

    public cfrq(Executor executor, Executor executor2, akfa akfaVar, buva buvaVar, ccie ccieVar, cfry cfryVar, bzyl bzylVar, axjh axjhVar, axhq axhqVar, cgcv cgcvVar, buqf buqfVar, bvcc bvccVar, bvjj bvjjVar, cfur cfurVar, cfvz cfvzVar, cgak cgakVar, btvo btvoVar) {
        this.a = executor;
        this.b = executor2;
        this.c = akfaVar;
        this.x = buvaVar;
        this.d = ccieVar;
        this.j = cfryVar;
        this.k = axjhVar;
        this.l = axhqVar;
        this.e = bzylVar.a(dgyd.MAPS_HOME_SCREEN_CONTRIBUTE_TAB);
        this.f = cgcvVar;
        this.y = buqfVar;
        this.z = bvccVar;
        this.A = bvjjVar;
        this.g = cfurVar;
        this.h = cfvzVar;
        this.i = cgakVar;
        this.B = btvoVar;
        f();
        if (i()) {
            g();
        }
    }

    @Override // defpackage.cccs
    public final cccr a() {
        return this.g.a();
    }

    @Override // defpackage.cccs
    public final void b() {
    }

    public final void c() {
        final cfry cfryVar = this.j;
        cfsa cfsaVar = cfryVar.f;
        if (cfsaVar != null) {
            if (cfryVar.b(cfsaVar)) {
                cfryVar.d.g(cfryVar.f);
            } else {
                cfryVar.d.g(null);
            }
        } else {
            cfryVar.c.execute(new Runnable(cfryVar) { // from class: cfrv
                private final cfry a;

                {
                    this.a = cfryVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cfry cfryVar2 = this.a;
                    cfsa a = cfryVar2.b.a();
                    if (a == null || !cfryVar2.b(a)) {
                        cfryVar2.a(null);
                        return;
                    }
                    cfryVar2.f = a;
                    cfryVar2.a(a);
                }
            });
        }
        if (!this.w) {
            this.b.execute(new Runnable(this) { // from class: cfrd
                private final cfrq a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.e();
                }
            });
        }
        btlu j = this.c.j();
        dbsk.s(j);
        if (j.l()) {
            this.e.a(j);
        }
    }

    public final int d() {
        dhpm dhpmVar = this.B.getContributionsPageParameters().i;
        if (dhpmVar == null) {
            dhpmVar = dhpm.c;
        }
        return dhpmVar.b;
    }

    public final void e() {
        final dqwa a = this.d.a();
        this.a.execute(new Runnable(this, a) { // from class: cfre
            private final cfrq a;
            private final dqwa b;

            {
                this.a = this;
                this.b = a;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cfrq cfrqVar = this.a;
                cfrqVar.o.g(this.b);
            }
        });
    }

    public final void f() {
        this.o = new z<>();
        this.p = new z<>();
        this.v = new z<>();
        this.q = am.a(this.p, cfrj.a);
        this.m = new x<>();
        final x<dqam> xVar = new x<>();
        this.n = xVar;
        cfry cfryVar = this.j;
        z<dwul> zVar = this.p;
        final x<List<dwue>> xVar2 = this.m;
        xVar2.m(cfryVar.d, new aa(xVar2) { // from class: cfrf
            private final x a;

            {
                this.a = xVar2;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                x xVar3 = this.a;
                cfsa cfsaVar = (cfsa) obj;
                if (cfsaVar == null || xVar3.h() != 0) {
                    return;
                }
                xVar3.g(cfsaVar.c);
            }
        });
        xVar2.m(zVar, new aa(xVar2) { // from class: cfrg
            private final x a;

            {
                this.a = xVar2;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                this.a.g(((dwul) obj).s);
            }
        });
        xVar.m(cfryVar.d, new aa(xVar) { // from class: cfrh
            private final x a;

            {
                this.a = xVar;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                x xVar3 = this.a;
                cfsa cfsaVar = (cfsa) obj;
                if (cfsaVar == null || xVar3.h() != 0) {
                    return;
                }
                dqam dqamVar = cfsaVar.d;
                if (dqamVar == null) {
                    dqamVar = dqam.g;
                }
                xVar3.g(dqamVar);
            }
        });
        xVar.m(zVar, new aa(xVar) { // from class: cfri
            private final x a;

            {
                this.a = xVar;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                x xVar3 = this.a;
                dwul dwulVar = (dwul) obj;
                if ((dwulVar.a & 131072) != 0) {
                    dqam dqamVar = dwulVar.q;
                    if (dqamVar == null) {
                        dqamVar = dqam.g;
                    }
                    xVar3.g(dqamVar);
                }
            }
        });
        this.r = this.e.a;
        this.u = new z<>();
        this.s = new z<>();
        this.t = new z<>();
    }

    public final void g() {
        cgcl bZ = cgcr.b.bZ();
        cgcm bZ2 = cgcq.e.bZ();
        cgch bZ3 = cgci.d.bZ();
        dqvz bZ4 = dqwa.g.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dqwa dqwaVar = (dqwa) bZ4.b;
        dqwaVar.a |= 8;
        dqwaVar.f = "UgcTab Refactor User";
        dqvv bZ5 = dqvy.h.bZ();
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dqvy dqvyVar = (dqvy) bZ5.b;
        dqvyVar.a |= 1;
        dqvyVar.b = 1234567;
        dqvy dqvyVar2 = (dqvy) bZ5.b;
        dqvyVar2.g = 1;
        int i = dqvyVar2.a | 256;
        dqvyVar2.a = i;
        dqvyVar2.a = i | 16;
        dqvyVar2.d = 9;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dqwa dqwaVar2 = (dqwa) bZ4.b;
        dqvy bK = bZ5.bK();
        bK.getClass();
        dqwaVar2.c = bK;
        dqwaVar2.a |= 1;
        dqwb bZ6 = dqwe.f.bZ();
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        dqwe dqweVar = (dqwe) bZ6.b;
        dqweVar.a |= 16;
        dqweVar.e = "https://maps.gstatic.com/mapfiles/localguides/badges/72px/level4.png";
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dqwa dqwaVar3 = (dqwa) bZ4.b;
        dqwe bK2 = bZ6.bK();
        bK2.getClass();
        dqwaVar3.d = bK2;
        dqwaVar3.a |= 2;
        dqvr bZ7 = dqvu.h.bZ();
        if (bZ7.c) {
            bZ7.bF();
            bZ7.c = false;
        }
        dqvu dqvuVar = (dqvu) bZ7.b;
        dqvuVar.a |= 8;
        dqvuVar.e = 20;
        bZ4.a(bZ7);
        dqvr bZ8 = dqvu.h.bZ();
        if (bZ8.c) {
            bZ8.bF();
            bZ8.c = false;
        }
        dqvu dqvuVar2 = (dqvu) bZ8.b;
        dqvuVar2.a |= 8;
        dqvuVar2.e = 22;
        bZ4.a(bZ8);
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        cgci cgciVar = (cgci) bZ3.b;
        dqwa bK3 = bZ4.bK();
        bK3.getClass();
        cgciVar.b = bK3;
        cgciVar.a |= 1;
        dqaf bZ9 = dqam.g.bZ();
        dqag bZ10 = dqah.e.bZ();
        if (bZ10.c) {
            bZ10.bF();
            bZ10.c = false;
        }
        dqah dqahVar = (dqah) bZ10.b;
        dqahVar.a |= 2;
        dqahVar.c = 1234;
        if (bZ9.c) {
            bZ9.bF();
            bZ9.c = false;
        }
        dqam dqamVar = (dqam) bZ9.b;
        dqah bK4 = bZ10.bK();
        bK4.getClass();
        dqamVar.d = bK4;
        dqamVar.a |= 4;
        dqak bZ11 = dqal.e.bZ();
        if (bZ11.c) {
            bZ11.bF();
            bZ11.c = false;
        }
        dqal dqalVar = (dqal) bZ11.b;
        dqalVar.a |= 1;
        dqalVar.b = true;
        if (bZ9.c) {
            bZ9.bF();
            bZ9.c = false;
        }
        dqam dqamVar2 = (dqam) bZ9.b;
        dqal bK5 = bZ11.bK();
        bK5.getClass();
        dqamVar2.c = bK5;
        dqamVar2.b = 1;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        cgci cgciVar2 = (cgci) bZ3.b;
        dqam bK6 = bZ9.bK();
        bK6.getClass();
        cgciVar2.c = bK6;
        cgciVar2.a |= 2;
        cgci bK7 = bZ3.bK();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        cgcq cgcqVar = (cgcq) bZ2.b;
        bK7.getClass();
        cgcqVar.c = bK7;
        cgcqVar.b = 6;
        bZ.b(bZ2);
        cgcm bZ12 = cgcq.e.bZ();
        cgco b = cgcv.b(24);
        if (bZ12.c) {
            bZ12.bF();
            bZ12.c = false;
        }
        cgcq cgcqVar2 = (cgcq) bZ12.b;
        b.getClass();
        cgcqVar2.d = b;
        cgcqVar2.a |= 256;
        cgbq bZ13 = cgbt.b.bZ();
        bZ13.a(Arrays.asList(cgcv.d(2, "EDIT MAP", "<b>Edit the map</b> to keep roads and addresses accurate"), cgcv.d(3, "ADD PLACE", "<b>Add a missing</b> place to keep your local area up tp date"), cgcv.d(4, "WRITE REVIEW", "<b>Write a review</b> to share your feedback about a place"), cgcv.d(5, "ADD PHOTO", "<b>Add a photo</b> to show others what a place looks like")));
        cgbt bK8 = bZ13.bK();
        if (bZ12.c) {
            bZ12.bF();
            bZ12.c = false;
        }
        cgcq cgcqVar3 = (cgcq) bZ12.b;
        bK8.getClass();
        cgcqVar3.c = bK8;
        cgcqVar3.b = 1;
        bZ.b(bZ12);
        cgcm bZ14 = cgcq.e.bZ();
        cgco b2 = cgcv.b(16);
        if (bZ14.c) {
            bZ14.bF();
            bZ14.c = false;
        }
        cgcq cgcqVar4 = (cgcq) bZ14.b;
        b2.getClass();
        cgcqVar4.d = b2;
        cgcqVar4.a |= 256;
        cgcd bZ15 = cgcg.e.bZ();
        bZ15.a(Arrays.asList(cgcv.e(2, "<b>Edit the map</b> to keep roads and addresses accurate"), cgcv.e(3, "<b>Add a missing</b> place to keep your local area up tp date"), cgcv.e(4, "<b>Write a review</b> to share your feedback about a place"), cgcv.e(5, "<b>Add a photo</b> to show others what a place looks like")));
        if (bZ15.c) {
            bZ15.bF();
            bZ15.c = false;
        }
        cgcg cgcgVar = (cgcg) bZ15.b;
        int i2 = cgcgVar.a | 1;
        cgcgVar.a = i2;
        cgcgVar.b = "Help people everywhere";
        cgcgVar.a = i2 | 2;
        cgcgVar.c = "Share the things you know and love on Google Maps";
        cgcg bK9 = bZ15.bK();
        if (bZ14.c) {
            bZ14.bF();
            bZ14.c = false;
        }
        cgcq cgcqVar5 = (cgcq) bZ14.b;
        bK9.getClass();
        cgcqVar5.c = bK9;
        cgcqVar5.b = 5;
        bZ.b(bZ14);
        cgcm bZ16 = cgcq.e.bZ();
        cgco b3 = cgcv.b(16);
        if (bZ16.c) {
            bZ16.bF();
            bZ16.c = false;
        }
        cgcq cgcqVar6 = (cgcq) bZ16.b;
        b3.getClass();
        cgcqVar6.d = b3;
        cgcqVar6.a |= 256;
        drnr bZ17 = drns.c.bZ();
        drmy bZ18 = drmz.c.bZ();
        if (bZ18.c) {
            bZ18.bF();
            bZ18.c = false;
        }
        drmz drmzVar = (drmz) bZ18.b;
        drmzVar.a |= 1;
        drmzVar.b = "https://www.google.com/search?q=local+guide+program&ibp=gwp;0,12,IgYSBBgCIAE=&pcl=lp";
        drmz bK10 = bZ18.bK();
        if (bZ17.c) {
            bZ17.bF();
            bZ17.c = false;
        }
        drns drnsVar = (drns) bZ17.b;
        bK10.getClass();
        drnsVar.b = bK10;
        drnsVar.a = 3;
        drns bK11 = bZ17.bK();
        drnm bZ19 = drnn.d.bZ();
        if (bZ19.c) {
            bZ19.bF();
            bZ19.c = false;
        }
        drnn drnnVar = (drnn) bZ19.b;
        drnnVar.a |= 1;
        drnnVar.b = "https://www.gstatic.com/local/guides/app-campaigns/2020-04-covid-riddler-questions/images/riddler-questions-contribute.png";
        drnn bK12 = bZ19.bK();
        drmm bZ20 = drmr.h.bZ();
        if (bZ20.c) {
            bZ20.bF();
            bZ20.c = false;
        }
        drmr drmrVar = (drmr) bZ20.b;
        drmrVar.a |= 1;
        drmrVar.b = "Your contributions have";
        drmr drmrVar2 = (drmr) bZ20.b;
        drmrVar2.a |= 2;
        drmrVar2.c = "905k views";
        drmr drmrVar3 = (drmr) bZ20.b;
        bK12.getClass();
        drmrVar3.e = bK12;
        int i3 = drmrVar3.a | 8;
        drmrVar3.a = i3;
        drmrVar3.a = i3 | 32;
        drmrVar3.g = "See contributions";
        drmr bK13 = bZ20.bK();
        drms bZ21 = drmv.f.bZ();
        if (bZ21.c) {
            bZ21.bF();
            bZ21.c = false;
        }
        drmv drmvVar = (drmv) bZ21.b;
        int i4 = drmvVar.a | 1;
        drmvVar.a = i4;
        drmvVar.b = "card text";
        bK12.getClass();
        drmvVar.c = bK12;
        int i5 = i4 | 8;
        drmvVar.a = i5;
        drmvVar.a = i5 | 32;
        drmvVar.e = "button text";
        drmv bK14 = bZ21.bK();
        drms bZ22 = drmv.f.bZ();
        if (bZ22.c) {
            bZ22.bF();
            bZ22.c = false;
        }
        drmv drmvVar2 = (drmv) bZ22.b;
        int i6 = drmvVar2.a | 1;
        drmvVar2.a = i6;
        drmvVar2.b = "A long description to make this card higher than all other card.";
        bK12.getClass();
        drmvVar2.c = bK12;
        int i7 = i6 | 8;
        drmvVar2.a = i7;
        drmvVar2.a = i7 | 32;
        drmvVar2.e = "This would help to demonstrate if the carousel works correctly when the heighest card is off-screen.";
        drmv bK15 = bZ22.bK();
        drno bZ23 = drnp.j.bZ();
        if (bZ23.c) {
            bZ23.bF();
            bZ23.c = false;
        }
        drnp drnpVar = (drnp) bZ23.b;
        drnpVar.a |= 32;
        drnpVar.g = false;
        drnp drnpVar2 = (drnp) bZ23.b;
        drnpVar2.a |= 1;
        drnpVar2.b = 1;
        drnv bZ24 = drnx.c.bZ();
        if (bZ24.c) {
            bZ24.bF();
            bZ24.c = false;
        }
        drnx drnxVar = (drnx) bZ24.b;
        bK14.getClass();
        drnxVar.b = bK14;
        drnxVar.a = 1;
        if (bZ23.c) {
            bZ23.bF();
            bZ23.c = false;
        }
        drnp drnpVar3 = (drnp) bZ23.b;
        drnx bK16 = bZ24.bK();
        bK16.getClass();
        drnpVar3.d = bK16;
        drnpVar3.a |= 4;
        if (bZ23.c) {
            bZ23.bF();
            bZ23.c = false;
        }
        drnp drnpVar4 = (drnp) bZ23.b;
        bK11.getClass();
        drnpVar4.e = bK11;
        drnpVar4.a |= 8;
        drnp bK17 = bZ23.bK();
        drlv bZ25 = drlw.e.bZ();
        if (bZ25.c) {
            bZ25.bF();
            bZ25.c = false;
        }
        drlw drlwVar = (drlw) bZ25.b;
        drlwVar.a |= 1;
        drlwVar.b = "https://www.gstatic.com/local/guides/app-campaigns/assets/shopping-campaign-card.png";
        drlw bK18 = bZ25.bK();
        drlv bZ26 = drlw.e.bZ();
        dgap bZ27 = dgaq.d.bZ();
        if (bZ27.c) {
            bZ27.bF();
            bZ27.c = false;
        }
        dgaq dgaqVar = (dgaq) bZ27.b;
        dgaqVar.a |= 1;
        dgaqVar.b = -16776961;
        dgaq dgaqVar2 = (dgaq) bZ27.b;
        dgaqVar2.a |= 2;
        dgaqVar2.c = -256;
        if (bZ26.c) {
            bZ26.bF();
            bZ26.c = false;
        }
        drlw drlwVar2 = (drlw) bZ26.b;
        dgaq bK19 = bZ27.bK();
        bK19.getClass();
        drlwVar2.d = bK19;
        drlwVar2.a |= 4;
        drlw bK20 = bZ26.bK();
        drnj c = cgcv.c("InfoCardKey1");
        drnj c2 = cgcv.c("InfoCardKey2");
        drnj c3 = cgcv.c("InfoCardKey3");
        cgbx bZ28 = cgby.b.bZ();
        dsqp dsqpVar = (dsqp) bK17.cu(5);
        dsqpVar.bC(bK17);
        drno drnoVar = (drno) dsqpVar;
        drnv bZ29 = drnx.c.bZ();
        if (bZ29.c) {
            bZ29.bF();
            bZ29.c = false;
        }
        drnx drnxVar2 = (drnx) bZ29.b;
        bK13.getClass();
        drnxVar2.b = bK13;
        drnxVar2.a = 2;
        if (drnoVar.c) {
            drnoVar.bF();
            drnoVar.c = false;
        }
        drnp drnpVar5 = (drnp) drnoVar.b;
        drnx bK21 = bZ29.bK();
        bK21.getClass();
        drnpVar5.d = bK21;
        drnpVar5.a |= 4;
        bZ28.b(drnoVar.bK());
        dsqp dsqpVar2 = (dsqp) bK17.cu(5);
        dsqpVar2.bC(bK17);
        drno drnoVar2 = (drno) dsqpVar2;
        if (drnoVar2.c) {
            drnoVar2.bF();
            drnoVar2.c = false;
        }
        drnp drnpVar6 = (drnp) drnoVar2.b;
        bK18.getClass();
        drnpVar6.h = bK18;
        int i8 = drnpVar6.a | 64;
        drnpVar6.a = i8;
        c.getClass();
        drnpVar6.f = c;
        drnpVar6.a = i8 | 16;
        bZ28.b(drnoVar2.bK());
        dsqp dsqpVar3 = (dsqp) bK17.cu(5);
        dsqpVar3.bC(bK17);
        drno drnoVar3 = (drno) dsqpVar3;
        if (drnoVar3.c) {
            drnoVar3.bF();
            drnoVar3.c = false;
        }
        drnp drnpVar7 = (drnp) drnoVar3.b;
        bK20.getClass();
        drnpVar7.h = bK20;
        int i9 = drnpVar7.a | 64;
        drnpVar7.a = i9;
        c2.getClass();
        drnpVar7.f = c2;
        drnpVar7.a = i9 | 16;
        bZ28.b(drnoVar3.bK());
        dsqp dsqpVar4 = (dsqp) bK17.cu(5);
        dsqpVar4.bC(bK17);
        drno drnoVar4 = (drno) dsqpVar4;
        drnv bZ30 = drnx.c.bZ();
        if (bZ30.c) {
            bZ30.bF();
            bZ30.c = false;
        }
        drnx drnxVar3 = (drnx) bZ30.b;
        bK15.getClass();
        drnxVar3.b = bK15;
        drnxVar3.a = 1;
        if (drnoVar4.c) {
            drnoVar4.bF();
            drnoVar4.c = false;
        }
        drnp drnpVar8 = (drnp) drnoVar4.b;
        drnx bK22 = bZ30.bK();
        bK22.getClass();
        drnpVar8.d = bK22;
        drnpVar8.a |= 4;
        if (drnoVar4.c) {
            drnoVar4.bF();
            drnoVar4.c = false;
        }
        drnp drnpVar9 = (drnp) drnoVar4.b;
        c3.getClass();
        drnpVar9.f = c3;
        drnpVar9.a |= 16;
        bZ28.b(drnoVar4.bK());
        cgby bK23 = bZ28.bK();
        if (bZ16.c) {
            bZ16.bF();
            bZ16.c = false;
        }
        cgcq cgcqVar7 = (cgcq) bZ16.b;
        bK23.getClass();
        cgcqVar7.c = bK23;
        cgcqVar7.b = 3;
        bZ.b(bZ16);
        cgcm bZ31 = cgcq.e.bZ();
        cgco b4 = cgcv.b(16);
        if (bZ31.c) {
            bZ31.bF();
            bZ31.c = false;
        }
        cgcq cgcqVar8 = (cgcq) bZ31.b;
        b4.getClass();
        cgcqVar8.d = b4;
        cgcqVar8.a |= 256;
        cgbu bZ32 = cgbw.c.bZ();
        if (bZ32.c) {
            bZ32.bF();
            bZ32.c = false;
        }
        cgbw cgbwVar = (cgbw) bZ32.b;
        cgbwVar.b = 1;
        cgbwVar.a = 1 | cgbwVar.a;
        cgbw bK24 = bZ32.bK();
        if (bZ31.c) {
            bZ31.bF();
            bZ31.c = false;
        }
        cgcq cgcqVar9 = (cgcq) bZ31.b;
        bK24.getClass();
        cgcqVar9.c = bK24;
        cgcqVar9.b = 2;
        bZ.b(bZ31);
        cgcm bZ33 = cgcq.e.bZ();
        cgck cgckVar = cgck.a;
        if (bZ33.c) {
            bZ33.bF();
            bZ33.c = false;
        }
        cgcq cgcqVar10 = (cgcq) bZ33.b;
        cgckVar.getClass();
        cgcqVar10.c = cgckVar;
        cgcqVar10.b = 7;
        bZ.b(bZ33);
        cgcm bZ34 = cgcq.e.bZ();
        cgco b5 = cgcv.b(16);
        if (bZ34.c) {
            bZ34.bF();
            bZ34.c = false;
        }
        cgcq cgcqVar11 = (cgcq) bZ34.b;
        b5.getClass();
        cgcqVar11.d = b5;
        cgcqVar11.a |= 256;
        cgca cgcaVar = cgca.a;
        if (bZ34.c) {
            bZ34.bF();
            bZ34.c = false;
        }
        cgcq cgcqVar12 = (cgcq) bZ34.b;
        cgcaVar.getClass();
        cgcqVar12.c = cgcaVar;
        cgcqVar12.b = 4;
        bZ.b(bZ34);
        h(bZ.bK());
    }

    public final void h(cgcr cgcrVar) {
        this.u.g(cgcrVar);
        for (cgcq cgcqVar : cgcrVar.a) {
            int i = cgcqVar.b;
            if (i == 1) {
                this.s.g((cgbt) cgcqVar.c);
            } else if (i == 5) {
                this.h.b.g((cgcg) cgcqVar.c);
            } else if (i == 6) {
                this.t.g((cgci) cgcqVar.c);
            } else if (i == 3) {
                this.g.c.g((cgby) cgcqVar.c);
            }
        }
    }

    public final boolean i() {
        return this.A.m(bvjk.kp, false) && this.f.a();
    }

    public final cgcr j(cgcr cgcrVar) {
        Boolean h = this.h.a.h();
        dbsk.s(h);
        if (!h.booleanValue()) {
            dcdc z = dcbg.b(cgcrVar.a).o(cfrl.a).z();
            dsqp dsqpVar = (dsqp) cgcrVar.cu(5);
            dsqpVar.bC(cgcrVar);
            cgcl cgclVar = (cgcl) dsqpVar;
            if (cgclVar.c) {
                cgclVar.bF();
                cgclVar.c = false;
            }
            ((cgcr) cgclVar.b).a = cgcr.ck();
            cgclVar.a(z);
            return cgclVar.bK();
        }
        return cgcrVar;
    }
}
