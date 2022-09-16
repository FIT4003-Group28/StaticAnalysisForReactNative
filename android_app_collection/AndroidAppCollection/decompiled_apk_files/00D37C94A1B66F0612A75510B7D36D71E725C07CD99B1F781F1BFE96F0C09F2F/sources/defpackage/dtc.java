package defpackage;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: PG */
/* renamed from: dtc  reason: default package */
/* loaded from: classes3.dex */
public final class dtc {
    private static Cipher a;
    private static final Object b = new Object();
    private static final Object c = new Object();

    public static final byte[] a(byte[] bArr, String str) {
        byte[] doFinal;
        int length = bArr.length;
        try {
            byte[] k = ehi.k(str, false);
            int length2 = k.length;
            if (length2 > 16) {
                ByteBuffer allocate = ByteBuffer.allocate(length2);
                allocate.put(k);
                allocate.flip();
                byte[] bArr2 = new byte[16];
                byte[] bArr3 = new byte[length2 - 16];
                allocate.get(bArr2);
                allocate.get(bArr3);
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                synchronized (b) {
                    c().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                    doFinal = c().doFinal(bArr3);
                }
                return doFinal;
            }
            throw new dtb();
        } catch (IllegalArgumentException e) {
            throw new dtb(e);
        } catch (InvalidAlgorithmParameterException e2) {
            throw new dtb(e2);
        } catch (InvalidKeyException e3) {
            throw new dtb(e3);
        } catch (NoSuchAlgorithmException e4) {
            throw new dtb(e4);
        } catch (BadPaddingException e5) {
            throw new dtb(e5);
        } catch (IllegalBlockSizeException e6) {
            throw new dtb(e6);
        } catch (NoSuchPaddingException e7) {
            throw new dtb(e7);
        }
    }

    public static final String b(byte[] bArr, byte[] bArr2) {
        byte[] doFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (b) {
                c().init(1, secretKeySpec, (SecureRandom) null);
                doFinal = c().doFinal(bArr2);
                iv = c().getIV();
            }
            int length2 = doFinal.length + iv.length;
            ByteBuffer allocate = ByteBuffer.allocate(length2);
            allocate.put(iv).put(doFinal);
            allocate.flip();
            byte[] bArr3 = new byte[length2];
            allocate.get(bArr3);
            return ehi.j(bArr3, false);
        } catch (InvalidKeyException e) {
            throw new dtb(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new dtb(e2);
        } catch (BadPaddingException e3) {
            throw new dtb(e3);
        } catch (IllegalBlockSizeException e4) {
            throw new dtb(e4);
        } catch (NoSuchPaddingException e5) {
            throw new dtb(e5);
        }
    }

    private static final Cipher c() {
        Cipher cipher;
        synchronized (c) {
            if (a == null) {
                a = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = a;
        }
        return cipher;
    }
}
