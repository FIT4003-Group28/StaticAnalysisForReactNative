package defpackage;

import android.content.Context;
import android.content.pm.Signature;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
/* compiled from: PG */
/* renamed from: dajo  reason: default package */
/* loaded from: classes5.dex */
public final class dajo {
    public final daix a;
    public final Context b;

    public dajo(Context context, daix daixVar) {
        this.a = daixVar;
        this.b = context;
    }

    public static X509Certificate a(Signature signature) {
        try {
            return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
        } catch (CertificateException unused) {
            return null;
        }
    }
}
