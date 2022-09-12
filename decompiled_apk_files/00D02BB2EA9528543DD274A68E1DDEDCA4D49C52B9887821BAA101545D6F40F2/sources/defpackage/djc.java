package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
/* compiled from: PG */
/* renamed from: djc  reason: default package */
/* loaded from: classes6.dex */
public final class djc implements egr {
    @Override // defpackage.egr
    public final Animator a(View view) {
        return ObjectAnimator.ofFloat(view, "alpha", 1.0f).setDuration(200L);
    }

    @Override // defpackage.egr
    public final Animator b(View view) {
        return ObjectAnimator.ofFloat(view, "alpha", 0.0f).setDuration(200L);
    }

    @Override // defpackage.egr
    public final void c(View view) {
        view.setAlpha(1.0f);
    }
}
