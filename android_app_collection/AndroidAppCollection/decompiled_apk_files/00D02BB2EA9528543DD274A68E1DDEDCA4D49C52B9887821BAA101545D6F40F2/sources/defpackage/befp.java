package defpackage;
/* compiled from: PG */
/* renamed from: befp  reason: default package */
/* loaded from: classes3.dex */
public final class befp extends befu {
    public dnqh a;
    public dvzd b;
    public Boolean c;
    public dqhw d;
    public dbsg<dobd> e = dbpy.a;
    public dnyh f;
    public begi g;
    private bwrs<ilo> h;
    private Boolean i;
    private Boolean j;
    private Boolean k;
    private Boolean l;
    private Boolean m;
    private Boolean n;

    @Override // defpackage.befu
    public final bwrs<ilo> a() {
        bwrs<ilo> bwrsVar = this.h;
        if (bwrsVar != null) {
            return bwrsVar;
        }
        throw new IllegalStateException("Property \"placemarkRef\" has not been set");
    }

    @Override // defpackage.befu
    @dzsi
    public final dbsg<dnqh> b() {
        dnqh dnqhVar = this.a;
        return dnqhVar == null ? dbpy.a : dbsg.i(dnqhVar);
    }

    @Override // defpackage.befu
    public final dbsg<Boolean> c() {
        Boolean bool = this.l;
        return bool == null ? dbpy.a : dbsg.i(bool);
    }

    @Override // defpackage.befu
    public final void e(boolean z) {
        this.j = Boolean.valueOf(z);
    }

    @Override // defpackage.befu
    public final void f(boolean z) {
        this.l = Boolean.valueOf(z);
    }

    @Override // defpackage.befu
    public final void g(boolean z) {
        this.i = Boolean.valueOf(z);
    }

    @Override // defpackage.befu
    public final void h(boolean z) {
        this.n = Boolean.valueOf(z);
    }

    @Override // defpackage.befu
    public final void i(@dzsi dnqh dnqhVar) {
        this.a = dnqhVar;
    }

    @Override // defpackage.befu
    public final void j(bwrs<ilo> bwrsVar) {
        if (bwrsVar != null) {
            this.h = bwrsVar;
            return;
        }
        throw new NullPointerException("Null placemarkRef");
    }

    @Override // defpackage.befu
    public final void k(boolean z) {
        this.m = Boolean.valueOf(z);
    }

    @Override // defpackage.befu
    public final void l(boolean z) {
        this.k = Boolean.valueOf(z);
    }

    @Override // defpackage.befu
    public final befv d() {
        String str = this.h == null ? " placemarkRef" : "";
        if (this.i == null) {
            str = str.concat(" forceFetch");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" bypassCache");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" useOfflineTimeout");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" enableFprintFallback");
        }
        if (this.m == null) {
            str = String.valueOf(str).concat(" showToastOnFailure");
        }
        if (this.n == null) {
            str = String.valueOf(str).concat(" includeUgcEditState");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" includeUgcContributionFeatures");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new befq(this.h, this.a, this.i.booleanValue(), this.j.booleanValue(), this.k.booleanValue(), this.l.booleanValue(), this.m.booleanValue(), this.b, this.n.booleanValue(), this.c.booleanValue(), this.d, this.e, this.f, null, this.g);
    }
}
