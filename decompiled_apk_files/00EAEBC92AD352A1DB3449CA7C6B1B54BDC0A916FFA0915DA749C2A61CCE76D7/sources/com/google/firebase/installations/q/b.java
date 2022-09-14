package com.google.firebase.installations.q;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class b {

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f9383c = {"*", "FCM", "GCM", ""};

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f9384a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9385b;

    public b(c.e.b.d dVar) {
        this.f9384a = dVar.b().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f9385b = a(dVar);
    }

    private static String a(c.e.b.d dVar) {
        String e2 = dVar.d().e();
        if (e2 != null) {
            return e2;
        }
        String b2 = dVar.d().b();
        if (!b2.startsWith("1:") && !b2.startsWith("2:")) {
            return b2;
        }
        String[] split = b2.split(":");
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (!str.isEmpty()) {
            return str;
        }
        return null;
    }

    private String a(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    private String a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    private static String a(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    private PublicKey b(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e2) {
            Log.w("ContentValues", "Invalid key stored " + e2);
            return null;
        }
    }

    private String c() {
        String string;
        synchronized (this.f9384a) {
            string = this.f9384a.getString("|S|id", null);
        }
        return string;
    }

    private String d() {
        synchronized (this.f9384a) {
            String string = this.f9384a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            PublicKey b2 = b(string);
            if (b2 == null) {
                return null;
            }
            return a(b2);
        }
    }

    public String a() {
        synchronized (this.f9384a) {
            String c2 = c();
            if (c2 != null) {
                return c2;
            }
            return d();
        }
    }

    public String b() {
        synchronized (this.f9384a) {
            for (String str : f9383c) {
                String string = this.f9384a.getString(a(this.f9385b, str), null);
                if (string != null && !string.isEmpty()) {
                    if (string.startsWith("{")) {
                        string = a(string);
                    }
                    return string;
                }
            }
            return null;
        }
    }
}
