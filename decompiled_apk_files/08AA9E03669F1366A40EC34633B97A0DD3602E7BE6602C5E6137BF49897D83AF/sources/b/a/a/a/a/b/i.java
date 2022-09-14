package b.a.a.a.a.b;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.provider.Settings;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
/* compiled from: CommonUtils.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f1064b = null;

    /* renamed from: d  reason: collision with root package name */
    private static long f1066d = -1;

    /* renamed from: c  reason: collision with root package name */
    private static final char[] f1065c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a  reason: collision with root package name */
    public static final Comparator<File> f1063a = new Comparator<File>() { // from class: b.a.a.a.a.b.i.1
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(File file, File file2) {
            return (int) (file.lastModified() - file2.lastModified());
        }
    };

    public static String b(int i) {
        switch (i) {
            case 2:
                return "V";
            case 3:
                return "D";
            case 4:
                return "I";
            case 5:
                return "W";
            case 6:
                return "E";
            case 7:
                return "A";
            default:
                return "?";
        }
    }

    public static SharedPreferences a(Context context) {
        return context.getSharedPreferences("com.crashlytics.prefs", 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
        r1 = r2[1];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.io.File r6, java.lang.String r7) {
        /*
            boolean r0 = r6.exists()
            r1 = 0
            if (r0 == 0) goto L63
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            r3 = 1024(0x400, float:1.435E-42)
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
        L13:
            java.lang.String r2 = r0.readLine()     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L5c
            if (r2 == 0) goto L34
            java.lang.String r3 = "\\s*:\\s*"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L5c
            r4 = 2
            java.lang.String[] r2 = r3.split(r2, r4)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L5c
            int r3 = r2.length     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L5c
            r4 = 1
            if (r3 <= r4) goto L13
            r3 = 0
            r3 = r2[r3]     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L5c
            boolean r3 = r3.equals(r7)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L5c
            if (r3 == 0) goto L13
            r7 = r2[r4]     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L5c
            r1 = r7
        L34:
            java.lang.String r6 = "Failed to close system file reader."
            a(r0, r6)
            goto L63
        L3a:
            r7 = move-exception
            goto L41
        L3c:
            r6 = move-exception
            r0 = r1
            goto L5d
        L3f:
            r7 = move-exception
            r0 = r1
        L41:
            b.a.a.a.l r2 = b.a.a.a.c.h()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r3 = "Fabric"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r4.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r5 = "Error parsing "
            r4.append(r5)     // Catch: java.lang.Throwable -> L5c
            r4.append(r6)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Throwable -> L5c
            r2.e(r3, r6, r7)     // Catch: java.lang.Throwable -> L5c
            goto L34
        L5c:
            r6 = move-exception
        L5d:
            java.lang.String r7 = "Failed to close system file reader."
            a(r0, r7)
            throw r6
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.a.b.i.a(java.io.File, java.lang.String):java.lang.String");
    }

    public static int a() {
        return a.a().ordinal();
    }

    /* compiled from: CommonUtils.java */
    /* loaded from: classes.dex */
    enum a {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        
        private static final Map<String, a> k = new HashMap(4);

        static {
            k.put("armeabi-v7a", ARMV7);
            k.put("armeabi", ARMV6);
            k.put("arm64-v8a", ARM64);
            k.put("x86", X86_32);
        }

        static a a() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                b.a.a.a.c.h().a("Fabric", "Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            a aVar = k.get(str.toLowerCase(Locale.US));
            return aVar == null ? UNKNOWN : aVar;
        }
    }

    public static synchronized long b() {
        long j;
        long a2;
        synchronized (i.class) {
            if (f1066d == -1) {
                long j2 = 0;
                String a3 = a(new File("/proc/meminfo"), "MemTotal");
                if (!TextUtils.isEmpty(a3)) {
                    String upperCase = a3.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            a2 = a(upperCase, "KB", 1024);
                        } else if (upperCase.endsWith("MB")) {
                            a2 = a(upperCase, "MB", (int) PKIFailureInfo.badCertTemplate);
                        } else if (upperCase.endsWith("GB")) {
                            a2 = a(upperCase, "GB", 1073741824);
                        } else {
                            b.a.a.a.l h = b.a.a.a.c.h();
                            h.a("Fabric", "Unexpected meminfo format while computing RAM: " + upperCase);
                        }
                        j2 = a2;
                    } catch (NumberFormatException e) {
                        b.a.a.a.l h2 = b.a.a.a.c.h();
                        h2.e("Fabric", "Unexpected meminfo format while computing RAM: " + upperCase, e);
                    }
                }
                f1066d = j2;
            }
            j = f1066d;
        }
        return j;
    }

    static long a(String str, String str2, int i) {
        return Long.parseLong(str.split(str2)[0].trim()) * i;
    }

    public static ActivityManager.RunningAppProcessInfo a(String str, Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(str)) {
                    return runningAppProcessInfo;
                }
            }
        }
        return null;
    }

    public static String a(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return useDelimiter.hasNext() ? useDelimiter.next() : "";
    }

    public static String a(String str) {
        return a(str, McElieceCCA2KeyGenParameterSpec.SHA1);
    }

    public static String b(String str) {
        return a(str, McElieceCCA2KeyGenParameterSpec.SHA256);
    }

    public static String b(InputStream inputStream) {
        return a(inputStream, McElieceCCA2KeyGenParameterSpec.SHA1);
    }

    private static String a(String str, String str2) {
        return a(str.getBytes(), str2);
    }

    private static String a(InputStream inputStream, String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    messageDigest.update(bArr, 0, read);
                } else {
                    return a(messageDigest.digest());
                }
            }
        } catch (Exception e) {
            b.a.a.a.c.h().e("Fabric", "Could not calculate hash for app icon.", e);
            return "";
        }
    }

    private static String a(byte[] bArr, String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return a(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            b.a.a.a.l h = b.a.a.a.c.h();
            h.e("Fabric", "Could not create hashing algorithm: " + str + ", returning empty string.", e);
            return "";
        }
    }

    public static String a(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList();
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace("-", "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (String str2 : arrayList) {
            sb.append(str2);
        }
        String sb2 = sb.toString();
        if (sb2.length() <= 0) {
            return null;
        }
        return a(sb2);
    }

    public static long b(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static long c(String str) {
        StatFs statFs;
        long blockSize = new StatFs(str).getBlockSize();
        return (statFs.getBlockCount() * blockSize) - (blockSize * statFs.getAvailableBlocks());
    }

    public static Float c(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return null;
        }
        return Float.valueOf(registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1));
    }

    public static boolean d(Context context) {
        return !f(context) && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null;
    }

    public static void a(Context context, String str) {
        if (e(context)) {
            b.a.a.a.c.h().a("Fabric", str);
        }
    }

    public static void a(Context context, String str, Throwable th) {
        if (e(context)) {
            b.a.a.a.c.h().e("Fabric", str);
        }
    }

    public static void a(Context context, int i, String str, String str2) {
        if (e(context)) {
            b.a.a.a.c.h().a(i, "Fabric", str2);
        }
    }

    public static boolean e(Context context) {
        if (f1064b == null) {
            f1064b = Boolean.valueOf(a(context, "com.crashlytics.Trace", false));
        }
        return f1064b.booleanValue();
    }

    public static boolean a(Context context, String str, boolean z) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int a2 = a(context, str, "bool");
            if (a2 > 0) {
                return resources.getBoolean(a2);
            }
            int a3 = a(context, str, "string");
            if (a3 > 0) {
                return Boolean.parseBoolean(context.getString(a3));
            }
        }
        return z;
    }

    public static int a(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, j(context));
    }

    public static boolean f(Context context) {
        return "sdk".equals(Build.PRODUCT) || "google_sdk".equals(Build.PRODUCT) || Settings.Secure.getString(context.getContentResolver(), "android_id") == null;
    }

    public static boolean g(Context context) {
        boolean f = f(context);
        String str = Build.TAGS;
        if ((f || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !f && new File("/system/xbin/su").exists();
        }
        return true;
    }

    public static boolean c() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    public static int h(Context context) {
        int i = f(context) ? 1 : 0;
        if (g(context)) {
            i |= 2;
        }
        return c() ? i | 4 : i;
    }

    public static int a(Context context, boolean z) {
        Float c2 = c(context);
        if (!z || c2 == null) {
            return 1;
        }
        if (c2.floatValue() >= 99.0d) {
            return 3;
        }
        return ((double) c2.floatValue()) < 99.0d ? 2 : 0;
    }

    public static String a(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            cArr[i3] = f1065c[i2 >>> 4];
            cArr[i3 + 1] = f1065c[i2 & 15];
        }
        return new String(cArr);
    }

    public static boolean i(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static String b(Context context, String str) {
        int a2 = a(context, str, "string");
        return a2 > 0 ? context.getString(a2) : "";
    }

    public static void a(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                b.a.a.a.c.h().e("Fabric", str, e);
            }
        }
    }

    public static void a(Flushable flushable, String str) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (IOException e) {
                b.a.a.a.c.h().e("Fabric", str, e);
            }
        }
    }

    public static boolean d(String str) {
        return str == null || str.length() == 0;
    }

    public static String a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("value must be zero or greater");
        }
        return String.format(Locale.US, "%1$10s", Integer.valueOf(i)).replace(' ', '0');
    }

    public static String j(Context context) {
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i > 0) {
            return context.getResources().getResourcePackageName(i);
        }
        return context.getPackageName();
    }

    public static void a(InputStream inputStream, OutputStream outputStream, byte[] bArr) {
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static String k(Context context) {
        Throwable th;
        InputStream inputStream;
        String str = null;
        try {
            inputStream = context.getResources().openRawResource(l(context));
            try {
                try {
                    String b2 = b(inputStream);
                    if (!d(b2)) {
                        str = b2;
                    }
                    a((Closeable) inputStream, "Failed to close icon input stream.");
                    return str;
                } catch (Exception e) {
                    e = e;
                    b.a.a.a.c.h().e("Fabric", "Could not calculate hash for app icon.", e);
                    a((Closeable) inputStream, "Failed to close icon input stream.");
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                a((Closeable) inputStream, "Failed to close icon input stream.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            a((Closeable) inputStream, "Failed to close icon input stream.");
            throw th;
        }
    }

    public static int l(Context context) {
        return context.getApplicationContext().getApplicationInfo().icon;
    }

    public static String m(Context context) {
        int a2 = a(context, "io.fabric.android.build_id", "string");
        if (a2 == 0) {
            a2 = a(context, "com.crashlytics.android.build_id", "string");
        }
        if (a2 != 0) {
            String string = context.getResources().getString(a2);
            b.a.a.a.l h = b.a.a.a.c.h();
            h.a("Fabric", "Build ID is: " + string);
            return string;
        }
        return null;
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean c(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    @SuppressLint({"MissingPermission"})
    public static boolean n(Context context) {
        if (c(context, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
        }
        return true;
    }
}
