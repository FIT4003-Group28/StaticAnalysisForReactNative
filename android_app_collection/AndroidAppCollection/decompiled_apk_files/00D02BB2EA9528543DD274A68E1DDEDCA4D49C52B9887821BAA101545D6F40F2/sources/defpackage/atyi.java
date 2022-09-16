package defpackage;

import defpackage.crpx;
/* compiled from: PG */
/* renamed from: atyi  reason: default package */
/* loaded from: classes2.dex */
public abstract class atyi<S extends crpx> implements atzc<S> {
    private static final dcqe b = dcqe.c("atyi");
    @dzsi
    public brln a;
    private final ckcr c;
    private final ckcr d;
    private final ckcr e;
    private final ckcr f;
    private final ckcr g;
    private final broq h;
    private final akox i;
    private final akfa j;
    private final dxio<cref> k;
    private final int l;
    private final brcw m;
    private final btvo n;
    private boolean o;
    @dzsi
    private atyh p;
    @dzsi
    private S q;

    /* JADX INFO: Access modifiers changed from: protected */
    public atyi(ckcw ckcwVar, broq broqVar, akox akoxVar, akfa akfaVar, dxio<cref> dxioVar, int i, brcw brcwVar, btvo btvoVar) {
        this.c = (ckcr) ckcwVar.a(ckhi.h);
        this.d = (ckcr) ckcwVar.a(ckhi.i);
        this.e = (ckcr) ckcwVar.a(ckhi.k);
        this.f = (ckcr) ckcwVar.a(ckhi.g);
        this.g = (ckcr) ckcwVar.a(ckhi.j);
        this.h = broqVar;
        this.i = akoxVar;
        this.l = i;
        this.j = akfaVar;
        this.k = dxioVar;
        this.m = brcwVar;
        this.n = btvoVar;
    }

    private final void m() {
        brln brlnVar = this.a;
        if (brlnVar != null) {
            brlnVar.i();
            this.a = null;
        }
    }

    private final void n() {
        atyh atyhVar;
        if (d(this.q) && (atyhVar = this.p) != null) {
            S s = this.q;
            dbsk.s(s);
            atyj atyjVar = (atyj) atyhVar;
            aste asteVar = atyjVar.a;
            dwim bZ = dwir.R.bZ();
            bvrt<dwir> p = asteVar.p();
            dwir e = p == null ? null : p.e((dssr) dwir.R.cu(7), dwir.R);
            if (e != null) {
                bZ.bC(e);
            }
            this.m.a();
            c(bZ, s, asteVar, this.o);
            String e2 = dbsj.e(asteVar.b());
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwir dwirVar = (dwir) bZ.b;
            e2.getClass();
            dwirVar.a |= 1;
            dwirVar.c = e2;
            if (asteVar.c() != null) {
                dpvf c = asteVar.c();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dwir dwirVar2 = (dwir) bZ.b;
                dwirVar2.N = c.an;
                dwirVar2.b |= 4194304;
            }
            btlu j = this.j.j();
            bvrt<dhjx> g = asteVar.g();
            dhjx e3 = g == null ? null : g.e((dssr) dhjx.f.cu(7), dhjx.f);
            if (e3 == null) {
                e3 = this.i.aa();
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwir dwirVar3 = (dwir) bZ.b;
            e3.getClass();
            dwirVar3.d = e3;
            int i = dwirVar3.a | 2;
            dwirVar3.a = i;
            int i2 = this.l;
            dwirVar3.a = i | 16;
            dwirVar3.g = i2;
            dnqg bZ2 = dnqh.p.bZ();
            bvqg<dnqg> bvqgVar = atyjVar.b;
            if (bvqgVar != null) {
                bvqgVar.NU(bZ2);
            } else {
                ddxw bZ3 = ddxx.j.bZ();
                int b2 = asteVar.h().b();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                ddxx ddxxVar = (ddxx) bZ3.b;
                ddxxVar.a |= 8;
                ddxxVar.d = b2;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dnqh dnqhVar = (dnqh) bZ2.b;
                ddxx bK = bZ3.bK();
                bK.getClass();
                dnqhVar.f = bK;
                dnqhVar.a |= 16;
            }
            if (!dbsj.d(asteVar.a())) {
                String a = asteVar.a();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dnqh dnqhVar2 = (dnqh) bZ2.b;
                a.getClass();
                dnqhVar2.a |= 2;
                dnqhVar2.c = a;
            }
            iqy iqyVar = new iqy();
            if (this.n.getCarParameters().l && asteVar.r() != null && asteVar.r().b.size() != 0) {
                for (drpg drpgVar : asteVar.r().b) {
                    dwik bZ4 = dwil.c.bZ();
                    String str = drpgVar.a;
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    dwil dwilVar = (dwil) bZ4.b;
                    str.getClass();
                    dwilVar.a |= 1;
                    dwilVar.b = str;
                    bZ.a(bZ4);
                }
                iqyVar.o = asteVar.r().b.isEmpty();
                String str2 = "";
                if (j != null && btlu.h(j) != null) {
                    str2 = dbsj.e(j.j());
                }
                if (!str2.equals(asteVar.r().a)) {
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dnqh.b((dnqh) bZ2.b);
                }
            }
            dnqh bK2 = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwir dwirVar4 = (dwir) bZ.b;
            bK2.getClass();
            dwirVar4.s = bK2;
            dwirVar4.a |= 33554432;
            iqyVar.a = asteVar.e();
            brln brlnVar = new brln(bZ.bK(), iqyVar, (amsz) null, b(s, asteVar));
            brlnVar.f = new atyg(this, atyjVar.c, this.c.a(), this.d.a(), this.e.a(), this.f.a(), this.g.a());
            this.a = brlnVar;
            this.h.a(brlnVar);
            this.p = null;
        }
    }

    protected abstract String a(String str);

    @dzsi
    protected abstract amvq b(S s, aste asteVar);

    protected abstract void c(dwim dwimVar, S s, aste asteVar, boolean z);

    protected abstract boolean d(@dzsi S s);

    @Override // defpackage.atzc
    public final boolean e() {
        return d(this.q);
    }

    @Override // defpackage.atzc
    public final void f(@dzsi S s) {
        this.q = s;
        n();
        k();
    }

    @Override // defpackage.atzc
    public final boolean g() {
        return (this.p == null && this.a == null) ? false : true;
    }

    @Override // defpackage.atzc
    public final void h(boolean z) {
        this.o = z;
    }

    @Override // defpackage.atzc
    public final void i(aste asteVar, @dzsi bvqg<dnqg> bvqgVar, atzb atzbVar) {
        m();
        this.p = new atyj(asteVar, bvqgVar, atzbVar);
        if (asteVar.i() && asteVar.b() != null) {
            this.k.a().b(this.k.a().q().g(a(asteVar.b())), crej.RESPONSE, null);
        }
        n();
        k();
    }

    @Override // defpackage.atzc
    public final void j() {
        this.p = null;
        m();
        k();
    }

    public final void k() {
        if (this.a == null || this.p == null) {
            return;
        }
        bvoo.h("Can't have a pending query and a current request at the same time.", new Object[0]);
    }
}
