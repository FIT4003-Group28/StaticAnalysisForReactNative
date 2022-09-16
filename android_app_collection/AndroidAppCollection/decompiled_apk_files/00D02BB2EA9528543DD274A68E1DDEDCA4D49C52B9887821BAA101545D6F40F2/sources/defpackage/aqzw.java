package defpackage;
/* compiled from: PG */
/* renamed from: aqzw  reason: default package */
/* loaded from: classes2.dex */
final class aqzw {
    private long b;
    private float c = -1.0f;
    public float a = -1.0f;

    public final void a(float f) {
        this.c = bvop.a(f);
        if (this.a == -1.0f || this.b == 0) {
            this.a = f;
        }
    }

    public final void b(long j) {
        if (c()) {
            this.b = j;
            return;
        }
        long j2 = this.b;
        long j3 = 0;
        if (j2 == 0) {
            j3 = 16;
        } else {
            long j4 = j - j2;
            if (j4 > 0) {
                j3 = Math.min(j4, 40L);
            }
        }
        this.b = j;
        float f = this.a;
        float f2 = this.c;
        float f3 = (((float) j3) / 1000.0f) * 10.0f;
        float c = bvop.c(f2 - f);
        if (Math.abs(c) > 0.05f) {
            f2 = bvop.a(f + (c * f3));
        }
        this.a = f2;
    }

    public final boolean c() {
        return Math.abs(this.a - this.c) < 1.0E-4f;
    }
}
