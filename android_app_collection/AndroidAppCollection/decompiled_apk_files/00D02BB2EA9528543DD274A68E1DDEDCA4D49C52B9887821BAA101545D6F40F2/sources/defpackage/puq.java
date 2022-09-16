package defpackage;

import android.view.animation.Animation;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: puq  reason: default package */
/* loaded from: classes7.dex */
public final class puq implements Animation.AnimationListener {
    final /* synthetic */ puy a;

    public puq(puy puyVar) {
        this.a = puyVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        puy puyVar = this.a;
        pvk pvkVar = puyVar.bh;
        if (!puyVar.aD || pvkVar == null || !pvkVar.v()) {
            return;
        }
        pvkVar.l();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
