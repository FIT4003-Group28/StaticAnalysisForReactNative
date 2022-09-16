package defpackage;

import android.view.animation.Animation;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: fxd  reason: default package */
/* loaded from: classes3.dex */
final class fxd implements Animation.AnimationListener {
    final /* synthetic */ fxe a;

    public fxd(fxe fxeVar) {
        this.a = fxeVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        TextView textView = this.a.a;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
