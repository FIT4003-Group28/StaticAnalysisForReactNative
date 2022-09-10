package defpackage;

import defpackage.crpx;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: mcg  reason: default package */
/* loaded from: classes7.dex */
public final class mcg<S extends crpx> implements mcp {
    private static final amvh[] i = new amvh[0];
    public final cqat a;
    public final atyi<S> b;
    public final aluu c;
    public final koc d;
    @dzsi
    public aste h;
    private final asmp j;
    private final mcf k;
    private astb m;
    @dzsi
    private mco n;
    private final Set<mbg> l = new HashSet();
    public boolean e = false;
    public boolean f = false;
    public amvh[] g = i;

    public mcg(cqat cqatVar, asmp asmpVar, atyi<S> atyiVar, aluu aluuVar, koc kocVar, @dzsi mco mcoVar) {
        this.a = cqatVar;
        this.j = asmpVar;
        this.b = atyiVar;
        this.c = aluuVar;
        this.d = kocVar;
        this.n = mcoVar;
        if (mcoVar == null) {
            this.m = astb.NO_SEARCH;
        } else {
            this.m = astb.SEARCH_NOT_AUTOREFRESHING;
        }
        this.k = new mcf(this);
    }

    private final void h(boolean z) {
        if (this.f) {
            return;
        }
        if (!this.e) {
            if (!z) {
                return;
            }
            this.j.i(dbpy.a);
            this.j.m(null);
            this.j.k(astb.NO_SEARCH);
            return;
        }
        this.j.k(this.m);
        mco mcoVar = this.n;
        if (mcoVar != null) {
            this.j.m(dchl.k(mcoVar.a(), mce.a));
        } else {
            this.j.m(null);
        }
        aste asteVar = this.h;
        if (asteVar != null) {
            this.j.i(asteVar.o());
        } else {
            this.j.i(dbpy.a);
        }
    }

    @Override // defpackage.mcp
    public final void a(final aste asteVar, final boolean z) {
        if (this.f) {
            return;
        }
        this.h = asteVar;
        this.b.i(asteVar, new bvqg(z, asteVar) { // from class: mcd
            private final boolean a;
            private final aste b;

            {
                this.a = z;
                this.b = asteVar;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                boolean z2 = this.a;
                aste asteVar2 = this.b;
                dnqg dnqgVar = (dnqg) obj;
                if (z2) {
                    ddxw bZ = ddxx.j.bZ();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ddxx ddxxVar = (ddxx) bZ.b;
                    ddxxVar.a |= 8;
                    ddxxVar.d = 19730;
                    if (dnqgVar.c) {
                        dnqgVar.bF();
                        dnqgVar.c = false;
                    }
                    dnqh dnqhVar = (dnqh) dnqgVar.b;
                    ddxx bK = bZ.bK();
                    dnqh dnqhVar2 = dnqh.p;
                    bK.getClass();
                    dnqhVar.f = bK;
                    dnqhVar.a |= 16;
                    return;
                }
                ddxw bZ2 = ddxx.j.bZ();
                int b = asteVar2.h().b();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                ddxx ddxxVar2 = (ddxx) bZ2.b;
                ddxxVar2.a |= 8;
                ddxxVar2.d = b;
                if (dnqgVar.c) {
                    dnqgVar.bF();
                    dnqgVar.c = false;
                }
                dnqh dnqhVar3 = (dnqh) dnqgVar.b;
                ddxx bK2 = bZ2.bK();
                dnqh dnqhVar4 = dnqh.p;
                bK2.getClass();
                dnqhVar3.f = bK2;
                dnqhVar3.a |= 16;
            }
        }, this.k);
        e(astb.SEARCHING, null);
    }

    @Override // defpackage.mcp
    public final void b(amvh[] amvhVarArr) {
        this.g = amvhVarArr;
    }

    public final void c(@dzsi S s) {
        if (this.f) {
            return;
        }
        this.b.f(s);
    }

    public final void d(boolean z) {
        if (z != this.e) {
            this.e = z;
            h(true);
        }
    }

    public final void e(astb astbVar, @dzsi mco mcoVar) {
        if (this.f) {
            return;
        }
        this.m = astbVar;
        this.n = mcoVar;
        if (mcoVar != null) {
            for (mbg mbgVar : this.l) {
                mbgVar.a(mcoVar);
            }
        }
        h(false);
    }

    @Override // defpackage.mcp
    public final void f(mbg mbgVar) {
        this.l.add(mbgVar);
        mco mcoVar = this.n;
        if (mcoVar != null) {
            mbgVar.a(mcoVar);
        }
    }

    @Override // defpackage.mcp
    public final void g(mbg mbgVar) {
        this.l.remove(mbgVar);
    }
}
