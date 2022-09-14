package c.e.b.o;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4876a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f4877b;

    /* renamed from: c  reason: collision with root package name */
    private final c.e.b.l.c f4878c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicBoolean f4879d = new AtomicBoolean(b());

    public a(Context context, String str, c.e.b.l.c cVar) {
        this.f4876a = a(context);
        this.f4877b = context.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f4878c = cVar;
    }

    private static Context a(Context context) {
        return (Build.VERSION.SDK_INT < 24 || a.g.e.b.d(context)) ? context : a.g.e.b.a(context);
    }

    private boolean b() {
        ApplicationInfo applicationInfo;
        if (this.f4877b.contains("firebase_data_collection_default_enabled")) {
            return this.f4877b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        try {
            PackageManager packageManager = this.f4876a.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(this.f4876a.getPackageName(), 128)) != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("firebase_data_collection_default_enabled")) {
                return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return true;
    }

    public void a(boolean z) {
        if (this.f4879d.compareAndSet(!z, z)) {
            this.f4877b.edit().putBoolean("firebase_data_collection_default_enabled", z).apply();
            this.f4878c.a(new c.e.b.l.a<>(c.e.b.a.class, new c.e.b.a(z)));
        }
    }

    public boolean a() {
        return this.f4879d.get();
    }
}
