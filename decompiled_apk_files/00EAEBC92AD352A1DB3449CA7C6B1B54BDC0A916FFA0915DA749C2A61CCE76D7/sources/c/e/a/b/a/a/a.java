package c.e.a.b.a.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import c.e.a.b.d.a.e;
import com.google.android.gms.common.f;
import com.google.android.gms.common.g;
import com.google.android.gms.common.i;
import com.google.android.gms.common.internal.s;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private com.google.android.gms.common.a f3829a;

    /* renamed from: b  reason: collision with root package name */
    private c.e.a.b.d.a.d f3830b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f3831c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f3832d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private b f3833e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f3834f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f3835g;

    /* renamed from: h  reason: collision with root package name */
    private final long f3836h;

    /* renamed from: c.e.a.b.a.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0095a {

        /* renamed from: a  reason: collision with root package name */
        private final String f3837a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f3838b;

        public C0095a(String str, boolean z) {
            this.f3837a = str;
            this.f3838b = z;
        }

        public final String a() {
            return this.f3837a;
        }

        public final boolean b() {
            return this.f3838b;
        }

        public final String toString() {
            String str = this.f3837a;
            boolean z = this.f3838b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b extends Thread {

        /* renamed from: b  reason: collision with root package name */
        private WeakReference<a> f3839b;

        /* renamed from: c  reason: collision with root package name */
        private long f3840c;

        /* renamed from: d  reason: collision with root package name */
        CountDownLatch f3841d = new CountDownLatch(1);

        /* renamed from: e  reason: collision with root package name */
        boolean f3842e = false;

        public b(a aVar, long j) {
            this.f3839b = new WeakReference<>(aVar);
            this.f3840c = j;
            start();
        }

        private final void a() {
            a aVar = this.f3839b.get();
            if (aVar != null) {
                aVar.a();
                this.f3842e = true;
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                if (this.f3841d.await(this.f3840c, TimeUnit.MILLISECONDS)) {
                    return;
                }
                a();
            } catch (InterruptedException unused) {
                a();
            }
        }
    }

    private a(Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        s.a(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f3834f = context;
        this.f3831c = false;
        this.f3836h = j;
        this.f3835g = z2;
    }

    public static C0095a a(Context context) {
        c cVar = new c(context);
        boolean a2 = cVar.a("gads:ad_id_app_context:enabled", false);
        float a3 = cVar.a("gads:ad_id_app_context:ping_ratio", 0.0f);
        String a4 = cVar.a("gads:ad_id_use_shared_preference:experiment_id", "");
        a aVar = new a(context, -1L, a2, cVar.a("gads:ad_id_use_persistent_service:enabled", false));
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.b(false);
            C0095a b2 = aVar.b();
            aVar.a(b2, a2, a3, SystemClock.elapsedRealtime() - elapsedRealtime, a4, null);
            return b2;
        } finally {
        }
    }

    private static c.e.a.b.d.a.d a(Context context, com.google.android.gms.common.a aVar) {
        try {
            return e.a(aVar.a(10000L, TimeUnit.MILLISECONDS));
        } catch (InterruptedException unused) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    private static com.google.android.gms.common.a a(Context context, boolean z) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int a2 = f.a().a(context, i.f6959a);
            if (a2 != 0 && a2 != 2) {
                throw new IOException("Google Play services not available");
            }
            String str = z ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
            com.google.android.gms.common.a aVar = new com.google.android.gms.common.a();
            Intent intent = new Intent(str);
            intent.setPackage("com.google.android.gms");
            try {
                if (!com.google.android.gms.common.stats.a.a().a(context, intent, aVar, 1)) {
                    throw new IOException("Connection failure");
                }
                return aVar;
            } catch (Throwable th) {
                throw new IOException(th);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new g(9);
        }
    }

    public static void a(boolean z) {
    }

    private final boolean a(C0095a c0095a, boolean z, float f2, long j, String str, Throwable th) {
        if (Math.random() > f2) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String str2 = "1";
        hashMap.put("app_context", z ? str2 : "0");
        if (c0095a != null) {
            if (!c0095a.b()) {
                str2 = "0";
            }
            hashMap.put("limit_ad_tracking", str2);
        }
        if (c0095a != null && c0095a.a() != null) {
            hashMap.put("ad_id_size", Integer.toString(c0095a.a().length()));
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            hashMap.put("experiment_id", str);
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new c.e.a.b.a.a.b(this, hashMap).start();
        return true;
    }

    private final void b(boolean z) {
        s.c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f3831c) {
                a();
            }
            this.f3829a = a(this.f3834f, this.f3835g);
            this.f3830b = a(this.f3834f, this.f3829a);
            this.f3831c = true;
            if (z) {
                c();
            }
        }
    }

    private final void c() {
        synchronized (this.f3832d) {
            if (this.f3833e != null) {
                this.f3833e.f3841d.countDown();
                try {
                    this.f3833e.join();
                } catch (InterruptedException unused) {
                }
            }
            if (this.f3836h > 0) {
                this.f3833e = new b(this, this.f3836h);
            }
        }
    }

    public final void a() {
        s.c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f3834f == null || this.f3829a == null) {
                return;
            }
            if (this.f3831c) {
                com.google.android.gms.common.stats.a.a().a(this.f3834f, this.f3829a);
            }
            this.f3831c = false;
            this.f3830b = null;
            this.f3829a = null;
        }
    }

    public C0095a b() {
        C0095a c0095a;
        s.c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f3831c) {
                synchronized (this.f3832d) {
                    if (this.f3833e == null || !this.f3833e.f3842e) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    b(false);
                    if (!this.f3831c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            s.a(this.f3829a);
            s.a(this.f3830b);
            try {
                c0095a = new C0095a(this.f3830b.a(), this.f3830b.a(true));
            } catch (RemoteException e3) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e3);
                throw new IOException("Remote exception");
            }
        }
        c();
        return c0095a;
    }

    protected void finalize() {
        a();
        super.finalize();
    }
}
