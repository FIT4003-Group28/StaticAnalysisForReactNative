package defpackage;

import android.animation.TimeInterpolator;
/* compiled from: PG */
/* renamed from: aqzk  reason: default package */
/* loaded from: classes.dex */
final class aqzk implements TimeInterpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return f < 0.25f ? 0.0f : 1.0f;
    }
}
