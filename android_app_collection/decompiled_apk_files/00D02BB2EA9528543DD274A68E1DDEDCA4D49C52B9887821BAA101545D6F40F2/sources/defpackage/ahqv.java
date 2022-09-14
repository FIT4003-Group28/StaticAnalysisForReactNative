package defpackage;
/* compiled from: PG */
/* renamed from: ahqv  reason: default package */
/* loaded from: classes.dex */
public final class ahqv {
    public float a = -1.0f;
    public float b = Float.MAX_VALUE;
    public long c = Long.MIN_VALUE;
    public long d = Long.MIN_VALUE;

    public static float a(float f, float f2, float f3) {
        return f < 0.0f ? f2 : Math.abs(f2 - f) < 180.0f ? (f * f3) + ((1.0f - f3) * f2) : f2 > f ? ahrr.b((f * f3) + ((1.0f - f3) * (f2 - 360.0f)), 0.0f, 360.0f) : ahrr.b(((f - 360.0f) * f3) + ((1.0f - f3) * f2), 0.0f, 360.0f);
    }
}
