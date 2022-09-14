package defpackage;
/* compiled from: PG */
/* renamed from: amkz  reason: default package */
/* loaded from: classes.dex */
public final class amkz {
    public float a;
    public float b;
    public float c;
    public float d;
    public final akse e = new akse();

    public amkz() {
    }

    public final void a(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e.r((f + f3) * 0.5f, (f2 + f4) * 0.5f);
    }

    public final float b() {
        return this.c - this.a;
    }

    public final float c() {
        return this.d - this.b;
    }

    public final boolean d(amkz amkzVar) {
        return this.a <= amkzVar.c && this.b <= amkzVar.d && this.c >= amkzVar.a && this.d >= amkzVar.b;
    }

    public final boolean e(akse akseVar) {
        float f = akseVar.b;
        float f2 = akseVar.c;
        return this.a <= f && f <= this.c && this.b <= f2 && f2 <= this.d;
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof amkz) {
            amkz amkzVar = (amkz) obj;
            if (this.a == amkzVar.a && this.c == amkzVar.c && this.b == amkzVar.b && this.d == amkzVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.a) + 31) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d);
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        float f4 = this.d;
        StringBuilder sb = new StringBuilder(76);
        sb.append("AABB[[");
        sb.append(f);
        sb.append(", ");
        sb.append(f2);
        sb.append("], [");
        sb.append(f3);
        sb.append(", ");
        sb.append(f4);
        sb.append("]]");
        return sb.toString();
    }

    public amkz(float f, float f2, float f3, float f4) {
        a(f, f2, f3, f4);
    }
}
