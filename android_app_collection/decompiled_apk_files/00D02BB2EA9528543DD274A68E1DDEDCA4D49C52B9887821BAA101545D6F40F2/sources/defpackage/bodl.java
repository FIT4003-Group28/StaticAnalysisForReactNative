package defpackage;

import android.content.Context;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
/* compiled from: PG */
/* renamed from: bodl  reason: default package */
/* loaded from: classes3.dex */
final class bodl implements cqrx {
    final /* synthetic */ boolean a;

    public bodl(boolean z) {
        this.a = z;
    }

    @Override // defpackage.cqrx
    public final Animation a(Context context) {
        boolean z = this.a;
        float f = 1.0f;
        float f2 = true != z ? 1.0f : 0.0f;
        if (true != z) {
            f = 0.0f;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f);
        alphaAnimation.setDuration(350L);
        alphaAnimation.setInterpolator(irf.a);
        return alphaAnimation;
    }
}
