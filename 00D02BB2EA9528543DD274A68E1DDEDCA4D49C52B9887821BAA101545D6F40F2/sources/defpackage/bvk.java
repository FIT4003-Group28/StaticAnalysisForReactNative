package defpackage;
/* compiled from: PG */
/* renamed from: bvk  reason: default package */
/* loaded from: classes.dex */
final class bvk implements Runnable {
    final /* synthetic */ bvn a;

    public bvk(bvn bvnVar) {
        this.a = bvnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bvn bvnVar = this.a;
        while (true) {
            boolean z = bvnVar.c;
            try {
                bvnVar.d((bvm) bvnVar.b.remove());
                bvl bvlVar = bvnVar.d;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
