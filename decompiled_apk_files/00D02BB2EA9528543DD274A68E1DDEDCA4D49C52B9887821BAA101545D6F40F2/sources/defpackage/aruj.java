package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
/* compiled from: PG */
/* renamed from: aruj  reason: default package */
/* loaded from: classes2.dex */
final class aruj implements cqfc {
    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f));
        ofPropertyValuesHolder.setInterpolator(irf.a);
        ofPropertyValuesHolder.setDuration(1000L);
        ofPropertyValuesHolder.start();
    }
}
