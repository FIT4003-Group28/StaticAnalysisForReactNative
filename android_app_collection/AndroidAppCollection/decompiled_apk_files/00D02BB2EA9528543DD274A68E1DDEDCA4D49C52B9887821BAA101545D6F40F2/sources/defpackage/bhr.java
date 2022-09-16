package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
/* compiled from: PG */
/* renamed from: bhr  reason: default package */
/* loaded from: classes3.dex */
public final class bhr {
    public final ScheduledExecutorService a;
    public final Map<String, bhq> b;
    public final Map<String, bhp> c;
    public final Object d;
    private final ThreadFactory e;

    static {
        bbz.f("WorkTimer");
    }

    public bhr() {
        bho bhoVar = new bho();
        this.e = bhoVar;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new Object();
        this.a = Executors.newSingleThreadScheduledExecutor(bhoVar);
    }

    public final void a(String str) {
        synchronized (this.d) {
            if (this.b.remove(str) != null) {
                bbz.e().a(new Throwable[0]);
                this.c.remove(str);
            }
        }
    }
}
