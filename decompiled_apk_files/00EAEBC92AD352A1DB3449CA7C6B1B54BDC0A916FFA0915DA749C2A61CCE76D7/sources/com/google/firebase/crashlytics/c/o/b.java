package com.google.firebase.crashlytics.c.o;

import com.google.firebase.crashlytics.c.h.u;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class b {

    /* renamed from: h  reason: collision with root package name */
    private static final short[] f9071h = {10, 20, 30, 60, 120, 300};

    /* renamed from: a  reason: collision with root package name */
    private final com.google.firebase.crashlytics.c.o.d.b f9072a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9073b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9074c;

    /* renamed from: d  reason: collision with root package name */
    private final u f9075d;

    /* renamed from: e  reason: collision with root package name */
    private final com.google.firebase.crashlytics.c.o.a f9076e;

    /* renamed from: f  reason: collision with root package name */
    private final a f9077f;

    /* renamed from: g  reason: collision with root package name */
    private Thread f9078g;

    /* loaded from: classes.dex */
    public interface a {
        boolean a();
    }

    /* renamed from: com.google.firebase.crashlytics.c.o.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0184b {
        b a(com.google.firebase.crashlytics.c.q.i.b bVar);
    }

    /* loaded from: classes.dex */
    public interface c {
        File[] a();

        File[] b();
    }

    /* loaded from: classes.dex */
    private class d extends com.google.firebase.crashlytics.c.h.d {

        /* renamed from: b  reason: collision with root package name */
        private final List<com.google.firebase.crashlytics.c.o.c.c> f9079b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f9080c;

        /* renamed from: d  reason: collision with root package name */
        private final float f9081d;

        d(List<com.google.firebase.crashlytics.c.o.c.c> list, boolean z, float f2) {
            this.f9079b = list;
            this.f9080c = z;
            this.f9081d = f2;
        }

        private void a(List<com.google.firebase.crashlytics.c.o.c.c> list, boolean z) {
            float f2;
            com.google.firebase.crashlytics.c.b.a().a("Starting report processing in " + this.f9081d + " second(s)...");
            if (this.f9081d > 0.0f) {
                try {
                    Thread.sleep(f2 * 1000.0f);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            if (b.this.f9077f.a()) {
                return;
            }
            int i = 0;
            while (list.size() > 0 && !b.this.f9077f.a()) {
                com.google.firebase.crashlytics.c.b.a().a("Attempting to send " + list.size() + " report(s)");
                ArrayList arrayList = new ArrayList();
                for (com.google.firebase.crashlytics.c.o.c.c cVar : list) {
                    if (!b.this.a(cVar, z)) {
                        arrayList.add(cVar);
                    }
                }
                if (arrayList.size() > 0) {
                    int i2 = i + 1;
                    long j = b.f9071h[Math.min(i, b.f9071h.length - 1)];
                    com.google.firebase.crashlytics.c.b.a().a("Report submission: scheduling delayed retry in " + j + " seconds");
                    Thread.sleep(j * 1000);
                    i = i2;
                }
                list = arrayList;
            }
        }

        @Override // com.google.firebase.crashlytics.c.h.d
        public void a() {
            try {
                a(this.f9079b, this.f9080c);
            } catch (Exception e2) {
                com.google.firebase.crashlytics.c.b.a().b("An unexpected error occurred while attempting to upload crash reports.", e2);
            }
            b.this.f9078g = null;
        }
    }

    public b(String str, String str2, u uVar, com.google.firebase.crashlytics.c.o.a aVar, com.google.firebase.crashlytics.c.o.d.b bVar, a aVar2) {
        if (bVar != null) {
            this.f9072a = bVar;
            this.f9073b = str;
            this.f9074c = str2;
            this.f9075d = uVar;
            this.f9076e = aVar;
            this.f9077f = aVar2;
            return;
        }
        throw new IllegalArgumentException("createReportCall must not be null.");
    }

    public synchronized void a(List<com.google.firebase.crashlytics.c.o.c.c> list, boolean z, float f2) {
        if (this.f9078g != null) {
            com.google.firebase.crashlytics.c.b.a().a("Report upload has already been started.");
            return;
        }
        this.f9078g = new Thread(new d(list, z, f2), "Crashlytics Report Uploader");
        this.f9078g.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060 A[Catch: Exception -> 0x0067, TRY_LEAVE, TryCatch #0 {Exception -> 0x0067, blocks: (B:3:0x0001, B:5:0x0011, B:6:0x0017, B:19:0x0060, B:7:0x001b, B:9:0x0021, B:11:0x0029, B:13:0x0032, B:17:0x004d), top: B:24:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(com.google.firebase.crashlytics.c.o.c.c r6, boolean r7) {
        /*
            r5 = this;
            r0 = 0
            com.google.firebase.crashlytics.c.o.c.a r1 = new com.google.firebase.crashlytics.c.o.c.a     // Catch: java.lang.Exception -> L67
            java.lang.String r2 = r5.f9073b     // Catch: java.lang.Exception -> L67
            java.lang.String r3 = r5.f9074c     // Catch: java.lang.Exception -> L67
            r1.<init>(r2, r3, r6)     // Catch: java.lang.Exception -> L67
            com.google.firebase.crashlytics.c.h.u r2 = r5.f9075d     // Catch: java.lang.Exception -> L67
            com.google.firebase.crashlytics.c.h.u r3 = com.google.firebase.crashlytics.c.h.u.ALL     // Catch: java.lang.Exception -> L67
            r4 = 1
            if (r2 != r3) goto L1b
            com.google.firebase.crashlytics.c.b r7 = com.google.firebase.crashlytics.c.b.a()     // Catch: java.lang.Exception -> L67
            java.lang.String r1 = "Send to Reports Endpoint disabled. Removing Reports Endpoint report."
        L17:
            r7.a(r1)     // Catch: java.lang.Exception -> L67
            goto L30
        L1b:
            com.google.firebase.crashlytics.c.h.u r2 = r5.f9075d     // Catch: java.lang.Exception -> L67
            com.google.firebase.crashlytics.c.h.u r3 = com.google.firebase.crashlytics.c.h.u.JAVA_ONLY     // Catch: java.lang.Exception -> L67
            if (r2 != r3) goto L32
            com.google.firebase.crashlytics.c.o.c.c$a r2 = r6.getType()     // Catch: java.lang.Exception -> L67
            com.google.firebase.crashlytics.c.o.c.c$a r3 = com.google.firebase.crashlytics.c.o.c.c.a.JAVA     // Catch: java.lang.Exception -> L67
            if (r2 != r3) goto L32
            com.google.firebase.crashlytics.c.b r7 = com.google.firebase.crashlytics.c.b.a()     // Catch: java.lang.Exception -> L67
            java.lang.String r1 = "Send to Reports Endpoint for non-native reports disabled. Removing Reports Uploader report."
            goto L17
        L30:
            r7 = 1
            goto L5e
        L32:
            com.google.firebase.crashlytics.c.o.d.b r2 = r5.f9072a     // Catch: java.lang.Exception -> L67
            boolean r7 = r2.a(r1, r7)     // Catch: java.lang.Exception -> L67
            com.google.firebase.crashlytics.c.b r1 = com.google.firebase.crashlytics.c.b.a()     // Catch: java.lang.Exception -> L67
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L67
            r2.<init>()     // Catch: java.lang.Exception -> L67
            java.lang.String r3 = "Crashlytics Reports Endpoint upload "
            r2.append(r3)     // Catch: java.lang.Exception -> L67
            if (r7 == 0) goto L4b
            java.lang.String r3 = "complete: "
            goto L4d
        L4b:
            java.lang.String r3 = "FAILED: "
        L4d:
            r2.append(r3)     // Catch: java.lang.Exception -> L67
            java.lang.String r3 = r6.a()     // Catch: java.lang.Exception -> L67
            r2.append(r3)     // Catch: java.lang.Exception -> L67
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L67
            r1.c(r2)     // Catch: java.lang.Exception -> L67
        L5e:
            if (r7 == 0) goto L80
            com.google.firebase.crashlytics.c.o.a r7 = r5.f9076e     // Catch: java.lang.Exception -> L67
            r7.a(r6)     // Catch: java.lang.Exception -> L67
            r0 = 1
            goto L80
        L67:
            r7 = move-exception
            com.google.firebase.crashlytics.c.b r1 = com.google.firebase.crashlytics.c.b.a()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error occurred sending report "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r1.b(r6, r7)
        L80:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.c.o.b.a(com.google.firebase.crashlytics.c.o.c.c, boolean):boolean");
    }
}
