package defpackage;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: dakj  reason: default package */
/* loaded from: classes5.dex */
public final class dakj<T> extends dakk<T[]> {
    public dakj(Object obj, Field field, Class<T> cls) {
        super(obj, field, Array.newInstance((Class<?>) cls, 0).getClass());
    }

    private final Class<T> e() {
        return (Class<T>) this.a.getType().getComponentType();
    }

    public final void a(Collection<T> collection) {
        Object[] objArr = (Object[]) c();
        int length = objArr == null ? 0 : objArr.length;
        Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) e(), collection.size() + length);
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        for (T t : collection) {
            objArr2[length] = t;
            length++;
        }
        d(objArr2);
    }

    public final void b(Collection<T> collection) {
        Object[] objArr = (Object[]) c();
        int i = 0;
        Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) e(), (objArr == null ? 0 : objArr.length) + collection.size());
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, collection.size(), objArr.length);
        }
        for (T t : collection) {
            objArr2[i] = t;
            i++;
        }
        d(objArr2);
    }
}
