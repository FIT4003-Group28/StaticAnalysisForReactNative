package defpackage;

import android.os.IBinder;
import java.lang.reflect.Field;
/* compiled from: PG */
/* renamed from: cobb  reason: default package */
/* loaded from: classes.dex */
public final class cobb<T> extends coaz {
    private final T a;

    private cobb(T t) {
        this.a = t;
    }

    public static <T> coba b(T t) {
        return new cobb(t);
    }

    public static <T> T c(coba cobaVar) {
        if (cobaVar instanceof cobb) {
            return ((cobb) cobaVar).a;
        }
        IBinder asBinder = cobaVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            cnwc.a(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return (T) field.get(asBinder);
                } catch (IllegalAccessException e) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
                } catch (NullPointerException e2) {
                    throw new IllegalArgumentException("Binder object is null.", e2);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        int length = declaredFields.length;
        StringBuilder sb = new StringBuilder(64);
        sb.append("Unexpected number of IObjectWrapper declared fields: ");
        sb.append(length);
        throw new IllegalArgumentException(sb.toString());
    }
}
