package defpackage;

import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: yno  reason: default package */
/* loaded from: classes4.dex */
final class yno implements ynj {
    public final Method a;
    private final WeakReference b;
    private final int c;

    public yno(Object obj, Method method) {
        this.b = new WeakReference(obj);
        method.getClass();
        this.a = method;
        method.setAccessible(true);
        this.c = Arrays.hashCode(new Object[]{obj, method});
    }

    @Override // defpackage.ynj
    public final void a(Object obj) {
        Object obj2 = this.b.get();
        if (obj2 == null) {
            return;
        }
        try {
            this.a.invoke(obj2, obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2.getCause());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yno) {
            yno ynoVar = (yno) obj;
            if (ynoVar.b.get() == this.b.get() && this.a.equals(ynoVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }
}
