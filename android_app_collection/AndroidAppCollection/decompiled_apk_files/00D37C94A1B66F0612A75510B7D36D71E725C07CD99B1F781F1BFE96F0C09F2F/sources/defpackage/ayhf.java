package defpackage;

import io.grpc.Status;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: ayhf  reason: default package */
/* loaded from: classes2.dex */
public final class ayhf {
    public static final ayaq a;
    public static final ayaq b;
    public static final ayaq c;
    public static final ayaq d;
    public static final ayaq e;
    public static final ayaq f;
    public static final ayaq g;
    public static final ayaq h;
    public static final aybn i;
    public static final axyc j;
    public static final aymh k;
    public static final aymh l;
    public static final amqo m;
    private static final Logger n = Logger.getLogger(ayhf.class.getName());
    private static final azqj o;

    static {
        Charset.forName("US-ASCII");
        a = ayaq.c("grpc-timeout", new ayhe());
        b = ayaq.c("grpc-encoding", ayat.a);
        c = axzu.b("grpc-accept-encoding", new ayhh(1));
        d = ayaq.c("content-encoding", ayat.a);
        e = axzu.b("accept-encoding", new ayhh(1));
        f = ayaq.c("content-type", ayat.a);
        g = ayaq.c("te", ayat.a);
        h = ayaq.c("user-agent", ayat.a);
        amqf.b(',').e();
        TimeUnit.SECONDS.toNanos(20L);
        TimeUnit.HOURS.toNanos(2L);
        TimeUnit.SECONDS.toNanos(20L);
        i = new aykk();
        j = axyc.a("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
        o = new azqj();
        k = new ayhc();
        l = new ayhd();
        m = new izn(4);
    }

    private ayhf() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ayer b(ayac ayacVar, boolean z) {
        ayer ayerVar;
        ayag ayagVar = ayacVar.b;
        if (ayagVar != null) {
            aqxo.z(ayagVar.g, "Subchannel is not started");
            ayerVar = ayagVar.f.a();
        } else {
            ayerVar = null;
        }
        if (ayerVar == null) {
            if (!ayacVar.c.f()) {
                if (ayacVar.d) {
                    return new aygu(ayacVar.c, ayep.DROPPED);
                }
                if (!z) {
                    return new aygu(ayacVar.c, ayep.PROCESSED);
                }
            }
            return null;
        }
        return ayerVar;
    }

    public static String c(String str, int i2) {
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

    public static String d(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", new Class[0]).invoke(inetSocketAddress, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(aymm aymmVar) {
        while (true) {
            InputStream f2 = aymmVar.f();
            if (f2 != null) {
                f(f2);
            } else {
                return;
            }
        }
    }

    public static void f(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e2) {
            n.logp(Level.WARNING, "io.grpc.internal.GrpcUtil", "closeQuietly", "exception caught in closeQuietly", (Throwable) e2);
        }
    }

    public static boolean g(String str) {
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

    public static boolean h(axyd axydVar) {
        return !Boolean.TRUE.equals(axydVar.e(j));
    }

    public static String i(String str) {
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append(str);
            sb.append(' ');
        }
        sb.append("grpc-java-cronet/1.41.0-SNAPSHOT");
        return sb.toString();
    }

    public static ThreadFactory j(String str) {
        anlk anlkVar = new anlk();
        anlkVar.c(true);
        anlkVar.d(str);
        return anlk.b(anlkVar);
    }

    public static azqj[] k(axyd axydVar, ayat ayatVar, int i2, boolean z) {
        azqj aygxVar;
        List list = axydVar.d;
        int size = list.size() + 1;
        azqj[] azqjVarArr = new azqj[size];
        axyn axynVar = new axyn();
        axynVar.b(axydVar);
        axynVar.a = i2;
        axynVar.b = z;
        axyo a2 = axynVar.a();
        for (int i3 = 0; i3 < list.size(); i3++) {
            axym axymVar = (axym) list.get(i3);
            if (axymVar instanceof axym) {
                aygxVar = axymVar.a();
            } else {
                aygxVar = new aygx(axymVar, a2);
            }
            azqjVarArr[i3] = aygxVar;
        }
        azqjVarArr[size - 1] = o;
        return azqjVarArr;
    }

    public static Status a(int i2) {
        Status.Code code;
        if (i2 < 100 || i2 >= 200) {
            if (i2 != 400) {
                if (i2 == 401) {
                    code = Status.Code.UNAUTHENTICATED;
                } else if (i2 == 403) {
                    code = Status.Code.PERMISSION_DENIED;
                } else if (i2 != 404) {
                    if (i2 != 429) {
                        if (i2 != 431) {
                            switch (i2) {
                                case 502:
                                case 503:
                                case 504:
                                    break;
                                default:
                                    code = Status.Code.UNKNOWN;
                                    break;
                            }
                        }
                    }
                    code = Status.Code.UNAVAILABLE;
                } else {
                    code = Status.Code.UNIMPLEMENTED;
                }
            }
            code = Status.Code.INTERNAL;
        } else {
            code = Status.Code.INTERNAL;
        }
        Status b2 = code.b();
        StringBuilder sb = new StringBuilder(28);
        sb.append("HTTP status code ");
        sb.append(i2);
        return b2.withDescription(sb.toString());
    }
}
