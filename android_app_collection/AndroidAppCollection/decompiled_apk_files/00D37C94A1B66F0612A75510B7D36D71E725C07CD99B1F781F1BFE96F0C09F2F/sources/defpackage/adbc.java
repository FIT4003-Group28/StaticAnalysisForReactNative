package defpackage;

import java.net.MulticastSocket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: adbc  reason: default package */
/* loaded from: classes.dex */
final class adbc implements Runnable {
    final /* synthetic */ adbe a;
    private final List b;
    private final MulticastSocket c;

    public adbc(adbe adbeVar, List list, MulticastSocket multicastSocket) {
        this.a = adbeVar;
        this.b = list;
        this.c = multicastSocket;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = 9400;
        for (Future future : this.b) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                future.get(j, TimeUnit.MILLISECONDS);
                j = Math.max(0L, j - (System.currentTimeMillis() - currentTimeMillis));
            } catch (InterruptedException e) {
                e = e;
                zep.f(adbe.a, "Error waiting for reading device response task to complete", e);
            } catch (ExecutionException e2) {
                e = e2;
                zep.f(adbe.a, "Error waiting for reading device response task to complete", e);
            } catch (TimeoutException e3) {
                zep.f(adbe.a, "Timed out waiting for device response", e3);
                future.cancel(true);
            }
        }
        Iterator it = this.a.k.keySet().iterator();
        while (it.hasNext()) {
            if (!this.a.j.contains((String) it.next())) {
                it.remove();
            }
        }
        this.c.close();
        this.a.a();
        this.a.l = false;
    }
}
