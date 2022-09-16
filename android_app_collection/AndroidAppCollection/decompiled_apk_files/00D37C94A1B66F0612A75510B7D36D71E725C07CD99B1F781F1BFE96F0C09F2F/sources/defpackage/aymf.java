package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aymf  reason: default package */
/* loaded from: classes2.dex */
public final class aymf implements Runnable {
    final /* synthetic */ aymg a;
    final /* synthetic */ aymh b;
    final /* synthetic */ Object c;
    final /* synthetic */ aymi d;

    public aymf(aymi aymiVar, aymg aymgVar, aymh aymhVar, Object obj) {
        this.d = aymiVar;
        this.a = aymgVar;
        this.b = aymhVar;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.d) {
            if (this.a.b == 0) {
                this.b.b(this.c);
                this.d.a.remove(this.b);
                if (this.d.a.isEmpty()) {
                    this.d.b.shutdown();
                    this.d.b = null;
                }
            }
        }
    }
}
