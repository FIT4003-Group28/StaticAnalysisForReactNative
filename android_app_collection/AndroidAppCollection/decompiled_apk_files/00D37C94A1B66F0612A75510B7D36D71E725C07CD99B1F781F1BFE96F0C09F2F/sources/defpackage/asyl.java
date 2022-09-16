package defpackage;

import android.util.Base64;
/* compiled from: PG */
/* renamed from: asyl  reason: default package */
/* loaded from: classes2.dex */
final class asyl extends aajr {
    @Override // defpackage.aajh
    public final /* bridge */ /* synthetic */ abga a(byte[] bArr) {
        try {
            asyn asynVar = (asyn) aopi.parseFrom(asyn.a, bArr, aoos.b());
            if ((asynVar.b & 1) != 0) {
                return new asyk(asynVar.mo52toBuilder());
            }
            String encodeToString = Base64.encodeToString(bArr, 10);
            StringBuilder sb = new StringBuilder(String.valueOf(encodeToString).length() + 87);
            sb.append("Attempted to parse and wrap an entity protobuf without a valid key (field: id, bytes: ");
            sb.append(encodeToString);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        } catch (aopx e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // defpackage.aajr
    public final Class e() {
        return asym.class;
    }
}
