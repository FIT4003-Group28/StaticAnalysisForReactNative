package defpackage;

import java.net.InetAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: dyod  reason: default package */
/* loaded from: classes6.dex */
public final class dyod extends dyik {
    public static final Logger a;
    public static final Set<String> b;
    static final boolean c;
    static final boolean d;
    protected static final boolean e;
    public static final dyoc f;
    private static final String s;
    private static final String t;
    private static final String u;
    private static String v;
    private final boolean A;
    private dyig B;
    final dyit g;
    public final Random h = new Random();
    protected volatile dynw i = dyny.a;
    public final AtomicReference<dyob> j = new AtomicReference<>();
    public final String k;
    public final int l;
    public final long m;
    public final dyji n;
    public final dbtp o;
    protected boolean p;
    public final dyij q;
    public boolean r;
    private final String w;
    private final dyvf<Executor> x;
    private boolean y;
    private Executor z;

    static {
        Logger logger = Logger.getLogger(dyod.class.getName());
        a = logger;
        b = Collections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        s = property;
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        t = property2;
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        u = property3;
        c = Boolean.parseBoolean(property);
        d = Boolean.parseBoolean(property2);
        e = Boolean.parseBoolean(property3);
        dyoc dyocVar = null;
        try {
            try {
                try {
                    dyoc dyocVar2 = (dyoc) Class.forName("io.grpc.internal.JndiResourceResolverFactory", true, dyod.class.getClassLoader()).asSubclass(dyoc.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                    if (dyocVar2.b() != null) {
                        logger.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "JndiResourceResolverFactory not available, skipping.", dyocVar2.b());
                    } else {
                        dyocVar = dyocVar2;
                    }
                } catch (Exception e2) {
                    a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e2);
                }
            } catch (Exception e3) {
                a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e3);
            }
        } catch (ClassCastException e4) {
            a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e4);
        } catch (ClassNotFoundException e5) {
            a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e5);
        }
        f = dyocVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public dyod(String str, dyid dyidVar, dyvf<Executor> dyvfVar, dbtp dbtpVar, boolean z) {
        dbsk.t(dyidVar, "args");
        this.x = dyvfVar;
        dbsk.t(str, "name");
        URI create = URI.create(str.length() != 0 ? "//".concat(str) : new String("//"));
        boolean z2 = true;
        dbsk.g(create.getHost() != null, "Invalid DNS name: %s", str);
        String authority = create.getAuthority();
        dbsk.w(authority, "nameUri (%s) doesn't have an authority", create);
        this.w = authority;
        this.k = create.getHost();
        if (create.getPort() == -1) {
            this.l = dyidVar.a;
        } else {
            this.l = create.getPort();
        }
        this.g = dyidVar.b;
        long j = 0;
        if (!z) {
            String property = System.getProperty("networkaddress.cache.ttl");
            long j2 = 30;
            if (property != null) {
                try {
                    j2 = Long.parseLong(property);
                } catch (NumberFormatException unused) {
                    a.logp(Level.WARNING, "io.grpc.internal.DnsNameResolver", "getNetworkAddressCacheTtlNanos", "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                }
            }
            j = j2 > 0 ? TimeUnit.SECONDS.toNanos(j2) : j2;
        }
        this.m = j;
        this.o = dbtpVar;
        this.n = dyidVar.c;
        Executor executor = dyidVar.e;
        this.z = executor;
        this.A = executor != null ? false : z2;
        this.q = dyidVar.d;
    }

    public static String e() {
        if (v == null) {
            try {
                v = InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException e2) {
                throw new RuntimeException(e2);
            }
        }
        return v;
    }

    private final void f() {
        if (this.r || this.y) {
            return;
        }
        if (this.p) {
            long j = this.m;
            if (j != 0 && (j <= 0 || this.o.d(TimeUnit.NANOSECONDS) <= this.m)) {
                return;
            }
        }
        this.r = true;
        this.z.execute(new dyoa(this, this.B));
    }

    @Override // defpackage.dyik
    public final String a() {
        return this.w;
    }

    @Override // defpackage.dyik
    public final void b(dyig dyigVar) {
        dbsk.m(this.B == null, "already started");
        if (this.A) {
            this.z = (Executor) dyvg.a(this.x);
        }
        this.B = dyigVar;
        f();
    }

    @Override // defpackage.dyik
    public final void c() {
        if (this.y) {
            return;
        }
        this.y = true;
        Executor executor = this.z;
        if (executor == null || !this.A) {
            return;
        }
        dyvg.e(this.x, executor);
        this.z = null;
    }

    @Override // defpackage.dyik
    public final void d() {
        dbsk.m(this.B != null, "not started");
        f();
    }
}
