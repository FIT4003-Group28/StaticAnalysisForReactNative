package defpackage;

import android.animation.TimeInterpolator;
/* compiled from: PG */
/* renamed from: aqzl  reason: default package */
/* loaded from: classes.dex */
final class aqzl implements TimeInterpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return f < 0.25f ? 1.0f - (f / 0.25f) : aqzs.g.getInterpolation((f - 0.25f) / 0.75f);
    }
}
