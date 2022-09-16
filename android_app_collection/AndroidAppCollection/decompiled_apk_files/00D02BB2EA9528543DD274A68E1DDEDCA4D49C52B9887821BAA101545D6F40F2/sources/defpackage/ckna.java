package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: ckna  reason: default package */
/* loaded from: classes4.dex */
public class ckna extends bbuq {
    private static final dcqe m = dcqe.c("ckna");
    protected volatile int c;
    protected volatile int d;
    public final akqi e;
    protected final cknc f;
    protected dspd h;
    public int k;
    @dzsi
    public bvrt<dwge> l;
    @dzsi
    private String n;
    public final List<bvrt<dwfl>> g = new ArrayList();
    public boolean i = false;
    public boolean j = false;

    public ckna(@dzsi ilo iloVar, boolean z, dspd dspdVar, boolean z2, boolean z3, boolean z4, int i, List<drbz> list) {
        akqi akqiVar;
        this.h = dspd.b;
        if (iloVar != null) {
            akqiVar = iloVar.ai();
        } else {
            akqiVar = akqi.a;
        }
        this.e = akqiVar;
        this.h = dspdVar;
        this.f = new cknc(iloVar, z, z2, z3, z4, list);
        this.c = i;
        this.d = i;
    }

    private static dwfl z(bvrt<dwfl> bvrtVar) {
        return bvrtVar.e((dssr) dwfl.w.cu(7), dwfl.w);
    }

    @Override // defpackage.bbuq
    public final void a(int i, int i2) {
    }

    @Override // defpackage.bbuq
    public final int b() {
        return this.k;
    }

    @Override // defpackage.bbuq
    public final boolean c() {
        return false;
    }

    @Override // defpackage.bbuq
    public final int d() {
        return this.g.size();
    }

    @Override // defpackage.bbuq
    @dzsi
    public final dwfl e(int i) {
        if (i < 0 || i >= this.g.size()) {
            return null;
        }
        return z(this.g.get(i));
    }

    @Override // defpackage.bbuq
    public final int f(dwfl dwflVar) {
        return this.g.indexOf(bvrt.b(dwflVar));
    }

    @Override // defpackage.bbuq
    public final boolean g() {
        return !this.i;
    }

    @Override // defpackage.bbuq
    public final void h(buti butiVar) {
        ckmz ckmzVar = new ckmz(this);
        if (!g()) {
            return;
        }
        dwge y = y(this.n);
        bvrt<dwge> bvrtVar = this.l;
        if (bvrtVar != null && bvrtVar.equals(bvrt.b(y))) {
            return;
        }
        this.l = bvrt.b(y);
        butiVar.a(y, ckmzVar, bvrj.UI_THREAD);
    }

    @Override // defpackage.bbuq
    public final void i(int i) {
        if (i < 0 || i >= this.g.size()) {
            this.g.size();
            return;
        }
        this.g.remove(i);
        this.k--;
        u();
    }

    @Override // defpackage.bbuq
    public final void j(Collection<dwfl> collection) {
        Iterator<bvrt<dwfl>> it = this.g.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (cknv.e(collection, z(it.next()))) {
                it.remove();
                i++;
            }
        }
        if (i > 0) {
            this.k -= i;
            u();
        }
    }

    @Override // defpackage.bbuq
    public final void k(String str, String str2) {
        bvoo.h("Photos can't be edited from placemark's photo page.", new Object[0]);
    }

    @Override // defpackage.bbuq
    public final void l(String str, List<dwfa> list) {
        bvoo.h("Photos can't be edited from placemark's photo page.", new Object[0]);
    }

    @Override // defpackage.bbuq
    public final void m(String str, String str2) {
        bvoo.h("Photos can't be edited from placemark's photo page.", new Object[0]);
    }

    public final void w(dwgl dwglVar) {
        for (dwfl dwflVar : dwglVar.b) {
            if (cknv.g(dwflVar)) {
                dizh dizhVar = dwflVar.p;
                if (dizhVar == null) {
                    dizhVar = dizh.j;
                }
                dghk dghkVar = dizhVar.c;
                if (dghkVar == null) {
                    dghkVar = dghk.g;
                }
                if ((dghkVar.a & 4) != 0) {
                }
            }
            this.g.add(bvrt.b(dwflVar));
        }
        this.k = dwglVar.c;
        this.i = dwglVar.f;
        this.n = dwglVar.d;
        x(dwglVar);
        u();
    }

    protected void x(dwgl dwglVar) {
        dwgk dwgkVar = dwglVar.h;
        if (dwgkVar == null) {
            dwgkVar = dwgk.b;
        }
        this.h = dwgkVar.a;
    }

    public dwge y(@dzsi String str) {
        return this.f.c(this.e, this.h, 20, str, this.c, this.d);
    }
}
