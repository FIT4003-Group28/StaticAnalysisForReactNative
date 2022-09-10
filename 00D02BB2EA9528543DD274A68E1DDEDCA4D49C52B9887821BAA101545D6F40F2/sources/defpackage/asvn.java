package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: asvn  reason: default package */
/* loaded from: classes2.dex */
public final class asvn extends AnimatorListenerAdapter {
    final /* synthetic */ asvq a;

    public asvn(asvq asvqVar) {
        this.a = asvqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        for (int i = 0; i < this.a.getChildCount(); i++) {
            if (this.a.getChildAt(i) instanceof asvf) {
                ((asvf) this.a.getChildAt(i)).sendAccessibilityEvent(8);
                return;
            }
        }
    }
}
