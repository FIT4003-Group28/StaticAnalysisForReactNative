package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
/* compiled from: PG */
/* renamed from: ad  reason: default package */
/* loaded from: classes.dex */
public final class ad extends ag {
    public static ad a;
    private final Application b;

    public ad(Application application) {
        this.b = application;
    }

    @Override // defpackage.ag, defpackage.ae
    public final ac a(Class cls) {
        if (b.class.isAssignableFrom(cls)) {
            try {
                return (ac) cls.getConstructor(Application.class).newInstance(this.b);
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
        return super.a(cls);
    }
}
