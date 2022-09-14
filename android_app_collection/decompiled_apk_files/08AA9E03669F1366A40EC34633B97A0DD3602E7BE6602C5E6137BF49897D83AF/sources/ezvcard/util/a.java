package ezvcard.util;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
/* compiled from: CaseClasses.java */
/* loaded from: classes.dex */
public abstract class a<T, V> {

    /* renamed from: a  reason: collision with root package name */
    protected final Class<T> f5598a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Collection<T> f5599b = null;

    /* renamed from: c  reason: collision with root package name */
    private Collection<T> f5600c = null;

    protected abstract T a(V v);

    protected abstract boolean a(T t, V v);

    public a(Class<T> cls) {
        this.f5598a = cls;
    }

    public T b(V v) {
        b();
        for (T t : this.f5599b) {
            if (a(t, v)) {
                return t;
            }
        }
        return null;
    }

    public T c(V v) {
        T b2 = b(v);
        if (b2 != null) {
            return b2;
        }
        synchronized (this.f5600c) {
            for (T t : this.f5600c) {
                if (a(t, v)) {
                    return t;
                }
            }
            T a2 = a((a<T, V>) v);
            this.f5600c.add(a2);
            return a2;
        }
    }

    public Collection<T> a() {
        b();
        return this.f5599b;
    }

    private void b() {
        if (this.f5599b == null) {
            synchronized (this) {
                if (this.f5599b == null) {
                    c();
                }
            }
        }
    }

    private void c() {
        Field[] fields;
        ArrayList arrayList = new ArrayList();
        for (Field field : this.f5598a.getFields()) {
            if (a(field)) {
                try {
                    Object obj = field.get(null);
                    if (obj != null) {
                        arrayList.add(this.f5598a.cast(obj));
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
        this.f5600c = new ArrayList(0);
        this.f5599b = Collections.unmodifiableCollection(arrayList);
    }

    private boolean a(Field field) {
        int modifiers = field.getModifiers();
        return Modifier.isStatic(modifiers) && Modifier.isPublic(modifiers) && field.getDeclaringClass() == this.f5598a && field.getType() == this.f5598a;
    }
}
