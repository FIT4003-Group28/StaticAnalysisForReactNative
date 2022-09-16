package defpackage;

import java.security.cert.X509Certificate;
/* compiled from: PG */
/* renamed from: cen  reason: default package */
/* loaded from: classes2.dex */
public final class cen extends ceo {
    private final byte[] a;

    public cen(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.a = bArr;
    }

    @Override // defpackage.ceo, java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.a;
    }
}
