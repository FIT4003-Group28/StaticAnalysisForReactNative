package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.tabs.TabLayout;
/* compiled from: PG */
/* renamed from: aloo  reason: default package */
/* loaded from: classes.dex */
public final class aloo implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ TabLayout a;

    public aloo(TabLayout tabLayout) {
        this.a = tabLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
    }
}
