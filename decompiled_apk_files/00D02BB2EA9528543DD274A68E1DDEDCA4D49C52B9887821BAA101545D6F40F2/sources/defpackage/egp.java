package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: egp  reason: default package */
/* loaded from: classes6.dex */
final class egp implements egr {
    @Override // defpackage.egr
    public final Animator a(View view) {
        return AnimatorInflater.loadAnimator(view.getContext(), R.animator.full_screen_enter);
    }

    @Override // defpackage.egr
    public final Animator b(View view) {
        return AnimatorInflater.loadAnimator(view.getContext(), R.animator.full_screen_exit);
    }

    @Override // defpackage.egr
    public final void c(View view) {
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }
}
