package com.google.android.gms.measurement.internal;

import java.net.URL;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m7 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final URL f7496b;

    /* renamed from: c  reason: collision with root package name */
    private final j7 f7497c;

    /* renamed from: d  reason: collision with root package name */
    private final String f7498d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, String> f7499e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ k7 f7500f;

    public m7(k7 k7Var, String str, URL url, byte[] bArr, Map<String, String> map, j7 j7Var) {
        this.f7500f = k7Var;
        com.google.android.gms.common.internal.s.b(str);
        com.google.android.gms.common.internal.s.a(url);
        com.google.android.gms.common.internal.s.a(j7Var);
        this.f7496b = url;
        this.f7497c = j7Var;
        this.f7498d = str;
        this.f7499e = null;
    }

    private final void b(final int i, final Exception exc, final byte[] bArr, final Map<String, List<String>> map) {
        this.f7500f.a().a(new Runnable(this, i, exc, bArr, map) { // from class: com.google.android.gms.measurement.internal.l7

            /* renamed from: b  reason: collision with root package name */
            private final m7 f7458b;

            /* renamed from: c  reason: collision with root package name */
            private final int f7459c;

            /* renamed from: d  reason: collision with root package name */
            private final Exception f7460d;

            /* renamed from: e  reason: collision with root package name */
            private final byte[] f7461e;

            /* renamed from: f  reason: collision with root package name */
            private final Map f7462f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f7458b = this;
                this.f7459c = i;
                this.f7460d = exc;
                this.f7461e = bArr;
                this.f7462f = map;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f7458b.a(this.f7459c, this.f7460d, this.f7461e, this.f7462f);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i, Exception exc, byte[] bArr, Map map) {
        this.f7497c.a(this.f7498d, i, exc, bArr, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r7 = this;
            com.google.android.gms.measurement.internal.k7 r0 = r7.f7500f
            r0.f()
            r0 = 0
            r1 = 0
            com.google.android.gms.measurement.internal.k7 r2 = r7.f7500f     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L77
            java.net.URL r3 = r7.f7496b     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L77
            java.net.HttpURLConnection r2 = r2.a(r3)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L77
            java.util.Map<java.lang.String, java.lang.String> r3 = r7.f7499e     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            if (r3 == 0) goto L39
            java.util.Map<java.lang.String, java.lang.String> r3 = r7.f7499e     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            java.util.Set r3 = r3.entrySet()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
        L1d:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            if (r4 == 0) goto L39
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            java.lang.Object r5 = r4.getKey()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            r2.addRequestProperty(r5, r4)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            goto L1d
        L39:
            int r1 = r2.getResponseCode()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            java.util.Map r3 = r2.getHeaderFields()     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L60
            com.google.android.gms.measurement.internal.k7 r4 = r7.f7500f     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L56
            byte[] r4 = com.google.android.gms.measurement.internal.k7.a(r4, r2)     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L56
            if (r2 == 0) goto L4c
            r2.disconnect()
        L4c:
            r7.b(r1, r0, r4, r3)
            return
        L50:
            r4 = move-exception
            r6 = r4
            r4 = r1
            r1 = r3
            r3 = r6
            goto L6e
        L56:
            r4 = move-exception
            r6 = r4
            r4 = r1
            r1 = r3
            r3 = r6
            goto L7b
        L5c:
            r3 = move-exception
            r4 = r1
            r1 = r0
            goto L6e
        L60:
            r3 = move-exception
            r4 = r1
            r1 = r0
            goto L7b
        L64:
            r3 = move-exception
            r1 = r0
            goto L6d
        L67:
            r3 = move-exception
            r1 = r0
            goto L7a
        L6a:
            r3 = move-exception
            r1 = r0
            r2 = r1
        L6d:
            r4 = 0
        L6e:
            if (r2 == 0) goto L73
            r2.disconnect()
        L73:
            r7.b(r4, r0, r0, r1)
            throw r3
        L77:
            r3 = move-exception
            r1 = r0
            r2 = r1
        L7a:
            r4 = 0
        L7b:
            if (r2 == 0) goto L80
            r2.disconnect()
        L80:
            r7.b(r4, r3, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m7.run():void");
    }
}
