package defpackage;

import android.content.Context;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: antz  reason: default package */
/* loaded from: classes.dex */
public final class antz {
    private antz() {
    }

    public static int a(EllipticCurve ellipticCurve) {
        return (b(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    public static BigInteger b(EllipticCurve ellipticCurve) {
        ECField field = ellipticCurve.getField();
        if (field instanceof ECFieldFp) {
            return ((ECFieldFp) field).getP();
        }
        throw new GeneralSecurityException("Only curves over prime order fields are supported");
    }

    public static KeyPair c(ECParameterSpec eCParameterSpec) {
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) anub.f.a("EC");
        keyPairGenerator.initialize(eCParameterSpec);
        return keyPairGenerator.generateKeyPair();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(ECPoint eCPoint, EllipticCurve ellipticCurve) {
        BigInteger b = b(ellipticCurve);
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        if (affineX == null || affineY == null) {
            throw new GeneralSecurityException("point is at infinity");
        }
        if (affineX.signum() == -1 || affineX.compareTo(b) >= 0) {
            throw new GeneralSecurityException("x is out of range");
        }
        if (affineY.signum() == -1 || affineY.compareTo(b) >= 0) {
            throw new GeneralSecurityException("y is out of range");
        }
        if (!affineY.multiply(affineY).mod(b).equals(affineX.multiply(affineX).add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(b))) {
            throw new GeneralSecurityException("Point is not on curve");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(ECPublicKey eCPublicKey) {
        d(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
    }

    public static boolean f(byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int length = bArr.length;
        if (length >= 8 && bArr[0] == 48) {
            int i6 = bArr[1] & 255;
            if (i6 == 129) {
                i6 = bArr[2] & 255;
                if (i6 < 128) {
                    return false;
                }
                i = 2;
            } else if (i6 == 128 || i6 > 129) {
                return false;
            } else {
                i = 1;
            }
            if (i6 != (length - 1) - i || bArr[i + 1] != 2 || (i5 = (i4 = (i3 = i + 3) + (i2 = bArr[i + 2] & 255)) + 1) >= length || i2 == 0) {
                return false;
            }
            byte b = bArr[i3];
            if ((b & 255) >= 128) {
                return false;
            }
            if ((i2 > 1 && b == 0 && (bArr[i + 4] & 255) < 128) || bArr[i4] != 2) {
                return false;
            }
            int i7 = bArr[i5] & 255;
            if (i4 + 2 + i7 != length || i7 == 0) {
                return false;
            }
            byte b2 = bArr[i + 5 + i2];
            if ((b2 & 255) >= 128) {
                return false;
            }
            return i7 <= 1 || b2 != 0 || (bArr[(i + 6) + i2] & 255) >= 128;
        }
        return false;
    }

    public static byte[] g(byte[] bArr) {
        int length;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = bArr.length;
            if (i2 >= length || bArr[i2] != 0) {
                break;
            }
            i2++;
        }
        if (i2 == length) {
            i2 = length - 1;
        }
        if ((bArr[i2] & 128) == 128) {
            i = 1;
        }
        int i3 = length - i2;
        byte[] bArr2 = new byte[i3 + i];
        System.arraycopy(bArr, i2, bArr2, i, i3);
        return bArr2;
    }

    public static KeyPair h(int i) {
        return c(k(i));
    }

    public static ECPrivateKey i(int i, byte[] bArr) {
        return (ECPrivateKey) ((KeyFactory) anub.g.a("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArr), k(i)));
    }

    public static ECPublicKey j(int i, byte[] bArr, byte[] bArr2) {
        ECParameterSpec k = k(i);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, bArr), new BigInteger(1, bArr2));
        d(eCPoint, k.getCurve());
        return (ECPublicKey) ((KeyFactory) anub.g.a("EC")).generatePublic(new ECPublicKeySpec(eCPoint, k));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void l(long[] jArr, long[] jArr2, int i) {
        int i2 = -i;
        for (int i3 = 0; i3 < 10; i3++) {
            int i4 = (int) jArr[i3];
            jArr[i3] = ((((int) jArr2[i3]) ^ i4) & i2) ^ i4;
        }
    }

    public static final void m(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i2 = 0; i2 < i; i2++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static final boolean n(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null && bArr.length == bArr2.length) {
            int i = 0;
            for (int i2 = 0; i2 < bArr.length; i2++) {
                i |= bArr[i2] ^ bArr2[i2];
            }
            if (i == 0) {
                return true;
            }
        }
        return false;
    }

    public static byte[] o(byte[]... bArr) {
        int i = 0;
        for (byte[] bArr2 : bArr) {
            int length = bArr2.length;
            if (i > Integer.MAX_VALUE - length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i += length;
        }
        byte[] bArr3 = new byte[i];
        int i2 = 0;
        for (byte[] bArr4 : bArr) {
            int length2 = bArr4.length;
            System.arraycopy(bArr4, 0, bArr3, i2, length2);
            i2 += length2;
        }
        return bArr3;
    }

    public static final byte[] p(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length != bArr2.length) {
            throw new IllegalArgumentException("The lengths of x and y should match.");
        }
        return q(bArr, 0, bArr2, 0, length);
    }

    public static final byte[] q(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (bArr.length - i3 < i || bArr2.length - i3 < i2) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr3[i4] = (byte) (bArr[i4 + i] ^ bArr2[i4 + i2]);
        }
        return bArr3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] r(byte[] bArr) {
        int length = bArr.length;
        if (length >= 16) {
            throw new IllegalArgumentException("x must be smaller than a block.");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 16);
        copyOf[length] = Byte.MIN_VALUE;
        return copyOf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] s(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        for (int i = 0; i < 16; i++) {
            byte b = bArr[i];
            byte b2 = (byte) ((b + b) & 254);
            bArr2[i] = b2;
            if (i < 15) {
                bArr2[i] = (byte) (((bArr[i + 1] >> 7) & 1) | b2);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    public static amly t(Context context) {
        return ((amma) awwc.u(context, amma.class)).jr();
    }

    public static Object u(Context context, Class cls) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof axon) {
            try {
                return cls.cast(((axon) applicationContext).lI());
            } catch (ClassCastException e) {
                throw new IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonEntryPoint?", e);
            }
        }
        String valueOf = String.valueOf(applicationContext.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 72);
        sb.append("Given application context does not implement GeneratedComponentManager: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    public static ankt v(ankt anktVar, Callable callable, Executor executor) {
        anku b = anku.b(callable);
        anktVar.qY(b, executor);
        z(anktVar, b);
        return b;
    }

    public static ankt w(final ankt anktVar, aniq aniqVar, final Executor executor) {
        ankt v = anlz.v(new amet(aniqVar, anktVar), new Executor() { // from class: ames
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                ankt.this.qY(runnable, executor);
            }
        });
        z(anktVar, v);
        return v;
    }

    public static antz x() {
        return new antz();
    }

    private static ECParameterSpec y(String str, String str2, String str3, String str4, String str5) {
        BigInteger bigInteger = new BigInteger(str);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger("3")), new BigInteger(str3, 16)), new ECPoint(new BigInteger(str4, 16), new BigInteger(str5, 16)), new BigInteger(str2), 1);
    }

    private static void z(final ankt anktVar, final ankt anktVar2) {
        anktVar2.qY(new Runnable() { // from class: amer
            @Override // java.lang.Runnable
            public final void run() {
                ankt anktVar3 = ankt.this;
                ankt anktVar4 = anktVar;
                if (anktVar3.isCancelled()) {
                    anktVar4.cancel(true);
                }
            }
        }, anjk.a);
    }

    public static ECParameterSpec k(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 1) {
                return y("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319", "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643", "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef", "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f");
            }
            return y("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151", "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449", "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00", "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650");
        }
        return y("115792089210356248762697446949407573530086143415290314195533631308867097853951", "115792089210356248762697446949407573529996955224135760342422259061068512044369", "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5");
    }
}
