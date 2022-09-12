package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: clsu  reason: default package */
/* loaded from: classes5.dex */
public final class clsu {
    public static List<byte[]> a(byte[] bArr) {
        byte b = bArr[11];
        byte b2 = bArr[10];
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(b(c(((b & 255) << 8) | (b2 & 255))));
        arrayList.add(b(c(3840L)));
        return arrayList;
    }

    private static byte[] b(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }

    private static long c(long j) {
        return (j * 1000000000) / 48000;
    }
}
