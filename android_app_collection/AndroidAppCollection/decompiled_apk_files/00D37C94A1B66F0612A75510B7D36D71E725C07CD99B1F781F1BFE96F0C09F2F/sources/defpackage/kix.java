package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
/* compiled from: PG */
/* renamed from: kix  reason: default package */
/* loaded from: classes3.dex */
public final class kix extends ffj implements kbk, aigm {
    public final ffo h;
    public final boolean i;
    public boolean j;
    public ezx k;
    private final ahwz l;
    private final aigl m;
    private final ffu n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;

    public kix(Context context, ahwz ahwzVar, aigl aiglVar, aacz aaczVar, kgn kgnVar, ffo ffoVar, ffm ffmVar, ahxo ahxoVar, ffu ffuVar, int i) {
        super(context, ffoVar, ffuVar);
        this.h = ffoVar;
        this.n = ffuVar;
        this.l = ahwzVar;
        this.m = aiglVar;
        asxj asxjVar = aaczVar.b().e;
        this.i = (asxjVar == null ? asxj.a : asxjVar).aF;
        ffoVar.kP(ahwzVar);
        ffoVar.kP(ahxoVar);
        ffoVar.w(i);
        ffoVar.v(ffmVar);
        aiglVar.c.a(this);
        kgnVar.d.A().Z(new ayqb() { // from class: kiw
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                kix kixVar = kix.this;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (kixVar.j == booleanValue) {
                    return;
                }
                kixVar.j = booleanValue;
                kixVar.u();
            }
        });
    }

    private final void v(boolean z) {
        u();
        if (this.q) {
            if (z && !this.o && x()) {
                nX(true);
            } else if (this.p || !x()) {
                nT(false);
            } else {
                nX(false);
            }
            if (!this.w || this.x) {
                return;
            }
            this.n.a(false);
        } else if (this.u) {
            nX(false);
        } else if (!z || this.o) {
            if (!this.o || !this.t) {
                nT(false);
            } else {
                nX(false);
            }
        } else {
            nT(true);
        }
    }

    private final void w() {
        boolean z = true;
        if (!this.k.b() && !this.v) {
            z = false;
        }
        if (this.f == z) {
            return;
        }
        this.f = z;
        super.s();
        super.t(false);
    }

    private final boolean x() {
        return !this.m.c.d() && (!this.r || this.s);
    }

    @Override // defpackage.kbk
    public final void b(boolean z) {
        if (!this.q) {
            return;
        }
        this.q = false;
        v(z);
    }

    @Override // defpackage.aigm
    public final void e(float f, boolean z) {
        nW(1.0f - akf.d(f));
    }

    @Override // defpackage.ffj, defpackage.fev
    public final void i(ControlsOverlayStyle controlsOverlayStyle) {
        super.i(controlsOverlayStyle);
        boolean z = true;
        if (this.o == controlsOverlayStyle.v) {
            if (this.p == (controlsOverlayStyle == ControlsOverlayStyle.j)) {
                return;
            }
        }
        this.o = controlsOverlayStyle.v;
        if (controlsOverlayStyle != ControlsOverlayStyle.j) {
            z = false;
        }
        this.p = z;
        v(false);
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void j(boolean z) {
    }

    @Override // defpackage.kbk
    public final void k(boolean z) {
        if (this.r == z) {
            return;
        }
        this.r = z;
        v(false);
    }

    @Override // defpackage.kbk
    public final void l(ezx ezxVar) {
        this.k = ezxVar;
        w();
    }

    @Override // defpackage.kbk
    public final void m(boolean z) {
        if (this.s == z) {
            return;
        }
        this.s = z;
        v(false);
    }

    @Override // defpackage.aigm
    public final void nF(int i, int i2, int i3) {
        if (i != i2) {
            v(false);
        }
    }

    @Override // defpackage.kbk
    public final void nG(zbb zbbVar) {
        boolean z = this.v;
        boolean z2 = zbbVar instanceof zbe;
        this.v = z2;
        if (z == z2) {
            return;
        }
        w();
    }

    @Override // defpackage.kbk
    public final void nL(boolean z) {
        if (this.q) {
            return;
        }
        this.q = true;
        v(z);
    }

    @Override // defpackage.fev
    public final void nS(long j, long j2, long j3, long j4) {
        super.nS(j, j2, j3, j4);
        ahwz ahwzVar = this.l;
        if (ahwzVar.h) {
            return;
        }
        ahwzVar.j(j, 1);
    }

    @Override // defpackage.kbk
    public final void nx(boolean z) {
        if (z) {
            nW(0.5f);
        } else {
            nW(1.0f);
        }
    }

    @Override // defpackage.kbk
    public final void od(ControlsState controlsState) {
        if (this.t == controlsState.j()) {
            return;
        }
        this.t = controlsState.j();
        v(false);
    }

    @Override // defpackage.kbk
    public final void oe(boolean z) {
        if (this.u == z) {
            return;
        }
        this.u = z;
        v(false);
    }

    @Override // defpackage.kbk
    public final void og(boolean z) {
        if (this.w == z) {
            return;
        }
        this.w = z;
        v(false);
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void p(boolean z) {
    }

    @Override // defpackage.kbk
    public final void q(boolean z) {
        if (this.x == z) {
            return;
        }
        this.x = z;
        if (this.w && z) {
            this.n.f(false);
        }
        ((kjd) this.n).h.c(Boolean.valueOf(z));
    }

    public final void u() {
        if (this.q) {
            r(1);
        } else if (this.j) {
            r(3);
        } else {
            r(0);
        }
    }
}
