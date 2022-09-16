package defpackage;

import com.google.android.apps.gmm.review.api.ReviewConfiguration$ReviewAtAPlaceConversionLoggingParams;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bqis  reason: default package */
/* loaded from: classes4.dex */
public final class bqis extends bqjh {
    public final boolean a;
    public final int b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final dcdc<bbtm> f;
    public final bqlh g;
    public final chbv h;
    public final dhpj i;
    public final dnqh j;
    public final dbsg<ReviewConfiguration$ReviewAtAPlaceConversionLoggingParams> k;
    public final boolean l;
    public final dpyv m;
    public final Class<? extends bqld> n;
    public final dbsg<ddhv> o;
    public final dbsg<dlif> p;

    public bqis(boolean z, int i, String str, boolean z2, boolean z3, dcdc<bbtm> dcdcVar, bqlh bqlhVar, chbv chbvVar, dhpj dhpjVar, dnqh dnqhVar, dbsg<ReviewConfiguration$ReviewAtAPlaceConversionLoggingParams> dbsgVar, boolean z4, dpyv dpyvVar, Class<? extends bqld> cls, dbsg<ddhv> dbsgVar2, dbsg<dlif> dbsgVar3) {
        this.a = z;
        this.b = i;
        this.c = str;
        this.d = z2;
        this.e = z3;
        this.f = dcdcVar;
        this.g = bqlhVar;
        this.h = chbvVar;
        this.i = dhpjVar;
        this.j = dnqhVar;
        this.k = dbsgVar;
        this.l = z4;
        this.m = dpyvVar;
        this.n = cls;
        this.o = dbsgVar2;
        this.p = dbsgVar3;
    }

    @Override // defpackage.bqjh
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.bqjh
    public final int b() {
        return this.b;
    }

    @Override // defpackage.bqjh
    public final String c() {
        return this.c;
    }

    @Override // defpackage.bqjh
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.bqjh
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        dpyv dpyvVar;
        Class<? extends bqld> cls;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bqjh) {
            bqjh bqjhVar = (bqjh) obj;
            if (this.a == bqjhVar.a() && this.b == bqjhVar.b() && ((str = this.c) != null ? str.equals(bqjhVar.c()) : bqjhVar.c() == null) && this.d == bqjhVar.d() && this.e == bqjhVar.e() && dchl.m(this.f, bqjhVar.f()) && this.g.equals(bqjhVar.g()) && this.h.equals(bqjhVar.h()) && this.i.equals(bqjhVar.i()) && this.j.equals(bqjhVar.j()) && this.k.equals(bqjhVar.k()) && this.l == bqjhVar.l() && ((dpyvVar = this.m) != null ? dpyvVar.equals(bqjhVar.m()) : bqjhVar.m() == null) && ((cls = this.n) != null ? cls.equals(bqjhVar.n()) : bqjhVar.n() == null) && this.o.equals(bqjhVar.o()) && this.p.equals(bqjhVar.p())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bqjh
    public final dcdc<bbtm> f() {
        return this.f;
    }

    @Override // defpackage.bqjh
    public final bqlh g() {
        return this.g;
    }

    @Override // defpackage.bqjh
    public final chbv h() {
        return this.h;
    }

    @Override // defpackage.bqjh
    public final dhpj i() {
        return this.i;
    }

    @Override // defpackage.bqjh
    public final dnqh j() {
        return this.j;
    }

    @Override // defpackage.bqjh
    public final dbsg<ReviewConfiguration$ReviewAtAPlaceConversionLoggingParams> k() {
        return this.k;
    }

    @Override // defpackage.bqjh
    public final boolean l() {
        return this.l;
    }

    @Override // defpackage.bqjh
    public final dpyv m() {
        return this.m;
    }

    @Override // defpackage.bqjh
    public final Class<? extends bqld> n() {
        return this.n;
    }

    @Override // defpackage.bqjh
    public final dbsg<ddhv> o() {
        return this.o;
    }

    @Override // defpackage.bqjh
    public final dbsg<dlif> p() {
        return this.p;
    }

    @Override // defpackage.bqjh
    public final bqjf q() {
        return new bqir(this);
    }

    public final String toString() {
        boolean z = this.a;
        int i = this.b;
        String str = this.c;
        boolean z2 = this.d;
        boolean z3 = this.e;
        String valueOf = String.valueOf(this.f);
        String valueOf2 = String.valueOf(this.g);
        String valueOf3 = String.valueOf(this.h);
        String valueOf4 = String.valueOf(this.i);
        String valueOf5 = String.valueOf(this.j);
        String valueOf6 = String.valueOf(this.k);
        boolean z4 = this.l;
        String valueOf7 = String.valueOf(this.m);
        String valueOf8 = String.valueOf(this.n);
        String valueOf9 = String.valueOf(this.o);
        String valueOf10 = String.valueOf(this.p);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(valueOf4).length();
        int length6 = String.valueOf(valueOf5).length();
        int length7 = String.valueOf(valueOf6).length();
        int length8 = String.valueOf(valueOf7).length();
        int length9 = String.valueOf(valueOf8).length();
        StringBuilder sb = new StringBuilder(length + 371 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + String.valueOf(valueOf9).length() + String.valueOf(valueOf10).length());
        sb.append("ReviewConfiguration{oneTapSubmit=");
        sb.append(z);
        sb.append(", ratingToSubmit=");
        sb.append(i);
        sb.append(", reviewTextToSubmit=");
        sb.append(str);
        sb.append(", autoSubmit=");
        sb.append(z2);
        sb.append(", showAfterReviewToast=");
        sb.append(z3);
        sb.append(", photosToPreselect=");
        sb.append(valueOf);
        sb.append(", suggestedPhotos=");
        sb.append(valueOf2);
        sb.append(", thanksOnSubmit=");
        sb.append(valueOf3);
        sb.append(", contributionSource=");
        sb.append(valueOf4);
        sb.append(", loggingParams=");
        sb.append(valueOf5);
        sb.append(", reviewAtAPlaceConversionLoggingParams=");
        sb.append(valueOf6);
        sb.append(", isPlaceChangeable=");
        sb.append(z4);
        sb.append(", notificationIdEnum=");
        sb.append(valueOf7);
        sb.append(", listenerFragment=");
        sb.append(valueOf8);
        sb.append(", intentSourceData=");
        sb.append(valueOf9);
        sb.append(", placeVisitMetadata=");
        sb.append(valueOf10);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b) * 1000003;
        String str = this.c;
        int i3 = 0;
        int hashCode = (((((((((((((i2 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003;
        dnqh dnqhVar = this.j;
        int i4 = dnqhVar.bC;
        if (i4 == 0) {
            i4 = dsst.a.b(dnqhVar).c(dnqhVar);
            dnqhVar.bC = i4;
        }
        int hashCode2 = (((hashCode ^ i4) * 1000003) ^ this.k.hashCode()) * 1000003;
        if (true == this.l) {
            i = 1231;
        }
        int i5 = (hashCode2 ^ i) * 1000003;
        dpyv dpyvVar = this.m;
        int hashCode3 = (i5 ^ (dpyvVar == null ? 0 : dpyvVar.hashCode())) * 1000003;
        Class<? extends bqld> cls = this.n;
        if (cls != null) {
            i3 = cls.hashCode();
        }
        return ((((hashCode3 ^ i3) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode();
    }
}
