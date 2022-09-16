package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: avbc  reason: default package */
/* loaded from: classes2.dex */
public final class avbc implements Runnable {
    final /* synthetic */ avbe a;
    private final long b;

    public avbc(avbe avbeVar, long j) {
        this.a = avbeVar;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dlrq b;
        this.a.b.a().h();
        avbe avbeVar = this.a;
        avol avolVar = avbeVar.a;
        try {
            b = (dlrq) dsqw.cq(dlrq.q, avolVar.c.q(avolVar.b, this.b));
        } catch (Exception e) {
            avolVar.a("getNextSteps", e);
            b = avol.b();
        }
        avbeVar.a(b);
    }
}
