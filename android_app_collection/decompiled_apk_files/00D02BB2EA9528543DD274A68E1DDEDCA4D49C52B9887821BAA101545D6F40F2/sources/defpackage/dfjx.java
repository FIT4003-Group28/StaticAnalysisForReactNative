package defpackage;

import android.content.Context;
import com.google.geo.ar.arlo.api.exception.ArloStatusException;
import com.google.geo.ar.arlo.api.jni.ArloSessionJniImpl;
import com.google.geo.ar.arlo.api.jni.AssetFetcherJni;
import com.google.geo.ar.arlo.api.jni.ExplorationManagerJniImpl;
import com.google.geo.ar.arlo.api.jni.LocalizationStateManagerJniImpl;
import com.google.geo.ar.arlo.api.jni.SituationalAwarenessJniImpl;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: PG */
/* renamed from: dfjx  reason: default package */
/* loaded from: classes6.dex */
public final class dfjx implements dfei {
    static final dffq a;
    private static final dcdn<Integer, dfek> k = dcdn.m(2, dfek.BACKGROUND, 3, dfek.FOREGROUND, 4, dfek.VSYNC);
    public final long b;
    public final dfez<dffq> c;
    public final dbsg<dbi> d;
    public final AtomicReference<dfjw> f;
    public final dfew g;
    public final dfkm j;
    private final dbsg<AssetFetcherJni> l;
    private final dffb m;
    private final dfjy n;
    private final dfka o;
    private final dfkc p;
    private final dfkg q;
    private final dfev r;
    private final Executor s;
    private final dfjv t;
    @dzsi
    private dfkp u;
    public final ReadWriteLock e = new ReentrantReadWriteLock();
    public final Object h = new Object();
    public final Set<dfeh> i = Collections.newSetFromMap(new WeakHashMap());

    static {
        dffp bZ = dffq.c.bZ();
        drtd bZ2 = drte.g.bZ();
        int i = drtc.UNAVAILABLE.s;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        drte drteVar = (drte) bZ2.b;
        int i2 = drteVar.a | 1;
        drteVar.a = i2;
        drteVar.b = i;
        drteVar.a = i2 | 2;
        drteVar.c = "generic";
        drte drteVar2 = (drte) bZ2.b;
        drteVar2.a |= 4;
        drteVar2.d = "Unavailable";
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dffq dffqVar = (dffq) bZ.b;
        drte bK = bZ2.bK();
        bK.getClass();
        dffqVar.b = bK;
        dffqVar.a = 2;
        a = bZ.bK();
    }

    public dfjx(Context context, dfkm dfkmVar, dbsg dbsgVar, long j, Executor executor, dfir dfirVar, dbsg dbsgVar2, dffb dffbVar, dfez dfezVar) {
        this.j = dfkmVar;
        this.l = dbsgVar;
        this.b = j;
        this.m = dffbVar;
        this.s = executor;
        this.d = dbsgVar2;
        this.c = dfezVar;
        this.t = new dfjv(executor);
        long nativeCreateArloSession = ArloSessionJniImpl.nativeCreateArloSession(context, getClass().getClassLoader(), context.getAssets(), dfirVar.bS(), (AssetFetcherJni) dbsgVar.f());
        this.g = new dfew(dfjx.class, nativeCreateArloSession);
        this.n = new dfjy(ArloSessionJniImpl.nativeGetArloViewBridgePointer(nativeCreateArloSession), new dfjm(this));
        this.o = new dfka(ArloSessionJniImpl.nativeGetLocalizationStateManagerPointer(nativeCreateArloSession), executor);
        this.p = new dfkc(ArloSessionJniImpl.nativeGetSituationalAwarenessPointer(nativeCreateArloSession), executor);
        this.q = new dfkg(ArloSessionJniImpl.nativeGetTextureRegistryPointer(nativeCreateArloSession));
        this.r = new dfev(ArloSessionJniImpl.nativeGetExplorationManagerPointer(nativeCreateArloSession), executor);
        this.f = new AtomicReference<>(dfjw.CREATE_PENDING);
        dfkmVar.a.execute(new Runnable(this) { // from class: dfjn
            private final dfjx a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ReadWriteLock readWriteLock;
                dfjx dfjxVar = this.a;
                dfej.a(dfjxVar.j);
                if (dfjxVar.f.get() != dfjw.CREATE_PENDING) {
                    return;
                }
                dfjxVar.e.readLock().lock();
                try {
                    try {
                        ArloSessionJniImpl.nativeInitialize(dfjxVar.g.b(), dfjxVar.b);
                        dfjxVar.f.compareAndSet(dfjw.CREATE_PENDING, dfjw.CREATED);
                        readWriteLock = dfjxVar.e;
                    } catch (ArloStatusException e) {
                        dfjxVar.k(e);
                        readWriteLock = dfjxVar.e;
                    }
                    readWriteLock.readLock().unlock();
                } catch (Throwable th) {
                    dfjxVar.e.readLock().unlock();
                    throw th;
                }
            }
        });
    }

    public static void m() {
        synchronized (dffa.c) {
            if (!dffa.b) {
                dffa.a = "gmm-jni";
            } else {
                throw new IllegalStateException("setLibraryName was called after the Arlo library had already been loaded. LibraryName argument was: gmm-jni");
            }
        }
    }

    private final dfeh n() {
        return dfja.a(0L, this.s, this.q);
    }

    @Override // defpackage.dfei
    public final void a(dfeq<dffq> dfeqVar) {
        this.c.a(dfeqVar);
    }

    @Override // defpackage.dfei
    public final dfeo b() {
        return this.o;
    }

    @Override // defpackage.dfei
    public final dfeh c() {
        if (this.f.get().a()) {
            return n();
        }
        if (this.e.readLock().tryLock()) {
            if (!this.f.get().a()) {
                try {
                    long nativeCreateScene = ArloSessionJniImpl.nativeCreateScene(this.g.b());
                    this.e.readLock().unlock();
                    dfiz a2 = dfja.a(nativeCreateScene, this.s, this.q);
                    synchronized (this.h) {
                        this.i.add(a2);
                    }
                    return a2;
                } catch (Throwable th) {
                    this.e.readLock().unlock();
                    throw th;
                }
            }
            return n();
        }
        return n();
    }

    @Override // defpackage.dfei
    public final void d() {
        if (this.f.compareAndSet(dfjw.CREATE_PENDING, dfjw.DESTROY_PENDING) || this.f.compareAndSet(dfjw.CREATED, dfjw.DESTROY_PENDING)) {
            dfjy dfjyVar = this.n;
            synchronized (dfjyVar.a) {
                dfjyVar.b.a();
            }
            dfev dfevVar = this.r;
            synchronized (dfevVar.a) {
                dfew dfewVar = dfevVar.e;
                if (dfewVar != null && !dfewVar.c()) {
                    dffd dffdVar = dfevVar.c;
                    ExplorationManagerJniImpl.nativeRemoveExplorationStateObserver(dfevVar.e.b());
                    dfevVar.e.a();
                }
                dfevVar.e = null;
                dfevVar.b.a();
            }
            dfka dfkaVar = this.o;
            synchronized (dfkaVar.a) {
                dfew dfewVar2 = dfkaVar.c;
                if (dfewVar2 != null && !dfewVar2.c()) {
                    dffg dffgVar = dfkaVar.d;
                    LocalizationStateManagerJniImpl.nativeRemoveObserver(dfkaVar.c.b());
                    dfkaVar.c.a();
                }
                dfkaVar.c = null;
                dfkaVar.b.a();
            }
            dfkc dfkcVar = this.p;
            synchronized (dfkcVar.a) {
                dfew dfewVar3 = dfkcVar.e;
                if (dfewVar3 != null && !dfewVar3.c()) {
                    dffj dffjVar = dfkcVar.c;
                    SituationalAwarenessJniImpl.nativeRemoveObserver(dfkcVar.e.b());
                    dfkcVar.e.a();
                }
                dfkcVar.e = null;
                dfkcVar.b.a();
            }
            dfkg dfkgVar = this.q;
            synchronized (dfkgVar.a) {
                dfkgVar.b.a();
            }
            this.j.a.execute(new Runnable(this) { // from class: dfjr
                private final dfjx a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    dfjx dfjxVar = this.a;
                    dfej.a(dfjxVar.j);
                    dfjxVar.j.e(null);
                    dfjxVar.e.writeLock().lock();
                    try {
                        dfjxVar.g.d();
                        ArloSessionJniImpl.nativeDestroy(dfjxVar.g.b());
                        dfjxVar.g.a();
                        dfjxVar.f.set(dfjw.DESTROYED);
                        dfjxVar.e.writeLock().unlock();
                        ((dbi) ((dbsu) dfjxVar.d).a).a.c();
                    } catch (Throwable th) {
                        dfjxVar.e.writeLock().unlock();
                        throw th;
                    }
                }
            });
        }
    }

    @Override // defpackage.dfei
    public final void e(final dcc dccVar) {
        dfjv dfjvVar = this.t;
        synchronized (dfjvVar.a) {
            if (!dfjvVar.c.add(dccVar)) {
                return;
            }
            final ArloStatusException arloStatusException = dfjvVar.d;
            if (arloStatusException == null) {
                return;
            }
            dfjvVar.b.execute(new Runnable(dccVar, arloStatusException) { // from class: dfjt
                private final ArloStatusException a;
                private final dcc b;

                {
                    this.b = dccVar;
                    this.a = arloStatusException;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.b.a(this.a);
                }
            });
        }
    }

    @Override // defpackage.dfei
    public final void f(dcc dccVar) {
        dfjv dfjvVar = this.t;
        synchronized (dfjvVar.a) {
            dfjvVar.c.remove(dccVar);
        }
    }

    @Override // defpackage.dfei
    public final void g(@dzsi dfkp dfkpVar) {
        synchronized (this.h) {
            dfkp dfkpVar2 = this.u;
            if (dfkpVar2 != dfkpVar) {
                if (dfkpVar2 != null) {
                    dfkpVar2.setArloViewBridge(null);
                }
                this.u = dfkpVar;
                if (dfkpVar != null) {
                    dfkpVar.setArloViewBridge(this.n);
                }
                this.j.a.execute(new Runnable(this) { // from class: dfjq
                    private final dfjx a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.l();
                    }
                });
            }
        }
    }

    @Override // defpackage.dfei
    public final void h(final int i) {
        this.j.a.execute(new Runnable(this, i) { // from class: dfjo
            private final dfjx a;
            private final int b;

            {
                this.a = this;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dfjx dfjxVar = this.a;
                int i2 = this.b;
                dfej.a(dfjxVar.j);
                if (dfjxVar.f.get().a()) {
                    return;
                }
                dfjxVar.e.readLock().lock();
                try {
                    try {
                        int nativeGetSessionState = ArloSessionJniImpl.nativeGetSessionState(dfjxVar.g.b());
                        ArloSessionJniImpl.nativeSetSessionState(dfjxVar.g.b(), i2 - 1);
                        dfjxVar.e.readLock().unlock();
                        boolean z = false;
                        boolean z2 = nativeGetSessionState != 0;
                        if (i2 == 1) {
                            z = true;
                        }
                        boolean z3 = !z;
                        if (z2 != z3) {
                            dfjxVar.j.e(z3 ? new dfjp(dfjxVar) : null);
                            if (!z3) {
                                dfjxVar.c.c(dfjx.a);
                            }
                        }
                        dfjxVar.l();
                    } catch (ArloStatusException e) {
                        dfjxVar.k(e);
                        dfjxVar.e.readLock().unlock();
                    }
                } catch (Throwable th) {
                    dfjxVar.e.readLock().unlock();
                    throw th;
                }
            }
        });
    }

    @Override // defpackage.dfei
    public final dfkc i() {
        return this.p;
    }

    @Override // defpackage.dfei
    public final void j() {
    }

    public final void k(final ArloStatusException arloStatusException) {
        d();
        dfjv dfjvVar = this.t;
        synchronized (dfjvVar.a) {
            dfjvVar.d = arloStatusException;
            for (final dcc dccVar : dfjvVar.c) {
                dfjvVar.b.execute(new Runnable(dccVar, arloStatusException) { // from class: dfju
                    private final ArloStatusException a;
                    private final dcc b;

                    {
                        this.b = dccVar;
                        this.a = arloStatusException;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.b.a(this.a);
                    }
                });
            }
        }
    }

    public final void l() {
        dfkp dfkpVar;
        dfek orDefault;
        dfej.a(this.j);
        if (this.f.get().a()) {
            return;
        }
        this.e.readLock().lock();
        try {
            int nativeGetSessionState = ArloSessionJniImpl.nativeGetSessionState(this.g.b());
            this.e.readLock().unlock();
            synchronized (this.h) {
                dfkpVar = this.u;
            }
            if (nativeGetSessionState == 0) {
                orDefault = dfek.NONE;
            } else if (dfkpVar != null) {
                orDefault = dfek.VSYNC;
            } else {
                orDefault = k.getOrDefault(Integer.valueOf(nativeGetSessionState), dfek.NONE);
            }
            dfkm dfkmVar = this.j;
            synchronized (dfkmVar.c) {
                if (dfkmVar.d == orDefault) {
                    return;
                }
                dfkmVar.d = orDefault;
                dfkmVar.c(dfkmVar.b);
            }
        } catch (Throwable th) {
            this.e.readLock().unlock();
            throw th;
        }
    }
}
