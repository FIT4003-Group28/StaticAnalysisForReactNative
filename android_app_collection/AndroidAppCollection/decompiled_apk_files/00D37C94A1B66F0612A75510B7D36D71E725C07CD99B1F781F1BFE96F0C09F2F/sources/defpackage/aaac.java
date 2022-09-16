package defpackage;

import android.view.animation.Animation;
import com.google.android.libraries.youtube.infocards.factories.InfoCardCollection;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aaac  reason: default package */
/* loaded from: classes.dex */
public final class aaac implements Animation.AnimationListener {
    final /* synthetic */ InfoCardCollection a;
    final /* synthetic */ int b;
    final /* synthetic */ aaag c;

    public aaac(aaag aaagVar, InfoCardCollection infoCardCollection, int i) {
        this.c = aaagVar;
        this.a = infoCardCollection;
        this.b = i;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.c.c(this.a, this.b, true);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
