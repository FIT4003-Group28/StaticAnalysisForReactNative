package defpackage;

import android.util.Base64;
/* compiled from: PG */
/* renamed from: asyh  reason: default package */
/* loaded from: classes2.dex */
public final class asyh extends aajr {
    public static final asyg f(String str) {
        str.getClass();
        aqxo.z(!str.isEmpty(), "key cannot be empty");
        aopa createBuilder = asyj.a.createBuilder();
        createBuilder.copyOnWrite();
        asyj asyjVar = (asyj) createBuilder.instance;
        asyjVar.c |= 1;
        asyjVar.d = str;
        return new asyg(createBuilder);
    }

    @Override // defpackage.aajh
    public final /* bridge */ /* synthetic */ abga a(byte[] bArr) {
        try {
            asyj asyjVar = (asyj) aopi.parseFrom(asyj.a, bArr, aoos.b());
            if ((asyjVar.c & 1) != 0) {
                return new asyg(asyjVar.mo52toBuilder());
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
        return asyi.class;
    }
}
