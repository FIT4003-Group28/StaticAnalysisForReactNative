package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
/* compiled from: PG */
/* renamed from: bwa  reason: default package */
/* loaded from: classes2.dex */
public final class bwa {
    public final ScheduledExecutorService a;
    public final Map b;
    public final Map c;
    public final Object d;
    private final ThreadFactory e;

    static {
        bqf.b("WorkTimer");
    }

    public bwa() {
        bvx bvxVar = new bvx();
        this.e = bvxVar;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new Object();
        this.a = Executors.newSingleThreadScheduledExecutor(bvxVar);
    }

    public final void a(String str) {
        synchronized (this.d) {
            if (((bvz) this.b.remove(str)) != null) {
                bqf a = bqf.a();
                String.format("Stopping timer for %s", str);
                a.d(new Throwable[0]);
                this.c.remove(str);
            }
        }
    }
}
