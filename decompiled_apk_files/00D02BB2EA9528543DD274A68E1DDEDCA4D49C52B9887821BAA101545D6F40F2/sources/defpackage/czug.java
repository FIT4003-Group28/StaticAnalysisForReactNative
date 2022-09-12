package defpackage;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
/* compiled from: PG */
/* renamed from: czug  reason: default package */
/* loaded from: classes5.dex */
final class czug extends AccelerateDecelerateInterpolator {
    private final DecelerateInterpolator a = new DecelerateInterpolator(0.8f);

    @Override // android.view.animation.AccelerateDecelerateInterpolator, android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return super.getInterpolation(this.a.getInterpolation(f));
    }
}
