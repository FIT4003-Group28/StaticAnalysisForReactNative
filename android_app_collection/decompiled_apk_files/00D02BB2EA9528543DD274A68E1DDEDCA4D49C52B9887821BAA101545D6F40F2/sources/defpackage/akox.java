package defpackage;

import android.content.res.Resources;
import android.graphics.Point;
import android.net.Uri;
import android.view.View;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: akox  reason: default package */
/* loaded from: classes.dex */
public class akox implements akpm {
    public final amyj C;
    private final ckcw D;
    private final amyl E;
    private final amkx F;
    private final boolean G;
    @dzsi
    private akyc K;
    @dzsi
    private akzt L;
    public final cqat a;
    public final btvt b;
    public final amoh c;
    public final dzsj<akwx> d;
    public final akrz e;
    public final dxio<akor> f;
    public final dxio<alyx> g;
    public final dxio<ambz> h;
    public final dxio<bnsn> i;
    public final akpq j;
    public final dxio<akpe> n;
    public boolean p;
    public final akpl r;
    public final alsq s;
    public final ammc t;
    public final bvkx u;
    public boolean w;
    public boolean x;
    public final Executor y;
    public final Executor z;
    public final deig<akoq> k = deig.d();
    final List<Runnable> l = dchl.a();
    boolean m = false;
    public Point o = new Point();
    public volatile boolean q = false;
    private boolean H = false;
    @dzsi
    private Collection<akzy> I = new HashSet();
    private final Object J = new Object();
    private final AtomicBoolean M = new AtomicBoolean(false);
    public final AtomicBoolean v = new AtomicBoolean(false);
    public dpwz A = dpwz.UNKNOWN_MAP_CONTENT_TYPE;
    public boolean B = false;

    public akox(dxio dxioVar, akpl akplVar, dxio dxioVar2, dxio dxioVar3, alsq alsqVar, amkx amkxVar, boolean z, dxio dxioVar4, akpq akpqVar, dxio dxioVar5, ammc ammcVar, bvkx bvkxVar, amyj amyjVar, ckcw ckcwVar, cqat cqatVar, btvt btvtVar, amyl amylVar, amoh amohVar, Executor executor, Executor executor2, dzsj dzsjVar, akrz akrzVar) {
        this.f = dxioVar;
        this.r = akplVar;
        this.g = dxioVar2;
        this.h = dxioVar3;
        this.s = alsqVar;
        this.i = dxioVar4;
        this.j = akpqVar;
        this.D = ckcwVar;
        this.a = cqatVar;
        this.b = btvtVar;
        this.c = amohVar;
        this.F = amkxVar;
        this.G = z;
        this.n = dxioVar5;
        this.t = ammcVar;
        this.u = bvkxVar;
        this.C = amyjVar;
        this.y = executor;
        this.z = executor2;
        this.E = amylVar;
        this.d = dzsjVar;
        this.e = akrzVar;
    }

    private final synchronized void al() {
        if (this.k.isDone()) {
            return;
        }
        aj().a(a(), this.f.a().e(), this.G);
        aj().U(this.F);
        if (!this.n.a().b()) {
            aj().ai(false);
        } else if (!this.H && !this.q) {
            this.q = true;
        }
        synchronized (this.J) {
            Collection<akzy> collection = this.I;
            if (collection != null) {
                this.I = null;
                for (akzy akzyVar : collection) {
                    ab(akzyVar);
                }
            }
        }
        synchronized (this.l) {
            this.m = true;
            for (Runnable runnable : this.l) {
                runnable.run();
            }
            this.l.clear();
        }
        this.k.j(aj());
    }

    public final boolean A() {
        return aj().r();
    }

    public final void B(boolean z) {
        aj().t(z);
    }

    public final void C(boolean z) {
        aj().u(z);
    }

    public final void D(boolean z) {
        aj().v(z);
    }

    public final void E() {
        aj().I();
    }

    public final void F() {
        aj().P();
    }

    public final void G(boolean z) {
        aj().Q(z);
    }

    public final void H(boolean z) {
        aj().K(z);
    }

    public final boolean I() {
        return aj().p();
    }

    @Override // defpackage.akpm
    @dzsi
    public final aliw J() {
        return a().c();
    }

    public final void K(@dzsi akzw akzwVar) {
        this.f.a().d().i(akzwVar);
    }

    public final amml L(Resources resources, akrw akrwVar, alyl alylVar) {
        alyl p = alylVar.p(aj().ar());
        bnsn a = this.i.a();
        dxio<amom> c = this.f.a().c();
        akzh k = k();
        amxf amxfVar = amxf.ROADMAP;
        alwn a2 = amxf.ROADMAP.a(A());
        alsq alsqVar = this.s;
        ammc ammcVar = this.t;
        bvkx bvkxVar = this.u;
        amoh amohVar = this.c;
        dbsk.s(amohVar);
        amco e = this.h.a().e(akrwVar, p);
        cqat cqatVar = this.a;
        dbsk.s(cqatVar);
        btvt btvtVar = this.b;
        Executor executor = this.y;
        Executor executor2 = this.z;
        alyx a3 = this.g.a();
        dbsk.s(a3);
        cjvm g = this.f.a().g();
        dbsk.s(g);
        ckcw ckcwVar = this.D;
        dbsk.s(ckcwVar);
        return amml.H(a, c, k, akrwVar, p, resources, amxfVar, a2, alsqVar, ammcVar, bvkxVar, amohVar, e, cqatVar, btvtVar, executor, executor2, null, a3, g, ckcwVar, this.C, new dzsj(this) { // from class: akot
            private final akox a;

            {
                this.a = this;
            }

            @Override // defpackage.dzsj
            public final Object a() {
                akox akoxVar = this.a;
                akww j = akwx.j();
                j.g(akoxVar.d.a().a());
                return j.a();
            }
        }, this.e);
    }

    public final amml M(Resources resources, akrw akrwVar, alyl alylVar) {
        alyl p = alylVar.p(aj().ar());
        dxio<amom> c = this.f.a().c();
        akzh k = k();
        ammc ammcVar = this.t;
        bvkx bvkxVar = this.u;
        amoh amohVar = this.c;
        dbsk.s(amohVar);
        amco e = this.h.a().e(akrwVar, p);
        cqat cqatVar = this.a;
        dbsk.s(cqatVar);
        btvt btvtVar = this.b;
        Executor executor = this.y;
        Executor executor2 = this.z;
        alyx a = this.g.a();
        dbsk.s(a);
        amyj amyjVar = this.C;
        akrz akrzVar = this.e;
        boolean A = A();
        int b = aluv.b(resources);
        return new amml(this.i.a(), k, akrwVar, p, new anbe(btvtVar, cqatVar), new amox(akrwVar, p, new amoj(0, b + b, false, false), null, amohVar, e, cqatVar, executor2, c, false, akrzVar, A), new aluz(a), null, 0, true, 256, 256, false, false, ammcVar, bvkxVar, amohVar, e, executor, null, null, amyjVar, null, null, akrzVar);
    }

    public final amml N(Resources resources, akrw akrwVar, alyl alylVar) {
        alyl p = alylVar.p(aj().ar());
        dxio<amom> c = this.f.a().c();
        akzh k = k();
        ammc ammcVar = this.t;
        bvkx bvkxVar = this.u;
        amoh amohVar = this.c;
        dbsk.s(amohVar);
        amco e = this.h.a().e(akrwVar, p);
        cqat cqatVar = this.a;
        dbsk.s(cqatVar);
        btvt btvtVar = this.b;
        Executor executor = this.y;
        Executor executor2 = this.z;
        alyx a = this.g.a();
        dbsk.s(a);
        amyj amyjVar = this.C;
        akrz akrzVar = this.e;
        boolean A = A();
        int b = aluv.b(resources);
        return new amml(this.i.a(), k, akrwVar, p, new anbe(btvtVar, cqatVar), new amox(akrwVar, p, new amoj(2, b + b, false, false), null, amohVar, e, cqatVar, executor2, c, false, akrzVar, A), new aluz(a), null, 2, false, 256, 256, false, true, ammcVar, bvkxVar, amohVar, e, executor, null, null, amyjVar, null, null, akrzVar);
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        printWriter.println(String.valueOf(str).concat("MapContainer:"));
        String concat = String.valueOf(str).concat("  ");
        String valueOf = String.valueOf(n());
        StringBuilder sb = new StringBuilder(String.valueOf(concat).length() + 16 + String.valueOf(valueOf).length());
        sb.append(concat);
        sb.append("CameraPosition: ");
        sb.append(valueOf);
        printWriter.println(sb.toString());
        aj().NX(concat, printWriter);
        this.c.NX(concat, printWriter);
    }

    public final void O(String str, amlq amlqVar) {
        P(str, amlqVar, false);
    }

    public final void P(final String str, final amlq amlqVar, final boolean z) {
        synchronized (this.l) {
            if (!this.m) {
                this.l.add(new Runnable(this, str, amlqVar, z) { // from class: akou
                    private final akox a;
                    private final String b;
                    private final amlq c;
                    private final boolean d;

                    {
                        this.a = this;
                        this.b = str;
                        this.c = amlqVar;
                        this.d = z;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.P(this.b, this.c, this.d);
                    }
                });
            } else {
                aj().L(str, amlqVar, z);
            }
        }
    }

    public final void Q(final String str) {
        synchronized (this.l) {
            if (!this.m) {
                this.l.add(new Runnable(this, str) { // from class: akov
                    private final akox a;
                    private final String b;

                    {
                        this.a = this;
                        this.b = str;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.Q(this.b);
                    }
                });
            } else {
                aj().M(str);
            }
        }
    }

    public final void R(amjm amjmVar) {
        aj().S(amjmVar);
    }

    public final void S(@dzsi final amjm amjmVar, @dzsi final amjm amjmVar2) {
        synchronized (this.l) {
            if (!this.m) {
                this.l.add(new Runnable(this, amjmVar, amjmVar2) { // from class: akow
                    private final akox a;
                    private final amjm b;
                    private final amjm c;

                    {
                        this.a = this;
                        this.b = amjmVar;
                        this.c = amjmVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        akox akoxVar = this.a;
                        akoxVar.aj().T(this.b, this.c);
                    }
                });
            } else {
                aj().T(amjmVar, amjmVar2);
            }
        }
    }

    public final crzm<aktu> T() {
        return aj().ad();
    }

    @Override // defpackage.akpm
    public final boolean U() {
        return aj().V();
    }

    public final void V(boolean z) {
        aj().W(z);
    }

    public final Uri.Builder W(Uri.Builder builder, String str) {
        alad n = n();
        if (n == null) {
            return builder;
        }
        akqq akqqVar = n.i;
        alrh ak = ak();
        if (ak == null) {
            return builder;
        }
        aksg c = ak.c();
        String concat = str.concat("ll");
        double d = akqqVar.a;
        double d2 = akqqVar.b;
        StringBuilder sb = new StringBuilder(49);
        sb.append(d);
        sb.append(",");
        sb.append(d2);
        Uri.Builder appendQueryParameter = builder.appendQueryParameter(concat, sb.toString());
        String concat2 = str.concat("spn");
        double c2 = decb.c(c.c.a, c.d.a, c.a.a, c.b.a);
        double b = decb.b(c.c.a, c.d.a, c.a.a, c.b.a);
        double c3 = decb.c(c.c.b, c.d.b, c.a.b, c.b.b);
        double b2 = decb.b(c.c.b, c.d.b, c.a.b, c.b.b);
        StringBuilder sb2 = new StringBuilder(49);
        sb2.append(c2 - b);
        sb2.append(",");
        sb2.append(c3 - b2);
        return appendQueryParameter.appendQueryParameter(concat2, sb2.toString());
    }

    public final String X(@dzsi String str) {
        String str2 = "";
        if (n() == null) {
            return str2;
        }
        Uri.Builder path = new Uri.Builder().scheme("http").authority("maps.google.com").path("maps");
        if (!dbsj.d(str)) {
            path.appendQueryParameter("q", str);
            str2 = "s";
        }
        return W(path, str2).toString();
    }

    @Override // defpackage.akpm
    public final dhjx Y(@dzsi alad aladVar) {
        akzh k = k();
        return alad.d(aladVar, k.B(), k.C(), this.o.x, this.o.y);
    }

    @Override // defpackage.akpm
    @Deprecated
    public final dhjx Z() {
        amyn.b.a();
        al();
        return Y(n());
    }

    public final akpc a() {
        return this.f.a().f();
    }

    @Override // defpackage.akpm
    public final dhjx aa() {
        al();
        akzh l = l();
        dhjx Y = Y(l.p());
        akra q = l.q();
        dsqp dsqpVar = (dsqp) Y.cu(5);
        dsqpVar.bC(Y);
        dhjw dhjwVar = (dhjw) dsqpVar;
        dhjy bZ = dhjz.e.bZ();
        double k = q.k();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhjz dhjzVar = (dhjz) bZ.b;
        dhjzVar.a |= 2;
        dhjzVar.c = k;
        double o = q.o();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhjz dhjzVar2 = (dhjz) bZ.b;
        dhjzVar2.a |= 1;
        dhjzVar2.b = o;
        dhjz dhjzVar3 = Y.b;
        if (dhjzVar3 == null) {
            dhjzVar3 = dhjz.e;
        }
        double d = dhjzVar3.d;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhjz dhjzVar4 = (dhjz) bZ.b;
        dhjzVar4.a |= 4;
        dhjzVar4.d = d;
        if (dhjwVar.c) {
            dhjwVar.bF();
            dhjwVar.c = false;
        }
        dhjx dhjxVar = (dhjx) dhjwVar.b;
        dhjz bK = bZ.bK();
        bK.getClass();
        dhjxVar.b = bK;
        dhjxVar.a |= 1;
        return dhjwVar.bK();
    }

    @Override // defpackage.akpm
    public final void ad(akzx akzxVar) {
        aj().ay(akzxVar);
    }

    @Override // defpackage.akpm
    public final void ae(akzx akzxVar) {
        aj().az(akzxVar);
    }

    public final View af() {
        return this.f.a().e().a();
    }

    @Override // defpackage.akpm
    /* renamed from: ag */
    public final akoq aj() {
        return this.f.a().a();
    }

    public final void ah() {
        if (this.M.compareAndSet(false, true)) {
            this.t.i();
        }
    }

    public final void ai(boolean z) {
        aj().ao(z);
    }

    @Override // defpackage.akpm
    @dzsi
    public final alrh ak() {
        af();
        return this.f.a().h();
    }

    public final void b() {
        if (this.k.isDone()) {
            aj().b();
        }
        synchronized (this.l) {
            this.l.clear();
        }
    }

    public final void d() {
        this.p = true;
        al();
        aj().d();
        amyl amylVar = this.E;
        synchronized (amylVar) {
            amylVar.a++;
        }
        amylVar.c();
        akyc akycVar = this.K;
        if (akycVar != null) {
            q(akycVar, this.L);
            this.K = null;
            this.L = null;
        }
    }

    public final void e() {
        f();
        amyl amylVar = this.E;
        synchronized (amylVar) {
            dbsk.l(amylVar.a > 0);
            amylVar.a--;
        }
        amylVar.c();
        aj().e();
        this.p = false;
    }

    public final void f() {
        g(k().p());
    }

    public final void g(alad aladVar) {
        akoo akooVar;
        akpj akpjVar;
        if (!this.w || (akpjVar = (akooVar = (akoo) this.n.a()).b) == null) {
            return;
        }
        akpjVar.a(aladVar, Boolean.TRUE.equals(akooVar.e));
    }

    public final void h() {
        this.H = true;
        if (!this.q) {
            return;
        }
        this.q = false;
        aj().ai(false);
    }

    @Override // defpackage.akpm
    public final boolean i() {
        return this.k.isDone();
    }

    @Deprecated
    public final bnsn j() {
        return this.i.a();
    }

    @Override // defpackage.akpm
    @Deprecated
    public final akzh k() {
        return this.f.a().b();
    }

    @Override // defpackage.akpm
    public final akzh l() {
        if (bnuq.b()) {
            return k();
        }
        return k().b();
    }

    public final void m(Point point) {
        this.o = point;
        aj().af();
    }

    @Override // defpackage.akpm
    @Deprecated
    public final alad n() {
        return k().p();
    }

    @Override // defpackage.akpm
    public final boolean o(alaa alaaVar) {
        return this.f.a().d().c(alaaVar);
    }

    @Override // defpackage.akpm
    public final void p(akyc akycVar) {
        q(akycVar, null);
    }

    @Override // defpackage.akpm
    public final void q(final akyc akycVar, @dzsi final akzt akztVar) {
        if (!this.p) {
            this.K = akycVar;
            akzt akztVar2 = this.L;
            if (akztVar2 != null) {
                akztVar2.c();
            }
            this.L = akztVar;
            return;
        }
        if (this.k.isDone()) {
            View a = this.f.a().e().a();
            if (a.getWidth() > 0 && a.getHeight() > 0) {
                aj().ag(akycVar, akztVar);
                return;
            }
        }
        this.f.a().e().a().post(new Runnable(this, akycVar, akztVar) { // from class: akos
            private final akox a;
            private final akyc b;
            private final akzt c;

            {
                this.a = this;
                this.b = akycVar;
                this.c = akztVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                akox akoxVar = this.a;
                akoxVar.aj().ag(this.b, this.c);
            }
        });
    }

    @Override // defpackage.akpm
    public final void r(akzv akzvVar) {
        this.f.a().d().d(akzvVar);
    }

    public final boolean s() {
        return aj().g();
    }

    public final boolean t() {
        return aj().j();
    }

    public final boolean u() {
        return aj().k();
    }

    public final boolean v() {
        return aj().l();
    }

    public final boolean w() {
        return aj().o();
    }

    public final boolean x() {
        return aj().m();
    }

    public final boolean y() {
        return aj().n();
    }

    public final boolean z() {
        return aj().q();
    }

    @Override // defpackage.akpm
    public final void ab(akzy akzyVar) {
        synchronized (this.J) {
            Collection<akzy> collection = this.I;
            if (collection != null) {
                collection.add(akzyVar);
            } else {
                aj().aw(akzyVar);
            }
        }
    }

    @Override // defpackage.akpm
    public final void ac(akzy akzyVar) {
        synchronized (this.J) {
            Collection<akzy> collection = this.I;
            if (collection != null) {
                collection.remove(akzyVar);
            } else {
                aj().ax(akzyVar);
            }
        }
    }
}
