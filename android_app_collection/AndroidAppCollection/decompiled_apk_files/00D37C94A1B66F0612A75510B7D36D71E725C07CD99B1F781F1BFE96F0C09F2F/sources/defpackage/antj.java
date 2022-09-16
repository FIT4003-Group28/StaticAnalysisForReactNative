package defpackage;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
/* compiled from: PG */
/* renamed from: antj  reason: default package */
/* loaded from: classes.dex */
public final class antj implements annb {
    public final ECPrivateKey a;
    public final String b;
    public final int c;

    public antj(ECPrivateKey eCPrivateKey, int i, int i2) {
        if (anpf.e(2)) {
            this.a = eCPrivateKey;
            this.b = amnt.n(i);
            this.c = i2;
            return;
        }
        throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
    }
}
