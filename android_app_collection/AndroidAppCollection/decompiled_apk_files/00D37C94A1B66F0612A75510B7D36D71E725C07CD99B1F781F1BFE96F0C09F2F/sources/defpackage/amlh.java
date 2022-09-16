package defpackage;

import java.util.concurrent.RejectedExecutionException;
/* compiled from: PG */
/* renamed from: amlh  reason: default package */
/* loaded from: classes.dex */
final class amlh implements Runnable {
    final /* synthetic */ amlk a;

    public amlh(amlk amlkVar) {
        this.a = amlkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (!this.a.c.isShutdown()) {
            try {
                try {
                    amli amliVar = ((amlj) this.a.b.remove()).a;
                    int i = amli.b;
                    amliVar.o(null);
                } catch (RejectedExecutionException e) {
                    for (amlj amljVar : amlk.a.keySet()) {
                        amljVar.a.e(e);
                    }
                    return;
                }
            } catch (InterruptedException unused) {
                this.a.c.execute(this);
                return;
            } catch (Throwable th) {
                try {
                    this.a.c.execute(this);
                } catch (RejectedExecutionException e2) {
                    for (amlj amljVar2 : amlk.a.keySet()) {
                        amljVar2.a.e(e2);
                    }
                }
                throw th;
            }
        }
        try {
            this.a.c.execute(this);
        } catch (RejectedExecutionException e3) {
            for (amlj amljVar3 : amlk.a.keySet()) {
                amljVar3.a.e(e3);
            }
        }
    }
}
