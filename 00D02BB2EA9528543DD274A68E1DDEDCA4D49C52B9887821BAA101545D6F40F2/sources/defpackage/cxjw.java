package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cxjw  reason: default package */
/* loaded from: classes.dex */
public final class cxjw implements cxiw {
    private static final Map<String, cxjw> a = new aif();
    private final SharedPreferences b;
    private final SharedPreferences.OnSharedPreferenceChangeListener c;
    private final Object d;
    private volatile Map<String, ?> e;
    private final List<cxit> f;

    private cxjw(SharedPreferences sharedPreferences) {
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener(this) { // from class: cxjv
            private final cxjw a;

            {
                this.a = this;
            }

            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                this.a.b();
            }
        };
        this.c = onSharedPreferenceChangeListener;
        this.d = new Object();
        this.f = new ArrayList();
        this.b = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cxjw a(Context context, String str) {
        cxjw cxjwVar;
        SharedPreferences sharedPreferences;
        if (!cqvm.a() || str.startsWith("direct_boot:") || cqvm.c(context)) {
            synchronized (cxjw.class) {
                Map<String, cxjw> map = a;
                cxjwVar = map.get(str);
                if (cxjwVar == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    if (str.startsWith("direct_boot:")) {
                        if (cqvm.a()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        sharedPreferences = context.getSharedPreferences(str.substring(12), 0);
                    } else {
                        sharedPreferences = context.getSharedPreferences(str, 0);
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    cxjwVar = new cxjw(sharedPreferences);
                    map.put(str, cxjwVar);
                }
            }
            return cxjwVar;
        }
        return null;
    }

    public static void c() {
        synchronized (cxjw.class) {
            for (cxjw cxjwVar : a.values()) {
                cxjwVar.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void d() {
        synchronized (cxjw.class) {
            for (cxjw cxjwVar : a.values()) {
                cxjwVar.b.unregisterOnSharedPreferenceChangeListener(cxjwVar.c);
            }
            a.clear();
        }
    }

    public final void b() {
        synchronized (this.d) {
            this.e = null;
            cxju.d();
        }
        synchronized (this) {
            for (cxit cxitVar : this.f) {
                cxitVar.a();
            }
        }
    }

    @Override // defpackage.cxiw
    public final Object e(String str) {
        Map<String, ?> map = this.e;
        if (map == null) {
            synchronized (this.d) {
                map = this.e;
                if (map == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    Map<String, ?> all = this.b.getAll();
                    this.e = all;
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    map = all;
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
