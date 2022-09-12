package defpackage;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: PG */
/* renamed from: brny  reason: default package */
/* loaded from: classes4.dex */
public final class brny {
    private final btnc<akqi, broa> e;
    private final dehq f;
    @dzsi
    private dehu g;
    public final ReadWriteLock a = new ReentrantReadWriteLock();
    public final AtomicBoolean d = new AtomicBoolean(true);
    public final crzo<brob> b = new crzo<>(brob.a);
    public final Set<akqi> c = new HashSet();

    public brny(btmv btmvVar, dehq dehqVar) {
        this.e = new btnc<>(500, btmz.OTHER, btmvVar);
        this.f = dehqVar;
    }

    public final void a(broa broaVar) {
        this.e.Pz(broaVar.a(), broaVar);
        f();
    }

    @dzsi
    public final broa b(akqi akqiVar) {
        return this.e.a(akqiVar);
    }

    public final dcdc<broa> c() {
        this.a.readLock().lock();
        try {
            return dcbg.b(this.c).s(new dbrn(this) { // from class: brnw
                private final brny a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    broa b = this.a.b((akqi) obj);
                    dbsk.t(b, "Invalid visible result index");
                    return b;
                }
            }).z();
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void d() {
        this.a.writeLock().lock();
        try {
            this.c.clear();
            this.a.writeLock().unlock();
            f();
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public final void e(boolean z) {
        if (this.d.compareAndSet(!z, z)) {
            if (z) {
                d();
            }
            f();
        }
    }

    public final void f() {
        dehu dehuVar = this.g;
        if (dehuVar != null) {
            dehuVar.cancel(true);
        }
        this.g = this.f.d(new Runnable(this) { // from class: brnx
            private final brny a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                float size;
                brob c;
                brny brnyVar = this.a;
                crzo<brob> crzoVar = brnyVar.b;
                if (brnyVar.d.get()) {
                    c = brob.a;
                } else {
                    boolean z = !brnyVar.c.isEmpty();
                    brnyVar.a.readLock().lock();
                    try {
                        if (brnyVar.c.isEmpty()) {
                            brnyVar.a.readLock().unlock();
                            size = 0.0f;
                        } else {
                            dcpe<broa> listIterator = brnyVar.c().listIterator();
                            int i = 0;
                            while (listIterator.hasNext()) {
                                if (listIterator.next().d() != null) {
                                    i++;
                                }
                            }
                            size = i / brnyVar.c.size();
                        }
                        c = brob.c(z, size, brnyVar.c.hashCode());
                    } finally {
                        brnyVar.a.readLock().unlock();
                    }
                }
                crzoVar.b(c);
            }
        }, 20L, TimeUnit.MILLISECONDS);
    }
}
