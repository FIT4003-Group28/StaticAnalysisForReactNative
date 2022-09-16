package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: ansj  reason: default package */
/* loaded from: classes.dex */
final class ansj implements annc {
    private final anmy a;

    public ansj(anmy anmyVar) {
        this.a = anmyVar;
    }

    @Override // defpackage.annc
    public final void a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length <= 5) {
            throw new GeneralSecurityException("signature too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 5);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
        for (anmw anmwVar : this.a.a(copyOf)) {
            try {
                if (anmwVar.c != 4) {
                    ((annc) anmwVar.a).a(copyOfRange, bArr2);
                    return;
                } else {
                    ((annc) anmwVar.a).a(copyOfRange, antz.o(bArr2, new byte[]{0}));
                    return;
                }
            } catch (GeneralSecurityException e) {
                Logger logger = ansk.a;
                Level level = Level.INFO;
                String valueOf = String.valueOf(e.toString());
                logger.logp(level, "com.google.crypto.tink.signature.PublicKeyVerifyWrapper$WrappedPublicKeyVerify", "verify", valueOf.length() != 0 ? "signature prefix matches a key, but cannot verify: ".concat(valueOf) : new String("signature prefix matches a key, but cannot verify: "));
            }
        }
        for (anmw anmwVar2 : this.a.a(anmh.a)) {
            try {
                ((annc) anmwVar2.a).a(bArr, bArr2);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("invalid signature");
    }
}
