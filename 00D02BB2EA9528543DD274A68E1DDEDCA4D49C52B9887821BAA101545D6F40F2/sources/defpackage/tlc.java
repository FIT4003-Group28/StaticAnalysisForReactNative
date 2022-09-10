package defpackage;
/* compiled from: PG */
/* renamed from: tlc  reason: default package */
/* loaded from: classes7.dex */
final class tlc {
    private boolean a = false;
    private dbsg<tmd> b = dbpy.a;
    private final crzo<dbsg<tmd>> c = new crzo<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized dbsg<tmd> a() {
        return this.a ? dbpy.a : this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized crzm<dbsg<tmd>> b() {
        return this.c.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean c() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d(dbsg<tmd> dbsgVar) {
        this.b = dbsgVar;
        this.a = false;
        this.c.b(a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e(dbsg<tmd> dbsgVar) {
        this.b = dbsgVar;
        this.c.b(a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f(tld tldVar) {
        if (!this.b.a()) {
            return;
        }
        dbsg<tmd> a = tldVar.a(this.b.b());
        if (!a.a()) {
            return;
        }
        d(a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void g(boolean z) {
        if (this.a == z) {
            return;
        }
        this.a = z;
        this.c.b(a());
    }
}
