package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
/* compiled from: PG */
/* renamed from: hfw  reason: default package */
/* loaded from: classes6.dex */
final class hfw extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ hfx b;

    public hfw(hfx hfxVar, View view) {
        this.b = hfxVar;
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.b(this.a);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.setVisibility(0);
    }
}
