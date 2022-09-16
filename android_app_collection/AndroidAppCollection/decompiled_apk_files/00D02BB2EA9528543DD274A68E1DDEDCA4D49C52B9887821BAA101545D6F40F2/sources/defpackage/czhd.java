package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import gen_binder.root.RootModule$Generated;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: czhd  reason: default package */
/* loaded from: classes.dex */
public final class czhd {
    public static final czhl a = new czhl("debug.binder.verification");
    private static final Object h;
    private static final czhg i;
    public czhd b;
    public final Map<Object, Object> c;
    public final Map<Object, List<?>> d;
    public final Map<Class<?>, Map<Object, Object>> e;
    public final CopyOnWriteArrayList<RootModule$Generated> f;
    public volatile czhf g;
    private Context j;
    private String k;
    private final Set<Class<?>> l;
    private final ThreadLocal<Boolean> m;
    private volatile boolean n;

    static {
        czho.a(new czhl("debug.binder.strict_mode"));
        new czhp("test.binder.trace");
        new czhp("test.binder.detail_trace");
        h = new Object();
        i = new czhg(false, new czhj());
    }

    public czhd() {
        this.c = Collections.synchronizedMap(new HashMap());
        this.d = Collections.synchronizedMap(new HashMap());
        this.e = Collections.synchronizedMap(new HashMap());
        this.l = Collections.synchronizedSet(new HashSet());
        this.f = new CopyOnWriteArrayList<>();
        this.m = new ThreadLocal<>();
        this.g = new czhk();
    }

    public static <T> T a(Context context, Class<T> cls) {
        czhd h2 = h(context);
        T t = (T) h2.k(cls);
        if (t == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unbound type: ");
            sb.append(cls.getName());
            sb.append("\n");
            sb.append("Searched binders:\n");
            while (true) {
                sb.append(h2.k);
                h2 = h2.b;
                if (h2 == null) {
                    break;
                }
                sb.append(" ->\n");
            }
            throw new IllegalStateException(sb.toString());
        }
        return t;
    }

    public static <T> T b(Context context, Class<T> cls) {
        return (T) h(context).c(cls);
    }

    public static <T> List<T> g(Context context, Class<T> cls) {
        List<?> list;
        czhd h2 = h(context);
        ArrayList arrayList = new ArrayList();
        while (h2.j != null) {
            synchronized (h2.d(cls)) {
                list = h2.d.get(cls);
                if (list == null) {
                    if (czho.a(a) && h2.c.containsKey(cls)) {
                        String valueOf = String.valueOf(cls);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
                        sb.append("getAll() called for single-bound object: ");
                        sb.append(valueOf);
                        throw new IllegalStateException(sb.toString());
                    }
                    list = new ArrayList<>();
                    h2.d.put(cls, list);
                }
                if (h2.l.add(cls)) {
                    boolean j = h2.j();
                    if (!j) {
                        h2.m.set(true);
                    }
                    int size = h2.f.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        RootModule$Generated rootModule$Generated = h2.f.get(i2);
                        Context context2 = h2.j;
                        rootModule$Generated.a(cls, h2);
                    }
                    if (!j) {
                        h2.m.set(false);
                    }
                }
                if (list.isEmpty()) {
                    list = new ArrayList<>();
                    Map<Object, Object> map = h2.e.get(cls);
                    if (map != null) {
                        for (Object obj : map.values()) {
                            if (obj != h) {
                                list.add(obj);
                            }
                        }
                    }
                }
            }
            arrayList.addAll(list);
            h2 = h2.b;
            if (h2 == null) {
                return arrayList;
            }
        }
        throw new IllegalStateException("Binder not initialized yet.");
    }

    public static czhd h(Context context) {
        czhd czhdVar;
        Context applicationContext = context.getApplicationContext();
        boolean z = false;
        do {
            if (context instanceof czhe) {
                czhdVar = ((czhe) context).d();
                if (czhdVar == null) {
                    String valueOf = String.valueOf(context);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
                    sb.append("BinderContext must not return null Binder: ");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            } else {
                czhdVar = null;
            }
            if (czhdVar != null) {
                return czhdVar;
            }
            z |= context == applicationContext;
            if (context instanceof ContextWrapper) {
                context = ((ContextWrapper) context).getBaseContext();
                if (context == null) {
                    throw new IllegalStateException("Invalid ContextWrapper -- If this is a Robolectric test, have you called ActivityController.create()?");
                }
            } else if (!z) {
                context = applicationContext;
                continue;
            } else {
                context = null;
                continue;
            }
        } while (context != null);
        return i(applicationContext);
    }

    public static czhd i(Context context) {
        return i.a(context.getApplicationContext());
    }

    private final boolean j() {
        Boolean bool = this.m.get();
        return bool != null && bool.booleanValue();
    }

    private final <T> T k(Class<T> cls) {
        czhd czhdVar = this;
        do {
            T t = (T) czhdVar.f(cls);
            if (t != null) {
                return t;
            }
            czhdVar = czhdVar.b;
        } while (czhdVar != null);
        return null;
    }

    public final <T> T c(Class<T> cls) {
        return (T) k(cls);
    }

    public final Object d(Object obj) {
        return this.g.a(obj);
    }

    public final void e() {
    }

    public final <T> T f(Class<T> cls) {
        T t;
        if (this.j == null) {
            throw new IllegalStateException("Binder not initialized yet.");
        }
        synchronized (d(cls)) {
            T t2 = (T) this.c.get(cls);
            if (t2 != null) {
                if (t2 == h) {
                    t2 = null;
                }
                return t2;
            }
            boolean j = j();
            if (!j) {
                this.m.set(true);
            }
            int size = this.f.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f.get(i2).a(cls, this);
                if (!czho.a(a) && (t = (T) this.c.get(cls)) != null && t != h) {
                    if (!j) {
                        this.m.set(false);
                    }
                    return t;
                }
            }
            if (!j) {
                this.m.set(false);
            }
            T t3 = (T) this.c.get(cls);
            if (t3 == null) {
                if (czho.a(a) && this.d.containsKey(cls)) {
                    String valueOf = String.valueOf(cls);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                    sb.append("get() called for multibound object: ");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
                this.c.put(cls, h);
            }
            return t3;
        }
    }

    public czhd(Context context) {
        this.c = Collections.synchronizedMap(new HashMap());
        this.d = Collections.synchronizedMap(new HashMap());
        this.e = Collections.synchronizedMap(new HashMap());
        this.l = Collections.synchronizedSet(new HashSet());
        this.f = new CopyOnWriteArrayList<>();
        this.m = new ThreadLocal<>();
        this.g = new czhk();
        this.j = context;
        this.b = null;
        this.k = context.getClass().getName();
    }
}
