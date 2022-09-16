package com.google.android.gms.auth.api.signin.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.s;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
/* loaded from: classes.dex */
public class a {

    /* renamed from: c  reason: collision with root package name */
    private static final Lock f6785c = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    private static a f6786d;

    /* renamed from: a  reason: collision with root package name */
    private final Lock f6787a = new ReentrantLock();

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f6788b;

    private a(Context context) {
        this.f6788b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    private final GoogleSignInAccount a(String str) {
        String b2;
        if (!TextUtils.isEmpty(str) && (b2 = b(a("googleSignInAccount", str))) != null) {
            try {
                return GoogleSignInAccount.a(b2);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public static a a(Context context) {
        s.a(context);
        f6785c.lock();
        try {
            if (f6786d == null) {
                f6786d = new a(context.getApplicationContext());
            }
            return f6786d;
        } finally {
            f6785c.unlock();
        }
    }

    private static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    private final String b(String str) {
        this.f6787a.lock();
        try {
            return this.f6788b.getString(str, null);
        } finally {
            this.f6787a.unlock();
        }
    }

    public GoogleSignInAccount a() {
        return a(b("defaultGoogleSignInAccount"));
    }
}
