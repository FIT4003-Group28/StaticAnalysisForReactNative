package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: avbb  reason: default package */
/* loaded from: classes2.dex */
public final class avbb implements Runnable {
    final /* synthetic */ avbe a;

    public avbb(avbe avbeVar) {
        this.a = avbeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dlrq b;
        this.a.b.a().e();
        avbe avbeVar = this.a;
        avol avolVar = avbeVar.a;
        try {
            b = (dlrq) dsqw.cq(dlrq.q, avolVar.c.o(avolVar.b));
        } catch (Exception e) {
            avolVar.a("process", e);
            b = avol.b();
        }
        avbeVar.a(b);
        this.a.b.a().f();
    }
}
