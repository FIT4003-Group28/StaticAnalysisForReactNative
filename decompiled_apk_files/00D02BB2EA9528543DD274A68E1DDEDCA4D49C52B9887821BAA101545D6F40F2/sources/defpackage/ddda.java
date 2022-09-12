package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: ddda  reason: default package */
/* loaded from: classes.dex */
public class ddda implements Serializable, dddb, dddc, ddhn {
    public static final HashMap<ddcz, ddda> a = new HashMap<>();
    private static final HashMap<ddda, Field> gl = new HashMap<>();
    private static boolean gm = false;
    public final int b;
    private final int gn = 0;

    public ddda(int i) {
        this.b = i;
    }

    public static void a() {
        Field[] fields;
        synchronized (a) {
            if (gm) {
                return;
            }
            for (Field field : ddda.class.getFields()) {
                int modifiers = field.getModifiers();
                if (ddda.class.equals(field.getType()) && Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers)) {
                    try {
                        ddda dddaVar = (ddda) field.get(null);
                        a.put(new ddcz(dddaVar.b), dddaVar);
                        gl.put(dddaVar, field);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            gm = true;
        }
    }

    @Override // defpackage.ddhp
    public final int b() {
        return this.b;
    }

    public final String c() {
        a();
        return gl.get(this).getName();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ddda) {
            ddda dddaVar = (ddda) obj;
            if (this.b == dddaVar.b) {
                int i = dddaVar.gn;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b * 31;
    }

    public final String toString() {
        return c();
    }
}
