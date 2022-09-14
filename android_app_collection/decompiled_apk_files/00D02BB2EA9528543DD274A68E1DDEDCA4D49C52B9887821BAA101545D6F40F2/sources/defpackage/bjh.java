package defpackage;

import android.animation.ValueAnimator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bjh  reason: default package */
/* loaded from: classes3.dex */
public final class bjh implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ bjr a;

    public bjh(bjr bjrVar) {
        this.a = bjrVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        bjr bjrVar = this.a;
        bnm bnmVar = bjrVar.n;
        if (bnmVar != null) {
            bnmVar.m(bjrVar.b.c());
        }
    }
}
