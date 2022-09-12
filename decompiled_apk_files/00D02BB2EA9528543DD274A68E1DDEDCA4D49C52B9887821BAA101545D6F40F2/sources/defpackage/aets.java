package defpackage;
/* compiled from: PG */
/* renamed from: aets  reason: default package */
/* loaded from: classes2.dex */
final class aets extends aetu {
    private final String a;
    private final dbsg<String> b;
    private final dbsg<String> c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final boolean o;
    private final dmlo p;
    private final akvo<? super aktd> q;
    private final int r;

    public aets(String str, dbsg<String> dbsgVar, dbsg<String> dbsgVar2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z, int i12, dmlo dmloVar, @dzsi akvo<? super aktd> akvoVar) {
        this.a = str;
        this.b = dbsgVar;
        this.c = dbsgVar2;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.i = i6;
        this.j = i7;
        this.k = i8;
        this.l = i9;
        this.m = i10;
        this.n = i11;
        this.o = z;
        this.r = i12;
        this.p = dmloVar;
        this.q = akvoVar;
    }

    @Override // defpackage.aetu
    public final String a() {
        return this.a;
    }

    @Override // defpackage.aetu
    public final dbsg<String> b() {
        return this.b;
    }

    @Override // defpackage.aetu
    public final dbsg<String> c() {
        return this.c;
    }

    @Override // defpackage.aetu
    public final int d() {
        return this.d;
    }

    @Override // defpackage.aetu
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        akvo<? super aktd> akvoVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aetu) {
            aetu aetuVar = (aetu) obj;
            if (this.a.equals(aetuVar.a()) && this.b.equals(aetuVar.b()) && this.c.equals(aetuVar.c()) && this.d == aetuVar.d() && this.e == aetuVar.e() && this.f == aetuVar.f() && this.g == aetuVar.g() && this.h == aetuVar.h() && this.i == aetuVar.i() && this.j == aetuVar.j() && this.k == aetuVar.k() && this.l == aetuVar.l() && this.m == aetuVar.m() && this.n == aetuVar.n() && this.o == aetuVar.o()) {
                int i = this.r;
                int r = aetuVar.r();
                if (i == 0) {
                    throw null;
                }
                if (i == r && this.p.equals(aetuVar.p()) && ((akvoVar = this.q) != null ? akvoVar.equals(aetuVar.q()) : aetuVar.q() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.aetu
    public final int f() {
        return this.f;
    }

    @Override // defpackage.aetu
    public final int g() {
        return this.g;
    }

    @Override // defpackage.aetu
    public final int h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = (((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ this.j) * 1000003) ^ this.k) * 1000003) ^ this.l) * 1000003) ^ this.m) * 1000003) ^ this.n) * 1000003) ^ (true != this.o ? 1237 : 1231)) * 1000003;
        int i = this.r;
        if (i != 0) {
            int hashCode2 = (((hashCode ^ i) * 1000003) ^ this.p.hashCode()) * 1000003;
            akvo<? super aktd> akvoVar = this.q;
            return hashCode2 ^ (akvoVar == null ? 0 : akvoVar.hashCode());
        }
        throw null;
    }

    @Override // defpackage.aetu
    public final int i() {
        return this.i;
    }

    @Override // defpackage.aetu
    public final int j() {
        return this.j;
    }

    @Override // defpackage.aetu
    public final int k() {
        return this.k;
    }

    @Override // defpackage.aetu
    public final int l() {
        return this.l;
    }

    @Override // defpackage.aetu
    public final int m() {
        return this.m;
    }

    @Override // defpackage.aetu
    public final int n() {
        return this.n;
    }

    @Override // defpackage.aetu
    public final boolean o() {
        return this.o;
    }

    @Override // defpackage.aetu
    public final dmlo p() {
        return this.p;
    }

    @Override // defpackage.aetu
    @dzsi
    public final akvo<? super aktd> q() {
        return this.q;
    }

    @Override // defpackage.aetu
    public final int r() {
        return this.r;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        int i = this.d;
        int i2 = this.e;
        int i3 = this.f;
        int i4 = this.g;
        int i5 = this.h;
        int i6 = this.i;
        int i7 = this.j;
        int i8 = this.k;
        int i9 = this.l;
        int i10 = this.m;
        int i11 = this.n;
        boolean z = this.o;
        int i12 = this.r;
        String str2 = i12 != 1 ? i12 != 2 ? "null" : "END" : "START";
        String valueOf3 = String.valueOf(this.p);
        String valueOf4 = String.valueOf(this.q);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 453 + length2 + String.valueOf(valueOf2).length() + str2.length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("FixedPointCalloutParams{text=");
        sb.append(str);
        sb.append(", iconUrl=");
        sb.append(valueOf);
        sb.append(", rtlIconUrl=");
        sb.append(valueOf2);
        sb.append(", textColor=");
        sb.append(i);
        sb.append(", backgroundColor=");
        sb.append(i2);
        sb.append(", textSizeDp=");
        sb.append(i3);
        sb.append(", caretHeightDp=");
        sb.append(i4);
        sb.append(", textVerticalPaddingDp=");
        sb.append(i5);
        sb.append(", textHorizontalPaddingDp=");
        sb.append(i6);
        sb.append(", calloutCaretOffsetDp=");
        sb.append(i7);
        sb.append(", dropShadowOffsetDp=");
        sb.append(i8);
        sb.append(", dropShadowColor=");
        sb.append(i9);
        sb.append(", dropShadowBlurRadiusDp=");
        sb.append(i10);
        sb.append(", iconScaleDp=");
        sb.append(i11);
        sb.append(", drawOverPlacemarks=");
        sb.append(z);
        sb.append(", iconPosition=");
        sb.append(str2);
        sb.append(", anchorPoint=");
        sb.append(valueOf3);
        sb.append(", pickHandler=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
