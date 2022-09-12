package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: dyhh  reason: default package */
/* loaded from: classes6.dex */
public final class dyhh {
    private static final Logger a = Logger.getLogger(dyhh.class.getName());
    private static dyhh b;
    private static final Iterable<Class<?>> c;
    private final LinkedHashSet<dyhf> d = new LinkedHashSet<>();
    private final LinkedHashMap<String, dyhf> e = new LinkedHashMap<>();

    static {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(Class.forName("dyte"));
        } catch (ClassNotFoundException e) {
            a.logp(Level.WARNING, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find pick-first LoadBalancer", (Throwable) e);
        }
        try {
            arrayList.add(Class.forName("io.grpc.util.SecretRoundRobinLoadBalancerProvider$Provider"));
        } catch (ClassNotFoundException e2) {
            a.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find round-robin LoadBalancer", (Throwable) e2);
        }
        c = Collections.unmodifiableList(arrayList);
    }

    public static synchronized dyhh a() {
        dyhh dyhhVar;
        synchronized (dyhh.class) {
            if (b == null) {
                List<dyhf> a2 = dyix.a(dyhf.class, c, dyhf.class.getClassLoader(), new dyhg());
                b = new dyhh();
                for (dyhf dyhfVar : a2) {
                    Logger logger = a;
                    Level level = Level.FINE;
                    String valueOf = String.valueOf(dyhfVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                    sb.append("Service loader found ");
                    sb.append(valueOf);
                    logger.logp(level, "io.grpc.LoadBalancerRegistry", "getDefaultRegistry", sb.toString());
                    if (dyhfVar.b()) {
                        b.c(dyhfVar);
                    }
                }
                b.d();
            }
            dyhhVar = b;
        }
        return dyhhVar;
    }

    private final synchronized void c(dyhf dyhfVar) {
        dbsk.b(dyhfVar.b(), "isAvailable() returned false");
        this.d.add(dyhfVar);
    }

    private final synchronized void d() {
        this.e.clear();
        Iterator<dyhf> it = this.d.iterator();
        while (it.hasNext()) {
            dyhf next = it.next();
            String d = next.d();
            dyhf dyhfVar = this.e.get(d);
            if (dyhfVar == null || dyhfVar.c() < next.c()) {
                this.e.put(d, next);
            }
        }
    }

    @dzsi
    public final synchronized dyhf b(String str) {
        return this.e.get(str);
    }
}
