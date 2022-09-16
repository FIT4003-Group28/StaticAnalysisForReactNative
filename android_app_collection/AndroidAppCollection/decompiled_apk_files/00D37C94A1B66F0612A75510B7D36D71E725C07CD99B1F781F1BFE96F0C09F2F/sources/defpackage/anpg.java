package defpackage;

import java.security.GeneralSecurityException;
/* compiled from: PG */
/* renamed from: anpg  reason: default package */
/* loaded from: classes.dex */
public final class anpg implements antl {
    public final String a;
    public final int b;
    public anqc c;
    public anpu d;
    public int e;
    public anqg f;

    public anpg(anrc anrcVar) {
        String str = anrcVar.b;
        this.a = str;
        if (str.equals(annj.b)) {
            try {
                aoob aoobVar = anrcVar.c;
                aoos a = aoos.a();
                this.c = (anqc) annh.b(anrcVar);
                this.b = ((anqd) aopi.parseFrom(anqd.a, aoobVar, a)).b;
            } catch (aopx e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (str.equals(annj.a)) {
            try {
                anpv anpvVar = (anpv) aopi.parseFrom(anpv.a, anrcVar.c, aoos.a());
                this.d = (anpu) annh.b(anrcVar);
                anpx anpxVar = anpvVar.b;
                this.e = (anpxVar == null ? anpx.a : anpxVar).c;
                anqz anqzVar = anpvVar.c;
                this.b = this.e + (anqzVar == null ? anqz.a : anqzVar).c;
            } catch (aopx e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        } else if (str.equals(anou.a)) {
            try {
                aoob aoobVar2 = anrcVar.c;
                aoos a2 = aoos.a();
                this.f = (anqg) annh.b(anrcVar);
                this.b = ((anqh) aopi.parseFrom(anqh.a, aoobVar2, a2)).b;
            } catch (aopx e3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
            }
        } else {
            String valueOf = String.valueOf(str);
            throw new GeneralSecurityException(valueOf.length() != 0 ? "unsupported AEAD DEM key type: ".concat(valueOf) : new String("unsupported AEAD DEM key type: "));
        }
    }
}
