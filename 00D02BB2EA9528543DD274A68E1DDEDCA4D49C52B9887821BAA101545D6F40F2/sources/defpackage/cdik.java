package defpackage;
/* compiled from: PG */
/* renamed from: cdik  reason: default package */
/* loaded from: classes4.dex */
public class cdik implements cdim {
    private final cdhl a;
    private final cdhp b;

    public cdik(cdhp cdhpVar, cdhl cdhlVar) {
        this.b = cdhpVar;
        this.a = cdhlVar;
    }

    @Override // defpackage.cdim
    public String a() {
        return this.a.c();
    }

    @Override // defpackage.cdim
    public cqkl b() {
        this.b.Ra(cdil.b(this.a));
        return cqkl.a;
    }

    @Override // defpackage.cdim
    public cjtd c() {
        cjta c = cjtd.c(this.a.a.a());
        c.d = dtyd.y;
        return c.a();
    }
}
