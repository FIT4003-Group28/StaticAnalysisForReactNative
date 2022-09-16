package defpackage;

import android.view.View;
import android.view.animation.Animation;
/* compiled from: PG */
/* renamed from: fws  reason: default package */
/* loaded from: classes3.dex */
final class fws implements Animation.AnimationListener {
    final /* synthetic */ View a;
    final /* synthetic */ fwt b;

    public fws(fwt fwtVar, View view) {
        this.b = fwtVar;
        this.a = view;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        View view = this.a;
        if (view != null) {
            view.setVisibility(8);
        }
        this.b.b = false;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        this.b.b = true;
    }
}
