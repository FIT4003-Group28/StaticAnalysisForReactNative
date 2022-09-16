package defpackage;
/* compiled from: PG */
/* renamed from: ahlv  reason: default package */
/* loaded from: classes2.dex */
public abstract class ahlv {
    public static ahlv c(long j, float[] fArr) {
        return new ahls(j, fArr);
    }

    public abstract long a();

    public abstract float[] b();

    public final float d() {
        float[] b;
        float f = 0.0f;
        for (float f2 : b()) {
            if (!Float.isNaN(f2)) {
                f += f2 * f2;
            }
        }
        return (float) Math.sqrt(f);
    }
}
