package defpackage;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bvjs  reason: default package */
/* loaded from: classes4.dex */
public final class bvjs implements SharedPreferences {
    public final Map<String, Object> a = new HashMap();
    public final Set<SharedPreferences.OnSharedPreferenceChangeListener> b = new HashSet();

    private final <T> T a(String str, T t) {
        T t2 = (T) this.a.get(str);
        return t2 != null ? t2 : t;
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        return this.a.containsKey(str);
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new bvjr(this);
    }

    @Override // android.content.SharedPreferences
    public final Map<String, ?> getAll() {
        return this.a;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        return ((Boolean) a(str, Boolean.valueOf(z))).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        return ((Float) a(str, Float.valueOf(f))).floatValue();
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        return ((Integer) a(str, Integer.valueOf(i))).intValue();
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        return ((Long) a(str, Long.valueOf(j))).longValue();
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        return (String) a(str, str2);
    }

    @Override // android.content.SharedPreferences
    public final Set<String> getStringSet(String str, Set<String> set) {
        return (Set) a(str, set);
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.b.remove(onSharedPreferenceChangeListener);
    }
}
