package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
/* compiled from: PG */
/* renamed from: eaie  reason: default package */
/* loaded from: classes6.dex */
final class eaie implements eais {
    private final X509TrustManager a;
    private final Method b;

    public eaie(X509TrustManager x509TrustManager, Method method) {
        this.b = method;
        this.a = x509TrustManager;
    }

    @Override // defpackage.eais
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            TrustAnchor trustAnchor = (TrustAnchor) this.b.invoke(this.a, x509Certificate);
            if (trustAnchor == null) {
                return null;
            }
            return trustAnchor.getTrustedCert();
        } catch (IllegalAccessException e) {
            throw eafa.w("unable to get issues and signature", e);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eaie)) {
            return false;
        }
        eaie eaieVar = (eaie) obj;
        return this.a.equals(eaieVar.a) && this.b.equals(eaieVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }
}
