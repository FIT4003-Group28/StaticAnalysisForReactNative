package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: annh  reason: default package */
/* loaded from: classes.dex */
public final class annh {
    private static final Logger b = Logger.getLogger(annh.class.getName());
    private static final ConcurrentMap c = new ConcurrentHashMap();
    private static final ConcurrentMap d = new ConcurrentHashMap();
    private static final ConcurrentMap e = new ConcurrentHashMap();
    private static final ConcurrentMap f = new ConcurrentHashMap();
    public static final ConcurrentMap a = new ConcurrentHashMap();
    private static final ConcurrentMap g = new ConcurrentHashMap();

    private annh() {
    }

    @Deprecated
    public static anmg a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("catalogueName must be non-null.");
        }
        anmg anmgVar = (anmg) f.get(str.toLowerCase(Locale.US));
        if (anmgVar != null) {
            return anmgVar;
        }
        String format = String.format("no catalogue found for %s. ", str);
        if (str.toLowerCase(Locale.US).startsWith("tinkaead")) {
            format = String.valueOf(format).concat("Maybe call AeadConfig.register().");
        }
        if (str.toLowerCase(Locale.US).startsWith("tinkdeterministicaead")) {
            format = String.valueOf(format).concat("Maybe call DeterministicAeadConfig.register().");
        } else if (str.toLowerCase(Locale.US).startsWith("tinkstreamingaead")) {
            format = String.valueOf(format).concat("Maybe call StreamingAeadConfig.register().");
        } else if (str.toLowerCase(Locale.US).startsWith("tinkhybriddecrypt") || str.toLowerCase(Locale.US).startsWith("tinkhybridencrypt")) {
            format = String.valueOf(format).concat("Maybe call HybridConfig.register().");
        } else if (str.toLowerCase(Locale.US).startsWith("tinkmac")) {
            format = String.valueOf(format).concat("Maybe call MacConfig.register().");
        } else if (str.toLowerCase(Locale.US).startsWith("tinkpublickeysign") || str.toLowerCase(Locale.US).startsWith("tinkpublickeyverify")) {
            format = String.valueOf(format).concat("Maybe call SignatureConfig.register().");
        } else if (str.toLowerCase(Locale.US).startsWith("tink")) {
            format = String.valueOf(format).concat("Maybe call TinkConfig.register().");
        }
        throw new GeneralSecurityException(format);
    }

    public static synchronized aoqu b(anrc anrcVar) {
        aoqu a2;
        synchronized (annh.class) {
            anmm k = k(anrcVar.b);
            if (((Boolean) e.get(anrcVar.b)).booleanValue()) {
                a2 = k.a(anrcVar.c);
            } else {
                String valueOf = String.valueOf(anrcVar.b);
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return a2;
    }

    public static Object c(anrb anrbVar, Class cls) {
        return o(anrbVar.b, anrbVar.c, cls);
    }

    public static Object d(String str, byte[] bArr, Class cls) {
        return o(str, aoob.x(bArr), cls);
    }

    public static Object e(String str, aoqu aoquVar, Class cls) {
        return r(str, cls).d(aoquVar);
    }

    public static synchronized Map f() {
        Map unmodifiableMap;
        synchronized (annh.class) {
            unmodifiableMap = Collections.unmodifiableMap(g);
        }
        return unmodifiableMap;
    }

    public static synchronized void g(anmz anmzVar) {
        synchronized (annh.class) {
            if (anmzVar != null) {
                Class b2 = anmzVar.b();
                ConcurrentMap concurrentMap = a;
                if (concurrentMap.containsKey(b2)) {
                    anmz anmzVar2 = (anmz) concurrentMap.get(b2);
                    if (!anmzVar.getClass().getName().equals(anmzVar2.getClass().getName())) {
                        Logger logger = b;
                        Level level = Level.WARNING;
                        String valueOf = String.valueOf(b2);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
                        sb.append("Attempted overwrite of a registered PrimitiveWrapper for type ");
                        sb.append(valueOf);
                        logger.logp(level, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", sb.toString());
                        throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", b2.getName(), anmzVar2.getClass().getName(), anmzVar.getClass().getName()));
                    }
                }
                concurrentMap.put(b2, anmzVar);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    public static synchronized void h(anrc anrcVar) {
        synchronized (annh.class) {
            anmm k = k(anrcVar.b);
            if (((Boolean) e.get(anrcVar.b)).booleanValue()) {
                k.f(anrcVar.c);
            } else {
                String valueOf = String.valueOf(anrcVar.b);
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
    }

    public static synchronized void i(anna annaVar, anmr anmrVar) {
        Class b2;
        synchronized (annh.class) {
            String d2 = annaVar.d();
            String d3 = anmrVar.d();
            p(d2, annaVar.getClass(), annaVar.a().c(), true);
            p(d3, anmrVar.getClass(), Collections.emptyMap(), false);
            if (!d2.equals(d3)) {
                int g2 = anmrVar.g();
                if (!anpf.e(annaVar.g())) {
                    String valueOf = String.valueOf(annaVar.getClass());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61);
                    sb.append("failed to register key manager ");
                    sb.append(valueOf);
                    sb.append(" as it is not FIPS compatible.");
                    throw new GeneralSecurityException(sb.toString());
                } else if (anpf.e(g2)) {
                    ConcurrentMap concurrentMap = c;
                    if (concurrentMap.containsKey(d2) && (b2 = ((anng) concurrentMap.get(d2)).b()) != null && !b2.getName().equals(anmrVar.getClass().getName())) {
                        Logger logger = b;
                        Level level = Level.WARNING;
                        StringBuilder sb2 = new StringBuilder(d2.length() + 96 + d3.length());
                        sb2.append("Attempted overwrite of a registered key manager for key type ");
                        sb2.append(d2);
                        sb2.append(" with inconsistent public key type ");
                        sb2.append(d3);
                        logger.logp(level, "com.google.crypto.tink.Registry", "registerAsymmetricKeyManagers", sb2.toString());
                        throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", annaVar.getClass().getName(), b2.getName(), anmrVar.getClass().getName()));
                    }
                    if (!concurrentMap.containsKey(d2) || ((anng) concurrentMap.get(d2)).b() == null) {
                        concurrentMap.put(d2, new annf(annaVar, anmrVar));
                        d.put(d2, s());
                        q(annaVar.d(), annaVar.a().c());
                    }
                    ConcurrentMap concurrentMap2 = e;
                    concurrentMap2.put(d2, true);
                    if (!concurrentMap.containsKey(d3)) {
                        concurrentMap.put(d3, m(anmrVar));
                    }
                    concurrentMap2.put(d3, false);
                } else {
                    String valueOf2 = String.valueOf(anmrVar.getClass());
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 61);
                    sb3.append("failed to register key manager ");
                    sb3.append(valueOf2);
                    sb3.append(" as it is not FIPS compatible.");
                    throw new GeneralSecurityException(sb3.toString());
                }
            } else {
                throw new GeneralSecurityException("Private and public key type must be different.");
            }
        }
    }

    public static synchronized void j(anmr anmrVar) {
        synchronized (annh.class) {
            String d2 = anmrVar.d();
            p(d2, anmrVar.getClass(), anmrVar.a().c(), true);
            if (anpf.e(anmrVar.g())) {
                ConcurrentMap concurrentMap = c;
                if (!concurrentMap.containsKey(d2)) {
                    concurrentMap.put(d2, m(anmrVar));
                    d.put(d2, s());
                    q(d2, anmrVar.a().c());
                }
                e.put(d2, true);
            } else {
                String valueOf = String.valueOf(anmrVar.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61);
                sb.append("failed to register key manager ");
                sb.append(valueOf);
                sb.append(" as it is not FIPS compatible.");
                throw new GeneralSecurityException(sb.toString());
            }
        }
    }

    public static anmm k(String str) {
        return n(str).e();
    }

    private static anng m(anmr anmrVar) {
        return new anne(anmrVar);
    }

    private static synchronized anng n(String str) {
        anng anngVar;
        synchronized (annh.class) {
            ConcurrentMap concurrentMap = c;
            if (!concurrentMap.containsKey(str)) {
                String valueOf = String.valueOf(str);
                throw new GeneralSecurityException(valueOf.length() != 0 ? "No key manager found for key type ".concat(valueOf) : new String("No key manager found for key type "));
            }
            anngVar = (anng) concurrentMap.get(str);
        }
        return anngVar;
    }

    private static Object o(String str, aoob aoobVar, Class cls) {
        return r(str, cls).c(aoobVar);
    }

    private static synchronized void p(String str, Class cls, Map map, boolean z) {
        synchronized (annh.class) {
            ConcurrentMap concurrentMap = c;
            anng anngVar = (anng) concurrentMap.get(str);
            if (anngVar != null && !anngVar.a().equals(cls)) {
                b.logp(Level.WARNING, "com.google.crypto.tink.Registry", "ensureKeyManagerInsertable", str.length() != 0 ? "Attempted overwrite of a registered key manager for key type ".concat(str) : new String("Attempted overwrite of a registered key manager for key type "));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, anngVar.a().getName(), cls.getName()));
            } else if (z) {
                ConcurrentMap concurrentMap2 = e;
                if (!concurrentMap2.containsKey(str) || ((Boolean) concurrentMap2.get(str)).booleanValue()) {
                    if (concurrentMap.containsKey(str)) {
                        for (Map.Entry entry : map.entrySet()) {
                            if (!g.containsKey(entry.getKey())) {
                                String str2 = (String) entry.getKey();
                                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 79 + str.length());
                                sb.append("Attempted to register a new key template ");
                                sb.append(str2);
                                sb.append(" from an existing key manager of type ");
                                sb.append(str);
                                throw new GeneralSecurityException(sb.toString());
                            }
                        }
                    } else {
                        for (Map.Entry entry2 : map.entrySet()) {
                            if (g.containsKey(entry2.getKey())) {
                                String valueOf = String.valueOf((String) entry2.getKey());
                                throw new GeneralSecurityException(valueOf.length() != 0 ? "Attempted overwrite of a registered key template ".concat(valueOf) : new String("Attempted overwrite of a registered key template "));
                            }
                        }
                    }
                } else {
                    throw new GeneralSecurityException(str.length() != 0 ? "New keys are already disallowed for key type ".concat(str) : new String("New keys are already disallowed for key type "));
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, aoqu] */
    private static void q(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            ConcurrentMap concurrentMap = g;
            String str2 = (String) entry.getKey();
            byte[] byteArray = ((anmo) entry.getValue()).a.toByteArray();
            int i = ((anmo) entry.getValue()).b;
            aopa createBuilder = anrc.a.createBuilder();
            createBuilder.copyOnWrite();
            ((anrc) createBuilder.instance).b = str;
            aoob x = aoob.x(byteArray);
            createBuilder.copyOnWrite();
            ((anrc) createBuilder.instance).c = x;
            int i2 = i - 1;
            int i3 = i2 != 0 ? i2 != 1 ? 5 : 4 : 3;
            createBuilder.copyOnWrite();
            ((anrc) createBuilder.instance).d = answ.g(i3);
            concurrentMap.put(str2, new anmn((anrc) createBuilder.mo39build()));
        }
    }

    private static anmm r(String str, Class cls) {
        anng n = n(str);
        if (n.c().contains(cls)) {
            return n.d(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(n.a());
        Set<Class> c2 = n.c();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class cls2 : c2) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        String sb2 = sb.toString();
        int length = String.valueOf(name).length();
        StringBuilder sb3 = new StringBuilder(length + 77 + String.valueOf(valueOf).length() + String.valueOf(sb2).length());
        sb3.append("Primitive type ");
        sb3.append(name);
        sb3.append(" not supported by key manager of type ");
        sb3.append(valueOf);
        sb3.append(", supported primitives: ");
        sb3.append(sb2);
        throw new GeneralSecurityException(sb3.toString());
    }

    private static anpf s() {
        return new anpf();
    }

    public static synchronized void l(anmm anmmVar, boolean z) {
        synchronized (annh.class) {
            if (anmmVar == null) {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            String e2 = anmmVar.e();
            p(e2, anmmVar.getClass(), Collections.emptyMap(), z);
            c.putIfAbsent(e2, new annd(anmmVar));
            e.put(e2, Boolean.valueOf(z));
        }
    }
}
