package defpackage;
/* compiled from: PG */
/* renamed from: eaft  reason: default package */
/* loaded from: classes6.dex */
public final class eaft {
    static {
        eajc.b("\"\\");
        eajc.b("\t ,=");
    }

    public static long a(eaep eaepVar) {
        String a = eaepVar.f.a("Content-Length");
        if (a != null) {
            try {
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }
        return Long.parseLong(a);
    }

    public static void b(eado eadoVar, eadz eadzVar, eadx eadxVar) {
        if (eadoVar == eado.a) {
            return;
        }
        eadm.a(eadzVar, eadxVar).isEmpty();
    }

    public static boolean c(eaep eaepVar) {
        if (!eaepVar.a.b.equals("HEAD")) {
            int i = eaepVar.c;
            return (((i >= 100 && i < 200) || i == 204 || i == 304) && a(eaepVar) == -1 && !"chunked".equalsIgnoreCase(eaepVar.a("Transfer-Encoding"))) ? false : true;
        }
        return false;
    }

    public static int d(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    public static int e(String str, int i) {
        char charAt;
        while (i < str.length() && ((charAt = str.charAt(i)) == ' ' || charAt == '\t')) {
            i++;
        }
        return i;
    }

    public static int f(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong >= 0) {
                return (int) parseLong;
            }
            return 0;
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}
