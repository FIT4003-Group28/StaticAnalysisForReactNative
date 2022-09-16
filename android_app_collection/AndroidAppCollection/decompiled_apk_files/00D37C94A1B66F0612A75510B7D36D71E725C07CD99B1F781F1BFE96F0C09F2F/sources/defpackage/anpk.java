package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: PG */
/* renamed from: anpk  reason: default package */
/* loaded from: classes.dex */
final class anpk extends anmq {
    public anpk(Class cls) {
        super(cls);
    }

    @Override // defpackage.anmq
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        anqy anqyVar = (anqy) obj;
        anra anraVar = anqyVar.c;
        if (anraVar == null) {
            anraVar = anra.a;
        }
        int c = anqx.c(anraVar.b);
        if (c == 0) {
            c = 1;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(anqyVar.d.I(), "HMAC");
        anra anraVar2 = anqyVar.c;
        if (anraVar2 == null) {
            anraVar2 = anra.a;
        }
        int i = anraVar2.c;
        int i2 = c - 2;
        if (i2 != 1) {
            if (i2 == 2) {
                return new anuk(new anuj("HMACSHA384", secretKeySpec), i);
            }
            if (i2 == 3) {
                return new anuk(new anuj("HMACSHA256", secretKeySpec), i);
            }
            if (i2 == 4) {
                return new anuk(new anuj("HMACSHA512", secretKeySpec), i);
            }
            if (i2 == 5) {
                return new anuk(new anuj("HMACSHA224", secretKeySpec), i);
            }
            throw new GeneralSecurityException("unknown hash");
        }
        return new anuk(new anuj("HMACSHA1", secretKeySpec), i);
    }
}
