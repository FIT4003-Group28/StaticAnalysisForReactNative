package com.teslamotors.plugins.client.d;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: SharedPreferencesHelper.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static d f5340a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<SharedPreferences.Editor> f5341b = new ArrayList<>();

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            if (f5340a == null) {
                f5340a = new d();
            }
            dVar = f5340a;
        }
        return dVar;
    }

    public static SharedPreferences a(Context context) {
        return context.getSharedPreferences("tesla_client", 0);
    }

    public static SharedPreferences b(Context context) {
        return context.getSharedPreferences("login.prefs", 0);
    }

    public static SharedPreferences c(Context context) {
        return context.getSharedPreferences("calendar.prefs", 0);
    }

    public static SharedPreferences d(Context context) {
        return context.getSharedPreferences("secure", 0);
    }

    public static SharedPreferences e(Context context) {
        return context.getSharedPreferences("non_secure", 0);
    }

    public static SharedPreferences f(Context context) {
        return context.getSharedPreferences("svc_data", 0);
    }

    public long a(String str, long j, SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putLong(str, j);
        edit.apply();
        return j;
    }

    public long a(String str, SharedPreferences sharedPreferences) {
        return sharedPreferences.getLong(str, 0L);
    }

    public boolean a(String str, String str2, boolean z, SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (sharedPreferences.contains(str)) {
            edit.remove(str);
        }
        edit.putString(str, str2);
        if (!z) {
            this.f5341b.add(edit);
        }
        return !z || edit.commit();
    }

    public String b(String str, SharedPreferences sharedPreferences) {
        if (sharedPreferences.contains(str)) {
            try {
                return sharedPreferences.getString(str, null);
            } catch (Exception unused) {
                Map<String, ?> all = sharedPreferences.getAll();
                if (!all.containsKey(str)) {
                    return null;
                }
                return all.get(str).toString();
            }
        }
        return null;
    }

    public boolean a(String str, boolean z, SharedPreferences sharedPreferences) {
        if (sharedPreferences.contains(str)) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.remove(str);
            if (!z) {
                this.f5341b.add(edit);
            }
            return !z || edit.commit();
        }
        return true;
    }

    public void a(String str, Set<String> set, SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putStringSet(str, set);
        edit.commit();
    }

    public Set<String> a(String str, SharedPreferences sharedPreferences, Set<String> set) {
        return sharedPreferences.getStringSet(str, set);
    }

    public boolean a(SharedPreferences sharedPreferences, boolean z) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.clear();
        if (!z) {
            this.f5341b.add(edit);
        }
        return !z || edit.commit();
    }

    public boolean b() {
        Iterator<SharedPreferences.Editor> it = this.f5341b.iterator();
        while (true) {
            boolean z = true;
            while (it.hasNext()) {
                if (!it.next().commit() || !z) {
                    z = false;
                }
            }
            this.f5341b.clear();
            return z;
        }
    }
}
