package defpackage;
/* compiled from: PG */
/* renamed from: arww  reason: default package */
/* loaded from: classes2.dex */
final class arww implements Runnable {
    final /* synthetic */ arxa a;

    public arww(arxa arxaVar) {
        this.a = arxaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a) {
            if (this.a.V().booleanValue()) {
                return;
            }
            if (this.a.q == arwy.DISCONNECTED) {
                this.a.aj(arwy.CONNECTION_ERROR);
            } else if (!this.a.U().booleanValue()) {
                this.a.aj(arwy.NO_CONTENT_ERROR);
            }
        }
    }
}
