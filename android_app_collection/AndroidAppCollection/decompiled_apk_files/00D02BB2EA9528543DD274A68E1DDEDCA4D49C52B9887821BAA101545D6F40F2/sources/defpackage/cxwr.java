package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cxwr  reason: default package */
/* loaded from: classes5.dex */
public final class cxwr {
    public final SharedPreferences a;

    public cxwr(Context context) {
        this.a = context.getSharedPreferences("ThirdPartyAppsClicksPreference", 0);
    }

    public final void a(String str) {
        SharedPreferences.Editor edit = this.a.edit();
        String[] split = str.split(" ", -1);
        if (split.length > 1) {
            Set<String> stringSet = this.a.getStringSet(split[1], new HashSet());
            stringSet.add(str);
            edit.putStringSet(split[1], stringSet);
        }
        edit.putInt(str, this.a.getInt(str, 0) + 1);
        edit.apply();
    }

    public final void b(List<cxwm> list) {
        Collections.sort(list, new cxwq(this));
    }
}
