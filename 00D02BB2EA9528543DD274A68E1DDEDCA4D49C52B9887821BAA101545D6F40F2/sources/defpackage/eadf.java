package defpackage;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
/* compiled from: PG */
/* renamed from: eadf  reason: default package */
/* loaded from: classes6.dex */
public final class eadf {
    public static final eadf a = new eadf(new LinkedHashSet(new ArrayList()), null);
    public final Set<eade> b;
    @dzsi
    public final eaiq c;

    public eadf(Set<eade> set, @dzsi eaiq eaiqVar) {
        this.b = set;
        this.c = eaiqVar;
    }

    public static String b(Certificate certificate) {
        if (!(certificate instanceof X509Certificate)) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        return "sha256/" + eajc.a(((X509Certificate) certificate).getPublicKey().getEncoded()).p().d();
    }

    public final void a(String str, List<Certificate> list) {
        List emptyList = Collections.emptyList();
        Iterator<eade> it = this.b.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        } else if (!emptyList.isEmpty()) {
            eaiq eaiqVar = this.c;
            if (eaiqVar != null) {
                list = eaiqVar.a(list, str);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i);
                if (emptyList.size() > 0) {
                    String str2 = ((eade) emptyList.get(0)).a;
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Certificate pinning failure!");
            sb.append("\n  Peer certificate chain:");
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i2);
                sb.append("\n    ");
                sb.append(b(x509Certificate2));
                sb.append(": ");
                sb.append(x509Certificate2.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(":");
            int size3 = emptyList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                sb.append("\n    ");
                sb.append((eade) emptyList.get(i3));
            }
            throw new SSLPeerUnverifiedException(sb.toString());
        }
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eadf)) {
            return false;
        }
        eadf eadfVar = (eadf) obj;
        return eafa.a(this.c, eadfVar.c) && this.b.equals(eadfVar.b);
    }

    public final int hashCode() {
        eaiq eaiqVar = this.c;
        return ((eaiqVar != null ? eaiqVar.hashCode() : 0) * 31) + this.b.hashCode();
    }
}
