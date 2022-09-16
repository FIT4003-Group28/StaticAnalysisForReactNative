package defpackage;

import java.lang.reflect.Field;
/* compiled from: PG */
/* renamed from: dakk  reason: default package */
/* loaded from: classes5.dex */
public class dakk<T> {
    public final Field a;
    private final Object b;
    private final Class<T> c;

    public dakk(Object obj, Field field, Class<T> cls) {
        this.b = obj;
        this.a = field;
        this.c = cls;
    }

    public final T c() {
        try {
            return this.c.cast(this.a.get(this.b));
        } catch (Exception e) {
            throw new dakm(String.format("Failed to get value of field %s of type %s on object of type %s", this.a.getName(), this.b.getClass().getName(), this.c.getName()), e);
        }
    }

    public final void d(T t) {
        try {
            this.a.set(this.b, t);
        } catch (Exception e) {
            throw new dakm(String.format("Failed to set value of field %s of type %s on object of type %s", this.a.getName(), this.b.getClass().getName(), this.c.getName()), e);
        }
    }
}
