package defpackage;

import android.text.TextUtils;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aoak  reason: default package */
/* loaded from: classes.dex */
public final class aoak implements aoal {
    public static final Object a = new Object();
    private static final ThreadFactory g = new aoaj();
    public final anwg b;
    public final aoaz c;
    public final aoaw d;
    public final aoat e;
    public final aoav f;
    private final Object h;
    private final ExecutorService i;
    private final ExecutorService j;
    private String k;
    private final Set l;
    private final List m;

    public aoak(anwg anwgVar, aoaf aoafVar, aoaf aoafVar2) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadFactory threadFactory = g;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, timeUnit, linkedBlockingQueue, threadFactory);
        aoaz aoazVar = new aoaz(anwgVar.a(), aoafVar, aoafVar2);
        aoaw aoawVar = new aoaw(anwgVar);
        aoat b = aoat.b();
        aoav aoavVar = new aoav(anwgVar);
        int i = aoar.a;
        this.h = new Object();
        this.l = new HashSet();
        this.m = new ArrayList();
        this.b = anwgVar;
        this.c = aoazVar;
        this.d = aoawVar;
        this.e = b;
        this.f = aoavVar;
        this.i = threadPoolExecutor;
        this.j = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
    }

    public static aoak b() {
        return c(anwg.b());
    }

    public static aoak c(anwg anwgVar) {
        qnm.d(true, "Null is not a valid value of FirebaseApp.");
        return (aoak) anwgVar.f(aoal.class);
    }

    private final synchronized String m() {
        return this.k;
    }

    private final void n(aoas aoasVar) {
        synchronized (this.h) {
            this.m.add(aoasVar);
        }
    }

    private final void o() {
        qnm.m(e(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        qnm.m(f(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        qnm.m(d(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        qnm.d(aoat.d(e()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        qnm.d(aoat.b.matcher(d()).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @Override // defpackage.aoal
    public final rve a() {
        o();
        String m = m();
        if (m == null) {
            rvh rvhVar = new rvh();
            n(new aoao(rvhVar));
            rvj rvjVar = rvhVar.a;
            this.i.execute(new aoai(this, 1));
            return rvjVar;
        }
        return rwd.c(m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String d() {
        return this.b.e().a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String e() {
        return this.b.e().b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String f() {
        return this.b.e().d;
    }

    public final void g(Exception exc) {
        synchronized (this.h) {
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                if (((aoas) it.next()).a(exc)) {
                    it.remove();
                }
            }
        }
    }

    public final void h(aoay aoayVar) {
        synchronized (this.h) {
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                if (((aoas) it.next()).b(aoayVar)) {
                    it.remove();
                }
            }
        }
    }

    public final synchronized void i(String str) {
        this.k = str;
    }

    public final synchronized void j(aoay aoayVar, aoay aoayVar2) {
        if (this.l.size() != 0 && !aoayVar.a.equals(aoayVar2.a)) {
            for (aoau aoauVar : this.l) {
                aoauVar.a();
            }
        }
    }

    public final void k() {
        aoay a2;
        String str;
        String string;
        synchronized (a) {
            aoag b = aoag.b(this.b.a());
            a2 = this.d.a();
            if (a2.c()) {
                if ((!this.b.g().equals("CHIME_ANDROID_SDK") && !this.b.k()) || a2.g != 1) {
                    string = aoar.a();
                } else {
                    aoav aoavVar = this.f;
                    synchronized (aoavVar.b) {
                        synchronized (aoavVar.b) {
                            str = null;
                            string = aoavVar.b.getString("|S|id", null);
                        }
                        if (string == null) {
                            synchronized (aoavVar.b) {
                                String string2 = aoavVar.b.getString("|S||P|", null);
                                if (string2 != null) {
                                    PublicKey b2 = aoav.b(string2);
                                    if (b2 != null) {
                                        str = aoav.a(b2);
                                    }
                                }
                            }
                            string = str;
                        }
                    }
                    if (TextUtils.isEmpty(string)) {
                        string = aoar.a();
                    }
                }
                aoaw aoawVar = this.d;
                aoax f = a2.f();
                f.a = string;
                f.c(3);
                a2 = f.a();
                aoawVar.b(a2);
            }
            if (b != null) {
                b.a();
            }
        }
        h(a2);
        this.j.execute(new Runnable() { // from class: aoah
            /* JADX WARN: Removed duplicated region for block: B:106:0x0157 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:57:0x011c  */
            /* JADX WARN: Removed duplicated region for block: B:90:0x01a8 A[Catch: aoam -> 0x01a9, TRY_ENTER, TRY_LEAVE, TryCatch #3 {aoam -> 0x01a9, blocks: (B:9:0x001b, B:11:0x0023, B:14:0x002a, B:16:0x0032, B:22:0x0051, B:23:0x0061, B:24:0x0068, B:25:0x0069, B:26:0x006f, B:27:0x008b, B:29:0x008d, B:31:0x0092, B:33:0x009a, B:34:0x009e, B:55:0x0102, B:59:0x0120, B:60:0x0125, B:61:0x012c, B:62:0x012d, B:90:0x01a8, B:35:0x009f, B:37:0x00a4, B:39:0x00db, B:41:0x00e1, B:43:0x00e9, B:46:0x00f6, B:48:0x00f9, B:49:0x00fc), top: B:103:0x001b }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 442
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.aoah.run():void");
            }
        });
    }

    @Override // defpackage.aoal
    public final rve l() {
        o();
        rvh rvhVar = new rvh();
        n(new aoan(this.e, rvhVar));
        rvj rvjVar = rvhVar.a;
        this.i.execute(new aoai(this));
        return rvjVar;
    }
}
