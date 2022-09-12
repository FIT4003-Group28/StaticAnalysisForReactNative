package defpackage;
/* compiled from: PG */
/* renamed from: eafb  reason: default package */
/* loaded from: classes6.dex */
public final class eafb implements eaea {
    static boolean b(String str) {
        return !"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str);
    }

    static boolean c(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    private static eaep d(eaep eaepVar) {
        if (eaepVar == null || eaepVar.g == null) {
            return eaepVar;
        }
        eaeo b = eaepVar.b();
        b.g = null;
        return b.a();
    }

    @Override // defpackage.eaea
    public final eaep a(eafv eafvVar) {
        eafc eafcVar = new eafc(System.currentTimeMillis(), eafvVar.d, null);
        eafd eafdVar = new eafd(eafcVar.b, null);
        if (eafdVar.a != null && eafcVar.b.c().i) {
            eafdVar = new eafd(null, null);
        }
        eaem eaemVar = eafdVar.a;
        eaep eaepVar = eafdVar.b;
        if (eaemVar == null && eaepVar == null) {
            eaeo eaeoVar = new eaeo();
            eaeoVar.a = eafvVar.d;
            eaeoVar.b = eaeh.HTTP_1_1;
            eaeoVar.c = 504;
            eaeoVar.d = "Unsatisfiable Request (only-if-cached)";
            eaeoVar.g = eafa.c;
            eaeoVar.k = -1L;
            eaeoVar.l = System.currentTimeMillis();
            return eaeoVar.a();
        } else if (eaemVar != null) {
            eaep a = eafvVar.a(eaemVar);
            if (eaepVar != null) {
                if (a.c != 304) {
                    eafa.b(eaepVar.g);
                } else {
                    eaeo b = eaepVar.b();
                    eadx eadxVar = eaepVar.f;
                    eadx eadxVar2 = a.f;
                    eadw eadwVar = new eadw();
                    int b2 = eadxVar.b();
                    for (int i = 0; i < b2; i++) {
                        String c = eadxVar.c(i);
                        String d = eadxVar.d(i);
                        if ((!"Warning".equalsIgnoreCase(c) || !d.startsWith("1")) && (c(c) || !b(c) || eadxVar2.a(c) == null)) {
                            eadwVar.c(c, d);
                        }
                    }
                    int b3 = eadxVar2.b();
                    for (int i2 = 0; i2 < b3; i2++) {
                        String c2 = eadxVar2.c(i2);
                        if (!c(c2) && b(c2)) {
                            eadwVar.c(c2, eadxVar2.d(i2));
                        }
                    }
                    b.c(eadwVar.b());
                    b.k = a.k;
                    b.l = a.l;
                    b.b(d(eaepVar));
                    b.d(d(a));
                    b.a();
                    a.g.close();
                    throw null;
                }
            }
            eaeo b4 = a.b();
            b4.b(d(eaepVar));
            b4.d(d(a));
            return b4.a();
        } else {
            eaeo b5 = eaepVar.b();
            b5.b(d(eaepVar));
            return b5.a();
        }
    }
}
