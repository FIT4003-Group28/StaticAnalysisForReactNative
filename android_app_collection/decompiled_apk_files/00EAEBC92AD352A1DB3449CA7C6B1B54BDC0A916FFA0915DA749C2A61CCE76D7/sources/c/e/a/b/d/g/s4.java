package c.e.a.b.d.g;

import c.e.a.b.d.g.u4;
import java.util.Iterator;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s4<T extends u4<T>> {

    /* renamed from: d  reason: collision with root package name */
    private static final s4 f4400d = new s4(true);

    /* renamed from: a  reason: collision with root package name */
    final c7<T, Object> f4401a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f4402b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4403c;

    private s4() {
        this.f4401a = c7.b(16);
    }

    private s4(c7<T, Object> c7Var) {
        this.f4401a = c7Var;
        a();
    }

    private s4(boolean z) {
        this(c7.b(0));
        a();
    }

    public static int a(u4<?> u4Var, Object obj) {
        u4Var.j();
        throw null;
    }

    private static <T extends u4<T>> boolean a(Map.Entry<T, Object> entry) {
        entry.getKey().l();
        throw null;
    }

    private final void b(T t, Object obj) {
        t.k();
        throw null;
    }

    private final void b(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (!(value instanceof p5)) {
            key.k();
            throw null;
        }
        p5 p5Var = (p5) value;
        p5.c();
        throw null;
    }

    private static int c(Map.Entry<T, Object> entry) {
        entry.getValue();
        entry.getKey().l();
        throw null;
    }

    public static <T extends u4<T>> s4<T> g() {
        return f4400d;
    }

    public final void a() {
        if (this.f4402b) {
            return;
        }
        this.f4401a.a();
        this.f4402b = true;
    }

    public final void a(s4<T> s4Var) {
        int c2 = s4Var.f4401a.c();
        c7<T, Object> c7Var = s4Var.f4401a;
        if (c2 > 0) {
            b(c7Var.a(0));
            throw null;
        }
        Iterator<Map.Entry<T, Object>> it = c7Var.d().iterator();
        if (!it.hasNext()) {
            return;
        }
        b(it.next());
        throw null;
    }

    public final boolean b() {
        return this.f4402b;
    }

    public final Iterator<Map.Entry<T, Object>> c() {
        return this.f4403c ? new q5(this.f4401a.entrySet().iterator()) : this.f4401a.entrySet().iterator();
    }

    public final /* synthetic */ Object clone() {
        s4 s4Var = new s4();
        if (this.f4401a.c() > 0) {
            Map.Entry<T, Object> a2 = this.f4401a.a(0);
            s4Var.b(a2.getKey(), a2.getValue());
            throw null;
        }
        Iterator<Map.Entry<T, Object>> it = this.f4401a.d().iterator();
        if (!it.hasNext()) {
            s4Var.f4403c = this.f4403c;
            return s4Var;
        }
        Map.Entry<T, Object> next = it.next();
        s4Var.b(next.getKey(), next.getValue());
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Iterator<Map.Entry<T, Object>> d() {
        return this.f4403c ? new q5(this.f4401a.e().iterator()) : this.f4401a.e().iterator();
    }

    public final boolean e() {
        if (this.f4401a.c() > 0) {
            a(this.f4401a.a(0));
            throw null;
        }
        Iterator<Map.Entry<T, Object>> it = this.f4401a.d().iterator();
        if (!it.hasNext()) {
            return true;
        }
        a(it.next());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s4) {
            return this.f4401a.equals(((s4) obj).f4401a);
        }
        return false;
    }

    public final int f() {
        if (this.f4401a.c() > 0) {
            c(this.f4401a.a(0));
            throw null;
        }
        Iterator<Map.Entry<T, Object>> it = this.f4401a.d().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        c(it.next());
        throw null;
    }

    public final int hashCode() {
        return this.f4401a.hashCode();
    }
}
