package defpackage;
/* compiled from: PG */
/* renamed from: cach  reason: default package */
/* loaded from: classes4.dex */
public class cach implements cafv {
    private final cqtd a;
    private final cjtd b;
    private final String c;
    private final String d;
    private final Runnable e;
    private final cqtd f;

    public cach(cqtd cqtdVar, cqss cqssVar, cjtd cjtdVar, String str, String str2, Runnable runnable) {
        this.a = cqtdVar;
        this.b = cjtdVar;
        this.c = str;
        this.d = str2;
        this.e = runnable;
        this.f = cqtt.g(cqssVar);
    }

    @Override // defpackage.cafy
    public void a(cqiv cqivVar) {
        cqivVar.a(new caoo(), this);
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
        return this.c;
    }

    @Override // defpackage.cafy
    public String e() {
        return this.d;
    }

    @Override // defpackage.cafy
    public cqkl f() {
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
        return cqkl.a;
    }

    @Override // defpackage.cafv
    public cqtd g() {
        return this.f;
    }
}
