package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aifu  reason: default package */
/* loaded from: classes.dex */
public final class aifu extends AnimatorListenerAdapter {
    final /* synthetic */ aifw a;

    public aifu(aifw aifwVar) {
        this.a = aifwVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.b();
    }
}
