package defpackage;

import android.view.ViewGroup;
import android.view.animation.Animation;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fi  reason: default package */
/* loaded from: classes.dex */
public final class fi implements Animation.AnimationListener {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ fd b;
    final /* synthetic */ akq c;
    final /* synthetic */ fy d;

    public fi(ViewGroup viewGroup, fd fdVar, fy fyVar, akq akqVar) {
        this.a = viewGroup;
        this.b = fdVar;
        this.d = fyVar;
        this.c = akqVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.a.post(new fh(this));
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
