package defpackage;

import android.util.Base64;
/* compiled from: PG */
/* renamed from: awkw  reason: default package */
/* loaded from: classes2.dex */
public final class awkw extends aajr {
    public static final awkv f(String str) {
        str.getClass();
        aqxo.z(!str.isEmpty(), "key cannot be empty");
        aopa createBuilder = awky.a.createBuilder();
        createBuilder.copyOnWrite();
        awky awkyVar = (awky) createBuilder.instance;
        awkyVar.c |= 1;
        awkyVar.d = str;
        return new awkv(createBuilder);
    }

    @Override // defpackage.aajh
    public final /* bridge */ /* synthetic */ abga a(byte[] bArr) {
        try {
            awky awkyVar = (awky) aopi.parseFrom(awky.a, bArr, aoos.b());
            if ((awkyVar.c & 1) != 0) {
                return new awkv(awkyVar.mo52toBuilder());
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
        return awkx.class;
    }
}
