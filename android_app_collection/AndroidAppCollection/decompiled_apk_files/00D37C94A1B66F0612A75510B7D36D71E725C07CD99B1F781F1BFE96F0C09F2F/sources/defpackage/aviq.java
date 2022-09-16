package defpackage;

import android.util.Base64;
/* compiled from: PG */
/* renamed from: aviq  reason: default package */
/* loaded from: classes2.dex */
public final class aviq extends aajr {
    public static final avip f(String str) {
        str.getClass();
        aqxo.z(!str.isEmpty(), "key cannot be empty");
        aopa createBuilder = avis.a.createBuilder();
        createBuilder.copyOnWrite();
        avis avisVar = (avis) createBuilder.instance;
        avisVar.b |= 1;
        avisVar.c = str;
        return new avip(createBuilder);
    }

    @Override // defpackage.aajh
    public final /* bridge */ /* synthetic */ abga a(byte[] bArr) {
        try {
            avis avisVar = (avis) aopi.parseFrom(avis.a, bArr, aoos.b());
            if ((avisVar.b & 1) != 0) {
                return new avip(avisVar.mo52toBuilder());
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
        return avir.class;
    }
}
