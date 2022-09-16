package defpackage;
/* compiled from: PG */
/* renamed from: asr  reason: default package */
/* loaded from: classes2.dex */
public final class asr {
    public final int a;
    public final int b;
    public final int c;
    public final float d;

    static {
        new asr(0, 0);
    }

    public asr(int i, int i2) {
        this(i, i2, 1.0f);
    }

    public asr(int i, int i2, float f) {
        this.a = i;
        this.b = i2;
        this.c = 0;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof asr) {
            asr asrVar = (asr) obj;
            if (this.a == asrVar.a && this.b == asrVar.b) {
                int i = asrVar.c;
                if (this.d == asrVar.d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a + 217) * 31) + this.b) * 961) + Float.floatToRawIntBits(this.d);
    }
}
