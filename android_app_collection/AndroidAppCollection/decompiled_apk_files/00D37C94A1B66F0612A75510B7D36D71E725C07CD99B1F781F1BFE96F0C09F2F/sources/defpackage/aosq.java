package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: PG */
/* renamed from: aosq  reason: default package */
/* loaded from: classes.dex */
public abstract class aosq implements aoso {
    public static long c(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(amoz.c));
            return ByteBuffer.wrap(messageDigest.digest()).getLong();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static aoso d(long j, aorb aorbVar) {
        return new aosp(j, aorbVar);
    }

    public abstract long a();

    public abstract aorb b();
}
