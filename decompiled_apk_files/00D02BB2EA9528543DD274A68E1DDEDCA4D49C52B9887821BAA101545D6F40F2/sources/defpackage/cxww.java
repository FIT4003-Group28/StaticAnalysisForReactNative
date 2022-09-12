package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cxww  reason: default package */
/* loaded from: classes5.dex */
public final class cxww {
    public final SharedPreferences a;

    public cxww(Context context) {
        this.a = context.getSharedPreferences("ThirdPartyAppsRecencyPreference", 0);
    }

    public final void a(String str) {
        SharedPreferences.Editor edit = this.a.edit();
        String[] split = str.split(" ", -1);
        if (split.length > 1) {
            Set<String> stringSet = this.a.getStringSet(split[1], new HashSet());
            stringSet.add(str);
            edit.putStringSet(split[1], stringSet);
        }
        edit.putLong(str, System.currentTimeMillis());
        edit.apply();
    }

    public final void b(List<cxwm> list) {
        Collections.sort(list, new cxwv(this));
    }
}
