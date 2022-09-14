package com.facebook.react.modules.systeminfo;

import android.os.Build;
import java.util.Locale;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f5776a = "a";

    /* renamed from: b  reason: collision with root package name */
    private static String f5777b;

    public static String a() {
        if (c()) {
            return Build.MODEL;
        }
        return Build.MODEL + " - " + Build.VERSION.RELEASE + " - API " + Build.VERSION.SDK_INT;
    }

    private static String a(int i) {
        String b2 = b();
        if (b2.equals("")) {
            b2 = c() ? "10.0.3.2" : d() ? "10.0.2.2" : "localhost";
        }
        return String.format(Locale.US, "%s:%d", b2, Integer.valueOf(i));
    }

    public static String a(Integer num) {
        return a(num.intValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
        if (r2 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
        r2.destroy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006c, code lost:
        if (r2 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006f, code lost:
        r1 = com.facebook.react.modules.systeminfo.a.f5777b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0072, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static synchronized java.lang.String b() {
        /*
            java.lang.Class<com.facebook.react.modules.systeminfo.a> r0 = com.facebook.react.modules.systeminfo.a.class
            monitor-enter(r0)
            java.lang.String r1 = com.facebook.react.modules.systeminfo.a.f5777b     // Catch: java.lang.Throwable -> L81
            if (r1 == 0) goto Lb
            java.lang.String r1 = com.facebook.react.modules.systeminfo.a.f5777b     // Catch: java.lang.Throwable -> L81
            monitor-exit(r0)
            return r1
        Lb:
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            java.lang.String r3 = "/system/bin/getprop"
            java.lang.String r4 = "metro.host"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            java.lang.Process r2 = r2.exec(r3)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L57
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L73
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L73
            java.io.InputStream r5 = r2.getInputStream()     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L73
            java.lang.String r6 = "UTF-8"
            java.nio.charset.Charset r6 = java.nio.charset.Charset.forName(r6)     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L73
            r4.<init>(r5, r6)     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L73
            r3.<init>(r4)     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L73
            java.lang.String r1 = ""
        L32:
            java.lang.String r4 = r3.readLine()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4c
            if (r4 == 0) goto L3a
            r1 = r4
            goto L32
        L3a:
            com.facebook.react.modules.systeminfo.a.f5777b = r1     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4c
            r3.close()     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L81
            goto L41
        L40:
        L41:
            if (r2 == 0) goto L6f
        L43:
            r2.destroy()     // Catch: java.lang.Throwable -> L81
            goto L6f
        L47:
            r1 = move-exception
            r7 = r3
            r3 = r1
            r1 = r7
            goto L74
        L4c:
            r1 = move-exception
            r7 = r3
            r3 = r1
            r1 = r7
            goto L5a
        L51:
            r3 = move-exception
            goto L5a
        L53:
            r2 = move-exception
            r3 = r2
            r2 = r1
            goto L74
        L57:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L5a:
            java.lang.String r4 = com.facebook.react.modules.systeminfo.a.f5776a     // Catch: java.lang.Throwable -> L73
            java.lang.String r5 = "Failed to query for metro.host prop:"
            c.d.d.e.a.c(r4, r5, r3)     // Catch: java.lang.Throwable -> L73
            java.lang.String r3 = ""
            com.facebook.react.modules.systeminfo.a.f5777b = r3     // Catch: java.lang.Throwable -> L73
            if (r1 == 0) goto L6c
            r1.close()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L81
            goto L6c
        L6b:
        L6c:
            if (r2 == 0) goto L6f
            goto L43
        L6f:
            java.lang.String r1 = com.facebook.react.modules.systeminfo.a.f5777b     // Catch: java.lang.Throwable -> L81
            monitor-exit(r0)
            return r1
        L73:
            r3 = move-exception
        L74:
            if (r1 == 0) goto L7b
            r1.close()     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> L81
            goto L7b
        L7a:
        L7b:
            if (r2 == 0) goto L80
            r2.destroy()     // Catch: java.lang.Throwable -> L81
        L80:
            throw r3     // Catch: java.lang.Throwable -> L81
        L81:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.systeminfo.a.b():java.lang.String");
    }

    private static boolean c() {
        return Build.FINGERPRINT.contains("vbox");
    }

    private static boolean d() {
        return Build.FINGERPRINT.contains("generic");
    }
}
