package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: PG */
/* renamed from: deka  reason: default package */
/* loaded from: classes6.dex */
public final class deka {
    private static final Charset a = Charset.forName("UTF-8");

    public static Long a(String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(a));
            return Long.valueOf(ByteBuffer.wrap(messageDigest.digest()).getLong());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
