package defpackage;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: smx  reason: default package */
/* loaded from: classes4.dex */
public final class smx {
    public static smt a(Iterable iterable) {
        return new smw(iterable);
    }

    public static Set b(Class cls, Class... clsArr) {
        Field[] declaredFields;
        HashSet hashSet = new HashSet();
        int length = clsArr.length;
        for (int i = 0; i < 14; i++) {
            for (Field field : clsArr[i].getDeclaredFields()) {
                if (field.isAnnotationPresent(cls) && field.getType().equals(String.class)) {
                    try {
                        hashSet.add((String) field.get(null));
                    } catch (IllegalAccessException e) {
                        throw new IllegalArgumentException(e);
                    }
                }
            }
        }
        return hashSet;
    }

    public static int c(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static sgt d(String str) {
        return new sgt(str, sbv.d());
    }

    public static final float e(float f) {
        return Math.min(5.0f, Math.abs(f) / 3.0f);
    }
}
