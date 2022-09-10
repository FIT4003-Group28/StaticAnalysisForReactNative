package defpackage;

import android.view.animation.Animation;
import com.google.android.apps.gmm.base.layout.MainLayout;
/* compiled from: PG */
/* renamed from: gjy  reason: default package */
/* loaded from: classes6.dex */
public final class gjy implements Animation.AnimationListener {
    final /* synthetic */ alts a;
    final /* synthetic */ altu b;
    final /* synthetic */ MainLayout c;

    public gjy(MainLayout mainLayout, alts altsVar, altu altuVar) {
        this.c = mainLayout;
        this.a = altsVar;
        this.b = altuVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.c.q(this.a, this.b);
        this.c.L.b.setVisibility(8);
        this.c.requestLayout();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
