package defpackage;

import android.util.Base64;
/* compiled from: PG */
/* renamed from: awjh  reason: default package */
/* loaded from: classes2.dex */
public final class awjh extends aajr {
    public static final awjg f(String str) {
        str.getClass();
        aqxo.z(!str.isEmpty(), "key cannot be empty");
        aopa createBuilder = awjj.a.createBuilder();
        createBuilder.copyOnWrite();
        awjj awjjVar = (awjj) createBuilder.instance;
        awjjVar.c |= 1;
        awjjVar.d = str;
        return new awjg(createBuilder);
    }

    @Override // defpackage.aajh
    public final /* bridge */ /* synthetic */ abga a(byte[] bArr) {
        try {
            awjj awjjVar = (awjj) aopi.parseFrom(awjj.a, bArr, aoos.b());
            if ((awjjVar.c & 1) != 0) {
                return new awjg(awjjVar.mo52toBuilder());
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
        return awji.class;
    }
}
