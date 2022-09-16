package defpackage;

import android.util.Base64;
/* compiled from: PG */
/* renamed from: avva  reason: default package */
/* loaded from: classes2.dex */
public final class avva extends aajr {
    public static final avuz f(String str) {
        str.getClass();
        aqxo.z(!str.isEmpty(), "key cannot be empty");
        aopa createBuilder = avvc.a.createBuilder();
        createBuilder.copyOnWrite();
        avvc avvcVar = (avvc) createBuilder.instance;
        avvcVar.c |= 1;
        avvcVar.d = str;
        return new avuz(createBuilder);
    }

    @Override // defpackage.aajh
    public final /* bridge */ /* synthetic */ abga a(byte[] bArr) {
        try {
            avvc avvcVar = (avvc) aopi.parseFrom(avvc.a, bArr, aoos.b());
            if ((avvcVar.c & 1) != 0) {
                return new avuz(avvcVar.mo52toBuilder());
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
        return avvb.class;
    }
}
