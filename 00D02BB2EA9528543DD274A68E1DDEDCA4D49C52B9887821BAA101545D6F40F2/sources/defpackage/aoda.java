package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aoda  reason: default package */
/* loaded from: classes2.dex */
public final class aoda implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ aodc b;

    public aoda(aodc aodcVar, Runnable runnable) {
        this.b = aodcVar;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aodc aodcVar = this.b;
        aodcVar.b.h(aodcVar.a.d());
        this.a.run();
    }
}
