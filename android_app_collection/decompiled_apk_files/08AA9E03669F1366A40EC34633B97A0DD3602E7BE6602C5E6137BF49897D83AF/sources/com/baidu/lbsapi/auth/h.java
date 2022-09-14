package com.baidu.lbsapi.auth;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.baidu.android.bbalbs.common.util.CommonParam;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.dynamite.ProviderConstants;
import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private static Context f1497a;

    /* renamed from: d  reason: collision with root package name */
    private static n f1498d;
    private static int e;
    private static Hashtable<String, m> f = new Hashtable<>();
    private static h g;

    /* renamed from: b  reason: collision with root package name */
    private c f1499b = null;

    /* renamed from: c  reason: collision with root package name */
    private e f1500c = null;
    private final Handler h = new i(this, Looper.getMainLooper());

    private h(Context context) {
        f1497a = context;
        if (f1498d != null && !f1498d.isAlive()) {
            f1498d = null;
        }
        d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
        if (r0.format(java.lang.Long.valueOf(r5)).equals(r0.format(java.lang.Long.valueOf(r3))) == false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int a(java.lang.String r13) {
        /*
            r12 = this;
            r0 = -1
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L8e
            r1.<init>(r13)     // Catch: org.json.JSONException -> L8e
            java.lang.String r13 = "status"
            boolean r13 = r1.has(r13)     // Catch: org.json.JSONException -> L8e
            if (r13 != 0) goto L13
            java.lang.String r13 = "status"
            r1.put(r13, r0)     // Catch: org.json.JSONException -> L8e
        L13:
            java.lang.String r13 = "status"
            int r13 = r1.getInt(r13)     // Catch: org.json.JSONException -> L8e
            java.lang.String r0 = "current"
            boolean r0 = r1.has(r0)     // Catch: org.json.JSONException -> L89
            r2 = 601(0x259, float:8.42E-43)
            if (r0 == 0) goto L60
            if (r13 != 0) goto L60
            java.lang.String r0 = "current"
            long r3 = r1.getLong(r0)     // Catch: org.json.JSONException -> L89
            long r5 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L89
            r0 = 0
            long r7 = r5 - r3
            double r7 = (double) r7     // Catch: org.json.JSONException -> L89
            r9 = 4704985352480227328(0x414b774000000000, double:3600000.0)
            double r7 = r7 / r9
            r9 = 4627448617123184640(0x4038000000000000, double:24.0)
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 < 0) goto L42
        L3f:
            r0 = 601(0x259, float:8.42E-43)
            goto L61
        L42:
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch: org.json.JSONException -> L89
            java.lang.String r7 = "yyyy-MM-dd"
            r0.<init>(r7)     // Catch: org.json.JSONException -> L89
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: org.json.JSONException -> L89
            java.lang.String r5 = r0.format(r5)     // Catch: org.json.JSONException -> L89
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: org.json.JSONException -> L89
            java.lang.String r0 = r0.format(r3)     // Catch: org.json.JSONException -> L89
            boolean r0 = r5.equals(r0)     // Catch: org.json.JSONException -> L89
            if (r0 != 0) goto L60
            goto L3f
        L60:
            r0 = r13
        L61:
            java.lang.String r13 = "current"
            boolean r13 = r1.has(r13)     // Catch: org.json.JSONException -> L8e
            if (r13 == 0) goto L92
            r13 = 602(0x25a, float:8.44E-43)
            if (r0 != r13) goto L92
            java.lang.String r13 = "current"
            long r3 = r1.getLong(r13)     // Catch: org.json.JSONException -> L8e
            long r5 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L8e
            r13 = 0
            long r5 = r5 - r3
            r3 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r3
            double r3 = (double) r5
            r5 = 4640537203540230144(0x4066800000000000, double:180.0)
            int r13 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r13 <= 0) goto L92
            r0 = 601(0x259, float:8.42E-43)
            return r0
        L89:
            r0 = move-exception
            r11 = r0
            r0 = r13
            r13 = r11
            goto L8f
        L8e:
            r13 = move-exception
        L8f:
            r13.printStackTrace()
        L92:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.lbsapi.auth.h.a(java.lang.String):int");
    }

    public static h a(Context context) {
        if (g == null) {
            synchronized (h.class) {
                if (g == null) {
                    g = new h(context);
                }
            }
        } else {
            f1497a = context;
        }
        return g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0078, code lost:
        if (r6 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0088, code lost:
        if (r6 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x008a, code lost:
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008d, code lost:
        return null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.InputStreamReader] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String a(int r6) {
        /*
            r5 = this;
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L6b java.io.FileNotFoundException -> L7b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L6b java.io.FileNotFoundException -> L7b
            r2.<init>()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L6b java.io.FileNotFoundException -> L7b
            java.lang.String r3 = "/proc/"
            r2.append(r3)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L6b java.io.FileNotFoundException -> L7b
            r2.append(r6)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L6b java.io.FileNotFoundException -> L7b
            java.lang.String r6 = "/cmdline"
            r2.append(r6)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L6b java.io.FileNotFoundException -> L7b
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L6b java.io.FileNotFoundException -> L7b
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L6b java.io.FileNotFoundException -> L7b
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L6b java.io.FileNotFoundException -> L7b
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L6b java.io.FileNotFoundException -> L7b
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L54 java.io.FileNotFoundException -> L56
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L54 java.io.FileNotFoundException -> L56
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L4b java.io.FileNotFoundException -> L4d
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L4b java.io.FileNotFoundException -> L4d
            java.lang.String r3 = r2.readLine()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L6e java.io.FileNotFoundException -> L7e
            if (r2 == 0) goto L34
            r2.close()
        L34:
            if (r1 == 0) goto L39
            r1.close()
        L39:
            if (r6 == 0) goto L3e
            r6.close()
        L3e:
            r0 = r3
            return r0
        L40:
            r0 = move-exception
            r4 = r2
            r2 = r6
            r6 = r0
            r0 = r4
            goto L5b
        L46:
            r2 = move-exception
            r4 = r2
            r2 = r6
            r6 = r4
            goto L5b
        L4b:
            r2 = r0
            goto L6e
        L4d:
            r2 = r0
            goto L7e
        L4f:
            r1 = move-exception
            r2 = r6
            r6 = r1
            r1 = r0
            goto L5b
        L54:
            r1 = r0
            goto L6d
        L56:
            r1 = r0
            goto L7d
        L58:
            r6 = move-exception
            r1 = r0
            r2 = r1
        L5b:
            if (r0 == 0) goto L60
            r0.close()
        L60:
            if (r1 == 0) goto L65
            r1.close()
        L65:
            if (r2 == 0) goto L6a
            r2.close()
        L6a:
            throw r6
        L6b:
            r6 = r0
            r1 = r6
        L6d:
            r2 = r1
        L6e:
            if (r2 == 0) goto L73
            r2.close()
        L73:
            if (r1 == 0) goto L78
            r1.close()
        L78:
            if (r6 == 0) goto L8d
            goto L8a
        L7b:
            r6 = r0
            r1 = r6
        L7d:
            r2 = r1
        L7e:
            if (r2 == 0) goto L83
            r2.close()
        L83:
            if (r1 == 0) goto L88
            r1.close()
        L88:
            if (r6 == 0) goto L8d
        L8a:
            r6.close()
        L8d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.lbsapi.auth.h.a(int):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r5.equals("") != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String a(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = r5.getPackageName()
            r2 = -1
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            android.os.Bundle r1 = r5.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            if (r1 != 0) goto L2a
            java.util.Hashtable<java.lang.String, com.baidu.lbsapi.auth.m> r5 = com.baidu.lbsapi.auth.h.f     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            java.lang.Object r5 = r5.get(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            com.baidu.lbsapi.auth.m r5 = (com.baidu.lbsapi.auth.m) r5     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            if (r5 == 0) goto L28
            java.lang.String r1 = "AndroidManifest.xml的application中没有meta-data标签"
            java.lang.String r1 = com.baidu.lbsapi.auth.ErrorMessage.a(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            r5.a(r2, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
        L28:
            r5 = r0
            return r5
        L2a:
            android.os.Bundle r5 = r5.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            java.lang.String r1 = "com.baidu.lbsapi.API_KEY"
            java.lang.String r5 = r5.getString(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            if (r5 == 0) goto L3c
            java.lang.String r0 = ""
            boolean r0 = r5.equals(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L51
            if (r0 == 0) goto L64
        L3c:
            java.util.Hashtable<java.lang.String, com.baidu.lbsapi.auth.m> r0 = com.baidu.lbsapi.auth.h.f     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L51
            java.lang.Object r0 = r0.get(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L51
            com.baidu.lbsapi.auth.m r0 = (com.baidu.lbsapi.auth.m) r0     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L51
            if (r0 == 0) goto L64
            java.lang.String r1 = "无法在AndroidManifest.xml中获取com.baidu.android.lbs.API_KEY的值"
            java.lang.String r1 = com.baidu.lbsapi.auth.ErrorMessage.a(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L51
            r0.a(r2, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L51
            return r5
        L50:
            r5 = r0
        L51:
            java.util.Hashtable<java.lang.String, com.baidu.lbsapi.auth.m> r0 = com.baidu.lbsapi.auth.h.f
            java.lang.Object r6 = r0.get(r6)
            com.baidu.lbsapi.auth.m r6 = (com.baidu.lbsapi.auth.m) r6
            if (r6 == 0) goto L64
            java.lang.String r0 = "无法在AndroidManifest.xml中获取com.baidu.android.lbs.API_KEY的值"
            java.lang.String r0 = com.baidu.lbsapi.auth.ErrorMessage.a(r0)
            r6.a(r2, r0)
        L64:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.lbsapi.auth.h.a(android.content.Context, java.lang.String):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d A[Catch: all -> 0x0008, TryCatch #0 {all -> 0x0008, blocks: (B:4:0x0003, B:7:0x000b, B:9:0x0012, B:11:0x001f, B:12:0x0024, B:14:0x002c, B:15:0x0035, B:17:0x0044, B:18:0x0049, B:19:0x004f, B:25:0x008e, B:27:0x009d, B:28:0x00b3, B:30:0x00b7, B:32:0x00c0, B:24:0x0070), top: B:37:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7 A[Catch: all -> 0x0008, TryCatch #0 {all -> 0x0008, blocks: (B:4:0x0003, B:7:0x000b, B:9:0x0012, B:11:0x001f, B:12:0x0024, B:14:0x002c, B:15:0x0035, B:17:0x0044, B:18:0x0049, B:19:0x004f, B:25:0x008e, B:27:0x009d, B:28:0x00b3, B:30:0x00b7, B:32:0x00c0, B:24:0x0070), top: B:37:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void a(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            if (r7 != 0) goto Lb
            java.lang.String r7 = r6.e()     // Catch: java.lang.Throwable -> L8
            goto Lb
        L8:
            r7 = move-exception
            goto Lc5
        Lb:
            android.os.Handler r0 = r6.h     // Catch: java.lang.Throwable -> L8
            android.os.Message r0 = r0.obtainMessage()     // Catch: java.lang.Throwable -> L8
            r1 = -1
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L8 org.json.JSONException -> L6f
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L8 org.json.JSONException -> L6f
            java.lang.String r7 = "status"
            boolean r7 = r2.has(r7)     // Catch: java.lang.Throwable -> L8 org.json.JSONException -> L6f
            if (r7 != 0) goto L24
            java.lang.String r7 = "status"
            r2.put(r7, r1)     // Catch: java.lang.Throwable -> L8 org.json.JSONException -> L6f
        L24:
            java.lang.String r7 = "current"
            boolean r7 = r2.has(r7)     // Catch: java.lang.Throwable -> L8 org.json.JSONException -> L6f
            if (r7 != 0) goto L35
            java.lang.String r7 = "current"
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L8 org.json.JSONException -> L6f
            r2.put(r7, r3)     // Catch: java.lang.Throwable -> L8 org.json.JSONException -> L6f
        L35:
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Throwable -> L8 org.json.JSONException -> L6f
            r6.c(r7)     // Catch: java.lang.Throwable -> L8 org.json.JSONException -> L6f
            java.lang.String r7 = "current"
            boolean r7 = r2.has(r7)     // Catch: java.lang.Throwable -> L8 org.json.JSONException -> L6f
            if (r7 == 0) goto L49
            java.lang.String r7 = "current"
            r2.remove(r7)     // Catch: java.lang.Throwable -> L8 org.json.JSONException -> L6f
        L49:
            java.lang.String r7 = "status"
            int r7 = r2.getInt(r7)     // Catch: java.lang.Throwable -> L8 org.json.JSONException -> L6f
            r0.what = r7     // Catch: java.lang.Throwable -> L8 org.json.JSONException -> L6a
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L8 org.json.JSONException -> L6a
            r0.obj = r1     // Catch: java.lang.Throwable -> L8 org.json.JSONException -> L6a
            android.os.Bundle r1 = new android.os.Bundle     // Catch: java.lang.Throwable -> L8 org.json.JSONException -> L6a
            r1.<init>()     // Catch: java.lang.Throwable -> L8 org.json.JSONException -> L6a
            java.lang.String r2 = "listenerKey"
            r1.putString(r2, r8)     // Catch: java.lang.Throwable -> L8 org.json.JSONException -> L6a
            r0.setData(r1)     // Catch: java.lang.Throwable -> L8 org.json.JSONException -> L6a
            android.os.Handler r1 = r6.h     // Catch: java.lang.Throwable -> L8 org.json.JSONException -> L6a
            r1.sendMessage(r0)     // Catch: java.lang.Throwable -> L8 org.json.JSONException -> L6a
            goto L8e
        L6a:
            r1 = move-exception
            r5 = r1
            r1 = r7
            r7 = r5
            goto L70
        L6f:
            r7 = move-exception
        L70:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L8
            r0.what = r1     // Catch: java.lang.Throwable -> L8
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L8
            r7.<init>()     // Catch: java.lang.Throwable -> L8
            r0.obj = r7     // Catch: java.lang.Throwable -> L8
            android.os.Bundle r7 = new android.os.Bundle     // Catch: java.lang.Throwable -> L8
            r7.<init>()     // Catch: java.lang.Throwable -> L8
            java.lang.String r1 = "listenerKey"
            r7.putString(r1, r8)     // Catch: java.lang.Throwable -> L8
            r0.setData(r7)     // Catch: java.lang.Throwable -> L8
            android.os.Handler r7 = r6.h     // Catch: java.lang.Throwable -> L8
            r7.sendMessage(r0)     // Catch: java.lang.Throwable -> L8
        L8e:
            com.baidu.lbsapi.auth.n r7 = com.baidu.lbsapi.auth.h.f1498d     // Catch: java.lang.Throwable -> L8
            r7.c()     // Catch: java.lang.Throwable -> L8
            int r7 = com.baidu.lbsapi.auth.h.e     // Catch: java.lang.Throwable -> L8
            int r7 = r7 + (-1)
            com.baidu.lbsapi.auth.h.e = r7     // Catch: java.lang.Throwable -> L8
            boolean r7 = com.baidu.lbsapi.auth.a.f1483a     // Catch: java.lang.Throwable -> L8
            if (r7 == 0) goto Lb3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8
            r7.<init>()     // Catch: java.lang.Throwable -> L8
            java.lang.String r8 = "httpRequest called mAuthCounter-- = "
            r7.append(r8)     // Catch: java.lang.Throwable -> L8
            int r8 = com.baidu.lbsapi.auth.h.e     // Catch: java.lang.Throwable -> L8
            r7.append(r8)     // Catch: java.lang.Throwable -> L8
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L8
            com.baidu.lbsapi.auth.a.a(r7)     // Catch: java.lang.Throwable -> L8
        Lb3:
            int r7 = com.baidu.lbsapi.auth.h.e     // Catch: java.lang.Throwable -> L8
            if (r7 != 0) goto Lc3
            com.baidu.lbsapi.auth.n r7 = com.baidu.lbsapi.auth.h.f1498d     // Catch: java.lang.Throwable -> L8
            r7.a()     // Catch: java.lang.Throwable -> L8
            com.baidu.lbsapi.auth.n r7 = com.baidu.lbsapi.auth.h.f1498d     // Catch: java.lang.Throwable -> L8
            if (r7 == 0) goto Lc3
            r7 = 0
            com.baidu.lbsapi.auth.h.f1498d = r7     // Catch: java.lang.Throwable -> L8
        Lc3:
            monitor-exit(r6)
            return
        Lc5:
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.lbsapi.auth.h.a(java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, String str, Hashtable<String, String> hashtable, String str2) {
        String str3;
        String a2 = a(f1497a, str2);
        if (a2 == null || a2.equals("")) {
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(ImagesContract.URL, "https://api.map.baidu.com/sdkcs/verify");
        hashMap.put("output", "json");
        hashMap.put("ak", a2);
        hashMap.put("mcode", b.a(f1497a));
        hashMap.put("from", "lbs_yunsdk");
        if (hashtable != null && hashtable.size() > 0) {
            for (Map.Entry<String, String> entry : hashtable.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                    hashMap.put(key, value);
                }
            }
        }
        String str4 = "";
        try {
            str4 = CommonParam.a(f1497a);
        } catch (Exception unused) {
        }
        a.a("cuid:" + str4);
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put("cuid", str4);
        } else {
            hashMap.put("cuid", "");
        }
        hashMap.put("pcn", f1497a.getPackageName());
        hashMap.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, "1.0.6");
        String str5 = "";
        try {
            str5 = b.c(f1497a);
        } catch (Exception unused2) {
        }
        if (!TextUtils.isEmpty(str5)) {
            hashMap.put("macaddr", str5);
        } else {
            hashMap.put("macaddr", "");
        }
        String str6 = "";
        try {
            str6 = b.a();
        } catch (Exception unused3) {
        }
        if (!TextUtils.isEmpty(str6)) {
            hashMap.put("language", str6);
        } else {
            hashMap.put("language", "");
        }
        if (z) {
            hashMap.put("force", z ? "1" : "0");
        }
        if (str == null) {
            str3 = "from_service";
            str = "";
        } else {
            str3 = "from_service";
        }
        hashMap.put(str3, str);
        this.f1499b = new c(f1497a);
        this.f1499b.a(hashMap, new k(this, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, String str, Hashtable<String, String> hashtable, String[] strArr, String str2) {
        String str3;
        String a2 = a(f1497a, str2);
        if (a2 == null || a2.equals("")) {
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(ImagesContract.URL, "https://api.map.baidu.com/sdkcs/verify");
        hashMap.put("output", "json");
        hashMap.put("ak", a2);
        hashMap.put("from", "lbs_yunsdk");
        if (hashtable != null && hashtable.size() > 0) {
            for (Map.Entry<String, String> entry : hashtable.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                    hashMap.put(key, value);
                }
            }
        }
        String str4 = "";
        try {
            str4 = CommonParam.a(f1497a);
        } catch (Exception unused) {
        }
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put("cuid", str4);
        } else {
            hashMap.put("cuid", "");
        }
        hashMap.put("pcn", f1497a.getPackageName());
        hashMap.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, "1.0.6");
        String str5 = "";
        try {
            str5 = b.c(f1497a);
        } catch (Exception unused2) {
        }
        if (!TextUtils.isEmpty(str5)) {
            hashMap.put("macaddr", str5);
        } else {
            hashMap.put("macaddr", "");
        }
        String str6 = "";
        try {
            str6 = b.a();
        } catch (Exception unused3) {
        }
        if (!TextUtils.isEmpty(str6)) {
            hashMap.put("language", str6);
        } else {
            hashMap.put("language", "");
        }
        if (z) {
            hashMap.put("force", z ? "1" : "0");
        }
        if (str == null) {
            str3 = "from_service";
            str = "";
        } else {
            str3 = "from_service";
        }
        hashMap.put(str3, str);
        this.f1500c = new e(f1497a);
        this.f1500c.a(hashMap, strArr, new l(this, str2));
    }

    private String b(Context context) {
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        String str = null;
        try {
            str = a(myPid);
        } catch (IOException unused) {
        }
        return str != null ? str : f1497a.getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str) {
        String str2;
        JSONObject jSONObject;
        String a2 = a(f1497a, str);
        try {
            jSONObject = new JSONObject(e());
        } catch (JSONException e2) {
            e2.printStackTrace();
            str2 = "";
        }
        if (!jSONObject.has("ak")) {
            return true;
        }
        str2 = jSONObject.getString("ak");
        return (a2 == null || str2 == null || a2.equals(str2)) ? false : true;
    }

    private void c(String str) {
        Context context = f1497a;
        context.getSharedPreferences("authStatus_" + b(f1497a), 0).edit().putString("status", str).commit();
    }

    private void d() {
        synchronized (h.class) {
            if (f1498d == null) {
                f1498d = new n("auth");
                f1498d.start();
                while (f1498d.f1510a == null) {
                    try {
                        if (a.f1483a) {
                            a.a("wait for create auth thread.");
                        }
                        Thread.sleep(3L);
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }

    private String e() {
        Context context = f1497a;
        return context.getSharedPreferences("authStatus_" + b(f1497a), 0).getString("status", "{\"status\":601}");
    }

    public int a(boolean z, String str, Hashtable<String, String> hashtable, m mVar) {
        synchronized (h.class) {
            String str2 = System.currentTimeMillis() + "";
            if (mVar != null) {
                f.put(str2, mVar);
            }
            String a2 = a(f1497a, str2);
            if (a2 != null && !a2.equals("")) {
                e++;
                if (a.f1483a) {
                    a.a(" mAuthCounter  ++ = " + e);
                }
                String e2 = e();
                if (a.f1483a) {
                    a.a("getAuthMessage from cache:" + e2);
                }
                int a3 = a(e2);
                if (a3 == 601) {
                    try {
                        c(new JSONObject().put("status", 602).toString());
                    } catch (JSONException e3) {
                        e3.printStackTrace();
                    }
                }
                d();
                if (a.f1483a) {
                    a.a("mThreadLooper.mHandler = " + f1498d.f1510a);
                }
                if (f1498d != null && f1498d.f1510a != null) {
                    f1498d.f1510a.post(new j(this, a3, z, str2, str, hashtable));
                    return a3;
                }
                return -1;
            }
            return -1;
        }
    }
}
