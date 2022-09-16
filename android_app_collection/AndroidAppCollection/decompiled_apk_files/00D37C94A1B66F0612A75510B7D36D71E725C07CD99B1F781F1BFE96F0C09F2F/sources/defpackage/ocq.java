package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ocq  reason: default package */
/* loaded from: classes3.dex */
public final class ocq {
    public static final Interpolator a = kt.o(0.05f, 0.0f, 0.0f, 1.0f);
    public final View b;
    public final int c;
    public final aypf d;
    public int e;
    public ValueAnimator f = null;
    public nsr g = null;

    public ocq(final View view, nml nmlVar) {
        this.b = view;
        this.c = view.getContext().getResources().getDimensionPixelSize(R.dimen.watch_panel_playlist_entry_point_height);
        aypf aypfVar = new aypf();
        this.d = aypfVar;
        aypfVar.d(nmlVar.h().j.n().Z(new ayqb() { // from class: ocp
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                final ocq ocqVar = ocq.this;
                final View view2 = view;
                nsr nsrVar = (nsr) obj;
                if (nsrVar == nsr.HIDDEN && ocqVar.g != nsr.HIDDEN) {
                    ValueAnimator valueAnimator = ocqVar.f;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        ocqVar.f = null;
                    }
                    ocqVar.f = ValueAnimator.ofInt(ocqVar.e, 0).setDuration(300L);
                    ocqVar.f.setStartDelay(100L);
                    ocqVar.f.setInterpolator(ocq.a);
                    ocqVar.f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: oco
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            ocq ocqVar2 = ocq.this;
                            View view3 = view2;
                            int intValue = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                            ocqVar2.e = intValue;
                            view3.setTranslationY(intValue);
                        }
                    });
                    ocqVar.f.start();
                } else if (nsrVar != nsr.HIDDEN && ocqVar.g == nsr.HIDDEN) {
                    int i = ocqVar.c;
                    ocqVar.e = i;
                    view2.setTranslationY(i);
                }
                ocqVar.g = nsrVar;
            }
        }));
    }
}
