package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anv  reason: default package */
/* loaded from: classes.dex */
public final class anv implements Runnable {
    final /* synthetic */ ano a;
    final /* synthetic */ any b;

    public anv(any anyVar, ano anoVar) {
        this.b = anyVar;
        this.a = anoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        any anyVar = this.b;
        anyVar.e = this.a;
        anyVar.a();
    }
}
