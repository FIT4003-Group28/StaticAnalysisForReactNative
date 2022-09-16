package defpackage;

import android.animation.ValueAnimator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bxk  reason: default package */
/* loaded from: classes2.dex */
public final class bxk implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ bxn a;

    public bxk(bxn bxnVar) {
        this.a = bxnVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        bxn bxnVar = this.a;
        cbe cbeVar = bxnVar.k;
        if (cbeVar != null) {
            cbeVar.l(bxnVar.b.c());
        }
    }
}
