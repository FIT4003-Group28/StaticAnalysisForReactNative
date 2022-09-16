package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;
/* compiled from: PG */
/* renamed from: cwpj  reason: default package */
/* loaded from: classes5.dex */
public final class cwpj extends AnimatorListenerAdapter {
    final /* synthetic */ ExpandableDialogView a;

    public cwpj(ExpandableDialogView expandableDialogView) {
        this.a = expandableDialogView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.requestLayout();
        this.a.t(0.0f);
    }
}
