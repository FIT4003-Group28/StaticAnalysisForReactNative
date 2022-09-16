package defpackage;
/* compiled from: PG */
/* renamed from: rot  reason: default package */
/* loaded from: classes4.dex */
final class rot implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ rpa b;
    private final /* synthetic */ int c;

    public rot(rpa rpaVar, long j) {
        this.b = rpaVar;
        this.a = j;
    }

    public rot(rpa rpaVar, long j, int i) {
        this.c = i;
        this.b = rpaVar;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            rpa rpaVar = this.b;
            long j = this.a;
            rpaVar.n();
            rpaVar.f();
            rpaVar.aG().k.b("Activity paused, time", Long.valueOf(j));
            row rowVar = rpaVar.e;
            rowVar.b.Q();
            rowVar.a = new rov(rowVar, System.currentTimeMillis(), j);
            rowVar.b.b.postDelayed(rowVar.a, 2000L);
            if (!rpaVar.J().r()) {
                return;
            }
            rpaVar.d.c();
            return;
        }
        rpa rpaVar2 = this.b;
        long j2 = this.a;
        rpaVar2.n();
        rpaVar2.f();
        rpaVar2.aG().k.b("Activity resumed, time", Long.valueOf(j2));
        if (rpaVar2.J().r() || rpaVar2.M().p.b()) {
            roy royVar = rpaVar2.d;
            royVar.d.n();
            royVar.c.a();
            royVar.a = j2;
            royVar.b = j2;
        }
        row rowVar2 = rpaVar2.e;
        rowVar2.b.n();
        rov rovVar = rowVar2.a;
        if (rovVar != null) {
            rowVar2.b.b.removeCallbacks(rovVar);
        }
        rowVar2.b.M().p.a(false);
        roz rozVar = rpaVar2.c;
        rozVar.a.n();
        if (!rozVar.a.w.w()) {
            return;
        }
        rozVar.a.Q();
        rozVar.b(System.currentTimeMillis(), false);
    }
}
