package defpackage;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
/* compiled from: PG */
/* renamed from: dyxj  reason: default package */
/* loaded from: classes6.dex */
public final class dyxj implements HostnameVerifier {
    public static final dyxj a = new dyxj();
    private static final Pattern b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private dyxj() {
    }

    private static List<String> a(X509Certificate x509Certificate, int i) {
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

    private static final boolean b(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                StringBuilder sb = new StringBuilder(str.length() + 1);
                sb.append(str);
                sb.append('.');
                str = sb.toString();
            }
            if (!str2.endsWith(".")) {
                StringBuilder sb2 = new StringBuilder(str2.length() + 1);
                sb2.append(str2);
                sb2.append('.');
                str2 = sb2.toString();
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains("*")) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String substring = lowerCase.substring(1);
            if (!str.endsWith(substring)) {
                return false;
            }
            int length = str.length() - substring.length();
            return length <= 0 || str.lastIndexOf(46, length + (-1)) == -1;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01e4, code lost:
        throw new java.lang.IllegalStateException(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ec, code lost:
        r1 = r3.d;
        r7 = new java.lang.String(r8, r1, r3.e - r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01c9, code lost:
        r1 = java.lang.String.valueOf(r3.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01d5, code lost:
        if (r1.length() == 0) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01d7, code lost:
        r1 = "Unexpected end of DN: ".concat(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01dc, code lost:
        r1 = new java.lang.String("Unexpected end of DN: ");
     */
    @Override // javax.net.ssl.HostnameVerifier
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean verify(java.lang.String r17, javax.net.ssl.SSLSession r18) {
        /*
            Method dump skipped, instructions count: 703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dyxj.verify(java.lang.String, javax.net.ssl.SSLSession):boolean");
    }
}
