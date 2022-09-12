package defpackage;

import java.lang.ref.Reference;
/* compiled from: PG */
/* renamed from: cqqa  reason: default package */
/* loaded from: classes.dex */
final class cqqa implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                Reference<? extends Object> remove = cqqe.a.remove();
                if (remove instanceof cqqd) {
                    cqqd cqqdVar = (cqqd) remove;
                    synchronized (cqqdVar.a) {
                        cqqdVar.a.remove(cqqdVar);
                    }
                }
            } catch (InterruptedException unused) {
                return;
            }
        }
    }
}
