package defpackage;

import android.content.Context;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: aias  reason: default package */
/* loaded from: classes2.dex */
public final class aias {
    private static final byte[] b = {108, 120, -8, 70, -88, 67, 10, -40, -97, -34, 27, 1, -10, 113, -21, 84, 59, 90, 45, -68, 27, -97, 44, 28, -53, 74, 100, -9, 102, 94, 104, 37};
    private static final byte[] c = {-41, -114, 23, -49, -117, -25, 118, -59, 114, 59, -88, 95, -36, 102, -57, 47, 51, 72, 67, -39, -72, -81, -18, 53, -36, -32, 77, -24, -55, 110, -18, -10};
    public final Context a;

    public aias(Context context) {
        this.a = context;
    }

    public static boolean a(byte[] bArr) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(bArr);
            return Arrays.equals(digest, b) || Arrays.equals(digest, c);
        } catch (NoSuchAlgorithmException unused) {
            return false;
        }
    }
}
