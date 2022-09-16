package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: bvu  reason: default package */
/* loaded from: classes2.dex */
final class bvu implements Runnable {
    final /* synthetic */ UUID a;
    final /* synthetic */ bpz b;
    final /* synthetic */ Context c;
    final /* synthetic */ bvv d;
    final /* synthetic */ bwk e;

    public bvu(bvv bvvVar, bwk bwkVar, UUID uuid, bpz bpzVar, Context context) {
        this.d = bvvVar;
        this.e = bwkVar;
        this.a = uuid;
        this.b = bpzVar;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!this.e.isCancelled()) {
                String uuid = this.a.toString();
                int h = this.d.b.h(uuid);
                if (h == 0 || adz.e(h)) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                btk btkVar = this.d.a;
                bpz bpzVar = this.b;
                synchronized (((bqy) btkVar).g) {
                    bqf.a();
                    String.format("Moving WorkSpec (%s) to the foreground", uuid);
                    bqf.f(new Throwable[0]);
                    bru bruVar = (bru) ((bqy) btkVar).e.remove(uuid);
                    if (bruVar != null) {
                        if (((bqy) btkVar).b == null) {
                            ((bqy) btkVar).b = bvq.a(((bqy) btkVar).c, "ProcessorForegroundLck");
                            ((bqy) btkVar).b.acquire();
                        }
                        ((bqy) btkVar).d.put(uuid, bruVar);
                        Intent c = btn.c(((bqy) btkVar).c, uuid, bpzVar);
                        Context context = ((bqy) btkVar).c;
                        if (Build.VERSION.SDK_INT >= 26) {
                            aki.a(context, c);
                        } else {
                            context.startService(c);
                        }
                    }
                }
                this.c.startService(btn.b(this.c, uuid, this.b));
            }
            this.e.e(null);
        } catch (Throwable th) {
            this.e.f(th);
        }
    }
}
