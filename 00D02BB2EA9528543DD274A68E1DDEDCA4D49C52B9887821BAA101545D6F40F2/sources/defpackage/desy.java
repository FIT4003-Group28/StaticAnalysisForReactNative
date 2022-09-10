package defpackage;

import android.text.TextUtils;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: desy  reason: default package */
/* loaded from: classes6.dex */
public final class desy implements desz {
    public static final Object f = new Object();
    private static final ThreadFactory l = new desx();
    public final dela a;
    public final dett b;
    public final detm c;
    public final deti d;
    public final detl e;
    private final Object g;
    private final ExecutorService h;
    private final ExecutorService i;
    private String j;
    private final List<deth> k;

    public desy(dela delaVar, desq<devr> desqVar, desq<derf> desqVar2) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadFactory threadFactory = l;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, timeUnit, linkedBlockingQueue, threadFactory);
        dett dettVar = new dett(delaVar.a(), desqVar, desqVar2);
        detm detmVar = new detm(delaVar);
        deti detiVar = deti.getInstance();
        detl detlVar = new detl(delaVar);
        this.g = new Object();
        this.k = new ArrayList();
        this.a = delaVar;
        this.b = dettVar;
        this.c = detmVar;
        this.d = detiVar;
        this.e = detlVar;
        this.h = threadPoolExecutor;
        this.i = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
    }

    public static desy getInstance() {
        return getInstance(dela.getInstance());
    }

    private final void j() {
        cnwc.m(b(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        cnwc.m(a(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        cnwc.m(c(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        cnwc.e(deti.d(b()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        cnwc.e(deti.b.matcher(c()).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private final void k(deth dethVar) {
        synchronized (this.g) {
            this.k.add(dethVar);
        }
    }

    private final synchronized String l() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a() {
        return this.a.c().d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String b() {
        return this.a.c().b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String c() {
        return this.a.c().a;
    }

    @Override // defpackage.desz
    public final cpcq<String> d() {
        j();
        String l2 = l();
        if (l2 == null) {
            cpct cpctVar = new cpct();
            k(new detd(cpctVar));
            cpcq cpcqVar = cpctVar.a;
            this.h.execute(new Runnable(this) { // from class: desu
                private final desy a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.h();
                }
            });
            return cpcqVar;
        }
        return cpda.a(l2);
    }

    public final void e(deto detoVar) {
        synchronized (this.g) {
            Iterator<deth> it = this.k.iterator();
            while (it.hasNext()) {
                if (it.next().a(detoVar)) {
                    it.remove();
                }
            }
        }
    }

    public final void f(deto detoVar, Exception exc) {
        synchronized (this.g) {
            Iterator<deth> it = this.k.iterator();
            while (it.hasNext()) {
                if (it.next().b(detoVar, exc)) {
                    it.remove();
                }
            }
        }
    }

    public final synchronized void g(String str) {
        this.j = str;
    }

    public final void h() {
        deto a;
        String str;
        String string;
        synchronized (f) {
            dest b = dest.b(this.a.a());
            a = this.c.a();
            if (a.l()) {
                if ((!this.a.b().equals("CHIME_ANDROID_SDK") && !this.a.f()) || a.h() != 1) {
                    string = detg.a();
                } else {
                    detl detlVar = this.e;
                    synchronized (detlVar.b) {
                        synchronized (detlVar.b) {
                            str = null;
                            string = detlVar.b.getString("|S|id", null);
                        }
                        if (string == null) {
                            synchronized (detlVar.b) {
                                String string2 = detlVar.b.getString("|S||P|", null);
                                if (string2 != null) {
                                    PublicKey b2 = detl.b(string2);
                                    if (b2 != null) {
                                        str = detl.a(b2);
                                    }
                                }
                            }
                            string = str;
                        }
                    }
                    if (TextUtils.isEmpty(string)) {
                        string = detg.a();
                    }
                }
                detm detmVar = this.c;
                detn g = a.g();
                g.d(string);
                g.g(3);
                a = g.a();
                detmVar.b(a);
            }
            if (b != null) {
                b.a();
            }
        }
        e(a);
        this.i.execute(new Runnable(this) { // from class: desw
            private final desy a;

            {
                this.a = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:103:0x017d A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:57:0x0131  */
            /* JADX WARN: Removed duplicated region for block: B:90:0x01cd A[Catch: deta -> 0x01ce, TRY_ENTER, TRY_LEAVE, TryCatch #7 {deta -> 0x01ce, blocks: (B:9:0x001b, B:11:0x0023, B:14:0x002a, B:16:0x0032, B:22:0x0057, B:23:0x0067, B:24:0x006e, B:25:0x006f, B:26:0x0075, B:27:0x0096, B:29:0x0098, B:31:0x009f, B:33:0x00ab, B:34:0x00af, B:55:0x0113, B:59:0x0135, B:60:0x013a, B:61:0x0141, B:62:0x0142, B:90:0x01cd, B:35:0x00b0, B:37:0x00b5, B:39:0x00ec, B:41:0x00f2, B:43:0x00fa, B:46:0x0107, B:48:0x010a, B:49:0x010d), top: B:107:0x001b }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 479
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.desw.run():void");
            }
        });
    }

    @Override // defpackage.desz
    public final cpcq<detf> i() {
        j();
        cpct cpctVar = new cpct();
        k(new detc(this.d, cpctVar));
        cpcq cpcqVar = cpctVar.a;
        this.h.execute(new Runnable(this) { // from class: desv
            private final desy a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.h();
            }
        });
        return cpcqVar;
    }

    public static desy getInstance(dela delaVar) {
        cnwc.e(delaVar != null, "Null is not a valid value of FirebaseApp.");
        return (desy) delaVar.d(desz.class);
    }
}
