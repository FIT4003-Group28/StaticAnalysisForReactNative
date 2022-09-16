package defpackage;

import android.util.Base64;
/* compiled from: PG */
/* renamed from: avbz  reason: default package */
/* loaded from: classes2.dex */
final class avbz extends aajr {
    @Override // defpackage.aajh
    public final /* bridge */ /* synthetic */ abga a(byte[] bArr) {
        try {
            avcb avcbVar = (avcb) aopi.parseFrom(avcb.a, bArr, aoos.b());
            if ((avcbVar.c & 1) != 0) {
                return new avby(avcbVar.mo52toBuilder());
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
        return avca.class;
    }
}
