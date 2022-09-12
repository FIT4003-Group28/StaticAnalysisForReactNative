package defpackage;

import android.animation.TypeEvaluator;
/* compiled from: PG */
/* renamed from: cskl  reason: default package */
/* loaded from: classes5.dex */
public final class cskl implements TypeEvaluator<Integer> {
    public static final cskl a = new cskl();

    private cskl() {
    }

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Integer evaluate(float f, Integer num, Integer num2) {
        int intValue = num.intValue();
        int i = (intValue >> 24) & 255;
        int i2 = (intValue >> 16) & 255;
        int i3 = (intValue >> 8) & 255;
        int i4 = intValue & 255;
        int intValue2 = num2.intValue();
        return Integer.valueOf(((i + ((int) ((((intValue2 >> 24) & 255) - i) * f))) << 24) | ((i2 + ((int) ((((intValue2 >> 16) & 255) - i2) * f))) << 16) | ((i3 + ((int) ((((intValue2 >> 8) & 255) - i3) * f))) << 8) | (i4 + ((int) (f * ((intValue2 & 255) - i4)))));
    }
}
