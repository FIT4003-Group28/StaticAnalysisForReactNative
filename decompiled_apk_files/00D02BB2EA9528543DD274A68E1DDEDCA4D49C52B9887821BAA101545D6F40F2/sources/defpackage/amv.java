package defpackage;

import android.view.animation.Interpolator;
/* compiled from: PG */
/* renamed from: amv  reason: default package */
/* loaded from: classes2.dex */
final class amv implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
