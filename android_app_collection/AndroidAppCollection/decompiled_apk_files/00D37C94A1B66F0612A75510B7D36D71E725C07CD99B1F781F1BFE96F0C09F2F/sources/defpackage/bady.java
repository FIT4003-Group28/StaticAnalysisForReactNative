package defpackage;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;
/* compiled from: PG */
/* renamed from: bady  reason: default package */
/* loaded from: classes2.dex */
public final class bady implements badx {
    private final X509TrustManagerExtensions a;

    public bady(X509TrustManager x509TrustManager) {
        this.a = new X509TrustManagerExtensions(x509TrustManager);
    }

    @Override // defpackage.badx
    public final List a(X509Certificate[] x509CertificateArr, String str, String str2) {
        try {
            return this.a.checkServerTrusted(x509CertificateArr, str, str2);
        } catch (RuntimeException e) {
            bacc.d("X509Util", "checkServerTrusted() unexpectedly threw: %s", e);
            throw new CertificateException(e);
        }
    }
}
