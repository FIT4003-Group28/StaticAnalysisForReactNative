package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: devk  reason: default package */
/* loaded from: classes6.dex */
public final class devk implements Runnable {
    private static final Object f = new Object();
    private static Boolean g;
    private static Boolean h;
    public final Context a;
    public final devi b;
    private final derx c;
    private final PowerManager.WakeLock d;
    private final long e;

    public devk(devi deviVar, Context context, derx derxVar, long j) {
        this.b = deviVar;
        this.a = context;
        this.e = j;
        this.c = derxVar;
        this.d = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    private static boolean b(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f) {
            Boolean bool = g;
            if (bool == null) {
                booleanValue = c(context, "android.permission.WAKE_LOCK", bool);
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            g = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    private static boolean c(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return context.checkCallingOrSelfPermission(str) == 0;
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
        r5 = (defpackage.derw) defpackage.devi.d(r1.a.f());
        r6 = r1.b;
        r7 = r5.a;
        r5 = r5.b;
        r8 = new android.os.Bundle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d8, code lost:
        if (r4.length() == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00da, code lost:
        r10 = "/topics/".concat(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00df, code lost:
        r10 = new java.lang.String("/topics/");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e5, code lost:
        r8.putString("gcm.topic", r10);
        r8.putString("delete", "1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f5, code lost:
        if (r4.length() == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f7, code lost:
        r4 = "/topics/".concat(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fc, code lost:
        r4 = new java.lang.String("/topics/");
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0101, code lost:
        defpackage.devi.d(r6.b(r6.a(r7, r5, r4, r8)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x010d, code lost:
        r4 = r3.a;
        r5 = (defpackage.derw) defpackage.devi.d(r1.a.f());
        r6 = r1.b;
        r7 = r5.a;
        r5 = r5.b;
        r8 = new android.os.Bundle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x012e, code lost:
        if (r4.length() == 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0130, code lost:
        r10 = "/topics/".concat(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0135, code lost:
        r10 = new java.lang.String("/topics/");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x013b, code lost:
        r8.putString("gcm.topic", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0144, code lost:
        if (r4.length() == 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0146, code lost:
        r4 = "/topics/".concat(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014b, code lost:
        r4 = new java.lang.String("/topics/");
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0150, code lost:
        defpackage.devi.d(r6.b(r6.a(r7, r5, r4, r8)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x015b, code lost:
        r1.d.b(r3);
        r4 = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0162, code lost:
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0163, code lost:
        r3 = r3.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x016b, code lost:
        if (r1.c.containsKey(r3) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x016d, code lost:
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0170, code lost:
        r5 = r1.c.get(r3);
        r6 = r5.poll();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017e, code lost:
        if (r6 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0180, code lost:
        r6.a(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0188, code lost:
        if (r5.isEmpty() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x018a, code lost:
        r1.c.remove(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x018f, code lost:
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0195, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a0, code lost:
        if ("SERVICE_NOT_AVAILABLE".equals(r1.getMessage()) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b3, code lost:
        if (r1.getMessage() == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b6, code lost:
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01da, code lost:
        r12.b.b(r12.e);
     */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.devk.run():void");
    }
}
