package com.google.firebase.installations;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;
/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private static final byte f9365a = Byte.parseByte("01110000", 2);

    /* renamed from: b  reason: collision with root package name */
    private static final byte f9366b = Byte.parseByte("00001111", 2);

    private static String a(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    private static byte[] a(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    public String a() {
        byte[] a2 = a(UUID.randomUUID(), new byte[17]);
        a2[16] = a2[0];
        a2[0] = (byte) ((f9366b & a2[0]) | f9365a);
        return a(a2);
    }
}
