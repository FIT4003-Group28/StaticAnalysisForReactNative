package defpackage;

import android.content.SharedPreferences;
import android.util.Base64;
import com.google.android.filament.R;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
/* compiled from: PG */
/* renamed from: detl  reason: default package */
/* loaded from: classes6.dex */
public final class detl {
    public static final String[] a = {"*", "FCM", "GCM", ""};
    public final SharedPreferences b;
    public final String c;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
        if (r0.isEmpty() != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public detl(defpackage.dela r4) {
        /*
            r3 = this;
            r3.<init>()
            android.content.Context r0 = r4.a()
            java.lang.String r1 = "com.google.android.gms.appid"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            r3.b = r0
            dele r0 = r4.c()
            java.lang.String r0 = r0.c
            r1 = 0
            if (r0 == 0) goto L1a
            goto L46
        L1a:
            dele r4 = r4.c()
            java.lang.String r0 = r4.b
            java.lang.String r4 = "1:"
            boolean r4 = r0.startsWith(r4)
            if (r4 != 0) goto L30
            java.lang.String r4 = "2:"
            boolean r4 = r0.startsWith(r4)
            if (r4 == 0) goto L46
        L30:
            java.lang.String r4 = ":"
            java.lang.String[] r4 = r0.split(r4)
            int r0 = r4.length
            r2 = 4
            if (r0 == r2) goto L3c
        L3a:
            r0 = r1
            goto L46
        L3c:
            r0 = 1
            r0 = r4[r0]
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L46
            goto L3a
        L46:
            r3.c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.detl.<init>(dela):void");
    }

    public static String a(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static final PublicKey b(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
            sb.append("Invalid key stored ");
            sb.append(valueOf);
            sb.toString();
            return null;
        }
    }
}