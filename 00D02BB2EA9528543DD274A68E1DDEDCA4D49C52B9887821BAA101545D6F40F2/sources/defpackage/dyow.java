package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: dyow  reason: default package */
/* loaded from: classes6.dex */
public final class dyow {
    public static final dyhs<Long> a;
    public static final dyhs<String> b;
    public static final dyhs<byte[]> c;
    public static final dyhs<String> d;
    public static final dyhs<byte[]> e;
    public static final dyhs<String> f;
    public static final dyhs<String> g;
    public static final dyhs<String> h;
    public static final long i;
    public static final dyit j;
    public static final dyes<Boolean> k;
    public static final dyvf<Executor> l;
    public static final dyvf<ScheduledExecutorService> m;
    public static final dbty<dbtp> n;
    private static final Logger o = Logger.getLogger(dyow.class.getName());

    static {
        Charset.forName("US-ASCII");
        a = dyhs.d("grpc-timeout", new dyov());
        b = dyhs.d("grpc-encoding", dyhw.b);
        c = dygq.a("grpc-accept-encoding", new dyot());
        d = dyhs.d("content-encoding", dyhw.b);
        e = dygq.a("accept-encoding", new dyot());
        f = dyhs.d("content-type", dyhw.b);
        g = dyhs.d("te", dyhw.b);
        h = dyhs.d("user-agent", dyhw.b);
        dbtm.a(',').f();
        i = TimeUnit.SECONDS.toNanos(20L);
        TimeUnit.HOURS.toNanos(2L);
        TimeUnit.SECONDS.toNanos(20L);
        j = new dyti();
        k = dyes.a("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
        l = new dyoq();
        m = new dyor();
        n = new dyos();
    }

    private dyow() {
    }

    public static boolean a(dyet dyetVar) {
        return !Boolean.TRUE.equals(dyetVar.e(k));
    }

    public static boolean c(String str) {
        char charAt;
        if (str != null && str.length() >= 16) {
            String lowerCase = str.toLowerCase();
            if (!lowerCase.startsWith("application/grpc")) {
                return false;
            }
            return lowerCase.length() == 16 || (charAt = lowerCase.charAt(16)) == '+' || charAt == ';';
        }
        return false;
    }

    public static String d(String str, @dzsi String str2) {
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            sb.append(str2);
            sb.append(' ');
        }
        sb.append("grpc-java-");
        sb.append(str);
        sb.append('/');
        sb.append("1.34.0-SNAPSHOT");
        return sb.toString();
    }

    public static URI e(String str) {
        dbsk.t(str, "authority");
        try {
            return new URI(null, str, null, null, null);
        } catch (URISyntaxException e2) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Invalid authority: ".concat(valueOf) : new String("Invalid authority: "), e2);
        }
    }

    public static String f(String str, int i2) {
        try {
            return new URI(null, null, str, i2, null, null, null).getAuthority();
        } catch (URISyntaxException e2) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
            sb.append("Invalid host or port: ");
            sb.append(str);
            sb.append(" ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString(), e2);
        }
    }

    public static String g(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", new Class[0]).invoke(inetSocketAddress, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public static dylv h(dygy dygyVar, boolean z) {
        dyhc dyhcVar = dygyVar.b;
        dylv a2 = dyhcVar != null ? ((dyvp) dyhcVar.d()).a() : null;
        if (a2 == null) {
            if (!dygyVar.c.i()) {
                if (dygyVar.d) {
                    return new dyoi(dygyVar.c, dylt.DROPPED);
                }
                if (!z) {
                    return new dyoi(dygyVar.c, dylt.PROCESSED);
                }
            }
            return null;
        }
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(dyvk dyvkVar) {
        while (true) {
            InputStream o2 = dyvkVar.o();
            if (o2 != null) {
                j(o2);
            } else {
                return;
            }
        }
    }

    public static void j(@dzsi Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e2) {
            o.logp(Level.WARNING, "io.grpc.internal.GrpcUtil", "closeQuietly", "exception caught in closeQuietly", (Throwable) e2);
        }
    }

    public static ThreadFactory k(String str) {
        deip deipVar = new deip();
        deipVar.b(true);
        deipVar.a = str;
        return deip.a(deipVar);
    }

    public static dyjb b(int i2) {
        dyiy dyiyVar;
        if (i2 < 100 || i2 >= 200) {
            if (i2 != 400) {
                if (i2 == 401) {
                    dyiyVar = dyiy.UNAUTHENTICATED;
                } else if (i2 == 403) {
                    dyiyVar = dyiy.PERMISSION_DENIED;
                } else if (i2 != 404) {
                    if (i2 != 429) {
                        if (i2 != 431) {
                            switch (i2) {
                                case 502:
                                case 503:
                                case 504:
                                    break;
                                default:
                                    dyiyVar = dyiy.UNKNOWN;
                                    break;
                            }
                        }
                    }
                    dyiyVar = dyiy.UNAVAILABLE;
                } else {
                    dyiyVar = dyiy.UNIMPLEMENTED;
                }
            }
            dyiyVar = dyiy.INTERNAL;
        } else {
            dyiyVar = dyiy.INTERNAL;
        }
        dyjb b2 = dyiyVar.b();
        StringBuilder sb = new StringBuilder(28);
        sb.append("HTTP status code ");
        sb.append(i2);
        return b2.g(sb.toString());
    }
}
