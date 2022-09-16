package defpackage;
/* compiled from: PG */
/* renamed from: ahrr  reason: default package */
/* loaded from: classes2.dex */
public final class ahrr {
    public static float a(float f, float f2, float f3) {
        return (f2 * f) + ((1.0f - f) * f3);
    }

    public static float b(float f, float f2, float f3) {
        while (f >= f3) {
            f -= 360.0f;
        }
        while (f < f2) {
            f += 360.0f;
        }
        return f;
    }
}
