package defpackage;
/* compiled from: PG */
/* renamed from: bvl  reason: default package */
/* loaded from: classes2.dex */
final class bvl implements Runnable {
    final bvm a;
    final Runnable b;

    public bvl(bvm bvmVar, Runnable runnable) {
        this.a = bvmVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.run();
        } finally {
            this.a.a();
        }
    }
}
