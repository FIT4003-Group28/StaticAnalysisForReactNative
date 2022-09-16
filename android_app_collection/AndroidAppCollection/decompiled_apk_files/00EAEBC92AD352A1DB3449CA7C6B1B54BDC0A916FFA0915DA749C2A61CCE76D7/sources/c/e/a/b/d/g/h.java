package c.e.a.b.d.g;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public class h {
    private static volatile h i = null;
    private static Boolean j = null;
    private static String k = "allow_remote_dynamite";

    /* renamed from: a  reason: collision with root package name */
    private final String f4173a;

    /* renamed from: b  reason: collision with root package name */
    protected final com.google.android.gms.common.util.e f4174b;

    /* renamed from: c  reason: collision with root package name */
    private final ExecutorService f4175c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.android.gms.measurement.a.a f4176d;

    /* renamed from: e  reason: collision with root package name */
    private List<Pair<com.google.android.gms.measurement.internal.h6, c>> f4177e;

    /* renamed from: f  reason: collision with root package name */
    private int f4178f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f4179g;

    /* renamed from: h  reason: collision with root package name */
    private md f4180h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public abstract class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final long f4181b;

        /* renamed from: c  reason: collision with root package name */
        final long f4182c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f4183d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(h hVar) {
            this(true);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(boolean z) {
            this.f4181b = h.this.f4174b.a();
            this.f4182c = h.this.f4174b.b();
            this.f4183d = z;
        }

        abstract void a();

        protected void b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (h.this.f4179g) {
                b();
                return;
            }
            try {
                a();
            } catch (Exception e2) {
                h.this.a(e2, false, this.f4183d);
                b();
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            h.this.a(new k0(this, activity, bundle));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            h.this.a(new p0(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            h.this.a(new l0(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            h.this.a(new m0(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            kd kdVar = new kd();
            h.this.a(new n0(this, activity, kdVar));
            Bundle b2 = kdVar.b(50L);
            if (b2 != null) {
                bundle.putAll(b2);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            h.this.a(new j0(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            h.this.a(new o0(this, activity));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c extends c.e.a.b.d.g.b {

        /* renamed from: a  reason: collision with root package name */
        private final com.google.android.gms.measurement.internal.h6 f4186a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(com.google.android.gms.measurement.internal.h6 h6Var) {
            this.f4186a = h6Var;
        }

        @Override // c.e.a.b.d.g.c
        public final void a(String str, String str2, Bundle bundle, long j) {
            this.f4186a.a(str, str2, bundle, j);
        }

        @Override // c.e.a.b.d.g.c
        public final int f() {
            return System.identityHashCode(this.f4186a);
        }
    }

    private h(Context context, String str, String str2, String str3, Bundle bundle) {
        this.f4173a = (str == null || !c(str2, str3)) ? "FA" : str;
        this.f4174b = com.google.android.gms.common.util.h.d();
        this.f4175c = m7.a().a(new t(this), jd.f4244a);
        this.f4176d = new com.google.android.gms.measurement.a.a(this);
        boolean z = false;
        if (!(!e(context) || i())) {
            this.f4179g = true;
            Log.w(this.f4173a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (!c(str2, str3)) {
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null ? true : z)) {
                    Log.w(this.f4173a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.f4173a, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
            }
        }
        a(new k(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f4173a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new b());
        }
    }

    public static h a(Context context) {
        return a(context, (String) null, (String) null, (String) null, (Bundle) null);
    }

    public static h a(Context context, String str, String str2, String str3, Bundle bundle) {
        com.google.android.gms.common.internal.s.a(context);
        if (i == null) {
            synchronized (h.class) {
                if (i == null) {
                    i = new h(context, str, str2, str3, bundle);
                }
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(a aVar) {
        this.f4175c.execute(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Exception exc, boolean z, boolean z2) {
        this.f4179g |= z;
        if (z) {
            Log.w(this.f4173a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            a(5, "Error with data collection. Data lost.", exc, (Object) null, (Object) null);
        }
        Log.w(this.f4173a, "Error with data collection. Data lost.", exc);
    }

    private final void a(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        a(new i0(this, l, str, str2, bundle, z, z2));
    }

    private final void a(String str, String str2, Object obj, boolean z) {
        a(new h0(this, str, str2, obj, z));
    }

    private static boolean a(Context context, String str) {
        com.google.android.gms.common.internal.s.b(str);
        try {
            ApplicationInfo a2 = com.google.android.gms.common.n.c.a(context).a(context.getPackageName(), 128);
            if (a2 != null && a2.metaData != null) {
                return a2.metaData.getBoolean(str);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c(String str, String str2) {
        return (str2 == null || str == null || i()) ? false : true;
    }

    private static boolean e(Context context) {
        return new com.google.android.gms.common.internal.w(context).a("google_app_id") != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int f(Context context) {
        return DynamiteModule.b(context, ModuleDescriptor.MODULE_ID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int g(Context context) {
        return DynamiteModule.a(context, ModuleDescriptor.MODULE_ID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(Context context) {
        synchronized (h.class) {
            try {
            } catch (Exception e2) {
                Log.e("FA", "Exception reading flag from SharedPreferences.", e2);
                j = false;
            }
            if (j != null) {
                return;
            }
            if (a(context, "app_measurement_internal_disable_startup_flags")) {
                j = false;
                return;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
            j = Boolean.valueOf(sharedPreferences.getBoolean(k, false));
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.remove(k);
            edit.apply();
        }
    }

    private static boolean i() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final md a(Context context, boolean z) {
        try {
            return ld.asInterface(DynamiteModule.a(context, z ? DynamiteModule.k : DynamiteModule.i, ModuleDescriptor.MODULE_ID).a("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.a e2) {
            a((Exception) e2, true, false);
            return null;
        }
    }

    public final com.google.android.gms.measurement.a.a a() {
        return this.f4176d;
    }

    public final Map<String, Object> a(String str, String str2, boolean z) {
        kd kdVar = new kd();
        a(new d0(this, str, str2, z, kdVar));
        Bundle b2 = kdVar.b(5000L);
        if (b2 == null || b2.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(b2.size());
        for (String str3 : b2.keySet()) {
            Object obj = b2.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    public final void a(int i2, String str, Object obj, Object obj2, Object obj3) {
        a(new c0(this, false, 5, str, obj, null, null));
    }

    public final void a(long j2) {
        a(new s(this, j2));
    }

    public final void a(Activity activity, String str, String str2) {
        a(new n(this, activity, str, str2));
    }

    public final void a(Bundle bundle) {
        a(new j(this, bundle));
    }

    public final void a(com.google.android.gms.measurement.internal.h6 h6Var) {
        com.google.android.gms.common.internal.s.a(h6Var);
        a(new g0(this, h6Var));
    }

    public final void a(String str) {
        a(new o(this, str));
    }

    public final void a(String str, Bundle bundle) {
        a(null, str, bundle, false, true, null);
    }

    public final void a(String str, String str2) {
        a((String) null, str, (Object) str2, false);
    }

    public final void a(String str, String str2, Bundle bundle) {
        a(str, str2, bundle, true, true, null);
    }

    public final void a(String str, String str2, Object obj) {
        a(str, str2, obj, true);
    }

    public final void a(boolean z) {
        a(new q(this, z));
    }

    public final List<Bundle> b(String str, String str2) {
        kd kdVar = new kd();
        a(new l(this, str, str2, kdVar));
        List<Bundle> list = (List) kd.a(kdVar.b(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final void b() {
        a(new p(this));
    }

    public final void b(long j2) {
        a(new r(this, j2));
    }

    public final void b(String str) {
        a(new u(this, str));
    }

    public final void b(String str, String str2, Bundle bundle) {
        a(new m(this, str, str2, bundle));
    }

    public final void b(boolean z) {
        a(new f0(this, z));
    }

    public final String c() {
        kd kdVar = new kd();
        a(new v(this, kdVar));
        return kdVar.a(500L);
    }

    public final void c(String str) {
        a(new w(this, str));
    }

    public final int d(String str) {
        kd kdVar = new kd();
        a(new e0(this, str, kdVar));
        Integer num = (Integer) kd.a(kdVar.b(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final String d() {
        kd kdVar = new kd();
        a(new y(this, kdVar));
        return kdVar.a(50L);
    }

    public final long e() {
        kd kdVar = new kd();
        a(new x(this, kdVar));
        Long l = (Long) kd.a(kdVar.b(500L), Long.class);
        if (l == null) {
            long nextLong = new Random(System.nanoTime() ^ this.f4174b.a()).nextLong();
            int i2 = this.f4178f + 1;
            this.f4178f = i2;
            return nextLong + i2;
        }
        return l.longValue();
    }

    public final String f() {
        kd kdVar = new kd();
        a(new a0(this, kdVar));
        return kdVar.a(500L);
    }

    public final String g() {
        kd kdVar = new kd();
        a(new z(this, kdVar));
        return kdVar.a(500L);
    }
}
