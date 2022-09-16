package defpackage;
/* compiled from: PG */
/* renamed from: dcg  reason: default package */
/* loaded from: classes5.dex */
public final class dcg implements czx {
    private final dci a;
    private final gga b;
    private final czh c;
    private boolean e;
    @dzsi
    private czj g;
    private boolean d = false;
    private boolean f = false;

    public dcg(dci dciVar, gga ggaVar, czh czhVar) {
        this.a = dciVar;
        this.b = ggaVar;
        this.c = czhVar;
    }

    @Override // defpackage.czx
    public final czz a() {
        dci dciVar = this.a;
        gga ggaVar = this.b;
        boolean z = this.d;
        boolean z2 = this.e;
        czj czjVar = this.g;
        boolean z3 = this.f;
        czh czhVar = this.c;
        dbu a = dciVar.a.a();
        dci.a(a, 1);
        cjqy a2 = dciVar.b.a();
        dci.a(a2, 2);
        dkh a3 = dciVar.c.a();
        dci.a(a3, 3);
        dkn a4 = dciVar.d.a();
        dci.a(a4, 4);
        dol a5 = dciVar.e.a();
        dci.a(a5, 5);
        der a6 = dciVar.f.a();
        dci.a(a6, 6);
        djs a7 = dciVar.g.a();
        dci.a(a7, 7);
        dci.a(dciVar.h.a(), 8);
        dbh a8 = dciVar.i.a();
        dci.a(a8, 9);
        dci.a(ggaVar, 10);
        dci.a(czhVar, 16);
        return new dch(a, a2, a3, a4, a5, a6, a7, a8, ggaVar, z, z2, czjVar, z3, czhVar);
    }

    @Override // defpackage.czx
    public final void b(boolean z) {
        this.e = z;
    }

    @Override // defpackage.czx
    public final void c(boolean z) {
        this.d = z;
    }

    @Override // defpackage.czx
    public final void d(czj czjVar) {
        this.g = czjVar;
        this.f = true;
    }

    @Override // defpackage.czx
    public final void e(arjq arjqVar) {
    }
}
