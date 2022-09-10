package defpackage;
/* compiled from: PG */
/* renamed from: tlq  reason: default package */
/* loaded from: classes7.dex */
final class tlq extends tlw {
    public dbsg<dqvj> a;
    private tlx b;
    private Boolean c;
    private Boolean d;
    private Boolean e;
    private Boolean f;
    private dcdn<String, Integer> g;
    private Integer h;

    public tlq() {
        this.a = dbpy.a;
    }

    public tlq(tly tlyVar) {
        this.a = dbpy.a;
        tlr tlrVar = (tlr) tlyVar;
        this.b = tlrVar.a;
        this.a = tlrVar.b;
        this.c = Boolean.valueOf(tlrVar.c);
        this.d = Boolean.valueOf(tlrVar.d);
        this.e = Boolean.valueOf(tlrVar.e);
        this.f = Boolean.valueOf(tlrVar.f);
        this.g = tlrVar.g;
        this.h = tlrVar.h;
    }

    @Override // defpackage.tlw
    public final void b(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    @Override // defpackage.tlw
    public final void c(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    @Override // defpackage.tlw
    public final void d(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    @Override // defpackage.tlw
    public final void e(Integer num) {
        if (num != null) {
            this.h = num;
            return;
        }
        throw new NullPointerException("Null fastestTripIndex");
    }

    @Override // defpackage.tlw
    public final void f(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    @Override // defpackage.tlw
    public final void g(dcdn<String, Integer> dcdnVar) {
        if (dcdnVar != null) {
            this.g = dcdnVar;
            return;
        }
        throw new NullPointerException("Null preferredServiceProviderTripIndices");
    }

    @Override // defpackage.tlw
    public final void h(tlx tlxVar) {
        if (tlxVar != null) {
            this.b = tlxVar;
            return;
        }
        throw new NullPointerException("Null rationale");
    }

    @Override // defpackage.tlw
    public final void i(dbsg<dqvj> dbsgVar) {
        this.a = dbsgVar;
    }

    @Override // defpackage.tlw
    public final tly a() {
        String str = this.b == null ? " rationale" : "";
        if (this.c == null) {
            str = str.concat(" isHighlightedGroup");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" containsFastestTrip");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" containsExplicitlyPreferredMode");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" containsImplicitlyPreferredMode");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" preferredServiceProviderTripIndices");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" fastestTripIndex");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new tlr(this.b, this.a, this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g, this.h);
    }
}
