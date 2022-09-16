package c.d.d.h;

import c.d.d.d.i;
import java.util.IdentityHashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class d<T> {

    /* renamed from: d  reason: collision with root package name */
    private static final Map<Object, Integer> f2845d = new IdentityHashMap();

    /* renamed from: a  reason: collision with root package name */
    private T f2846a;

    /* renamed from: b  reason: collision with root package name */
    private int f2847b;

    /* renamed from: c  reason: collision with root package name */
    private final c<T> f2848c;

    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        public a() {
            super("Null shared reference");
        }
    }

    public d(T t, c<T> cVar) {
        i.a(t);
        this.f2846a = t;
        i.a(cVar);
        this.f2848c = cVar;
        this.f2847b = 1;
        a(t);
    }

    private static void a(Object obj) {
        synchronized (f2845d) {
            Integer num = f2845d.get(obj);
            if (num == null) {
                f2845d.put(obj, 1);
            } else {
                f2845d.put(obj, Integer.valueOf(num.intValue() + 1));
            }
        }
    }

    public static boolean a(d<?> dVar) {
        return dVar != null && dVar.d();
    }

    private static void b(Object obj) {
        synchronized (f2845d) {
            Integer num = f2845d.get(obj);
            if (num == null) {
                c.d.d.e.a.d("SharedReference", "No entry in sLiveObjects for value of type %s", obj.getClass());
            } else if (num.intValue() == 1) {
                f2845d.remove(obj);
            } else {
                f2845d.put(obj, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    private synchronized int e() {
        f();
        i.a(this.f2847b > 0);
        this.f2847b--;
        return this.f2847b;
    }

    private void f() {
        if (a((d<?>) this)) {
            return;
        }
        throw new a();
    }

    public synchronized void a() {
        f();
        this.f2847b++;
    }

    public void b() {
        T t;
        if (e() == 0) {
            synchronized (this) {
                t = this.f2846a;
                this.f2846a = null;
            }
            this.f2848c.a(t);
            b(t);
        }
    }

    public synchronized T c() {
        return this.f2846a;
    }

    public synchronized boolean d() {
        return this.f2847b > 0;
    }
}
