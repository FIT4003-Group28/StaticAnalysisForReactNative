package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
/* compiled from: PG */
/* renamed from: clk  reason: default package */
/* loaded from: classes2.dex */
public final class clk implements clb {
    private final clg a;
    private final clj b;
    private final Map c;
    private final Map d;
    private final int e;
    private int f;

    public clk() {
        this.a = new clg();
        this.b = new clj();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = 4194304;
    }

    private final cla f(Class cls) {
        cla claVar = (cla) this.d.get(cls);
        if (claVar == null) {
            if (cls.equals(int[].class)) {
                claVar = new clh();
            } else if (!cls.equals(byte[].class)) {
                String valueOf = String.valueOf(cls.getSimpleName());
                throw new IllegalArgumentException(valueOf.length() != 0 ? "No array pool found for: ".concat(valueOf) : new String("No array pool found for: "));
            } else {
                claVar = new clh(1);
            }
            this.d.put(cls, claVar);
        }
        return claVar;
    }

    private final Object g(cli cliVar, Class cls) {
        cla f = f(cls);
        Object a = this.a.a(cliVar);
        if (a != null) {
            this.f -= f.a(a) * f.b();
            i(f.a(a), cls);
        }
        return a == null ? f.c(cliVar.a) : a;
    }

    private final NavigableMap h(Class cls) {
        NavigableMap navigableMap = (NavigableMap) this.c.get(cls);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.c.put(cls, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    private final void i(int i, Class cls) {
        NavigableMap h = h(cls);
        Integer valueOf = Integer.valueOf(i);
        Integer num = (Integer) h.get(valueOf);
        if (num == null) {
            String valueOf2 = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 56);
            sb.append("Tried to decrement empty size, size: ");
            sb.append(i);
            sb.append(", this: ");
            sb.append(valueOf2);
            throw new NullPointerException(sb.toString());
        } else if (num.intValue() == 1) {
            h.remove(valueOf);
        } else {
            h.put(valueOf, Integer.valueOf(num.intValue() - 1));
        }
    }

    private final void j(int i) {
        while (this.f > i) {
            Object b = this.a.b();
            hy.N(b);
            cla f = f(b.getClass());
            this.f -= f.a(b) * f.b();
            i(f.a(b), b.getClass());
        }
    }

    @Override // defpackage.clb
    public final synchronized Object a(int i, Class cls) {
        cli d;
        Integer num = (Integer) h(cls).ceilingKey(Integer.valueOf(i));
        if (num != null) {
            int i2 = this.f;
            if (i2 != 0 && this.e / i2 < 2 && num.intValue() > i * 8) {
            }
            d = this.b.d(num.intValue(), cls);
        }
        d = this.b.d(i, cls);
        return g(d, cls);
    }

    @Override // defpackage.clb
    public final synchronized void b() {
        j(0);
    }

    @Override // defpackage.clb
    public final synchronized void c(Object obj) {
        Class<?> cls = obj.getClass();
        cla f = f(cls);
        int a = f.a(obj);
        int b = f.b() * a;
        int i = 1;
        if (b <= (this.e >> 1)) {
            cli d = this.b.d(a, cls);
            this.a.c(d, obj);
            NavigableMap h = h(cls);
            Integer num = (Integer) h.get(Integer.valueOf(d.a));
            Integer valueOf = Integer.valueOf(d.a);
            if (num != null) {
                i = 1 + num.intValue();
            }
            h.put(valueOf, Integer.valueOf(i));
            this.f += b;
            j(this.e);
        }
    }

    @Override // defpackage.clb
    public final synchronized void d(int i) {
        if (i >= 40) {
            b();
        } else if (i < 20 && i != 15) {
        } else {
            j(this.e >> 1);
        }
    }

    @Override // defpackage.clb
    public final synchronized Object e(Class cls) {
        return g(this.b.d(8, cls), cls);
    }

    public clk(int i) {
        this.a = new clg();
        this.b = new clj();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = i;
    }
}
