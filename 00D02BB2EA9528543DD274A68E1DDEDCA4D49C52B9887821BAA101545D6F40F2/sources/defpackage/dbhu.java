package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: PG */
/* renamed from: dbhu  reason: default package */
/* loaded from: classes5.dex */
public final class dbhu {
    private static final char[] a = {'R', 'B', 'U', 'N'};

    public static dbkg a(ByteBuffer byteBuffer) {
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            if (byteBuffer.get(i2 + 4) != a[i2]) {
                return null;
            }
        }
        byteBuffer.rewind();
        dbkg dbkgVar = new dbkg();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        dbkgVar.m(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        float a2 = dbkgVar.a().a();
        dbkm a3 = dbkgVar.a();
        int g = a3.g(6);
        if (g != 0) {
            i = a3.b.getInt(g + a3.a);
        }
        if (dbkgVar.a().a() <= 0.54f) {
            return dbkgVar;
        }
        StringBuilder sb = new StringBuilder(140);
        sb.append("Sceneform bundle (.sfb) version not supported, max version supported is 0.54.X. Version requested for loading is ");
        sb.append(a2);
        sb.append(".");
        sb.append(i);
        throw new dbht(sb.toString());
    }
}
