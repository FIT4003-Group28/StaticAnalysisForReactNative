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
/* renamed from: ayak  reason: default package */
/* loaded from: classes2.dex */
public final class ayak {
    private static final Logger a = Logger.getLogger(ayak.class.getName());
    private static ayak b;
    private static final Iterable c;
    private final LinkedHashSet d = new LinkedHashSet();
    private final LinkedHashMap e = new LinkedHashMap();

    static {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(Class.forName("aykj"));
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

    public static synchronized ayak b() {
        ayak ayakVar;
        synchronized (ayak.class) {
            if (b == null) {
                List<ayaj> p = azqc.p(ayaj.class, c, ayaj.class.getClassLoader(), new aybj(1));
                b = new ayak();
                for (ayaj ayajVar : p) {
                    Logger logger = a;
                    Level level = Level.FINE;
                    String valueOf = String.valueOf(ayajVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                    sb.append("Service loader found ");
                    sb.append(valueOf);
                    logger.logp(level, "io.grpc.LoadBalancerRegistry", "getDefaultRegistry", sb.toString());
                    ayajVar.d();
                    b.c(ayajVar);
                }
                b.d();
            }
            ayakVar = b;
        }
        return ayakVar;
    }

    private final synchronized void c(ayaj ayajVar) {
        ayajVar.d();
        aqxo.q(true, "isAvailable() returned false");
        this.d.add(ayajVar);
    }

    private final synchronized void d() {
        this.e.clear();
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ayaj ayajVar = (ayaj) it.next();
            String b2 = ayajVar.b();
            if (((ayaj) this.e.get(b2)) == null) {
                this.e.put(b2, ayajVar);
            } else {
                ayajVar.c();
            }
        }
    }

    public final synchronized ayaj a(String str) {
        return (ayaj) this.e.get(str);
    }
}
