package defpackage;

import android.util.Base64;
/* compiled from: PG */
/* renamed from: auof  reason: default package */
/* loaded from: classes2.dex */
public final class auof extends aajr {
    public static final auoe f(String str) {
        str.getClass();
        aqxo.z(!str.isEmpty(), "key cannot be empty");
        aopa createBuilder = auoh.a.createBuilder();
        createBuilder.copyOnWrite();
        auoh auohVar = (auoh) createBuilder.instance;
        auohVar.b |= 1;
        auohVar.c = str;
        return new auoe(createBuilder);
    }

    @Override // defpackage.aajh
    public final /* bridge */ /* synthetic */ abga a(byte[] bArr) {
        try {
            auoh auohVar = (auoh) aopi.parseFrom(auoh.a, bArr, aoos.b());
            if ((auohVar.b & 1) != 0) {
                return new auoe(auohVar.mo52toBuilder());
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
        return auog.class;
    }
}
