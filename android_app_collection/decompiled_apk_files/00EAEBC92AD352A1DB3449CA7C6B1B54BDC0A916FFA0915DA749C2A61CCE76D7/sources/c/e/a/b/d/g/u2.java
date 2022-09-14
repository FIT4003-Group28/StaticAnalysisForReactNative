package c.e.a.b.d.g;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class u2 implements a2 {

    /* renamed from: f  reason: collision with root package name */
    private static final Map<String, u2> f4442f = new a.e.a();

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f4443a;

    /* renamed from: d  reason: collision with root package name */
    private volatile Map<String, ?> f4446d;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences.OnSharedPreferenceChangeListener f4444b = new SharedPreferences.OnSharedPreferenceChangeListener(this) { // from class: c.e.a.b.d.g.t2

        /* renamed from: a  reason: collision with root package name */
        private final u2 f4420a;

        /* JADX INFO: Access modifiers changed from: package-private */
        {
            this.f4420a = this;
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            this.f4420a.a(sharedPreferences, str);
        }
    };

    /* renamed from: c  reason: collision with root package name */
    private final Object f4445c = new Object();

    /* renamed from: e  reason: collision with root package name */
    private final List<b2> f4447e = new ArrayList();

    private u2(SharedPreferences sharedPreferences) {
        this.f4443a = sharedPreferences;
        this.f4443a.registerOnSharedPreferenceChangeListener(this.f4444b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static u2 a(Context context, String str) {
        u2 u2Var;
        if (!((!x1.a() || str.startsWith("direct_boot:")) ? true : x1.a(context))) {
            return null;
        }
        synchronized (u2.class) {
            u2Var = f4442f.get(str);
            if (u2Var == null) {
                u2Var = new u2(b(context, str));
                f4442f.put(str, u2Var);
            }
        }
        return u2Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void a() {
        synchronized (u2.class) {
            for (u2 u2Var : f4442f.values()) {
                u2Var.f4443a.unregisterOnSharedPreferenceChangeListener(u2Var.f4444b);
            }
            f4442f.clear();
        }
    }

    private static SharedPreferences b(Context context, String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (!str.startsWith("direct_boot:")) {
                return context.getSharedPreferences(str, 0);
            }
            if (x1.a()) {
                context = context.createDeviceProtectedStorageContext();
            }
            return context.getSharedPreferences(str.substring(12), 0);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    @Override // c.e.a.b.d.g.a2
    public final Object a(String str) {
        Map<String, ?> map = this.f4446d;
        if (map == null) {
            synchronized (this.f4445c) {
                map = this.f4446d;
                if (map == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    Map<String, ?> all = this.f4443a.getAll();
                    this.f4446d = all;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f4445c) {
            this.f4446d = null;
            k2.c();
        }
        synchronized (this) {
            for (b2 b2Var : this.f4447e) {
                b2Var.f();
            }
        }
    }
}
