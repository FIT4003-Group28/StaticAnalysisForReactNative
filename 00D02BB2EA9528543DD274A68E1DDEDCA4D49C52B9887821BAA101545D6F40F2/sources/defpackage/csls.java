package defpackage;

import android.animation.Animator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: csls  reason: default package */
/* loaded from: classes5.dex */
final class csls extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ csme a;

    public csls(csme csmeVar) {
        this.a = csmeVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        csme csmeVar = this.a;
        if (!csmeVar.v) {
            return false;
        }
        if (!csmeVar.r) {
            csmeVar.r = true;
            csmeVar.s = new LinearInterpolator();
            csme csmeVar2 = this.a;
            csmeVar2.t = csmeVar2.j(csmeVar2.s);
            Animator animator = this.a.m;
            if (animator != null) {
                animator.cancel();
            }
            this.a.n.d();
        }
        float x = motionEvent2.getX();
        float y = motionEvent2.getY();
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        this.a.p = csmm.a(x, y, x2, y2);
        float dimension = this.a.getResources().getDimension(R.dimen.libraries_material_featurehighlight_swipe_max_transition_distance);
        csme csmeVar3 = this.a;
        csmeVar3.q = Math.min(1.0f, csmeVar3.p / dimension);
        csme csmeVar4 = this.a;
        float interpolation = csmeVar4.s.getInterpolation(csmeVar4.q);
        float f3 = 1.0f - interpolation;
        float exactCenterX = csmeVar4.b.exactCenterX();
        float f4 = csmeVar4.f.h;
        float exactCenterY = csmeVar4.b.exactCenterY();
        csmj csmjVar = csmeVar4.f;
        float f5 = csmjVar.i;
        csmjVar.setScale(f3);
        int i = (int) (255.0f * f3);
        csmeVar4.f.setAlpha(i);
        csmeVar4.f.setTranslationX((exactCenterX - f4) * interpolation);
        csmeVar4.f.setTranslationY(interpolation * (exactCenterY - f5));
        csmeVar4.g.setAlpha(i);
        csmeVar4.g.setScale(f3);
        if (csmeVar4.k()) {
            csmeVar4.l.setElevation(f3 * csmeVar4.i.getElevation());
        }
        csmeVar4.h.a().setAlpha(1.0f - csmeVar4.t.getInterpolation(csmeVar4.q));
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        csme csmeVar = this.a;
        if (csmeVar.x != null && csmeVar.y.isTouchExplorationEnabled()) {
            csme csmeVar2 = this.a;
            if (csmeVar2.x.d == 5) {
                csmeVar2.h();
                return true;
            }
        }
        csme csmeVar3 = this.a;
        if (csmeVar3.w) {
            if (csmeVar3.f(x, y) && this.a.f.c(x, y)) {
                return true;
            }
            this.a.h();
            return true;
        }
        return true;
    }
}
