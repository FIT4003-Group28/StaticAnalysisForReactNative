package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: rzv  reason: default package */
/* loaded from: classes4.dex */
public final class rzv {
    private static final anay a = sbs.e();

    public static ampq a(PackageManager packageManager, List list, List list2, String str) {
        String b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aoev aoevVar = (aoev) it.next();
            Intent intent = new Intent(aoevVar.d);
            intent.setPackage(aoevVar.b);
            if (packageManager.resolveActivity(intent, 65536) != null && (b = b(packageManager, aoevVar.b)) != null && akzj.i(b, aoevVar.c)) {
                intent.putExtra("CLIENT_ID", str);
                intent.putExtra("SCOPE", (String[]) list2.toArray(new String[0]));
                intent.putExtra("REDIRECT_URI", aoevVar.e);
                return ampq.j(intent);
            }
        }
        return amon.a;
    }

    private static String b(PackageManager packageManager, String str) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(packageManager.getPackageInfo(str, 64).signatures[0].toByteArray()))).getEncoded());
            Formatter formatter = new Formatter();
            int i = 0;
            while (true) {
                int length = digest.length - 1;
                if (i >= length) {
                    formatter.format("%02x", Byte.valueOf(digest[length]));
                    return formatter.toString();
                }
                formatter.format("%02x:", Byte.valueOf(digest[i]));
                i++;
            }
        } catch (PackageManager.NameNotFoundException e) {
            ((anav) ((anav) ((anav) a.e()).h(e)).i("com/google/android/libraries/accountlinking/util/AppFlipHelper", "getCertificateFingerprint", 77, "AppFlipHelper.java")).q("Failed to find an app with the given package name");
            return null;
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
            ((anav) ((anav) ((anav) a.e()).h(e)).i("com/google/android/libraries/accountlinking/util/AppFlipHelper", "getCertificateFingerprint", 75, "AppFlipHelper.java")).q("Failed to process the certificate");
            return null;
        } catch (CertificateException e3) {
            e = e3;
            ((anav) ((anav) ((anav) a.e()).h(e)).i("com/google/android/libraries/accountlinking/util/AppFlipHelper", "getCertificateFingerprint", 75, "AppFlipHelper.java")).q("Failed to process the certificate");
            return null;
        }
    }
}
