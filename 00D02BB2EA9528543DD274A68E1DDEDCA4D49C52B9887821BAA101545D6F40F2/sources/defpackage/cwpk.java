package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;
/* compiled from: PG */
/* renamed from: cwpk  reason: default package */
/* loaded from: classes5.dex */
public final class cwpk extends AnimatorListenerAdapter {
    final /* synthetic */ ExpandableDialogView a;

    public cwpk(ExpandableDialogView expandableDialogView) {
        this.a = expandableDialogView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.t(0.0f);
    }
}
