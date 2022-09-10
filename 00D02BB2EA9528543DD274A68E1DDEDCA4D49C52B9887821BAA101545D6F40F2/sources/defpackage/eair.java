package defpackage;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
/* compiled from: PG */
/* renamed from: eair  reason: default package */
/* loaded from: classes6.dex */
public final class eair implements HostnameVerifier {
    public static final eair a = new eair();

    private eair() {
    }

    public static List<String> a(X509Certificate x509Certificate, int i) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    public static final boolean b(String str, X509Certificate x509Certificate) {
        if (!eafa.u(str)) {
            String lowerCase = str.toLowerCase(Locale.US);
            for (String str2 : a(x509Certificate, 2)) {
                if (lowerCase != null && lowerCase.length() != 0 && !lowerCase.startsWith(".") && !lowerCase.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
                    String str3 = !lowerCase.endsWith(".") ? lowerCase + '.' : lowerCase;
                    if (!str2.endsWith(".")) {
                        str2 = str2 + '.';
                    }
                    String lowerCase2 = str2.toLowerCase(Locale.US);
                    if (!lowerCase2.contains("*")) {
                        if (str3.equals(lowerCase2)) {
                        }
                    } else if (lowerCase2.startsWith("*.") && lowerCase2.indexOf(42, 1) == -1 && str3.length() >= lowerCase2.length() && !"*.".equals(lowerCase2)) {
                        String substring = lowerCase2.substring(1);
                        if (!str3.endsWith(substring)) {
                            continue;
                        } else {
                            int length = str3.length() - substring.length();
                            if (length > 0 && str3.lastIndexOf(46, length - 1) != -1) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        List<String> a2 = a(x509Certificate, 7);
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            if (!str.equalsIgnoreCase(a2.get(i))) {
            }
        }
        return false;
        return true;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return b(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
