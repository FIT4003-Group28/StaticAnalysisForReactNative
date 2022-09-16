package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: asvo  reason: default package */
/* loaded from: classes2.dex */
public final class asvo extends AnimatorListenerAdapter {
    final /* synthetic */ asvq a;

    public asvo(asvq asvqVar) {
        this.a = asvqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view = this.a.d;
        if (view != null) {
            view.setVisibility(0);
            asvq asvqVar = this.a;
            if (asvqVar.h == null) {
                return;
            }
            asvqVar.d.sendAccessibilityEvent(8);
        }
    }
}
