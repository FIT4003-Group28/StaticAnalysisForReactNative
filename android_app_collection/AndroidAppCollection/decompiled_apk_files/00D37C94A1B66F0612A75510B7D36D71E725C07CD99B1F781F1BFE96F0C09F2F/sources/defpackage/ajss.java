package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: PG */
/* renamed from: ajss  reason: default package */
/* loaded from: classes.dex */
public final class ajss {
    private final ReadWriteLock a = new ReentrantReadWriteLock();
    private final Map b = new HashMap();
    private azqb c;

    public final ajsr a(Object obj) {
        this.a.readLock().lock();
        azqb azqbVar = (azqb) this.b.get(obj);
        if (azqbVar == null) {
            azqbVar = this.c;
        }
        this.a.readLock().unlock();
        if (azqbVar != null) {
            return (ajsr) azqbVar.get();
        }
        return null;
    }

    public final void b(Map map) {
        this.a.readLock().lock();
        try {
            for (Object obj : map.keySet()) {
                aqxo.y(!this.b.containsKey(obj));
            }
            this.a.readLock().unlock();
            this.a.writeLock().lock();
            this.b.putAll(map);
            this.a.writeLock().unlock();
        } catch (Throwable th) {
            this.a.readLock().unlock();
            throw th;
        }
    }

    public final void c(azqb azqbVar) {
        this.a.writeLock().lock();
        this.c = azqbVar;
        this.a.writeLock().unlock();
    }
}
