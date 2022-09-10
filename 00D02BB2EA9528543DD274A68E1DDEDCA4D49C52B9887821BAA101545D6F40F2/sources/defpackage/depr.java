package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: depr  reason: default package */
/* loaded from: classes6.dex */
public final class depr extends deor {
    public final Set<Class<?>> a;
    public final deox b;
    private final Set<Class<?>> c;
    private final Set<Class<?>> d;

    public depr(deow<?> deowVar, deox deoxVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (depi depiVar : deowVar.b) {
            if (depiVar.b()) {
                if (!depiVar.a()) {
                    hashSet.add(depiVar.a);
                } else {
                    hashSet3.add(depiVar.a);
                }
            } else if (!depiVar.a()) {
                hashSet2.add(depiVar.a);
            } else {
                hashSet4.add(depiVar.a);
            }
        }
        if (!deowVar.e.isEmpty()) {
            hashSet.add(deqz.class);
        }
        this.c = Collections.unmodifiableSet(hashSet);
        this.d = Collections.unmodifiableSet(hashSet2);
        this.a = Collections.unmodifiableSet(hashSet3);
        Collections.unmodifiableSet(hashSet4);
        Set<Class<?>> set = deowVar.e;
        this.b = deoxVar;
    }

    @Override // defpackage.deor, defpackage.deox
    public final <T> T a(Class<T> cls) {
        if (!this.c.contains(cls)) {
            throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t = (T) this.b.a(cls);
        if (!cls.equals(deqz.class)) {
            return t;
        }
        deqz deqzVar = (deqz) t;
        return (T) new depq();
    }

    @Override // defpackage.deox
    public final <T> desq<T> b(Class<T> cls) {
        if (!this.d.contains(cls)) {
            throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
        }
        return this.b.b(cls);
    }
}
