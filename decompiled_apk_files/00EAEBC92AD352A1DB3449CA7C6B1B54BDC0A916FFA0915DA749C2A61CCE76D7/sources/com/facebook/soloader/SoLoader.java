package com.facebook.soloader;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* loaded from: classes.dex */
public class SoLoader {

    /* renamed from: a  reason: collision with root package name */
    static final boolean f6438a;

    /* renamed from: b  reason: collision with root package name */
    static k f6439b;

    /* renamed from: f  reason: collision with root package name */
    private static n[] f6443f;

    /* renamed from: g  reason: collision with root package name */
    private static com.facebook.soloader.b f6444g;
    private static int l;
    private static boolean m;

    /* renamed from: c  reason: collision with root package name */
    private static final ReentrantReadWriteLock f6440c = new ReentrantReadWriteLock();

    /* renamed from: d  reason: collision with root package name */
    private static l[] f6441d = null;

    /* renamed from: e  reason: collision with root package name */
    private static int f6442e = 0;

    /* renamed from: h  reason: collision with root package name */
    private static final HashSet<String> f6445h = new HashSet<>();
    private static final Map<String, Object> i = new HashMap();
    private static final Set<String> j = Collections.newSetFromMap(new ConcurrentHashMap());
    private static m k = null;

    /* JADX INFO: Access modifiers changed from: private */
    @d
    @TargetApi(14)
    /* loaded from: classes.dex */
    public static class Api14Utils {
        private Api14Utils() {
        }

        public static String a() {
            ClassLoader classLoader = SoLoader.class.getClassLoader();
            if (classLoader instanceof BaseDexClassLoader) {
                try {
                    return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", new Class[0]).invoke((BaseDexClassLoader) classLoader, new Object[0]);
                } catch (Exception e2) {
                    throw new RuntimeException("Cannot call getLdLibraryPath", e2);
                }
            }
            throw new IllegalStateException("ClassLoader " + classLoader.getClass().getName() + " should be of type BaseDexClassLoader");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f6446a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f6447b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f6448c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Runtime f6449d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Method f6450e;

        a(boolean z, String str, String str2, Runtime runtime, Method method) {
            this.f6446a = z;
            this.f6447b = str;
            this.f6448c = str2;
            this.f6449d = runtime;
            this.f6450e = method;
        }

        private String a(String str) {
            try {
                File file = new File(str);
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read <= 0) {
                            String format = String.format("%32x", new BigInteger(1, messageDigest.digest()));
                            fileInputStream.close();
                            return format;
                        }
                        messageDigest.update(bArr, 0, read);
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            } catch (IOException e2) {
                return e2.toString();
            } catch (SecurityException e3) {
                return e3.toString();
            } catch (NoSuchAlgorithmException e4) {
                return e4.toString();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
            if (r1 == null) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
            android.util.Log.e("SoLoader", "Error when loading lib: " + r1 + " lib hash: " + a(r9) + " search path is " + r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
            return;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006d -> B:24:0x006e). Please submit an issue!!! */
        @Override // com.facebook.soloader.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(java.lang.String r9, int r10) {
            /*
                r8 = this;
                boolean r0 = r8.f6446a
                if (r0 == 0) goto Lbb
                r0 = 4
                r10 = r10 & r0
                r1 = 1
                r2 = 0
                if (r10 != r0) goto Lc
                r10 = 1
                goto Ld
            Lc:
                r10 = 0
            Ld:
                if (r10 == 0) goto L12
                java.lang.String r10 = r8.f6447b
                goto L14
            L12:
                java.lang.String r10 = r8.f6448c
            L14:
                r0 = 0
                java.lang.Runtime r3 = r8.f6449d     // Catch: java.lang.Throwable -> L70 java.lang.reflect.InvocationTargetException -> L72 java.lang.IllegalArgumentException -> L74 java.lang.IllegalAccessException -> L76
                monitor-enter(r3)     // Catch: java.lang.Throwable -> L70 java.lang.reflect.InvocationTargetException -> L72 java.lang.IllegalArgumentException -> L74 java.lang.IllegalAccessException -> L76
                java.lang.reflect.Method r4 = r8.f6450e     // Catch: java.lang.Throwable -> L6d
                java.lang.Runtime r5 = r8.f6449d     // Catch: java.lang.Throwable -> L6d
                r6 = 3
                java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L6d
                r6[r2] = r9     // Catch: java.lang.Throwable -> L6d
                java.lang.Class<com.facebook.soloader.SoLoader> r2 = com.facebook.soloader.SoLoader.class
                java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Throwable -> L6d
                r6[r1] = r2     // Catch: java.lang.Throwable -> L6d
                r1 = 2
                r6[r1] = r10     // Catch: java.lang.Throwable -> L6d
                java.lang.Object r1 = r4.invoke(r5, r6)     // Catch: java.lang.Throwable -> L6d
                java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L6d
                if (r1 != 0) goto L67
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L62
                if (r1 == 0) goto Lbe
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Error when loading lib: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r1 = " lib hash: "
                r0.append(r1)
                java.lang.String r9 = r8.a(r9)
                r0.append(r9)
                java.lang.String r9 = " search path is "
                r0.append(r9)
                r0.append(r10)
                java.lang.String r9 = r0.toString()
                java.lang.String r10 = "SoLoader"
                android.util.Log.e(r10, r9)
                goto Lbe
            L62:
                r0 = move-exception
                r7 = r1
                r1 = r0
                r0 = r7
                goto L6e
            L67:
                java.lang.UnsatisfiedLinkError r0 = new java.lang.UnsatisfiedLinkError     // Catch: java.lang.Throwable -> L62
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L62
                throw r0     // Catch: java.lang.Throwable -> L62
            L6d:
                r1 = move-exception
            L6e:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L6d
                throw r1     // Catch: java.lang.Throwable -> L70 java.lang.reflect.InvocationTargetException -> L72 java.lang.IllegalArgumentException -> L74 java.lang.IllegalAccessException -> L76
            L70:
                r1 = move-exception
                goto L8e
            L72:
                r1 = move-exception
                goto L77
            L74:
                r1 = move-exception
                goto L77
            L76:
                r1 = move-exception
            L77:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L70
                r2.<init>()     // Catch: java.lang.Throwable -> L70
                java.lang.String r3 = "Error: Cannot load "
                r2.append(r3)     // Catch: java.lang.Throwable -> L70
                r2.append(r9)     // Catch: java.lang.Throwable -> L70
                java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L70
                java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L70
                r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L70
                throw r2     // Catch: java.lang.Throwable -> L70
            L8e:
                if (r0 == 0) goto Lba
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Error when loading lib: "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = " lib hash: "
                r2.append(r0)
                java.lang.String r9 = r8.a(r9)
                r2.append(r9)
                java.lang.String r9 = " search path is "
                r2.append(r9)
                r2.append(r10)
                java.lang.String r9 = r2.toString()
                java.lang.String r10 = "SoLoader"
                android.util.Log.e(r10, r9)
            Lba:
                throw r1
            Lbb:
                java.lang.System.load(r9)
            Lbe:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.a.a(java.lang.String, int):void");
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends UnsatisfiedLinkError {
        b(Throwable th) {
            super("APK was built for a different platform");
            initCause(th);
        }
    }

    static {
        boolean z = false;
        try {
            if (Build.VERSION.SDK_INT >= 18) {
                z = true;
            }
        } catch (NoClassDefFoundError | UnsatisfiedLinkError unused) {
        }
        f6438a = z;
    }

    private static void a() {
        f6440c.readLock().lock();
        try {
            if (f6441d != null) {
                return;
            }
            throw new RuntimeException("SoLoader.init() not yet called");
        } finally {
            f6440c.readLock().unlock();
        }
    }

    public static void a(Context context, int i2) {
        a(context, i2, (k) null);
    }

    private static void a(Context context, int i2, k kVar) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            m = a(context);
            a(kVar);
            b(context, i2, kVar);
            if (!com.facebook.soloader.o.a.a()) {
                com.facebook.soloader.o.a.a(new j());
            }
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

    private static synchronized void a(k kVar) {
        synchronized (SoLoader.class) {
            if (kVar != null) {
                f6439b = kVar;
                return;
            }
            Runtime runtime = Runtime.getRuntime();
            Method b2 = b();
            boolean z = b2 != null;
            String a2 = z ? Api14Utils.a() : null;
            f6439b = new a(z, a2, b(a2), runtime, b2);
        }
    }

    private static void a(String str, int i2, StrictMode.ThreadPolicy threadPolicy) {
        boolean z;
        UnsatisfiedLinkError unsatisfiedLinkError;
        boolean z2;
        f6440c.readLock().lock();
        try {
            if (f6441d == null) {
                Log.e("SoLoader", "Could not load: " + str + " because no SO source exists");
                throw new UnsatisfiedLinkError("couldn't find DSO to load: " + str);
            }
            f6440c.readLock().unlock();
            if (threadPolicy == null) {
                threadPolicy = StrictMode.allowThreadDiskReads();
                z = true;
            } else {
                z = false;
            }
            if (f6438a) {
                Api18TraceUtils.a("SoLoader.loadLibrary[", str, "]");
            }
            int i3 = 0;
            do {
                try {
                    f6440c.readLock().lock();
                    int i4 = f6442e;
                    int i5 = 0;
                    while (true) {
                        if (i3 != 0 || i5 >= f6441d.length) {
                            break;
                        }
                        i3 = f6441d[i5].a(str, i2, threadPolicy);
                        if (i3 == 3 && f6443f != null) {
                            Log.d("SoLoader", "Trying backup SoSource for " + str);
                            n[] nVarArr = f6443f;
                            int length = nVarArr.length;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= length) {
                                    break;
                                }
                                n nVar = nVarArr[i6];
                                nVar.b(str);
                                int a2 = nVar.a(str, i2, threadPolicy);
                                if (a2 == 1) {
                                    i3 = a2;
                                    break;
                                }
                                i6++;
                            }
                        } else {
                            i5++;
                        }
                    }
                    f6440c.readLock().unlock();
                    if ((i2 & 2) == 2 && i3 == 0) {
                        f6440c.writeLock().lock();
                        if (f6444g != null && f6444g.a()) {
                            f6442e++;
                        }
                        z2 = f6442e != i4;
                        f6440c.writeLock().unlock();
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                } finally {
                    if (i3 == 0 || i3 == r6) {
                    }
                }
            } while (z2);
            if (f6438a) {
                Api18TraceUtils.a();
            }
            if (z) {
                StrictMode.setThreadPolicy(threadPolicy);
            }
            if (i3 != 0 && i3 != 3) {
                return;
            }
            String str2 = "couldn't find DSO to load: " + str;
            Log.e("SoLoader", str2);
            throw new UnsatisfiedLinkError(str2);
        } catch (Throwable th) {
            f6440c.readLock().unlock();
            throw th;
        }
    }

    private static boolean a(Context context) {
        return (context == null || (context.getApplicationInfo().flags & 129) == 0) ? false : true;
    }

    public static boolean a(String str) {
        return a(str, 0);
    }

    public static boolean a(String str, int i2) {
        m mVar;
        boolean z;
        f6440c.readLock().lock();
        try {
            if (f6441d == null) {
                if (!"http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                    synchronized (SoLoader.class) {
                        z = !f6445h.contains(str);
                        if (z) {
                            if (k != null) {
                                k.a(str);
                            } else {
                                System.loadLibrary(str);
                            }
                        }
                    }
                    return z;
                }
                a();
            }
            f6440c.readLock().unlock();
            if (!m || (mVar = k) == null) {
                String b2 = h.b(str);
                return a(System.mapLibraryName(b2 != null ? b2 : str), str, b2, i2 | 2, null);
            }
            mVar.a(str);
            return true;
        } finally {
            f6440c.readLock().unlock();
        }
    }

    private static boolean a(String str, String str2, String str3, int i2, StrictMode.ThreadPolicy threadPolicy) {
        boolean z;
        Object obj;
        boolean z2 = false;
        if (TextUtils.isEmpty(str2) || !j.contains(str2)) {
            synchronized (SoLoader.class) {
                if (!f6445h.contains(str)) {
                    z = false;
                } else if (str3 == null) {
                    return false;
                } else {
                    z = true;
                }
                if (i.containsKey(str)) {
                    obj = i.get(str);
                } else {
                    obj = new Object();
                    i.put(str, obj);
                }
                synchronized (obj) {
                    if (!z) {
                        synchronized (SoLoader.class) {
                            if (f6445h.contains(str)) {
                                if (str3 == null) {
                                    return false;
                                }
                                z = true;
                            }
                            if (!z) {
                                try {
                                    Log.d("SoLoader", "About to load: " + str);
                                    a(str, i2, threadPolicy);
                                    synchronized (SoLoader.class) {
                                        Log.d("SoLoader", "Loaded: " + str);
                                        f6445h.add(str);
                                    }
                                } catch (IOException e2) {
                                    throw new RuntimeException(e2);
                                } catch (UnsatisfiedLinkError e3) {
                                    String message = e3.getMessage();
                                    if (message != null && message.contains("unexpected e_machine:")) {
                                        throw new b(e3);
                                    }
                                    throw e3;
                                }
                            }
                        }
                    }
                    if ((i2 & 16) == 0) {
                        if (!TextUtils.isEmpty(str2) && j.contains(str2)) {
                            z2 = true;
                        }
                        if (str3 != null && !z2) {
                            if (f6438a) {
                                Api18TraceUtils.a("MergedSoMapping.invokeJniOnload[", str2, "]");
                            }
                            Log.d("SoLoader", "About to merge: " + str2 + " / " + str);
                            h.a(str2);
                            throw null;
                        }
                    }
                    return !z;
                }
            }
        }
        return false;
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(":");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str2 : split) {
            if (!str2.contains("!")) {
                arrayList.add(str2);
            }
        }
        return TextUtils.join(":", arrayList);
    }

    private static Method b() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23 && i2 <= 27) {
            try {
                Method declaredMethod = Runtime.class.getDeclaredMethod("nativeLoad", String.class, ClassLoader.class, String.class);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (NoSuchMethodException | SecurityException e2) {
                Log.w("SoLoader", "Cannot get nativeLoad method", e2);
            }
        }
        return null;
    }

    private static void b(Context context, int i2, k kVar) {
        int i3;
        com.facebook.soloader.a aVar;
        f6440c.writeLock().lock();
        try {
            if (f6441d == null) {
                Log.d("SoLoader", "init start");
                l = i2;
                ArrayList arrayList = new ArrayList();
                String str = System.getenv("LD_LIBRARY_PATH");
                if (str == null) {
                    str = "/vendor/lib:/system/lib";
                }
                String[] split = str.split(":");
                for (int i4 = 0; i4 < split.length; i4++) {
                    Log.d("SoLoader", "adding system library source: " + split[i4]);
                    arrayList.add(new c(new File(split[i4]), 2));
                }
                if (context != null) {
                    if ((i2 & 1) != 0) {
                        f6443f = null;
                        Log.d("SoLoader", "adding exo package source: lib-main");
                        arrayList.add(0, new e(context, "lib-main"));
                    } else {
                        if (m) {
                            i3 = 0;
                        } else {
                            f6444g = new com.facebook.soloader.b(context, Build.VERSION.SDK_INT <= 17 ? 1 : 0);
                            Log.d("SoLoader", "adding application source: " + f6444g.toString());
                            arrayList.add(0, f6444g);
                            i3 = 1;
                        }
                        if ((l & 8) != 0) {
                            f6443f = null;
                        } else {
                            File file = new File(context.getApplicationInfo().sourceDir);
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(new com.facebook.soloader.a(context, file, "lib-main", i3));
                            Log.d("SoLoader", "adding backup source from : " + aVar.toString());
                            if (Build.VERSION.SDK_INT >= 21 && context.getApplicationInfo().splitSourceDirs != null) {
                                Log.d("SoLoader", "adding backup sources from split apks");
                                String[] strArr = context.getApplicationInfo().splitSourceDirs;
                                int length = strArr.length;
                                int i5 = 0;
                                int i6 = 0;
                                while (i5 < length) {
                                    File file2 = new File(strArr[i5]);
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("lib-");
                                    sb.append(i6);
                                    com.facebook.soloader.a aVar2 = new com.facebook.soloader.a(context, file2, sb.toString(), i3);
                                    Log.d("SoLoader", "adding backup source: " + aVar2.toString());
                                    arrayList2.add(aVar2);
                                    i5++;
                                    i6++;
                                }
                            }
                            f6443f = (n[]) arrayList2.toArray(new n[arrayList2.size()]);
                            arrayList.addAll(0, arrayList2);
                        }
                    }
                }
                l[] lVarArr = (l[]) arrayList.toArray(new l[arrayList.size()]);
                int c2 = c();
                int length2 = lVarArr.length;
                while (true) {
                    int i7 = length2 - 1;
                    if (length2 <= 0) {
                        break;
                    }
                    Log.d("SoLoader", "Preparing SO source: " + lVarArr[i7]);
                    lVarArr[i7].a(c2);
                    length2 = i7;
                }
                f6441d = lVarArr;
                f6442e++;
                Log.d("SoLoader", "init finish: " + f6441d.length + " SO sources prepared");
            }
        } finally {
            Log.d("SoLoader", "init exiting");
            f6440c.writeLock().unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(String str, int i2, StrictMode.ThreadPolicy threadPolicy) {
        a(str, null, null, i2, threadPolicy);
    }

    private static int c() {
        f6440c.writeLock().lock();
        try {
            return (l & 2) != 0 ? 1 : 0;
        } finally {
            f6440c.writeLock().unlock();
        }
    }

    public static File c(String str) {
        a();
        try {
            return d(System.mapLibraryName(str));
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    static File d(String str) {
        f6440c.readLock().lock();
        for (int i2 = 0; i2 < f6441d.length; i2++) {
            try {
                File a2 = f6441d[i2].a(str);
                if (a2 != null) {
                    return a2;
                }
            } finally {
                f6440c.readLock().unlock();
            }
        }
        f6440c.readLock().unlock();
        throw new FileNotFoundException(str);
    }
}
