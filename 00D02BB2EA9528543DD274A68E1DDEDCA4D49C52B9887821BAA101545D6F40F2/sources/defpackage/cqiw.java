package defpackage;

import android.content.Context;
import defpackage.cqkp;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cqiw  reason: default package */
/* loaded from: classes.dex */
public abstract class cqiw<T extends cqkp> {
    private static final Object[] a = new Object[0];
    private static final Map<Class<?>, Type> b = Collections.synchronizedMap(new aif());
    private volatile T c;
    final cqhs y;

    public cqiw() {
        this(a);
    }

    public static final Boolean E() {
        Boolean bool = new Boolean(false);
        cqny.e(bool, cqhf.a);
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final Boolean F() {
        Boolean bool = new Boolean(false);
        cqny.e(bool, cqhh.a);
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final Boolean G() {
        Boolean bool = new Boolean(false);
        cqny.e(bool, cqhg.a);
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final Boolean H() {
        Boolean bool = new Boolean(false);
        cqny.e(bool, cqhk.a);
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final Boolean I() {
        Boolean bool = new Boolean(false);
        cqny.e(bool, cqhi.a);
        return bool;
    }

    private final Type e(Class<? extends cqiw> cls) {
        if (cls.getSuperclass() == cqiw.class) {
            return ((ParameterizedType) cls.getGenericSuperclass()).getActualTypeArguments()[0];
        }
        Type e = e(cls.getSuperclass());
        if (e instanceof Class) {
            return e;
        }
        if (e instanceof TypeVariable) {
            String name = ((TypeVariable) e).getName();
            TypeVariable<Class<? super Object>>[] typeParameters = cls.getSuperclass().getTypeParameters();
            for (int i = 0; i < typeParameters.length; i++) {
                if (name.equals(typeParameters[i].getName())) {
                    return ((ParameterizedType) cls.getGenericSuperclass()).getActualTypeArguments()[i];
                }
            }
            throw new IllegalStateException("Unable to resolve type variable.");
        }
        throw new IllegalStateException("modelType is a subclass of Type that hasn't been dealt with");
    }

    public static boolean y(cqiw<?> cqiwVar, cqiw<?> cqiwVar2) {
        return cqiwVar.y.equals(cqiwVar2.y);
    }

    public final boolean A() {
        return !cqih.class.isAssignableFrom(this.y.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public final T B() {
        Class cls;
        if (this.c == null) {
            Type ND = ND();
            if (ND instanceof ParameterizedType) {
                cls = (Class) ((ParameterizedType) ND).getRawType();
            } else {
                cls = (Class) ND;
            }
            this.c = (T) cqnw.b(cls);
        }
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public final cqjb<T, cqiv> C() {
        return D(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public final cqjb<T, cqiv> D(int i) {
        return new cqit(this, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected Type ND() {
        Type type;
        long currentTimeMillis = System.currentTimeMillis();
        Class<?> cls = getClass();
        Map<Class<?>, Type> map = b;
        synchronized (map) {
            type = map.get(cls);
            if (type == null) {
                type = e(cls);
                map.put(cls, type);
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (currentTimeMillis2 > 50) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 73);
            sb.append("Default getViewModelType implementation for ");
            sb.append(name);
            sb.append(" takes ");
            sb.append(currentTimeMillis2);
            sb.append("ms");
            sb.toString();
        }
        return type;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public cqiv NL(int i, T t, Context context) {
        cqiv cqivVar = new cqiv();
        RI(i, t, context, cqivVar);
        return cqivVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int NO() {
        return 4;
    }

    protected void RI(int i, T t, Context context, cqiv cqivVar) {
        throw new RuntimeException("If layoutViewBinderListAdapter() is called, one of the createLayoutListAdapter methods needs to be overridden.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract cqmj<T> a();

    public final boolean equals(Object obj) {
        return (obj instanceof cqiw) && y(this, (cqiw) obj);
    }

    public final int hashCode() {
        return this.y.hashCode();
    }

    public String toString() {
        return z();
    }

    public String z() {
        cqhs cqhsVar = this.y;
        String name = cqhsVar.a.getName();
        Object[] objArr = cqhsVar.b;
        if (objArr.length == 0) {
            return name;
        }
        String deepToString = Arrays.deepToString(objArr);
        String substring = deepToString.substring(1, deepToString.length() - 1);
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 2 + String.valueOf(substring).length());
        sb.append(name);
        sb.append("(");
        sb.append(substring);
        sb.append(")");
        return sb.toString();
    }

    public cqiw(Object... objArr) {
        this.y = new cqhs(getClass(), objArr);
    }
}
