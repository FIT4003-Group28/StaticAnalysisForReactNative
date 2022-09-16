package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.HeightTransitionLayout;
/* compiled from: PG */
/* renamed from: fqs  reason: default package */
/* loaded from: classes3.dex */
public final class fqs extends bnk {
    public static final /* synthetic */ int p = 0;

    @Override // defpackage.bnk
    public final Animator a(ViewGroup viewGroup, bnt bntVar, bnt bntVar2) {
        int intValue;
        int intValue2;
        if (bntVar == null || bntVar2 == null || (intValue = ((Integer) bntVar.a.get("heightTransition:height")).intValue()) == (intValue2 = ((Integer) bntVar2.a.get("heightTransition:height")).intValue())) {
            return null;
        }
        final HeightTransitionLayout heightTransitionLayout = (HeightTransitionLayout) bntVar2.b;
        ValueAnimator ofInt = ValueAnimator.ofInt(intValue, intValue2);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fqq
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                HeightTransitionLayout heightTransitionLayout2 = HeightTransitionLayout.this;
                int i = fqs.p;
                heightTransitionLayout2.a(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        ofInt.addListener(new fqr(heightTransitionLayout));
        return ofInt;
    }

    @Override // defpackage.bnk
    public final void b(bnt bntVar) {
        View view = bntVar.b;
        if (!(view instanceof HeightTransitionLayout)) {
            return;
        }
        HeightTransitionLayout heightTransitionLayout = (HeightTransitionLayout) view;
        bntVar.a.put("heightTransition:height", Integer.valueOf(heightTransitionLayout.a));
        heightTransitionLayout.a(-1);
    }

    @Override // defpackage.bnk
    public final void c(bnt bntVar) {
        View view = bntVar.b;
        if (!(view instanceof HeightTransitionLayout)) {
            return;
        }
        HeightTransitionLayout heightTransitionLayout = (HeightTransitionLayout) view;
        bntVar.a.put("heightTransition:height", Integer.valueOf(heightTransitionLayout.getHeight()));
        heightTransitionLayout.a(heightTransitionLayout.getHeight());
    }
}
