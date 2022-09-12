package defpackage;
/* compiled from: PG */
/* renamed from: csmm  reason: default package */
/* loaded from: classes5.dex */
public final class csmm {
    public static float a(float f, float f2, float f3, float f4) {
        return (float) Math.hypot(f3 - f, f4 - f2);
    }

    public static float b(float f) {
        if (f < 0.0f) {
            return 0.0f;
        }
        if (f <= 1.0f) {
            return f;
        }
        return 1.0f;
    }
}
