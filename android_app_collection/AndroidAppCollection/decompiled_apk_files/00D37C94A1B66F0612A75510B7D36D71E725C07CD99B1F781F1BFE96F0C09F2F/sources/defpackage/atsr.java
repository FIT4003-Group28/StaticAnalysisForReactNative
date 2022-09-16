package defpackage;

import android.util.Base64;
/* compiled from: PG */
/* renamed from: atsr  reason: default package */
/* loaded from: classes2.dex */
public final class atsr extends aajr {
    @Override // defpackage.aajh
    public final /* bridge */ /* synthetic */ abga a(byte[] bArr) {
        try {
            atst atstVar = (atst) aopi.parseFrom(atst.a, bArr, aoos.b());
            if ((atstVar.c & 1) != 0) {
                return new atsq(atstVar.mo52toBuilder());
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
        return atss.class;
    }
}
