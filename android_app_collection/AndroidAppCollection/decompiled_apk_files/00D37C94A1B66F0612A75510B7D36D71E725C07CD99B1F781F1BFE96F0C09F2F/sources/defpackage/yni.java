package defpackage;

import android.os.Looper;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: PG */
/* renamed from: yni  reason: default package */
/* loaded from: classes4.dex */
public final class yni {
    static final Object a = c();
    private static final yng[] e = {new ynn(), new ynq()};
    private static final yvv i = new yvv();
    final Map b;
    final Map c;
    public final ReadWriteLock d;
    private final Executor f;
    private final yng[] g;
    private final snc h;

    public yni(Executor executor, snc sncVar) {
        sncVar.getClass();
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        yvv yvvVar = i;
        yng[] yngVarArr = e;
        executor.getClass();
        this.f = executor;
        this.b = new HashMap(256);
        this.c = new zfi(new ynh(this));
        this.d = reentrantReadWriteLock;
        this.h = sncVar;
        yvvVar.getClass();
        yngVarArr.getClass();
        this.g = yngVarArr;
    }

    public static Object c() {
        return new Object();
    }

    private final void o(Object obj, Object obj2, boolean z) {
        obj2.getClass();
        if (this.h != null && (obj2 instanceof yns)) {
            yns ynsVar = (yns) obj2;
            if (!ynsVar.j()) {
                ynsVar.i(this.h.d());
            }
        }
        ynf ynfVar = new ynf(this, obj, obj2);
        if (Looper.myLooper() != Looper.getMainLooper() || !z) {
            this.f.execute(ynfVar);
        } else {
            ynfVar.run();
        }
    }

    private final void p(Object obj, Class cls, ynk ynkVar) {
        zew.M(this.b, cls, ynkVar);
        zew.M(this.c, obj, ynkVar);
    }

    public final ynk a(Object obj, Class cls, ynj ynjVar) {
        return b(obj, cls, a, ynjVar);
    }

    public final ynk b(Object obj, Class cls, Object obj2, ynj ynjVar) {
        obj.getClass();
        obj2.getClass();
        ynjVar.getClass();
        ynk ynkVar = new ynk(obj, cls, obj2, ynjVar);
        this.d.writeLock().lock();
        p(obj, cls, ynkVar);
        this.d.writeLock().unlock();
        return ynkVar;
    }

    public final void d(Object obj) {
        o(a, obj, false);
    }

    public final void e(Object obj, Object obj2) {
        o(obj, obj2, false);
    }

    public final void f(Object obj) {
        o(a, obj, true);
    }

    public final void g(Object obj) {
        obj.getClass();
        h(obj, obj.getClass());
    }

    public final void h(Object obj, Class cls) {
        j(obj, cls, a);
    }

    public final void i(Object obj, Object obj2) {
        j(obj, obj.getClass(), obj2);
    }

    public final void j(Object obj, Class cls, Object obj2) {
        cls.getClass();
        obj2.getClass();
        aqxo.q(cls.isAssignableFrom(obj.getClass()), "clazz must be a superclass of target");
        yng[] yngVarArr = this.g;
        int length = yngVarArr.length;
        for (int i2 = 0; i2 < 2; i2++) {
            ynk[] a2 = yngVarArr[i2].a(obj, cls, obj2);
            if (a2 != null && (r4 = a2.length) > 0) {
                this.d.writeLock().lock();
                for (ynk ynkVar : a2) {
                    p(obj, ynkVar.a, ynkVar);
                }
                this.d.writeLock().unlock();
                return;
            }
        }
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("target ");
        sb.append(valueOf);
        sb.append(" could not be registered!");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void k(Collection collection) {
        this.d.writeLock().lock();
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ynk ynkVar = (ynk) it.next();
                n(ynkVar);
                Object a2 = ynkVar.a();
                if (a2 != null && zew.N(this.c, a2, ynkVar)) {
                    zew.P(this.c, a2);
                }
            }
        } finally {
            this.d.writeLock().unlock();
        }
    }

    public final void l(ynk... ynkVarArr) {
        k(Arrays.asList(ynkVarArr));
    }

    public final void m(Object obj) {
        ReadWriteLock readWriteLock;
        if (obj == null) {
            return;
        }
        this.d.writeLock().lock();
        try {
            if (!this.c.containsKey(obj)) {
                readWriteLock = this.d;
            } else {
                Set set = (Set) this.c.remove(obj);
                if (set != null && !set.isEmpty()) {
                    k(set);
                    readWriteLock = this.d;
                }
                readWriteLock = this.d;
            }
            readWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            this.d.writeLock().unlock();
            throw th;
        }
    }

    public final void n(ynk ynkVar) {
        Class cls = ynkVar.a;
        if (zew.N(this.b, cls, ynkVar)) {
            zew.P(this.b, cls);
        }
    }
}
