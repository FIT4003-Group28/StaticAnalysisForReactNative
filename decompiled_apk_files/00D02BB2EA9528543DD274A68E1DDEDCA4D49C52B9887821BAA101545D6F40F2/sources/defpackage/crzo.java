package defpackage;
/* compiled from: PG */
/* renamed from: crzo  reason: default package */
/* loaded from: classes.dex */
public class crzo<V> {
    public final crzn<V> a;
    @dzsi
    private crzu<V> b;

    public crzo() {
        this.a = new crzn<>();
    }

    private final synchronized void c(V v) {
        crzu<V> crzuVar = this.b;
        if (crzuVar != null) {
            crzuVar.b(v);
            return;
        }
        crzu<V> crzuVar2 = new crzu<>(v);
        this.b = crzuVar2;
        this.a.m(crzuVar2);
    }

    public final void a(V v) {
        c(v);
        this.a.n();
    }

    public final synchronized void b(V v) {
        c(v);
        this.a.o();
    }

    public crzo(V v) {
        this.b = new crzu<>(v);
        this.a = new crzn<>(this.b);
    }
}
