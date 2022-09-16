package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import com.google.firebase.installations.i;
import com.google.firebase.installations.r.d;
import com.google.firebase.installations.r.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class g implements h {
    private static final Object l = new Object();
    private static final ThreadFactory m = new a();

    /* renamed from: a  reason: collision with root package name */
    private final c.e.b.d f9347a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.firebase.installations.r.c f9348b;

    /* renamed from: c  reason: collision with root package name */
    private final com.google.firebase.installations.q.c f9349c;

    /* renamed from: d  reason: collision with root package name */
    private final p f9350d;

    /* renamed from: e  reason: collision with root package name */
    private final com.google.firebase.installations.q.b f9351e;

    /* renamed from: f  reason: collision with root package name */
    private final n f9352f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f9353g;

    /* renamed from: h  reason: collision with root package name */
    private final ExecutorService f9354h;
    private final ExecutorService i;
    private String j;
    private final List<o> k;

    /* loaded from: classes.dex */
    class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f9355a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f9355a.getAndIncrement())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f9356a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f9357b = new int[e.b.values().length];

        static {
            try {
                f9357b[e.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9357b[e.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9357b[e.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f9356a = new int[d.b.values().length];
            try {
                f9356a[d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9356a[d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(c.e.b.d dVar, c.e.b.p.h hVar, c.e.b.m.c cVar) {
        this(new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), m), dVar, new com.google.firebase.installations.r.c(dVar.b(), hVar, cVar), new com.google.firebase.installations.q.c(dVar), new p(), new com.google.firebase.installations.q.b(dVar), new n());
    }

    g(ExecutorService executorService, c.e.b.d dVar, com.google.firebase.installations.r.c cVar, com.google.firebase.installations.q.c cVar2, p pVar, com.google.firebase.installations.q.b bVar, n nVar) {
        this.f9353g = new Object();
        this.k = new ArrayList();
        this.f9347a = dVar;
        this.f9348b = cVar;
        this.f9349c = cVar2;
        this.f9350d = pVar;
        this.f9351e = bVar;
        this.f9352f = nVar;
        this.f9354h = executorService;
        this.i = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), m);
    }

    private com.google.firebase.installations.q.d a(com.google.firebase.installations.q.d dVar) {
        com.google.firebase.installations.r.e b2 = this.f9348b.b(c(), dVar.c(), e(), dVar.e());
        int i = b.f9357b[b2.a().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return dVar.a("BAD CONFIG");
            }
            if (i != 3) {
                throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
            }
            a((String) null);
            return dVar.o();
        }
        return dVar.a(b2.b(), b2.c(), this.f9350d.a());
    }

    private void a(o oVar) {
        synchronized (this.f9353g) {
            this.k.add(oVar);
        }
    }

    private void a(com.google.firebase.installations.q.d dVar, Exception exc) {
        synchronized (this.f9353g) {
            Iterator<o> it = this.k.iterator();
            while (it.hasNext()) {
                if (it.next().a(dVar, exc)) {
                    it.remove();
                }
            }
        }
    }

    private synchronized void a(String str) {
        this.j = str;
    }

    private void b(com.google.firebase.installations.q.d dVar) {
        synchronized (l) {
            com.google.firebase.installations.b a2 = com.google.firebase.installations.b.a(this.f9347a.b(), "generatefid.lock");
            this.f9349c.a(dVar);
            if (a2 != null) {
                a2.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(boolean r3) {
        /*
            r2 = this;
            com.google.firebase.installations.q.d r0 = r2.j()
            boolean r1 = r0.h()     // Catch: com.google.firebase.installations.i -> L59
            if (r1 != 0) goto L22
            boolean r1 = r0.k()     // Catch: com.google.firebase.installations.i -> L59
            if (r1 == 0) goto L11
            goto L22
        L11:
            if (r3 != 0) goto L1d
            com.google.firebase.installations.p r3 = r2.f9350d     // Catch: com.google.firebase.installations.i -> L59
            boolean r3 = r3.a(r0)     // Catch: com.google.firebase.installations.i -> L59
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            return
        L1d:
            com.google.firebase.installations.q.d r3 = r2.a(r0)     // Catch: com.google.firebase.installations.i -> L59
            goto L26
        L22:
            com.google.firebase.installations.q.d r3 = r2.d(r0)     // Catch: com.google.firebase.installations.i -> L59
        L26:
            r2.b(r3)
            boolean r0 = r3.j()
            if (r0 == 0) goto L36
            java.lang.String r0 = r3.c()
            r2.a(r0)
        L36:
            boolean r0 = r3.h()
            if (r0 == 0) goto L47
            com.google.firebase.installations.i r0 = new com.google.firebase.installations.i
            com.google.firebase.installations.i$a r1 = com.google.firebase.installations.i.a.BAD_CONFIG
            r0.<init>(r1)
        L43:
            r2.a(r3, r0)
            goto L58
        L47:
            boolean r0 = r3.i()
            if (r0 == 0) goto L55
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r0.<init>(r1)
            goto L43
        L55:
            r2.e(r3)
        L58:
            return
        L59:
            r3 = move-exception
            r2.a(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.g.b(boolean):void");
    }

    private String c(com.google.firebase.installations.q.d dVar) {
        if ((this.f9347a.c().equals("CHIME_ANDROID_SDK") || this.f9347a.g()) && dVar.l()) {
            String a2 = this.f9351e.a();
            return TextUtils.isEmpty(a2) ? this.f9352f.a() : a2;
        }
        return this.f9352f.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(boolean z) {
        com.google.firebase.installations.q.d k = k();
        if (z) {
            k = k.n();
        }
        e(k);
        this.i.execute(f.a(this, z));
    }

    private com.google.firebase.installations.q.d d(com.google.firebase.installations.q.d dVar) {
        com.google.firebase.installations.r.d a2 = this.f9348b.a(c(), dVar.c(), e(), d(), (dVar.c() == null || dVar.c().length() != 11) ? null : this.f9351e.b());
        int i = b.f9356a[a2.d().ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
            }
            return dVar.a("BAD CONFIG");
        }
        return dVar.a(a2.b(), a2.c(), this.f9350d.a(), a2.a().b(), a2.a().c());
    }

    private void e(com.google.firebase.installations.q.d dVar) {
        synchronized (this.f9353g) {
            Iterator<o> it = this.k.iterator();
            while (it.hasNext()) {
                if (it.next().a(dVar)) {
                    it.remove();
                }
            }
        }
    }

    private c.e.a.b.g.h<m> f() {
        c.e.a.b.g.i iVar = new c.e.a.b.g.i();
        a(new k(this.f9350d, iVar));
        return iVar.a();
    }

    private c.e.a.b.g.h<String> g() {
        c.e.a.b.g.i iVar = new c.e.a.b.g.i();
        a(new l(iVar));
        return iVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Void h() {
        a((String) null);
        com.google.firebase.installations.q.d j = j();
        if (j.j()) {
            this.f9348b.a(c(), j.c(), e(), j.e());
        }
        b(j.o());
        return null;
    }

    private synchronized String i() {
        return this.j;
    }

    private com.google.firebase.installations.q.d j() {
        com.google.firebase.installations.q.d a2;
        synchronized (l) {
            com.google.firebase.installations.b a3 = com.google.firebase.installations.b.a(this.f9347a.b(), "generatefid.lock");
            a2 = this.f9349c.a();
            if (a3 != null) {
                a3.a();
            }
        }
        return a2;
    }

    private com.google.firebase.installations.q.d k() {
        com.google.firebase.installations.q.d a2;
        synchronized (l) {
            com.google.firebase.installations.b a3 = com.google.firebase.installations.b.a(this.f9347a.b(), "generatefid.lock");
            a2 = this.f9349c.a();
            if (a2.i()) {
                String c2 = c(a2);
                com.google.firebase.installations.q.c cVar = this.f9349c;
                a2 = a2.b(c2);
                cVar.a(a2);
            }
            if (a3 != null) {
                a3.a();
            }
        }
        return a2;
    }

    private void l() {
        s.a(d(), (Object) "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        s.a(e(), (Object) "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        s.a(c(), (Object) "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        s.a(p.b(d()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        s.a(p.a(c()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @Override // com.google.firebase.installations.h
    public c.e.a.b.g.h<String> a() {
        l();
        String i = i();
        if (i != null) {
            return c.e.a.b.g.k.a(i);
        }
        c.e.a.b.g.h<String> g2 = g();
        this.f9354h.execute(c.a(this));
        return g2;
    }

    @Override // com.google.firebase.installations.h
    public c.e.a.b.g.h<m> a(boolean z) {
        l();
        c.e.a.b.g.h<m> f2 = f();
        this.f9354h.execute(d.a(this, z));
        return f2;
    }

    @Override // com.google.firebase.installations.h
    public c.e.a.b.g.h<Void> b() {
        return c.e.a.b.g.k.a(this.f9354h, e.a(this));
    }

    String c() {
        return this.f9347a.d().a();
    }

    String d() {
        return this.f9347a.d().b();
    }

    String e() {
        return this.f9347a.d().f();
    }
}
