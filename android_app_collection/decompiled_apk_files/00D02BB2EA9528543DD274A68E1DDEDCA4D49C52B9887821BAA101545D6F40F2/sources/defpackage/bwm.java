package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bwm  reason: default package */
/* loaded from: classes4.dex */
public final class bwm implements Runnable {
    final /* synthetic */ bwr a;
    private final chx b;

    public bwm(bwr bwrVar, chx chxVar) {
        this.a = bwrVar;
        this.b = chxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.h()) {
            synchronized (this.a) {
                if (this.a.a.a(this.b)) {
                    bwr bwrVar = this.a;
                    try {
                        this.b.g(bwrVar.i);
                    } catch (Throwable th) {
                        throw new bvo(th);
                    }
                }
                this.a.g();
            }
        }
    }
}
