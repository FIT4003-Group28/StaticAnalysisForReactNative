package defpackage;
/* compiled from: PG */
/* renamed from: bqye  reason: default package */
/* loaded from: classes4.dex */
final class bqye implements Runnable {
    final /* synthetic */ bqyf a;

    public bqye(bqyf bqyfVar) {
        this.a = bqyfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a) {
            bqyf bqyfVar = this.a;
            bqyfVar.j = false;
            bqyfVar.c.g();
        }
    }
}
