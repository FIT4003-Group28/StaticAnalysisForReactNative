package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: ddfv  reason: default package */
/* loaded from: classes5.dex */
public class ddfv implements Serializable, ddfw, ddhn {
    private static final HashMap<ddfu, ddfv> k = new HashMap<>();
    private static final HashMap<ddfv, Field> l = new HashMap<>();
    private static boolean m = false;
    public final int a;
    private final int n = 0;

    public ddfv(int i) {
        this.a = i;
    }

    @Override // defpackage.ddhp
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ddfv) {
            ddfv ddfvVar = (ddfv) obj;
            if (this.a == ddfvVar.a) {
                int i = ddfvVar.n;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a * 31;
    }

    public final String toString() {
        Field[] fields;
        synchronized (k) {
            if (!m) {
                for (Field field : ddfv.class.getFields()) {
                    int modifiers = field.getModifiers();
                    if (ddfv.class.equals(field.getType()) && Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers)) {
                        try {
                            ddfv ddfvVar = (ddfv) field.get(null);
                            k.put(new ddfu(ddfvVar.a), ddfvVar);
                            l.put(ddfvVar, field);
                        } catch (IllegalAccessException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
                m = true;
            }
        }
        return l.get(this).getName();
    }
}
