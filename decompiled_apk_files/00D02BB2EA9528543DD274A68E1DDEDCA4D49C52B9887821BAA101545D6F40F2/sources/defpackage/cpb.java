package defpackage;

import android.app.Activity;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: PG */
/* renamed from: cpb  reason: default package */
/* loaded from: classes.dex */
public final class cpb {
    public Class<?> a;
    public Class<?> b;
    public Method c;
    public Method d;
    public Method e;
    public Method f;
    public Method g;
    public Method h;
    public Method i;
    public Method j;
    public Method k;
    public asht l;
    private final Activity m;
    private Object n;
    private Method o;
    private Method p;
    private final BroadcastReceiver q = new cpa(this);

    public cpb(Activity activity) {
        this.m = activity;
    }

    public static final RuntimeException g(Exception exc) {
        if (String.valueOf(exc.toString()).length() == 0) {
            new String("PhoneSysUiClient failure: ");
        }
        if (exc instanceof InvocationTargetException) {
            String valueOf = String.valueOf(((InvocationTargetException) exc).getCause());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
            sb.append("Invocation exception caused by: ");
            sb.append(valueOf);
            sb.toString();
        }
        String valueOf2 = String.valueOf(exc.toString());
        throw new IllegalStateException(valueOf2.length() != 0 ? "Fatal failure interacting with VnClient: ".concat(valueOf2) : new String("Fatal failure interacting with VnClient: "));
    }

    private final Object h() {
        try {
            Context createPackageContext = this.m.createPackageContext(cmxl.b(this.m), 3);
            ClassLoader classLoader = createPackageContext.getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gearhead.vanagon.thirdparty.CarModeSysUI");
            try {
                this.o = loadClass.getMethod("onCreate", Boolean.TYPE);
                this.c = loadClass.getMethod("onDestroy", new Class[0]);
                this.d = loadClass.getMethod("onStart", new Class[0]);
                this.e = loadClass.getMethod("onStop", new Class[0]);
                this.f = loadClass.getMethod("onResume", new Class[0]);
                this.i = loadClass.getMethod("onWindowFocusChanged", Boolean.TYPE);
                this.h = loadClass.getMethod("onConfigurationChanged", Configuration.class);
                this.g = loadClass.getMethod("onPause", new Class[0]);
                loadClass.getMethod("getSystemUIView", new Class[0]);
                this.p = loadClass.getMethod("getAppRootViewGroup", new Class[0]);
                this.j = loadClass.getMethod("setEnabled", Boolean.TYPE);
                loadClass.getMethod("setSystemUiVisibility", Integer.TYPE);
                loadClass.getMethod("showDownButton", Boolean.TYPE);
                loadClass.getMethod("showFacetNavigation", Boolean.TYPE);
                loadClass.getMethod("showFacetNavigation", Boolean.TYPE, Integer.TYPE, Integer.TYPE);
                loadClass.getMethod("setSystemUiFlagLightStatusBar", Boolean.TYPE);
                loadClass.getMethod("setPrettyImmersiveStickyTransitions", Boolean.TYPE);
                try {
                    loadClass.getMethod("suppressHomeButtonExit", Boolean.TYPE);
                    this.a = classLoader.loadClass("com.google.android.apps.auto.sdk.vanagon.PhoneSysUiClient$ScreenshotProvider");
                    this.b = classLoader.loadClass("com.google.android.apps.auto.sdk.vanagon.PhoneSysUiClient$ScreenshotProvider$OnCompleteListener");
                    this.k = loadClass.getMethod("setScreenshotProvider", this.a);
                    loadClass.getMethod("setLayoutInDisplayCutoutMode", Integer.TYPE);
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                }
                try {
                    return loadClass.getDeclaredConstructor(Context.class, Context.class).newInstance(this.m, createPackageContext);
                } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                    throw g(e);
                }
            } catch (Exception e2) {
                throw g(e2);
            }
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalStateException unused2) {
            return null;
        }
    }

    public final ViewGroup a() {
        return (ViewGroup) this.m.findViewById(16908290);
    }

    public final ViewGroup b() {
        ViewGroup a = a();
        if (this.n != null) {
            throw new IllegalStateException("Install can only be called once.");
        }
        Object h = h();
        this.n = h;
        if (h == null) {
            return a;
        }
        c(this.o, true);
        return (ViewGroup) c(this.p, new Object[0]);
    }

    public final Object c(Method method, Object... objArr) {
        if (method != null && d()) {
            try {
                return method.invoke(this.n, objArr);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                g(e);
            }
        }
        return null;
    }

    public final boolean d() {
        return this.n != null;
    }

    public final boolean e() {
        ResolveInfo resolveActivity;
        Activity activity = this.m;
        if (((UiModeManager) activity.getSystemService("uimode")).getCurrentModeType() != 3 || (resolveActivity = activity.getPackageManager().resolveActivity(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.CAR_DOCK"), 0)) == null || resolveActivity.activityInfo == null) {
            return false;
        }
        if (String.valueOf(resolveActivity.activityInfo.toString()).length() == 0) {
            new String("activityInfo: ");
        }
        if (String.valueOf(resolveActivity.activityInfo.packageName).length() == 0) {
            new String("packageName: ");
        }
        try {
            return cmxl.b(activity).equals(resolveActivity.activityInfo.packageName);
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    public final void f(asht ashtVar) {
        if (this.l == null && ashtVar != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(UiModeManager.ACTION_ENTER_CAR_MODE);
            intentFilter.addAction(UiModeManager.ACTION_EXIT_CAR_MODE);
            this.m.registerReceiver(this.q, intentFilter);
        }
        if (this.l != null && ashtVar == null) {
            this.m.unregisterReceiver(this.q);
        }
        this.l = ashtVar;
    }
}
