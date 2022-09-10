package defpackage;

import android.content.SharedPreferences;
import java.lang.reflect.Field;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dyx  reason: default package */
/* loaded from: classes.dex */
public final class dyx {
    @dzsi
    static Map<String, bvjk> a;

    public static Map<String, bvjk> a() {
        Map<String, bvjk> map = a;
        if (map != null) {
            return map;
        }
        a = dcjz.d();
        for (Field field : dcft.i(dchl.b(bvjk.class.getDeclaredFields()), new dyw())) {
            try {
                Object obj = field.get(null);
                if ((obj instanceof bvjk) && obj != bvjk.e && obj != bvjk.f) {
                    bvjk bvjkVar = (bvjk) obj;
                    String bvjkVar2 = bvjkVar.toString();
                    if (!a.containsKey(bvjkVar2)) {
                        a.put(bvjkVar2, bvjkVar);
                    }
                }
            } catch (IllegalAccessException | IllegalArgumentException unused) {
            }
        }
        return a;
    }

    public static void b(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            String key = entry.getKey();
            if (key.endsWith("@OLD_PREFERENCE_VALUE")) {
                String substring = key.substring(0, key.length() - 21);
                bvjk bvjkVar = a().get(bvjj.d(substring));
                if (bvjkVar != null) {
                    bviw bviwVar = bvjkVar.kA;
                    Object value = entry.getValue();
                    entry.getKey();
                    Object b = bviwVar.b(value);
                    if (b == null || !b.equals(entry.getValue())) {
                        String bvjkVar2 = bvjk.hm.toString();
                        edit.putInt(bvjkVar2, sharedPreferences.getInt(bvjkVar2, 0) + 1);
                    } else {
                        cqas.c(edit, substring, b);
                        edit.remove(key);
                        String bvjkVar3 = bvjk.hl.toString();
                        edit.putInt(bvjkVar3, sharedPreferences.getInt(bvjkVar3, 0) + 1);
                    }
                }
            } else {
                bvjk bvjkVar4 = a().get(bvjj.d(entry.getKey()));
                if (bvjkVar4 != null) {
                    bviw bviwVar2 = bvjkVar4.kA;
                    Object value2 = entry.getValue();
                    entry.getKey();
                    Object b2 = bviwVar2.b(value2);
                    if (entry.getValue() != null && !entry.getValue().equals(b2)) {
                        cqas.c(edit, String.valueOf(entry.getKey()).concat("@OLD_PREFERENCE_VALUE"), entry.getValue());
                        String bvjkVar5 = bvjk.hk.toString();
                        edit.putInt(bvjkVar5, sharedPreferences.getInt(bvjkVar5, 0) + 1);
                        if (b2 == null) {
                            edit.remove(entry.getKey());
                        } else {
                            cqas.c(edit, entry.getKey(), b2);
                        }
                    }
                }
            }
        }
        edit.commit();
    }
}
