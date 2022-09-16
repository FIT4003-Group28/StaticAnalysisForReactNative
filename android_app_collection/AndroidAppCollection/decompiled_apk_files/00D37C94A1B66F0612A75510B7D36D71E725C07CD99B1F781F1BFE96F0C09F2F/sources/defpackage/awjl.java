package defpackage;

import android.util.Base64;
/* compiled from: PG */
/* renamed from: awjl  reason: default package */
/* loaded from: classes2.dex */
public final class awjl extends aajr {
    @Override // defpackage.aajh
    public final /* bridge */ /* synthetic */ abga a(byte[] bArr) {
        try {
            awjn awjnVar = (awjn) aopi.parseFrom(awjn.a, bArr, aoos.b());
            if ((awjnVar.c & 1) != 0) {
                return new awjk(awjnVar.mo52toBuilder());
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
        return awjm.class;
    }
}
