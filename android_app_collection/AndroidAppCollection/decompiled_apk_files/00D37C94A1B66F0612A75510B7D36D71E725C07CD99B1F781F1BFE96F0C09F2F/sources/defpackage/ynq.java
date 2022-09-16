package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: PG */
/* renamed from: ynq  reason: default package */
/* loaded from: classes4.dex */
final class ynq implements yng {
    final Map a = new HashMap(256);
    private final ReadWriteLock b = new ReentrantReadWriteLock();

    @Override // defpackage.yng
    public final ynk[] a(Object obj, Class cls, Object obj2) {
        Set<ynp> L;
        ReadWriteLock readWriteLock;
        this.b.readLock().lock();
        try {
            int i = 0;
            if (this.a.containsKey(cls)) {
                L = zew.L(this.a, cls);
            } else {
                this.b.readLock().unlock();
                Method[] declaredMethods = cls.getDeclaredMethods();
                this.b.writeLock().lock();
                try {
                    if (this.a.containsKey(cls)) {
                        L = zew.L(this.a, cls);
                        readWriteLock = this.b;
                    } else {
                        for (Method method : declaredMethods) {
                            if (method.isAnnotationPresent(ynr.class)) {
                                Class<?>[] parameterTypes = method.getParameterTypes();
                                aqxo.q(parameterTypes.length == 1, "Event handler methods can only take a single event argument.");
                                zew.M(this.a, cls, new ynp(parameterTypes[0], method));
                            }
                        }
                        L = zew.L(this.a, cls);
                        readWriteLock = this.b;
                    }
                    readWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    this.b.writeLock().unlock();
                    throw th;
                }
            }
            if (L.isEmpty()) {
                throw new IllegalArgumentException(String.format("Class %s does not contain any methods annotated with @Subscribe", cls.getName()));
            }
            ynk[] ynkVarArr = new ynk[L.size()];
            for (ynp ynpVar : L) {
                ynkVarArr[i] = new ynk(obj, ynpVar.a, obj2, new yno(obj, ynpVar.b));
                i++;
            }
            return ynkVarArr;
        } finally {
            this.b.readLock().unlock();
        }
    }
}
