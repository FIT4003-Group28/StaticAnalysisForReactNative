package defpackage;
/* compiled from: PG */
/* renamed from: bonc  reason: default package */
/* loaded from: classes3.dex */
public class bonc implements bopu {
    private final bokf a;
    private final bbut b;
    private final gfw c;
    private final dwyd d;
    private final String e;
    private final boolean f;
    @dzsi
    private final ddho g;

    public bonc(bokf bokfVar, bbut bbutVar, dwyd dwydVar, gfw gfwVar, String str, boolean z, @dzsi ddho ddhoVar) {
        this.a = bokfVar;
        this.b = bbutVar;
        this.d = dwydVar;
        this.c = gfwVar;
        this.e = str;
        this.f = z;
        this.g = ddhoVar;
    }

    @Override // defpackage.bopu
    public cqkl a() {
        if (!b().booleanValue() || this.f) {
            bbut bbutVar = this.b;
            bbuz m = bbve.m();
            m.e(this.d);
            m.g(this.e);
            m.i(this.a.b());
            bbutVar.k(m.a(), this.c);
        } else {
            this.b.s(false, dbpy.a, this.e, this.c, this.d);
        }
        return cqkl.a;
    }

    @Override // defpackage.bopu
    public Boolean b() {
        return Boolean.valueOf(this.e.startsWith("business_hours_photo"));
    }

    @Override // defpackage.bopu
    @dzsi
    public cjtd c() {
        ddho ddhoVar = this.g;
        if (ddhoVar != null) {
            return cjtd.a(ddhoVar);
        }
        return null;
    }
}
