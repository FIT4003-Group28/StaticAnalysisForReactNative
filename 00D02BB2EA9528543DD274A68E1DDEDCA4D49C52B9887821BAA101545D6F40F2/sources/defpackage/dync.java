package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dync  reason: default package */
/* loaded from: classes6.dex */
public final class dync implements dysm {
    public final dyji b;
    public Runnable c;
    public Runnable d;
    public Runnable e;
    public dysl f;
    public dyjb h;
    private final Executor j;
    @dzsi
    private dyhd k;
    private long l;
    private final dygo i = dygo.a(dync.class, null);
    public final Object a = new Object();
    public Collection<dynb> g = new LinkedHashSet();

    public dync(Executor executor, dyji dyjiVar) {
        this.j = executor;
        this.b = dyjiVar;
    }

    private final dynb g(dygz dygzVar) {
        int size;
        dynb dynbVar = new dynb(this, dygzVar);
        this.g.add(dynbVar);
        synchronized (this.a) {
            size = this.g.size();
        }
        if (size == 1) {
            this.b.b(this.c);
        }
        return dynbVar;
    }

    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            z = !this.g.isEmpty();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(@dzsi dyhd dyhdVar) {
        Runnable runnable;
        synchronized (this.a) {
            this.k = dyhdVar;
            this.l++;
            if (dyhdVar != null && a()) {
                ArrayList arrayList = new ArrayList(this.g);
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    dynb dynbVar = (dynb) arrayList.get(i);
                    dygz dygzVar = dynbVar.a;
                    dygy a = dyhdVar.a();
                    dyet dyetVar = ((dytf) dynbVar.a).a;
                    dylv h = dyow.h(a, dyetVar.f());
                    if (h != null) {
                        Executor executor = this.j;
                        Executor executor2 = dyetVar.c;
                        if (executor2 != null) {
                            executor = executor2;
                        }
                        executor.execute(new dyna(dynbVar, h));
                        arrayList2.add(dynbVar);
                    }
                }
                synchronized (this.a) {
                    if (!a()) {
                        return;
                    }
                    this.g.removeAll(arrayList2);
                    if (this.g.isEmpty()) {
                        this.g = new LinkedHashSet();
                    }
                    if (!a()) {
                        this.b.b(this.d);
                        if (this.h != null && (runnable = this.e) != null) {
                            this.b.b(runnable);
                            this.e = null;
                        }
                    }
                    this.b.a();
                }
            }
        }
    }

    @Override // defpackage.dysm
    public final Runnable c(dysl dyslVar) {
        throw null;
    }

    @Override // defpackage.dylv
    public final dyls d(dyib<?, ?> dyibVar, dyhw dyhwVar, dyet dyetVar) {
        dyls dyohVar;
        dyji dyjiVar;
        try {
            dytf dytfVar = new dytf(dyibVar, dyhwVar, dyetVar);
            dyhd dyhdVar = null;
            long j = -1;
            while (true) {
                synchronized (this.a) {
                    dyjb dyjbVar = this.h;
                    if (dyjbVar == null) {
                        dyhd dyhdVar2 = this.k;
                        if (dyhdVar2 != null) {
                            if (dyhdVar != null && j == this.l) {
                                dyohVar = g(dytfVar);
                                dyjiVar = this.b;
                                break;
                            }
                            j = this.l;
                            dylv h = dyow.h(dyhdVar2.a(), dyetVar.f());
                            if (h != null) {
                                dyohVar = h.d(dytfVar.c, dytfVar.b, dytfVar.a);
                                dyjiVar = this.b;
                                break;
                            }
                            dyhdVar = dyhdVar2;
                        } else {
                            dyohVar = g(dytfVar);
                            dyjiVar = this.b;
                            break;
                        }
                    } else {
                        dyohVar = new dyoh(dyjbVar);
                        dyjiVar = this.b;
                        break;
                    }
                }
            }
            dyjiVar.a();
            return dyohVar;
        } catch (Throwable th) {
            this.b.a();
            throw th;
        }
    }

    @Override // defpackage.dysm
    public final void e(dyjb dyjbVar) {
        Runnable runnable;
        synchronized (this.a) {
            if (this.h != null) {
                return;
            }
            this.h = dyjbVar;
            this.b.b(new dymz(this, dyjbVar));
            if (!a() && (runnable = this.e) != null) {
                this.b.b(runnable);
                this.e = null;
            }
            this.b.a();
        }
    }

    @Override // defpackage.dysm
    public final void f(dyjb dyjbVar) {
        Collection<dynb> collection;
        Runnable runnable;
        e(dyjbVar);
        synchronized (this.a) {
            collection = this.g;
            runnable = this.e;
            this.e = null;
            if (!collection.isEmpty()) {
                this.g = Collections.emptyList();
            }
        }
        if (runnable != null) {
            for (dynb dynbVar : collection) {
                dynbVar.e(dyjbVar);
            }
            this.b.execute(runnable);
        }
    }

    @Override // defpackage.dygs
    public final dygo k() {
        return this.i;
    }
}
