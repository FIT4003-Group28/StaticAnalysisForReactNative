package defpackage;
/* compiled from: PG */
/* renamed from: axvv  reason: default package */
/* loaded from: classes3.dex */
public final class axvv extends axwv {
    public ddho a;
    public String b;
    public Boolean c;
    public axuc d;
    public akqq e;
    public anee f;
    public dpyv g;
    private dndr h;
    private String i;
    private Boolean j;
    private Boolean k;
    private Boolean l;
    private Boolean m;

    @Override // defpackage.axwv
    public final void b(dndr dndrVar) {
        if (dndrVar != null) {
            this.h = dndrVar;
            return;
        }
        throw new NullPointerException("Null aliasType");
    }

    @Override // defpackage.axwv
    public final void c(String str) {
        if (str != null) {
            this.i = str;
            return;
        }
        throw new NullPointerException("Null initialQuery");
    }

    @Override // defpackage.axwv
    public final void d(boolean z) {
        this.j = Boolean.valueOf(z);
    }

    @Override // defpackage.axwv
    public final void e(boolean z) {
        this.k = Boolean.valueOf(z);
    }

    @Override // defpackage.axwv
    public final void f(boolean z) {
        this.m = Boolean.valueOf(z);
    }

    @Override // defpackage.axwv
    public final void g(boolean z) {
        this.l = Boolean.valueOf(z);
    }

    @Override // defpackage.axwv
    public final axww a() {
        String str = this.h == null ? " aliasType" : "";
        if (this.i == null) {
            str = str.concat(" initialQuery");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" initialQueryIsLatLng");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" openPlaceSheet");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" popBackStack");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" skipWaaCheck");
        }
        if (this.m == null) {
            str = String.valueOf(str).concat(" prepopulateWithStpResults");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new axvw(this.h, this.i, this.j.booleanValue(), this.a, this.b, this.c.booleanValue(), this.k.booleanValue(), this.l.booleanValue(), this.d, this.e, this.m.booleanValue(), this.f, this.g);
    }
}
