package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ahux  reason: default package */
/* loaded from: classes.dex */
public final class ahux implements Animation.AnimationListener {
    final /* synthetic */ ahuz a;

    public ahux(ahuz ahuzVar) {
        this.a = ahuzVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        View c = this.a.c();
        if (c.getParent() != null) {
            ((ViewGroup) c.getParent()).removeView(c);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
