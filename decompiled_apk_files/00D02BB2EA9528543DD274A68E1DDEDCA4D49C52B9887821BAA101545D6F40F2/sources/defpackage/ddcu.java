package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: ddcu  reason: default package */
/* loaded from: classes.dex */
public final class ddcu implements Serializable, ddcv, ddcw, ddhp {
    private static final HashMap<ddct, ddcu> aI = new HashMap<>();
    private static final HashMap<ddcu, Field> aJ = new HashMap<>();
    private static boolean aK = false;
    public final int a;
    private final int aL = 0;

    public ddcu(int i) {
        this.a = i;
    }

    @dzsi
    public static ddcu a(int i) {
        c();
        return aI.get(new ddct(i));
    }

    private static void c() {
        Field[] fields;
        synchronized (aI) {
            if (aK) {
                return;
            }
            for (Field field : ddcu.class.getFields()) {
                int modifiers = field.getModifiers();
                if (ddcu.class.equals(field.getType()) && Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers)) {
                    try {
                        ddcu ddcuVar = (ddcu) field.get(null);
                        aI.put(new ddct(ddcuVar.a), ddcuVar);
                        aJ.put(ddcuVar, field);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            aK = true;
        }
    }

    @Override // defpackage.ddhp
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ddcu) {
            ddcu ddcuVar = (ddcu) obj;
            if (this.a == ddcuVar.a) {
                int i = ddcuVar.aL;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a * 31;
    }

    public final String toString() {
        c();
        return aJ.get(this).getName();
    }
}
