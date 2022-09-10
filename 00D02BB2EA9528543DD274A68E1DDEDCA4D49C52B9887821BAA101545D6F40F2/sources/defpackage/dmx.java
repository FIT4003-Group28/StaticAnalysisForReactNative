package defpackage;
/* compiled from: PG */
/* renamed from: dmx  reason: default package */
/* loaded from: classes6.dex */
public final class dmx extends dmu {
    public dmr a;
    public dbsg<String> b;
    public dbsg<dfmg> c;
    public dbsg d;
    private dbsg<ilo> e;
    private dbsg<dsza> f;

    public dmx() {
        this.b = dbpy.a;
        this.e = dbpy.a;
        this.f = dbpy.a;
        this.c = dbpy.a;
        this.d = dbpy.a;
    }

    public dmx(dmv dmvVar) {
        this.b = dbpy.a;
        this.e = dbpy.a;
        this.f = dbpy.a;
        this.c = dbpy.a;
        this.d = dbpy.a;
        dmy dmyVar = (dmy) dmvVar;
        this.a = dmyVar.a;
        this.b = dmyVar.b;
        this.e = dmyVar.c;
        this.f = dmyVar.d;
        this.c = dmyVar.e;
        this.d = dmyVar.f;
    }

    @Override // defpackage.dmu
    public final void b(dsza dszaVar) {
        this.f = dbsg.i(dszaVar);
    }

    @Override // defpackage.dmu
    public final void c(ilo iloVar) {
        this.e = dbsg.i(iloVar);
    }

    @Override // defpackage.dmu
    public final dmv a() {
        String str = this.a == null ? " identifier" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new dmy(this.a, this.b, this.e, this.f, this.c, this.d);
    }
}
