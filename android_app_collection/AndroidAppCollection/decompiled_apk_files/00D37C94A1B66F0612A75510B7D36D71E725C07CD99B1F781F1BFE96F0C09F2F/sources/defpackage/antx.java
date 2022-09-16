package defpackage;

import java.security.GeneralSecurityException;
/* compiled from: PG */
/* renamed from: antx  reason: default package */
/* loaded from: classes.dex */
public final class antx implements annb {
    private final byte[] a;

    public antx(byte[] bArr) {
        if (!anpf.e(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException(String.format("Given private key's length is not %s", 32));
        }
        byte[] e = antu.e(bArr);
        this.a = e;
        antu.f(e);
    }
}
