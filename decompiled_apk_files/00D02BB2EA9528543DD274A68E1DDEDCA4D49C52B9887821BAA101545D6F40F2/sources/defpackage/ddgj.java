package defpackage;

import com.google.common.logging.SocialSendkitVisualElementTypeSplit_0;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: ddgj  reason: default package */
/* loaded from: classes5.dex */
public final class ddgj implements SocialSendkitVisualElementTypeSplit_0, Serializable, ddho {
    public static final HashMap<ddgi, ddgj> a = new HashMap<>();
    private static final HashMap<ddgj, Field> b = new HashMap<>();
    private static boolean c = false;
    private final int d;

    public ddgj(int i) {
        this.d = i;
    }

    public static void a() {
        Field[] fields;
        synchronized (a) {
            if (c) {
                return;
            }
            for (Field field : ddgj.class.getFields()) {
                int modifiers = field.getModifiers();
                if (ddgj.class.equals(field.getType()) && Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers)) {
                    try {
                        ddgj ddgjVar = (ddgj) field.get(null);
                        a.put(new ddgi(ddgjVar.d), ddgjVar);
                        b.put(ddgjVar, field);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            c = true;
        }
    }

    @Override // defpackage.ddhp
    public final int b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ddho) && this.d == ((ddho) obj).b();
    }

    public final int hashCode() {
        return this.d * 31;
    }

    public final String toString() {
        a();
        return b.get(this).getName();
    }
}
