package defpackage;

import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
/* compiled from: PG */
/* renamed from: cqif  reason: default package */
/* loaded from: classes.dex */
public final class cqif<T extends View> {
    @dzsi
    public dbsg<Constructor<T>> a;
    @dzsi
    public dbsg<Constructor<T>> b;
    @dzsi
    public dbsg<Constructor<T>> c;
    @dzsi
    public dbsg<Constructor<T>> d;
    public final Class<T> e;

    public cqif(Class<T> cls) {
        this.e = cls;
    }

    public static final T b(Constructor<T> constructor, Object... objArr) {
        try {
            try {
                return constructor.newInstance(objArr);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        }
    }

    public final dbsg<Constructor<T>> a(Class<?>[] clsArr) {
        try {
            return dbsg.i(this.e.getConstructor(clsArr));
        } catch (NoSuchMethodException unused) {
            return dbpy.a;
        }
    }
}
