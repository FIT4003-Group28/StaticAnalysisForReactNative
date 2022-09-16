package defpackage;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;
/* compiled from: PG */
/* renamed from: czzt  reason: default package */
/* loaded from: classes5.dex */
final class czzt implements TypeEvaluator<Float> {
    final FloatEvaluator a = new FloatEvaluator();

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Float evaluate(float f, Float f2, Float f3) {
        float floatValue = this.a.evaluate(f, (Number) f2, (Number) f3).floatValue();
        if (floatValue < 0.1f) {
            floatValue = 0.0f;
        }
        return Float.valueOf(floatValue);
    }
}
