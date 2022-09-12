package defpackage;
/* compiled from: PG */
/* renamed from: ahqu  reason: default package */
/* loaded from: classes.dex */
public final class ahqu {
    protected float a;
    private float b = 0.0f;
    private long c = 0;
    private final boolean d;

    public ahqu(boolean z) {
        this.d = z;
    }

    public final float a(long j, float f) {
        long j2 = this.c;
        if (j2 == 0 || j < j2) {
            this.a = f;
        } else {
            if (this.d) {
                float abs = Math.abs(f - this.a);
                if (abs + abs > 360.0f) {
                    f = f < this.a ? f + 360.0f : f - 360.0f;
                }
            }
            float f2 = ((float) (j - this.c)) / 100.0f;
            if (f2 > 10.0f || f2 < 0.0f) {
                this.a = f;
                this.b = 0.0f;
            } else {
                while (f2 > 0.0f) {
                    float min = Math.min(0.5f, f2);
                    float f3 = (f - this.a) / 10.0f;
                    float abs2 = this.b + (Math.abs(f3) * f3 * min);
                    this.b = abs2;
                    if (abs2 != 0.0f) {
                        float f4 = (f3 * 10.0f) / abs2;
                        float exp = (float) (Math.exp((-f4) * f4) + 0.5d);
                        if (exp * min >= 1.0f) {
                            this.b = 0.0f;
                        } else {
                            float f5 = this.b;
                            float f6 = f5 - ((exp * f5) * min);
                            this.b = f6;
                            this.a += f6 * min;
                        }
                    }
                    f2 -= 0.5f;
                }
            }
        }
        this.c = j;
        if (this.d) {
            while (true) {
                float f7 = this.a;
                if (f7 < 360.0f) {
                    break;
                }
                this.a = f7 - 360.0f;
            }
            while (true) {
                float f8 = this.a;
                if (f8 >= 0.0f) {
                    break;
                }
                this.a = f8 + 360.0f;
            }
        }
        return this.a;
    }
}
