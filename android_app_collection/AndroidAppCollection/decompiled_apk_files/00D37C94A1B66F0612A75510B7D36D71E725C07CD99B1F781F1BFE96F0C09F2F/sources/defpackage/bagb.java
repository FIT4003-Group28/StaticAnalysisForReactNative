package defpackage;

import java.util.concurrent.RejectedExecutionException;
/* compiled from: PG */
/* renamed from: bagb  reason: default package */
/* loaded from: classes2.dex */
final class bagb implements Runnable {
    final /* synthetic */ bagc a;

    public bagb(bagc bagcVar) {
        this.a = bagcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.c) {
            bagc bagcVar = this.a;
            if (!bagcVar.d) {
                Runnable runnable = (Runnable) bagcVar.c.pollFirst();
                this.a.d = runnable != null;
                while (runnable != null) {
                    try {
                        runnable.run();
                        synchronized (this.a.c) {
                            runnable = (Runnable) this.a.c.pollFirst();
                            this.a.d = runnable != null;
                        }
                    } catch (Throwable th) {
                        synchronized (this.a.c) {
                            bagc bagcVar2 = this.a;
                            bagcVar2.d = false;
                            try {
                                bagcVar2.a.execute(bagcVar2.b);
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
