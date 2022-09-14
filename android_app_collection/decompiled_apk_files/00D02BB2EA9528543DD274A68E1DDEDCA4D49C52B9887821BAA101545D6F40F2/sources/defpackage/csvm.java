package defpackage;

import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
/* compiled from: PG */
/* renamed from: csvm  reason: default package */
/* loaded from: classes5.dex */
public final class csvm {
    public static dspd a(String str, KeyPair keyPair) {
        byte[] a = cstp.a(str);
        try {
            PrivateKey privateKey = keyPair.getPrivate();
            Signature signature = Signature.getInstance("SHA256withECDSA");
            signature.initSign(privateKey);
            signature.update(a);
            return dspd.x(signature.sign());
        } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append(valueOf);
            sb.append(" failed to signBytes");
            sb.toString();
            cstl.a("CryptoUtils");
            return null;
        }
    }
}
