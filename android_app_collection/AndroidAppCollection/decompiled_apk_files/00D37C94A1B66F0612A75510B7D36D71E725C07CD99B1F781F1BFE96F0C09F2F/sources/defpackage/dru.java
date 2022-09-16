package defpackage;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: dru  reason: default package */
/* loaded from: classes3.dex */
public final class dru {
    static boolean a = false;
    public static MessageDigest b;
    private static final Object d = new Object();
    private static final Object e = new Object();
    public static final CountDownLatch c = new CountDownLatch(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(dnw dnwVar, String str) {
        byte[] g;
        byte[] byteArray = dnwVar.toByteArray();
        if (((Boolean) qdb.t.e()).booleanValue()) {
            Vector e2 = e(byteArray);
            if (e2 == null || e2.size() == 0) {
                g = g(f().toByteArray(), str, true);
            } else {
                aopa createBuilder = dob.a.createBuilder();
                int size = e2.size();
                for (int i = 0; i < size; i++) {
                    createBuilder.f(aoob.x(g((byte[]) e2.get(i), str, false)));
                }
                aoob x = aoob.x(c(byteArray));
                createBuilder.copyOnWrite();
                dob dobVar = (dob) createBuilder.instance;
                dobVar.b |= 1;
                dobVar.d = x;
                g = ((dob) createBuilder.mo39build()).toByteArray();
            }
        } else if (ehi.a == null) {
            throw new GeneralSecurityException();
        } else {
            byte[] a2 = ehi.a.a(byteArray, str != null ? str.getBytes() : new byte[0]);
            aopa createBuilder2 = dob.a.createBuilder();
            createBuilder2.f(aoob.x(a2));
            createBuilder2.copyOnWrite();
            dob dobVar2 = (dob) createBuilder2.instance;
            dobVar2.e = 2;
            dobVar2.b |= 4;
            g = ((dob) createBuilder2.mo39build()).toByteArray();
        }
        return ehi.j(g, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b() {
        synchronized (e) {
            if (!a) {
                a = true;
                new Thread(new bhj(2)).start();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
        r1.reset();
        r1.update(r6);
        r6 = defpackage.dru.b.digest();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] c(byte[] r6) {
        /*
            java.lang.Object r0 = defpackage.dru.d
            monitor-enter(r0)
            b()     // Catch: java.lang.Throwable -> L34
            r1 = 0
            java.util.concurrent.CountDownLatch r2 = defpackage.dru.c     // Catch: java.lang.InterruptedException -> L1b java.lang.Throwable -> L34
            r3 = 2
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L1b java.lang.Throwable -> L34
            boolean r2 = r2.await(r3, r5)     // Catch: java.lang.InterruptedException -> L1b java.lang.Throwable -> L34
            if (r2 != 0) goto L14
            goto L1c
        L14:
            java.security.MessageDigest r2 = defpackage.dru.b     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto L19
            goto L1c
        L19:
            r1 = r2
            goto L1c
        L1b:
        L1c:
            if (r1 == 0) goto L2c
            r1.reset()     // Catch: java.lang.Throwable -> L34
            r1.update(r6)     // Catch: java.lang.Throwable -> L34
            java.security.MessageDigest r6 = defpackage.dru.b     // Catch: java.lang.Throwable -> L34
            byte[] r6 = r6.digest()     // Catch: java.lang.Throwable -> L34
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return r6
        L2c:
            java.security.NoSuchAlgorithmException r6 = new java.security.NoSuchAlgorithmException     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "Cannot compute hash"
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L34
            throw r6     // Catch: java.lang.Throwable -> L34
        L34:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dru.c(byte[]):byte[]");
    }

    public static byte[] d(String str, String str2) {
        byte[] k;
        aopa createBuilder = dnx.a.createBuilder();
        try {
            if (str.length() < 3) {
                k = str.getBytes("ISO-8859-1");
            } else {
                k = ehi.k(str, true);
            }
            aoob x = aoob.x(k);
            createBuilder.copyOnWrite();
            dnx dnxVar = (dnx) createBuilder.instance;
            dnxVar.b |= 1;
            dnxVar.c = x;
            aoob x2 = aoob.x(str2.length() < 3 ? str2.getBytes("ISO-8859-1") : ehi.k(str2, true));
            createBuilder.copyOnWrite();
            dnx dnxVar2 = (dnx) createBuilder.instance;
            dnxVar2.b |= 2;
            dnxVar2.d = x2;
            return ((dnx) createBuilder.mo39build()).toByteArray();
        } catch (UnsupportedEncodingException | GeneralSecurityException unused) {
            return null;
        }
    }

    static Vector e(byte[] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return null;
        }
        int i = (length + 254) / PrivateKeyType.INVALID;
        Vector vector = new Vector();
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 * PrivateKeyType.INVALID;
            try {
                int length2 = bArr.length;
                if (length2 - i3 > 255) {
                    length2 = i3 + PrivateKeyType.INVALID;
                }
                vector.add(Arrays.copyOfRange(bArr, i3, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    static dnw f() {
        aopa createBuilder = dnw.a.createBuilder();
        createBuilder.copyOnWrite();
        dnw dnwVar = (dnw) createBuilder.instance;
        dnwVar.b |= 524288;
        dnwVar.p = 4096L;
        return (dnw) createBuilder.mo39build();
    }

    private static byte[] g(byte[] bArr, String str, boolean z) {
        byte[] array;
        int i = true != z ? PrivateKeyType.INVALID : 239;
        if (bArr.length > i) {
            bArr = f().toByteArray();
        }
        int length = bArr.length;
        if (length < i) {
            byte[] bArr2 = new byte[i - length];
            new SecureRandom().nextBytes(bArr2);
            array = ByteBuffer.allocate(i + 1).put((byte) length).put(bArr).put(bArr2).array();
        } else {
            array = ByteBuffer.allocate(i + 1).put((byte) length).put(bArr).array();
        }
        if (z) {
            array = ByteBuffer.allocate(256).put(c(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        drv[] drvVarArr = new dsi().cG;
        int length2 = drvVarArr.length;
        for (int i2 = 0; i2 < 12; i2++) {
            drvVarArr[i2].a(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            aohm aohmVar = new aohm(str.getBytes("UTF-8"));
            int i3 = aohmVar.b;
            int i4 = aohmVar.c;
            for (int i5 = 0; i5 < 256; i5++) {
                i3 = (i3 + 1) & PrivateKeyType.INVALID;
                byte[] bArr4 = aohmVar.a;
                byte b2 = bArr4[i3];
                i4 = (i4 + b2) & PrivateKeyType.INVALID;
                bArr4[i3] = bArr4[i4];
                bArr4[i4] = b2;
                bArr3[i5] = (byte) (bArr4[(bArr4[i3] + b2) & PrivateKeyType.INVALID] ^ bArr3[i5]);
            }
            aohmVar.b = i3;
            aohmVar.c = i4;
        }
        return bArr3;
    }
}
