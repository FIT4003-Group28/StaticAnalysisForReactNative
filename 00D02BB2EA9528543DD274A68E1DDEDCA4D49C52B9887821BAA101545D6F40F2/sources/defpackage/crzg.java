package defpackage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: crzg  reason: default package */
/* loaded from: classes.dex */
public abstract class crzg<V> implements crzm<V> {
    private final ThreadLocal<crzk<V>> a = new crze(this);
    private final ReadWriteLock b = new ReentrantReadWriteLock();
    private final Map<crzp<V>, crzr<V>> c = dcjz.h();
    private final ThreadLocal<Boolean> d = new crzf();

    private final void m(crzp<V> crzpVar, Executor executor) {
        dbsk.s(crzpVar);
        dbsk.s(executor);
        this.b.writeLock().lock();
        try {
            if (this.c.containsKey(crzpVar)) {
                throw new IllegalArgumentException("Observer already added");
            }
            if (this.d.get().booleanValue()) {
                throw new ConcurrentModificationException("Failed to add Observer. Avoid calling addObserver or addWeakObserver from within Observer#onUpdate method.");
            }
            this.c.put(crzpVar, new crzr<>(crzpVar, executor));
        } finally {
            this.b.writeLock().unlock();
        }
    }

    @Override // defpackage.crzm
    public final void a(crzp<V> crzpVar, Executor executor) {
        i();
        m(crzpVar, executor);
    }

    @Override // defpackage.crzm
    public final void b(crzp<V> crzpVar, Executor executor) {
        a(crzz.b(crzpVar), executor);
    }

    @Override // defpackage.crzm
    public final void c(crzp<V> crzpVar) {
        dbsk.s(crzpVar);
        this.b.writeLock().lock();
        try {
            crzr<V> crzrVar = this.c.get(crzpVar);
            if (crzrVar == null) {
                throw new IllegalArgumentException("removeObserver can only be called after addObserver is called");
            }
            if (!this.d.get().booleanValue()) {
                crzrVar.b = true;
                this.c.remove(crzpVar);
                return;
            }
            throw new ConcurrentModificationException("Failed to remove Observer. Avoid calling removeObserver from within Observer#onUpdate method.");
        } finally {
            this.b.writeLock().unlock();
        }
    }

    @Override // defpackage.crzm
    public final void d(crzp<V> crzpVar, Executor executor) {
        i();
        this.b.writeLock().lock();
        try {
            m(crzpVar, executor);
            crzr<V> crzrVar = this.c.get(crzpVar);
            this.b.writeLock().unlock();
            if (!j().isDone() || crzrVar == null) {
                return;
            }
            crzrVar.a(this);
        } catch (Throwable th) {
            this.b.writeLock().unlock();
            throw th;
        }
    }

    @Override // defpackage.crzm
    public final void e(crzp<V> crzpVar, Executor executor) {
        d(crzz.b(crzpVar), executor);
    }

    @Override // defpackage.crzm
    public final int f() {
        this.b.readLock().lock();
        try {
            return this.c.size();
        } finally {
            this.b.readLock().unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g() {
        dbsk.l(!this.d.get().booleanValue());
        this.b.readLock().lock();
        try {
            ArrayList arrayList = null;
            for (Map.Entry<crzp<V>, crzr<V>> entry : this.c.entrySet()) {
                crzp<V> key = entry.getKey();
                if (key instanceof crzz) {
                    crzz crzzVar = (crzz) key;
                    if (((crzp) crzzVar.a.get()) == null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(crzzVar);
                    }
                }
                this.a.get().a.offer(entry.getValue());
            }
            if (arrayList != null) {
                this.b.writeLock().lock();
                try {
                    this.c.keySet().removeAll(arrayList);
                } finally {
                    this.b.writeLock().unlock();
                }
            }
            crzk<V> crzkVar = this.a.get();
            while (true) {
                crzr<V> poll = crzkVar.a.poll();
                if (poll == null) {
                    return;
                }
                poll.a(crzkVar.b);
            }
        } finally {
            this.b.readLock().unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(boolean z) {
        this.d.set(Boolean.valueOf(z));
    }

    protected void i() {
    }
}
