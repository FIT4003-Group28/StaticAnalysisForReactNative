package defpackage;
/* compiled from: PG */
/* renamed from: fwm  reason: default package */
/* loaded from: classes3.dex */
public final class fwm {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final ampq w;
    public final int x;
    public final int y;
    private final ampq z;

    public fwm() {
    }

    public fwm(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, ampq ampqVar, int i12, int i13, ampq ampqVar2, int i14, int i15) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
        this.j = i;
        this.k = i2;
        this.l = i3;
        this.m = i4;
        this.n = i5;
        this.o = i6;
        this.p = i7;
        this.q = i8;
        this.r = i9;
        this.s = i10;
        this.t = i11;
        this.z = ampqVar;
        this.u = i12;
        this.v = i13;
        this.w = ampqVar2;
        this.x = i14;
        this.y = i15;
    }

    public final int a(boolean z) {
        return ((Integer) this.z.e(Integer.valueOf(z ? this.s : this.t))).intValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fwm) {
            fwm fwmVar = (fwm) obj;
            if (this.a == fwmVar.a && this.b == fwmVar.b && this.c == fwmVar.c && this.d == fwmVar.d && this.e == fwmVar.e && this.f == fwmVar.f && this.g == fwmVar.g && this.h == fwmVar.h && this.i == fwmVar.i && this.j == fwmVar.j && this.k == fwmVar.k && this.l == fwmVar.l && this.m == fwmVar.m && this.n == fwmVar.n && this.o == fwmVar.o && this.p == fwmVar.p && this.q == fwmVar.q && this.r == fwmVar.r && this.s == fwmVar.s && this.t == fwmVar.t && this.z.equals(fwmVar.z) && this.u == fwmVar.u && this.v == fwmVar.v && this.w.equals(fwmVar.w) && this.x == fwmVar.x && this.y == fwmVar.y) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((((((((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003;
        if (true == this.i) {
            i = 1231;
        }
        return ((((((((((((((((((((((((((((((((((i2 ^ i) * 1000003) ^ this.j) * 1000003) ^ this.k) * 1000003) ^ this.l) * 1000003) ^ this.m) * 1000003) ^ this.n) * 1000003) ^ this.o) * 1000003) ^ this.p) * 1000003) ^ this.q) * 1000003) ^ this.r) * 1000003) ^ this.s) * 1000003) ^ this.t) * 1000003) ^ this.z.hashCode()) * 1000003) ^ this.u) * 1000003) ^ this.v) * 1000003) ^ this.w.hashCode()) * 1000003) ^ this.x) * 1000003) ^ this.y;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        boolean z4 = this.d;
        boolean z5 = this.e;
        boolean z6 = this.f;
        boolean z7 = this.g;
        boolean z8 = this.h;
        boolean z9 = this.i;
        int i = this.j;
        int i2 = this.k;
        int i3 = this.l;
        int i4 = this.m;
        int i5 = this.n;
        int i6 = this.o;
        int i7 = this.p;
        int i8 = this.q;
        int i9 = this.r;
        int i10 = this.s;
        int i11 = this.t;
        String valueOf = String.valueOf(this.z);
        int i12 = this.u;
        int i13 = this.v;
        String valueOf2 = String.valueOf(this.w);
        int i14 = this.x;
        int i15 = this.y;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 738 + String.valueOf(valueOf2).length());
        sb.append("ChipStyleProperties{hasAvatar=");
        sb.append(z);
        sb.append(", hasCheckbox=");
        sb.append(z2);
        sb.append(", hasIcon=");
        sb.append(z3);
        sb.append(", hasText=");
        sb.append(z4);
        sb.append(", shouldUseButtonStyleText=");
        sb.append(z5);
        sb.append(", shouldSkipIconTint=");
        sb.append(z6);
        sb.append(", clickable=");
        sb.append(z7);
        sb.append(", useTouchFeedbackCircleAsBackground=");
        sb.append(z8);
        sb.append(", useMultilineTextView=");
        sb.append(z9);
        sb.append(", iconMarginStart=");
        sb.append(i);
        sb.append(", iconMarginEnd=");
        sb.append(i2);
        sb.append(", iconDimensions=");
        sb.append(i3);
        sb.append(", textPaddingStart=");
        sb.append(i4);
        sb.append(", textPaddingEnd=");
        sb.append(i5);
        sb.append(", textPaddingStartWithImage=");
        sb.append(i6);
        sb.append(", minimumWidth=");
        sb.append(i7);
        sb.append(", cornerRadius=");
        sb.append(i8);
        sb.append(", textViewGravity=");
        sb.append(i9);
        sb.append(", selectedTextColor=");
        sb.append(i10);
        sb.append(", unselectedTextColor=");
        sb.append(i11);
        sb.append(", iconColor=");
        sb.append(valueOf);
        sb.append(", selectedBackgroundResource=");
        sb.append(i12);
        sb.append(", unselectedBackgroundResource=");
        sb.append(i13);
        sb.append(", checkboxTintColor=");
        sb.append(valueOf2);
        sb.append(", selectedRippleColor=");
        sb.append(i14);
        sb.append(", unselectedRippleColor=");
        sb.append(i15);
        sb.append("}");
        return sb.toString();
    }
}
