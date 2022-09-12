package defpackage;
/* compiled from: PG */
/* renamed from: clod  reason: default package */
/* loaded from: classes5.dex */
public final class clod {
    public static final clod a = new clod(1.0f, 1.0f);
    public final float b;
    public final float c;
    public final int d;

    public clod(float f, float f2) {
        boolean z = true;
        cmmn.a(f > 0.0f);
        cmmn.a(f2 <= 0.0f ? false : z);
        this.b = f;
        this.c = f2;
        this.d = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            clod clodVar = (clod) obj;
            if (this.b == clodVar.b && this.c == clodVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.b) + 527) * 31) + Float.floatToRawIntBits(this.c);
    }

    public final String toString() {
        return cmny.z("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.b), Float.valueOf(this.c));
    }
}
