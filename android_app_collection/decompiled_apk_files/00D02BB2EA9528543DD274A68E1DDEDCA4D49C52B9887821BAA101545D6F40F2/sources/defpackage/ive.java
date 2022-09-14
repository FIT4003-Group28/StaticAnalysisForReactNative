package defpackage;
/* compiled from: PG */
/* renamed from: ive  reason: default package */
/* loaded from: classes6.dex */
final class ive implements Runnable {
    final /* synthetic */ ivf a;

    public ive(ivf ivfVar) {
        this.a = ivfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.b.b()) {
            if (this.a.d() != 0) {
                ivf ivfVar = this.a;
                ivfVar.b(ivfVar.d());
                return;
            }
            this.a.a.b();
            ivf ivfVar2 = this.a;
            ivfVar2.b(ivfVar2.a.e());
        }
    }
}
