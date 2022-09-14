package defpackage;

import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: dzyt  reason: default package */
/* loaded from: classes6.dex */
public final class dzyt extends dsqp<dzyu, dzyt> implements dssk {
    public dzyt() {
        super(dzyu.an);
    }

    public final void A(int i, dzys dzysVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dzyu dzyuVar = (dzyu) this.b;
        dzyu dzyuVar2 = dzyu.an;
        dzysVar.getClass();
        dzyuVar.i();
        dzyuVar.h.set(i, dzysVar);
    }

    public final void B(int i, dzys dzysVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dzyu dzyuVar = (dzyu) this.b;
        dzyu dzyuVar2 = dzyu.an;
        dzysVar.getClass();
        dzyuVar.j();
        dzyuVar.i.set(i, dzysVar);
    }

    public final dzys a(int i) {
        return ((dzyu) this.b).g.get(i);
    }

    public final dzys b(int i) {
        return ((dzyu) this.b).h.get(i);
    }

    public final dzys c(int i) {
        return ((dzyu) this.b).i.get(i);
    }

    public final dzys d(int i) {
        return ((dzyu) this.b).j.get(i);
    }

    public final dzys e(int i) {
        return ((dzyu) this.b).k.get(i);
    }

    public final dzys f(int i) {
        return ((dzyu) this.b).l.get(i);
    }

    public final dzys g(int i) {
        return ((dzyu) this.b).n.get(i);
    }

    public final void h(Iterable<? extends dzys> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dzyu dzyuVar = (dzyu) this.b;
        dzyu dzyuVar2 = dzyu.an;
        dzyuVar.m();
        dsod.bv(iterable, dzyuVar.l);
    }

    public final void i(Iterable<? extends dzys> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dzyu dzyuVar = (dzyu) this.b;
        dzyu dzyuVar2 = dzyu.an;
        dzyuVar.o();
        dsod.bv(iterable, dzyuVar.n);
    }

    public final void j(Iterable<? extends dzyk> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dzyu dzyuVar = (dzyu) this.b;
        dzyu dzyuVar2 = dzyu.an;
        dsrj<dzyk> dsrjVar = dzyuVar.q;
        if (!dsrjVar.a()) {
            dzyuVar.q = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, dzyuVar.q);
    }

    public final void k(Iterable<? extends dzyo> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dzyu dzyuVar = (dzyu) this.b;
        dzyu dzyuVar2 = dzyu.an;
        dsrj<dzyo> dsrjVar = dzyuVar.p;
        if (!dsrjVar.a()) {
            dzyuVar.p = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, dzyuVar.p);
    }

    public final void l(Iterable<? extends dzys> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dzyu dzyuVar = (dzyu) this.b;
        dzyu dzyuVar2 = dzyu.an;
        dzyuVar.l();
        dsod.bv(iterable, dzyuVar.k);
    }

    public final void m(Iterable<? extends dzys> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dzyu dzyuVar = (dzyu) this.b;
        dzyu dzyuVar2 = dzyu.an;
        dzyuVar.k();
        dsod.bv(iterable, dzyuVar.j);
    }

    public final void n(Iterable<? extends dzys> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dzyu dzyuVar = (dzyu) this.b;
        dzyu dzyuVar2 = dzyu.an;
        dzyuVar.h();
        dsod.bv(iterable, dzyuVar.g);
    }

    public final void o(Iterable<? extends dzys> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dzyu dzyuVar = (dzyu) this.b;
        dzyu dzyuVar2 = dzyu.an;
        dzyuVar.i();
        dsod.bv(iterable, dzyuVar.h);
    }

    public final void p(Iterable<? extends dzys> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dzyu dzyuVar = (dzyu) this.b;
        dzyu dzyuVar2 = dzyu.an;
        dzyuVar.j();
        dsod.bv(iterable, dzyuVar.i);
    }

    public final void q(long j) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dzyu dzyuVar = (dzyu) this.b;
        dzyu dzyuVar2 = dzyu.an;
        dzyuVar.b |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        dzyuVar.ai = j;
    }

    public final void r(long j) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dzyu dzyuVar = (dzyu) this.b;
        dzyu dzyuVar2 = dzyu.an;
        dzyuVar.b |= ImageMetadata.SHADING_MODE;
        dzyuVar.am = j;
    }

    public final void s(int i, dzys dzysVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dzyu dzyuVar = (dzyu) this.b;
        dzyu dzyuVar2 = dzyu.an;
        dzysVar.getClass();
        dzyuVar.m();
        dzyuVar.l.set(i, dzysVar);
    }

    public final void t(dzys dzysVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dzyu dzyuVar = (dzyu) this.b;
        dzyu dzyuVar2 = dzyu.an;
        dzysVar.getClass();
        dzyuVar.aj = dzysVar;
        dzyuVar.b |= 131072;
    }

    public final void u(int i, dzys dzysVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dzyu dzyuVar = (dzyu) this.b;
        dzyu dzyuVar2 = dzyu.an;
        dzysVar.getClass();
        dzyuVar.o();
        dzyuVar.n.set(i, dzysVar);
    }

    public final void v(int i, dzys dzysVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dzyu dzyuVar = (dzyu) this.b;
        dzyu dzyuVar2 = dzyu.an;
        dzysVar.getClass();
        dzyuVar.l();
        dzyuVar.k.set(i, dzysVar);
    }

    public final void w(long j) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dzyu dzyuVar = (dzyu) this.b;
        dzyu dzyuVar2 = dzyu.an;
        dzyuVar.b |= ImageMetadata.LENS_APERTURE;
        dzyuVar.al = j;
    }

    public final void x(long j) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dzyu dzyuVar = (dzyu) this.b;
        dzyu dzyuVar2 = dzyu.an;
        dzyuVar.b |= 262144;
        dzyuVar.ak = j;
    }

    public final void y(int i, dzys dzysVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dzyu dzyuVar = (dzyu) this.b;
        dzyu dzyuVar2 = dzyu.an;
        dzysVar.getClass();
        dzyuVar.k();
        dzyuVar.j.set(i, dzysVar);
    }

    public final void z(int i, dzys dzysVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dzyu dzyuVar = (dzyu) this.b;
        dzyu dzyuVar2 = dzyu.an;
        dzysVar.getClass();
        dzyuVar.h();
        dzyuVar.g.set(i, dzysVar);
    }
}
