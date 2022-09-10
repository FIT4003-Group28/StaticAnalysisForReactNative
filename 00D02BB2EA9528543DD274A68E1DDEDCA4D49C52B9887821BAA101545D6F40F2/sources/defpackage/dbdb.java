package defpackage;
/* compiled from: PG */
/* renamed from: dbdb  reason: default package */
/* loaded from: classes5.dex */
public final class dbdb extends dbcm {
    static final dbeb a = new dbeb(0.7f, -1.0f, -0.8f);
    public float b = 0.0f;

    public dbdb() {
    }

    public dbdb(dbcs dbcsVar) {
        super.f(dbcsVar);
        dbep dbepVar = new dbep(-863292);
        dbeb e = a.e();
        dbeb p = dbeb.p();
        p = Math.abs(dbeb.i(e, p)) > 0.99f ? new dbeb(0.0f, 0.0f, 1.0f) : p;
        dbea e2 = dbea.e(dbeb.n(), e);
        q(dbea.c(dbea.e(dbea.b(e2, dbeb.p()), dbeb.j(dbeb.j(e, p), e)), e2));
        dbix.b();
        dbey dbeyVar = new dbey();
        dbeyVar.d = dbepVar;
        dbeyVar.a = true;
        dbez dbezVar = new dbez(dbeyVar);
        if (v() == dbezVar) {
            return;
        }
        dbfc dbfcVar = this.q;
        if (dbfcVar != null) {
            if (this.n) {
                dbfcVar.b();
            }
            this.q.c();
            this.q = null;
        }
        this.q = new dbfc(dbezVar, this);
        dbfc dbfcVar2 = this.q;
        if (dbfcVar2 != null) {
            if (!this.n) {
                return;
            }
            dbfcVar2.a(super.G());
            return;
        }
        throw new NullPointerException("light.createInstance() failed - which should not happen.");
    }
}
