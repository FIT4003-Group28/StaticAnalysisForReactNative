package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
/* compiled from: PG */
/* renamed from: egt  reason: default package */
/* loaded from: classes6.dex */
final class egt implements egr {
    @Override // defpackage.egr
    public final Animator a(View view) {
        return ObjectAnimator.ofFloat(view, "translationY", view.getMeasuredHeight(), 0.0f);
    }

    @Override // defpackage.egr
    public final Animator b(View view) {
        return ObjectAnimator.ofFloat(view, "translationY", 0.0f, view.getMeasuredHeight());
    }

    @Override // defpackage.egr
    public final void c(View view) {
        view.setTranslationY(0.0f);
    }
}
