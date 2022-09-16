package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: acrk */
/* loaded from: classes.dex */
public final class acrk {
    public static final String a = "acrk";
    public final snc b;
    public final azqb c;
    private final Context d;

    public acrk(Context context, snc sncVar, azqb azqbVar) {
        this.d = context;
        this.b = sncVar;
        this.c = azqbVar;
    }

    public static /* synthetic */ void c(Throwable th) {
        zep.d("Failed to clear last exception.", th);
    }

    public final Map a(afst afstVar) {
        HashMap hashMap = new HashMap();
        Map b = afstVar.b();
        hashMap.put("client.device.brand", (String) b.get("cbrand"));
        hashMap.put("client.device.model", (String) b.get("cmodel"));
        hashMap.put("client.device.os", (String) b.get("cos"));
        hashMap.put("client.device.os_version", (String) b.get("cosver"));
        hashMap.put("client.device.platform", (String) b.get("cplatform"));
        hashMap.put("client.name", ((String) b.get("c")).toUpperCase(Locale.getDefault()));
        hashMap.put("client.version", (String) b.get("cver"));
        PackageManager packageManager = this.d.getPackageManager();
        String packageName = this.d.getPackageName();
        int i = 0;
        try {
            hashMap.put("client.versionCode", Integer.toString(packageManager.getPackageInfo(packageName, 0).versionCode));
        } catch (PackageManager.NameNotFoundException e) {
            zep.f(a, "Failed to look up PackageInfo; unable to determine app versionCode", e);
        }
        try {
            i = packageManager.getApplicationInfo(packageName, 128).metaData.getInt("com.google.android.apps.youtube.config.BuildChangelist");
        } catch (PackageManager.NameNotFoundException e2) {
            zep.f(a, "Failed to look up ApplicationInfo; unable to determine build changelist", e2);
        }
        if (i != 0) {
            hashMap.put("client.build.changelist", Integer.toString(i));
        }
        return hashMap;
    }

    public final void b() {
        Thread.setDefaultUncaughtExceptionHandler(new acrj(this, Thread.getDefaultUncaughtExceptionHandler()));
    }

    public final void d(Executor executor) {
        ylx.i(anii.h(((yve) this.c.get()).a(), new aapz(17), executor), new ylw() { // from class: acrg
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                acrk acrkVar = acrk.this;
                Throwable th = (Throwable) obj;
                if (th != null) {
                    zep.j(acrk.a, "Sending Crash from last run...", th);
                    afus.c(2, 2, th.getMessage(), th);
                }
                ylx.m(((yve) acrkVar.c.get()).b(aapz.o), ngc.t);
            }
        });
    }
}
