package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.spotify.sdk.android.authentication.AuthenticationRequest;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: PG */
/* renamed from: dxif  reason: default package */
/* loaded from: classes6.dex */
public final class dxif {
    private static final String[] b = {".debug", ".canary", ".partners", ""};
    private static final String[] c = {"80abdd17dcc4cb3a33815d354355bf87c9378624", "88df4d670ed5e01fc7b3eff13b63258628ff5a00", "d834ae340d1e854c5f4092722f9788216d9221e5", "1cbedd9e7345f64649bad2b493a20d9eea955352", "4b3d76a2de89033ea830f476a1f815692938e33b"};
    private static final char[] e = "0123456789abcdef".toCharArray();
    public final Activity a;
    private final AuthenticationRequest d;

    public dxif(Activity activity, AuthenticationRequest authenticationRequest) {
        this.a = activity;
        this.d = authenticationRequest;
    }

    private static String b(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            byte[] bytes = str.getBytes("UTF-8");
            messageDigest.update(bytes, 0, bytes.length);
            byte[] digest = messageDigest.digest();
            int length = digest.length;
            char[] cArr = new char[length + length];
            for (int i = 0; i < digest.length; i++) {
                int i2 = digest[i] & 255;
                int i3 = i + i;
                char[] cArr2 = e;
                cArr[i3] = cArr2[i2 >>> 4];
                cArr[i3 + 1] = cArr2[i2 & 15];
            }
            return new String(cArr);
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public final boolean a() {
        String[] strArr = b;
        int length = strArr.length;
        Intent intent = null;
        for (int i = 0; i < 4; i++) {
            String valueOf = String.valueOf(strArr[i]);
            String concat = valueOf.length() != 0 ? "com.spotify.music".concat(valueOf) : new String("com.spotify.music");
            Intent intent2 = new Intent("com.spotify.sso.action.START_AUTH_FLOW");
            intent2.setPackage(concat);
            ComponentName resolveActivity = intent2.resolveActivity(this.a.getPackageManager());
            if (resolveActivity != null) {
                try {
                    PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(resolveActivity.getPackageName(), 64);
                    if (packageInfo.signatures != null) {
                        for (Signature signature : packageInfo.signatures) {
                            String b2 = b(signature.toCharsString());
                            String[] strArr2 = c;
                            int length2 = strArr2.length;
                            for (int i2 = 0; i2 < 5; i2++) {
                                if (strArr2[i2].equals(b2)) {
                                    intent = intent2;
                                    break;
                                }
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            intent = null;
            if (intent != null) {
                break;
            }
        }
        if (intent == null) {
            return false;
        }
        intent.putExtra("VERSION", 1);
        intent.putExtra("CLIENT_ID", this.d.a);
        intent.putExtra("REDIRECT_URI", this.d.c);
        intent.putExtra("RESPONSE_TYPE", this.d.b);
        intent.putExtra("SCOPES", this.d.d);
        try {
            this.a.startActivityForResult(intent, 1138);
            return true;
        } catch (ActivityNotFoundException unused2) {
            return false;
        }
    }
}
