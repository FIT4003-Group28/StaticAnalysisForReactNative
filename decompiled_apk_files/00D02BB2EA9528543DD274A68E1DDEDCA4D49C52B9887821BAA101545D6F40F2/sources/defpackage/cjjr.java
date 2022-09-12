package defpackage;
/* compiled from: PG */
/* renamed from: cjjr  reason: default package */
/* loaded from: classes4.dex */
public final class cjjr {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    private final int j;

    public cjjr(int i, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.j = i6;
        this.h = i7;
        this.i = i8;
        this.a = i7 + i5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof cjjr)) {
                return false;
            }
            cjjr cjjrVar = (cjjr) obj;
            return this.b == cjjrVar.b && this.c == cjjrVar.c && this.d == cjjrVar.d && this.e == cjjrVar.e && this.f == cjjrVar.f && this.g == cjjrVar.g && this.j == cjjrVar.j && this.h == cjjrVar.h && this.i == cjjrVar.i;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((this.b * 31) + this.c) * 31) + (this.d ? 1 : 0)) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.j) * 31) + this.h) * 31) + this.i;
    }

    public final String toString() {
        return "CalloutThemeValues(layoutResourceId=" + this.b + ", defaultWidth=" + this.c + ", isRtl=" + this.d + ", cornerRadius=" + this.e + ", beakBaseWidth=" + this.f + ", beakMargin=" + this.g + ", beakLength=" + this.j + ", padding=" + this.h + ", overlap=" + this.i + ")";
    }
}
