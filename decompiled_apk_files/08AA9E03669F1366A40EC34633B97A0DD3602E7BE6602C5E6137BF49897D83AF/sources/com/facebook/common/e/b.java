package com.facebook.common.e;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
/* compiled from: FLogDefaultLoggingDelegate.java */
/* loaded from: classes.dex */
public class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public static final b f2277a = new b();

    /* renamed from: b  reason: collision with root package name */
    private String f2278b = "unknown";

    /* renamed from: c  reason: collision with root package name */
    private int f2279c = 5;

    public static b a() {
        return f2277a;
    }

    private b() {
    }

    @Override // com.facebook.common.e.c
    public boolean a(int i) {
        return this.f2279c <= i;
    }

    @Override // com.facebook.common.e.c
    public void a(String str, String str2) {
        a(2, str, str2);
    }

    @Override // com.facebook.common.e.c
    public void b(String str, String str2) {
        a(3, str, str2);
    }

    @Override // com.facebook.common.e.c
    public void c(String str, String str2) {
        a(4, str, str2);
    }

    @Override // com.facebook.common.e.c
    public void d(String str, String str2) {
        a(5, str, str2);
    }

    @Override // com.facebook.common.e.c
    public void a(String str, String str2, Throwable th) {
        a(5, str, str2, th);
    }

    @Override // com.facebook.common.e.c
    public void e(String str, String str2) {
        a(6, str, str2);
    }

    @Override // com.facebook.common.e.c
    public void b(String str, String str2, Throwable th) {
        a(6, str, str2, th);
    }

    @Override // com.facebook.common.e.c
    public void f(String str, String str2) {
        a(6, str, str2);
    }

    @Override // com.facebook.common.e.c
    public void c(String str, String str2, Throwable th) {
        a(6, str, str2, th);
    }

    private void a(int i, String str, String str2) {
        Log.println(i, a(str), str2);
    }

    private void a(int i, String str, String str2, Throwable th) {
        Log.println(i, a(str), a(str2, th));
    }

    private String a(String str) {
        if (this.f2278b != null) {
            return this.f2278b + ":" + str;
        }
        return str;
    }

    private static String a(String str, Throwable th) {
        return str + '\n' + a(th);
    }

    private static String a(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }
}
