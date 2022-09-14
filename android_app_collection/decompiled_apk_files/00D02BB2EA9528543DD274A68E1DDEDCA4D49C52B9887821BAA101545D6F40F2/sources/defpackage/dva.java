package defpackage;
/* compiled from: PG */
/* renamed from: dva  reason: default package */
/* loaded from: classes6.dex */
public final class dva {
    public final dbdj a;

    public dva(dbdj dbdjVar) {
        this.a = dbdjVar;
    }

    public final void a() {
        this.a.start();
    }

    public final void b() {
        this.a.pause();
    }

    public final void c() {
        this.a.cancel();
    }

    public final void d(int i) {
        this.a.a.j(i);
    }

    public final int e() {
        return this.a.a.f();
    }

    public final boolean f() {
        return this.a.isStarted();
    }

    public final void g() {
        this.a.removeAllListeners();
    }
}
