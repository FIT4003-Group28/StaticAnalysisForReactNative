package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: ddfs  reason: default package */
/* loaded from: classes5.dex */
public final class ddfs implements Serializable, ddft, ddhn {
    private static final HashMap<ddfr, ddfs> d = new HashMap<>();
    private static final HashMap<ddfs, Field> e = new HashMap<>();
    private static boolean f = false;
    public final int a;
    private final int g = 0;

    public ddfs(int i) {
        this.a = i;
    }

    @Override // defpackage.ddhp
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ddfs) {
            ddfs ddfsVar = (ddfs) obj;
            if (this.a == ddfsVar.a) {
                int i = ddfsVar.g;
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
        synchronized (d) {
            if (!f) {
                for (Field field : ddfs.class.getFields()) {
                    int modifiers = field.getModifiers();
                    if (ddfs.class.equals(field.getType()) && Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers)) {
                        try {
                            ddfs ddfsVar = (ddfs) field.get(null);
                            d.put(new ddfr(ddfsVar.a), ddfsVar);
                            e.put(ddfsVar, field);
                        } catch (IllegalAccessException e2) {
                            throw new RuntimeException(e2);
                        }
                    }
                }
                f = true;
            }
        }
        return e.get(this).getName();
    }
}
