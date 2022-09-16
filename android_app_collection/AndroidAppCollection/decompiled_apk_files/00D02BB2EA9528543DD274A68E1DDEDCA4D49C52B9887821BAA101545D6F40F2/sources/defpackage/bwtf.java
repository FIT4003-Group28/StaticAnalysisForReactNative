package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bwtf  reason: default package */
/* loaded from: classes4.dex */
public final class bwtf extends AnimatorListenerAdapter {
    final /* synthetic */ bwtr a;

    public bwtf(bwtr bwtrVar) {
        this.a = bwtrVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ams amsVar = this.a.aO;
        if (amsVar != null) {
            amsVar.n();
        }
    }
}
