package defpackage;
/* compiled from: PG */
/* renamed from: bzym  reason: default package */
/* loaded from: classes4.dex */
public abstract class bzym implements bzyw, amfq {
    protected final boolean a;
    private final cqss b;
    @dzsi
    private final String c;

    public bzym(@dzsi String str, cqss cqssVar, boolean z, @dzsi String str2, amfi amfiVar) {
        this.c = str2;
        this.a = z;
        this.b = cqssVar;
    }

    @Override // defpackage.amfq
    public void a(amfu amfuVar) {
        amfuVar.j();
        cqkx.p(this);
    }

    @Override // defpackage.bzyw
    @dzsi
    public String b() {
        return this.c;
    }

    @Override // defpackage.bzyw
    public cqss c() {
        return this.a ? this.b : ibm.x();
    }

    @Override // defpackage.bzyw
    public cqss d() {
        return irg.a();
    }

    @Override // defpackage.bzyw
    public cqss e() {
        return irg.a();
    }

    @Override // defpackage.bzyw
    public Boolean f() {
        return false;
    }

    @Override // defpackage.bzyw
    @dzsi
    public cqss g() {
        return null;
    }

    @Override // defpackage.bzyw
    public Boolean h() {
        return true;
    }
}
