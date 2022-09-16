package defpackage;
/* compiled from: PG */
/* renamed from: dykd  reason: default package */
/* loaded from: classes6.dex */
final class dykd implements Runnable {
    final dykb a;
    final /* synthetic */ String b;
    final /* synthetic */ dyhw c;
    final /* synthetic */ dyib d;
    final /* synthetic */ dyvi e;
    final /* synthetic */ dyet f;
    final /* synthetic */ dyke g;

    public dykd(dyke dykeVar, String str, dyhw dyhwVar, dyib dyibVar, dyvi dyviVar, dyet dyetVar) {
        this.g = dykeVar;
        this.b = str;
        this.c = dyhwVar;
        this.d = dyibVar;
        this.e = dyviVar;
        this.f = dyetVar;
        this.a = new dykb(str, dykeVar.a, dykeVar.e, dyhwVar, dykeVar, this, dykeVar.c, dyibVar, dyviVar, dyetVar, dykeVar.f);
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.g.c) {
            dyke dykeVar = this.g;
            if (dykeVar.g) {
                this.a.p.h(dykeVar.h, true, new dyhw());
            } else if (dykeVar.i) {
                dykb dykbVar = this.a;
                dykeVar.d.add(dykbVar);
                dykbVar.p.h.q = dykeVar.j;
            } else {
                throw new AssertionError("Transport is not started");
            }
        }
    }
}
