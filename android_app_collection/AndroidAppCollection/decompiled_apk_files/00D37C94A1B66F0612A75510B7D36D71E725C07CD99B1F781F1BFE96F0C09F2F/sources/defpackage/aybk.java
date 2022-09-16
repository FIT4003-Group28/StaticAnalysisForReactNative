package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: aybk  reason: default package */
/* loaded from: classes2.dex */
public final class aybk {
    private static final Logger c = Logger.getLogger(aybk.class.getName());
    private static aybk d;
    public final aybb a = new aybi(this);
    public String b = "unknown";
    private final LinkedHashSet e = new LinkedHashSet();
    private amup f = amyc.b;

    public static synchronized aybk a() {
        aybk aybkVar;
        synchronized (aybk.class) {
            if (d == null) {
                ArrayList arrayList = new ArrayList();
                try {
                    arrayList.add(Class.forName("aygr"));
                } catch (ClassNotFoundException e) {
                    c.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find DNS NameResolver", (Throwable) e);
                }
                List<aybh> p = azqc.p(aybh.class, Collections.unmodifiableList(arrayList), aybh.class.getClassLoader(), new aybj());
                if (p.isEmpty()) {
                    c.logp(Level.WARNING, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                d = new aybk();
                for (aybh aybhVar : p) {
                    Logger logger = c;
                    Level level = Level.FINE;
                    String valueOf = String.valueOf(aybhVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                    sb.append("Service loader found ");
                    sb.append(valueOf);
                    logger.logp(level, "io.grpc.NameResolverRegistry", "getDefaultRegistry", sb.toString());
                    aybhVar.c();
                    d.c(aybhVar);
                }
                d.d();
            }
            aybkVar = d;
        }
        return aybkVar;
    }

    private final synchronized void c(aybh aybhVar) {
        aybhVar.c();
        aqxo.q(true, "isAvailable() returned false");
        this.e.add(aybhVar);
    }

    private final synchronized void d() {
        HashMap hashMap = new HashMap();
        Iterator it = this.e.iterator();
        String str = "unknown";
        char c2 = 0;
        while (it.hasNext()) {
            aybh aybhVar = (aybh) it.next();
            String b = aybhVar.b();
            if (((aybh) hashMap.get(b)) == null) {
                hashMap.put(b, aybhVar);
            } else {
                aybhVar.d();
            }
            aybhVar.d();
            if (c2 < 5) {
                aybhVar.d();
                str = aybhVar.b();
            }
            c2 = 5;
        }
        this.f = amup.j(hashMap);
        this.b = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized Map b() {
        return this.f;
    }
}
