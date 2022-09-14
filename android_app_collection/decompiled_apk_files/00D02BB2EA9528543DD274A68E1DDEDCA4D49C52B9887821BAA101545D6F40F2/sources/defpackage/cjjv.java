package defpackage;

import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: cjjv  reason: default package */
/* loaded from: classes4.dex */
public final class cjjv {
    public final Rect a;
    public final cjkd b;
    public final float c;

    public cjjv(Rect rect, cjkd cjkdVar, float f) {
        dzvx.c(cjkdVar, "placement");
        this.a = rect;
        this.b = cjkdVar;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof cjjv)) {
                return false;
            }
            cjjv cjjvVar = (cjjv) obj;
            return dzvx.d(this.a, cjjvVar.a) && dzvx.d(this.b, cjjvVar.b) && Float.compare(this.c, cjjvVar.c) == 0;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        cjkd cjkdVar = this.b;
        return ((hashCode + (cjkdVar != null ? cjkdVar.hashCode() : 0)) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        return "Position(location=" + this.a + ", placement=" + this.b + ", beakBias=" + this.c + ")";
    }
}
