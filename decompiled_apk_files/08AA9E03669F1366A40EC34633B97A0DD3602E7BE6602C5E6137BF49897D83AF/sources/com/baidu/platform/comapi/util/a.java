package com.baidu.platform.comapi.util;

import android.content.Context;
import com.google.android.gms.common.util.AndroidUtilsLight;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
/* loaded from: classes.dex */
public class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.baidu.platform.comapi.util.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0039a {
        public static String a(byte[] bArr) {
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            StringBuilder sb = new StringBuilder(bArr.length * 2);
            for (int i = 0; i < bArr.length; i++) {
                sb.append(cArr[(bArr[i] & 240) >> 4]);
                sb.append(cArr[bArr[i] & 15]);
            }
            return sb.toString();
        }
    }

    public static String a(Context context) {
        String packageName = context.getPackageName();
        String a2 = a(context, packageName);
        return a2 + ";" + packageName;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(android.content.Context r3, java.lang.String r4) {
        /*
            java.lang.String r0 = ""
            r1 = 0
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: java.security.cert.CertificateException -> L2b android.content.pm.PackageManager.NameNotFoundException -> L30
            r2 = 64
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r4, r2)     // Catch: java.security.cert.CertificateException -> L2b android.content.pm.PackageManager.NameNotFoundException -> L30
            android.content.pm.Signature[] r3 = r3.signatures     // Catch: java.security.cert.CertificateException -> L2b android.content.pm.PackageManager.NameNotFoundException -> L30
            java.lang.String r4 = "X.509"
            java.security.cert.CertificateFactory r4 = java.security.cert.CertificateFactory.getInstance(r4)     // Catch: java.security.cert.CertificateException -> L2b android.content.pm.PackageManager.NameNotFoundException -> L30
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.security.cert.CertificateException -> L2b android.content.pm.PackageManager.NameNotFoundException -> L30
            r3 = r3[r1]     // Catch: java.security.cert.CertificateException -> L2b android.content.pm.PackageManager.NameNotFoundException -> L30
            byte[] r3 = r3.toByteArray()     // Catch: java.security.cert.CertificateException -> L2b android.content.pm.PackageManager.NameNotFoundException -> L30
            r2.<init>(r3)     // Catch: java.security.cert.CertificateException -> L2b android.content.pm.PackageManager.NameNotFoundException -> L30
            java.security.cert.Certificate r3 = r4.generateCertificate(r2)     // Catch: java.security.cert.CertificateException -> L2b android.content.pm.PackageManager.NameNotFoundException -> L30
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3     // Catch: java.security.cert.CertificateException -> L2b android.content.pm.PackageManager.NameNotFoundException -> L30
            java.lang.String r3 = a(r3)     // Catch: java.security.cert.CertificateException -> L2b android.content.pm.PackageManager.NameNotFoundException -> L30
            goto L35
        L2b:
            r3 = move-exception
            r3.printStackTrace()
            goto L34
        L30:
            r3 = move-exception
            r3.printStackTrace()
        L34:
            r3 = r0
        L35:
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
        L3a:
            int r0 = r3.length()
            if (r1 >= r0) goto L5d
            char r0 = r3.charAt(r1)
            r4.append(r0)
            if (r1 <= 0) goto L5a
            int r0 = r1 % 2
            r2 = 1
            if (r0 != r2) goto L5a
            int r0 = r3.length()
            int r0 = r0 - r2
            if (r1 >= r0) goto L5a
            java.lang.String r0 = ":"
            r4.append(r0)
        L5a:
            int r1 = r1 + 1
            goto L3a
        L5d:
            java.lang.String r3 = r4.toString()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.platform.comapi.util.a.a(android.content.Context, java.lang.String):java.lang.String");
    }

    static String a(X509Certificate x509Certificate) {
        try {
            return C0039a.a(a(x509Certificate.getEncoded()));
        } catch (CertificateEncodingException unused) {
            return null;
        }
    }

    static byte[] a(byte[] bArr) {
        try {
            return MessageDigest.getInstance(AndroidUtilsLight.DIGEST_ALGORITHM_SHA1).digest(bArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
