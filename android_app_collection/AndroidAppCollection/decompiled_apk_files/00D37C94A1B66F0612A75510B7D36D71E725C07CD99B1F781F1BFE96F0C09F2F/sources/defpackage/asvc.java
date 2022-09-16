package defpackage;

import android.util.Base64;
/* compiled from: PG */
/* renamed from: asvc  reason: default package */
/* loaded from: classes2.dex */
final class asvc extends aajr {
    @Override // defpackage.aajh
    public final /* bridge */ /* synthetic */ abga a(byte[] bArr) {
        try {
            asve asveVar = (asve) aopi.parseFrom(asve.a, bArr, aoos.b());
            if ((asveVar.b & 1) != 0) {
                return new asvb(asveVar.mo52toBuilder());
            }
            String encodeToString = Base64.encodeToString(bArr, 10);
            StringBuilder sb = new StringBuilder(String.valueOf(encodeToString).length() + 88);
            sb.append("Attempted to parse and wrap an entity protobuf without a valid key (field: key, bytes: ");
            sb.append(encodeToString);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        } catch (aopx e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // defpackage.aajr
    public final Class e() {
        return asvd.class;
    }
}
