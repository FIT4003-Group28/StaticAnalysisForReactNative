package defpackage;

import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: eagp  reason: default package */
/* loaded from: classes6.dex */
public final class eagp implements eafq {
    private static final List<String> b = eafa.g("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    private static final List<String> c = eafa.g("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    final eafm a;
    private final eahe d;
    private eahl e;
    private final eaeh f;
    private final eafv g;

    public eagp(eaee eaeeVar, eafv eafvVar, eafm eafmVar, eahe eaheVar) {
        this.g = eafvVar;
        this.a = eafmVar;
        this.d = eaheVar;
        this.f = eaeeVar.e.contains(eaeh.H2_PRIOR_KNOWLEDGE) ? eaeh.H2_PRIOR_KNOWLEDGE : eaeh.HTTP_2;
    }

    @Override // defpackage.eafq
    public final eajx a(eaem eaemVar, long j) {
        return this.e.d();
    }

    @Override // defpackage.eafq
    public final void b(eaem eaemVar) {
        int i;
        eahl eahlVar;
        if (this.e == null) {
            boolean z = false;
            boolean z2 = eaemVar.d != null;
            eadx eadxVar = eaemVar.c;
            ArrayList arrayList = new ArrayList(eadxVar.b() + 4);
            arrayList.add(new eagj(eagj.c, eaemVar.b));
            arrayList.add(new eagj(eagj.d, eafx.a(eaemVar.a)));
            String a = eaemVar.a("Host");
            if (a != null) {
                arrayList.add(new eagj(eagj.f, a));
            }
            arrayList.add(new eagj(eagj.e, eaemVar.a.a));
            int b2 = eadxVar.b();
            for (int i2 = 0; i2 < b2; i2++) {
                eajc b3 = eajc.b(eadxVar.c(i2).toLowerCase(Locale.US));
                if (!b.contains(b3.c())) {
                    arrayList.add(new eagj(b3, eadxVar.d(i2)));
                }
            }
            eahe eaheVar = this.d;
            boolean z3 = !z2;
            synchronized (eaheVar.q) {
                synchronized (eaheVar) {
                    if (eaheVar.g > 1073741823) {
                        eaheVar.o(8);
                    }
                    if (!eaheVar.h) {
                        i = eaheVar.g;
                        eaheVar.g = i + 2;
                        eahlVar = new eahl(i, eaheVar, z3, false, null);
                        if (!z2 || eaheVar.l == 0 || eahlVar.b == 0) {
                            z = true;
                        }
                        if (eahlVar.a()) {
                            eaheVar.d.put(Integer.valueOf(i), eahlVar);
                        }
                    } else {
                        throw new eagh();
                    }
                }
                eaheVar.q.k(z3, i, arrayList);
            }
            if (z) {
                eaheVar.q.c();
            }
            this.e = eahlVar;
            eahlVar.i.l(this.g.h, TimeUnit.MILLISECONDS);
            this.e.j.l(this.g.i, TimeUnit.MILLISECONDS);
        }
    }

    @Override // defpackage.eafq
    public final void c() {
        this.d.g();
    }

    @Override // defpackage.eafq
    public final void d() {
        this.e.d().close();
    }

    @Override // defpackage.eafq
    public final eaeo e(boolean z) {
        eadx c2 = this.e.c();
        eaeh eaehVar = this.f;
        eadw eadwVar = new eadw();
        int b2 = c2.b();
        eafz eafzVar = null;
        for (int i = 0; i < b2; i++) {
            String c3 = c2.c(i);
            String d = c2.d(i);
            if (c3.equals(":status")) {
                eafzVar = eafz.b("HTTP/1.1 " + d);
            } else if (!c.contains(c3)) {
                eadwVar.c(c3, d);
            }
        }
        if (eafzVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        eaeo eaeoVar = new eaeo();
        eaeoVar.b = eaehVar;
        eaeoVar.c = eafzVar.b;
        eaeoVar.d = eafzVar.c;
        eaeoVar.c(eadwVar.b());
        if (z && eaeoVar.c == 100) {
            return null;
        }
        return eaeoVar;
    }

    @Override // defpackage.eafq
    public final eaer f(eaep eaepVar) {
        eaepVar.a("Content-Type");
        return new eafw(eaft.a(eaepVar), eajl.a(new eago(this, this.e.g)));
    }

    @Override // defpackage.eafq
    public final void g() {
        eahl eahlVar = this.e;
        if (eahlVar != null) {
            eahlVar.k(9);
        }
    }
}
