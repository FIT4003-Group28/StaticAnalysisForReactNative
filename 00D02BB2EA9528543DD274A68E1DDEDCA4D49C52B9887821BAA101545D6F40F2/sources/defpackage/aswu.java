package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aswu  reason: default package */
/* loaded from: classes2.dex */
public final class aswu implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ aswz b;

    public aswu(aswz aswzVar, Runnable runnable) {
        this.b = aswzVar;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.aD) {
            this.a.run();
        }
    }
}
