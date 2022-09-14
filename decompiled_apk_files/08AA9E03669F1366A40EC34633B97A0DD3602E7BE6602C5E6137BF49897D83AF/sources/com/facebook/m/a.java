package com.facebook.m;

import android.os.Build;
import android.os.Trace;
/* compiled from: Systrace.java */
/* loaded from: classes.dex */
public class a {
    public static void a(long j, String str, int i) {
    }

    public static void a(long j, String str, int i, long j2) {
    }

    public static void a(long j, String str, EnumC0066a enumC0066a) {
    }

    public static void a(c cVar) {
    }

    public static boolean a(long j) {
        return false;
    }

    public static void b(long j, String str, int i) {
    }

    public static void b(long j, String str, int i, long j2) {
    }

    public static void b(c cVar) {
    }

    public static void c(long j, String str, int i) {
    }

    public static void d(long j, String str, int i) {
    }

    public static void e(long j, String str, int i) {
    }

    /* compiled from: Systrace.java */
    /* renamed from: com.facebook.m.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0066a {
        THREAD('t'),
        PROCESS('p'),
        GLOBAL('g');
        

        /* renamed from: d  reason: collision with root package name */
        private final char f3059d;

        EnumC0066a(char c2) {
            this.f3059d = c2;
        }
    }

    public static void a(long j, String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void b(long j) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
