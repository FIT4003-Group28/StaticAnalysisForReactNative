package defpackage;

import com.google.android.libraries.elements.interfaces.PublicKeyVerifier;
import io.grpc.Status;
import java.io.IOException;
import java.security.GeneralSecurityException;
/* compiled from: PG */
/* renamed from: ajiz  reason: default package */
/* loaded from: classes.dex */
final class ajiz extends PublicKeyVerifier {
    private annc a;
    private String b;
    private annc c;

    @Override // com.google.android.libraries.elements.interfaces.PublicKeyVerifier
    public final Status initialize(String str, byte[] bArr, byte[] bArr2) {
        annc anncVar;
        try {
            ansv.a();
            this.a = (annc) anms.c(anmf.a(bArr)).b(annc.class);
            this.b = str;
            awvo awvoVar = (awvo) aopi.parseFrom(awvo.a, bArr2, aoos.b());
            if ((awvoVar.b & 1) == 0) {
                throw new GeneralSecurityException("Missing signed_keyset");
            }
            awvq awvqVar = awvoVar.c;
            if (awvqVar == null) {
                awvqVar = awvq.a;
            }
            int i = awvqVar.b;
            if ((i & 2) == 0) {
                throw new GeneralSecurityException("Missing signedKeyset.keyset");
            }
            if ((i & 1) != 0) {
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                if ((awvqVar.b & 8) != 0) {
                    aorw aorwVar = awvqVar.e;
                    if (aorwVar == null) {
                        aorwVar = aorw.a;
                    }
                    if (currentTimeMillis < aorwVar.b) {
                        aorw aorwVar2 = awvqVar.e;
                        if (aorwVar2 == null) {
                            aorwVar2 = aorw.a;
                        }
                        long j = aorwVar2.b;
                        StringBuilder sb = new StringBuilder(137);
                        sb.append("Expired certificate: current time is before signed_keyset validity period. now = ");
                        sb.append(currentTimeMillis);
                        sb.append(", valid_after = ");
                        sb.append(j);
                        throw new GeneralSecurityException(sb.toString());
                    }
                }
                if ((awvqVar.b & 4) != 0) {
                    aorw aorwVar3 = awvqVar.d;
                    if (aorwVar3 == null) {
                        aorwVar3 = aorw.a;
                    }
                    if (currentTimeMillis > aorwVar3.b) {
                        aorw aorwVar4 = awvqVar.d;
                        if (aorwVar4 == null) {
                            aorwVar4 = aorw.a;
                        }
                        long j2 = aorwVar4.b;
                        StringBuilder sb2 = new StringBuilder(139);
                        sb2.append("Expired certificate: current time has passed signed_keyset validity period. now = ");
                        sb2.append(currentTimeMillis);
                        sb2.append(", valid_before = ");
                        sb2.append(j2);
                        throw new GeneralSecurityException(sb2.toString());
                    }
                }
                if (awvoVar.d.size() > 0) {
                    for (awvp awvpVar : awvoVar.d) {
                        int i2 = awvpVar.b;
                        if ((i2 & 1) == 0 || (i2 & 2) == 0) {
                            throw new GeneralSecurityException("Missing Signature or Signature Identifier");
                        }
                    }
                    awvq awvqVar2 = awvoVar.c;
                    if (awvqVar2 == null) {
                        awvqVar2 = awvq.a;
                    }
                    byte[] byteArray = awvqVar2.toByteArray();
                    for (awvp awvpVar2 : awvoVar.d) {
                        if (awvpVar2.d.equals(this.b) && (anncVar = this.a) != null) {
                            anncVar.a(awvpVar2.c.I(), byteArray);
                            awvq awvqVar3 = awvoVar.c;
                            if (awvqVar3 == null) {
                                awvqVar3 = awvq.a;
                            }
                            this.c = (annc) anms.c(anmf.a(awvqVar3.c.I())).b(annc.class);
                            return Status.b;
                        }
                    }
                    throw new GeneralSecurityException("Intermediate certificate not signed by known root certificate");
                }
                throw new GeneralSecurityException("No Signatures found");
            }
            throw new GeneralSecurityException("Missing signedKeyset.identifier");
        } catch (IOException e) {
            String message = e.getMessage();
            return message != null ? Status.o.withDescription(message) : Status.o;
        } catch (GeneralSecurityException e2) {
            String message2 = e2.getMessage();
            return message2 != null ? Status.o.withDescription(message2) : Status.o;
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.PublicKeyVerifier
    public final Status verify(byte[] bArr, byte[] bArr2) {
        annc anncVar = this.c;
        if (anncVar != null) {
            try {
                anncVar.a(bArr, bArr2);
                return Status.b;
            } catch (GeneralSecurityException e) {
                String message = e.getMessage();
                if (message != null) {
                    return Status.i.withDescription(message);
                }
                return Status.i;
            }
        }
        return Status.o.withDescription("Intermediate verifier not available.");
    }
}
