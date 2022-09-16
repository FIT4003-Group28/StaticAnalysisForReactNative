package defpackage;

import android.util.Base64;
/* compiled from: PG */
/* renamed from: aqoh  reason: default package */
/* loaded from: classes2.dex */
public final class aqoh extends aajr {
    public static final aqog f(String str) {
        str.getClass();
        aqxo.z(!str.isEmpty(), "key cannot be empty");
        aopa createBuilder = aqoj.a.createBuilder();
        createBuilder.copyOnWrite();
        aqoj aqojVar = (aqoj) createBuilder.instance;
        aqojVar.c |= 1;
        aqojVar.d = str;
        return new aqog(createBuilder);
    }

    @Override // defpackage.aajh
    public final /* bridge */ /* synthetic */ abga a(byte[] bArr) {
        try {
            aqoj aqojVar = (aqoj) aopi.parseFrom(aqoj.a, bArr, aoos.b());
            if ((aqojVar.c & 1) != 0) {
                return new aqog(aqojVar.mo52toBuilder());
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
        return aqoi.class;
    }
}
