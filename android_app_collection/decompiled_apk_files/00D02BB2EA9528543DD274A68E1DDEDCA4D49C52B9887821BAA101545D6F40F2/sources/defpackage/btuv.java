package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: PG */
/* renamed from: btuv  reason: default package */
/* loaded from: classes4.dex */
public final class btuv {
    public static final String[] a;
    public static final String b;

    static {
        String[] strArr = {"com.google.android.geo.API_KEY", "com.google.android.maps.v2.API_KEY"};
        a = strArr;
        b = strArr[0];
    }

    @dzsi
    public static String a(PackageManager packageManager, String str) {
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            if (packageInfo != null && packageInfo.signatures != null && packageInfo.signatures.length != 0 && packageInfo.signatures[0] != null) {
                return b(packageInfo.signatures[0]);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    @dzsi
    public static String b(Signature signature) {
        byte[] digest;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            if (messageDigest != null && (digest = messageDigest.digest(signature.toByteArray())) != null) {
                char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
                int length = digest.length;
                StringBuilder sb = new StringBuilder(length + length);
                for (byte b2 : digest) {
                    sb.append(cArr[(b2 >> 4) & 15]);
                    sb.append(cArr[b2 & 15]);
                }
                return sb.toString();
            }
        } catch (NoSuchAlgorithmException unused) {
        }
        return null;
    }

    public static String c(Context context, String str) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
            String str2 = null;
            if (applicationInfo.metaData != null) {
                String[] strArr = a;
                int length = strArr.length;
                int i = 0;
                for (int i2 = 0; i2 < 2; i2++) {
                    String str3 = strArr[i2];
                    if (applicationInfo.metaData.containsKey(str3)) {
                        str2 = applicationInfo.metaData.getString(str3);
                        i++;
                    }
                }
                if (i > 1) {
                    String str4 = b;
                    StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 156);
                    sb.append("The API key can only be specified once. It is recommended that you use the meta-data tag with the name: ");
                    sb.append(str4);
                    sb.append(" in the <application> element of AndroidManifest.xml");
                    throw new RuntimeException(sb.toString());
                }
            }
            if (str2 != null) {
                return str2;
            }
            String str5 = b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 143);
            sb2.append("API key not found.  Check that <meta-data android:name=\"");
            sb2.append(str5);
            sb2.append("\" android:value=\"your API key\"/> is in the <application> element of AndroidManifest.xml");
            throw new RuntimeException(sb2.toString());
        } catch (PackageManager.NameNotFoundException e) {
            throw new AssertionError(e);
        }
    }
}
