package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: nmh  reason: default package */
/* loaded from: classes3.dex */
public final class nmh implements zas {
    public FrameLayout a;
    public FrameLayout b;
    public View c;
    public zar d;
    public zar e;
    public zar f;
    public zar g;
    public zar h;
    public nnv i;
    public int j;
    public final Set k = new HashSet();
    public yye l;
    public yye m;
    public yye n;
    public yye o;

    public static float b(View view, float f) {
        return lj.e(view) == 1 ? -f : f;
    }

    private final void l(boolean z) {
        zag.o(this.c, !z);
    }

    private final void m(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            this.l.l(this.h);
            this.m.l(this.h);
        } else if (i2 != 1) {
            this.l.l(this.d);
            this.m.l(this.e);
        } else {
            this.l.l(this.g);
            this.m.l(this.g);
            this.b.setTranslationZ(this.j);
        }
    }

    public final void c() {
        if (this.m.e()) {
            g(false);
        } else {
            d(false);
        }
    }

    public final void d(boolean z) {
        if (z) {
            this.n.b(false);
            this.l.c(false);
            this.m.j(this);
            this.m.c(false);
            this.m.h(this);
        }
        this.n.c(z);
        this.o.c(false);
        this.l.b(z);
        this.m.b(z);
    }

    public final void e(nmc nmcVar) {
        ((FrameLayout) this.m.b).removeAllViews();
        if (nmcVar != null) {
            ntr.k((ViewGroup) this.l.b, nmcVar.b(), this.i);
            ntr.l((ViewGroup) this.m.b, nmcVar.oX());
        }
    }

    public final void f(nmc nmcVar) {
        ((FrameLayout) this.o.b).removeAllViews();
        if (nmcVar != null) {
            ntr.k((ViewGroup) this.n.b, nmcVar.b(), this.i);
            ntr.l((ViewGroup) this.o.b, nmcVar.oX());
        }
    }

    public final void g(boolean z) {
        if (z) {
            this.n.c(false);
            this.o.c(false);
            this.l.b(false);
            this.m.j(this);
            this.m.b(false);
            this.m.h(this);
        }
        this.n.b(z);
        this.l.c(z);
        this.m.c(z);
    }

    public final void h(nmx nmxVar) {
        if (((FrameLayout) this.o.b).indexOfChild(nmxVar.b.oX()) >= 0) {
            i();
        } else if (((FrameLayout) this.m.b).indexOfChild(nmxVar.b.oX()) < 0) {
            e(nmxVar.b);
        }
        g(false);
    }

    public final void i() {
        this.a.bringChildToFront(this.n.b);
        this.b.bringChildToFront(this.o.b);
        yye yyeVar = this.l;
        yye yyeVar2 = this.n;
        this.l = yyeVar2;
        this.n = yyeVar;
        yye yyeVar3 = this.m;
        this.m = this.o;
        this.o = yyeVar3;
        yyeVar2.l(this.d);
        this.n.l(this.f);
        this.o.j(this);
        this.m.h(this);
    }

    public final void j(nmx nmxVar, nmx nmxVar2, int i) {
        if (((FrameLayout) this.o.b).indexOfChild(nmxVar.b.oX()) >= 0) {
            i();
        } else if (((FrameLayout) this.m.b).indexOfChild(nmxVar.b.oX()) < 0) {
            e(nmxVar.b);
        }
        if (((FrameLayout) this.o.b).indexOfChild(nmxVar2.b.oX()) < 0) {
            f(nmxVar2.b);
        }
        m(i);
        d(true);
    }

    public final void k(nmx nmxVar, nmx nmxVar2, int i) {
        if (((FrameLayout) this.m.b).indexOfChild(nmxVar.b.oX()) >= 0) {
            i();
        } else if (((FrameLayout) this.o.b).indexOfChild(nmxVar.b.oX()) < 0) {
            f(nmxVar.b);
        }
        e(nmxVar2.b);
        m(i);
        g(true);
    }

    @Override // defpackage.zas
    public final void nH(int i, yye yyeVar) {
        for (zas zasVar : this.k) {
            zasVar.nH(i, yyeVar);
        }
        if (i != 0) {
            if (i == 2) {
                this.o.b(false);
            } else {
                l(false);
                return;
            }
        }
        this.b.setTranslationZ(0.0f);
        l(true);
    }
}
