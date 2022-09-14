package com.google.android.gms.common;

import android.util.Log;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a0 {

    /* renamed from: d  reason: collision with root package name */
    private static final a0 f6791d = new a0(true, null, null);

    /* renamed from: a  reason: collision with root package name */
    final boolean f6792a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6793b;

    /* renamed from: c  reason: collision with root package name */
    private final Throwable f6794c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(boolean z, String str, Throwable th) {
        this.f6792a = z;
        this.f6793b = str;
        this.f6794c = th;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a0 a(String str) {
        return new a0(false, str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a0 a(String str, Throwable th) {
        return new a0(false, str, th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a0 a(Callable<String> callable) {
        return new c0(callable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str, s sVar, boolean z, boolean z2) {
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", z2 ? "debug cert rejected" : "not whitelisted", str, com.google.android.gms.common.util.j.a(com.google.android.gms.common.util.a.a("SHA-1").digest(sVar.e())), Boolean.valueOf(z), "12451009.false");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a0 c() {
        return f6791d;
    }

    String a() {
        return this.f6793b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        if (this.f6792a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.f6794c != null) {
            Log.d("GoogleCertificatesRslt", a(), this.f6794c);
        } else {
            Log.d("GoogleCertificatesRslt", a());
        }
    }
}
