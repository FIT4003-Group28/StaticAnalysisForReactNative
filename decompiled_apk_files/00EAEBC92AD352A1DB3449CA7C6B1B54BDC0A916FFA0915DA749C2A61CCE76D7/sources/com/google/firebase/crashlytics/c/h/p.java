package com.google.firebase.crashlytics.c.h;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.firebase.crashlytics.c.j.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes.dex */
public class p {

    /* renamed from: e  reason: collision with root package name */
    private static final String f8755e = String.format(Locale.US, "Crashlytics Android SDK/%s", "17.1.0");

    /* renamed from: f  reason: collision with root package name */
    private static final Map<String, Integer> f8756f = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final Context f8757a;

    /* renamed from: b  reason: collision with root package name */
    private final y f8758b;

    /* renamed from: c  reason: collision with root package name */
    private final b f8759c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.firebase.crashlytics.c.r.d f8760d;

    static {
        f8756f.put("armeabi", 5);
        f8756f.put("armeabi-v7a", 6);
        f8756f.put("arm64-v8a", 9);
        f8756f.put("x86", 0);
        f8756f.put("x86_64", 1);
    }

    public p(Context context, y yVar, b bVar, com.google.firebase.crashlytics.c.r.d dVar) {
        this.f8757a = context;
        this.f8758b = yVar;
        this.f8759c = bVar;
        this.f8760d = dVar;
    }

    private v.a a() {
        v.a l = com.google.firebase.crashlytics.c.j.v.l();
        l.e("17.1.0");
        l.c(this.f8759c.f8612a);
        l.d(this.f8758b.a());
        l.a(this.f8759c.f8616e);
        l.b(this.f8759c.f8617f);
        l.a(4);
        return l;
    }

    private v.d.AbstractC0171d.a.b.c a(com.google.firebase.crashlytics.c.r.e eVar, int i, int i2) {
        return a(eVar, i, i2, 0);
    }

    private v.d.AbstractC0171d.a.b.c a(com.google.firebase.crashlytics.c.r.e eVar, int i, int i2, int i3) {
        String str = eVar.f9160b;
        String str2 = eVar.f9159a;
        StackTraceElement[] stackTraceElementArr = eVar.f9161c;
        int i4 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        com.google.firebase.crashlytics.c.r.e eVar2 = eVar.f9162d;
        if (i3 >= i2) {
            com.google.firebase.crashlytics.c.r.e eVar3 = eVar2;
            int i5 = 0;
            while (eVar3 != null) {
                eVar3 = eVar3.f9162d;
                i5++;
            }
            i4 = i5;
        }
        v.d.AbstractC0171d.a.b.c.AbstractC0176a f2 = v.d.AbstractC0171d.a.b.c.f();
        f2.b(str);
        f2.a(str2);
        f2.a(com.google.firebase.crashlytics.c.j.w.a(a(stackTraceElementArr, i)));
        f2.a(i4);
        if (eVar2 != null && i4 == 0) {
            f2.a(a(eVar2, i, i2, i3 + 1));
        }
        return f2.a();
    }

    private v.d.AbstractC0171d.a.b.e.AbstractC0180b a(StackTraceElement stackTraceElement, v.d.AbstractC0171d.a.b.e.AbstractC0180b.AbstractC0181a abstractC0181a) {
        long j = 0;
        long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j = stackTraceElement.getLineNumber();
        }
        abstractC0181a.b(max);
        abstractC0181a.b(str);
        abstractC0181a.a(fileName);
        abstractC0181a.a(j);
        return abstractC0181a.a();
    }

    private v.d.AbstractC0171d.a.b.e a(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return a(thread, stackTraceElementArr, 0);
    }

    private v.d.AbstractC0171d.a.b.e a(Thread thread, StackTraceElement[] stackTraceElementArr, int i) {
        v.d.AbstractC0171d.a.b.e.AbstractC0179a d2 = v.d.AbstractC0171d.a.b.e.d();
        d2.a(thread.getName());
        d2.a(i);
        d2.a(com.google.firebase.crashlytics.c.j.w.a(a(stackTraceElementArr, i)));
        return d2.a();
    }

    private v.d.AbstractC0171d.a.b a(com.google.firebase.crashlytics.c.r.e eVar, Thread thread, int i, int i2, boolean z) {
        v.d.AbstractC0171d.a.b.AbstractC0175b e2 = v.d.AbstractC0171d.a.b.e();
        e2.b(a(eVar, thread, i, z));
        e2.a(a(eVar, i, i2));
        e2.a(h());
        e2.a(d());
        return e2.a();
    }

    private v.d.AbstractC0171d.a a(int i, com.google.firebase.crashlytics.c.r.e eVar, Thread thread, int i2, int i3, boolean z) {
        Boolean bool;
        ActivityManager.RunningAppProcessInfo a2 = h.a(this.f8759c.f8615d, this.f8757a);
        if (a2 != null) {
            bool = Boolean.valueOf(a2.importance != 100);
        } else {
            bool = null;
        }
        v.d.AbstractC0171d.a.AbstractC0172a f2 = v.d.AbstractC0171d.a.f();
        f2.a(bool);
        f2.a(i);
        f2.a(a(eVar, thread, i2, i3, z));
        return f2.a();
    }

    private v.d.AbstractC0171d.c a(int i) {
        e a2 = e.a(this.f8757a);
        Float a3 = a2.a();
        Double valueOf = a3 != null ? Double.valueOf(a3.doubleValue()) : null;
        int b2 = a2.b();
        boolean f2 = h.f(this.f8757a);
        long b3 = h.b() - h.a(this.f8757a);
        long a4 = h.a(Environment.getDataDirectory().getPath());
        v.d.AbstractC0171d.c.a g2 = v.d.AbstractC0171d.c.g();
        g2.a(valueOf);
        g2.a(b2);
        g2.a(f2);
        g2.b(i);
        g2.b(b3);
        g2.a(a4);
        return g2.a();
    }

    private com.google.firebase.crashlytics.c.j.w<v.d.AbstractC0171d.a.b.e> a(com.google.firebase.crashlytics.c.r.e eVar, Thread thread, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(a(thread, eVar.f9161c, i));
        if (z) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(a(key, this.f8760d.a(entry.getValue())));
                }
            }
        }
        return com.google.firebase.crashlytics.c.j.w.a(arrayList);
    }

    private com.google.firebase.crashlytics.c.j.w<v.d.AbstractC0171d.a.b.e.AbstractC0180b> a(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            v.d.AbstractC0171d.a.b.e.AbstractC0180b.AbstractC0181a f2 = v.d.AbstractC0171d.a.b.e.AbstractC0180b.f();
            f2.a(i);
            arrayList.add(a(stackTraceElement, f2));
        }
        return com.google.firebase.crashlytics.c.j.w.a(arrayList);
    }

    private static int b() {
        Integer num;
        String str = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str) && (num = f8756f.get(str.toLowerCase(Locale.US))) != null) {
            return num.intValue();
        }
        return 7;
    }

    private v.d b(String str, long j) {
        v.d.b n = v.d.n();
        n.a(j);
        n.b(str);
        n.a(f8755e);
        n.a(e());
        n.a(g());
        n.a(f());
        n.a(3);
        return n.a();
    }

    private v.d.AbstractC0171d.a.b.AbstractC0173a c() {
        v.d.AbstractC0171d.a.b.AbstractC0173a.AbstractC0174a f2 = v.d.AbstractC0171d.a.b.AbstractC0173a.f();
        f2.a(0L);
        f2.b(0L);
        f2.a(this.f8759c.f8615d);
        f2.b(this.f8759c.f8613b);
        return f2.a();
    }

    private com.google.firebase.crashlytics.c.j.w<v.d.AbstractC0171d.a.b.AbstractC0173a> d() {
        return com.google.firebase.crashlytics.c.j.w.a(c());
    }

    private v.d.a e() {
        v.d.a.AbstractC0170a f2 = v.d.a.f();
        f2.b(this.f8758b.b());
        f2.d(this.f8759c.f8616e);
        f2.a(this.f8759c.f8617f);
        f2.c(this.f8758b.a());
        return f2.a();
    }

    private v.d.c f() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int b2 = b();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long b3 = h.b();
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        boolean j = h.j(this.f8757a);
        int c2 = h.c(this.f8757a);
        String str = Build.MANUFACTURER;
        String str2 = Build.PRODUCT;
        v.d.c.a j2 = v.d.c.j();
        j2.a(b2);
        j2.b(Build.MODEL);
        j2.b(availableProcessors);
        j2.b(b3);
        j2.a(blockCount);
        j2.a(j);
        j2.c(c2);
        j2.a(str);
        j2.c(str2);
        return j2.a();
    }

    private v.d.e g() {
        v.d.e.a e2 = v.d.e.e();
        e2.a(3);
        e2.b(Build.VERSION.RELEASE);
        e2.a(Build.VERSION.CODENAME);
        e2.a(h.k(this.f8757a));
        return e2.a();
    }

    private v.d.AbstractC0171d.a.b.AbstractC0177d h() {
        v.d.AbstractC0171d.a.b.AbstractC0177d.AbstractC0178a d2 = v.d.AbstractC0171d.a.b.AbstractC0177d.d();
        d2.b("0");
        d2.a("0");
        d2.a(0L);
        return d2.a();
    }

    public v.d.AbstractC0171d a(Throwable th, Thread thread, String str, long j, int i, int i2, boolean z) {
        int i3 = this.f8757a.getResources().getConfiguration().orientation;
        com.google.firebase.crashlytics.c.r.e eVar = new com.google.firebase.crashlytics.c.r.e(th, this.f8760d);
        v.d.AbstractC0171d.b g2 = v.d.AbstractC0171d.g();
        g2.a(str);
        g2.a(j);
        g2.a(a(i3, eVar, thread, i, i2, z));
        g2.a(a(i3));
        return g2.a();
    }

    public com.google.firebase.crashlytics.c.j.v a(String str, long j) {
        v.a a2 = a();
        a2.a(b(str, j));
        return a2.a();
    }
}
