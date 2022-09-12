package defpackage;
/* compiled from: PG */
/* renamed from: akqx  reason: default package */
/* loaded from: classes.dex */
public final class akqx {
    public static final byte[] a = {68, 82, 65, 84};
    public static final float[] b = new float[31];

    static {
        for (int i = 0; i <= 30; i++) {
            b[i] = (float) (Math.pow(2.0d, 30 - i) / 256.0d);
        }
    }

    private akqx() {
    }

    public static float a(float f) {
        return (float) (Math.pow(2.0d, 30.0f - f) / 256.0d);
    }
}
