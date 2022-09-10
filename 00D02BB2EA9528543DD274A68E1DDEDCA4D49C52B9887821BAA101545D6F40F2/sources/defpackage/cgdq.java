package defpackage;
/* compiled from: PG */
/* renamed from: cgdq  reason: default package */
/* loaded from: classes4.dex */
final class cgdq implements Runnable {
    final /* synthetic */ cgdv a;
    private final araj b;
    private akra c;

    public cgdq(cgdv cgdvVar, araj arajVar) {
        this.a = cgdvVar;
        this.b = arajVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        akra g = this.a.bj.a.a().g();
        akra akraVar = this.c;
        if (akraVar == null) {
            this.c = g;
        } else if (akraVar.y(g) <= 100.0f || this.b.m().i() != amwd.TRACKING) {
        } else {
            this.a.bA();
            this.c = g;
        }
    }
}
