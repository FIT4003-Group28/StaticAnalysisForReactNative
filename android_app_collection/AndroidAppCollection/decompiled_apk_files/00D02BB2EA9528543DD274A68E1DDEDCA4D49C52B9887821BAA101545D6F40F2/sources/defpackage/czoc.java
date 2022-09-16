package defpackage;
/* compiled from: PG */
/* renamed from: czoc  reason: default package */
/* loaded from: classes.dex */
public final class czoc {
    final /* synthetic */ czod a;

    public czoc(czod czodVar) {
        this.a = czodVar;
    }

    public final void a() {
        czod.b();
        czod czodVar = this.a;
        acwq acwqVar = czodVar.j;
        if (acwqVar != null) {
            acwqVar.a.d = czodVar.c.a();
        }
    }

    public final void b() {
        synchronized (czod.b) {
            czod.b.get();
            czod.b.set(false);
        }
        czod czodVar = this.a;
        czodVar.i = System.currentTimeMillis();
        acwq acwqVar = czodVar.j;
        if (acwqVar != null) {
            czodVar.c.a();
            acwqVar.a.d = null;
        }
    }
}
