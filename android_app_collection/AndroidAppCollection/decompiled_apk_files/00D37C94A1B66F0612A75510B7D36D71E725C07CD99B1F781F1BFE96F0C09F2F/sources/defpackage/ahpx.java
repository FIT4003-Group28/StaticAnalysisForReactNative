package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: ahpx  reason: default package */
/* loaded from: classes.dex */
public final class ahpx extends ahlb implements ahod, ahoe, ahnx, ahnz, ahny, ahlz {
    public final Handler a;
    public ahjp b;
    public ahpp c;
    public ahqq e;
    public ahno f;
    public ahyo g;
    public aicg h;
    public aiap i;
    public boolean j;
    public boolean k;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    private final ahli r;
    private final ahli s;
    private final ahli t;
    private final ahjh u;
    private final ahof v;
    private final ahob w;
    private long x;
    private boolean y;

    public ahpx(ahof ahofVar, ahob ahobVar) {
        this.w = ahobVar;
        this.v = ahofVar;
        ahjh ahjhVar = new ahjh();
        this.u = ahjhVar;
        ahjhVar.a = 500;
        this.a = new Handler(Looper.getMainLooper());
        this.r = new ahli(ahofVar.c.clone(), 40.0f, 30.0f);
        this.s = new ahli(ahofVar.c.clone(), ahofVar.h, ahofVar.i);
        this.t = new ahli(ahofVar.c.clone(), ahofVar.h, ahofVar.i);
    }

    public final void a() {
        this.k = true;
        this.e.c(2);
        this.o = false;
        this.y = false;
        k();
    }

    @Override // defpackage.ahoe
    public final void c(float f, float f2) {
        this.t.b(f, f2);
        this.s.b(f, f2);
    }

    public final void d() {
        this.a.post(new ahpq(this, 2));
        k();
        a();
        this.k = true;
    }

    @Override // defpackage.ahlz
    public final boolean f(ahjy ahjyVar) {
        return !v() && this.r.a(ahjyVar).b();
    }

    @Override // defpackage.ahlz
    public final boolean g(ahjy ahjyVar) {
        return v() && this.k && (this.q != 1 || this.t.a(ahjyVar).b());
    }

    @Override // defpackage.ahlz
    public final boolean h(ahjy ahjyVar) {
        if (!s()) {
            return this.q == 3 || !this.k || !this.s.a(ahjyVar).b();
        }
        return false;
    }

    @Override // defpackage.ahlb, defpackage.ahmf
    public final void i() {
        super.i();
        this.v.g(this);
        this.v.h(this);
    }

    @Override // defpackage.ahlb, defpackage.ahmf
    public final void j(ahjy ahjyVar) {
        Iterator it = this.w.c.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((ahmf) it.next()).o(ahjyVar)) {
                    break;
                }
            } else {
                if (!this.r.a(ahjyVar).b()) {
                    this.m = true;
                }
                boolean z = !this.y;
                this.y = z;
                if (z) {
                    this.x = ahjyVar.b + 2500;
                }
                k();
            }
        }
        super.j(ahjyVar);
    }

    public final void k() {
        boolean z = true;
        this.n = this.w.x() || (this.k && !this.y && !this.j && !this.o && !this.w.y());
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ahmf) it.next()).qS(this.n);
        }
        this.b.qS(!this.j);
        this.w.l();
        this.c.a(this.w.h);
        ahno ahnoVar = this.f;
        boolean z2 = this.n;
        if (!z2 && !this.p) {
            z = false;
        }
        ahnoVar.l = z;
        this.w.h(z2);
    }

    @Override // defpackage.ahlb, defpackage.ahmf
    public final void m(ahjy ahjyVar) {
        boolean z = false;
        if (this.m) {
            this.v.k(ahjyVar);
            this.m = false;
        }
        if (!v() && (o(ahjyVar) || this.w.y())) {
            this.x = ahjyVar.b + 2500;
        } else if (!v()) {
            this.y = this.y && this.x > ahjyVar.b;
            k();
        }
        boolean b = this.r.a(ahjyVar).b();
        ahjh ahjhVar = this.u;
        if (!v() && b) {
            z = true;
        }
        ahjhVar.b(z, ahjyVar.b);
        this.v.l(this.u.a() * 0.66f);
        super.m(ahjyVar);
    }

    @Override // defpackage.ahlb, defpackage.ahmf
    public final void qR(boolean z, ahjy ahjyVar) {
        boolean o = o(ahjyVar);
        if (!z || o) {
            super.qR(z, ahjyVar);
        }
    }

    @Override // defpackage.ahmh, defpackage.ahmf
    public final boolean v() {
        return super.v() || this.n;
    }

    @Override // defpackage.ahod
    public final void z(int i) {
        this.q = i;
        ahni ahniVar = this.c.c;
        boolean z = true;
        if (i == 1) {
            z = false;
        }
        ahniVar.l = z;
    }
}
