package defpackage;
/* compiled from: PG */
/* renamed from: crzn  reason: default package */
/* loaded from: classes.dex */
public class crzn<V> extends crzg<V> implements crzm<V> {
    private V a;
    private dbty<V> b;
    private deig<V> c = deig.d();

    public crzn() {
    }

    @Override // defpackage.crzm
    public final synchronized dehn<V> j() {
        if (this.c.isDone()) {
            deig<V> d = deig.d();
            this.c = d;
            d.j(this.b.a());
        }
        return deha.o(this.c);
    }

    @Override // defpackage.crzm
    public final synchronized boolean k() {
        return this.c.isDone();
    }

    @Override // defpackage.crzm
    @dzsi
    public final synchronized V l() {
        dbty<V> dbtyVar = this.b;
        if (dbtyVar == null) {
            return null;
        }
        return dbtyVar.a();
    }

    public final synchronized void m(dbty<V> dbtyVar) {
        this.b = dbtyVar;
        this.c.j(dbtyVar.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n() {
        synchronized (this) {
            dbsk.l(this.b != null);
            this.a = this.b.a();
        }
        g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
        if (r1.equals(r0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0024, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o() {
        /*
            r2 = this;
            monitor-enter(r2)
            dbty<V> r0 = r2.b     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            defpackage.dbsk.l(r0)     // Catch: java.lang.Throwable -> L2c
            V r0 = r2.a     // Catch: java.lang.Throwable -> L2c
            dbty<V> r1 = r2.b     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r1 = r1.a()     // Catch: java.lang.Throwable -> L2c
            if (r0 != 0) goto L1a
            if (r1 == 0) goto L18
            goto L1a
        L18:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2c
            return
        L1a:
            if (r1 == 0) goto L25
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L2c
            if (r0 != 0) goto L23
            goto L25
        L23:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2c
            return
        L25:
            r2.a = r1     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2c
            r2.g()
            return
        L2c:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crzn.o():void");
    }

    public crzn(dbty<V> dbtyVar) {
        this.b = dbtyVar;
        V a = dbtyVar.a();
        this.a = a;
        this.c.j(a);
    }
}
