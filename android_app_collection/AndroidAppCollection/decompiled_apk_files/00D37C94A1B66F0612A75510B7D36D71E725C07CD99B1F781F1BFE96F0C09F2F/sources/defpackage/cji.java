package defpackage;
/* compiled from: PG */
/* renamed from: cji  reason: default package */
/* loaded from: classes2.dex */
final class cji implements Runnable {
    final /* synthetic */ cjl a;

    public cji(cjl cjlVar) {
        this.a = cjlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cjl cjlVar = this.a;
        while (true) {
            boolean z = cjlVar.c;
            try {
                cjlVar.c((cjk) cjlVar.b.remove());
                cjj cjjVar = cjlVar.d;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
