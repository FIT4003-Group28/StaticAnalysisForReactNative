package defpackage;

import android.content.Context;
import android.util.TypedValue;
import java.math.RoundingMode;
/* compiled from: PG */
/* renamed from: cqrp  reason: default package */
/* loaded from: classes.dex */
public class cqrp implements cqtv {
    public final int a;

    private cqrp(int i) {
        this.a = i;
    }

    public static cqrp c(double d) {
        return new cqrp(g(0, d));
    }

    public static cqrp d(double d) {
        return new cqrp(g(1, d));
    }

    public static cqrp f(double d) {
        return new cqrp(g(2, d));
    }

    private static int g(int i, double d) {
        return deav.b(d) ? h(i, 0, (int) d) : h(i, 1, deav.a(d * 128.0d, RoundingMode.HALF_EVEN));
    }

    private static int h(int i, int i2, int i3) {
        return i | (i2 << 4) | ((16777215 & i3) << 8);
    }

    @Override // defpackage.cqtv
    public final int NR(Context context) {
        return TypedValue.complexToDimensionPixelOffset(this.a, context.getResources().getDisplayMetrics());
    }

    @Override // defpackage.cqtv
    public final float a(Context context) {
        return TypedValue.complexToDimension(this.a, context.getResources().getDisplayMetrics());
    }

    @Override // defpackage.cqtv
    public final int e(Context context) {
        return TypedValue.complexToDimensionPixelSize(this.a, context.getResources().getDisplayMetrics());
    }

    public final boolean equals(@dzsi Object obj) {
        return (obj instanceof cqrp) && ((cqrp) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a;
    }
}
