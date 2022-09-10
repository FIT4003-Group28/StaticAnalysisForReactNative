package defpackage;

import com.google.android.apps.gmm.review.api.ReviewConfiguration$ReviewAtAPlaceConversionLoggingParams;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bqiz  reason: default package */
/* loaded from: classes4.dex */
public final class bqiz extends bqky {
    public Boolean a;
    private dnqh b;
    private dbsg<ReviewConfiguration$ReviewAtAPlaceConversionLoggingParams> c = dbpy.a;
    private dbsg<bqks> d = dbpy.a;
    private chbv e;
    private dhpj f;
    private int g;

    @Override // defpackage.bqky
    public final void b(Boolean bool) {
        this.a = bool;
    }

    @Override // defpackage.bqky
    public final void c(dhpj dhpjVar) {
        if (dhpjVar != null) {
            this.f = dhpjVar;
            return;
        }
        throw new NullPointerException("Null contributionSource");
    }

    @Override // defpackage.bqky
    public final void d(dnqh dnqhVar) {
        if (dnqhVar != null) {
            this.b = dnqhVar;
            return;
        }
        throw new NullPointerException("Null loggingParams");
    }

    @Override // defpackage.bqky
    public final void e(bqks bqksVar) {
        this.d = dbsg.i(bqksVar);
    }

    @Override // defpackage.bqky
    public final void f(dbsg<ReviewConfiguration$ReviewAtAPlaceConversionLoggingParams> dbsgVar) {
        if (dbsgVar != null) {
            this.c = dbsgVar;
            return;
        }
        throw new NullPointerException("Null reviewAtAPlaceConversionLoggingParams");
    }

    @Override // defpackage.bqky
    public final void g(chbv chbvVar) {
        if (chbvVar != null) {
            this.e = chbvVar;
            return;
        }
        throw new NullPointerException("Null thanksOnSubmit");
    }

    @Override // defpackage.bqky
    public final void h(int i) {
        this.g = i;
    }

    @Override // defpackage.bqky
    public final bqkz a() {
        String str = this.b == null ? " loggingParams" : "";
        if (this.e == null) {
            str = str.concat(" thanksOnSubmit");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" contributionSource");
        }
        if (this.g == 0) {
            str = String.valueOf(str).concat(" savedDraftReviewUsage");
        }
        if (this.a == null) {
            str = String.valueOf(str).concat(" canShowFollowPlaceCard");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bqja(this.b, this.c, this.d, this.e, this.f, this.g, this.a);
    }
}
