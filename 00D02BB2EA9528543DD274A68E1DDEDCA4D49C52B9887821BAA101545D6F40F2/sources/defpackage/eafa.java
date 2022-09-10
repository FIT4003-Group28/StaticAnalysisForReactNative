package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
/* compiled from: PG */
/* renamed from: eafa  reason: default package */
/* loaded from: classes6.dex */
public final class eafa {
    public static final byte[] a;
    public static final String[] b = new String[0];
    public static final eaer c;
    public static final Charset d;
    public static final TimeZone e;
    public static final Comparator<String> f;
    public static final Method g;
    private static final Pattern h;

    static {
        Method method;
        byte[] bArr = new byte[0];
        a = bArr;
        eaiz eaizVar = new eaiz();
        eaizVar.T(bArr);
        c = new eaeq(eaizVar);
        if (bArr == null) {
            throw new NullPointerException("content == null");
        }
        B(0L, 0L);
        eajc.m("efbbbf");
        eajc.m("feff");
        eajc.m("fffe");
        eajc.m("0000ffff");
        eajc.m("ffff0000");
        d = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        Charset.forName("UTF-32BE");
        Charset.forName("UTF-32LE");
        e = TimeZone.getTimeZone("GMT");
        f = new eaey();
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
            method = null;
        }
        g = method;
        h = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    public static void B(long j, long j2) {
        if (j2 < 0 || j < 0 || j < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static boolean C(eajy eajyVar, TimeUnit timeUnit) {
        try {
            return d(eajyVar, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static int D(Comparator<String> comparator, String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], "TLS_FALLBACK_SCSV") == 0) {
                return i;
            }
        }
        return -1;
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void c(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e2) {
                if (!l(e2)) {
                    throw e2;
                }
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    public static boolean d(eajy eajyVar, int i, TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        long n = eajyVar.b().s() ? eajyVar.b().n() - nanoTime : Long.MAX_VALUE;
        eajyVar.b().o(Math.min(n, timeUnit.toNanos(i)) + nanoTime);
        try {
            eaiz eaizVar = new eaiz();
            while (eajyVar.Te(eaizVar, 8192L) != -1) {
                eaizVar.z();
            }
            if (n == Long.MAX_VALUE) {
                eajyVar.b().q();
                return true;
            }
            eajyVar.b().o(nanoTime + n);
            return true;
        } catch (InterruptedIOException unused) {
            int i2 = (n > Long.MAX_VALUE ? 1 : (n == Long.MAX_VALUE ? 0 : -1));
            eaka b2 = eajyVar.b();
            if (i2 == 0) {
                b2.q();
                return false;
            }
            b2.o(nanoTime + n);
            return false;
        } catch (Throwable th) {
            if (n == Long.MAX_VALUE) {
                eajyVar.b().q();
            } else {
                eajyVar.b().o(nanoTime + n);
            }
            throw th;
        }
    }

    public static <T> List<T> e(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <K, V> Map<K, V> f(Map<K, V> map) {
        if (map.isEmpty()) {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static <T> List<T> g(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static ThreadFactory h(String str, boolean z) {
        return new eaez(str, z);
    }

    public static String[] i(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean j(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && (r1 = strArr.length) != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static String k(eadz eadzVar, boolean z) {
        String str;
        if (eadzVar.b.contains(":")) {
            str = "[" + eadzVar.b + "]";
        } else {
            str = eadzVar.b;
        }
        if (z || eadzVar.c != eadz.f(eadzVar.a)) {
            return str + ":" + eadzVar.c;
        }
        return str;
    }

    public static boolean l(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static String[] m(String[] strArr, String str) {
        int length = strArr.length;
        int i = length + 1;
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, length);
        strArr2[i - 1] = str;
        return strArr2;
    }

    public static int n(String str, int i, int i2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int o(String str, int i, int i2) {
        while (true) {
            i2--;
            if (i2 >= i) {
                char charAt = str.charAt(i2);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i2 + 1;
                }
            } else {
                return i;
            }
        }
    }

    public static String p(String str, int i, int i2) {
        int n = n(str, i, i2);
        return str.substring(n, o(str, n, i2));
    }

    public static int q(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int r(String str, int i, int i2, char c2) {
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int t(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127) {
                return i;
            }
        }
        return -1;
    }

    public static boolean u(String str) {
        return h.matcher(str).matches();
    }

    public static String v(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static AssertionError w(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    public static int x(char c2) {
        if (c2 < '0' || c2 > '9') {
            if (c2 >= 'a' && c2 <= 'f') {
                return c2 - 'W';
            }
            if (c2 >= 'A' && c2 <= 'F') {
                return c2 - '7';
            }
            return -1;
        }
        return c2 - '0';
    }

    public static X509TrustManager y() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1) {
                TrustManager trustManager = trustManagers[0];
                if (trustManager instanceof X509TrustManager) {
                    return (X509TrustManager) trustManager;
                }
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException e2) {
            throw w("No System TLS", e2);
        }
    }

    public static eadx z(List<eagj> list) {
        eadw eadwVar = new eadw();
        for (eagj eagjVar : list) {
            eadwVar.c(eagjVar.g.c(), eagjVar.h.c());
        }
        return eadwVar.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c7, code lost:
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009b  */
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.net.InetAddress E(java.lang.String r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eafa.E(java.lang.String, int, int):java.net.InetAddress");
    }

    public static int A(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0");
        } else if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        } else {
            long millis = timeUnit.toMillis(j);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException("timeout too large.");
            } else if (millis != 0 || j <= 0) {
                return (int) millis;
            } else {
                throw new IllegalArgumentException("timeout too small.");
            }
        }
    }

    public static String s(String str) {
        InetAddress E;
        int i = -1;
        int i2 = 0;
        if (!str.contains(":")) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (!lowerCase.isEmpty()) {
                    while (i2 < lowerCase.length()) {
                        char charAt = lowerCase.charAt(i2);
                        if (charAt > 31 && charAt < 127 && " #%/:?@[\\]".indexOf(charAt) == -1) {
                            i2++;
                        }
                        return null;
                    }
                    return lowerCase;
                }
            } catch (IllegalArgumentException unused) {
            }
            return null;
        }
        if (!str.startsWith("[") || !str.endsWith("]")) {
            E = E(str, 0, str.length());
        } else {
            E = E(str, 1, str.length() - 1);
        }
        if (E == null) {
            return null;
        }
        byte[] address = E.getAddress();
        if (address.length == 16) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < address.length) {
                int i5 = i3;
                while (i5 < 16 && address[i5] == 0 && address[i5 + 1] == 0) {
                    i5 += 2;
                }
                int i6 = i5 - i3;
                if (i6 > i4 && i6 >= 4) {
                    i = i3;
                    i4 = i6;
                }
                i3 = i5 + 2;
            }
            eaiz eaizVar = new eaiz();
            while (i2 < address.length) {
                if (i2 == i) {
                    eaizVar.M(58);
                    i2 += i4;
                    if (i2 == 16) {
                        eaizVar.M(58);
                    }
                } else {
                    if (i2 > 0) {
                        eaizVar.M(58);
                    }
                    eaizVar.U(((address[i2] & 255) << 8) | (address[i2 + 1] & 255));
                    i2 += 2;
                }
            }
            return eaizVar.p();
        }
        throw new AssertionError("Invalid IPv6 address: '" + str + "'");
    }
}
