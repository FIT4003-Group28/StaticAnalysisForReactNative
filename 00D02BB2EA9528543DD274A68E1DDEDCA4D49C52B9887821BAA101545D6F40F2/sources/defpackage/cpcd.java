package defpackage;
/* compiled from: PG */
/* renamed from: cpcd  reason: default package */
/* loaded from: classes.dex */
final class cpcd implements Runnable {
    final /* synthetic */ cpcq a;
    final /* synthetic */ cpce b;

    public cpcd(cpce cpceVar, cpcq cpcqVar) {
        this.b = cpceVar;
        this.a = cpcqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.a) {
            cpcf<TResult> cpcfVar = this.b.b;
            if (cpcfVar != 0) {
                cpcfVar.a(this.a);
            }
        }
    }
}
