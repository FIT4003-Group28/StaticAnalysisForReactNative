package defpackage;

import java.security.cert.X509Certificate;
/* compiled from: PG */
/* renamed from: bqw  reason: default package */
/* loaded from: classes4.dex */
final class bqw extends bqx {
    private final byte[] a;

    public bqw(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.a = bArr;
    }

    @Override // defpackage.bqx, java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.a;
    }
}
