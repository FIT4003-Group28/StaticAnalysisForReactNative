package com.google.firebase.crashlytics.c.n;

import android.app.ActivityManager;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final a f9068a = a.a("0");

    /* renamed from: b  reason: collision with root package name */
    private static final a f9069b = a.a("Unity");

    private static int a() {
        return c.b(1, f9068a) + 0 + c.b(2, f9068a) + c.b(3, 0L);
    }

    private static int a(int i, a aVar, int i2, long j, long j2, boolean z, int i3, a aVar2, a aVar3) {
        int i4 = 0;
        int e2 = c.e(3, i) + 0 + (aVar == null ? 0 : c.b(4, aVar)) + c.g(5, i2) + c.b(6, j) + c.b(7, j2) + c.b(10, z) + c.g(12, i3) + (aVar2 == null ? 0 : c.b(13, aVar2));
        if (aVar3 != null) {
            i4 = c.b(14, aVar3);
        }
        return e2 + i4;
    }

    private static int a(long j, String str, com.google.firebase.crashlytics.c.r.e eVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, Map<String, String> map, ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i2, a aVar, a aVar2, Float f2, int i3, boolean z, long j2, long j3, a aVar3) {
        int b2 = c.b(1, j) + 0 + c.b(2, a.a(str));
        int a2 = a(eVar, thread, stackTraceElementArr, threadArr, list, i, aVar, aVar2, map, runningAppProcessInfo, i2);
        int a3 = a(f2, i3, z, i2, j2, j3);
        int l = b2 + c.l(3) + c.j(a2) + a2 + c.l(5) + c.j(a3) + a3;
        if (aVar3 != null) {
            int a4 = a(aVar3);
            return l + c.l(6) + c.j(a4) + a4;
        }
        return l;
    }

    private static int a(a aVar) {
        return c.b(1, aVar);
    }

    private static int a(a aVar, a aVar2) {
        int b2 = c.b(1, 0L) + 0 + c.b(2, 0L) + c.b(3, aVar);
        return aVar2 != null ? b2 + c.b(4, aVar2) : b2;
    }

    private static int a(a aVar, a aVar2, a aVar3, a aVar4, int i, a aVar5) {
        int b2 = c.b(1, aVar) + 0 + c.b(2, aVar2) + c.b(3, aVar3) + c.b(6, aVar4);
        if (aVar5 != null) {
            b2 = b2 + c.b(8, f9069b) + c.b(9, aVar5);
        }
        return b2 + c.e(10, i);
    }

    private static int a(a aVar, a aVar2, boolean z) {
        return c.e(1, 3) + 0 + c.b(2, aVar) + c.b(3, aVar2) + c.b(4, z);
    }

    private static int a(com.google.firebase.crashlytics.c.r.e eVar, int i, int i2) {
        int i3 = 0;
        int b2 = c.b(1, a.a(eVar.f9160b)) + 0;
        String str = eVar.f9159a;
        if (str != null) {
            b2 += c.b(3, a.a(str));
        }
        int i4 = b2;
        for (StackTraceElement stackTraceElement : eVar.f9161c) {
            int a2 = a(stackTraceElement, true);
            i4 += c.l(4) + c.j(a2) + a2;
        }
        com.google.firebase.crashlytics.c.r.e eVar2 = eVar.f9162d;
        if (eVar2 != null) {
            if (i < i2) {
                int a3 = a(eVar2, i + 1, i2);
                return i4 + c.l(6) + c.j(a3) + a3;
            }
            while (eVar2 != null) {
                eVar2 = eVar2.f9162d;
                i3++;
            }
            return i4 + c.g(7, i3);
        }
        return i4;
    }

    private static int a(com.google.firebase.crashlytics.c.r.e eVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, a aVar, a aVar2) {
        int a2 = a(thread, stackTraceElementArr, 4, true);
        int length = threadArr.length;
        int l = c.l(1) + c.j(a2) + a2 + 0;
        for (int i2 = 0; i2 < length; i2++) {
            int a3 = a(threadArr[i2], list.get(i2), 0, false);
            l += c.l(1) + c.j(a3) + a3;
        }
        int a4 = a(eVar, 1, i);
        int a5 = a();
        int a6 = a(aVar, aVar2);
        return l + c.l(2) + c.j(a4) + a4 + c.l(3) + c.j(a5) + a5 + c.l(3) + c.j(a6) + a6;
    }

    private static int a(com.google.firebase.crashlytics.c.r.e eVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, a aVar, a aVar2, Map<String, String> map, ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i2) {
        int a2 = a(eVar, thread, stackTraceElementArr, threadArr, list, i, aVar, aVar2);
        int l = c.l(1) + c.j(a2) + a2;
        boolean z = false;
        int i3 = l + 0;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                int a3 = a(entry.getKey(), entry.getValue());
                i3 += c.l(2) + c.j(a3) + a3;
            }
        }
        if (runningAppProcessInfo != null) {
            if (runningAppProcessInfo.importance != 100) {
                z = true;
            }
            i3 += c.b(3, z);
        }
        return i3 + c.g(4, i2);
    }

    private static int a(Float f2, int i, boolean z, int i2, long j, long j2) {
        int i3 = 0;
        if (f2 != null) {
            i3 = 0 + c.b(1, f2.floatValue());
        }
        return i3 + c.f(2, i) + c.b(3, z) + c.g(4, i2) + c.b(5, j) + c.b(6, j2);
    }

    private static int a(StackTraceElement stackTraceElement, boolean z) {
        int i = 0;
        long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0) : 0L;
        int b2 = c.b(1, max) + 0 + c.b(2, a.a(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName()));
        if (stackTraceElement.getFileName() != null) {
            b2 += c.b(3, a.a(stackTraceElement.getFileName()));
        }
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            b2 += c.b(4, stackTraceElement.getLineNumber());
        }
        if (z) {
            i = 2;
        }
        return b2 + c.g(5, i);
    }

    private static int a(String str, String str2) {
        int b2 = c.b(1, a.a(str));
        if (str2 == null) {
            str2 = "";
        }
        return b2 + c.b(2, a.a(str2));
    }

    private static int a(Thread thread, StackTraceElement[] stackTraceElementArr, int i, boolean z) {
        int b2 = c.b(1, a.a(thread.getName())) + c.g(2, i);
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            int a2 = a(stackTraceElement, z);
            b2 += c.l(3) + c.j(a2) + a2;
        }
        return b2;
    }

    private static a a(String str) {
        if (str == null) {
            return null;
        }
        return a.a(str);
    }

    private static void a(c cVar, int i, StackTraceElement stackTraceElement, boolean z) {
        cVar.c(i, 2);
        cVar.e(a(stackTraceElement, z));
        cVar.a(1, stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0) : 0L);
        cVar.a(2, a.a(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName()));
        if (stackTraceElement.getFileName() != null) {
            cVar.a(3, a.a(stackTraceElement.getFileName()));
        }
        int i2 = 4;
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            cVar.a(4, stackTraceElement.getLineNumber());
        }
        if (!z) {
            i2 = 0;
        }
        cVar.d(5, i2);
    }

    public static void a(c cVar, int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        a a2 = a(str);
        a a3 = a(str3);
        a a4 = a(str2);
        cVar.c(9, 2);
        cVar.e(a(i, a2, i2, j, j2, z, i3, a4, a3));
        cVar.a(3, i);
        cVar.a(4, a2);
        cVar.d(5, i2);
        cVar.a(6, j);
        cVar.a(7, j2);
        cVar.a(10, z);
        cVar.d(12, i3);
        if (a4 != null) {
            cVar.a(13, a4);
        }
        if (a3 != null) {
            cVar.a(14, a3);
        }
    }

    public static void a(c cVar, long j, String str, com.google.firebase.crashlytics.c.r.e eVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, Map<String, String> map, byte[] bArr, ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i2, String str2, String str3, Float f2, int i3, boolean z, long j2, long j3) {
        a aVar;
        a a2 = a.a(str2);
        a a3 = str3 == null ? null : a.a(str3.replace("-", ""));
        if (bArr != null) {
            aVar = a.a(bArr);
        } else {
            com.google.firebase.crashlytics.c.b.a().a("No log data to include with this event.");
            aVar = null;
        }
        cVar.c(10, 2);
        cVar.e(a(j, str, eVar, thread, stackTraceElementArr, threadArr, list, i, map, runningAppProcessInfo, i2, a2, a3, f2, i3, z, j2, j3, aVar));
        cVar.a(1, j);
        cVar.a(2, a.a(str));
        a(cVar, eVar, thread, stackTraceElementArr, threadArr, list, i, a2, a3, map, runningAppProcessInfo, i2);
        a(cVar, f2, i3, z, i2, j2, j3);
        a(cVar, aVar);
    }

    private static void a(c cVar, a aVar) {
        if (aVar != null) {
            cVar.c(6, 2);
            cVar.e(a(aVar));
            cVar.a(1, aVar);
        }
    }

    private static void a(c cVar, com.google.firebase.crashlytics.c.r.e eVar, int i, int i2, int i3) {
        cVar.c(i3, 2);
        cVar.e(a(eVar, 1, i2));
        cVar.a(1, a.a(eVar.f9160b));
        String str = eVar.f9159a;
        if (str != null) {
            cVar.a(3, a.a(str));
        }
        int i4 = 0;
        for (StackTraceElement stackTraceElement : eVar.f9161c) {
            a(cVar, 4, stackTraceElement, true);
        }
        com.google.firebase.crashlytics.c.r.e eVar2 = eVar.f9162d;
        if (eVar2 != null) {
            if (i < i2) {
                a(cVar, eVar2, i + 1, i2, 6);
                return;
            }
            while (eVar2 != null) {
                eVar2 = eVar2.f9162d;
                i4++;
            }
            cVar.d(7, i4);
        }
    }

    private static void a(c cVar, com.google.firebase.crashlytics.c.r.e eVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, a aVar, a aVar2) {
        cVar.c(1, 2);
        cVar.e(a(eVar, thread, stackTraceElementArr, threadArr, list, i, aVar, aVar2));
        a(cVar, thread, stackTraceElementArr, 4, true);
        int length = threadArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            a(cVar, threadArr[i2], list.get(i2), 0, false);
        }
        a(cVar, eVar, 1, i, 2);
        cVar.c(3, 2);
        cVar.e(a());
        cVar.a(1, f9068a);
        cVar.a(2, f9068a);
        cVar.a(3, 0L);
        cVar.c(4, 2);
        cVar.e(a(aVar, aVar2));
        cVar.a(1, 0L);
        cVar.a(2, 0L);
        cVar.a(3, aVar);
        if (aVar2 != null) {
            cVar.a(4, aVar2);
        }
    }

    private static void a(c cVar, com.google.firebase.crashlytics.c.r.e eVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, a aVar, a aVar2, Map<String, String> map, ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i2) {
        cVar.c(3, 2);
        cVar.e(a(eVar, thread, stackTraceElementArr, threadArr, list, i, aVar, aVar2, map, runningAppProcessInfo, i2));
        a(cVar, eVar, thread, stackTraceElementArr, threadArr, list, i, aVar, aVar2);
        if (map != null && !map.isEmpty()) {
            a(cVar, map);
        }
        if (runningAppProcessInfo != null) {
            cVar.a(3, runningAppProcessInfo.importance != 100);
        }
        cVar.d(4, i2);
    }

    private static void a(c cVar, Float f2, int i, boolean z, int i2, long j, long j2) {
        cVar.c(5, 2);
        cVar.e(a(f2, i, z, i2, j, j2));
        if (f2 != null) {
            cVar.a(1, f2.floatValue());
        }
        cVar.b(2, i);
        cVar.a(3, z);
        cVar.d(4, i2);
        cVar.a(5, j);
        cVar.a(6, j2);
    }

    public static void a(c cVar, String str) {
        a a2 = a.a(str);
        cVar.c(7, 2);
        int b2 = c.b(2, a2);
        cVar.e(c.l(5) + c.j(b2) + b2);
        cVar.c(5, 2);
        cVar.e(b2);
        cVar.a(2, a2);
    }

    public static void a(c cVar, String str, String str2, long j) {
        cVar.a(1, a.a(str2));
        cVar.a(2, a.a(str));
        cVar.a(3, j);
    }

    public static void a(c cVar, String str, String str2, String str3) {
        if (str == null) {
            str = "";
        }
        a a2 = a.a(str);
        a a3 = a(str2);
        a a4 = a(str3);
        int b2 = c.b(1, a2) + 0;
        if (str2 != null) {
            b2 += c.b(2, a3);
        }
        if (str3 != null) {
            b2 += c.b(3, a4);
        }
        cVar.c(6, 2);
        cVar.e(b2);
        cVar.a(1, a2);
        if (str2 != null) {
            cVar.a(2, a3);
        }
        if (str3 != null) {
            cVar.a(3, a4);
        }
    }

    public static void a(c cVar, String str, String str2, String str3, String str4, int i, String str5) {
        a a2 = a.a(str);
        a a3 = a.a(str2);
        a a4 = a.a(str3);
        a a5 = a.a(str4);
        a a6 = str5 != null ? a.a(str5) : null;
        cVar.c(7, 2);
        cVar.e(a(a2, a3, a4, a5, i, a6));
        cVar.a(1, a2);
        cVar.a(2, a3);
        cVar.a(3, a4);
        cVar.a(6, a5);
        if (a6 != null) {
            cVar.a(8, f9069b);
            cVar.a(9, a6);
        }
        cVar.a(10, i);
    }

    public static void a(c cVar, String str, String str2, boolean z) {
        a a2 = a.a(str);
        a a3 = a.a(str2);
        cVar.c(8, 2);
        cVar.e(a(a2, a3, z));
        cVar.a(1, 3);
        cVar.a(2, a2);
        cVar.a(3, a3);
        cVar.a(4, z);
    }

    private static void a(c cVar, Thread thread, StackTraceElement[] stackTraceElementArr, int i, boolean z) {
        cVar.c(1, 2);
        cVar.e(a(thread, stackTraceElementArr, i, z));
        cVar.a(1, a.a(thread.getName()));
        cVar.d(2, i);
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            a(cVar, 3, stackTraceElement, z);
        }
    }

    private static void a(c cVar, Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            cVar.c(2, 2);
            cVar.e(a(entry.getKey(), entry.getValue()));
            cVar.a(1, a.a(entry.getKey()));
            String value = entry.getValue();
            if (value == null) {
                value = "";
            }
            cVar.a(2, a.a(value));
        }
    }
}
