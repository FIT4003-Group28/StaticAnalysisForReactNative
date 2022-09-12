package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: PG */
/* renamed from: cnxh  reason: default package */
/* loaded from: classes5.dex */
public final class cnxh {
    private static volatile int a = -1;

    public static MessageDigest a(String str) {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance(str);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }
}
