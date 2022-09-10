package defpackage;

import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: PG */
/* renamed from: btrq  reason: default package */
/* loaded from: classes.dex */
public final class btrq implements btrm {
    private static final dcqe a = dcqe.c("btrq");
    private final btrt e;
    private final btrv f;
    private final ckoq j;
    private final dcna<Class<?>, btrs> b = dccg.O();
    private final Map<Object, dcdc<btrs>> c = dcjz.d();
    private final ReadWriteLock d = new ReentrantReadWriteLock();
    private final ThreadLocal<Queue<btrp>> g = new btrn();
    private final ThreadLocal<Boolean> h = new btro();
    private volatile boolean i = false;

    public btrq(bvrb bvrbVar, ckoq ckoqVar) {
        int i = btrl.a;
        this.e = new btrt(this);
        this.f = new btrv(bvrbVar);
        this.j = ckoqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void j(Object obj, btrs btrsVar) {
        if (btrsVar.c) {
            return;
        }
        try {
            btrsVar.e(obj);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    private final void k() {
        if (this.h.get().booleanValue()) {
            return;
        }
        this.h.set(true);
        try {
            Queue<btrp> queue = this.g.get();
            while (true) {
                btrp poll = queue.poll();
                if (poll == null) {
                    return;
                }
                j(poll.a, poll.b);
            }
        } finally {
            this.h.remove();
        }
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
    }

    @Override // defpackage.btrm
    public final void a(Object obj) {
        this.d.writeLock().lock();
        try {
            dcdc<btrs> remove = this.c.remove(obj);
            if (remove != null) {
                dcpe<btrs> listIterator = remove.listIterator();
                while (listIterator.hasNext()) {
                    btrs next = listIterator.next();
                    dbsk.l(this.b.G(next.d(), next));
                    dbsk.l(!next.c);
                    next.c = true;
                }
                btrv btrvVar = this.f;
                bvrj a2 = btrvVar.a(obj.getClass(), remove);
                if (a2 != bvrj.CURRENT) {
                    btrvVar.a.f(a2, obj);
                }
                this.d.writeLock().unlock();
                k();
                return;
            }
            bvoo.h("Can't find handler to unregister. Was %s registered?", obj);
        } finally {
            this.d.writeLock().unlock();
        }
    }

    @Override // defpackage.btrm
    public final void b(Object obj) {
        if (!this.i || !obj.getClass().isAnnotationPresent(ckor.class)) {
            d(obj);
        }
    }

    @Override // defpackage.btrm
    public final void d(Object obj) {
        btrj a2 = btrk.a(obj.getClass());
        this.d.readLock().lock();
        try {
            if (!a2.b.isEmpty()) {
                this.e.a(obj, a2.b);
            }
            boolean z = false;
            for (Class<?> cls : a2.a) {
                if (this.b.m(cls)) {
                    for (btrs btrsVar : this.b.c(cls)) {
                        i(obj, btrsVar);
                    }
                    z = true;
                }
            }
            if (!z && !(obj instanceof dcpy)) {
                b(new dcpy(this, obj));
            }
            k();
        } finally {
            this.d.readLock().unlock();
        }
    }

    @Override // defpackage.btrm
    public final void e(Object obj) {
        this.e.b(obj, btrk.a(obj.getClass()).b);
    }

    @Override // defpackage.btrm
    public final synchronized void f() {
        this.i = false;
    }

    @Override // defpackage.btrm
    public final void g(Object obj, dcet<Class<?>, btrs> dcetVar) {
        if (String.valueOf(obj.getClass().getName()).length() == 0) {
            new String("GmmEventBusImpl.fastRegister ");
        }
        try {
            dcdc<btrs> r = dcdc.r(dcetVar.K());
            this.d.writeLock().lock();
            if (this.c.containsKey(obj)) {
                bvoo.h("Tried to register %s twice.", obj);
                this.d.writeLock().unlock();
            } else {
                this.c.put(obj, r);
                this.b.H(dcetVar);
                btrv btrvVar = this.f;
                bvrj a2 = btrvVar.a(obj.getClass(), r);
                if (a2 != bvrj.CURRENT && !btrvVar.a.e(a2, obj)) {
                    throw new IllegalArgumentException(String.format("No executor registered for %s while registering %s", a2, obj));
                }
                this.e.c(dcetVar);
                this.d.writeLock().unlock();
                k();
            }
            if (String.valueOf(obj.getClass().getName()).length() != 0) {
                return;
            }
            new String("GmmEventBusImpl.fastRegister ");
        } catch (Throwable th) {
            if (String.valueOf(obj.getClass().getName()).length() == 0) {
                new String("GmmEventBusImpl.fastRegister ");
            }
            throw th;
        }
    }

    @Override // defpackage.btrm
    public final synchronized void h() {
        if (this.i) {
            return;
        }
        this.i = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(Object obj, btrs btrsVar) {
        btrv btrvVar = this.f;
        bvrj bvrjVar = btrsVar.b;
        if (btrvVar.a.d(bvrjVar)) {
            this.g.get().offer(new btrp(obj, btrsVar));
        } else {
            btrvVar.a.b(new btru(obj, btrsVar), bvrjVar);
        }
    }
}
