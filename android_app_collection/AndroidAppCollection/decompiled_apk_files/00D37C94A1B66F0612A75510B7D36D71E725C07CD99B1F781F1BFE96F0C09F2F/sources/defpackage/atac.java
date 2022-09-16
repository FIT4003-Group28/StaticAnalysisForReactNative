package defpackage;

import android.util.Base64;
/* compiled from: PG */
/* renamed from: atac  reason: default package */
/* loaded from: classes2.dex */
public final class atac extends aajr {
    public static final atab f(String str) {
        aqxo.z(!str.isEmpty(), "key cannot be empty");
        aopa createBuilder = ataf.a.createBuilder();
        createBuilder.copyOnWrite();
        ataf atafVar = (ataf) createBuilder.instance;
        atafVar.c |= 1;
        atafVar.d = str;
        return new atab(createBuilder);
    }

    @Override // defpackage.aajh
    public final /* bridge */ /* synthetic */ abga a(byte[] bArr) {
        try {
            ataf atafVar = (ataf) aopi.parseFrom(ataf.a, bArr, aoos.b());
            if ((atafVar.c & 1) != 0) {
                return new atab(atafVar.mo52toBuilder());
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
        return atad.class;
    }
}
