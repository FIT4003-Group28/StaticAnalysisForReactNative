package defpackage;
/* compiled from: PG */
/* renamed from: dyqn  reason: default package */
/* loaded from: classes6.dex */
final class dyqn extends dyhd {
    final /* synthetic */ Throwable a;
    private final dygy b;

    public dyqn(Throwable th) {
        this.a = th;
        this.b = dygy.c(dyjb.l.g("Panic! This is a bug!").f(th));
    }

    @Override // defpackage.dyhd
    public final dygy a() {
        return this.b;
    }

    public final String toString() {
        dbsb c = dbsc.c(dyqn.class);
        c.b("panicPickResult", this.b);
        return c.toString();
    }
}
