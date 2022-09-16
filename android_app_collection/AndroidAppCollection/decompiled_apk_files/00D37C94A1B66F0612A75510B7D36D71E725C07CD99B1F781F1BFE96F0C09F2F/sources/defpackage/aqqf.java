package defpackage;

import android.util.Base64;
/* compiled from: PG */
/* renamed from: aqqf  reason: default package */
/* loaded from: classes2.dex */
public final class aqqf extends aajr {
    public static final aqqe f(String str) {
        str.getClass();
        aqxo.z(!str.isEmpty(), "key cannot be empty");
        aopa createBuilder = aqqh.a.createBuilder();
        createBuilder.copyOnWrite();
        aqqh aqqhVar = (aqqh) createBuilder.instance;
        aqqhVar.c |= 1;
        aqqhVar.d = str;
        return new aqqe(createBuilder);
    }

    @Override // defpackage.aajh
    public final /* bridge */ /* synthetic */ abga a(byte[] bArr) {
        try {
            aqqh aqqhVar = (aqqh) aopi.parseFrom(aqqh.a, bArr, aoos.b());
            if ((aqqhVar.c & 1) != 0) {
                return new aqqe(aqqhVar.mo52toBuilder());
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
        return aqqg.class;
    }
}
