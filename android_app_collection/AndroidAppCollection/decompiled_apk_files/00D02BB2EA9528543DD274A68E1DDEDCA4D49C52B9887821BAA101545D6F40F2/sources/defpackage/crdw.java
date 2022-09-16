package defpackage;

import java.io.File;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: crdw  reason: default package */
/* loaded from: classes5.dex */
public final class crdw implements crdi {
    private final cqat a;
    private final crco b;
    private final bvjj c;
    private final btyh d;
    private final ckst e;
    private final btvo f;
    private ckss g;
    @dzsi
    private crdu h;
    private final crdz i;

    public crdw(crco crcoVar, btvo btvoVar, bvjj bvjjVar, cqat cqatVar, btyh btyhVar, ckst ckstVar, crdz crdzVar) {
        this.b = crcoVar;
        this.f = btvoVar;
        this.c = bvjjVar;
        this.a = cqatVar;
        this.d = btyhVar;
        this.e = ckstVar;
        this.i = crdzVar;
    }

    private final synchronized void j() {
        if (this.g == null) {
            this.g = this.e.a(new crdv(this), this.f);
        }
    }

    @dzsi
    private final crdt k(crfk crfkVar) {
        File file;
        boolean z = false;
        if (!l() || h() == null) {
            file = null;
        } else {
            file = h().c(crfkVar);
            if (file != null) {
                z = true;
            }
        }
        if (file == null && m() && g() != null) {
            file = g().c(crfkVar);
        }
        if (file != null && file.exists() && file.canRead()) {
            return new crdt(file, this.b, this.c, z);
        }
        return null;
    }

    private final boolean l() {
        return !this.d.b();
    }

    private final boolean m() {
        if (this.i.a()) {
            return this.i.d();
        }
        return true;
    }

    @Override // defpackage.crbl
    @dzsi
    public final crbc a(crfj crfjVar) {
        return k(crfjVar.b);
    }

    @Override // defpackage.crbl
    public final void b() {
        crdu crduVar;
        synchronized (this) {
            crduVar = this.h;
            if (crduVar != null) {
                this.h = null;
            } else {
                crduVar = null;
            }
        }
        if (crduVar != null) {
            crduVar.a();
        }
        if (g() != null) {
            g().e();
        }
        if (h() != null) {
            h().e();
        }
    }

    @Override // defpackage.crbl
    public final void c() {
        if (g() != null) {
            g().f();
        }
        if (h() != null) {
            h().f();
        }
    }

    @Override // defpackage.crdi
    public final boolean d(crfj crfjVar) {
        crbc a = a(crfjVar);
        if (a != null) {
            return !l() || h() == null || ((crdt) a).b == 2;
        }
        return false;
    }

    @Override // defpackage.crdj
    public final void e(crfj crfjVar, @dzsi crdg crdgVar, cksq cksqVar) {
        if (d(crfjVar)) {
            if (crdgVar == null) {
                return;
            }
            a(crfjVar);
            crdgVar.f();
            return;
        }
        crdu crduVar = new crdu(crfjVar, crdgVar, cksqVar);
        if (crduVar.a == cksq.NOW) {
            synchronized (this) {
                this.h = crduVar;
            }
        }
        if ((crduVar.a == cksq.NOW || crduVar.a == cksq.SOON) && m()) {
            crfk b = crduVar.b();
            cksq cksqVar2 = crduVar.a;
            if (g() != null) {
                g().b(new cksp(b, cksqVar2, this.a.e()));
            }
        }
        if (!l()) {
            return;
        }
        crfk b2 = crduVar.b();
        cksq cksqVar3 = crduVar.a;
        if (h() == null) {
            return;
        }
        h().b(new cksp(b2, cksqVar3, this.a.e()));
    }

    @Override // defpackage.crdj
    public final void f(Locale locale) {
        if (g() != null) {
            g().d(locale);
        }
    }

    @dzsi
    public final cksr g() {
        j();
        return this.g.a();
    }

    @dzsi
    public final cksr h() {
        j();
        return this.g.b();
    }

    public final void i(crfk crfkVar) {
        crdu crduVar;
        boolean z;
        synchronized (this) {
            crduVar = this.h;
            z = false;
            if (crduVar != null && crfkVar.equals(crduVar.b())) {
                this.h = null;
                z = true;
            }
        }
        if (z) {
            k(crduVar.b());
            crduVar.c();
        } else if (crduVar == null) {
        } else {
            crduVar.a();
        }
    }
}
