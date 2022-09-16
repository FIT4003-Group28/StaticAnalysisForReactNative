package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bwn  reason: default package */
/* loaded from: classes.dex */
public final class bwn implements Runnable {
    final /* synthetic */ bwr a;
    private final chx b;

    public bwn(bwr bwrVar, chx chxVar) {
        this.a = bwrVar;
        this.b = chxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.h()) {
            synchronized (this.a) {
                if (this.a.a.a(this.b)) {
                    this.a.k.e();
                    bwr bwrVar = this.a;
                    try {
                        this.b.i(bwrVar.k, bwrVar.n);
                        this.a.e(this.b);
                    } catch (Throwable th) {
                        throw new bvo(th);
                    }
                }
                this.a.g();
            }
        }
    }
}
