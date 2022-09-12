package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import defpackage.astc;
import defpackage.crpx;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: atyz  reason: default package */
/* loaded from: classes2.dex */
public final class atyz<U extends astc, N extends crpx> implements asmo {
    public long b;
    public final cqat c;
    public final btrm d;
    public final atzg e;
    public final asmn f;
    public final asmp g;
    @dzsi
    public bvpk i;
    @dzsi
    public aste j;
    private final atzc<N> p;
    private final bvrb q;
    private final dbrn<U, N> r;
    private boolean s;
    private boolean t;
    private boolean u;
    @dzsi
    private U v;
    private static final dcep<asld> l = dcep.E(asld.FREE_MOVEMENT, asld.INSPECT_POINT_ON_ROUTE, asld.INSPECT_ROUTE_SECTION, asld.INSPECT_STEP);
    private static final dcep<asld> m = dcep.E(asld.FOLLOWING, asld.OVERVIEW, asld.INSPECT_RESULTS_ON_MAP_WITH_LOCATION, asld.INSPECT_RESULTS_ON_MAP_WITHOUT_LOCATION);
    public static final long a = TimeUnit.MINUTES.toMillis(5);
    private static final long n = TimeUnit.MINUTES.toMillis(1);
    private final atyx o = new atyx(this);
    public final atyy h = new atyy(this);
    public int k = 1;

    public atyz(asmn asmnVar, asmp asmpVar, atzc<N> atzcVar, cqat cqatVar, btrm btrmVar, bvrb bvrbVar, atzg atzgVar, dbrn<U, N> dbrnVar) {
        this.f = asmnVar;
        this.c = cqatVar;
        this.d = btrmVar;
        this.g = asmpVar;
        this.p = atzcVar;
        this.q = bvrbVar;
        this.e = atzgVar;
        this.r = dbrnVar;
    }

    public static String i(@dzsi aste asteVar) {
        return asteVar == null ? "" : dbsj.e(asteVar.b());
    }

    private final boolean m() {
        return this.i != null || this.p.g();
    }

    private final void n() {
        bvpk bvpkVar = this.i;
        if (bvpkVar != null) {
            bvpkVar.b();
            this.i = null;
        }
        this.p.j();
    }

    @Override // defpackage.asmo
    public final void NZ(@dzsi Bundle bundle) {
        this.g.k(astb.NO_SEARCH);
    }

    @Override // defpackage.asmo
    public final void Qo(Configuration configuration) {
    }

    @Override // defpackage.asmo
    public final void Qp() {
        this.g.k(astb.NO_SEARCH);
        this.e.h(false);
        n();
        this.j = null;
    }

    @Override // defpackage.asmo
    public final void Qr(Bundle bundle) {
    }

    @Override // defpackage.asmo
    public final void b() {
        U u;
        btrm btrmVar = this.d;
        atyx atyxVar = this.o;
        dceq a2 = dcet.a();
        a2.b(crhi.class, new atza(crhi.class, atyxVar, bvrj.UI_THREAD));
        btrmVar.g(atyxVar, a2.a());
        if (!this.u) {
            return;
        }
        this.u = false;
        if (this.t || (u = this.v) == null || !u.b()) {
            return;
        }
        if (!this.p.e()) {
            this.t = true;
        } else if (this.s) {
            j(3);
        } else {
            j(this.k);
        }
    }

    @Override // defpackage.asmo
    public final void c() {
        this.d.a(this.o);
        this.u = m();
        n();
    }

    public final void g(U u, @dzsi U u2) {
        this.v = u;
        boolean e = this.p.e();
        this.p.f(this.r.a(u));
        boolean e2 = this.p.e();
        if (!dbsd.a(u.e, this.j) || u.j) {
            aste asteVar = u.e;
            int i = 1;
            this.e.h(asteVar != null);
            n();
            this.g.o(false);
            this.j = asteVar;
            if (asteVar != null) {
                this.g.k(astb.SEARCHING);
                this.s = false;
                this.p.h(l.contains(u.c.a));
                if (e2) {
                    if (true == u.j) {
                        i = 2;
                    }
                    j(i);
                }
            } else {
                this.g.k(astb.NO_SEARCH);
            }
        } else if (!e2) {
            this.t = m();
            n();
        } else if (this.j != null && u2 != null && !e) {
            this.t = false;
            if (!this.u) {
                j(this.s ? 3 : this.k);
            }
        }
        if (u2 != null) {
            asld asldVar = u.c.a;
            asld asldVar2 = u2.c.a;
            if (u.g == astb.SEARCH_AUTOREFRESHING) {
                dcep<asld> dcepVar = l;
                if (dcepVar.contains(asldVar) && !dcepVar.contains(asldVar2) && this.s) {
                    n();
                    this.g.k(astb.SEARCH_NOT_AUTOREFRESHING);
                    return;
                }
            }
            if (u.g != astb.SEARCH_NOT_AUTOREFRESHING) {
                return;
            }
            dcep<asld> dcepVar2 = m;
            if (!dcepVar2.contains(asldVar) || dcepVar2.contains(asldVar2)) {
                return;
            }
            this.p.h(false);
            if (this.p.e()) {
                j(3);
            }
            this.g.k(astb.SEARCHING);
        }
    }

    public final void h() {
        if (this.i == null) {
            bvpk a2 = bvpk.a(new atyw(this));
            this.i = a2;
            this.q.a(a2, bvrj.UI_THREAD, n);
        }
    }

    public final void j(final int i) {
        final aste asteVar = this.j;
        if (asteVar == null) {
            return;
        }
        this.k = i;
        this.p.i(asteVar, new bvqg(i, asteVar) { // from class: atyv
            private final aste a;
            private final int b;

            {
                this.b = i;
                this.a = asteVar;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                int i2 = this.b;
                aste asteVar2 = this.a;
                dnqg dnqgVar = (dnqg) obj;
                long j = atyz.a;
                if (i2 == 3) {
                    if (dnqgVar.c) {
                        dnqgVar.bF();
                        dnqgVar.c = false;
                    }
                    dnqh dnqhVar = (dnqh) dnqgVar.b;
                    dnqh dnqhVar2 = dnqh.p;
                    dnqhVar.a |= 2048;
                    dnqhVar.j = true;
                } else if (i2 == 2) {
                    ddxw bZ = ddxx.j.bZ();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ddxx ddxxVar = (ddxx) bZ.b;
                    ddxxVar.a |= 8;
                    ddxxVar.d = 14336;
                    if (dnqgVar.c) {
                        dnqgVar.bF();
                        dnqgVar.c = false;
                    }
                    dnqh dnqhVar3 = (dnqh) dnqgVar.b;
                    ddxx bK = bZ.bK();
                    dnqh dnqhVar4 = dnqh.p;
                    bK.getClass();
                    dnqhVar3.f = bK;
                    dnqhVar3.a |= 16;
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
                dnqh dnqhVar5 = (dnqh) dnqgVar.b;
                ddxx bK2 = bZ2.bK();
                dnqh dnqhVar6 = dnqh.p;
                bK2.getClass();
                dnqhVar5.f = bK2;
                dnqhVar5.a |= 16;
            }
        }, this.h);
    }
}
