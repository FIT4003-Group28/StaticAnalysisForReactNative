package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: kce  reason: default package */
/* loaded from: classes3.dex */
public final class kce implements kcg, kbk, aigm, kon {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    public final ffo a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final Handler f;
    public final Runnable g;
    public final int i;
    public final azpx k;
    public final kbl l;
    public final acti m;
    public final kcj n;
    public final axxu p;
    public float q;
    public float r;
    public boolean u;
    public long v;
    public boolean w;
    public final aacz x;
    private final boolean y;
    private final boolean z;
    public ampq s = amon.a;
    public final Set h = new HashSet();
    public final Point j = new Point();
    public ampq t = amon.a;
    public final Rect o = new Rect();

    public kce(Context context, ffo ffoVar, Handler handler, kbl kblVar, azpx azpxVar, aacz aaczVar, aigl aiglVar, koo kooVar, acti actiVar, kcj kcjVar, axxu axxuVar) {
        this.a = ffoVar;
        this.f = handler;
        this.k = azpxVar;
        this.l = kblVar;
        this.m = actiVar;
        this.n = kcjVar;
        this.x = aaczVar;
        this.p = axxuVar;
        this.i = context.getResources().getDimensionPixelSize(R.dimen.easy_seek_vertical_dismiss_limit);
        asxj asxjVar = aaczVar.b().e;
        boolean z = (asxjVar == null ? asxj.a : asxjVar).bq;
        this.b = z;
        asxj asxjVar2 = aaczVar.b().e;
        this.c = (asxjVar2 == null ? asxj.a : asxjVar2).bD;
        asxj asxjVar3 = aaczVar.b().e;
        this.d = (asxjVar3 == null ? asxj.a : asxjVar3).bE;
        asxj asxjVar4 = aaczVar.b().e;
        this.e = (asxjVar4 == null ? asxj.a : asxjVar4).cw;
        asxj asxjVar5 = aaczVar.b().e;
        this.y = (asxjVar5 == null ? asxj.a : asxjVar5).cK;
        asxj asxjVar6 = aaczVar.b().e;
        this.z = (asxjVar6 == null ? asxj.a : asxjVar6).cL;
        this.g = new kcd(this, handler);
        if (z) {
            kblVar.a(this);
            aiglVar.c.a(this);
            kooVar.e(this);
        }
    }

    public final void a() {
        this.a.j(this.j);
        if (this.p.b().booleanValue()) {
            this.j.offset(-this.o.left, 0);
        }
    }

    @Override // defpackage.kbk
    public final void b(boolean z) {
        this.A = false;
    }

    @Override // defpackage.kcg
    public final void c() {
        if (!this.z) {
            return;
        }
        this.u = true;
        this.n.a();
        this.f.removeCallbacks(this.g);
        y();
        this.t = amon.a;
    }

    @Override // defpackage.aigm
    public final void e(float f, boolean z) {
        boolean z2 = f > 0.0f;
        if (z2 == this.C) {
            return;
        }
        this.C = z2;
        y();
    }

    @Override // defpackage.kbk
    public final void i(ControlsOverlayStyle controlsOverlayStyle) {
        boolean z = true;
        if (!ControlsOverlayStyle.a(controlsOverlayStyle) && !ControlsOverlayStyle.c(controlsOverlayStyle)) {
            z = false;
        }
        this.E = z;
        if (z) {
            y();
        }
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void j(boolean z) {
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

    @Override // defpackage.aigm
    public final void nF(int i, int i2, int i3) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void nG(zbb zbbVar) {
    }

    @Override // defpackage.kbk
    public final void nL(boolean z) {
        this.A = true;
    }

    @Override // defpackage.kbk
    public final void nx(boolean z) {
        this.B = z;
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
    public final /* synthetic */ void q(boolean z) {
    }

    @Override // defpackage.kon
    public final void s() {
        this.F = true;
        y();
    }

    @Override // defpackage.kon
    public final void t(boolean z) {
        this.F = false;
    }

    @Override // defpackage.kon
    public final void u(float f) {
    }

    public final void v(boolean z) {
        if (!this.s.h() || this.D == z) {
            return;
        }
        this.D = z;
        ((yye) this.s.c()).a(z, true);
        if (z) {
            this.m.u(new acte(actj.SEEK_EDUOVERLAY), null);
        } else {
            this.m.q(new acte(actj.SEEK_EDUOVERLAY), null);
        }
    }

    public final void w() {
        if (!this.t.h()) {
            this.t = ampq.j(Boolean.valueOf(this.A));
        }
        this.w = true;
    }

    public final boolean x() {
        if (this.C || this.E || this.B || this.F || this.u) {
            return true;
        }
        return this.y && !this.A;
    }

    public final void y() {
        if (!this.b) {
            return;
        }
        this.f.removeCallbacks(this.g);
        if (this.t.h()) {
            azpx azpxVar = this.k;
            kbm kbmVar = new kbm(kbn.a());
            kbmVar.b(((Boolean) this.t.c()).booleanValue());
            kbmVar.c(false);
            azpxVar.c(kbmVar.a());
            this.t = amon.a;
        }
        this.n.a();
        if (!this.D) {
            return;
        }
        v(false);
    }
}
