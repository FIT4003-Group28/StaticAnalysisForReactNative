package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: arap  reason: default package */
/* loaded from: classes2.dex */
public final class arap implements Runnable {
    final /* synthetic */ amwd a;
    final /* synthetic */ araq b;

    public arap(araq araqVar, amwd amwdVar) {
        this.b = araqVar;
        this.a = amwdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aras arasVar = this.b.a;
        if (arasVar.f == null) {
            return;
        }
        arasVar.h(this.a);
    }
}
