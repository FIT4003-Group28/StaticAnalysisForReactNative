package defpackage;

import android.view.animation.Interpolator;
/* compiled from: PG */
/* renamed from: afs  reason: default package */
/* loaded from: classes2.dex */
final class afs implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return f * f * f * f * f;
    }
}
