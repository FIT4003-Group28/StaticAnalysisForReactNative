package defpackage;

import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: dyxh  reason: default package */
/* loaded from: classes6.dex */
public final class dyxh {
    public static final dyxh a;
    private static final dyxf[] f;
    final boolean b;
    public final String[] c;
    public final String[] d;
    public final boolean e;

    static {
        dyxf[] dyxfVarArr = {dyxf.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, dyxf.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, dyxf.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, dyxf.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, dyxf.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, dyxf.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, dyxf.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, dyxf.TLS_DHE_RSA_WITH_AES_128_CBC_SHA, dyxf.TLS_DHE_DSS_WITH_AES_128_CBC_SHA, dyxf.TLS_DHE_RSA_WITH_AES_256_CBC_SHA, dyxf.TLS_RSA_WITH_AES_128_GCM_SHA256, dyxf.TLS_RSA_WITH_AES_128_CBC_SHA, dyxf.TLS_RSA_WITH_AES_256_CBC_SHA, dyxf.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        f = dyxfVarArr;
        dyxg dyxgVar = new dyxg(true);
        dyxgVar.b(dyxfVarArr);
        dyxgVar.d(dyxu.TLS_1_2, dyxu.TLS_1_1, dyxu.TLS_1_0);
        dyxgVar.f();
        dyxh a2 = dyxgVar.a();
        a = a2;
        dyxg dyxgVar2 = new dyxg(a2);
        dyxgVar2.d(dyxu.TLS_1_0);
        dyxgVar2.f();
        dyxgVar2.a();
        new dyxg(false).a();
    }

    public dyxh(dyxg dyxgVar) {
        this.b = dyxgVar.a;
        this.c = dyxgVar.b;
        this.d = dyxgVar.c;
        this.e = dyxgVar.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dyxh)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        dyxh dyxhVar = (dyxh) obj;
        boolean z = this.b;
        if (z != dyxhVar.b) {
            return false;
        }
        return !z || (Arrays.equals(this.c, dyxhVar.c) && Arrays.equals(this.d, dyxhVar.d) && this.e == dyxhVar.e);
    }

    public final int hashCode() {
        if (this.b) {
            return ((((Arrays.hashCode(this.c) + 527) * 31) + Arrays.hashCode(this.d)) * 31) + (!this.e ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        List a2;
        if (this.b) {
            String[] strArr = this.c;
            int i = 0;
            if (strArr == null) {
                a2 = null;
            } else {
                dyxf[] dyxfVarArr = new dyxf[strArr.length];
                int i2 = 0;
                while (true) {
                    String[] strArr2 = this.c;
                    if (i2 >= strArr2.length) {
                        break;
                    }
                    dyxfVarArr[i2] = dyxf.b(strArr2[i2]);
                    i2++;
                }
                a2 = dyxv.a(dyxfVarArr);
            }
            String obj = a2 == null ? "[use default]" : a2.toString();
            dyxu[] dyxuVarArr = new dyxu[this.d.length];
            while (true) {
                String[] strArr3 = this.d;
                if (i < strArr3.length) {
                    dyxuVarArr[i] = dyxu.a(strArr3[i]);
                    i++;
                } else {
                    String valueOf = String.valueOf(dyxv.a(dyxuVarArr));
                    boolean z = this.e;
                    StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 72 + String.valueOf(valueOf).length());
                    sb.append("ConnectionSpec(cipherSuites=");
                    sb.append(obj);
                    sb.append(", tlsVersions=");
                    sb.append(valueOf);
                    sb.append(", supportsTlsExtensions=");
                    sb.append(z);
                    sb.append(")");
                    return sb.toString();
                }
            }
        } else {
            return "ConnectionSpec()";
        }
    }
}
