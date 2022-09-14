package defpackage;
/* compiled from: PG */
/* renamed from: bqyc  reason: default package */
/* loaded from: classes4.dex */
final class bqyc implements Runnable {
    final /* synthetic */ bqyd a;

    public bqyc(bqyd bqydVar) {
        this.a = bqydVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bqyn g;
        bqyf bqyfVar = this.a.a;
        synchronized (bqyfVar) {
            g = bqyfVar.g();
        }
        g.a();
    }
}
