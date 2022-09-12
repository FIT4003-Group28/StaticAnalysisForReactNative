package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
/* compiled from: PG */
/* renamed from: cvys  reason: default package */
/* loaded from: classes5.dex */
final class cvys extends AnimatorListenerAdapter {
    final /* synthetic */ cvyt a;

    public cvys(cvyt cvytVar) {
        this.a = cvytVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.b.setTranslationY(0.0f);
        SelectedAccountDisc<T> selectedAccountDisc = this.a.b;
        selectedAccountDisc.setPivotX(selectedAccountDisc.getHeight() >> 1);
        SelectedAccountDisc<T> selectedAccountDisc2 = this.a.b;
        selectedAccountDisc2.setPivotY(selectedAccountDisc2.getHeight() >> 1);
    }
}
