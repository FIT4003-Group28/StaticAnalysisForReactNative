package defpackage;

import java.util.Arrays;
import javax.net.ssl.SSLSocket;
/* compiled from: PG */
/* renamed from: eadl  reason: default package */
/* loaded from: classes6.dex */
public final class eadl {
    public static final eadl a;
    public static final eadl b;
    private static final eadh[] g;
    private static final eadh[] h;
    final boolean c;
    public final boolean d;
    @dzsi
    public final String[] e;
    @dzsi
    public final String[] f;

    static {
        eadh[] eadhVarArr = {eadh.o, eadh.p, eadh.q, eadh.r, eadh.s, eadh.i, eadh.k, eadh.j, eadh.l, eadh.n, eadh.m};
        g = eadhVarArr;
        eadh[] eadhVarArr2 = {eadh.o, eadh.p, eadh.q, eadh.r, eadh.s, eadh.i, eadh.k, eadh.j, eadh.l, eadh.n, eadh.m, eadh.g, eadh.h, eadh.e, eadh.f, eadh.c, eadh.d, eadh.b};
        h = eadhVarArr2;
        eadk eadkVar = new eadk(true);
        eadkVar.e(eadhVarArr);
        eadkVar.f(eaet.TLS_1_3, eaet.TLS_1_2);
        eadkVar.c();
        eadkVar.a();
        eadk eadkVar2 = new eadk(true);
        eadkVar2.e(eadhVarArr2);
        eadkVar2.f(eaet.TLS_1_3, eaet.TLS_1_2, eaet.TLS_1_1, eaet.TLS_1_0);
        eadkVar2.c();
        a = eadkVar2.a();
        eadk eadkVar3 = new eadk(true);
        eadkVar3.e(eadhVarArr2);
        eadkVar3.f(eaet.TLS_1_0);
        eadkVar3.c();
        eadkVar3.a();
        b = new eadk(false).a();
    }

    public eadl(eadk eadkVar) {
        this.c = eadkVar.a;
        this.e = eadkVar.b;
        this.f = eadkVar.c;
        this.d = eadkVar.d;
    }

    public final boolean a(SSLSocket sSLSocket) {
        if (!this.c) {
            return false;
        }
        if (this.f != null && !eafa.j(eafa.f, this.f, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        return this.e == null || eafa.j(eadh.a, this.e, sSLSocket.getEnabledCipherSuites());
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof eadl)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        eadl eadlVar = (eadl) obj;
        boolean z = this.c;
        if (z != eadlVar.c) {
            return false;
        }
        return !z || (Arrays.equals(this.e, eadlVar.e) && Arrays.equals(this.f, eadlVar.f) && this.d == eadlVar.d);
    }

    public final int hashCode() {
        if (this.c) {
            return ((((Arrays.hashCode(this.e) + 527) * 31) + Arrays.hashCode(this.f)) * 31) + (!this.d ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        if (!this.c) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.e;
        String str = "[all enabled]";
        String obj = strArr != null ? eadh.b(strArr).toString() : str;
        String[] strArr2 = this.f;
        if (strArr2 != null) {
            str = eaet.b(strArr2).toString();
        }
        return "ConnectionSpec(cipherSuites=" + obj + ", tlsVersions=" + str + ", supportsTlsExtensions=" + this.d + ")";
    }
}
