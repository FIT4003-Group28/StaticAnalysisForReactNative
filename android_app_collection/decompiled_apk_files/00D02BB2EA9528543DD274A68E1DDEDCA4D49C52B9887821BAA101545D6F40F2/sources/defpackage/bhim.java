package defpackage;
/* compiled from: PG */
/* renamed from: bhim  reason: default package */
/* loaded from: classes3.dex */
public class bhim implements bhil {
    private final gga a;
    private final bhhy b;
    private final bhhx c;
    private final bhhw d;

    public bhim(gga ggaVar, bhhx bhhxVar, bhhy bhhyVar) {
        this.a = ggaVar;
        this.b = bhhyVar;
        this.c = bhhxVar;
        bhhw a = bhhxVar.a();
        dbsk.s(a);
        this.d = a;
    }

    @Override // defpackage.bhil
    public String a() {
        return this.a.getString(this.d.a());
    }

    @Override // defpackage.bhil
    public String b() {
        return this.a.getString(this.d.b());
    }

    @Override // defpackage.bhil
    public String c() {
        return this.a.getString(this.d.c());
    }

    @Override // defpackage.bhil
    public String d() {
        return this.a.getString(this.d.d());
    }

    @Override // defpackage.bhil
    public cqkl e() {
        this.b.f(this.c);
        return cqkl.a;
    }

    @Override // defpackage.bhil
    public cjtd f() {
        return cjtd.a(this.d.e());
    }

    @Override // defpackage.bhil
    public cjtd g() {
        return cjtd.a(this.d.f());
    }

    @Override // defpackage.bhil
    @dzsi
    public bhho h() {
        if (this.c.d() != 2) {
            return null;
        }
        return new bhhp();
    }
}
