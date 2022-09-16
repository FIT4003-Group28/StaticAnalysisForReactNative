package defpackage;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: alvt  reason: default package */
/* loaded from: classes.dex */
public final class alvt {
    private static final ancy a = new ancy("PersistableBundles");

    public static Bundle a(PersistableBundle persistableBundle) {
        Bundle bundle = new Bundle();
        bundle.putAll(persistableBundle);
        return bundle;
    }

    public static PersistableBundle b(PersistableBundle persistableBundle, PersistableBundle persistableBundle2, PersistableBundle... persistableBundleArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(persistableBundle, persistableBundle2));
        Collections.addAll(arrayList, persistableBundleArr);
        PersistableBundle persistableBundle3 = new PersistableBundle();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            PersistableBundle persistableBundle4 = (PersistableBundle) arrayList.get(i);
            for (String str : persistableBundle4.keySet()) {
                apwt.l(!persistableBundle3.containsKey(str), String.format("Found duplicate key [%s] while attempting to merge bundles.", str));
            }
            persistableBundle3.putAll(persistableBundle4);
        }
        return persistableBundle3;
    }

    public static boolean c(PersistableBundle persistableBundle, PersistableBundle persistableBundle2) {
        return persistableBundle == persistableBundle2 || e(persistableBundle).equals(e(persistableBundle2));
    }

    public static void d(PersistableBundle persistableBundle) {
        apwt.n(persistableBundle, "PersistableBundle cannot be null!");
        for (String str : persistableBundle.keySet()) {
            Object obj = persistableBundle.get(str);
            apwt.l(f(obj), String.format("Unknown/unsupported data type [%s] for key %s", obj, str));
        }
    }

    private static ArrayMap e(BaseBundle baseBundle) {
        if (baseBundle == null || baseBundle.isEmpty()) {
            return new ArrayMap(0);
        }
        ArrayMap arrayMap = new ArrayMap(baseBundle.size());
        for (String str : baseBundle.keySet()) {
            Object obj = baseBundle.get(str);
            if (!f(obj)) {
                a.d(String.format("Unknown/unsupported data type [%s] for key %s", obj, str));
            } else {
                arrayMap.put(str, baseBundle.get(str));
            }
        }
        return arrayMap;
    }

    private static boolean f(Object obj) {
        return (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof String) || (obj instanceof Boolean);
    }
}
