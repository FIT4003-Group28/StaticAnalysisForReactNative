package io.invertase.firebase.common;

import android.content.SharedPreferences;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import java.util.Map;
/* loaded from: classes.dex */
public class k {

    /* renamed from: b  reason: collision with root package name */
    private static k f10339b = new k();

    /* renamed from: a  reason: collision with root package name */
    private SharedPreferences f10340a;

    private SharedPreferences c() {
        if (this.f10340a == null) {
            this.f10340a = io.invertase.firebase.app.a.a().getSharedPreferences("io.invertase.firebase", 0);
        }
        return this.f10340a;
    }

    public static k d() {
        return f10339b;
    }

    public void a() {
        c().edit().clear().apply();
    }

    public void a(String str, String str2) {
        c().edit().putString(str, str2).apply();
    }

    public boolean a(String str) {
        return c().contains(str);
    }

    public boolean a(String str, boolean z) {
        return c().getBoolean(str, z);
    }

    public WritableMap b() {
        WritableMap createMap = Arguments.createMap();
        for (Map.Entry<String, ?> entry : c().getAll().entrySet()) {
            l.a(entry.getKey(), entry.getValue(), createMap);
        }
        return createMap;
    }

    public void b(String str, boolean z) {
        c().edit().putBoolean(str, z).apply();
    }
}
