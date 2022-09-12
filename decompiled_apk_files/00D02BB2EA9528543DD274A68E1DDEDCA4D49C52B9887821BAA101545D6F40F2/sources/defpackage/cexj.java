package defpackage;
/* compiled from: PG */
/* renamed from: cexj  reason: default package */
/* loaded from: classes4.dex */
public class cexj implements jad {
    private final ceet a;
    private final dhtc b;
    private final gfw c;
    @dzsi
    private final String d;
    private final String e;

    public cexj(ceet ceetVar, dhtc dhtcVar, gfw gfwVar, @dzsi String str, String str2) {
        this.a = ceetVar;
        this.b = dhtcVar;
        this.c = gfwVar;
        this.d = str;
        this.e = str2;
    }

    @Override // defpackage.jad
    public Boolean a() {
        return true;
    }

    @Override // defpackage.jad
    /* renamed from: b */
    public String e() {
        return this.e;
    }

    @Override // defpackage.jad
    public cqkl c() {
        ceet ceetVar = this.a;
        String str = this.d;
        drds drdsVar = drds.REVIEW;
        boolean z = this.d != null;
        ceer g = cees.g();
        ((ceep) g).b = this.c;
        g.b(this.b);
        g.c(true);
        ceetVar.l(str, drdsVar, z, g.a());
        return cqkl.a;
    }

    @Override // defpackage.jad
    public cjtd d() {
        return cjtd.a(dtxl.fj);
    }

    @Override // defpackage.jad
    public CharSequence f() {
        return "";
    }

    @Override // defpackage.jad
    public cqkl g(cjqm cjqmVar) {
        return jac.b(this);
    }

    @Override // defpackage.jad
    public Boolean h() {
        return jac.a();
    }

    @Override // defpackage.jad
    public cqtd i() {
        return null;
    }
}
