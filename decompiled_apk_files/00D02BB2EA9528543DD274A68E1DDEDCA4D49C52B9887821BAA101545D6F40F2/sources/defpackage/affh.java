package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
/* compiled from: PG */
/* renamed from: affh  reason: default package */
/* loaded from: classes.dex */
class affh {
    protected final Context a;

    public affh(Context context) {
        this.a = context;
    }

    public boolean a(String str) {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.a.deleteSharedPreferences(str);
        }
        return this.a.getSharedPreferences(str, 0).edit().clear().commit();
    }

    public SharedPreferences b(String str, int i) {
        return this.a.getSharedPreferences(str, i);
    }
}
