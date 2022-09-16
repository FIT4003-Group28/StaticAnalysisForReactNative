package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aocu  reason: default package */
/* loaded from: classes.dex */
public final class aocu implements Runnable {
    private static final Object c = new Object();
    private static Boolean d;
    private static Boolean e;
    public final Context a;
    public final aocs b;
    private final aocd f;
    private final PowerManager.WakeLock g;
    private final long h;

    public aocu(aocs aocsVar, Context context, aocd aocdVar, long j) {
        this.b = aocsVar;
        this.a = context;
        this.h = j;
        this.f = aocdVar;
        this.g = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    private static boolean b(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    private static boolean c(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (c) {
            Boolean bool = d;
            if (bool == null) {
                booleanValue = b(context, "android.permission.WAKE_LOCK", bool);
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            d = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    public final synchronized boolean a() {
        boolean z;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo != null) {
            if (activeNetworkInfo.isConnected()) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
        r4 = r3.b;
        r5 = r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0095, code lost:
        if (r5 == 83) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0099, code lost:
        if (r5 == 85) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a2, code lost:
        if (r4.equals("U") == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a4, code lost:
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ac, code lost:
        if (r4.equals("S") == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ae, code lost:
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b0, code lost:
        r4 = 65535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b1, code lost:
        if (r4 == 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b3, code lost:
        if (r4 == 1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b7, code lost:
        r4 = r3.a;
        r5 = r1.a;
        r6 = r1.b.d();
        r7 = new android.os.Bundle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ce, code lost:
        if (r4.length() == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d0, code lost:
        r9 = "/topics/".concat(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d5, code lost:
        r9 = new java.lang.String("/topics/");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00db, code lost:
        r7.putString("gcm.topic", r9);
        r7.putString("delete", "1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00eb, code lost:
        if (r4.length() == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ed, code lost:
        r4 = "/topics/".concat(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f2, code lost:
        r4 = new java.lang.String("/topics/");
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f7, code lost:
        defpackage.aocs.c(defpackage.aobz.b(r5.a(r6, r4, r7)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0103, code lost:
        r4 = r3.a;
        r5 = r1.a;
        r6 = r1.b.d();
        r7 = new android.os.Bundle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x011a, code lost:
        if (r4.length() == 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011c, code lost:
        r9 = "/topics/".concat(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0121, code lost:
        r9 = new java.lang.String("/topics/");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0127, code lost:
        r7.putString("gcm.topic", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0130, code lost:
        if (r4.length() == 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0132, code lost:
        r4 = "/topics/".concat(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0137, code lost:
        r4 = new java.lang.String("/topics/");
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x013c, code lost:
        defpackage.aocs.c(defpackage.aobz.b(r5.a(r6, r4, r7)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0147, code lost:
        r1.d.d(r3);
        r4 = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014e, code lost:
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x014f, code lost:
        r3 = r3.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0157, code lost:
        if (r1.c.containsKey(r3) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0159, code lost:
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x015c, code lost:
        r5 = (java.util.ArrayDeque) r1.c.get(r3);
        r6 = (defpackage.rvh) r5.poll();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x016a, code lost:
        if (r6 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x016c, code lost:
        r6.b(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0174, code lost:
        if (r5.isEmpty() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0176, code lost:
        r1.c.remove(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x017b, code lost:
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0181, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x018c, code lost:
        if ("SERVICE_NOT_AVAILABLE".equals(r1.getMessage()) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x019f, code lost:
        if (r1.getMessage() == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01a1, code lost:
        android.util.Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01a9, code lost:
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d3, code lost:
        r11.b.g(r11.h);
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aocu.run():void");
    }
}
