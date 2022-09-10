package defpackage;

import android.graphics.drawable.GradientDrawable;
/* compiled from: PG */
/* renamed from: akms  reason: default package */
/* loaded from: classes2.dex */
public final class akms {
    public static cqtd a() {
        return b(-1291845632);
    }

    public static cqtd b(Integer num) {
        int intValue = num.intValue() & 16777215;
        double intValue2 = (num.intValue() >> 24) & 255;
        Double.isNaN(intValue2);
        Double.isNaN(intValue2);
        Double.isNaN(intValue2);
        Double.isNaN(intValue2);
        return cqui.c(cquh.i(cqta.f(), cqta.f(), c(intValue, (0.85d * intValue2) / 4.0d), c(intValue, (intValue2 + intValue2) / 4.0d), c(intValue, (3.0d * intValue2) / 4.0d), c(intValue, intValue2)), cquh.a(0), cquh.d(GradientDrawable.Orientation.TOP_BOTTOM), cquh.b(0));
    }

    private static cqss c(int i, double d) {
        return cqta.d(i | (((int) Math.round(d)) << 24));
    }
}
