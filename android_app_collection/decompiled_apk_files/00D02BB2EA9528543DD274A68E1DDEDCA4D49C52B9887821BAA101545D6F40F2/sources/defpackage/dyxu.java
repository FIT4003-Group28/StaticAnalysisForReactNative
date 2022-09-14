package defpackage;
/* compiled from: PG */
/* renamed from: dyxu  reason: default package */
/* loaded from: classes6.dex */
public enum dyxu {
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    
    final String e;

    dyxu(String str) {
        this.e = str;
    }

    public static dyxu a(String str) {
        if ("TLSv1.2".equals(str)) {
            return TLS_1_2;
        }
        if ("TLSv1.1".equals(str)) {
            return TLS_1_1;
        }
        if ("TLSv1".equals(str)) {
            return TLS_1_0;
        }
        if ("SSLv3".equals(str)) {
            return SSL_3_0;
        }
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() != 0 ? "Unexpected TLS version: ".concat(valueOf) : new String("Unexpected TLS version: "));
    }
}
