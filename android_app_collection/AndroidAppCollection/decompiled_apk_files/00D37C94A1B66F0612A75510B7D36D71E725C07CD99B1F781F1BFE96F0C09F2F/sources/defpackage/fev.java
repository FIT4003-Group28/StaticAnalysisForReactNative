package defpackage;

import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: fev  reason: default package */
/* loaded from: classes3.dex */
public class fev {
    public final aibw a;
    public final aibt b;
    final ffu c;
    public aihh d;

    public fev(aibw aibwVar, ffu ffuVar) {
        aibt aibtVar = new aibt();
        aibwVar.getClass();
        this.a = aibwVar;
        this.c = ffuVar;
        this.b = aibtVar;
    }

    public static CharSequence a(long j) {
        return zgh.i(TimeUnit.MILLISECONDS.toSeconds(j + 500));
    }

    public final void c(long j) {
        aibs.K(this.b, j);
    }

    public final void d() {
        if (this.a.kI() == 0) {
            return;
        }
        aibt aibtVar = this.b;
        aibtVar.b = 0L;
        this.a.y(aibtVar);
    }

    public final void h(aiby aibyVar) {
        this.a.kP(aibyVar);
    }

    public void i(ControlsOverlayStyle controlsOverlayStyle) {
        aibt aibtVar = this.b;
        aibtVar.h = controlsOverlayStyle.q;
        aibtVar.k = controlsOverlayStyle.r;
        aibtVar.m = controlsOverlayStyle.s;
        aibtVar.l = controlsOverlayStyle.w;
        aibtVar.n = controlsOverlayStyle.x;
        aibtVar.o = controlsOverlayStyle.y;
        aibtVar.m(controlsOverlayStyle.z);
        this.a.y(this.b);
        this.c.nE(ControlsOverlayStyle.b(controlsOverlayStyle));
        this.c.b(controlsOverlayStyle.s);
        this.c.d(this.b.l);
    }

    public void nS(long j, long j2, long j3, long j4) {
        aibt aibtVar = this.b;
        if (aibtVar.c == j && aibtVar.d == j2 && aibtVar.a == j3 && aibtVar.b == j4) {
            return;
        }
        aibtVar.n(j, j2, j3, j4);
        this.a.y(this.b);
        nY();
        nZ();
    }

    public void nT(boolean z) {
        this.c.a(z);
    }

    public void nX(boolean z) {
        this.c.f(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void nY() {
        ffu ffuVar = this.c;
        aibt aibtVar = this.b;
        ffuVar.g(ahfa.c(aibtVar.c, aibtVar.a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void nZ() {
        if (this.b.a <= 0) {
            return;
        }
        this.c.e(a(this.a.kH()), a(this.b.a - this.a.kH()), a(this.b.a));
    }

    public void oa() {
        this.b.l();
        ob();
        this.a.y(this.b);
    }

    public final void ob() {
        this.a.kN();
        aihh aihhVar = this.d;
        if (aihhVar != null) {
            aihhVar.f(false);
        }
    }
}
