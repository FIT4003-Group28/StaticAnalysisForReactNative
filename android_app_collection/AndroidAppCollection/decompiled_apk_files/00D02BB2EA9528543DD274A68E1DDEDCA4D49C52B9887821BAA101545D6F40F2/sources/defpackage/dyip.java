package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: dyip  reason: default package */
/* loaded from: classes6.dex */
public final class dyip {
    private static final Logger b = Logger.getLogger(dyip.class.getName());
    private static dyip c;
    public final dyif a = new dyin(this);
    private final LinkedHashSet<dyil> d = new LinkedHashSet<>();
    private List<dyil> e = Collections.emptyList();

    public static synchronized dyip a() {
        dyip dyipVar;
        synchronized (dyip.class) {
            if (c == null) {
                ArrayList arrayList = new ArrayList();
                try {
                    arrayList.add(Class.forName("dyoe"));
                } catch (ClassNotFoundException e) {
                    b.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find DNS NameResolver", (Throwable) e);
                }
                List<dyil> a = dyix.a(dyil.class, Collections.unmodifiableList(arrayList), dyil.class.getClassLoader(), new dyio());
                if (a.isEmpty()) {
                    b.logp(Level.WARNING, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                c = new dyip();
                for (dyil dyilVar : a) {
                    Logger logger = b;
                    Level level = Level.FINE;
                    String valueOf = String.valueOf(dyilVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                    sb.append("Service loader found ");
                    sb.append(valueOf);
                    logger.logp(level, "io.grpc.NameResolverRegistry", "getDefaultRegistry", sb.toString());
                    if (dyilVar.c()) {
                        c.c(dyilVar);
                    }
                }
                c.d();
            }
            dyipVar = c;
        }
        return dyipVar;
    }

    private final synchronized void c(dyil dyilVar) {
        dbsk.b(dyilVar.c(), "isAvailable() returned false");
        this.d.add(dyilVar);
    }

    private final synchronized void d() {
        ArrayList arrayList = new ArrayList(this.d);
        Collections.sort(arrayList, Collections.reverseOrder(new dyim()));
        this.e = Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized List<dyil> b() {
        return this.e;
    }
}
