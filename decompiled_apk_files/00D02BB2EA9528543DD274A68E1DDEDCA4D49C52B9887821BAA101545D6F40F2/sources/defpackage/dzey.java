package defpackage;

import java.util.ArrayList;
import java.util.concurrent.ScheduledThreadPoolExecutor;
/* compiled from: PG */
/* renamed from: dzey  reason: default package */
/* loaded from: classes6.dex */
final class dzey implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = new ArrayList(dzez.d.keySet());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) arrayList.get(i);
            if (scheduledThreadPoolExecutor.isShutdown()) {
                dzez.d.remove(scheduledThreadPoolExecutor);
            } else {
                scheduledThreadPoolExecutor.purge();
            }
        }
    }
}
