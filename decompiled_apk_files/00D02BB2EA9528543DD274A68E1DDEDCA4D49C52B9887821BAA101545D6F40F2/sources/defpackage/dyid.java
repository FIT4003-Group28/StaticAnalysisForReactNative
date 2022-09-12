package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: dyid  reason: default package */
/* loaded from: classes6.dex */
public final class dyid {
    public final int a;
    public final dyit b;
    public final dyji c;
    public final dyij d;
    @dzsi
    public final Executor e;
    @dzsi
    private final ScheduledExecutorService f;
    @dzsi
    private final dyev g;

    public dyid(Integer num, dyit dyitVar, dyji dyjiVar, dyij dyijVar, @dzsi ScheduledExecutorService scheduledExecutorService, @dzsi dyev dyevVar, @dzsi Executor executor) {
        dbsk.t(num, "defaultPort not set");
        this.a = num.intValue();
        dbsk.t(dyitVar, "proxyDetector not set");
        this.b = dyitVar;
        dbsk.t(dyjiVar, "syncContext not set");
        this.c = dyjiVar;
        dbsk.t(dyijVar, "serviceConfigParser not set");
        this.d = dyijVar;
        this.f = scheduledExecutorService;
        this.g = dyevVar;
        this.e = executor;
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.f("defaultPort", this.a);
        b.b("proxyDetector", this.b);
        b.b("syncContext", this.c);
        b.b("serviceConfigParser", this.d);
        b.b("scheduledExecutorService", this.f);
        b.b("channelLogger", this.g);
        b.b("executor", this.e);
        return b.toString();
    }
}
