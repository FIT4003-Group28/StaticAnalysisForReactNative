package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
/* compiled from: PG */
/* renamed from: dguk  reason: default package */
/* loaded from: classes6.dex */
public final class dguk {
    private final Map<Type, dgsz<?>> a;
    private final dgxb b = dgxb.a;

    public dguk(Map<Type, dgsz<?>> map) {
        this.a = map;
    }

    public final <T> dguw<T> a(dgxd<T> dgxdVar) {
        dgud dgudVar;
        Type type = dgxdVar.b;
        Class<? super T> cls = dgxdVar.a;
        dgsz<?> dgszVar = this.a.get(type);
        if (dgszVar != null) {
            return new dgub(dgszVar);
        }
        dgsz<?> dgszVar2 = this.a.get(cls);
        if (dgszVar2 == null) {
            dguw<T> dguwVar = null;
            try {
                Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
                if (!declaredConstructor.isAccessible()) {
                    this.b.a(declaredConstructor);
                }
                dgudVar = new dgud(declaredConstructor);
            } catch (NoSuchMethodException unused) {
                dgudVar = null;
            }
            if (dgudVar != null) {
                return dgudVar;
            }
            if (Collection.class.isAssignableFrom(cls)) {
                if (SortedSet.class.isAssignableFrom(cls)) {
                    dguwVar = new dgue();
                } else if (EnumSet.class.isAssignableFrom(cls)) {
                    dguwVar = new dguf(type);
                } else if (Set.class.isAssignableFrom(cls)) {
                    dguwVar = new dgug();
                } else {
                    dguwVar = Queue.class.isAssignableFrom(cls) ? new dguh() : new dgui();
                }
            } else if (Map.class.isAssignableFrom(cls)) {
                if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                    dguwVar = new dguj();
                } else if (ConcurrentMap.class.isAssignableFrom(cls)) {
                    dguwVar = new dgtw();
                } else if (SortedMap.class.isAssignableFrom(cls)) {
                    dguwVar = new dgtx();
                } else {
                    dguwVar = (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(dgxd.a(((ParameterizedType) type).getActualTypeArguments()[0]).a)) ? new dgtz() : new dgty();
                }
            }
            return dguwVar != null ? dguwVar : new dgua(cls, type);
        }
        return new dguc(dgszVar2);
    }

    public final String toString() {
        return this.a.toString();
    }
}
