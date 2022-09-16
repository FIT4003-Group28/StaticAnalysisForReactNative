package defpackage;
/* compiled from: PG */
/* renamed from: pjt  reason: default package */
/* loaded from: classes4.dex */
public final class pjt {
    public static final pjt a = new pjt(1.0f);
    public final float b;
    public final float c;
    public final int d;

    public pjt(float f) {
        this(f, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            pjt pjtVar = (pjt) obj;
            if (this.b == pjtVar.b && this.c == pjtVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.b) + 527) * 31) + Float.floatToRawIntBits(this.c);
    }

    public final String toString() {
        return pxi.z("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.b), Float.valueOf(this.c));
    }

    public pjt(float f, float f2) {
        boolean z = true;
        ptx.c(f > 0.0f);
        ptx.c(f2 <= 0.0f ? false : z);
        this.b = f;
        this.c = f2;
        this.d = Math.round(f * 1000.0f);
    }
}
