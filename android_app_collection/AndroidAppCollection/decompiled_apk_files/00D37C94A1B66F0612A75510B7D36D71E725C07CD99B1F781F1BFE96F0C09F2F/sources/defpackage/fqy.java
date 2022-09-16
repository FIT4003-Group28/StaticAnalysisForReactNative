package defpackage;

import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
/* compiled from: PG */
/* renamed from: fqy  reason: default package */
/* loaded from: classes3.dex */
public final class fqy implements Interpolator {
    private final TimeInterpolator a = new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f);

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.a.getInterpolation(f);
    }
}
