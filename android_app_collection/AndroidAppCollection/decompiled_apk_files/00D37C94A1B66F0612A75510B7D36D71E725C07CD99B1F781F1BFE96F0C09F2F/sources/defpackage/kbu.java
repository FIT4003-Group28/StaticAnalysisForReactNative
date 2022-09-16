package defpackage;

import android.os.Handler;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
/* compiled from: PG */
/* renamed from: kbu  reason: default package */
/* loaded from: classes3.dex */
public final class kbu implements ffs, kbk {
    public ffr a;
    public ffr b;
    public kih d;
    public yye e;
    public yye f;
    private final Handler g;
    private boolean i;
    private boolean j;
    private boolean k;
    public long c = 500;
    private final Runnable h = new Runnable() { // from class: kbr
        @Override // java.lang.Runnable
        public final void run() {
            kbu kbuVar = kbu.this;
            kbuVar.c(null);
            kbuVar.d(true);
        }
    };

    public kbu(Handler handler) {
        this.g = handler;
    }

    private final void e(ffr ffrVar) {
        yye yyeVar;
        if (this.b == ffrVar) {
            return;
        }
        this.b = ffrVar;
        if (ffrVar == null || (yyeVar = this.f) == null) {
            return;
        }
        ((TextView) yyeVar.b).setText(ffrVar.a);
    }

    @Override // defpackage.ffs
    public final void a(ffr ffrVar) {
        if (ffrVar != null) {
            if (ffrVar != this.b && ffrVar != this.a) {
                return;
            }
            if (ffrVar == this.a) {
                c(null);
            } else {
                e(null);
            }
            d(true);
        }
    }

    @Override // defpackage.kbk
    public final void b(boolean z) {
        if (!this.i) {
            return;
        }
        this.i = false;
        d(z);
    }

    public final void c(ffr ffrVar) {
        yye yyeVar;
        if (this.a == ffrVar) {
            return;
        }
        this.a = ffrVar;
        this.g.removeCallbacks(this.h);
        ffr ffrVar2 = this.a;
        if (ffrVar2 != null && ffrVar2.b().h()) {
            this.g.postDelayed(this.h, ((Integer) this.a.b().c()).intValue());
        }
        ffr ffrVar3 = this.a;
        if (ffrVar3 != null && (yyeVar = this.e) != null) {
            ((TextView) yyeVar.b).setText(ffrVar3.a);
        }
        kih kihVar = this.d;
        if (kihVar == null) {
            return;
        }
        kihVar.a(this.a != null);
    }

    public final void d(boolean z) {
        long j;
        boolean z2;
        ffr ffrVar;
        if (this.e == null || this.f == null) {
            return;
        }
        boolean z3 = false;
        if (!this.i || this.j || this.k || ((ffrVar = this.a) == null && this.b == null)) {
            j = this.c;
            c(null);
            z2 = false;
        } else {
            z2 = ffrVar == null;
            if (ffrVar != null) {
                z3 = true;
            }
            j = 500;
        }
        yye yyeVar = this.e;
        yyeVar.d = j;
        yyeVar.a(z3, z);
        yye yyeVar2 = this.f;
        yyeVar2.d = j;
        yyeVar2.a(z2, z);
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void i(ControlsOverlayStyle controlsOverlayStyle) {
    }

    @Override // defpackage.kbk
    public final void j(boolean z) {
        if (this.j == z) {
            return;
        }
        this.j = z;
        d(false);
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void k(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void l(ezx ezxVar) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void m(boolean z) {
    }

    @Override // defpackage.ffs
    public final void nB(ffr ffrVar) {
        if (ffrVar == null) {
            return;
        }
        if (ffrVar.b().h()) {
            c(ffrVar);
        } else {
            e(ffrVar);
        }
        d(true);
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void nG(zbb zbbVar) {
    }

    @Override // defpackage.kbk
    public final void nL(boolean z) {
        if (this.i) {
            return;
        }
        this.i = true;
        d(z);
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void nx(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void od(ControlsState controlsState) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void oe(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void og(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void p(boolean z) {
    }

    @Override // defpackage.kbk
    public final void q(boolean z) {
        if (this.k == z) {
            return;
        }
        this.k = z;
        d(false);
    }
}
