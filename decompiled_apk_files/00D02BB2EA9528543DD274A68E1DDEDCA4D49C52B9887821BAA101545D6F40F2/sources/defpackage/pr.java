package defpackage;
/* compiled from: PG */
/* renamed from: pr  reason: default package */
/* loaded from: classes7.dex */
final class pr {
    public int a;
    public int b;
    public float c;
    public float d;
    public float h;
    public int i;
    public long e = Long.MIN_VALUE;
    public long g = -1;
    public long f = 0;

    public final float a(long j) {
        long j2 = this.e;
        if (j < j2) {
            return 0.0f;
        }
        long j3 = this.g;
        if (j3 < 0 || j < j3) {
            return pt.c(((float) (j - j2)) / this.a, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.h;
        return (1.0f - f) + (f * pt.c(((float) (j - j3)) / this.i, 0.0f, 1.0f));
    }
}