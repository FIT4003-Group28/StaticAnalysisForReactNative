package com.facebook.l;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.StrictMode;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
/* compiled from: SoLoader.java */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private static h[] f3043a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final Set<String> f3044b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    private static StrictMode.ThreadPolicy f3045c = null;

    /* renamed from: d  reason: collision with root package name */
    private static String f3046d = "lib-main";
    private static int e;

    public static void a(Context context, int i) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            b(context, i);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
        }
    }

    public static void a(Context context, boolean z) {
        try {
            a(context, z ? 1 : 0);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static synchronized void b(Context context, int i) {
        synchronized (g.class) {
            if (f3043a == null) {
                e = i;
                ArrayList arrayList = new ArrayList();
                String str = System.getenv("LD_LIBRARY_PATH");
                if (str == null) {
                    str = "/vendor/lib:/system/lib";
                }
                for (String str2 : str.split(":")) {
                    arrayList.add(new b(new File(str2), 2));
                }
                if (context != null) {
                    int i2 = 1;
                    if ((i & 1) != 0) {
                        arrayList.add(0, new c(context, f3046d));
                    } else {
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if ((applicationInfo.flags & 1) != 0 && (applicationInfo.flags & 128) == 0) {
                            i2 = 0;
                        } else {
                            arrayList.add(0, new b(new File(applicationInfo.nativeLibraryDir), Build.VERSION.SDK_INT <= 17 ? 1 : 0));
                        }
                        arrayList.add(0, new com.facebook.l.a(context, f3046d, i2));
                    }
                }
                h[] hVarArr = (h[]) arrayList.toArray(new h[arrayList.size()]);
                int a2 = a();
                int length = hVarArr.length;
                while (true) {
                    int i3 = length - 1;
                    if (length <= 0) {
                        break;
                    }
                    hVarArr[i3].a(a2);
                    length = i3;
                }
                f3043a = hVarArr;
            }
        }
    }

    private static int a() {
        return (e & 2) != 0 ? 1 : 0;
    }

    /* compiled from: SoLoader.java */
    /* loaded from: classes.dex */
    public static final class a extends UnsatisfiedLinkError {
        a(Throwable th) {
            super("APK was built for a different platform");
            initCause(th);
        }
    }

    public static synchronized void a(String str) {
        synchronized (g.class) {
            if (f3043a == null) {
                if ("http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                    b();
                } else {
                    System.loadLibrary(str);
                    return;
                }
            }
            try {
                try {
                    a(System.mapLibraryName(str), 0);
                } catch (UnsatisfiedLinkError e2) {
                    String message = e2.getMessage();
                    if (message != null && message.contains("unexpected e_machine:")) {
                        throw new a(e2);
                    }
                    throw e2;
                }
            } catch (IOException e3) {
                throw new RuntimeException(e3);
            }
        }
    }

    public static File b(String str) {
        b();
        try {
            return c(System.mapLibraryName(str));
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    public static void a(String str, int i) {
        boolean z;
        ?? contains = f3044b.contains(str);
        if (contains == 0) {
            int i2 = 0;
            if (f3045c == null) {
                f3045c = StrictMode.allowThreadDiskReads();
                z = true;
            } else {
                z = false;
            }
            while (true) {
                if (contains != 0) {
                    break;
                }
                try {
                    if (i2 >= f3043a.length) {
                        break;
                    }
                    contains = f3043a[i2].a(str, i);
                    i2++;
                } finally {
                    if (z) {
                        StrictMode.setThreadPolicy(f3045c);
                        f3045c = null;
                    }
                }
            }
        }
        if (contains == 0) {
            throw new UnsatisfiedLinkError("couldn't find DSO to load: " + str);
        } else if (contains != 1) {
        } else {
            f3044b.add(str);
        }
    }

    static File c(String str) {
        for (int i = 0; i < f3043a.length; i++) {
            File a2 = f3043a[i].a(str);
            if (a2 != null) {
                return a2;
            }
        }
        throw new FileNotFoundException(str);
    }

    private static void b() {
        if (f3043a == null) {
            throw new RuntimeException("SoLoader.init() not yet called");
        }
    }
}
