package defpackage;
/* compiled from: PG */
/* renamed from: cpcj  reason: default package */
/* loaded from: classes5.dex */
final class cpcj implements Runnable {
    final /* synthetic */ cpcq a;
    final /* synthetic */ cpck b;

    public cpcj(cpck cpckVar, cpcq cpcqVar) {
        this.b = cpckVar;
        this.a = cpcqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.a) {
            cpcl<? super TResult> cpclVar = this.b.b;
            if (cpclVar != 0) {
                cpclVar.c(this.a.d());
            }
        }
    }
}
