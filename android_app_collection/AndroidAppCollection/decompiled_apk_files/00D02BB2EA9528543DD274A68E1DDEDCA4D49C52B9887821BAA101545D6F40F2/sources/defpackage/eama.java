package defpackage;

import java.util.concurrent.RejectedExecutionException;
/* compiled from: PG */
/* renamed from: eama  reason: default package */
/* loaded from: classes6.dex */
final class eama implements Runnable {
    final /* synthetic */ eamb a;

    public eama(eamb eambVar) {
        this.a = eambVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.c) {
            eamb eambVar = this.a;
            if (!eambVar.d) {
                Runnable pollFirst = eambVar.c.pollFirst();
                this.a.d = pollFirst != null;
                while (pollFirst != null) {
                    try {
                        pollFirst.run();
                        synchronized (this.a.c) {
                            pollFirst = this.a.c.pollFirst();
                            this.a.d = pollFirst != null;
                        }
                    } catch (Throwable th) {
                        synchronized (this.a.c) {
                            eamb eambVar2 = this.a;
                            eambVar2.d = false;
                            try {
                                eambVar2.a.execute(eambVar2.b);
                            } catch (RejectedExecutionException unused) {
                            }
                            throw th;
                        }
                    }
                }
            }
        }
    }
}
