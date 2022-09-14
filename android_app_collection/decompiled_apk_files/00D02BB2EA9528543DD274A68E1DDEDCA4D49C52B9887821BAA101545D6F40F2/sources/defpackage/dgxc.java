package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
/* compiled from: PG */
/* renamed from: dgxc  reason: default package */
/* loaded from: classes6.dex */
final class dgxc extends dgxb {
    private static Class b;
    private final Object c;
    private final Field d;

    public dgxc() {
        Object obj = null;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            b = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Exception unused) {
        }
        this.c = obj;
        this.d = b();
    }

    private static Field b() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    @Override // defpackage.dgxb
    public final void a(AccessibleObject accessibleObject) {
        if (this.c != null && this.d != null) {
            try {
                b.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.c, accessibleObject, Long.valueOf(((Long) b.getMethod("objectFieldOffset", Field.class).invoke(this.c, this.d)).longValue()), true);
                return;
            } catch (Exception unused) {
            }
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e) {
            throw new dgtd("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e);
        }
    }
}
