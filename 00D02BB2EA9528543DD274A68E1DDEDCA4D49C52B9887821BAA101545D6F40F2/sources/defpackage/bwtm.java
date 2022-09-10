package defpackage;

import android.animation.ObjectAnimator;
import android.view.MotionEvent;
/* compiled from: PG */
/* renamed from: bwtm  reason: default package */
/* loaded from: classes4.dex */
final class bwtm implements dftw {
    final /* synthetic */ bwtr a;

    public bwtm(bwtr bwtrVar) {
        this.a = bwtrVar;
    }

    @Override // defpackage.dftw
    public final void a(boolean z, MotionEvent motionEvent) {
        bwsq bwsqVar;
        bxbs bxbsVar;
        bxbs bxbsVar2;
        this.a.g(deaf.TAP);
        bwty bwtyVar = this.a.aB;
        if (bwtyVar != null) {
            bwtyVar.b();
        }
        bwtr bwtrVar = this.a;
        bwsm bwsmVar = bwtrVar.aC;
        if (bwsmVar != null && (bxbsVar2 = bwtrVar.ay) != null && !z) {
            dhjx l = bxbsVar2.l();
            ams amsVar = this.a.aO;
            if (motionEvent.getActionMasked() == 1) {
                bwvi c = bwsmVar.c(motionEvent.getX(), motionEvent.getY(), l);
                if (c != null) {
                    bwsmVar.d(c, amsVar);
                    return;
                } else if (bwsmVar.k != null) {
                    bwsmVar.i.p(null);
                    return;
                }
            }
        }
        if (z && (bxbsVar = this.a.ay) != null) {
            deaf deafVar = deaf.TAP;
            cjql cjqlVar = bxbsVar.A;
            if (cjqlVar != null) {
                bxbsVar.h.a(cjqlVar, deafVar, dtyb.dW, bxbsVar.h(), null);
            }
        }
        if (this.a.q()) {
            this.a.i();
        }
        if (z || (bwsqVar = this.a.b) == null) {
            return;
        }
        if (bwsqVar.e) {
            bwsqVar.h();
        } else {
            bwsqVar.b(false);
        }
    }

    @Override // defpackage.dftw
    public final void b() {
        this.a.g(deaf.DOUBLE_TAP);
    }

    @Override // defpackage.dftw
    public final void c() {
        this.a.g(deaf.DRAG);
        bwsm bwsmVar = this.a.aC;
        if (bwsmVar != null) {
            bwsw bwswVar = bwsmVar.f;
            if (bwswVar.c != bwsv.SHRANK) {
                bwswVar.c = bwsv.SHRANK;
                ObjectAnimator objectAnimator = bwswVar.d;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bwswVar.b, "scale", bwswVar.c.c);
                ofFloat.setDuration(150L);
                ofFloat.addListener(new bwss(bwswVar));
                for (bwvi bwviVar : bwswVar.a.values()) {
                    bwviVar.c(false);
                }
                bwswVar.d = ofFloat;
                ofFloat.start();
            }
        }
        bwty bwtyVar = this.a.aB;
        if (bwtyVar != null) {
            bwtyVar.b();
        }
        if (this.a.q()) {
            this.a.i();
        }
    }

    @Override // defpackage.dftw
    public final void d() {
        bwtr bwtrVar = this.a;
        float f = bwtrVar.aQ.b;
        float f2 = bwtrVar.aR;
        if (f < f2) {
            bwtrVar.g(deaf.PINCH_OPEN);
        } else if (f > f2) {
            bwtrVar.g(deaf.PINCH_CLOSED);
        }
        this.a.aR = f;
    }

    @Override // defpackage.dftw
    public final void e() {
        this.a.g(deaf.SWIPE);
    }

    @Override // defpackage.dftw
    public final void f() {
        bwsm bwsmVar = this.a.aC;
        if (bwsmVar != null) {
            bwsw bwswVar = bwsmVar.f;
            if (bwswVar.c != bwsv.NORMAL) {
                bwswVar.c = bwsv.NORMAL;
                ObjectAnimator objectAnimator = bwswVar.d;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bwswVar.b, "scale", bwswVar.c.c);
                ofFloat.setDuration(150L);
                ofFloat.addListener(new bwst(bwswVar));
                bwswVar.d = ofFloat;
                ofFloat.start();
            }
        }
        this.a.aS = deaf.UNKNOWN_ACTION;
    }
}
