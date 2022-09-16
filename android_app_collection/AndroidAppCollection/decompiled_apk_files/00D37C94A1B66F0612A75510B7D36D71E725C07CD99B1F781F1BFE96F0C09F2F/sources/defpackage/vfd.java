package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.quantum.snackbar.Snackbar;
/* compiled from: PG */
/* renamed from: vfd  reason: default package */
/* loaded from: classes4.dex */
public final class vfd extends AnimatorListenerAdapter {
    final /* synthetic */ Snackbar a;

    public vfd(Snackbar snackbar) {
        this.a = snackbar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.setVisibility(0);
    }
}
