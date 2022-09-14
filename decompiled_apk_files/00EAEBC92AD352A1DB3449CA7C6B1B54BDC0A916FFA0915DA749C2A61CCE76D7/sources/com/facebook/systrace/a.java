package com.facebook.systrace;

import android.os.Build;
import android.os.Trace;
/* loaded from: classes.dex */
public class a {

    /* renamed from: com.facebook.systrace.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0139a {
        THREAD('t'),
        PROCESS('p'),
        GLOBAL('g');

        EnumC0139a(char c2) {
        }
    }

    public static void a(long j) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }

    public static void a(long j, String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void a(long j, String str, int i) {
    }

    public static void a(long j, String str, int i, long j2) {
    }

    public static void a(long j, String str, EnumC0139a enumC0139a) {
    }

    public static void a(TraceListener traceListener) {
    }

    public static void b(long j, String str, int i) {
    }

    public static void b(long j, String str, int i, long j2) {
    }

    public static void b(TraceListener traceListener) {
    }

    public static boolean b(long j) {
        return false;
    }

    public static void c(long j, String str, int i) {
    }

    public static void d(long j, String str, int i) {
    }

    public static void e(long j, String str, int i) {
    }
}
