package defpackage;
/* compiled from: PG */
/* renamed from: crwh  reason: default package */
/* loaded from: classes5.dex */
final class crwh extends crwo {
    private final crtx A;
    private final int B;
    private final String C;
    private final Long D;
    private final crtz E;
    private final cruc F;
    private final String G;
    private final String H;
    private final String I;
    private final String J;
    private final int K;
    private final String a;
    private final Long b;
    private final String c;
    private final String d;
    private final dgpy e;
    private final dgpu f;
    private final dfqp g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final crtr l;
    private final dspd m;
    private final dcdc<String> n;
    private final dcdc<dszs> o;
    private final dcdc<crtk> p;
    private final dgrh q;
    private final dgpo r;
    private final String s;
    private final Boolean t;
    private final Boolean u;
    private final crtp v;
    private final String w;
    private final String x;
    private final String y;
    private final Long z;

    public crwh(String str, Long l, String str2, String str3, int i, dgpy dgpyVar, dgpu dgpuVar, dfqp dfqpVar, String str4, String str5, String str6, String str7, crtr crtrVar, dspd dspdVar, dcdc<String> dcdcVar, dcdc<dszs> dcdcVar2, dcdc<crtk> dcdcVar3, dgrh dgrhVar, dgpo dgpoVar, String str8, Boolean bool, Boolean bool2, crtp crtpVar, String str9, String str10, String str11, Long l2, crtx crtxVar, int i2, String str12, Long l3, crtz crtzVar, cruc crucVar, String str13, String str14, String str15, String str16) {
        this.a = str;
        this.b = l;
        this.c = str2;
        this.d = str3;
        this.K = i;
        this.e = dgpyVar;
        this.f = dgpuVar;
        this.g = dfqpVar;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = str7;
        this.l = crtrVar;
        this.m = dspdVar;
        this.n = dcdcVar;
        this.o = dcdcVar2;
        this.p = dcdcVar3;
        this.q = dgrhVar;
        this.r = dgpoVar;
        this.s = str8;
        this.t = bool;
        this.u = bool2;
        this.v = crtpVar;
        this.w = str9;
        this.x = str10;
        this.y = str11;
        this.z = l2;
        this.A = crtxVar;
        this.B = i2;
        this.C = str12;
        this.D = l3;
        this.E = crtzVar;
        this.F = crucVar;
        this.G = str13;
        this.H = str14;
        this.I = str15;
        this.J = str16;
    }

    @Override // defpackage.crwo
    public final String A() {
        return this.y;
    }

    @Override // defpackage.crwo
    public final Long B() {
        return this.z;
    }

    @Override // defpackage.crwo
    public final crtx C() {
        return this.A;
    }

    @Override // defpackage.crwo
    public final int D() {
        return this.B;
    }

    @Override // defpackage.crwo
    public final String E() {
        return this.C;
    }

    @Override // defpackage.crwo
    public final Long F() {
        return this.D;
    }

    @Override // defpackage.crwo
    public final crtz G() {
        return this.E;
    }

    @Override // defpackage.crwo
    public final cruc H() {
        return this.F;
    }

    @Override // defpackage.crwo
    public final String I() {
        return this.G;
    }

    @Override // defpackage.crwo
    public final String J() {
        return this.H;
    }

    @Override // defpackage.crwo
    public final String K() {
        return this.I;
    }

    @Override // defpackage.crwo
    public final String L() {
        return this.J;
    }

    @Override // defpackage.crwo
    public final int M() {
        return this.K;
    }

    @Override // defpackage.crwo
    public final Long a() {
        return null;
    }

    @Override // defpackage.crwo
    public final Long b() {
        return null;
    }

    @Override // defpackage.crwo
    public final String c() {
        return this.a;
    }

    @Override // defpackage.crwo
    public final Long d() {
        return this.b;
    }

    @Override // defpackage.crwo
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        String str;
        dgpy dgpyVar;
        dgpu dgpuVar;
        dfqp dfqpVar;
        String str2;
        String str3;
        String str4;
        crtr crtrVar;
        dspd dspdVar;
        dcdc<String> dcdcVar;
        dcdc<dszs> dcdcVar2;
        dcdc<crtk> dcdcVar3;
        dgrh dgrhVar;
        dgpo dgpoVar;
        String str5;
        crtp crtpVar;
        String str6;
        String str7;
        String str8;
        Long l;
        String str9;
        Long l2;
        crtz crtzVar;
        cruc crucVar;
        String str10;
        String str11;
        String str12;
        String str13;
        if (obj == this) {
            return true;
        }
        if (obj instanceof crwo) {
            crwo crwoVar = (crwo) obj;
            if (crwoVar.a() == null && crwoVar.b() == null && this.a.equals(crwoVar.c()) && this.b.equals(crwoVar.d()) && this.c.equals(crwoVar.e()) && ((str = this.d) != null ? str.equals(crwoVar.f()) : crwoVar.f() == null)) {
                int i = this.K;
                int M = crwoVar.M();
                if (i == 0) {
                    throw null;
                }
                if (i == M && ((dgpyVar = this.e) != null ? dgpyVar.equals(crwoVar.g()) : crwoVar.g() == null) && ((dgpuVar = this.f) != null ? dgpuVar.equals(crwoVar.h()) : crwoVar.h() == null) && ((dfqpVar = this.g) != null ? dfqpVar.equals(crwoVar.i()) : crwoVar.i() == null) && this.h.equals(crwoVar.j()) && ((str2 = this.i) != null ? str2.equals(crwoVar.k()) : crwoVar.k() == null) && ((str3 = this.j) != null ? str3.equals(crwoVar.l()) : crwoVar.l() == null) && ((str4 = this.k) != null ? str4.equals(crwoVar.m()) : crwoVar.m() == null) && ((crtrVar = this.l) != null ? crtrVar.equals(crwoVar.n()) : crwoVar.n() == null) && ((dspdVar = this.m) != null ? dspdVar.equals(crwoVar.o()) : crwoVar.o() == null) && ((dcdcVar = this.n) != null ? dchl.m(dcdcVar, crwoVar.p()) : crwoVar.p() == null) && ((dcdcVar2 = this.o) != null ? dchl.m(dcdcVar2, crwoVar.q()) : crwoVar.q() == null) && ((dcdcVar3 = this.p) != null ? dchl.m(dcdcVar3, crwoVar.r()) : crwoVar.r() == null) && ((dgrhVar = this.q) != null ? dgrhVar.equals(crwoVar.s()) : crwoVar.s() == null) && ((dgpoVar = this.r) != null ? dgpoVar.equals(crwoVar.t()) : crwoVar.t() == null) && ((str5 = this.s) != null ? str5.equals(crwoVar.u()) : crwoVar.u() == null) && this.t.equals(crwoVar.v()) && this.u.equals(crwoVar.w()) && ((crtpVar = this.v) != null ? crtpVar.equals(crwoVar.x()) : crwoVar.x() == null) && ((str6 = this.w) != null ? str6.equals(crwoVar.y()) : crwoVar.y() == null) && ((str7 = this.x) != null ? str7.equals(crwoVar.z()) : crwoVar.z() == null) && ((str8 = this.y) != null ? str8.equals(crwoVar.A()) : crwoVar.A() == null) && ((l = this.z) != null ? l.equals(crwoVar.B()) : crwoVar.B() == null) && this.A.equals(crwoVar.C()) && this.B == crwoVar.D() && ((str9 = this.C) != null ? str9.equals(crwoVar.E()) : crwoVar.E() == null) && ((l2 = this.D) != null ? l2.equals(crwoVar.F()) : crwoVar.F() == null) && ((crtzVar = this.E) != null ? crtzVar.equals(crwoVar.G()) : crwoVar.G() == null) && ((crucVar = this.F) != null ? crucVar.equals(crwoVar.H()) : crwoVar.H() == null) && ((str10 = this.G) != null ? str10.equals(crwoVar.I()) : crwoVar.I() == null) && ((str11 = this.H) != null ? str11.equals(crwoVar.J()) : crwoVar.J() == null) && ((str12 = this.I) != null ? str12.equals(crwoVar.K()) : crwoVar.K() == null) && ((str13 = this.J) != null ? str13.equals(crwoVar.L()) : crwoVar.L() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.crwo
    public final String f() {
        return this.d;
    }

    @Override // defpackage.crwo
    public final dgpy g() {
        return this.e;
    }

    @Override // defpackage.crwo
    public final dgpu h() {
        return this.f;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int hashCode = (((((this.a.hashCode() ^ 583896283) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        int i6 = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        int i7 = this.K;
        if (i7 != 0) {
            int i8 = (hashCode2 ^ i7) * 1000003;
            dgpy dgpyVar = this.e;
            if (dgpyVar == null) {
                i = 0;
            } else {
                i = dgpyVar.bC;
                if (i == 0) {
                    i = dsst.a.b(dgpyVar).c(dgpyVar);
                    dgpyVar.bC = i;
                }
            }
            int i9 = (i8 ^ i) * 1000003;
            dgpu dgpuVar = this.f;
            int hashCode3 = (i9 ^ (dgpuVar == null ? 0 : dgpuVar.hashCode())) * 1000003;
            dfqp dfqpVar = this.g;
            int hashCode4 = (((hashCode3 ^ (dfqpVar == null ? 0 : dfqpVar.hashCode())) * 1000003) ^ this.h.hashCode()) * 1000003;
            String str2 = this.i;
            int hashCode5 = (hashCode4 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
            String str3 = this.j;
            int hashCode6 = (hashCode5 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
            String str4 = this.k;
            int hashCode7 = (hashCode6 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
            crtr crtrVar = this.l;
            if (crtrVar == null) {
                i2 = 0;
            } else {
                i2 = crtrVar.bC;
                if (i2 == 0) {
                    i2 = dsst.a.b(crtrVar).c(crtrVar);
                    crtrVar.bC = i2;
                }
            }
            int i10 = (hashCode7 ^ i2) * 1000003;
            dspd dspdVar = this.m;
            int hashCode8 = (i10 ^ (dspdVar == null ? 0 : dspdVar.hashCode())) * 1000003;
            dcdc<String> dcdcVar = this.n;
            int hashCode9 = (hashCode8 ^ (dcdcVar == null ? 0 : dcdcVar.hashCode())) * 1000003;
            dcdc<dszs> dcdcVar2 = this.o;
            int hashCode10 = (hashCode9 ^ (dcdcVar2 == null ? 0 : dcdcVar2.hashCode())) * 1000003;
            dcdc<crtk> dcdcVar3 = this.p;
            int hashCode11 = (hashCode10 ^ (dcdcVar3 == null ? 0 : dcdcVar3.hashCode())) * 1000003;
            dgrh dgrhVar = this.q;
            if (dgrhVar == null) {
                i3 = 0;
            } else {
                i3 = dgrhVar.bC;
                if (i3 == 0) {
                    i3 = dsst.a.b(dgrhVar).c(dgrhVar);
                    dgrhVar.bC = i3;
                }
            }
            int i11 = (hashCode11 ^ i3) * 1000003;
            dgpo dgpoVar = this.r;
            if (dgpoVar == null) {
                i4 = 0;
            } else {
                i4 = dgpoVar.bC;
                if (i4 == 0) {
                    i4 = dsst.a.b(dgpoVar).c(dgpoVar);
                    dgpoVar.bC = i4;
                }
            }
            int i12 = (i11 ^ i4) * 1000003;
            String str5 = this.s;
            int hashCode12 = (((((i12 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003) ^ this.t.hashCode()) * 1000003) ^ this.u.hashCode()) * 1000003;
            crtp crtpVar = this.v;
            if (crtpVar == null) {
                i5 = 0;
            } else {
                i5 = crtpVar.bC;
                if (i5 == 0) {
                    i5 = dsst.a.b(crtpVar).c(crtpVar);
                    crtpVar.bC = i5;
                }
            }
            int i13 = (hashCode12 ^ i5) * 1000003;
            String str6 = this.w;
            int hashCode13 = (i13 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
            String str7 = this.x;
            int hashCode14 = (hashCode13 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
            String str8 = this.y;
            int hashCode15 = (hashCode14 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
            Long l = this.z;
            int hashCode16 = (((((hashCode15 ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ this.A.hashCode()) * 1000003) ^ this.B) * 1000003;
            String str9 = this.C;
            int hashCode17 = (hashCode16 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
            Long l2 = this.D;
            int hashCode18 = (hashCode17 ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
            crtz crtzVar = this.E;
            int hashCode19 = (hashCode18 ^ (crtzVar == null ? 0 : crtzVar.hashCode())) * 1000003;
            cruc crucVar = this.F;
            int hashCode20 = (hashCode19 ^ (crucVar == null ? 0 : crucVar.hashCode())) * 1000003;
            String str10 = this.G;
            int hashCode21 = (hashCode20 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
            String str11 = this.H;
            int hashCode22 = (hashCode21 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
            String str12 = this.I;
            int hashCode23 = (hashCode22 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
            String str13 = this.J;
            if (str13 != null) {
                i6 = str13.hashCode();
            }
            return hashCode23 ^ i6;
        }
        throw null;
    }

    @Override // defpackage.crwo
    public final dfqp i() {
        return this.g;
    }

    @Override // defpackage.crwo
    public final String j() {
        return this.h;
    }

    @Override // defpackage.crwo
    public final String k() {
        return this.i;
    }

    @Override // defpackage.crwo
    public final String l() {
        return this.j;
    }

    @Override // defpackage.crwo
    public final String m() {
        return this.k;
    }

    @Override // defpackage.crwo
    public final crtr n() {
        return this.l;
    }

    @Override // defpackage.crwo
    public final dspd o() {
        return this.m;
    }

    @Override // defpackage.crwo
    public final dcdc<String> p() {
        return this.n;
    }

    @Override // defpackage.crwo
    public final dcdc<dszs> q() {
        return this.o;
    }

    @Override // defpackage.crwo
    public final dcdc<crtk> r() {
        return this.p;
    }

    @Override // defpackage.crwo
    public final dgrh s() {
        return this.q;
    }

    @Override // defpackage.crwo
    public final dgpo t() {
        return this.r;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String str2 = this.c;
        String str3 = this.d;
        int i = this.K;
        String valueOf2 = String.valueOf(i != 0 ? Integer.toString(i - 1) : "null");
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        String str4 = this.h;
        String str5 = this.i;
        String str6 = this.j;
        String str7 = this.k;
        String valueOf6 = String.valueOf(this.l);
        String valueOf7 = String.valueOf(this.m);
        String valueOf8 = String.valueOf(this.n);
        String valueOf9 = String.valueOf(this.o);
        String valueOf10 = String.valueOf(this.p);
        String valueOf11 = String.valueOf(this.q);
        String valueOf12 = String.valueOf(this.r);
        String str8 = this.s;
        String valueOf13 = String.valueOf(this.t);
        String valueOf14 = String.valueOf(this.u);
        String valueOf15 = String.valueOf(this.v);
        String str9 = this.w;
        String str10 = this.x;
        String str11 = this.y;
        String valueOf16 = String.valueOf(this.z);
        String valueOf17 = String.valueOf(this.A);
        int i2 = this.B;
        String str12 = this.C;
        String valueOf18 = String.valueOf(this.D);
        String valueOf19 = String.valueOf(this.E);
        String valueOf20 = String.valueOf(this.F);
        String str13 = this.G;
        String str14 = this.H;
        String str15 = this.I;
        String str16 = this.J;
        int length = "null".length() + 584 + "null".length() + String.valueOf(str).length() + String.valueOf(valueOf).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str6).length() + String.valueOf(str7).length() + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length();
        int length2 = String.valueOf(valueOf8).length();
        int length3 = String.valueOf(valueOf9).length();
        int length4 = String.valueOf(valueOf10).length();
        int length5 = String.valueOf(valueOf11).length();
        int length6 = String.valueOf(valueOf12).length();
        int length7 = String.valueOf(str8).length();
        int length8 = String.valueOf(valueOf13).length();
        int length9 = String.valueOf(valueOf14).length();
        int length10 = String.valueOf(valueOf15).length();
        int length11 = String.valueOf(str9).length();
        int length12 = String.valueOf(str10).length();
        int length13 = String.valueOf(str11).length();
        int length14 = String.valueOf(valueOf16).length();
        int length15 = String.valueOf(valueOf17).length();
        int length16 = String.valueOf(str12).length();
        int length17 = String.valueOf(valueOf18).length();
        int length18 = String.valueOf(valueOf19).length();
        int length19 = String.valueOf(valueOf20).length();
        int length20 = String.valueOf(str13).length();
        StringBuilder sb = new StringBuilder(length + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + length13 + length14 + length15 + length16 + length17 + length18 + length19 + length20 + String.valueOf(str14).length() + String.valueOf(str15).length() + String.valueOf(str16).length());
        sb.append("UploadTaskMetadata{photoId=");
        sb.append("null");
        sb.append(", placeId=");
        sb.append("null");
        sb.append(", gpuMediaId=");
        sb.append(str);
        sb.append(", requestTime=");
        sb.append(valueOf);
        sb.append(", accountName=");
        sb.append(str2);
        sb.append(", obfuscatedUserId=");
        sb.append(str3);
        sb.append(", source=");
        sb.append(valueOf2);
        sb.append(", ugcsClientSpec=");
        sb.append(valueOf3);
        sb.append(", shareTarget=");
        sb.append(valueOf4);
        sb.append(", uploadTarget=");
        sb.append(valueOf5);
        sb.append(", originalUri=");
        sb.append(str4);
        sb.append(", description=");
        sb.append(str5);
        sb.append(", albumId=");
        sb.append(str6);
        sb.append(", ugcsContentId=");
        sb.append(str7);
        sb.append(", placeConfidence=");
        sb.append(valueOf6);
        sb.append(", clientsideMetadata=");
        sb.append(valueOf7);
        sb.append(", labels=");
        sb.append(valueOf8);
        sb.append(", localTags=");
        sb.append(valueOf9);
        sb.append(", associations=");
        sb.append(valueOf10);
        sb.append(", featureId=");
        sb.append(valueOf11);
        sb.append(", location=");
        sb.append(valueOf12);
        sb.append(", mid=");
        sb.append(str8);
        sb.append(", matchExistingMedia=");
        sb.append(valueOf13);
        sb.append(", wifiOnly=");
        sb.append(valueOf14);
        sb.append(", clearRecordMode=");
        sb.append(valueOf15);
        sb.append(", tempCopyUri=");
        sb.append(str9);
        sb.append(", sha1Hash=");
        sb.append(str10);
        sb.append(", mimeType=");
        sb.append(str11);
        sb.append(", byteSize=");
        sb.append(valueOf16);
        sb.append(", uploadStatus=");
        sb.append(valueOf17);
        sb.append(", attemptCount=");
        sb.append(i2);
        sb.append(", transferHandle=");
        sb.append(str12);
        sb.append(", completionTime=");
        sb.append(valueOf18);
        sb.append(", successReason=");
        sb.append(valueOf19);
        sb.append(", failureReason=");
        sb.append(valueOf20);
        sb.append(", publicPhotoId=");
        sb.append(str13);
        sb.append(", publicMediaKey=");
        sb.append(str14);
        sb.append(", publicImageUrl=");
        sb.append(str15);
        sb.append(", publicContentUrl=");
        sb.append(str16);
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.crwo
    public final String u() {
        return this.s;
    }

    @Override // defpackage.crwo
    public final Boolean v() {
        return this.t;
    }

    @Override // defpackage.crwo
    public final Boolean w() {
        return this.u;
    }

    @Override // defpackage.crwo
    public final crtp x() {
        return this.v;
    }

    @Override // defpackage.crwo
    public final String y() {
        return this.w;
    }

    @Override // defpackage.crwo
    public final String z() {
        return this.x;
    }
}
