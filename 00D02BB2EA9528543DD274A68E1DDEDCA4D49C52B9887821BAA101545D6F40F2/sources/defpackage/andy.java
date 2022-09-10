package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: andy  reason: default package */
/* loaded from: classes2.dex */
public final class andy extends anee {
    public final String a;
    public final int b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final akqq g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final String m;
    public final boolean n;
    public final boolean o;
    public final String p;
    public final dbsg<anef> q;
    public final ddho r;
    public final ddho s;
    public final ddho t;
    public final dcdc<anec> u;
    public final boolean v;
    public final dbsg<aned> w;
    public final dbsg<cjmu> x;

    public andy(String str, int i, String str2, int i2, int i3, @dzsi String str3, @dzsi akqq akqqVar, boolean z, boolean z2, @dzsi String str4, boolean z3, boolean z4, @dzsi String str5, boolean z5, boolean z6, @dzsi String str6, dbsg<anef> dbsgVar, ddho ddhoVar, ddho ddhoVar2, ddho ddhoVar3, dcdc<anec> dcdcVar, boolean z7, dbsg<aned> dbsgVar2, dbsg<cjmu> dbsgVar3) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = str3;
        this.g = akqqVar;
        this.h = z;
        this.i = z2;
        this.j = str4;
        this.k = z3;
        this.l = z4;
        this.m = str5;
        this.n = z5;
        this.o = z6;
        this.p = str6;
        this.q = dbsgVar;
        this.r = ddhoVar;
        this.s = ddhoVar2;
        this.t = ddhoVar3;
        this.u = dcdcVar;
        this.v = z7;
        this.w = dbsgVar2;
        this.x = dbsgVar3;
    }

    @Override // defpackage.anee
    public final String a() {
        return this.a;
    }

    @Override // defpackage.anee
    public final int b() {
        return this.b;
    }

    @Override // defpackage.anee
    public final String c() {
        return this.c;
    }

    @Override // defpackage.anee
    public final int d() {
        return this.d;
    }

    @Override // defpackage.anee
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        akqq akqqVar;
        String str2;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof anee) {
            anee aneeVar = (anee) obj;
            if (this.a.equals(aneeVar.a()) && this.b == aneeVar.b() && this.c.equals(aneeVar.c()) && this.d == aneeVar.d() && this.e == aneeVar.e() && ((str = this.f) != null ? str.equals(aneeVar.f()) : aneeVar.f() == null) && ((akqqVar = this.g) != null ? akqqVar.equals(aneeVar.g()) : aneeVar.g() == null) && this.h == aneeVar.h() && this.i == aneeVar.i() && ((str2 = this.j) != null ? str2.equals(aneeVar.j()) : aneeVar.j() == null) && this.k == aneeVar.k() && this.l == aneeVar.l() && ((str3 = this.m) != null ? str3.equals(aneeVar.m()) : aneeVar.m() == null) && this.n == aneeVar.n() && this.o == aneeVar.o() && ((str4 = this.p) != null ? str4.equals(aneeVar.p()) : aneeVar.p() == null) && this.q.equals(aneeVar.q()) && this.r.equals(aneeVar.r()) && this.s.equals(aneeVar.s()) && this.t.equals(aneeVar.t()) && dchl.m(this.u, aneeVar.u()) && this.v == aneeVar.v() && this.w.equals(aneeVar.w()) && this.x.equals(aneeVar.x())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.anee
    @dzsi
    public final String f() {
        return this.f;
    }

    @Override // defpackage.anee
    @dzsi
    public final akqq g() {
        return this.g;
    }

    @Override // defpackage.anee
    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003;
        String str = this.f;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        akqq akqqVar = this.g;
        int i2 = 1237;
        int hashCode3 = (((((hashCode2 ^ (akqqVar == null ? 0 : akqqVar.hashCode())) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003;
        String str2 = this.j;
        int hashCode4 = (((((hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ (true != this.l ? 1237 : 1231)) * 1000003;
        String str3 = this.m;
        int hashCode5 = (((((hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ (true != this.n ? 1237 : 1231)) * 1000003) ^ (true != this.o ? 1237 : 1231)) * 1000003;
        String str4 = this.p;
        if (str4 != null) {
            i = str4.hashCode();
        }
        int hashCode6 = (((((((((((hashCode5 ^ i) * 1000003) ^ this.q.hashCode()) * 1000003) ^ this.r.hashCode()) * 1000003) ^ this.s.hashCode()) * 1000003) ^ this.t.hashCode()) * 1000003) ^ this.u.hashCode()) * 1000003;
        if (true == this.v) {
            i2 = 1231;
        }
        return ((((hashCode6 ^ i2) * 1000003) ^ this.w.hashCode()) * 1000003) ^ this.x.hashCode();
    }

    @Override // defpackage.anee
    public final boolean i() {
        return this.i;
    }

    @Override // defpackage.anee
    @dzsi
    public final String j() {
        return this.j;
    }

    @Override // defpackage.anee
    public final boolean k() {
        return this.k;
    }

    @Override // defpackage.anee
    public final boolean l() {
        return this.l;
    }

    @Override // defpackage.anee
    @dzsi
    public final String m() {
        return this.m;
    }

    @Override // defpackage.anee
    public final boolean n() {
        return this.n;
    }

    @Override // defpackage.anee
    public final boolean o() {
        return this.o;
    }

    @Override // defpackage.anee
    @dzsi
    public final String p() {
        return this.p;
    }

    @Override // defpackage.anee
    public final dbsg<anef> q() {
        return this.q;
    }

    @Override // defpackage.anee
    public final ddho r() {
        return this.r;
    }

    @Override // defpackage.anee
    public final ddho s() {
        return this.s;
    }

    @Override // defpackage.anee
    public final ddho t() {
        return this.t;
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        String str2 = this.c;
        int i2 = this.d;
        int i3 = this.e;
        String str3 = this.f;
        String valueOf = String.valueOf(this.g);
        boolean z = this.h;
        boolean z2 = this.i;
        String str4 = this.j;
        boolean z3 = this.k;
        boolean z4 = this.l;
        String str5 = this.m;
        boolean z5 = this.n;
        boolean z6 = this.o;
        String str6 = this.p;
        String valueOf2 = String.valueOf(this.q);
        String valueOf3 = String.valueOf(this.r);
        String valueOf4 = String.valueOf(this.s);
        String valueOf5 = String.valueOf(this.t);
        String valueOf6 = String.valueOf(this.u);
        boolean z7 = this.v;
        String valueOf7 = String.valueOf(this.w);
        String valueOf8 = String.valueOf(this.x);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(valueOf).length();
        int length5 = String.valueOf(str4).length();
        int length6 = String.valueOf(str5).length();
        int length7 = String.valueOf(str6).length();
        int length8 = String.valueOf(valueOf2).length();
        int length9 = String.valueOf(valueOf3).length();
        int length10 = String.valueOf(valueOf4).length();
        int length11 = String.valueOf(valueOf5).length();
        int length12 = String.valueOf(valueOf6).length();
        StringBuilder sb = new StringBuilder(length + 619 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + String.valueOf(valueOf7).length() + String.valueOf(valueOf8).length());
        sb.append("MapPointPickerArguments{title=");
        sb.append(str);
        sb.append(", maxLinesForTitle=");
        sb.append(i);
        sb.append(", subTitle=");
        sb.append(str2);
        sb.append(", maxLinesForSubTitle=");
        sb.append(i2);
        sb.append(", pinDrawable=");
        sb.append(i3);
        sb.append(", doneButtonTextOverride=");
        sb.append(str3);
        sb.append(", initialLatLng=");
        sb.append(valueOf);
        sb.append(", animateInitialLatLng=");
        sb.append(z);
        sb.append(", showCalloutView=");
        sb.append(z2);
        sb.append(", calloutViewString=");
        sb.append(str4);
        sb.append(", shouldAvoidFirstTimeNoMoveSaveWarning=");
        sb.append(z3);
        sb.append(", enableNoMoveSaveWarning=");
        sb.append(z4);
        sb.append(", noMoveSaveWarningString=");
        sb.append(str5);
        sb.append(", showGeocodedAddressInSubTitle=");
        sb.append(z5);
        sb.append(", showAlertMessageInFooter=");
        sb.append(z6);
        sb.append(", initialLatLngCallout=");
        sb.append(str6);
        sb.append(", customLayoutProvider=");
        sb.append(valueOf2);
        sb.append(", fragmentVisualElementType=");
        sb.append(valueOf3);
        sb.append(", cancelVisualElementType=");
        sb.append(valueOf4);
        sb.append(", doneVisualElementType=");
        sb.append(valueOf5);
        sb.append(", mapMarkers=");
        sb.append(valueOf6);
        sb.append(", shouldUseMapPointPickerHeader=");
        sb.append(z7);
        sb.append(", toolbarStyle=");
        sb.append(valueOf7);
        sb.append(", statusBarStyle=");
        sb.append(valueOf8);
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.anee
    public final dcdc<anec> u() {
        return this.u;
    }

    @Override // defpackage.anee
    public final boolean v() {
        return this.v;
    }

    @Override // defpackage.anee
    public final dbsg<aned> w() {
        return this.w;
    }

    @Override // defpackage.anee
    public final dbsg<cjmu> x() {
        return this.x;
    }

    @Override // defpackage.anee
    public final aneb y() {
        return new andx(this);
    }
}
