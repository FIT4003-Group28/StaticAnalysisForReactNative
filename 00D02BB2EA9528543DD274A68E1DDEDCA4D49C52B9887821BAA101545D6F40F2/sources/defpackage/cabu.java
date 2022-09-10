package defpackage;
/* compiled from: PG */
/* renamed from: cabu  reason: default package */
/* loaded from: classes4.dex */
public class cabu implements cafk {
    private final cqtd a;
    private final cjtd b;
    private final cjtd c;
    private final String d;
    private final String e;
    private final Runnable f;
    private final Runnable g;

    public cabu(cqtd cqtdVar, double d, cjtd cjtdVar, cjtd cjtdVar2, String str, String str2, Runnable runnable, Runnable runnable2) {
        this.a = cqtdVar;
        this.c = cjtdVar2;
        this.b = cjtdVar;
        this.d = str;
        this.e = str2;
        this.f = runnable;
        this.g = runnable2;
    }

    @Override // defpackage.cafy
    public void a(cqiv cqivVar) {
        cqivVar.a(new caku(), this);
    }

    @Override // defpackage.cafy
    public cjtd b() {
        return this.b;
    }

    @Override // defpackage.cafy
    public cqtd c() {
        return this.a;
    }

    @Override // defpackage.cafy
    public String d() {
        return this.d;
    }

    @Override // defpackage.cafy
    public String e() {
        return this.e;
    }

    @Override // defpackage.cafy
    public cqkl f() {
        this.f.run();
        return cqkl.a;
    }

    @Override // defpackage.cafk
    public cqtv g() {
        return cqrp.d(50.0d);
    }

    @Override // defpackage.cafk
    public cqtv h() {
        return cqrp.d(11.0d);
    }

    @Override // defpackage.cafk
    public cjtd i() {
        return this.c;
    }

    @Override // defpackage.cafk
    public cqss j() {
        return irg.H();
    }

    @Override // defpackage.cafk
    public cqkl k() {
        this.g.run();
        return cqkl.a;
    }
}
