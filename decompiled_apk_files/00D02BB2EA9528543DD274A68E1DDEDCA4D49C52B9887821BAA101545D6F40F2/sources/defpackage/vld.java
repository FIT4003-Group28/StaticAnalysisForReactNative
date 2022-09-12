package defpackage;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
/* compiled from: PG */
/* renamed from: vld  reason: default package */
/* loaded from: classes7.dex */
public final class vld {
    public static Animation a(float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(irf.a);
        return alphaAnimation;
    }
}
