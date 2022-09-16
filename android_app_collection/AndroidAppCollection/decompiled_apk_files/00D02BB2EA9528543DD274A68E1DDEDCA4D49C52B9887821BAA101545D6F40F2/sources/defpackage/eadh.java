package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: eadh  reason: default package */
/* loaded from: classes6.dex */
public final class eadh {
    public static final eadh b;
    public static final eadh c;
    public static final eadh d;
    public static final eadh e;
    public static final eadh f;
    public static final eadh g;
    public static final eadh h;
    public static final eadh i;
    public static final eadh j;
    public static final eadh k;
    public static final eadh l;
    public static final eadh m;
    public static final eadh n;
    public static final eadh o;
    public static final eadh p;
    public static final eadh q;
    public static final eadh r;
    public static final eadh s;
    public final String t;
    public static final Comparator<String> a = new eadg();
    private static final Map<String, eadh> u = new LinkedHashMap();

    static {
        c("SSL_RSA_WITH_NULL_MD5");
        c("SSL_RSA_WITH_NULL_SHA");
        c("SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        c("SSL_RSA_WITH_RC4_128_MD5");
        c("SSL_RSA_WITH_RC4_128_SHA");
        c("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        c("SSL_RSA_WITH_DES_CBC_SHA");
        b = c("SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        c("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        c("SSL_DHE_DSS_WITH_DES_CBC_SHA");
        c("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        c("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        c("SSL_DHE_RSA_WITH_DES_CBC_SHA");
        c("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        c("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        c("SSL_DH_anon_WITH_RC4_128_MD5");
        c("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        c("SSL_DH_anon_WITH_DES_CBC_SHA");
        c("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        c("TLS_KRB5_WITH_DES_CBC_SHA");
        c("TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        c("TLS_KRB5_WITH_RC4_128_SHA");
        c("TLS_KRB5_WITH_DES_CBC_MD5");
        c("TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        c("TLS_KRB5_WITH_RC4_128_MD5");
        c("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        c("TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        c("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        c("TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        c = c("TLS_RSA_WITH_AES_128_CBC_SHA");
        c("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        c("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        c("TLS_DH_anon_WITH_AES_128_CBC_SHA");
        d = c("TLS_RSA_WITH_AES_256_CBC_SHA");
        c("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        c("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        c("TLS_DH_anon_WITH_AES_256_CBC_SHA");
        c("TLS_RSA_WITH_NULL_SHA256");
        c("TLS_RSA_WITH_AES_128_CBC_SHA256");
        c("TLS_RSA_WITH_AES_256_CBC_SHA256");
        c("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        c("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        c("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        c("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        c("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        c("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        c("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        c("TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        c("TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        c("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        c("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        c("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        c("TLS_PSK_WITH_RC4_128_SHA");
        c("TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        c("TLS_PSK_WITH_AES_128_CBC_SHA");
        c("TLS_PSK_WITH_AES_256_CBC_SHA");
        c("TLS_RSA_WITH_SEED_CBC_SHA");
        e = c("TLS_RSA_WITH_AES_128_GCM_SHA256");
        f = c("TLS_RSA_WITH_AES_256_GCM_SHA384");
        c("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        c("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        c("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        c("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        c("TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        c("TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        c("TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        c("TLS_FALLBACK_SCSV");
        c("TLS_ECDH_ECDSA_WITH_NULL_SHA");
        c("TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        c("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        c("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        c("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        c("TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        c("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        c("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        c("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        c("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        c("TLS_ECDH_RSA_WITH_NULL_SHA");
        c("TLS_ECDH_RSA_WITH_RC4_128_SHA");
        c("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        c("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        c("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        c("TLS_ECDHE_RSA_WITH_NULL_SHA");
        c("TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        c("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        g = c("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        h = c("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        c("TLS_ECDH_anon_WITH_NULL_SHA");
        c("TLS_ECDH_anon_WITH_RC4_128_SHA");
        c("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        c("TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        c("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        c("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        c("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        c("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        c("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        c("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        c("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        c("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        c("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        i = c("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        j = c("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        c("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        c("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        k = c("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        l = c("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        c("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        c("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        c("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        c("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        m = c("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        n = c("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
        c("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        c("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
        o = c("TLS_AES_128_GCM_SHA256");
        p = c("TLS_AES_256_GCM_SHA384");
        q = c("TLS_CHACHA20_POLY1305_SHA256");
        r = c("TLS_AES_128_CCM_SHA256");
        s = c("TLS_AES_256_CCM_8_SHA256");
    }

    private eadh(String str) {
        str.getClass();
        this.t = str;
    }

    public static synchronized eadh a(String str) {
        eadh eadhVar;
        String str2;
        synchronized (eadh.class) {
            Map<String, eadh> map = u;
            eadhVar = map.get(str);
            if (eadhVar == null) {
                if (str.startsWith("TLS_")) {
                    str2 = "SSL_" + str.substring(4);
                } else if (str.startsWith("SSL_")) {
                    str2 = "TLS_" + str.substring(4);
                } else {
                    str2 = str;
                }
                eadhVar = map.get(str2);
                if (eadhVar == null) {
                    eadhVar = new eadh(str);
                }
                map.put(str, eadhVar);
            }
        }
        return eadhVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<eadh> b(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(a(str));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static eadh c(String str) {
        eadh eadhVar = new eadh(str);
        u.put(str, eadhVar);
        return eadhVar;
    }

    public final String toString() {
        return this.t;
    }
}
