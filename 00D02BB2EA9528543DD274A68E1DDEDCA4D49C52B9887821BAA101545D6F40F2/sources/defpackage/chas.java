package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: chas  reason: default package */
/* loaded from: classes4.dex */
public abstract class chas implements cgwh {
    protected bwrs<ilo> a;
    protected dwqc b;
    protected jjn c = jjn.COLLAPSED;
    protected chaq d;
    protected boolean e;
    protected final boxa f;
    protected final cjqy g;
    protected final gga h;
    protected final cgen i;
    protected final bumy j;
    @dzsi
    protected final dxio<begg> k;
    protected final dwpc l;
    protected final dnlx m;

    public chas(boxa boxaVar, cjqy cjqyVar, gga ggaVar, cgen cgenVar, bumy bumyVar, @dzsi dxio<begg> dxioVar, List<cgsk> list) {
        dnms dnmsVar;
        this.g = cjqyVar;
        this.f = boxaVar;
        this.h = ggaVar;
        this.i = cgenVar;
        this.j = bumyVar;
        this.k = dxioVar;
        dnlx dnlxVar = dnlx.c;
        int i = 0;
        for (cgsk cgskVar : list) {
            dwqf dwqfVar = cgskVar.a().c;
            doqw doqwVar = (dwqfVar == null ? dwqf.g : dwqfVar).b;
            doqwVar = doqwVar == null ? doqw.c : doqwVar;
            if (doqwVar.a == 10) {
                dnmsVar = (dnms) doqwVar.b;
            } else {
                dnmsVar = dnms.e;
            }
            if ((dnmsVar.a & 4) != 0) {
                if (i == 0) {
                    dnlxVar = dnmsVar.d;
                    dnlxVar = dnlxVar == null ? dnlx.c : dnlxVar;
                    i = 0;
                }
                i++;
            }
        }
        if (i > 1) {
            dwpc dwpcVar = list.get(0).a().b;
            String str = (dwpcVar == null ? dwpc.e : dwpcVar).b;
        }
        this.m = dnlxVar;
        cgsk cgskVar2 = list.get(0);
        dwqc b = cgskVar2.b();
        this.b = b;
        dwpz dwpzVar = b.f;
        this.e = (dwpzVar == null ? dwpz.c : dwpzVar).b;
        dwpc dwpcVar2 = cgskVar2.a().b;
        dwpcVar2 = dwpcVar2 == null ? dwpc.e : dwpcVar2;
        this.l = dwpcVar2;
        dvya bZ = dvyw.bv.bZ();
        bZ.bC(cgskVar2.c());
        if ((((dvyw) bZ.b).a & 4) == 0) {
            String str2 = dwpcVar2.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvyw dvywVar = (dvyw) bZ.b;
            str2.getClass();
            dvywVar.a |= 4;
            dvywVar.g = str2;
        }
        if ((((dvyw) bZ.b).a & 1) == 0 && (dwpcVar2.a & 2) != 0) {
            dhjy bZ2 = dhjz.e.bZ();
            dpum dpumVar = dwpcVar2.c;
            double d = (dpumVar == null ? dpum.d : dpumVar).b;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dhjz dhjzVar = (dhjz) bZ2.b;
            dhjzVar.a |= 2;
            dhjzVar.c = d;
            dpum dpumVar2 = dwpcVar2.c;
            double d2 = (dpumVar2 == null ? dpum.d : dpumVar2).c;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dhjz dhjzVar2 = (dhjz) bZ2.b;
            dhjzVar2.a |= 1;
            dhjzVar2.b = d2;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvyw dvywVar2 = (dvyw) bZ.b;
            dhjz bK = bZ2.bK();
            bK.getClass();
            dvywVar2.e = bK;
            dvywVar2.a |= 1;
        }
        ily ilyVar = new ily();
        ilyVar.E(bZ.bK());
        this.a = bwrs.a(ilyVar.d());
    }

    public cqkl A() {
        dxio<begg> dxioVar = this.k;
        if (dxioVar != null && dxioVar.a() != null) {
            chaq chaqVar = this.d;
            if (chaqVar != null) {
                chaqVar.ab(doab.PRIOR_RESEARCH_VISITED_PLACESHEET);
            }
            begj begjVar = new begj();
            begjVar.i = this.a;
            begjVar.n = true;
            begjVar.c = jjn.EXPANDED;
            begjVar.x = true;
            begjVar.H = false;
            this.k.a().o(begjVar, false, null);
        }
        return cqkl.a;
    }

    @Override // defpackage.cgwh
    public String a() {
        return "";
    }

    @Override // defpackage.cgwh
    public Boolean b() {
        return false;
    }

    @Override // defpackage.cgwh
    public Boolean c() {
        return Boolean.valueOf(q().cx() != null);
    }

    @Override // defpackage.cgwh
    public Boolean d() {
        return Boolean.valueOf(this.c.b());
    }

    @Override // defpackage.cgwh
    public Boolean e() {
        return false;
    }

    @Override // defpackage.cgwh
    public Boolean f() {
        return false;
    }

    @Override // defpackage.cgwh
    public String h() {
        return "";
    }

    @Override // defpackage.cgwh
    public jic i() {
        return new jic();
    }

    @Override // defpackage.cgwh
    public cqkl j() {
        return cqkl.a;
    }

    @Override // defpackage.cgwh
    public void k(jjn jjnVar) {
        jjn jjnVar2 = jjn.HIDDEN;
        this.c = jjnVar;
        cqkx.p(this);
    }

    @Override // defpackage.cgwh
    public Boolean l() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.cgwh
    public void m(boolean z) {
        this.e = false;
        cqkx.p(this);
    }

    @Override // defpackage.cgwh
    public jht n() {
        return v();
    }

    @Override // defpackage.cgwh
    public cjtd o() {
        cjta c = cjtd.c(q().a());
        c.d = dtyd.at;
        return c.a();
    }

    @Override // defpackage.cgwh
    public String p() {
        return q().ai().o();
    }

    @Override // defpackage.cgwh
    public ilo q() {
        ilo c = this.a.c();
        dbsk.s(c);
        return c;
    }

    @Override // defpackage.cgwh
    public bwrs<ilo> r() {
        return this.a;
    }

    @Override // defpackage.cgwh
    public int s() {
        dvso dvsoVar = this.b.e;
        if (dvsoVar == null) {
            dvsoVar = dvso.d;
        }
        return dvsoVar.b;
    }

    @Override // defpackage.cgwh
    public Boolean t() {
        dvso dvsoVar = this.b.e;
        if (dvsoVar == null) {
            dvsoVar = dvso.d;
        }
        boolean z = true;
        if (1 != (dvsoVar.a & 1)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cgwh
    @dzsi
    public dmni u() {
        dvso dvsoVar = this.b.e;
        if (dvsoVar == null) {
            dvsoVar = dvso.d;
        }
        duxq duxqVar = dvsoVar.c;
        if (duxqVar == null) {
            duxqVar = duxq.c;
        }
        if ((duxqVar.a & 1) != 0) {
            dvso dvsoVar2 = this.b.e;
            if (dvsoVar2 == null) {
                dvsoVar2 = dvso.d;
            }
            duxq duxqVar2 = dvsoVar2.c;
            if (duxqVar2 == null) {
                duxqVar2 = duxq.c;
            }
            dmni dmniVar = duxqVar2.b;
            return dmniVar == null ? dmni.f : dmniVar;
        }
        return null;
    }

    protected abstract jht v();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void w() {
        this.g.i(cjtd.a(dtyd.au));
        bumy bumyVar = this.j;
        duph bZ = dupi.c.bZ();
        String p = p();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dupi dupiVar = (dupi) bZ.b;
        p.getClass();
        dupiVar.a = 2;
        dupiVar.b = p;
        bumyVar.a(bZ.bK(), new chap(this), bvrj.BACKGROUND_THREADPOOL);
        chaq chaqVar = this.d;
        if (chaqVar != null) {
            chaqVar.N();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean x() {
        chaq chaqVar = this.d;
        return chaqVar != null && !chaqVar.g().booleanValue();
    }

    public void y(chaq chaqVar) {
        this.d = chaqVar;
    }

    public cqkl z() {
        this.g.i(cjtd.a(dtyd.aN));
        chaq chaqVar = this.d;
        if (chaqVar != null) {
            chaqVar.O(this.l, a());
        }
        return cqkl.a;
    }
}
