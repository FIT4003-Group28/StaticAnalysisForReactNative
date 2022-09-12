package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: cncl  reason: default package */
/* loaded from: classes5.dex */
public final class cncl {
    private final Map<Class<?>, Object> a = new aif();
    private final Map<Class<?>, Map<String, Object>> b = new aif();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized <T> T a(Class<T> cls, cnck<T> cnckVar) {
        T cast = cls.cast(this.a.get(cls));
        if (cast == null) {
            T a = cnckVar.a();
            Map<Class<?>, Object> map = this.a;
            dbsk.s(a);
            map.put(cls, a);
            return a;
        }
        return cast;
    }

    public final synchronized <T> T b(Class<T> cls, dbty<T> dbtyVar) {
        T cast = cls.cast(this.a.get(cls));
        if (cast == null) {
            T a = dbtyVar.a();
            Map<Class<?>, Object> map = this.a;
            dbsk.s(a);
            map.put(cls, a);
            return a;
        }
        return cast;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized <T> T c(Class<T> cls, String str, cnck<T> cnckVar) {
        T t;
        Map<String, Object> map = this.b.get(cls);
        if (map != null) {
            t = cls.cast(map.get(str));
        } else {
            map = new aif<>();
            this.b.put(cls, map);
            t = null;
        }
        if (t == null) {
            T a = cnckVar.a();
            dbsk.s(a);
            map.put(str, a);
            return a;
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized <T> void d(Class<T> cls, dbsz<T> dbszVar) {
        T cast = cls.cast(this.a.remove(cls));
        if (cast != null) {
            dbszVar.NU(cast);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e(Class<?> cls) {
        this.a.remove(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized <T> void f(Class<T> cls, dbsz<T> dbszVar) {
        Map<String, Object> remove = this.b.remove(cls);
        if (remove != null) {
            for (Object obj : remove.values()) {
                dbszVar.NU(cls.cast(obj));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void g(Class<?> cls) {
        this.b.remove(cls);
    }
}
