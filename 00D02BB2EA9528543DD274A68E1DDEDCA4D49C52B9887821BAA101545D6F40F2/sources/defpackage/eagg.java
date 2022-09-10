package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
/* compiled from: PG */
/* renamed from: eagg  reason: default package */
/* loaded from: classes6.dex */
public final class eagg implements eafq {
    final eaee a;
    final eafm b;
    final eajb c;
    final eaja d;
    int e = 0;
    private long f = 262144;

    public eagg(eaee eaeeVar, eafm eafmVar, eajb eajbVar, eaja eajaVar) {
        this.a = eaeeVar;
        this.b = eafmVar;
        this.c = eajbVar;
        this.d = eajaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void k(eajf eajfVar) {
        eaka eakaVar = eajfVar.a;
        eajfVar.a = eaka.f;
        eakaVar.q();
        eakaVar.p();
    }

    private final String l() {
        String t = this.c.t(this.f);
        this.f -= t.length();
        return t;
    }

    @Override // defpackage.eafq
    public final eajx a(eaem eaemVar, long j) {
        if ("chunked".equalsIgnoreCase(eaemVar.a("Transfer-Encoding"))) {
            if (this.e == 1) {
                this.e = 2;
                return new eagb(this);
            }
            throw new IllegalStateException("state: " + this.e);
        } else if (j != -1) {
            if (this.e != 1) {
                throw new IllegalStateException("state: " + this.e);
            }
            this.e = 2;
            return new eagd(this, j);
        } else {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    @Override // defpackage.eafq
    public final void b(eaem eaemVar) {
        Proxy.Type type = this.b.b().b.b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(eaemVar.b);
        sb.append(' ');
        if (eaemVar.d() || type != Proxy.Type.HTTP) {
            sb.append(eafx.a(eaemVar.a));
        } else {
            sb.append(eaemVar.a);
        }
        sb.append(" HTTP/1.1");
        h(eaemVar.c, sb.toString());
    }

    @Override // defpackage.eafq
    public final void c() {
        this.d.flush();
    }

    @Override // defpackage.eafq
    public final void d() {
        this.d.flush();
    }

    @Override // defpackage.eafq
    public final eaer f(eaep eaepVar) {
        eafm eafmVar = this.b;
        eadu eaduVar = eafmVar.f;
        eadc eadcVar = eafmVar.e;
        eaepVar.a("Content-Type");
        if (!eaft.c(eaepVar)) {
            return new eafw(0L, eajl.a(j(0L)));
        }
        if ("chunked".equalsIgnoreCase(eaepVar.a("Transfer-Encoding"))) {
            eadz eadzVar = eaepVar.a.a;
            if (this.e == 4) {
                this.e = 5;
                return new eafw(-1L, eajl.a(new eagc(this, eadzVar)));
            }
            throw new IllegalStateException("state: " + this.e);
        }
        long a = eaft.a(eaepVar);
        if (a != -1) {
            return new eafw(a, eajl.a(j(a)));
        }
        if (this.e == 4) {
            eafm eafmVar2 = this.b;
            if (eafmVar2 != null) {
                this.e = 5;
                eafmVar2.d();
                return new eafw(-1L, eajl.a(new eagf(this)));
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        throw new IllegalStateException("state: " + this.e);
    }

    @Override // defpackage.eafq
    public final void g() {
        eafg b = this.b.b();
        if (b != null) {
            b.d();
        }
    }

    public final void h(eadx eadxVar, String str) {
        if (this.e == 0) {
            eaja eajaVar = this.d;
            eajaVar.W(str);
            eajaVar.W("\r\n");
            int b = eadxVar.b();
            for (int i = 0; i < b; i++) {
                eaja eajaVar2 = this.d;
                eajaVar2.W(eadxVar.c(i));
                eajaVar2.W(": ");
                eajaVar2.W(eadxVar.d(i));
                eajaVar2.W("\r\n");
            }
            this.d.W("\r\n");
            this.e = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.e);
    }

    public final eadx i() {
        eadw eadwVar = new eadw();
        while (true) {
            String l = l();
            if (l.length() != 0) {
                int indexOf = l.indexOf(":", 1);
                if (indexOf != -1) {
                    eadwVar.c(l.substring(0, indexOf), l.substring(indexOf + 1));
                } else if (l.startsWith(":")) {
                    eadwVar.c("", l.substring(1));
                } else {
                    eadwVar.c("", l);
                }
            } else {
                return eadwVar.b();
            }
        }
    }

    public final eajy j(long j) {
        if (this.e == 4) {
            this.e = 5;
            return new eage(this, j);
        }
        throw new IllegalStateException("state: " + this.e);
    }

    @Override // defpackage.eafq
    public final eaeo e(boolean z) {
        int i = this.e;
        if (i == 1 || i == 3) {
            try {
                eafz b = eafz.b(l());
                eaeo eaeoVar = new eaeo();
                eaeoVar.b = b.a;
                eaeoVar.c = b.b;
                eaeoVar.d = b.c;
                eaeoVar.c(i());
                if (z && b.b == 100) {
                    return null;
                }
                if (b.b == 100) {
                    this.e = 3;
                    return eaeoVar;
                }
                this.e = 4;
                return eaeoVar;
            } catch (EOFException e) {
                IOException iOException = new IOException("unexpected end of stream on " + this.b);
                iOException.initCause(e);
                throw iOException;
            }
        }
        throw new IllegalStateException("state: " + this.e);
    }
}
