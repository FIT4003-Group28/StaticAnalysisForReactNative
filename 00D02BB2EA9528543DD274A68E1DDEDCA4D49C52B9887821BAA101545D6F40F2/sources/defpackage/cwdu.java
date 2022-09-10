package defpackage;
/* compiled from: PG */
/* renamed from: cwdu  reason: default package */
/* loaded from: classes.dex */
public final class cwdu<AccountT> extends cwds<AccountT> {
    public cweh<AccountT> b;
    public cwee d;
    public Boolean e;
    private dcdc<cwdc> h;
    public dbsg<cwef> a = dbpy.a;
    private final dbsg<cweg<AccountT>> f = dbpy.a;
    private final dbsg<cwej> g = dbpy.a;
    public dbsg<cweb<AccountT>> c = dbpy.a;
    private final dbsg<cvwm<AccountT>> i = dbpy.a;
    private final dbsg<cwei<AccountT>> j = dbpy.a;
    private final dbsg<cwec> k = dbpy.a;

    @Override // defpackage.cwds
    public final void b(dcdc<cwdc> dcdcVar) {
        if (dcdcVar != null) {
            this.h = dcdcVar;
            return;
        }
        throw new NullPointerException("Null commonActions");
    }

    @Override // defpackage.cwds
    public final cwdt<AccountT> a() {
        String str = this.b == null ? " policyFooterCustomizer" : "";
        if (this.h == null) {
            str = str.concat(" commonActions");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" educationManager");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" isExperimental");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cwdv(this.a, this.f, this.b, this.g, this.c, this.h, this.d, this.i, this.j, this.k, this.e.booleanValue());
    }
}
