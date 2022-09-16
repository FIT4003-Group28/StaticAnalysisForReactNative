package defpackage;

import android.app.Activity;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aqks  reason: default package */
/* loaded from: classes2.dex */
public class aqks implements aqoh {
    private final bvjj a;
    private final dxio<aqkm> b;
    private final dxio<aqkn> c;
    private final dxio<aqkk> d;
    private final aqko e;
    private final crzm<apsi<dbsg<apzn>>> f;
    private final aqrp g;
    private final apzy h;
    private final String i;
    private crzp<apsi<dbsg<apzn>>> j = new crzp(this) { // from class: aqkp
        private final aqks a;

        {
            this.a = this;
        }

        @Override // defpackage.crzp
        public final void On(crzm crzmVar) {
            this.a.l();
        }
    };
    private crzp<aqcj> k = new crzp(this) { // from class: aqkq
        private final aqks a;

        {
            this.a = this;
        }

        @Override // defpackage.crzp
        public final void On(crzm crzmVar) {
            this.a.l();
        }
    };
    private crzp<dbsg<Set<String>>> l = new crzp(this) { // from class: aqkr
        private final aqks a;

        {
            this.a = this;
        }

        @Override // defpackage.crzp
        public final void On(crzm crzmVar) {
            this.a.l();
        }
    };
    private aqoh m;
    private aqoh n;
    private aqoh o;
    private aqoh p;

    public aqks(cqhn cqhnVar, bvjj bvjjVar, dxio<aqkm> dxioVar, dxio<aqkn> dxioVar2, dxio<aqkk> dxioVar3, apyu apyuVar, aqko aqkoVar, aqrp aqrpVar, Executor executor, apzy apzyVar, btlu btluVar, String str) {
        this.a = bvjjVar;
        this.b = dxioVar;
        this.c = dxioVar2;
        this.d = dxioVar3;
        this.e = aqkoVar;
        this.g = aqrpVar;
        this.i = str;
        this.h = apzyVar;
        this.m = aqkoVar;
        crzm<apsi<dbsg<apzn>>> b = apyuVar.b(str, btluVar);
        this.f = b;
        crzp<apsi<dbsg<apzn>>> crzpVar = this.j;
        dbsk.s(crzpVar);
        b.d(crzpVar, executor);
        crzm<aqcj> a = aqrpVar.a();
        crzp<aqcj> crzpVar2 = this.k;
        dbsk.s(crzpVar2);
        a.d(crzpVar2, executor);
        crzm<dbsg<Set<String>>> D = bvjjVar.D(bvjk.jy);
        crzp<dbsg<Set<String>>> crzpVar3 = this.l;
        dbsk.s(crzpVar3);
        D.d(crzpVar3, executor);
    }

    @Override // defpackage.aqoh
    public cqtd a() {
        return this.m.a();
    }

    @Override // defpackage.aqoh
    public String b() {
        return this.m.b();
    }

    @Override // defpackage.aqoh
    public Boolean c() {
        return this.m.c();
    }

    @Override // defpackage.aqoh
    public cjtd d() {
        return this.m.d();
    }

    @Override // defpackage.aqoh
    public cqkl e() {
        return this.m.e();
    }

    @Override // defpackage.aqoh
    public String f() {
        return this.m.f();
    }

    @Override // defpackage.aqoh
    public String g() {
        return this.m.g();
    }

    @Override // defpackage.aqoh
    public Boolean h() {
        return this.m.h();
    }

    @Override // defpackage.aqoh
    public cqkl i() {
        return this.m.i();
    }

    @Override // defpackage.aqoh
    public String j() {
        return this.m.j();
    }

    @Override // defpackage.aqoh
    public String k() {
        return this.m.k();
    }

    public final void l() {
        aqoh aqohVar;
        if (this.f.k()) {
            apsi<dbsg<apzn>> l = this.f.l();
            dbsk.s(l);
            if (!l.a().a() || !this.g.a().k()) {
                return;
            }
            apsi<dbsg<apzn>> l2 = this.f.l();
            dbsk.s(l2);
            boolean e = l2.a().b().e();
            aqcj l3 = this.g.a().l();
            dbsk.s(l3);
            if (!e) {
                if (this.n == null) {
                    aqkm a = this.b.a();
                    String str = this.i;
                    Activity activity = (Activity) ((dxjd) a.a).a;
                    aqkm.a(activity, 1);
                    aqru a2 = a.b.a();
                    aqkm.a(a2, 2);
                    aqci a3 = a.c.a();
                    aqkm.a(a3, 3);
                    apyx a4 = a.d.a();
                    aqkm.a(a4, 4);
                    aqkm.a(str, 5);
                    this.n = new aqkl(activity, a2, a3, a4, str);
                }
                aqohVar = this.n;
            } else if (l3 != aqcj.ENABLED) {
                if (this.o == null) {
                    this.o = this.c.a();
                }
                aqohVar = this.o;
            } else if (!this.h.k() || this.a.C(bvjk.jy, dcmr.a).contains(this.i)) {
                aqohVar = this.e;
            } else {
                if (this.p == null) {
                    aqkk a5 = this.d.a();
                    String str2 = this.i;
                    Activity activity2 = (Activity) ((dxjd) a5.a).a;
                    aqkk.a(activity2, 1);
                    bvjj a6 = a5.b.a();
                    aqkk.a(a6, 2);
                    apzy a7 = a5.c.a();
                    aqkk.a(a7, 3);
                    apyz a8 = a5.d.a();
                    aqkk.a(a8, 4);
                    aqkk.a(str2, 5);
                    this.p = new aqkj(activity2, a6, a7, a8, str2);
                }
                aqohVar = this.p;
            }
            if (this.m.equals(aqohVar)) {
                return;
            }
            this.m = aqohVar;
            cqkx.p(this);
        }
    }

    public void m() {
        crzp<apsi<dbsg<apzn>>> crzpVar = this.j;
        if (crzpVar != null) {
            this.f.c(crzpVar);
            this.j = null;
        }
        if (this.k != null) {
            crzm<aqcj> a = this.g.a();
            crzp<aqcj> crzpVar2 = this.k;
            dbsk.s(crzpVar2);
            a.c(crzpVar2);
            this.k = null;
        }
        if (this.l != null) {
            crzm<dbsg<Set<String>>> D = this.a.D(bvjk.jy);
            crzp<dbsg<Set<String>>> crzpVar3 = this.l;
            dbsk.s(crzpVar3);
            D.c(crzpVar3);
            this.l = null;
        }
    }
}
