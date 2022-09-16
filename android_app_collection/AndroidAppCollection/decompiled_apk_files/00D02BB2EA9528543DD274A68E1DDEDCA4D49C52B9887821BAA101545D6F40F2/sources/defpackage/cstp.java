package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: cstp  reason: default package */
/* loaded from: classes5.dex */
public final class cstp {
    public static byte[] a(String str) {
        return str.getBytes(StandardCharsets.UTF_8);
    }

    public static dcdc<Byte> b(byte[] bArr) {
        List debzVar;
        int length = bArr.length;
        if (length == 0) {
            debzVar = Collections.emptyList();
        } else {
            debzVar = new debz(bArr, 0, length);
        }
        return dcdc.r(debzVar);
    }
}
