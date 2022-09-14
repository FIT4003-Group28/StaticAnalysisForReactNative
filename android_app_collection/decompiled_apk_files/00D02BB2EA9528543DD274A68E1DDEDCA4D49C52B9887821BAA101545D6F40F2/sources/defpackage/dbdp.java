package defpackage;
/* compiled from: PG */
/* renamed from: dbdp  reason: default package */
/* loaded from: classes5.dex */
public final class dbdp extends dbdr {
    private final dbeb b = dbeb.l();
    private final dbeb c = dbeb.m();
    private final dbdz d = new dbdz();

    public dbdp() {
    }

    public final void a(dbeb dbebVar) {
        dbjb.d(dbebVar, "Parameter \"center\" was null.");
        this.b.a(dbebVar);
        j();
    }

    public final dbeb b() {
        return new dbeb(this.b);
    }

    public final void c(dbeb dbebVar) {
        dbjb.d(dbebVar, "Parameter \"size\" was null.");
        this.c.a(dbebVar);
        j();
    }

    public final dbeb d() {
        return new dbeb(this.c);
    }

    public final dbeb e() {
        return d().f(0.5f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
        if ((r7 + r4.a) >= 0.0f) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c7, code lost:
        if ((r7 + r4.b) >= 0.0f) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0117, code lost:
        if ((r2 + r4.c) >= 0.0f) goto L35;
     */
    @Override // defpackage.dbdr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(defpackage.dbdu r17, defpackage.dbdv r18) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbdp.f(dbdu, dbdv):boolean");
    }

    @Override // defpackage.dbdr
    public final dbdr g(dbdx dbdxVar) {
        dbdp dbdpVar = new dbdp();
        h(dbdxVar, dbdpVar);
        return dbdpVar;
    }

    @Override // defpackage.dbdr
    public final void h(dbdx dbdxVar, dbdr dbdrVar) {
        if (!(dbdrVar instanceof dbdp)) {
            return;
        }
        if (dbdrVar == this) {
            throw new IllegalArgumentException("Box cannot transform itself.");
        }
        dbdp dbdpVar = (dbdp) dbdrVar;
        dbdz w = dbdxVar.w();
        dbdpVar.b.a(w.i(this.b));
        dbeb dbebVar = new dbeb();
        w.c(dbebVar);
        dbeb dbebVar2 = dbdpVar.c;
        dbeb dbebVar3 = this.c;
        dbebVar2.a = dbebVar3.a * dbebVar.a;
        dbebVar2.b = dbebVar3.b * dbebVar.b;
        dbebVar2.c = dbebVar3.c * dbebVar.c;
        w.e(dbebVar, dbdpVar.d);
        dbdz dbdzVar = this.d;
        dbdz dbdzVar2 = dbdpVar.d;
        dbdz.h(dbdzVar, dbdzVar2, dbdzVar2);
    }

    @Override // defpackage.dbdr
    public final /* bridge */ /* synthetic */ dbdr i() {
        return new dbdp(d(), b());
    }

    public dbdp(dbeb dbebVar, dbeb dbebVar2) {
        dbjb.d(dbebVar2, "Parameter \"center\" was null.");
        dbjb.d(dbebVar, "Parameter \"size\" was null.");
        a(dbebVar2);
        c(dbebVar);
    }
}
