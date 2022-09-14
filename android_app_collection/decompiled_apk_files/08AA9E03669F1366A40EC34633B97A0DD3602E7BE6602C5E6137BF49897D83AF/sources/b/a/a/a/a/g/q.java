package b.a.a.a.a.g;

import android.content.Context;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: Settings.java */
/* loaded from: classes.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<t> f1232a;

    /* renamed from: b  reason: collision with root package name */
    private final CountDownLatch f1233b;

    /* renamed from: c  reason: collision with root package name */
    private s f1234c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1235d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Settings.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final q f1236a = new q();
    }

    public static q a() {
        return a.f1236a;
    }

    private q() {
        this.f1232a = new AtomicReference<>();
        this.f1233b = new CountDownLatch(1);
        this.f1235d = false;
    }

    public synchronized q a(b.a.a.a.i iVar, b.a.a.a.a.b.p pVar, b.a.a.a.a.e.e eVar, String str, String str2, String str3) {
        if (this.f1235d) {
            return this;
        }
        if (this.f1234c == null) {
            Context context = iVar.getContext();
            String c2 = pVar.c();
            String a2 = new b.a.a.a.a.b.g().a(context);
            String i = pVar.i();
            this.f1234c = new j(iVar, new w(a2, pVar.g(), pVar.f(), pVar.e(), pVar.b(), b.a.a.a.a.b.i.a(b.a.a.a.a.b.i.m(context)), str2, str, b.a.a.a.a.b.l.a(i).a(), b.a.a.a.a.b.i.k(context)), new b.a.a.a.a.b.t(), new k(), new i(iVar), new l(iVar, str3, String.format(Locale.US, "https://settings.crashlytics.com/spi/v2/platforms/android/apps/%s/settings", c2), eVar));
        }
        this.f1235d = true;
        return this;
    }

    public t b() {
        try {
            this.f1233b.await();
            return this.f1232a.get();
        } catch (InterruptedException unused) {
            b.a.a.a.c.h().e("Fabric", "Interrupted while waiting for settings data.");
            return null;
        }
    }

    public synchronized boolean c() {
        t a2;
        a2 = this.f1234c.a();
        a(a2);
        return a2 != null;
    }

    public synchronized boolean d() {
        t a2;
        a2 = this.f1234c.a(r.SKIP_CACHE_LOOKUP);
        a(a2);
        if (a2 == null) {
            b.a.a.a.c.h().e("Fabric", "Failed to force reload of settings from Crashlytics.", null);
        }
        return a2 != null;
    }

    private void a(t tVar) {
        this.f1232a.set(tVar);
        this.f1233b.countDown();
    }
}
