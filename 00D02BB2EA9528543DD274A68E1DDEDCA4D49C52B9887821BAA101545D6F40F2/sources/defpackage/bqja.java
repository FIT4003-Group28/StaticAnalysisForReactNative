package defpackage;

import com.google.android.apps.gmm.review.api.ReviewConfiguration$ReviewAtAPlaceConversionLoggingParams;
/* compiled from: PG */
/* renamed from: bqja  reason: default package */
/* loaded from: classes4.dex */
final class bqja extends bqkz {
    private final dnqh a;
    private final dbsg<ReviewConfiguration$ReviewAtAPlaceConversionLoggingParams> b;
    private final dbsg<bqks> c;
    private final chbv d;
    private final dhpj e;
    private final Boolean f;
    private final int g;

    public bqja(dnqh dnqhVar, dbsg<ReviewConfiguration$ReviewAtAPlaceConversionLoggingParams> dbsgVar, dbsg<bqks> dbsgVar2, chbv chbvVar, dhpj dhpjVar, int i, Boolean bool) {
        this.a = dnqhVar;
        this.b = dbsgVar;
        this.c = dbsgVar2;
        this.d = chbvVar;
        this.e = dhpjVar;
        this.g = i;
        this.f = bool;
    }

    @Override // defpackage.bqkz
    public final dnqh a() {
        return this.a;
    }

    @Override // defpackage.bqkz
    public final dbsg<ReviewConfiguration$ReviewAtAPlaceConversionLoggingParams> b() {
        return this.b;
    }

    @Override // defpackage.bqkz
    public final dbsg<bqks> c() {
        return this.c;
    }

    @Override // defpackage.bqkz
    public final chbv d() {
        return this.d;
    }

    @Override // defpackage.bqkz
    public final dhpj e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bqkz) {
            bqkz bqkzVar = (bqkz) obj;
            if (this.a.equals(bqkzVar.a()) && this.b.equals(bqkzVar.b()) && this.c.equals(bqkzVar.c()) && this.d.equals(bqkzVar.d()) && this.e.equals(bqkzVar.e())) {
                int i = this.g;
                int g = bqkzVar.g();
                if (i == 0) {
                    throw null;
                }
                if (i == g && this.f.equals(bqkzVar.f())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.bqkz
    public final Boolean f() {
        return this.f;
    }

    @Override // defpackage.bqkz
    public final int g() {
        return this.g;
    }

    public final int hashCode() {
        dnqh dnqhVar = this.a;
        int i = dnqhVar.bC;
        if (i == 0) {
            i = dsst.a.b(dnqhVar).c(dnqhVar);
            dnqhVar.bC = i;
        }
        int hashCode = (((((((((i ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i2 = this.g;
        if (i2 != 0) {
            return this.f.hashCode() ^ ((hashCode ^ i2) * 1000003);
        }
        throw null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        int i = this.g;
        String valueOf6 = String.valueOf(i != 0 ? Integer.toString(i - 1) : "null");
        String valueOf7 = String.valueOf(this.f);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 164 + length2 + length3 + length4 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length());
        sb.append("SubmitOptions{loggingParams=");
        sb.append(valueOf);
        sb.append(", reviewAtAPlaceConversionLoggingParams=");
        sb.append(valueOf2);
        sb.append(", media=");
        sb.append(valueOf3);
        sb.append(", thanksOnSubmit=");
        sb.append(valueOf4);
        sb.append(", contributionSource=");
        sb.append(valueOf5);
        sb.append(", savedDraftReviewUsage=");
        sb.append(valueOf6);
        sb.append(", canShowFollowPlaceCard=");
        sb.append(valueOf7);
        sb.append("}");
        return sb.toString();
    }
}
