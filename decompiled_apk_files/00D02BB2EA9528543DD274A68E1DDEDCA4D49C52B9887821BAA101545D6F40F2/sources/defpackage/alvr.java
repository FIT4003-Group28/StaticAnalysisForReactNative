package defpackage;
/* compiled from: PG */
/* renamed from: alvr  reason: default package */
/* loaded from: classes.dex */
final class alvr extends alyd {
    private final int b;
    private final alxl c;
    private final int d;
    private final int e;
    private final int f;
    private final float g;
    private final float h;
    private final float i;
    private final int j;
    private final int k;
    private final int l;
    private final float m;
    private final dcdc<dmlo> n;
    private final boolean o;
    private final boolean p;
    private final int q;

    public alvr(int i, alxl alxlVar, int i2, int i3, int i4, float f, float f2, float f3, int i5, int i6, int i7, float f4, dcdc<dmlo> dcdcVar, int i8, boolean z, boolean z2) {
        this.b = i;
        this.c = alxlVar;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = f;
        this.h = f2;
        this.i = f3;
        this.j = i5;
        this.k = i6;
        this.l = i7;
        this.m = f4;
        this.n = dcdcVar;
        this.q = i8;
        this.o = z;
        this.p = z2;
    }

    @Override // defpackage.alyd
    public final int a() {
        return this.b;
    }

    @Override // defpackage.alyd
    public final alxl b() {
        return this.c;
    }

    @Override // defpackage.alyd
    public final int c() {
        return this.d;
    }

    @Override // defpackage.alyd
    public final int d() {
        return this.e;
    }

    @Override // defpackage.alyd
    public final int e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alyd) {
            alyd alydVar = (alyd) obj;
            if (this.b == alydVar.a() && this.c.equals(alydVar.b()) && this.d == alydVar.c() && this.e == alydVar.d() && this.f == alydVar.e() && Float.floatToIntBits(this.g) == Float.floatToIntBits(alydVar.f()) && Float.floatToIntBits(this.h) == Float.floatToIntBits(alydVar.g()) && Float.floatToIntBits(this.i) == Float.floatToIntBits(alydVar.h()) && this.j == alydVar.i() && this.k == alydVar.j() && this.l == alydVar.k() && Float.floatToIntBits(this.m) == Float.floatToIntBits(alydVar.l()) && dchl.m(this.n, alydVar.m())) {
                int i = this.q;
                int p = alydVar.p();
                if (i == 0) {
                    throw null;
                }
                if (i == p && this.o == alydVar.n() && this.p == alydVar.o()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.alyd
    public final float f() {
        return this.g;
    }

    @Override // defpackage.alyd
    public final float g() {
        return this.h;
    }

    @Override // defpackage.alyd
    public final float h() {
        return this.i;
    }

    public final int hashCode() {
        int hashCode = (((((((((((((((((((((((((this.b ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ Float.floatToIntBits(this.g)) * 1000003) ^ Float.floatToIntBits(this.h)) * 1000003) ^ Float.floatToIntBits(this.i)) * 1000003) ^ this.j) * 1000003) ^ this.k) * 1000003) ^ this.l) * 1000003) ^ Float.floatToIntBits(this.m)) * 1000003) ^ this.n.hashCode()) * 1000003;
        int i = this.q;
        if (i != 0) {
            int i2 = 1237;
            int i3 = (((hashCode ^ i) * 1000003) ^ (true != this.o ? 1237 : 1231)) * 1000003;
            if (true == this.p) {
                i2 = 1231;
            }
            return i3 ^ i2;
        }
        throw null;
    }

    @Override // defpackage.alyd
    public final int i() {
        return this.j;
    }

    @Override // defpackage.alyd
    public final int j() {
        return this.k;
    }

    @Override // defpackage.alyd
    public final int k() {
        return this.l;
    }

    @Override // defpackage.alyd
    public final float l() {
        return this.m;
    }

    @Override // defpackage.alyd
    public final dcdc<dmlo> m() {
        return this.n;
    }

    @Override // defpackage.alyd
    public final boolean n() {
        return this.o;
    }

    @Override // defpackage.alyd
    public final boolean o() {
        return this.p;
    }

    @Override // defpackage.alyd
    public final int p() {
        return this.q;
    }

    public final String toString() {
        int i = this.b;
        String valueOf = String.valueOf(this.c);
        int i2 = this.d;
        int i3 = this.e;
        int i4 = this.f;
        float f = this.g;
        float f2 = this.h;
        float f3 = this.i;
        int i5 = this.j;
        int i6 = this.k;
        int i7 = this.l;
        float f4 = this.m;
        String valueOf2 = String.valueOf(this.n);
        int i8 = this.q;
        String valueOf3 = String.valueOf(i8 != 0 ? Integer.toString(i8) : "null");
        boolean z = this.o;
        boolean z2 = this.p;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 463 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("TextBoxStyle{fillColor=");
        sb.append(i);
        sb.append(", outline=");
        sb.append(valueOf);
        sb.append(", dropShadowMajorAxisOffset=");
        sb.append(i2);
        sb.append(", dropShadowMinorAxisOffset=");
        sb.append(i3);
        sb.append(", dropShadowColor=");
        sb.append(i4);
        sb.append(", dropShadowBlurRadius=");
        sb.append(f);
        sb.append(", majorAxisPadding=");
        sb.append(f2);
        sb.append(", minorAxisPadding=");
        sb.append(f3);
        sb.append(", caretHeight=");
        sb.append(i5);
        sb.append(", caretHeightCorner=");
        sb.append(i6);
        sb.append(", caretCornerOffsetDistance=");
        sb.append(i7);
        sb.append(", cornerRadius=");
        sb.append(f4);
        sb.append(", supportedAnchorPoints=");
        sb.append(valueOf2);
        sb.append(", shapeType=");
        sb.append(valueOf3);
        sb.append(", allowIconNestling=");
        sb.append(z);
        sb.append(", isRasterBox=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
