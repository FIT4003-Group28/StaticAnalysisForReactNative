package defpackage;

import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
/* compiled from: PG */
/* renamed from: poc  reason: default package */
/* loaded from: classes7.dex */
public final class poc {
    private final String a;
    private final File b;
    private final ConcurrentHashMap<String, byte[]> c = new ConcurrentHashMap<>();
    private boolean d = false;

    public poc(String str, File file) {
        this.a = str;
        this.b = file;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.io.File b(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "UTF8"
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch: java.security.InvalidAlgorithmParameterException -> L53 java.security.InvalidKeyException -> L55 javax.crypto.NoSuchPaddingException -> L57 java.security.NoSuchAlgorithmException -> L59 javax.crypto.IllegalBlockSizeException -> L5b javax.crypto.BadPaddingException -> L5d
            java.lang.String r2 = r5.a     // Catch: java.security.InvalidAlgorithmParameterException -> L53 java.security.InvalidKeyException -> L55 javax.crypto.NoSuchPaddingException -> L57 java.security.NoSuchAlgorithmException -> L59 javax.crypto.IllegalBlockSizeException -> L5b javax.crypto.BadPaddingException -> L5d
            byte[] r2 = r2.getBytes(r0)     // Catch: java.security.InvalidAlgorithmParameterException -> L53 java.security.InvalidKeyException -> L55 javax.crypto.NoSuchPaddingException -> L57 java.security.NoSuchAlgorithmException -> L59 javax.crypto.IllegalBlockSizeException -> L5b javax.crypto.BadPaddingException -> L5d
            java.lang.String r3 = "AES"
            r1.<init>(r2, r3)     // Catch: java.security.InvalidAlgorithmParameterException -> L53 java.security.InvalidKeyException -> L55 javax.crypto.NoSuchPaddingException -> L57 java.security.NoSuchAlgorithmException -> L59 javax.crypto.IllegalBlockSizeException -> L5b javax.crypto.BadPaddingException -> L5d
            java.lang.String r2 = "AES/CBC/PKCS5Padding"
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r2)     // Catch: java.security.InvalidAlgorithmParameterException -> L53 java.security.InvalidKeyException -> L55 javax.crypto.NoSuchPaddingException -> L57 java.security.NoSuchAlgorithmException -> L59 javax.crypto.IllegalBlockSizeException -> L5b javax.crypto.BadPaddingException -> L5d
            javax.crypto.spec.IvParameterSpec r3 = new javax.crypto.spec.IvParameterSpec     // Catch: java.security.InvalidAlgorithmParameterException -> L53 java.security.InvalidKeyException -> L55 javax.crypto.NoSuchPaddingException -> L57 java.security.NoSuchAlgorithmException -> L59 javax.crypto.IllegalBlockSizeException -> L5b javax.crypto.BadPaddingException -> L5d
            java.lang.String r4 = r5.a     // Catch: java.security.InvalidAlgorithmParameterException -> L53 java.security.InvalidKeyException -> L55 javax.crypto.NoSuchPaddingException -> L57 java.security.NoSuchAlgorithmException -> L59 javax.crypto.IllegalBlockSizeException -> L5b javax.crypto.BadPaddingException -> L5d
            byte[] r0 = r4.getBytes(r0)     // Catch: java.security.InvalidAlgorithmParameterException -> L53 java.security.InvalidKeyException -> L55 javax.crypto.NoSuchPaddingException -> L57 java.security.NoSuchAlgorithmException -> L59 javax.crypto.IllegalBlockSizeException -> L5b javax.crypto.BadPaddingException -> L5d
            r3.<init>(r0)     // Catch: java.security.InvalidAlgorithmParameterException -> L53 java.security.InvalidKeyException -> L55 javax.crypto.NoSuchPaddingException -> L57 java.security.NoSuchAlgorithmException -> L59 javax.crypto.IllegalBlockSizeException -> L5b javax.crypto.BadPaddingException -> L5d
            r0 = 2
            r2.init(r0, r1, r3)     // Catch: java.security.InvalidAlgorithmParameterException -> L53 java.security.InvalidKeyException -> L55 javax.crypto.NoSuchPaddingException -> L57 java.security.NoSuchAlgorithmException -> L59 javax.crypto.IllegalBlockSizeException -> L5b javax.crypto.BadPaddingException -> L5d
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.security.InvalidAlgorithmParameterException -> L53 java.security.InvalidKeyException -> L55 javax.crypto.NoSuchPaddingException -> L57 java.security.NoSuchAlgorithmException -> L59 javax.crypto.IllegalBlockSizeException -> L5b javax.crypto.BadPaddingException -> L5d
            java.io.File r1 = r5.b     // Catch: java.security.InvalidAlgorithmParameterException -> L53 java.security.InvalidKeyException -> L55 javax.crypto.NoSuchPaddingException -> L57 java.security.NoSuchAlgorithmException -> L59 javax.crypto.IllegalBlockSizeException -> L5b javax.crypto.BadPaddingException -> L5d
            r0.<init>(r1)     // Catch: java.security.InvalidAlgorithmParameterException -> L53 java.security.InvalidKeyException -> L55 javax.crypto.NoSuchPaddingException -> L57 java.security.NoSuchAlgorithmException -> L59 javax.crypto.IllegalBlockSizeException -> L5b javax.crypto.BadPaddingException -> L5d
            java.io.File r1 = new java.io.File     // Catch: java.security.InvalidAlgorithmParameterException -> L53 java.security.InvalidKeyException -> L55 javax.crypto.NoSuchPaddingException -> L57 java.security.NoSuchAlgorithmException -> L59 javax.crypto.IllegalBlockSizeException -> L5b javax.crypto.BadPaddingException -> L5d
            r1.<init>(r6)     // Catch: java.security.InvalidAlgorithmParameterException -> L53 java.security.InvalidKeyException -> L55 javax.crypto.NoSuchPaddingException -> L57 java.security.NoSuchAlgorithmException -> L59 javax.crypto.IllegalBlockSizeException -> L5b javax.crypto.BadPaddingException -> L5d
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.security.InvalidAlgorithmParameterException -> L47 java.security.InvalidKeyException -> L49 javax.crypto.NoSuchPaddingException -> L4b java.security.NoSuchAlgorithmException -> L4d javax.crypto.IllegalBlockSizeException -> L4f javax.crypto.BadPaddingException -> L51
            r6.<init>(r1)     // Catch: java.security.InvalidAlgorithmParameterException -> L47 java.security.InvalidKeyException -> L49 javax.crypto.NoSuchPaddingException -> L4b java.security.NoSuchAlgorithmException -> L4d javax.crypto.IllegalBlockSizeException -> L4f javax.crypto.BadPaddingException -> L51
            byte[] r3 = defpackage.ddak.b(r0)     // Catch: java.security.InvalidAlgorithmParameterException -> L47 java.security.InvalidKeyException -> L49 javax.crypto.NoSuchPaddingException -> L4b java.security.NoSuchAlgorithmException -> L4d javax.crypto.IllegalBlockSizeException -> L4f javax.crypto.BadPaddingException -> L51
            byte[] r2 = r2.doFinal(r3)     // Catch: java.security.InvalidAlgorithmParameterException -> L47 java.security.InvalidKeyException -> L49 javax.crypto.NoSuchPaddingException -> L4b java.security.NoSuchAlgorithmException -> L4d javax.crypto.IllegalBlockSizeException -> L4f javax.crypto.BadPaddingException -> L51
            r6.write(r2)     // Catch: java.security.InvalidAlgorithmParameterException -> L47 java.security.InvalidKeyException -> L49 javax.crypto.NoSuchPaddingException -> L4b java.security.NoSuchAlgorithmException -> L4d javax.crypto.IllegalBlockSizeException -> L4f javax.crypto.BadPaddingException -> L51
            r0.close()
            r6.close()
            return r1
        L47:
            r6 = move-exception
            goto L5f
        L49:
            r6 = move-exception
            goto L5f
        L4b:
            r6 = move-exception
            goto L5f
        L4d:
            r6 = move-exception
            goto L5f
        L4f:
            r6 = move-exception
            goto L5f
        L51:
            r6 = move-exception
            goto L5f
        L53:
            r6 = move-exception
            goto L5e
        L55:
            r6 = move-exception
            goto L5e
        L57:
            r6 = move-exception
            goto L5e
        L59:
            r6 = move-exception
            goto L5e
        L5b:
            r6 = move-exception
            goto L5e
        L5d:
            r6 = move-exception
        L5e:
            r1 = 0
        L5f:
            if (r1 == 0) goto L64
            r1.delete()
        L64:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.poc.b(java.lang.String):java.io.File");
    }

    public final byte[] a(String str) {
        ZipFile zipFile;
        InputStream inputStream;
        if (!this.d) {
            SystemClock.elapsedRealtime();
            File file = null;
            try {
                if (this.a.isEmpty()) {
                    zipFile = new ZipFile(this.b);
                } else {
                    file = b(String.valueOf(this.b.getParent()).concat("temp.zip"));
                    zipFile = new ZipFile(file);
                }
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry nextElement = entries.nextElement();
                    if (!nextElement.isDirectory() && (inputStream = zipFile.getInputStream(nextElement)) != null) {
                        ConcurrentHashMap<String, byte[]> concurrentHashMap = this.c;
                        String name = nextElement.getName();
                        if (name.contains("..")) {
                            for (File file2 = new File(name); file2 != null; file2 = file2.getParentFile()) {
                                if (file2.getName().equals("..")) {
                                    String valueOf = String.valueOf(name);
                                    throw new ZipException(valueOf.length() != 0 ? "Illegal name: ".concat(valueOf) : new String("Illegal name: "));
                                }
                            }
                        }
                        concurrentHashMap.put(name, ddak.b(inputStream));
                    }
                }
            } catch (IOException unused) {
            }
            if (file != null) {
                file.delete();
            }
            SystemClock.elapsedRealtime();
            this.d = true;
        }
        if (this.c.containsKey(str)) {
            return this.c.get(str);
        }
        this.b.getName();
        return new byte[0];
    }
}
