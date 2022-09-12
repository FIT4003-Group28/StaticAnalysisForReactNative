package defpackage;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bvjr  reason: default package */
/* loaded from: classes4.dex */
final class bvjr implements SharedPreferences.Editor {
    boolean a = false;
    final Set<String> b = new HashSet();
    final Map<String, Object> c = new HashMap();
    final /* synthetic */ bvjs d;

    public bvjr(bvjs bvjsVar) {
        this.d = bvjsVar;
    }

    private final void a(String str, Object obj) {
        if (obj != null) {
            this.c.put(str, obj);
        } else {
            remove(str);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.a = true;
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        if (this.a) {
            this.d.a.clear();
        }
        this.d.a.keySet().removeAll(this.b);
        for (Map.Entry<String, Object> entry : this.c.entrySet()) {
            this.d.a.put(entry.getKey(), entry.getValue());
        }
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : this.d.b) {
            dcpd it = dcnm.n(this.b, this.c.keySet()).iterator();
            while (it.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.d, (String) it.next());
            }
        }
        return this.a || !this.b.isEmpty() || !this.c.isEmpty();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        a(str, Boolean.valueOf(z));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        a(str, Float.valueOf(f));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        a(str, Integer.valueOf(i));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        a(str, Long.valueOf(j));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        a(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set<String> set) {
        a(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        this.b.add(str);
        return this;
    }
}
