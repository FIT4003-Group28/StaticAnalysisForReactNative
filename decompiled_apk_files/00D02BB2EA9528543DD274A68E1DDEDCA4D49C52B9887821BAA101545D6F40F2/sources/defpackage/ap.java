package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
/* compiled from: PG */
/* renamed from: ap  reason: default package */
/* loaded from: classes2.dex */
public final class ap extends as {
    public static ap a;
    private final Application b;

    public ap(Application application) {
        this.b = application;
    }

    @Override // defpackage.as, defpackage.aq
    public final <T extends an> T b(Class<T> cls) {
        if (a.class.isAssignableFrom(cls)) {
            try {
                return cls.getConstructor(Application.class).newInstance(this.b);
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            }
        }
        return (T) super.b(cls);
    }
}
