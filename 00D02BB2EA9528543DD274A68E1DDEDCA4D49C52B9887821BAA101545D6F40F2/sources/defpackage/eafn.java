package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: eafn  reason: default package */
/* loaded from: classes6.dex */
public final class eafn implements eaea {
    private final eado a;

    public eafn(eado eadoVar) {
        this.a = eadoVar;
    }

    @Override // defpackage.eaea
    public final eaep a(eafv eafvVar) {
        boolean z;
        eaem eaemVar = eafvVar.d;
        eael b = eaemVar.b();
        eaen eaenVar = eaemVar.d;
        if (eaenVar != null) {
            if (eaenVar.a() != null) {
                throw null;
            }
            long b2 = eaenVar.b();
            if (b2 != -1) {
                b.b("Content-Length", Long.toString(b2));
                b.e("Transfer-Encoding");
            } else {
                b.b("Transfer-Encoding", "chunked");
                b.e("Content-Length");
            }
        }
        if (eaemVar.a("Host") == null) {
            b.b("Host", eafa.k(eaemVar.a, false));
        }
        if (eaemVar.a("Connection") == null) {
            b.b("Connection", "Keep-Alive");
        }
        if (eaemVar.a("Accept-Encoding") == null && eaemVar.a("Range") == null) {
            b.b("Accept-Encoding", "gzip");
            z = true;
        } else {
            z = false;
        }
        eadz eadzVar = eaemVar.a;
        List emptyList = Collections.emptyList();
        if (!emptyList.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int size = emptyList.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append("; ");
                }
                eadm eadmVar = (eadm) emptyList.get(i);
                sb.append(eadmVar.a);
                sb.append('=');
                sb.append(eadmVar.b);
            }
            b.b("Cookie", sb.toString());
        }
        if (eaemVar.a("User-Agent") == null) {
            b.b("User-Agent", "okhttp/3.12.0");
        }
        eaep a = eafvVar.a(b.a());
        eaft.b(this.a, eaemVar.a, a.f);
        eaeo b3 = a.b();
        b3.a = eaemVar;
        if (z && "gzip".equalsIgnoreCase(a.a("Content-Encoding")) && eaft.c(a)) {
            eajg eajgVar = new eajg(a.g.b());
            eadw e = a.f.e();
            e.d("Content-Encoding");
            e.d("Content-Length");
            b3.c(e.b());
            a.a("Content-Type");
            b3.g = new eafw(-1L, eajl.a(eajgVar));
        }
        return b3.a();
    }
}
