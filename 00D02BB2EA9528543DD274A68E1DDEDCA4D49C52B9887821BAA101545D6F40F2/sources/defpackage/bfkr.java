package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bfkr  reason: default package */
/* loaded from: classes3.dex */
public class bfkr implements bfkm {
    @dzsi
    private bfkp A;
    @dzsi
    private bfkt B;
    private final Activity a;
    private final cjqy b;
    private final bhat c;
    private final btvo d;
    private final bbut e;
    private final bflb f;
    private final bwsh g;
    private final bmdy h;
    private final Resources i;
    private final cqhn j;
    private final bvpe k;
    private final huc l;
    @dzsi
    private final ckql m;
    private int n;
    private float o;
    private float p;
    private float q;
    private Boolean r;
    private List<jbp> s;
    private bfke t;
    @dzsi
    private ilo u;
    @dzsi
    private iyo v;
    @dzsi
    private cqix<? extends cqkp> w;
    @dzsi
    private cqix<? extends cqkp> x;
    @dzsi
    private final Runnable y;
    @dzsi
    private View.OnAttachStateChangeListener z;

    public bfkr(Activity activity, cjqy cjqyVar, bhat bhatVar, btvo btvoVar, bbut bbutVar, bflb bflbVar, bwsh bwshVar, bvrb bvrbVar, cqhn cqhnVar, dxio<apqd> dxioVar, bvjj bvjjVar, bvpe bvpeVar, huc hucVar, bmdy bmdyVar) {
        this(null, null, dbpy.a, activity, cjqyVar, bhatVar, btvoVar, bbutVar, bflbVar, bwshVar, bvrbVar, cqhnVar, dxioVar, bvjjVar, bvpeVar, hucVar, bmdyVar);
    }

    private final boolean P() {
        ilo iloVar = this.u;
        return iloVar != null && iloVar.aX(this.d.getEnableFeatureParameters());
    }

    private final void Q(ilo iloVar) {
        this.v = null;
        this.s = dcdc.e();
        if (iloVar == null || !iloVar.aE().isEmpty() || iloVar.bF() != null) {
            this.u = iloVar;
            bfkh bfkhVar = new bfkh(this.u, btpf.c(this.a).f);
            boolean z = false;
            dcdc r = dcdc.r(bfkhVar.a.subList(0, Math.min(10, bfkhVar.a.size())));
            if (r.isEmpty()) {
                return;
            }
            this.s = g(iloVar, r);
            if (r.size() <= 0) {
                return;
            }
            List<jbp> list = this.s;
            dwfl dwflVar = (dwfl) r.get(r.size() - 1);
            int size = bfkhVar.a.size();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (jbp jbpVar : list) {
                iyr iyrVar = new iyr(jbpVar);
                int i2 = i + 1;
                jbt f = f(jbpVar, i);
                if (f != null) {
                    iyrVar.b(f);
                }
                arrayList.add(iyrVar);
                i = i2;
            }
            if (size > 10) {
                if (arrayList.size() >= 2) {
                    z = true;
                }
                dbsk.l(z);
                this.B = new bfkt(h(), iloVar, dwflVar, this.t.d(), this.r.booleanValue());
                bfkw bfkwVar = new bfkw(this.B);
                int size2 = arrayList.size() - 1;
                if (P()) {
                    this.A = new bfkp(this.e, iloVar, this.t.c(), true, this.r.booleanValue());
                    ((iyr) arrayList.get(size2 - 1)).b(bfkwVar);
                    ((iyr) arrayList.get(size2)).b(new bfkw(this.A, true));
                } else {
                    ((iyr) arrayList.get(size2)).b(bfkwVar);
                }
            } else if (P()) {
                this.A = new bfkp(this.e, iloVar, this.t.c(), false, this.r.booleanValue());
                arrayList.add(new iyr(new bfkw(this.A, false)));
            }
            this.v = new iyo(arrayList, K(), this.j, this.b, (iyn) null);
        }
    }

    @Override // defpackage.bfkk
    public List A() {
        return bfkj.b(this);
    }

    @Override // defpackage.bfkk
    public Boolean B() {
        return Boolean.valueOf(this.x != null);
    }

    @Override // defpackage.bfkk
    @dzsi
    public cqix<? extends cqkp> C() {
        return this.x;
    }

    @Override // defpackage.bfkk
    public Boolean D() {
        return bfkj.f();
    }

    @Override // defpackage.bfkk
    public cqtv E() {
        return bfkj.d();
    }

    @Override // defpackage.bfkk
    public Float F() {
        return bfkj.c();
    }

    @Override // defpackage.bfkk
    public void G(float f) {
    }

    public void H(String str, @dzsi String str2, List<dwfl> list) {
        ilo iloVar;
        dvyw h;
        if (this.v != null && (iloVar = this.u) != null && str != null && list != null && (h = iloVar.h()) != null && (h.o.size() <= 0 || str.equals(h.o.get(0)))) {
            ilo iloVar2 = this.u;
            dbsk.s(iloVar2);
            if (iloVar2.aE().equals(list)) {
                return;
            }
        }
        dvya bZ = dvyw.bv.bZ();
        bZ.a(str);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvyw dvywVar = (dvyw) bZ.b;
        dvywVar.b |= 16;
        dvywVar.R = true;
        dvyw dvywVar2 = (dvyw) bZ.b;
        dsrj<dwfl> dsrjVar = dvywVar2.I;
        if (!dsrjVar.a()) {
            dvywVar2.I = dsqw.cl(dsrjVar);
        }
        dsod.bv(list, dvywVar2.I);
        if (str2 != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvyw dvywVar3 = (dvyw) bZ.b;
            str2.getClass();
            dvywVar3.a |= 8;
            dvywVar3.h = str2;
        }
        ily ilyVar = new ily();
        ilyVar.E(bZ.bK());
        Q(ilyVar.d());
    }

    public void I(@dzsi cqix<? extends cqkp> cqixVar) {
        this.w = cqixVar;
    }

    public void J(@dzsi cqix<? extends cqkp> cqixVar) {
        this.x = cqixVar;
    }

    public cjtd K() {
        ilo iloVar = this.u;
        if (iloVar != null) {
            cjta c = cjtd.c(iloVar.bZ());
            c.d = this.t.a();
            return c.a();
        }
        return cjtd.a(this.t.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ddho L(dwfl dwflVar) {
        if (!cknv.f(dwflVar) || !this.t.f()) {
            return this.t.b();
        }
        return this.t.e();
    }

    public void M(jjn jjnVar) {
        bfkt bfktVar = this.B;
        if (bfktVar != null) {
            bfktVar.d(jjnVar);
        }
        bfkp bfkpVar = this.A;
        if (bfkpVar != null) {
            bfkpVar.l(jjnVar);
        }
    }

    public void N(bfke bfkeVar) {
        if (this.t.equals(bfkeVar)) {
            return;
        }
        this.t = bfkeVar;
        iyo iyoVar = this.v;
        if (iyoVar != null) {
            iyoVar.h(bfkeVar.a());
        }
        bfkt bfktVar = this.B;
        if (bfktVar != null) {
            bfktVar.f(this.t.d());
        }
        bfkp bfkpVar = this.A;
        if (bfkpVar != null) {
            bfkpVar.n(this.t.c());
        }
        dbsg<ddho> i = this.t.f() ? dbsg.i(this.t.e()) : dbpy.a;
        for (jbp jbpVar : this.s) {
            if (jbpVar instanceof bfla) {
                ((bfla) jbpVar).f(this.t.b(), i);
            }
        }
    }

    @dzsi
    public ilo O() {
        return this.u;
    }

    @Override // defpackage.bfkk
    public void Pp(float f) {
        this.q = f;
    }

    @Override // defpackage.bfkk
    public void Pq(boolean z) {
        iyo iyoVar = this.v;
        if (iyoVar != null) {
            iyoVar.d(z);
        }
    }

    @Override // defpackage.bfkk
    public void Pr(float f) {
        this.o = f;
    }

    @Override // defpackage.bfkk
    public void Ps(float f) {
        this.p = f;
    }

    @Override // defpackage.bfkk
    public cqss a() {
        return cqrt.c(R.color.qu_daynight_google_blue_700);
    }

    @Override // defpackage.bfkk
    public Boolean b() {
        return Boolean.valueOf(!i().booleanValue());
    }

    @Override // defpackage.bfkk
    public Boolean c() {
        return bfkj.a(this);
    }

    @Override // defpackage.bfkk
    public cqtd d() {
        return iup.e(R.raw.ic_qu_default_hero);
    }

    @dzsi
    protected jbt f(jbp jbpVar, int i) {
        return null;
    }

    protected List<jbp> g(ilo iloVar, List<dwfl> list) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (dwfl dwflVar : list) {
            bflb bflbVar = this.f;
            bmdy bmdyVar = this.h;
            Runnable runnable = this.y;
            brba a = bmdyVar.a.a();
            bmdy.a(a);
            arrayList.add(bflbVar.a(dwflVar, i, iloVar, new bmdx(a, runnable), L(dwflVar), false, this.m));
            i++;
        }
        return arrayList;
    }

    protected bmea h() {
        return new bmeb(this.e, this.g);
    }

    @Override // defpackage.bfkk
    public Boolean i() {
        return Boolean.valueOf(this.v != null);
    }

    @Override // defpackage.bfkk
    public void j(int i) {
        this.n = i;
        bfkt bfktVar = this.B;
        if (bfktVar != null) {
            bfktVar.e(Integer.valueOf(i));
        }
        bfkp bfkpVar = this.A;
        if (bfkpVar != null) {
            bfkpVar.m(Integer.valueOf(i));
        }
    }

    @Override // defpackage.bfkk
    public Integer k() {
        return Integer.valueOf(this.n);
    }

    @Override // defpackage.bfkk
    public Float l() {
        return Float.valueOf(bfki.a(this.i));
    }

    @Override // defpackage.bfkk
    public Float m() {
        return Float.valueOf(this.o);
    }

    @Override // defpackage.bfkk
    public Float n() {
        return Float.valueOf(this.p);
    }

    @Override // defpackage.bfkk
    public Float o() {
        return Float.valueOf(this.q);
    }

    @Override // defpackage.bfkk
    @dzsi
    public jbo p() {
        return this.v;
    }

    @Override // defpackage.bfkk
    public Boolean q() {
        return Boolean.valueOf(this.w != null);
    }

    @Override // defpackage.bfkk
    @dzsi
    public cqix<? extends cqkp> r() {
        return this.w;
    }

    @Override // defpackage.bfkk
    public List<jbp> s() {
        return this.s;
    }

    public void t(ilo iloVar) {
        ilo iloVar2;
        if (this.v == null || (iloVar2 = this.u) == null || iloVar == null || !iloVar2.cr(iloVar) || iloVar.f) {
            ilo iloVar3 = this.u;
            if (iloVar3 != null && iloVar3.aE() != null && iloVar3.aE().equals(iloVar.aE()) && iloVar3.bF().equals(iloVar.bF())) {
                return;
            }
            this.r = Boolean.valueOf(this.c.c(btpf.c(this.a), iloVar));
            Q(iloVar);
        }
    }

    @Override // defpackage.bfkm
    public jbs u() {
        return bfkl.a(this);
    }

    @Override // defpackage.bfkm
    @dzsi
    public View.OnAttachStateChangeListener v() {
        if (this.z == null) {
            this.z = new bvob(this.k.b, this.l.a(new htz(this) { // from class: bfkq
                private final bfkr a;

                {
                    this.a = this;
                }

                @Override // defpackage.htz
                public final cjtd a() {
                    return this.a.K();
                }

                @Override // defpackage.htz
                public final cjql b() {
                    return null;
                }
            }));
        }
        return this.z;
    }

    @Override // defpackage.bfkm
    public aeqd w() {
        return null;
    }

    @Override // defpackage.bfkk
    public void x(cqtv cqtvVar) {
    }

    @Override // defpackage.bfkm
    public Boolean y() {
        return this.r;
    }

    @Override // defpackage.bfkk
    public Boolean z() {
        return bfkj.g();
    }

    public bfkr(@dzsi Runnable runnable, @dzsi ckql ckqlVar, dbsg<bfke> dbsgVar, Activity activity, cjqy cjqyVar, bhat bhatVar, btvo btvoVar, bbut bbutVar, bflb bflbVar, bwsh bwshVar, bvrb bvrbVar, cqhn cqhnVar, dxio<apqd> dxioVar, bvjj bvjjVar, bvpe bvpeVar, huc hucVar, bmdy bmdyVar) {
        this.r = Boolean.FALSE;
        this.s = new ArrayList();
        this.y = runnable;
        this.m = ckqlVar;
        this.a = activity;
        Resources resources = activity.getResources();
        this.i = resources;
        this.b = cjqyVar;
        this.c = bhatVar;
        this.d = btvoVar;
        this.e = bbutVar;
        this.f = bflbVar;
        this.g = bwshVar;
        this.h = bmdyVar;
        this.j = cqhnVar;
        this.v = null;
        this.u = null;
        this.t = dbsgVar.c(bfke.g);
        this.k = bvpeVar;
        this.l = hucVar;
        this.n = bfki.d(resources).c;
    }
}
