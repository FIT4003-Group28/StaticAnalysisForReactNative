package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
/* loaded from: classes.dex */
final class b {

    /* renamed from: g  reason: collision with root package name */
    private static final Handler f1493g = new Handler(Looper.getMainLooper());

    /* renamed from: a  reason: collision with root package name */
    protected static final Class<?> f1487a = a();

    /* renamed from: b  reason: collision with root package name */
    protected static final Field f1488b = b();

    /* renamed from: c  reason: collision with root package name */
    protected static final Field f1489c = c();

    /* renamed from: d  reason: collision with root package name */
    protected static final Method f1490d = b(f1487a);

    /* renamed from: e  reason: collision with root package name */
    protected static final Method f1491e = a(f1487a);

    /* renamed from: f  reason: collision with root package name */
    protected static final Method f1492f = c(f1487a);

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f1494b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f1495c;

        a(d dVar, Object obj) {
            this.f1494b = dVar;
            this.f1495c = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1494b.f1500b = this.f1495c;
        }
    }

    /* renamed from: androidx.core.app.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class RunnableC0047b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Application f1496b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f1497c;

        RunnableC0047b(Application application, d dVar) {
            this.f1496b = application;
            this.f1497c = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1496b.unregisterActivityLifecycleCallbacks(this.f1497c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f1498b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f1499c;

        c(Object obj, Object obj2) {
            this.f1498b = obj;
            this.f1499c = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (b.f1490d != null) {
                    b.f1490d.invoke(this.f1498b, this.f1499c, false, "AppCompat recreation");
                } else {
                    b.f1491e.invoke(this.f1498b, this.f1499c, false);
                }
            } catch (RuntimeException e2) {
                if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                    throw e2;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: b  reason: collision with root package name */
        Object f1500b;

        /* renamed from: c  reason: collision with root package name */
        private Activity f1501c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f1502d = false;

        /* renamed from: e  reason: collision with root package name */
        private boolean f1503e = false;

        /* renamed from: f  reason: collision with root package name */
        private boolean f1504f = false;

        d(Activity activity) {
            this.f1501c = activity;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f1501c == activity) {
                this.f1501c = null;
                this.f1503e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f1503e || this.f1504f || this.f1502d || !b.a(this.f1500b, activity)) {
                return;
            }
            this.f1504f = true;
            this.f1500b = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f1501c == activity) {
                this.f1502d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method a(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (d() && f1492f == null) {
            return false;
        } else {
            if (f1491e == null && f1490d == null) {
                return false;
            }
            try {
                Object obj2 = f1489c.get(activity);
                if (obj2 == null || (obj = f1488b.get(activity)) == null) {
                    return false;
                }
                Application application = activity.getApplication();
                d dVar = new d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                f1493g.post(new a(dVar, obj2));
                if (d()) {
                    f1492f.invoke(obj, obj2, null, null, 0, false, null, null, false, false);
                } else {
                    activity.recreate();
                }
                f1493g.post(new RunnableC0047b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    protected static boolean a(Object obj, Activity activity) {
        try {
            Object obj2 = f1489c.get(activity);
            if (obj2 != obj) {
                return false;
            }
            f1493g.postAtFrontOfQueue(new c(f1488b.get(activity), obj2));
            return true;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method b(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field c() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (d() && cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, Boolean.TYPE, Configuration.class, Configuration.class, Boolean.TYPE, Boolean.TYPE);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static boolean d() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }
}
