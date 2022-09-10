package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
/* compiled from: PG */
/* renamed from: bxv  reason: default package */
/* loaded from: classes.dex */
public final class bxv implements bxl {
    private final bxr<bxt, Object> a;
    private final bxu b;
    private final Map<Class<?>, NavigableMap<Integer, Integer>> c;
    private final Map<Class<?>, bxk<?>> d;
    private final int e;
    private int f;

    public bxv() {
        this.a = new bxr<>();
        this.b = new bxu();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = 4194304;
    }

    private final <T> T f(bxt bxtVar, Class<T> cls) {
        bxk<T> j = j(cls);
        T t = (T) this.a.b(bxtVar);
        if (t != null) {
            this.f -= j.a(t) * j.c();
            h(j.a(t), cls);
        }
        return t == null ? j.b(bxtVar.a) : t;
    }

    private final void g(int i) {
        while (this.f > i) {
            Object c = this.a.c();
            cjn.b(c);
            bxk j = j(c.getClass());
            this.f -= j.a(c) * j.c();
            h(j.a(c), c.getClass());
        }
    }

    private final void h(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> i2 = i(cls);
        Integer valueOf = Integer.valueOf(i);
        Integer num = (Integer) i2.get(valueOf);
        if (num != null) {
            if (num.intValue() == 1) {
                i2.remove(valueOf);
                return;
            } else {
                i2.put(valueOf, Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        String valueOf2 = String.valueOf(this);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 56);
        sb.append("Tried to decrement empty size, size: ");
        sb.append(i);
        sb.append(", this: ");
        sb.append(valueOf2);
        throw new NullPointerException(sb.toString());
    }

    private final NavigableMap<Integer, Integer> i(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.c.get(cls);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.c.put(cls, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    private final <T> bxk<T> j(Class<T> cls) {
        bxs bxsVar = (bxk<T>) this.d.get(cls);
        if (bxsVar == null) {
            if (cls.equals(int[].class)) {
                bxsVar = new bxs();
            } else if (!cls.equals(byte[].class)) {
                String valueOf = String.valueOf(cls.getSimpleName());
                throw new IllegalArgumentException(valueOf.length() != 0 ? "No array pool found for: ".concat(valueOf) : new String("No array pool found for: "));
            } else {
                bxsVar = new bxp();
            }
            this.d.put(cls, bxsVar);
        }
        return bxsVar;
    }

    @Override // defpackage.bxl
    public final synchronized <T> void a(T t) {
        Class<?> cls = t.getClass();
        bxk<T> j = j(cls);
        int a = j.a(t);
        int c = j.c() * a;
        int i = 1;
        if (c <= (this.e >> 1)) {
            bxt d = this.b.d(a, cls);
            this.a.a(d, t);
            NavigableMap<Integer, Integer> i2 = i(cls);
            Integer num = (Integer) i2.get(Integer.valueOf(d.a));
            Integer valueOf = Integer.valueOf(d.a);
            if (num != null) {
                i = 1 + num.intValue();
            }
            i2.put(valueOf, Integer.valueOf(i));
            this.f += c;
            g(this.e);
        }
    }

    @Override // defpackage.bxl
    public final synchronized <T> T b(int i, Class<T> cls) {
        bxt d;
        Integer ceilingKey = i(cls).ceilingKey(Integer.valueOf(i));
        if (ceilingKey != null) {
            int i2 = this.f;
            if (i2 != 0 && this.e / i2 < 2 && ceilingKey.intValue() > i * 8) {
            }
            d = this.b.d(ceilingKey.intValue(), cls);
        }
        d = this.b.d(i, cls);
        return (T) f(d, cls);
    }

    @Override // defpackage.bxl
    public final synchronized void c() {
        g(0);
    }

    @Override // defpackage.bxl
    public final synchronized void d(int i) {
        if (i >= 40) {
            c();
        } else if (i < 20 && i != 15) {
        } else {
            g(this.e >> 1);
        }
    }

    @Override // defpackage.bxl
    public final synchronized <T> T e(Class<T> cls) {
        return (T) f(this.b.d(8, cls), cls);
    }

    public bxv(int i) {
        this.a = new bxr<>();
        this.b = new bxu();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = i;
    }
}
