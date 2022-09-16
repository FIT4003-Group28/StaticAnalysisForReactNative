package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: PG */
/* renamed from: tyc  reason: default package */
/* loaded from: classes4.dex */
public final class tyc {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i = 0;
        for (byte b : bArr) {
            int i2 = b & 255;
            int i3 = i + 1;
            char[] cArr2 = a;
            cArr[i] = cArr2[i2 >>> 4];
            i = i3 + 1;
            cArr[i3] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    public static void b(vjb vjbVar, tqk tqkVar, Uri uri, String str) {
        try {
            if (!vjbVar.h(uri)) {
                typ.e("%s: Downloaded file %s is not present at %s", "FileValidator", tzc.g(tqkVar), uri);
                tpy a2 = tqa.a();
                a2.a = tpz.DOWNLOADED_FILE_NOT_FOUND_ERROR;
                throw a2.a();
            }
            int c = tqn.c(tqkVar.f);
            if (c != 0 && c == 2) {
                return;
            }
            if (c(vjbVar, uri, str)) {
                return;
            }
            typ.e("%s: Downloaded file at uri = %s, checksum = %s verification failed", "FileValidator", uri, str);
            tpy a3 = tqa.a();
            a3.a = tpz.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR;
            throw a3.a();
        } catch (IOException e) {
            typ.f(e, "%s: Failed to validate download file %s", "FileValidator", tzc.g(tqkVar));
            tpy a4 = tqa.a();
            a4.a = tpz.UNABLE_TO_VALIDATE_DOWNLOAD_FILE_ERROR;
            a4.c = e;
            throw a4.a();
        }
    }

    public static boolean c(vjb vjbVar, Uri uri, String str) {
        String a2;
        String str2 = "";
        try {
            InputStream inputStream = (InputStream) vjbVar.c(uri, vkk.b());
            MessageDigest d = d();
            if (d == null) {
                a2 = str2;
            } else {
                byte[] bArr = new byte[8192];
                for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                    d.update(bArr, 0, read);
                }
                a2 = a(d.digest());
            }
            if (inputStream != null) {
                inputStream.close();
            }
            str2 = a2;
        } catch (IOException unused) {
            typ.d("%s: Failed to open file, uri = %s", "FileValidator", uri);
        }
        return str2.equals(str);
    }

    public static MessageDigest d() {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            if (messageDigest == null) {
                return null;
            }
            return messageDigest;
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
