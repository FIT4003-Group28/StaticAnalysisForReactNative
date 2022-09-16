package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: ayaz  reason: default package */
/* loaded from: classes2.dex */
public final class ayaz {
    public final int a;
    public final aybn b;
    public final aybx c;
    public final aybf d;
    public final Executor e;
    private final ScheduledExecutorService f;
    private final axyf g;

    public ayaz(Integer num, aybn aybnVar, aybx aybxVar, aybf aybfVar, ScheduledExecutorService scheduledExecutorService, axyf axyfVar, Executor executor) {
        num.getClass();
        this.a = num.intValue();
        aybnVar.getClass();
        this.b = aybnVar;
        aybxVar.getClass();
        this.c = aybxVar;
        aybfVar.getClass();
        this.d = aybfVar;
        this.f = scheduledExecutorService;
        this.g = axyfVar;
        this.e = executor;
    }

    public final String toString() {
        ampp c = akzj.c(this);
        c.e("defaultPort", this.a);
        c.b("proxyDetector", this.b);
        c.b("syncContext", this.c);
        c.b("serviceConfigParser", this.d);
        c.b("scheduledExecutorService", this.f);
        c.b("channelLogger", this.g);
        c.b("executor", this.e);
        return c.toString();
    }
}
