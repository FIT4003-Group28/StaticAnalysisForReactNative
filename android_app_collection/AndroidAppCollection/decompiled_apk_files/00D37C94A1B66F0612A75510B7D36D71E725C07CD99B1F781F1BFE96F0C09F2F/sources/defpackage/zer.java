package defpackage;

import android.os.Looper;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: zer  reason: default package */
/* loaded from: classes4.dex */
public abstract class zer implements amqo, azqb {
    static final Object c = new Object();
    static final Map d = new HashMap();
    private final zgn a;
    private String b;
    final String e;
    volatile Object f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zer(String str) {
        this(str, zgm.a);
        zgh.m(str);
    }

    private static String c(String str) {
        return str.substring(str.lastIndexOf(".") + 1);
    }

    private static String d(zer zerVar) {
        zerVar.a.a("Lazy:getGenericTypeName");
        String str = zerVar.e;
        if (str != null) {
            return str;
        }
        Type genericSuperclass = zerVar.getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            return e((ParameterizedType) genericSuperclass);
        }
        if (genericSuperclass instanceof Class) {
            return ((Class) genericSuperclass).getSimpleName();
        }
        return c(genericSuperclass.toString());
    }

    private static String e(ParameterizedType parameterizedType) {
        Type type = parameterizedType.getActualTypeArguments()[0];
        if (type instanceof Class) {
            return ((Class) type).getSimpleName();
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType2 = (ParameterizedType) type;
            String c2 = c(parameterizedType2.getRawType().toString());
            String e = e(parameterizedType2);
            StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 2 + String.valueOf(e).length());
            sb.append(c2);
            sb.append("<");
            sb.append(e);
            sb.append(">");
            return sb.toString();
        } else if (type instanceof GenericArrayType) {
            return String.valueOf(((GenericArrayType) type).getGenericComponentType().toString()).concat("[]");
        } else {
            return c(type.toString());
        }
    }

    private static String f(zer zerVar) {
        String str = zerVar.b;
        if (str != null) {
            return str;
        }
        synchronized (zerVar) {
            String str2 = zerVar.b;
            if (str2 != null) {
                return str2;
            }
            String d2 = d(zerVar);
            Map map = d;
            synchronized (map) {
                Integer num = (Integer) map.get(d2);
                int intValue = num == null ? 1 : num.intValue() + 1;
                map.put(d2, Integer.valueOf(intValue));
                if (intValue > 1) {
                    StringBuilder sb = new StringBuilder(String.valueOf(d2).length() + 11);
                    sb.append(d2);
                    sb.append(intValue);
                    d2 = sb.toString();
                }
                zerVar.b = d2;
            }
            return d2;
        }
    }

    private static String g(String str, zer zerVar) {
        String f = f(zerVar);
        Thread currentThread = Thread.currentThread();
        if (currentThread == Looper.getMainLooper().getThread()) {
            StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(f).length());
            sb.append(str);
            sb.append(":");
            sb.append(f);
            return sb.toString();
        }
        long id = currentThread.getId();
        StringBuilder sb2 = new StringBuilder(str.length() + 23 + String.valueOf(f).length());
        sb2.append(str);
        sb2.append("[");
        sb2.append(id);
        sb2.append("]:");
        sb2.append(f);
        return sb2.toString();
    }

    protected abstract Object a();

    public final void b(Executor executor) {
        executor.execute(new Runnable() { // from class: zeq
            @Override // java.lang.Runnable
            public final void run() {
                zer.this.get();
            }
        });
    }

    @Override // defpackage.amqo
    public final Object get() {
        Object obj = this.f;
        Object obj2 = c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f;
                if (obj == obj2) {
                    this.a.a(g("Lazy.create", this));
                    obj = a();
                    this.f = obj;
                }
            }
        }
        this.a.a(g("Lazy.get", this));
        return obj;
    }

    public zer(String str, zgn zgnVar) {
        this.f = c;
        this.e = str;
        zgnVar.getClass();
        this.a = zgnVar;
    }
}
