package defpackage;
/* compiled from: PG */
/* renamed from: akzq  reason: default package */
/* loaded from: classes.dex */
public final class akzq {
    public float a;
    public float b;
    public float c;
    public float d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float a(float f) {
        float f2 = this.c;
        if (f2 == 0.0f) {
            return 0.0f;
        }
        float f3 = this.a;
        float f4 = ((this.b - f3) * f) + f3;
        return (f2 * 1.1f * (f4 - f3)) + (((float) (Math.pow(f3, 3.0d) - Math.pow(f4, 3.0d))) / 3.0f);
    }
}
