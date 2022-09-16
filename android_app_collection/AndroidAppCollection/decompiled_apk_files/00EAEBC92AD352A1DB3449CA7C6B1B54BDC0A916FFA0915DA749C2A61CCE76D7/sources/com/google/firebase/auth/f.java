package com.google.firebase.auth;

import android.net.Uri;
import java.util.Set;
/* loaded from: classes.dex */
public class f {

    /* renamed from: e  reason: collision with root package name */
    private static final c.e.a.b.d.e.b0<String, Integer> f8324e;

    /* renamed from: a  reason: collision with root package name */
    private final String f8325a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8326b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8327c;

    /* renamed from: d  reason: collision with root package name */
    private final String f8328d;

    static {
        c.e.a.b.d.e.a0 a0Var = new c.e.a.b.d.e.a0();
        a0Var.a("recoverEmail", 2);
        a0Var.a("resetPassword", 0);
        a0Var.a("signIn", 4);
        a0Var.a("verifyEmail", 1);
        a0Var.a("verifyBeforeChangeEmail", 5);
        a0Var.a("revertSecondFactorAddition", 6);
        f8324e = a0Var.a();
    }

    private f(String str) {
        this.f8325a = a(str, "apiKey");
        this.f8326b = a(str, "oobCode");
        this.f8327c = a(str, "mode");
        if (this.f8325a == null || this.f8326b == null || this.f8327c == null) {
            throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", "apiKey", "oobCode", "mode"));
        }
        a(str, "continueUrl");
        a(str, "languageCode");
        this.f8328d = a(str, "tenantId");
    }

    public static f a(String str) {
        com.google.android.gms.common.internal.s.b(str);
        try {
            return new f(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private static String a(String str, String str2) {
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return parse.getQueryParameter(str2);
            }
            if (!queryParameterNames.contains("link")) {
                return null;
            }
            return Uri.parse(parse.getQueryParameter("link")).getQueryParameter(str2);
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    public int a() {
        return f8324e.getOrDefault(this.f8327c, 3).intValue();
    }

    public final String b() {
        return this.f8328d;
    }
}
