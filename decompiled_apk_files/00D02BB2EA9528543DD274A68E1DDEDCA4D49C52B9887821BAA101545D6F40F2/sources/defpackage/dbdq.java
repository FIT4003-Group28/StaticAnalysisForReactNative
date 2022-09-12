package defpackage;
/* compiled from: PG */
/* renamed from: dbdq  reason: default package */
/* loaded from: classes5.dex */
public final class dbdq {
    public final dbdx a;
    public dbdr b;
    public dbdr c;
    public boolean d;
    public int e = 0;
    private dbds f;

    public dbdq(dbdx dbdxVar, dbdr dbdrVar) {
        this.a = dbdxVar;
        a(dbdrVar);
    }

    public final void a(dbdr dbdrVar) {
        this.b = dbdrVar;
        this.c = null;
    }

    public final void b(dbds dbdsVar) {
        dbds dbdsVar2 = this.f;
        if (dbdsVar2 != null) {
            dbdsVar2.a.remove(this);
        }
        this.f = dbdsVar;
        if (dbdsVar != null) {
            dbdsVar.a.add(this);
        }
    }
}
