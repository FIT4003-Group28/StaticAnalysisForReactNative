package defpackage;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.ArrayMap;
/* compiled from: PG */
/* renamed from: daoe  reason: default package */
/* loaded from: classes5.dex */
public final class daoe {
    public static Bundle a(PersistableBundle persistableBundle) {
        Bundle bundle = new Bundle();
        bundle.putAll(persistableBundle);
        return bundle;
    }

    public static boolean b(PersistableBundle persistableBundle, PersistableBundle persistableBundle2) {
        return persistableBundle == persistableBundle2 || d(persistableBundle).equals(d(persistableBundle2));
    }

    public static void c(PersistableBundle persistableBundle) {
        daof.c(persistableBundle, "PersistableBundle cannot be null!");
        for (String str : persistableBundle.keySet()) {
            Object obj = persistableBundle.get(str);
            daof.a(e(obj), String.format("Unknown/unsupported data type [%s] for key %s", obj, str));
        }
    }

    private static ArrayMap<String, Object> d(BaseBundle baseBundle) {
        if (baseBundle.isEmpty()) {
            return new ArrayMap<>(0);
        }
        ArrayMap<String, Object> arrayMap = new ArrayMap<>(baseBundle.size());
        for (String str : baseBundle.keySet()) {
            if (e(baseBundle.get(str))) {
                arrayMap.put(str, baseBundle.get(str));
            }
        }
        return arrayMap;
    }

    private static boolean e(Object obj) {
        return (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof String) || (obj instanceof Boolean);
    }
}
