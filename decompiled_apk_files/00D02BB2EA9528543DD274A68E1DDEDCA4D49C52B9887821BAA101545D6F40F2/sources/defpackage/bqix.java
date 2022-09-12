package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bqix  reason: default package */
/* loaded from: classes4.dex */
public final class bqix extends bqkw {
    public dcdc<drfo> b;
    private akqi c;
    private Integer d;
    private String e;
    private dqgr f;
    private dcdc<dreq> h;
    private dbsg<eapy> g = dbpy.a;
    public dbsg<dqwy> a = dbpy.a;

    @Override // defpackage.bqkw
    public final void b(List<dreq> list) {
        this.h = dcdc.r(list);
    }

    @Override // defpackage.bqkw
    public final void c(akqi akqiVar) {
        if (akqiVar != null) {
            this.c = akqiVar;
            return;
        }
        throw new NullPointerException("Null featureId");
    }

    @Override // defpackage.bqkw
    public final void d(dqgr dqgrVar) {
        if (dqgrVar != null) {
            this.f = dqgrVar;
            return;
        }
        throw new NullPointerException("Null reviewStatus");
    }

    @Override // defpackage.bqkw
    public final void e(String str) {
        if (str != null) {
            this.e = str;
            return;
        }
        throw new NullPointerException("Null reviewText");
    }

    @Override // defpackage.bqkw
    public final void f(int i) {
        this.d = Integer.valueOf(i);
    }

    @Override // defpackage.bqkw
    public final void g(eapy eapyVar) {
        this.g = dbsg.i(eapyVar);
    }

    @Override // defpackage.bqkw
    protected final bqkx a() {
        String str = this.c == null ? " featureId" : "";
        if (this.d == null) {
            str = str.concat(" starRating");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" reviewText");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" reviewStatus");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" aspects");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" structuredQuestions");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bqiy(this.c, this.d.intValue(), this.e, this.f, this.g, this.a, this.h, this.b);
    }
}
