package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: vum  reason: default package */
/* loaded from: classes7.dex */
public final class vum {
    public dwao a;
    public final List<amvh> b;
    public final List<amvf> c;
    public duqc d;
    @dzsi
    public dhjx e;
    @dzsi
    public dtaq f;
    @dzsi
    public dowa g;
    @dzsi
    public String h;
    @dzsi
    public dspd i;
    @dzsi
    public dvzx j;
    @dzsi
    public dquz k;
    @dzsi
    public String l;
    @dzsi
    public dspd m;
    public boolean n;
    @dzsi
    public dnqh o;
    public boolean p;
    @dzsi
    public Long q;
    public boolean r;
    @dzsi
    public dpaz s;

    public vum() {
        this.a = dwao.R;
        this.b = dchl.a();
        this.c = dchl.a();
        this.d = duqc.f;
        this.n = false;
        this.q = null;
        this.r = false;
    }

    public final void b(amvh amvhVar) {
        this.b.add(amvhVar);
    }

    public final void c(List<amvh> list) {
        this.b.clear();
        this.b.addAll(list);
    }

    public vum(vun vunVar) {
        this.a = dwao.R;
        ArrayList a = dchl.a();
        this.b = a;
        ArrayList a2 = dchl.a();
        this.c = a2;
        this.d = duqc.f;
        this.n = false;
        this.q = null;
        this.r = false;
        this.a = vunVar.b;
        a.addAll(vunVar.l);
        a2.addAll(vunVar.m);
        this.e = vunVar.n;
        this.f = vunVar.o;
        this.g = vunVar.d;
        this.h = vunVar.e;
        this.i = vunVar.f;
        this.j = vunVar.g;
        this.k = vunVar.h;
        this.l = vunVar.i;
        this.m = vunVar.j;
        this.n = vunVar.k;
        this.o = vunVar.p;
        this.p = vunVar.q;
        this.q = vunVar.r;
        this.r = vunVar.s;
        boolean z = vunVar.t;
        this.s = vunVar.u;
    }

    public final vun a() {
        dwao dwaoVar = this.a;
        if (dwaoVar.c != 64) {
            dphq dphqVar = dwaoVar.e;
            if (dphqVar == null) {
                dphqVar = dphq.m;
            }
            if ((dphqVar.a & 1) == 0) {
                throw new UnsupportedOperationException("Travel mode must be set");
            }
            dphq dphqVar2 = this.a.e;
            if (dphqVar2 == null) {
                dphqVar2 = dphq.m;
            }
            if ((dphqVar2.a & 2) == 0) {
                throw new UnsupportedOperationException("Travel mode Filtering must be set");
            }
        }
        return new vun(this.a, dcdc.r(this.b), dcdc.r(this.c), this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s);
    }
}
