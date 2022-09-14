package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: dddv  reason: default package */
/* loaded from: classes.dex */
public final class dddv implements Serializable, dddy, dddz, ddea, ddeb, dddw, dddx, ddho {
    public static final HashMap<dddu, dddv> a = new HashMap<>();
    private static final HashMap<dddv, Field> k = new HashMap<>();
    private static boolean l = false;
    private final int m;

    public dddv(int i) {
        this.m = i;
    }

    public static void a() {
        Field[] fields;
        synchronized (a) {
            if (l) {
                return;
            }
            for (Field field : dddv.class.getFields()) {
                int modifiers = field.getModifiers();
                if (dddv.class.equals(field.getType()) && Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers)) {
                    try {
                        dddv dddvVar = (dddv) field.get(null);
                        a.put(new dddu(dddvVar.m), dddvVar);
                        k.put(dddvVar, field);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            l = true;
        }
    }

    @Override // defpackage.ddhp
    public final int b() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ddho) && this.m == ((ddho) obj).b();
    }

    public final int hashCode() {
        return this.m * 31;
    }

    public final String toString() {
        a();
        return k.get(this).getName();
    }
}
