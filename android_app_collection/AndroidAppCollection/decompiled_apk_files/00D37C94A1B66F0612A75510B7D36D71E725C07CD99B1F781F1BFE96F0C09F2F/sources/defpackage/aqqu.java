package defpackage;

import android.util.Base64;
/* compiled from: PG */
/* renamed from: aqqu  reason: default package */
/* loaded from: classes2.dex */
public final class aqqu extends aajr {
    public static final aqqt f(String str) {
        str.getClass();
        aqxo.z(!str.isEmpty(), "key cannot be empty");
        aopa createBuilder = aqqy.a.createBuilder();
        createBuilder.copyOnWrite();
        aqqy aqqyVar = (aqqy) createBuilder.instance;
        aqqyVar.c |= 1;
        aqqyVar.d = str;
        return new aqqt(createBuilder);
    }

    @Override // defpackage.aajh
    public final /* bridge */ /* synthetic */ abga a(byte[] bArr) {
        try {
            aqqy aqqyVar = (aqqy) aopi.parseFrom(aqqy.a, bArr, aoos.b());
            if ((aqqyVar.c & 1) != 0) {
                return new aqqt(aqqyVar.mo52toBuilder());
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
        return aqqv.class;
    }
}
