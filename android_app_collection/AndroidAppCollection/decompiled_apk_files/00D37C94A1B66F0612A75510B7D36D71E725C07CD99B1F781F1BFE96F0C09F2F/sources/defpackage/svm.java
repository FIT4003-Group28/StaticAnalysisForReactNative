package defpackage;

import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: svm  reason: default package */
/* loaded from: classes4.dex */
final class svm implements tdq {
    private static final boolean b = Boolean.getBoolean("force_elements_view_materialization");
    public cyp a;
    private final boolean d;
    private final boolean e;
    private final awoc f;
    private final tee g;
    private List h;
    private List i;
    private List j;
    private List k;
    private List l;
    private List m;
    private List n;
    private List o;
    private List p;
    private List q;
    private axna r;
    private final Object c = new Object();
    private boolean s = false;
    private boolean t = false;
    private boolean u = false;
    private boolean v = false;

    public svm(awoc awocVar, tee teeVar, boolean z, boolean z2) {
        this.f = awocVar;
        this.g = teeVar;
        this.d = z;
        this.e = z2;
    }

    public static void c() {
        aqxo.z(Looper.getMainLooper() == Looper.myLooper(), "The code must run on UI thread.");
    }

    private final void t() {
        if (!this.u) {
            return;
        }
        throw new IllegalStateException("Element already built!");
    }

    @Override // defpackage.tdq
    public final cyp a() {
        cyp cypVar = this.a;
        cypVar.getClass();
        axna axnaVar = this.r;
        if (axnaVar != null && (cypVar instanceof stt)) {
            ((stt) cypVar).a.f = axnaVar;
        }
        return cypVar;
    }

    @Override // defpackage.tdq
    public final cyr b(cyv cyvVar) {
        svp svpVar;
        cyr a;
        final awoc awocVar;
        synchronized (this.c) {
            t();
            final tee teeVar = this.g;
            if (teeVar != null && (awocVar = this.f) != null) {
                p(new tdp() { // from class: svl
                    @Override // defpackage.tdp
                    public final /* synthetic */ void b(View view, View view2) {
                        tfo.k(this, view);
                    }

                    @Override // defpackage.tdp
                    public final void d(View view) {
                        tee teeVar2 = tee.this;
                        awoc awocVar2 = awocVar;
                        svm.c();
                        teeVar2.b(amuk.r(awocVar2), 2);
                    }
                });
                j(new tdj() { // from class: svi
                    @Override // defpackage.tdj
                    public final void a(View view) {
                        tee teeVar2 = tee.this;
                        awoc awocVar2 = awocVar;
                        svm.c();
                        teeVar2.b(amuk.r(awocVar2), 3);
                    }
                });
                synchronized (this.c) {
                    if (f()) {
                        l(new tdl() { // from class: svk
                            @Override // defpackage.tdl
                            public final void a(View view, tfi tfiVar) {
                                tee teeVar2 = tee.this;
                                awoc awocVar2 = awocVar;
                                svm.c();
                                teeVar2.a(awocVar2, 2);
                            }
                        });
                    }
                    if (e()) {
                        k(new tdk() { // from class: svj
                            @Override // defpackage.tdk
                            public final void a(View view, tfi tfiVar) {
                                tee teeVar2 = tee.this;
                                awoc awocVar2 = awocVar;
                                svm.c();
                                teeVar2.a(awocVar2, 4);
                            }
                        });
                    }
                }
            }
            this.u = true;
            if (!this.v || this.d) {
                svpVar = a();
            } else {
                cyp a2 = a();
                List list = this.l;
                if (list != null && !list.isEmpty() && (a2 instanceof stt)) {
                    ((stt) a2).a.g = true;
                }
                svp svpVar2 = new svp();
                svp.c(svpVar2, cyvVar, new svr());
                svpVar2.a.a = a2.a();
                svpVar2.d.set(0);
                List list2 = this.h;
                svr svrVar = svpVar2.a;
                svrVar.y = list2;
                svrVar.x = this.j;
                svrVar.d = this.k;
                svrVar.C = this.l;
                svrVar.w = this.e;
                svrVar.B = this.n;
                svrVar.A = this.o;
                svrVar.z = this.p;
                svrVar.f = this.m;
                svrVar.e = null;
                svrVar.b = this.q;
                svrVar.c = this.i;
                svrVar.g = this.s;
                svrVar.v = this.t;
                svpVar = svpVar2;
            }
            if (b) {
                svpVar.T();
            }
            a = svpVar.a();
        }
        return a;
    }

    @Override // defpackage.tdq
    public final boolean d() {
        List list = this.i;
        return list != null && !list.isEmpty();
    }

    @Override // defpackage.tdq
    public final boolean e() {
        List list = this.j;
        return list != null && !list.isEmpty();
    }

    @Override // defpackage.tdq
    public final boolean f() {
        List list = this.h;
        return list != null && !list.isEmpty();
    }

    @Override // defpackage.tdq
    public final void g(syv syvVar) {
        synchronized (this.c) {
            t();
            if (this.q == null) {
                this.q = new ArrayList();
            }
            this.q.add(syvVar);
            this.v = true;
        }
    }

    @Override // defpackage.tdq
    public final void h(syl sylVar) {
        synchronized (this.c) {
            t();
            if (this.i == null) {
                this.i = new ArrayList();
            }
            this.i.add(sylVar);
            this.v = true;
        }
    }

    @Override // defpackage.tdq
    public final void i(tdp tdpVar) {
        synchronized (this.c) {
            t();
            if (this.k == null) {
                this.k = new ArrayList();
            }
            this.k.add(tdpVar);
            this.v = true;
        }
    }

    @Override // defpackage.tdq
    public final void j(tdj tdjVar) {
        synchronized (this.c) {
            t();
            if (this.m == null) {
                this.m = new ArrayList();
            }
            this.m.add(tdjVar);
            this.v = true;
        }
    }

    @Override // defpackage.tdq
    public final void k(tdk tdkVar) {
        synchronized (this.c) {
            t();
            if (this.j == null) {
                this.j = new ArrayList();
            }
            this.j.add(tdkVar);
            this.v = true;
        }
    }

    @Override // defpackage.tdq
    public final void l(tdl tdlVar) {
        synchronized (this.c) {
            t();
            if (this.h == null) {
                this.h = new ArrayList();
            }
            this.h.add(tdlVar);
            this.v = true;
        }
    }

    @Override // defpackage.tdq
    public final void m(tdm tdmVar) {
        synchronized (this.c) {
            t();
            if (this.p == null) {
                this.p = new ArrayList();
            }
            this.p.add(tdmVar);
            this.v = true;
        }
    }

    @Override // defpackage.tdq
    public final void n(tdn tdnVar) {
        synchronized (this.c) {
            t();
            if (this.o == null) {
                this.o = new ArrayList();
            }
            this.o.add(tdnVar);
            this.v = true;
        }
    }

    @Override // defpackage.tdq
    public final void o(tdo tdoVar) {
        synchronized (this.c) {
            t();
            if (this.n == null) {
                this.n = new ArrayList();
            }
            this.n.add(tdoVar);
            this.v = true;
        }
    }

    @Override // defpackage.tdq
    public final void p(tdp tdpVar) {
        synchronized (this.c) {
            t();
            if (this.l == null) {
                this.l = new ArrayList();
            }
            this.l.add(tdpVar);
            this.v = true;
        }
    }

    @Override // defpackage.tdq
    public final void q() {
        this.s = true;
    }

    @Override // defpackage.tdq
    public final void r(boolean z) {
        this.t = z;
    }

    @Override // defpackage.tdq
    public final void s(axna axnaVar) {
        this.r = axnaVar;
    }
}
