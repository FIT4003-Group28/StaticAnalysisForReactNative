package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
/* compiled from: PG */
/* renamed from: bbwp  reason: default package */
/* loaded from: classes3.dex */
public final class bbwp implements egr {
    @Override // defpackage.egr
    public final Animator a(View view) {
        return ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, 1.0f);
    }

    @Override // defpackage.egr
    public final Animator b(View view) {
        return ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f, 0.0f);
    }

    @Override // defpackage.egr
    public final void c(View view) {
        view.setAlpha(1.0f);
    }
}
