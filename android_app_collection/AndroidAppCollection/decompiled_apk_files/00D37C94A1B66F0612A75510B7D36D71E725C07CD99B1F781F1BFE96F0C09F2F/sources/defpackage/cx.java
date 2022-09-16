package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cx  reason: default package */
/* loaded from: classes3.dex */
public final class cx implements Animation.AnimationListener {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ View b;
    final /* synthetic */ cz c;

    public cx(ViewGroup viewGroup, View view, cz czVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = czVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.a.post(new cw(this));
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
