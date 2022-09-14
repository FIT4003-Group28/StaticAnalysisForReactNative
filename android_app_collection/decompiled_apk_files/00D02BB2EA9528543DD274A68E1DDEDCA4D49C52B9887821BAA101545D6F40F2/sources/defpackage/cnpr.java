package defpackage;
/* compiled from: PG */
/* renamed from: cnpr  reason: default package */
/* loaded from: classes5.dex */
final class cnpr implements Runnable {
    final /* synthetic */ cnpu a;

    public cnpr(cnpu cnpuVar) {
        this.a = cnpuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.g.lock();
        try {
            this.a.n();
        } finally {
            this.a.g.unlock();
        }
    }
}
