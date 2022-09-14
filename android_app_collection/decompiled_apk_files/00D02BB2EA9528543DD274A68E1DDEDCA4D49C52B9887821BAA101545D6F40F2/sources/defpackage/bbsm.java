package defpackage;
/* compiled from: PG */
/* renamed from: bbsm  reason: default package */
/* loaded from: classes3.dex */
final class bbsm extends bbty {
    private final dbsg<bbtw> a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final bvrt<bbvn> j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final bbtx n;
    private final dbsg<Long> o;
    private final boolean p;
    private final boolean q;
    private final afyb r;
    private final boolean s;
    private final dbsg<bbtq> t;
    private final int u;

    public bbsm(dbsg<bbtw> dbsgVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, bvrt<bbvn> bvrtVar, boolean z9, boolean z10, boolean z11, bbtx bbtxVar, dbsg<Long> dbsgVar2, boolean z12, boolean z13, int i, afyb afybVar, boolean z14, dbsg<bbtq> dbsgVar3) {
        this.a = dbsgVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
        this.j = bvrtVar;
        this.k = z9;
        this.l = z10;
        this.m = z11;
        this.n = bbtxVar;
        this.o = dbsgVar2;
        this.p = z12;
        this.q = z13;
        this.u = i;
        this.r = afybVar;
        this.s = z14;
        this.t = dbsgVar3;
    }

    @Override // defpackage.bbty
    public final dbsg<bbtw> a() {
        return this.a;
    }

    @Override // defpackage.bbty
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.bbty
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.bbty
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.bbty
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bbty) {
            bbty bbtyVar = (bbty) obj;
            if (this.a.equals(bbtyVar.a()) && this.b == bbtyVar.b() && this.c == bbtyVar.c() && this.d == bbtyVar.d() && this.e == bbtyVar.e() && this.f == bbtyVar.f() && this.g == bbtyVar.g() && this.h == bbtyVar.h() && this.i == bbtyVar.i() && this.j.equals(bbtyVar.j()) && this.k == bbtyVar.k() && this.l == bbtyVar.l() && this.m == bbtyVar.m() && this.n.equals(bbtyVar.n()) && this.o.equals(bbtyVar.o()) && this.p == bbtyVar.p() && this.q == bbtyVar.q()) {
                int i = this.u;
                int u = bbtyVar.u();
                if (i == 0) {
                    throw null;
                }
                if (i == u && this.r.equals(bbtyVar.r()) && this.s == bbtyVar.s() && this.t.equals(bbtyVar.t())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.bbty
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.bbty
    public final boolean g() {
        return this.g;
    }

    @Override // defpackage.bbty
    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ this.j.hashCode()) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ (true != this.l ? 1237 : 1231)) * 1000003) ^ (true != this.m ? 1237 : 1231)) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ (true != this.p ? 1237 : 1231)) * 1000003) ^ (true != this.q ? 1237 : 1231)) * 1000003;
        int i2 = this.u;
        if (i2 != 0) {
            int hashCode2 = (((hashCode ^ i2) * 1000003) ^ this.r.hashCode()) * 1000003;
            if (true == this.s) {
                i = 1231;
            }
            return ((hashCode2 ^ i) * 1000003) ^ this.t.hashCode();
        }
        throw null;
    }

    @Override // defpackage.bbty
    public final boolean i() {
        return this.i;
    }

    @Override // defpackage.bbty
    public final bvrt<bbvn> j() {
        return this.j;
    }

    @Override // defpackage.bbty
    public final boolean k() {
        return this.k;
    }

    @Override // defpackage.bbty
    @Deprecated
    public final boolean l() {
        return this.l;
    }

    @Override // defpackage.bbty
    public final boolean m() {
        return this.m;
    }

    @Override // defpackage.bbty
    public final bbtx n() {
        return this.n;
    }

    @Override // defpackage.bbty
    public final dbsg<Long> o() {
        return this.o;
    }

    @Override // defpackage.bbty
    public final boolean p() {
        return this.p;
    }

    @Override // defpackage.bbty
    public final boolean q() {
        return this.q;
    }

    @Override // defpackage.bbty
    public final afyb r() {
        return this.r;
    }

    @Override // defpackage.bbty
    public final boolean s() {
        return this.s;
    }

    @Override // defpackage.bbty
    public final dbsg<bbtq> t() {
        return this.t;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        boolean z2 = this.c;
        boolean z3 = this.d;
        boolean z4 = this.e;
        boolean z5 = this.f;
        boolean z6 = this.g;
        boolean z7 = this.h;
        boolean z8 = this.i;
        String valueOf2 = String.valueOf(this.j);
        boolean z9 = this.k;
        boolean z10 = this.l;
        boolean z11 = this.m;
        String valueOf3 = String.valueOf(this.n);
        String valueOf4 = String.valueOf(this.o);
        boolean z12 = this.p;
        boolean z13 = this.q;
        int i = this.u;
        String str = i != 1 ? i != 2 ? "null" : "CLOSE" : "BACK";
        String valueOf5 = String.valueOf(this.r);
        boolean z14 = this.s;
        String valueOf6 = String.valueOf(this.t);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 572 + length2 + length3 + String.valueOf(valueOf4).length() + str.length() + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("PhotoActions{enableCaptionEdit=");
        sb.append(valueOf);
        sb.append(", enableOfferingTagsEdit=");
        sb.append(z);
        sb.append(", shouldDisplayPhotoCountAsTitle=");
        sb.append(z2);
        sb.append(", enableDelete=");
        sb.append(z3);
        sb.append(", enableDoneButton=");
        sb.append(z4);
        sb.append(", enableDisassociate=");
        sb.append(z5);
        sb.append(", enableReceiptActions=");
        sb.append(z6);
        sb.append(", enableMarkAsReceipt=");
        sb.append(z7);
        sb.append(", enableRap=");
        sb.append(z8);
        sb.append(", photoReportAProblemOptionsProtoWrapper=");
        sb.append(valueOf2);
        sb.append(", enablePhotoEdit=");
        sb.append(z9);
        sb.append(", enableShowIconsForCaptionAndEditPhoto=");
        sb.append(z10);
        sb.append(", allowUploadIfEnabled=");
        sb.append(z11);
        sb.append(", muteIconBehavior=");
        sb.append(valueOf3);
        sb.append(", videoEndPositionInMillis=");
        sb.append(valueOf4);
        sb.append(", enableSelection=");
        sb.append(z12);
        sb.append(", enableThumbsUp=");
        sb.append(z13);
        sb.append(", navigationButtonStyle=");
        sb.append(str);
        sb.append(", lensPhotoActionOptions=");
        sb.append(valueOf5);
        sb.append(", shouldShowPlaceNameInFooter=");
        sb.append(z14);
        sb.append(", enablePlaceTile=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.bbty
    public final int u() {
        return this.u;
    }
}
