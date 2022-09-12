package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aodb  reason: default package */
/* loaded from: classes2.dex */
public final class aodb implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ aodc b;

    public aodb(aodc aodcVar, Runnable runnable) {
        this.b = aodcVar;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aodc aodcVar = this.b;
        aodcVar.a.i(aodcVar.b.d());
        this.a.run();
    }
}
