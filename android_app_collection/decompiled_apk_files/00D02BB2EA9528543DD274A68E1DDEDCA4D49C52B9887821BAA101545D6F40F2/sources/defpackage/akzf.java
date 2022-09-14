package defpackage;

import android.animation.TimeInterpolator;
/* compiled from: PG */
/* renamed from: akzf  reason: default package */
/* loaded from: classes.dex */
public final class akzf implements TimeInterpolator {
    public TimeInterpolator a;
    private final akzq b;

    public akzf(TimeInterpolator timeInterpolator, akzq akzqVar) {
        dbsk.s(timeInterpolator);
        this.a = timeInterpolator;
        this.b = akzqVar;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float interpolation = this.a.getInterpolation(f);
        akzq akzqVar = this.b;
        float a = akzqVar.d == 0.0f ? 0.0f : akzqVar.a(interpolation) / akzqVar.d;
        return a != 0.0f ? a : interpolation;
    }
}
