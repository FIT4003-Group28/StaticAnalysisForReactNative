package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
/* compiled from: PG */
/* renamed from: alro  reason: default package */
/* loaded from: classes.dex */
public final class alro {
    private static final Map a;

    static {
        new HashSet(Arrays.asList("app_update", "review"));
        new HashSet(Arrays.asList("native", "unity"));
        a = new HashMap();
        new alrz("PlayCoreVersion");
    }

    public static Bundle a(String str) {
        Bundle bundle = new Bundle();
        Map b = b(str);
        bundle.putInt("playcore_version_code", ((Integer) b.get("java")).intValue());
        if (b.containsKey("native")) {
            bundle.putInt("playcore_native_version", ((Integer) b.get("native")).intValue());
        }
        if (b.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", ((Integer) b.get("unity")).intValue());
        }
        return bundle;
    }

    public static synchronized Map b(String str) {
        Map map;
        synchronized (alro.class) {
            Map map2 = a;
            if (!map2.containsKey(str)) {
                HashMap hashMap = new HashMap();
                hashMap.put("java", 11001);
                map2.put(str, hashMap);
            }
            map = (Map) map2.get(str);
        }
        return map;
    }
}
