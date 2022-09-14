package defpackage;
/* compiled from: PG */
/* renamed from: aoq  reason: default package */
/* loaded from: classes2.dex */
final class aoq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static float a(float[] fArr, float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        int length = fArr.length;
        int min = Math.min((int) ((length - 1) * f), length - 2);
        float f2 = fArr[min];
        return f2 + (((f - (min * 0.005f)) / 0.005f) * (fArr[min + 1] - f2));
    }
}
