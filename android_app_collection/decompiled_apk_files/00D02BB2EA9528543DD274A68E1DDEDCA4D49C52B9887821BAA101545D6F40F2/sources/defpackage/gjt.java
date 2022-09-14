package defpackage;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.google.android.apps.gmm.base.layout.MainLayout;
/* compiled from: PG */
/* renamed from: gjt  reason: default package */
/* loaded from: classes.dex */
public final class gjt implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ MainLayout b;
    final /* synthetic */ int c;

    public gjt(MainLayout mainLayout, int i, ViewGroup viewGroup) {
        this.b = mainLayout;
        this.c = i;
        this.a = viewGroup;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        this.b.az = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i = this.c;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                this.a.setTranslationY((this.b.az - 1.0f) * viewGroup.getHeight());
                return;
            } else if (i2 != 1) {
                return;
            } else {
                this.a.setAlpha(this.b.az);
                return;
            }
        }
        throw null;
    }
}
