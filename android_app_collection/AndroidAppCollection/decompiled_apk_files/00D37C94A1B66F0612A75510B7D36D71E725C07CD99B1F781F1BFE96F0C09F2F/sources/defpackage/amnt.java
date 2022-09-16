package defpackage;

import android.content.Context;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: amnt  reason: default package */
/* loaded from: classes.dex */
public final class amnt {
    public static volatile ayax a;

    private amnt() {
    }

    public static int A(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int B(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static void a(Context context) {
        ((amnf) antz.u(context, amnf.class)).jo();
    }

    public static void b(Context context) {
        ((amnf) antz.u(context, amnf.class)).jo();
    }

    public static ankt c(ankt anktVar, Class cls, anir anirVar, Executor executor) {
        return anhq.i(anktVar, cls, ammo.c(anirVar), executor);
    }

    public static ankt d(Callable callable, Executor executor) {
        return anlz.u(ammo.g(callable), executor);
    }

    public static ankt e(ankt anktVar, ampg ampgVar, Executor executor) {
        return anii.h(anktVar, ammo.a(ampgVar), executor);
    }

    public static ankt f(ankt anktVar, anir anirVar, Executor executor) {
        return anii.i(anktVar, ammo.c(anirVar), executor);
    }

    public static void g(ankt anktVar, ankb ankbVar, Executor executor) {
        anlz.A(anktVar, ammo.e(ankbVar), executor);
    }

    public static final ankt h(Callable callable, Executor executor, ankg ankgVar) {
        return ankgVar.a(ammo.g(callable), executor);
    }

    public static int i() {
        try {
            return Class.forName("android.os.Build$VERSION").getDeclaredField("SDK_INT").getInt(null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return -1;
        }
    }

    public static BigInteger j(byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    public static boolean k() {
        return "The Android Project".equals(System.getProperty("java.vendor"));
    }

    public static byte[] l(BigInteger bigInteger, int i) {
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        if (length == i) {
            return byteArray;
        }
        int i2 = i + 1;
        if (length > i2) {
            throw new GeneralSecurityException("integer too large");
        }
        if (length == i2) {
            if (byteArray[0] == 0) {
                return Arrays.copyOfRange(byteArray, 1, length);
            }
            throw new GeneralSecurityException("integer too large");
        }
        byte[] bArr = new byte[i];
        System.arraycopy(byteArray, 0, bArr, i - length, length);
        return bArr;
    }

    public static String m(int i) {
        int i2 = i - 1;
        return i2 != 2 ? i2 != 3 ? "SHA-512" : "SHA-384" : "SHA-256";
    }

    public static String n(int i) {
        String t = t(i);
        int i2 = anus.a;
        StringBuilder sb = new StringBuilder(t.length() + 9);
        sb.append(t);
        sb.append("withECDSA");
        return sb.toString();
    }

    public static byte[] o(byte[] bArr, int i, int i2) {
        MessageDigest messageDigest = (MessageDigest) anub.d.a(m(i2));
        int digestLength = messageDigest.getDigestLength();
        byte[] bArr2 = new byte[i];
        int i3 = 0;
        for (int i4 = 0; i4 <= (i - 1) / digestLength; i4++) {
            messageDigest.reset();
            messageDigest.update(bArr);
            messageDigest.update(l(BigInteger.valueOf(i4), 4));
            byte[] digest = messageDigest.digest();
            int length = digest.length;
            System.arraycopy(digest, 0, bArr2, i3, Math.min(length, i - i3));
            i3 += length;
        }
        return bArr2;
    }

    public static long p(byte[] bArr, int i, int i2) {
        return (q(bArr, i) >> i2) & 67108863;
    }

    public static long q(byte[] bArr, int i) {
        return (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16)) & 4294967295L;
    }

    public static void r(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }

    public static byte[] s(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i + i;
            int digit = Character.digit(str.charAt(i2), 16);
            int digit2 = Character.digit(str.charAt(i2 + 1), 16);
            if (digit != -1 && digit2 != -1) {
                bArr[i] = (byte) ((digit * 16) + digit2);
            } else {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
        }
        return bArr;
    }

    public static /* synthetic */ String t(int i) {
        return i != 3 ? i != 4 ? "SHA512" : "SHA384" : "SHA256";
    }

    public static int u(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static int v(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int w(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int x(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int y(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static int z(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }
}
