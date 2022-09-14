package b.a.a.a.a.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
/* compiled from: IdManager.java */
/* loaded from: classes.dex */
public class p {
    private static final Pattern e = Pattern.compile("[^\\p{Alnum}]");
    private static final String f = Pattern.quote("/");

    /* renamed from: a  reason: collision with root package name */
    c f1085a;

    /* renamed from: b  reason: collision with root package name */
    b f1086b;

    /* renamed from: c  reason: collision with root package name */
    boolean f1087c;

    /* renamed from: d  reason: collision with root package name */
    o f1088d;
    private final ReentrantLock g = new ReentrantLock();
    private final q h;
    private final boolean i;
    private final boolean j;
    private final Context k;
    private final String l;
    private final String m;
    private final Collection<b.a.a.a.i> n;

    /* compiled from: IdManager.java */
    /* loaded from: classes.dex */
    public enum a {
        WIFI_MAC_ADDRESS(1),
        BLUETOOTH_MAC_ADDRESS(2),
        FONT_TOKEN(53),
        ANDROID_ID(100),
        ANDROID_DEVICE_ID(101),
        ANDROID_SERIAL(102),
        ANDROID_ADVERTISING_ID(103);
        
        public final int h;

        a(int i2) {
            this.h = i2;
        }
    }

    public p(Context context, String str, String str2, Collection<b.a.a.a.i> collection) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        if (collection == null) {
            throw new IllegalArgumentException("kits must not be null");
        }
        this.k = context;
        this.l = str;
        this.m = str2;
        this.n = collection;
        this.h = new q();
        this.f1085a = new c(context);
        this.f1088d = new o();
        this.i = i.a(context, "com.crashlytics.CollectDeviceIdentifiers", true);
        if (!this.i) {
            b.a.a.a.l h = b.a.a.a.c.h();
            h.a("Fabric", "Device ID collection disabled for " + context.getPackageName());
        }
        this.j = i.a(context, "com.crashlytics.CollectUserIdentifiers", true);
        if (this.j) {
            return;
        }
        b.a.a.a.l h2 = b.a.a.a.c.h();
        h2.a("Fabric", "User information collection disabled for " + context.getPackageName());
    }

    public boolean a() {
        return this.j;
    }

    private String a(String str) {
        if (str == null) {
            return null;
        }
        return e.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    public String b() {
        String str = this.m;
        if (str == null) {
            SharedPreferences a2 = i.a(this.k);
            b(a2);
            String string = a2.getString("crashlytics.installation.id", null);
            return string == null ? a(a2) : string;
        }
        return str;
    }

    public String c() {
        return this.l;
    }

    public String d() {
        return e() + "/" + f();
    }

    public String e() {
        return b(Build.VERSION.RELEASE);
    }

    public String f() {
        return b(Build.VERSION.INCREMENTAL);
    }

    public String g() {
        return String.format(Locale.US, "%s/%s", b(Build.MANUFACTURER), b(Build.MODEL));
    }

    private String b(String str) {
        return str.replaceAll(f, "");
    }

    @SuppressLint({"CommitPrefEdits"})
    private String a(SharedPreferences sharedPreferences) {
        this.g.lock();
        try {
            String string = sharedPreferences.getString("crashlytics.installation.id", null);
            if (string == null) {
                string = a(UUID.randomUUID().toString());
                sharedPreferences.edit().putString("crashlytics.installation.id", string).commit();
            }
            return string;
        } finally {
            this.g.unlock();
        }
    }

    private void b(SharedPreferences sharedPreferences) {
        b l = l();
        if (l != null) {
            a(sharedPreferences, l.f1052a);
        }
    }

    @SuppressLint({"CommitPrefEdits"})
    private void a(SharedPreferences sharedPreferences, String str) {
        this.g.lock();
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String string = sharedPreferences.getString("crashlytics.advertising.id", null);
            if (TextUtils.isEmpty(string)) {
                sharedPreferences.edit().putString("crashlytics.advertising.id", str).commit();
            } else if (!string.equals(str)) {
                sharedPreferences.edit().remove("crashlytics.installation.id").putString("crashlytics.advertising.id", str).commit();
            }
        } finally {
            this.g.unlock();
        }
    }

    public Map<a, String> h() {
        HashMap hashMap = new HashMap();
        for (b.a.a.a.i iVar : this.n) {
            if (iVar instanceof m) {
                for (Map.Entry<a, String> entry : ((m) iVar).getDeviceIdentifiers().entrySet()) {
                    a(hashMap, entry.getKey(), entry.getValue());
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public String i() {
        return this.h.a(this.k);
    }

    public Boolean j() {
        if (k()) {
            return m();
        }
        return null;
    }

    private void a(Map<a, String> map, a aVar, String str) {
        if (str != null) {
            map.put(aVar, str);
        }
    }

    protected boolean k() {
        return this.i && !this.f1088d.b(this.k);
    }

    synchronized b l() {
        if (!this.f1087c) {
            this.f1086b = this.f1085a.a();
            this.f1087c = true;
        }
        return this.f1086b;
    }

    private Boolean m() {
        b l = l();
        if (l != null) {
            return Boolean.valueOf(l.f1053b);
        }
        return null;
    }
}
