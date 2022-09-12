package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aikf  reason: default package */
/* loaded from: classes2.dex */
public final class aikf {
    public final aikc a;
    public final cjqy b;
    public final cqat c;
    public long f;
    public boolean g;
    public boolean h;
    public final ReentrantReadWriteLock i = new ReentrantReadWriteLock();
    public final List<doel> d = new ArrayList();
    public final Set<aikg> e = new HashSet();

    public aikf(aikc aikcVar, cjqy cjqyVar, cqat cqatVar) {
        this.a = aikcVar;
        this.b = cjqyVar;
        this.c = cqatVar;
    }

    public final boolean a() {
        this.i.readLock().lock();
        try {
            boolean isEmpty = this.e.isEmpty();
            this.i.readLock().unlock();
            return !isEmpty;
        } catch (Throwable th) {
            this.i.readLock().unlock();
            throw th;
        }
    }

    public final boolean b(aikg aikgVar) {
        this.i.readLock().lock();
        try {
            return this.e.contains(aikgVar);
        } finally {
            this.i.readLock().unlock();
        }
    }

    public final doel c(boolean z) {
        long e = this.c.e();
        doel bZ = doem.f.bZ();
        this.d.add(bZ);
        String s = this.a.g().s();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        doem doemVar = (doem) bZ.b;
        s.getClass();
        doemVar.a |= 1;
        doemVar.b = s;
        long A = this.a.g().A(this.c.b());
        long j = e - this.f;
        int c = decr.c(TimeUnit.MILLISECONDS.toSeconds(A - j));
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        doem doemVar2 = (doem) bZ.b;
        doemVar2.a |= 4;
        doemVar2.d = c;
        if (z) {
            int c2 = decr.c(j);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            doem doemVar3 = (doem) bZ.b;
            doemVar3.a |= 8;
            doemVar3.e = c2;
        }
        return bZ;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(aikg aikgVar) {
        int i;
        this.i.writeLock().lock();
        try {
            if (!a()) {
                this.a.g().q();
                this.f = this.c.e();
                doel c = c(false);
                if (this.g) {
                    i = 11;
                } else {
                    i = this.h ? 1 : 4;
                }
                if (c.c) {
                    c.bF();
                    c.c = false;
                }
                doem doemVar = (doem) c.b;
                doem doemVar2 = doem.f;
                doemVar.c = i;
                doemVar.a |= 2;
            }
            this.e.add(aikgVar);
        } finally {
            this.i.writeLock().unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(boolean z) {
        this.i.writeLock().lock();
        try {
            if (a()) {
                doel c = c(true);
                if (z) {
                    if (c.c) {
                        c.bF();
                        c.c = false;
                    }
                    doem doemVar = (doem) c.b;
                    doem doemVar2 = doem.f;
                    doemVar.c = 5;
                    doemVar.a |= 2;
                } else {
                    if (c.c) {
                        c.bF();
                        c.c = false;
                    }
                    doem doemVar3 = (doem) c.b;
                    doem doemVar4 = doem.f;
                    doemVar3.c = 6;
                    doemVar3.a |= 2;
                }
                this.f = this.c.e();
            }
        } finally {
            this.i.writeLock().unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(aikg aikgVar) {
        this.i.writeLock().lock();
        try {
            boolean a = a();
            this.e.remove(aikgVar);
            if (a && !a()) {
                this.a.g().q();
                doel c = c(true);
                if (c.c) {
                    c.bF();
                    c.c = false;
                }
                doem doemVar = (doem) c.b;
                doem doemVar2 = doem.f;
                doemVar.c = 9;
                doemVar.a |= 2;
            }
        } finally {
            this.i.writeLock().unlock();
        }
    }
}
