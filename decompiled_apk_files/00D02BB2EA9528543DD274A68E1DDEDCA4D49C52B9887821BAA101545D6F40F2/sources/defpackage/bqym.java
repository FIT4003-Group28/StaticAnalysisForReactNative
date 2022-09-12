package defpackage;
/* compiled from: PG */
/* renamed from: bqym  reason: default package */
/* loaded from: classes4.dex */
final class bqym implements Runnable {
    final /* synthetic */ bqyn a;

    public bqym(bqyn bqynVar) {
        this.a = bqynVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a) {
            bqyn bqynVar = this.a;
            if (bqynVar.c) {
                bqynVar.b();
            }
        }
    }
}
