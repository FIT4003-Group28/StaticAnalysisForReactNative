package defpackage;

import java.net.ProtocolException;
/* compiled from: PG */
/* renamed from: eafp  reason: default package */
/* loaded from: classes6.dex */
public final class eafp implements eaea {
    @Override // defpackage.eaea
    public final eaep a(eafv eafvVar) {
        eafq eafqVar = eafvVar.b;
        eafm eafmVar = eafvVar.a;
        eafg eafgVar = eafvVar.c;
        eaem eaemVar = eafvVar.d;
        long currentTimeMillis = System.currentTimeMillis();
        eafqVar.b(eaemVar);
        eaeo eaeoVar = null;
        if (eafu.a(eaemVar.b) && eaemVar.d != null) {
            if ("100-continue".equalsIgnoreCase(eaemVar.a("Expect"))) {
                eafqVar.c();
                eaeoVar = eafqVar.e(true);
            }
            if (eaeoVar == null) {
                eaja b = eajl.b(new eafo(eafqVar.a(eaemVar, eaemVar.d.b())));
                eaemVar.d.c(b);
                b.close();
            } else if (!eafgVar.h()) {
                eafmVar.d();
            }
        }
        eafqVar.d();
        if (eaeoVar == null) {
            eaeoVar = eafqVar.e(false);
        }
        eaeoVar.a = eaemVar;
        eaeoVar.e = eafmVar.b().e;
        eaeoVar.k = currentTimeMillis;
        eaeoVar.l = System.currentTimeMillis();
        eaep a = eaeoVar.a();
        int i = a.c;
        if (i == 100) {
            eaeo e = eafqVar.e(false);
            e.a = eaemVar;
            e.e = eafmVar.b().e;
            e.k = currentTimeMillis;
            e.l = System.currentTimeMillis();
            a = e.a();
            i = a.c;
        }
        eaeo b2 = a.b();
        b2.g = eafqVar.f(a);
        eaep a2 = b2.a();
        if ("close".equalsIgnoreCase(a2.a.a("Connection")) || "close".equalsIgnoreCase(a2.a("Connection"))) {
            eafmVar.d();
        }
        if (i != 204) {
            if (i == 205) {
                i = 205;
            }
            return a2;
        }
        if (a2.g.a() > 0) {
            throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + a2.g.a());
        }
        return a2;
    }
}
