package defpackage;

import android.os.Build;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: afst  reason: default package */
/* loaded from: classes.dex */
public final class afst {
    public aftd a = afsq.a;
    private final Map b;

    public afst(String str, String str2, afsr afsrVar, afss afssVar, ampq ampqVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("cplatform", afsrVar.i);
        hashMap.put("c", afssVar.q);
        zgh.m(str2);
        hashMap.put("cver", str2);
        hashMap.put("cos", "Android");
        hashMap.put("cosver", Build.VERSION.RELEASE);
        hashMap.put("csdk", Integer.toString("REL".equals(Build.VERSION.CODENAME) ? Build.VERSION.SDK_INT : Build.VERSION.SDK_INT + 1));
        zgh.m(str);
        hashMap.put("cbr", str);
        hashMap.put("cbrver", str2);
        hashMap.put("cbrand", Build.MANUFACTURER);
        hashMap.put("cmodel", (String) ampqVar.e(Build.MODEL));
        this.b = Collections.unmodifiableMap(hashMap);
    }

    public final Map a() {
        afte a = this.a.a();
        if (a == null) {
            return Collections.emptyMap();
        }
        return Collections.singletonMap("cplayer", a.name());
    }

    public final Map b() {
        Map map = this.b;
        Map a = a();
        if (a.isEmpty()) {
            return map;
        }
        HashMap hashMap = new HashMap(map.size() + a.size());
        hashMap.putAll(map);
        hashMap.putAll(a);
        return hashMap;
    }

    public final void c(zgp zgpVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            zgpVar.h((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public final void d(zgp zgpVar) {
        for (Map.Entry entry : b().entrySet()) {
            zgpVar.h((String) entry.getKey(), (String) entry.getValue());
        }
    }
}
