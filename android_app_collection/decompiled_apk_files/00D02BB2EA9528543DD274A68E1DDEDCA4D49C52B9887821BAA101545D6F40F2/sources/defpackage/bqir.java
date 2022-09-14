package defpackage;

import com.google.android.apps.gmm.review.api.ReviewConfiguration$ReviewAtAPlaceConversionLoggingParams;
import java.util.List;
/* compiled from: PG */
/* renamed from: bqir  reason: default package */
/* loaded from: classes4.dex */
public final class bqir extends bqjf {
    public String a;
    public bqlh b;
    public dbsg<ReviewConfiguration$ReviewAtAPlaceConversionLoggingParams> c;
    public dpyv d;
    public Class<? extends bqld> e;
    public dbsg<ddhv> f;
    private Boolean g;
    private Integer h;
    private Boolean i;
    private Boolean j;
    private dcdc<bbtm> k;
    private chbv l;
    private dhpj m;
    private dnqh n;
    private Boolean o;
    private dbsg<dlif> p;

    public bqir() {
        this.c = dbpy.a;
        this.f = dbpy.a;
        this.p = dbpy.a;
    }

    public bqir(bqjh bqjhVar) {
        this.c = dbpy.a;
        this.f = dbpy.a;
        this.p = dbpy.a;
        bqis bqisVar = (bqis) bqjhVar;
        this.g = Boolean.valueOf(bqisVar.a);
        this.h = Integer.valueOf(bqisVar.b);
        this.a = bqisVar.c;
        this.i = Boolean.valueOf(bqisVar.d);
        this.j = Boolean.valueOf(bqisVar.e);
        this.k = bqisVar.f;
        this.b = bqisVar.g;
        this.l = bqisVar.h;
        this.m = bqisVar.i;
        this.n = bqisVar.j;
        this.c = bqisVar.k;
        this.o = Boolean.valueOf(bqisVar.l);
        this.d = bqisVar.m;
        this.e = bqisVar.n;
        this.f = bqisVar.o;
        this.p = bqisVar.p;
    }

    @Override // defpackage.bqjf
    public final void b(boolean z) {
        this.i = Boolean.valueOf(z);
    }

    @Override // defpackage.bqjf
    public final void c(dhpj dhpjVar) {
        if (dhpjVar != null) {
            this.m = dhpjVar;
            return;
        }
        throw new NullPointerException("Null contributionSource");
    }

    @Override // defpackage.bqjf
    public final void d(boolean z) {
        this.o = Boolean.valueOf(z);
    }

    @Override // defpackage.bqjf
    public final void e(Class<? extends bqld> cls) {
        this.e = cls;
    }

    @Override // defpackage.bqjf
    public final void f(dnqh dnqhVar) {
        if (dnqhVar != null) {
            this.n = dnqhVar;
            return;
        }
        throw new NullPointerException("Null loggingParams");
    }

    @Override // defpackage.bqjf
    public final void g(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    @Override // defpackage.bqjf
    public final void h(List<bbtm> list) {
        this.k = dcdc.r(list);
    }

    @Override // defpackage.bqjf
    public final void i(dlif dlifVar) {
        this.p = dbsg.i(dlifVar);
    }

    @Override // defpackage.bqjf
    public final void j(int i) {
        this.h = Integer.valueOf(i);
    }

    @Override // defpackage.bqjf
    public final void k(String str) {
        this.a = str;
    }

    @Override // defpackage.bqjf
    public final void l(boolean z) {
        this.j = Boolean.valueOf(z);
    }

    @Override // defpackage.bqjf
    protected final void m(bqlh bqlhVar) {
        this.b = bqlhVar;
    }

    @Override // defpackage.bqjf
    public final void n(chbv chbvVar) {
        if (chbvVar != null) {
            this.l = chbvVar;
            return;
        }
        throw new NullPointerException("Null thanksOnSubmit");
    }

    @Override // defpackage.bqjf
    public final bqjh a() {
        String str = this.g == null ? " oneTapSubmit" : "";
        if (this.h == null) {
            str = str.concat(" ratingToSubmit");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" autoSubmit");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" showAfterReviewToast");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" photosToPreselect");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" suggestedPhotos");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" thanksOnSubmit");
        }
        if (this.m == null) {
            str = String.valueOf(str).concat(" contributionSource");
        }
        if (this.n == null) {
            str = String.valueOf(str).concat(" loggingParams");
        }
        if (this.o == null) {
            str = String.valueOf(str).concat(" isPlaceChangeable");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bqis(this.g.booleanValue(), this.h.intValue(), this.a, this.i.booleanValue(), this.j.booleanValue(), this.k, this.b, this.l, this.m, this.n, this.c, this.o.booleanValue(), this.d, this.e, this.f, this.p);
    }
}
