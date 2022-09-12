package defpackage;

import java.io.Serializable;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
/* compiled from: PG */
/* renamed from: eaou  reason: default package */
/* loaded from: classes.dex */
public abstract class eaou implements Serializable {
    private static eavh a = null;
    public static final eaou b = new eavg("UTC", "UTC", 0, 0);
    public static Set<String> c = null;
    private static volatile eaou e = null;
    private static eatp f = null;
    private static Map<String, SoftReference<eaou>> g = null;
    private static Map<String, String> h = null;
    private static eavf i = null;
    private static final long serialVersionUID = 5546345482340108586L;
    public final String d;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x002d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            eavg r0 = new eavg
            java.lang.String r1 = "UTC"
            r2 = 0
            r0.<init>(r1, r1, r2, r2)
            defpackage.eaou.b = r0
            r0 = 0
            java.lang.String r2 = "org.joda.time.DateTimeZone.Provider"
            java.lang.String r2 = java.lang.System.getProperty(r2)     // Catch: java.lang.SecurityException -> L2a
            if (r2 == 0) goto L2a
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Exception -> L1e
            java.lang.Object r2 = r2.newInstance()     // Catch: java.lang.Exception -> L1e
            eavh r2 = (defpackage.eavh) r2     // Catch: java.lang.Exception -> L1e
            goto L2b
        L1e:
            r2 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch: java.lang.SecurityException -> L2a
            java.lang.ThreadGroup r4 = r3.getThreadGroup()     // Catch: java.lang.SecurityException -> L2a
            r4.uncaughtException(r3, r2)     // Catch: java.lang.SecurityException -> L2a
        L2a:
            r2 = r0
        L2b:
            if (r2 != 0) goto L40
            eavj r3 = new eavj     // Catch: java.lang.Exception -> L34
            r3.<init>()     // Catch: java.lang.Exception -> L34
            r2 = r3
            goto L40
        L34:
            r3 = move-exception
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.ThreadGroup r5 = r4.getThreadGroup()
            r5.uncaughtException(r4, r3)
        L40:
            if (r2 != 0) goto L47
            eavi r2 = new eavi
            r2.<init>()
        L47:
            java.util.Set r3 = r2.b()
            if (r3 == 0) goto La5
            int r4 = r3.size()
            if (r4 == 0) goto La5
            boolean r4 = r3.contains(r1)
            if (r4 == 0) goto L9d
            eaou r4 = defpackage.eaou.b
            eaou r1 = r2.a(r1)
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L95
            defpackage.eaou.a = r2
            defpackage.eaou.c = r3
            java.lang.String r1 = "org.joda.time.DateTimeZone.NameProvider"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch: java.lang.SecurityException -> L8a
            if (r1 == 0) goto L8b
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L7d
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.Exception -> L7d
            eavf r1 = (defpackage.eavf) r1     // Catch: java.lang.Exception -> L7d
            r0 = r1
            goto L8b
        L7d:
            r1 = move-exception
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.SecurityException -> L8a
            java.lang.ThreadGroup r3 = r2.getThreadGroup()     // Catch: java.lang.SecurityException -> L8a
            r3.uncaughtException(r2, r1)     // Catch: java.lang.SecurityException -> L8a
            goto L8b
        L8a:
        L8b:
            if (r0 != 0) goto L92
            eavf r0 = new eavf
            r0.<init>()
        L92:
            defpackage.eaou.i = r0
            return
        L95:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid UTC zone provided"
            r0.<init>(r1)
            throw r0
        L9d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The provider doesn't support UTC"
            r0.<init>(r1)
            throw r0
        La5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The provider doesn't have any available ids"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eaou.<clinit>():void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public eaou(String str) {
        if (str != null) {
            this.d = str;
            return;
        }
        throw new IllegalArgumentException("Id must not be null");
    }

    private static synchronized eaou g(String str, int i2) {
        eaou eaouVar;
        synchronized (eaou.class) {
            if (i2 == 0) {
                return b;
            }
            if (g == null) {
                g = new HashMap();
            }
            SoftReference<eaou> softReference = g.get(str);
            if (softReference != null && (eaouVar = softReference.get()) != null) {
                return eaouVar;
            }
            eavg eavgVar = new eavg(str, null, i2, i2);
            g.put(str, new SoftReference<>(eavgVar));
            return eavgVar;
        }
    }

    private static synchronized String h(String str) {
        String str2;
        synchronized (eaou.class) {
            Map map = h;
            if (map == null) {
                map = new HashMap();
                map.put("GMT", "UTC");
                map.put("WET", "WET");
                map.put("CET", "CET");
                map.put("MET", "CET");
                map.put("ECT", "CET");
                map.put("EET", "EET");
                map.put("MIT", "Pacific/Apia");
                map.put("HST", "Pacific/Honolulu");
                map.put("AST", "America/Anchorage");
                map.put("PST", "America/Los_Angeles");
                map.put("MST", "America/Denver");
                map.put("PNT", "America/Phoenix");
                map.put("CST", "America/Chicago");
                map.put("EST", "America/New_York");
                map.put("IET", "America/Indiana/Indianapolis");
                map.put("PRT", "America/Puerto_Rico");
                map.put("CNT", "America/St_Johns");
                map.put("AGT", "America/Argentina/Buenos_Aires");
                map.put("BET", "America/Sao_Paulo");
                map.put("ART", "Africa/Cairo");
                map.put("CAT", "Africa/Harare");
                map.put("EAT", "Africa/Addis_Ababa");
                map.put("NET", "Asia/Yerevan");
                map.put("PLT", "Asia/Karachi");
                map.put("IST", "Asia/Kolkata");
                map.put("BST", "Asia/Dhaka");
                map.put("VST", "Asia/Ho_Chi_Minh");
                map.put("CTT", "Asia/Shanghai");
                map.put("JST", "Asia/Tokyo");
                map.put("ACT", "Australia/Darwin");
                map.put("AET", "Australia/Sydney");
                map.put("SST", "Pacific/Guadalcanal");
                map.put("NST", "Pacific/Auckland");
                h = map;
            }
            str2 = (String) map.get(str);
        }
        return str2;
    }

    public static eaou i() {
        eaou eaouVar = e;
        if (eaouVar == null) {
            synchronized (eaou.class) {
                eaouVar = e;
                if (eaouVar == null) {
                    eaouVar = null;
                    try {
                        String property = System.getProperty("user.timezone");
                        if (property != null) {
                            eaouVar = j(property);
                        }
                    } catch (RuntimeException unused) {
                    }
                    if (eaouVar == null) {
                        try {
                            eaouVar = l(TimeZone.getDefault());
                        } catch (IllegalArgumentException unused2) {
                        }
                    }
                    if (eaouVar == null) {
                        eaouVar = b;
                    }
                    e = eaouVar;
                }
            }
        }
        return eaouVar;
    }

    public static eaou j(String str) {
        if (str == null) {
            return i();
        }
        if (str.equals("UTC")) {
            return b;
        }
        eaou a2 = a.a(str);
        if (a2 != null) {
            return a2;
        }
        if (str.startsWith("+") || str.startsWith("-")) {
            int w = w(str);
            return ((long) w) == 0 ? b : g(x(w), w);
        }
        StringBuilder sb = new StringBuilder(str.length() + 41);
        sb.append("The datetime zone id '");
        sb.append(str);
        sb.append("' is not recognised");
        throw new IllegalArgumentException(sb.toString());
    }

    public static eaou l(TimeZone timeZone) {
        if (timeZone == null) {
            return i();
        }
        String id = timeZone.getID();
        if (id.equals("UTC")) {
            return b;
        }
        String h2 = h(id);
        eaou a2 = h2 != null ? a.a(h2) : null;
        if (a2 == null) {
            a2 = a.a(id);
        }
        if (a2 != null) {
            return a2;
        }
        if (h2 == null) {
            String id2 = timeZone.getID();
            if (id2.startsWith("GMT+") || id2.startsWith("GMT-")) {
                int w = w(id2.substring(3));
                return ((long) w) == 0 ? b : g(x(w), w);
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(id).length() + 41);
        sb.append("The datetime zone id '");
        sb.append(id);
        sb.append("' is not recognised");
        throw new IllegalArgumentException(sb.toString());
    }

    private static int w(String str) {
        return -((int) y().b(new eaos()).i(str));
    }

    private static String x(int i2) {
        StringBuffer stringBuffer = new StringBuffer();
        if (i2 >= 0) {
            stringBuffer.append('+');
        } else {
            stringBuffer.append('-');
            i2 = -i2;
        }
        int i3 = i2 / 3600000;
        eauk.a(stringBuffer, i3, 2);
        int i4 = i2 - (i3 * 3600000);
        int i5 = i4 / 60000;
        stringBuffer.append(':');
        eauk.a(stringBuffer, i5, 2);
        int i6 = i4 - (i5 * 60000);
        if (i6 == 0) {
            return stringBuffer.toString();
        }
        int i7 = i6 / 1000;
        stringBuffer.append(':');
        eauk.a(stringBuffer, i7, 2);
        int i8 = i6 - (i7 * 1000);
        if (i8 == 0) {
            return stringBuffer.toString();
        }
        stringBuffer.append('.');
        eauk.a(stringBuffer, i8, 3);
        return stringBuffer.toString();
    }

    private static synchronized eatp y() {
        eatp eatpVar;
        synchronized (eaou.class) {
            if (f == null) {
                eaue eaueVar = new eaue();
                eaueVar.D(null, true, 4);
                f = eaueVar.a();
            }
            eatpVar = f;
        }
        return eatpVar;
    }

    public abstract String a(long j);

    public abstract int b(long j);

    public abstract int c(long j);

    public abstract boolean d();

    public abstract long e(long j);

    public abstract boolean equals(Object obj);

    public abstract long f(long j);

    public int hashCode() {
        return this.d.hashCode() + 57;
    }

    public final String m(long j, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String a2 = a(j);
        if (a2 == null) {
            return this.d;
        }
        eavf eavfVar = i;
        String str = null;
        if (eavfVar instanceof eavf) {
            String[] b2 = eavfVar.b(locale, this.d, o(j));
            if (b2 != null) {
                str = b2[0];
            }
        } else {
            String[] a3 = eavfVar.a(locale, this.d, a2);
            if (a3 != null) {
                str = a3[0];
            }
        }
        return str != null ? str : x(b(j));
    }

    public final String n(long j, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String a2 = a(j);
        if (a2 == null) {
            return this.d;
        }
        eavf eavfVar = i;
        String str = null;
        if (eavfVar instanceof eavf) {
            String[] b2 = eavfVar.b(locale, this.d, o(j));
            if (b2 != null) {
                str = b2[1];
            }
        } else {
            String[] a3 = eavfVar.a(locale, this.d, a2);
            if (a3 != null) {
                str = a3[1];
            }
        }
        return str != null ? str : x(b(j));
    }

    public final boolean o(long j) {
        return b(j) == c(j);
    }

    public int p(long j) {
        int b2 = b(j);
        long j2 = j - b2;
        int b3 = b(j2);
        if (b2 != b3) {
            if (b2 - b3 < 0 && e(j2) != e(j - b3)) {
                return b2;
            }
        } else if (b2 >= 0) {
            long f2 = f(j2);
            if (f2 < j2) {
                int b4 = b(f2);
                if (j2 - f2 <= b4 - b2) {
                    return b4;
                }
            }
        }
        return b3;
    }

    public final long q(long j) {
        long b2 = b(j);
        long j2 = j + b2;
        if ((j ^ j2) >= 0 || (j ^ b2) < 0) {
            return j2;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }

    public final long r(eaou eaouVar, long j) {
        if (eaouVar == null) {
            eaouVar = i();
        }
        return eaouVar == this ? j : eaouVar.u(q(j), j);
    }

    public TimeZone s() {
        return TimeZone.getTimeZone(this.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r4 != r6) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long t(long r12) {
        /*
            r11 = this;
            int r0 = r11.b(r12)
            long r1 = (long) r0
            long r1 = r12 - r1
            int r3 = r11.b(r1)
            if (r0 == r3) goto L2f
            if (r0 >= 0) goto L2f
            long r4 = r11.e(r1)
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r8 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r8 != 0) goto L1d
            r4 = r6
        L1d:
            long r1 = (long) r3
            long r1 = r12 - r1
            long r8 = r11.e(r1)
            int r10 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r10 != 0) goto L29
            goto L2a
        L29:
            r6 = r8
        L2a:
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L2f
            goto L30
        L2f:
            r0 = r3
        L30:
            long r0 = (long) r0
            long r2 = r12 - r0
            long r4 = r12 ^ r2
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L49
            long r12 = r12 ^ r0
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 < 0) goto L41
            goto L49
        L41:
            java.lang.ArithmeticException r12 = new java.lang.ArithmeticException
            java.lang.String r13 = "Subtracting time zone offset caused overflow"
            r12.<init>(r13)
            throw r12
        L49:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eaou.t(long):long");
    }

    public final String toString() {
        return this.d;
    }

    public final long u(long j, long j2) {
        int b2 = b(j2);
        long j3 = j - b2;
        return b(j3) == b2 ? j3 : t(j);
    }

    protected Object writeReplace() {
        return new eaot(this.d);
    }

    public static eaou k(int i2) {
        if (i2 < -86399999 || i2 > 86399999) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Millis out of range: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
        return g(x(i2), i2);
    }

    public static eaou v(int i2) {
        if (i2 != 0) {
            int i3 = i2 * 60;
            if (i3 < 0) {
                try {
                    i3 -= Math.abs(0);
                } catch (ArithmeticException unused) {
                    throw new IllegalArgumentException("Offset is too large");
                }
            }
            long j = i3 * 60000;
            if (j < -2147483648L || j > 2147483647L) {
                StringBuilder sb = new StringBuilder(58);
                sb.append("Multiplication overflows an int: ");
                sb.append(i3);
                sb.append(" * ");
                sb.append(60000);
                throw new ArithmeticException(sb.toString());
            }
            return k((int) j);
        }
        return b;
    }
}
