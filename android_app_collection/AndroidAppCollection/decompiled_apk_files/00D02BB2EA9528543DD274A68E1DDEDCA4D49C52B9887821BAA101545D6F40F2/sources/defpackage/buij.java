package defpackage;
/* compiled from: PG */
/* renamed from: buij  reason: default package */
/* loaded from: classes4.dex */
final class buij implements Runnable {
    final /* synthetic */ buil a;

    public buij(buil builVar) {
        this.a = builVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            buil builVar = this.a;
            this.a.a.j(builVar.b.a(builVar.c));
            buip buipVar = this.a.d;
            byte[] globalMetricsDeltas = buipVar.b.getGlobalMetricsDeltas();
            if (globalMetricsDeltas == null || globalMetricsDeltas.length <= 0) {
                return;
            }
            buipVar.g.m(globalMetricsDeltas, buipVar.c.n);
        } catch (Exception e) {
            int i = buip.m;
            this.a.a.k(e);
        }
    }
}
