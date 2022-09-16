package defpackage;

import android.content.Context;
import java.util.Map;
/* compiled from: PG */
/* renamed from: clfl  reason: default package */
/* loaded from: classes5.dex */
final class clfl {
    private final Context a;
    private Map<String, String> b = null;

    public clfl(Context context) {
        this.a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.clfe a(java.lang.String r12) {
        /*
            r11 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r11.b
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L7b
            android.content.Context r0 = r11.a
            android.content.pm.PackageManager r3 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L22
            if (r3 != 0) goto Lf
            goto L22
        Lf:
            android.content.ComponentName r4 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L22
            java.lang.Class<com.google.android.datatransport.runtime.backends.TransportBackendDiscovery> r5 = com.google.android.datatransport.runtime.backends.TransportBackendDiscovery.class
            r4.<init>(r0, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L22
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.ServiceInfo r0 = r3.getServiceInfo(r4, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L22
            if (r0 != 0) goto L1f
            goto L22
        L1f:
            android.os.Bundle r0 = r0.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L22
            goto L23
        L22:
            r0 = r2
        L23:
            if (r0 != 0) goto L2a
            java.util.Map r0 = java.util.Collections.emptyMap()
            goto L79
        L2a:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Set r4 = r0.keySet()
            java.util.Iterator r4 = r4.iterator()
        L37:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L78
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r0.get(r5)
            boolean r7 = r6 instanceof java.lang.String
            if (r7 == 0) goto L37
            java.lang.String r7 = "backend:"
            boolean r7 = r5.startsWith(r7)
            if (r7 == 0) goto L37
            java.lang.String r6 = (java.lang.String) r6
            r7 = -1
            java.lang.String r8 = ","
            java.lang.String[] r6 = r6.split(r8, r7)
            int r7 = r6.length
            r8 = 0
        L5e:
            if (r8 >= r7) goto L37
            r9 = r6[r8]
            java.lang.String r9 = r9.trim()
            boolean r10 = r9.isEmpty()
            if (r10 != 0) goto L75
            r10 = 8
            java.lang.String r10 = r5.substring(r10)
            r3.put(r9, r10)
        L75:
            int r8 = r8 + 1
            goto L5e
        L78:
            r0 = r3
        L79:
            r11.b = r0
        L7b:
            java.util.Map<java.lang.String, java.lang.String> r0 = r11.b
            java.lang.Object r12 = r0.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            if (r12 != 0) goto L86
            return r2
        L86:
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch: java.lang.Throwable -> L9f
            java.lang.Class<clfe> r0 = defpackage.clfe.class
            java.lang.Class r12 = r12.asSubclass(r0)     // Catch: java.lang.Throwable -> L9f
            java.lang.Class[] r0 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L9f
            java.lang.reflect.Constructor r12 = r12.getDeclaredConstructor(r0)     // Catch: java.lang.Throwable -> L9f
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r12 = r12.newInstance(r0)     // Catch: java.lang.Throwable -> L9f
            clfe r12 = (defpackage.clfe) r12     // Catch: java.lang.Throwable -> L9f
            return r12
        L9f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clfl.a(java.lang.String):clfe");
    }
}
