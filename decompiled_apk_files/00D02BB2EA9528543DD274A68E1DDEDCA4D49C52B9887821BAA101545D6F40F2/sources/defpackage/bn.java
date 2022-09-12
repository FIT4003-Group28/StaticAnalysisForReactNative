package defpackage;

import android.database.Cursor;
import android.os.Looper;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: PG */
/* renamed from: bn  reason: default package */
/* loaded from: classes3.dex */
public abstract class bn {
    @Deprecated
    public volatile avu a;
    public Executor b;
    public avz c;
    public boolean d;
    boolean e;
    @Deprecated
    public List<bl> f;
    public final Map<Class<?>, Object> g;
    private final bh h;
    private final ReentrantReadWriteLock i = new ReentrantReadWriteLock();
    private final ThreadLocal<Integer> j = new ThreadLocal<>();

    public bn() {
        Collections.synchronizedMap(new HashMap());
        this.h = c();
        this.g = new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Lock A() {
        return this.i.readLock();
    }

    public final boolean B() {
        avu avuVar = this.a;
        return avuVar != null && avuVar.i();
    }

    public final void C() {
        if (B()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.i.writeLock();
            writeLock.lock();
            try {
                bi biVar = this.h.g;
                this.c.close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    public final void D() {
        if (this.d || Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
    }

    public final void E() {
        if (o() || this.j.get() == null) {
            return;
        }
        throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
    }

    @Deprecated
    public final void F() {
        D();
        avu b = this.c.b();
        this.h.a(b);
        if (!b.k()) {
            b.a();
        } else {
            b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract avz b(ba baVar);

    protected abstract bh c();

    /* JADX INFO: Access modifiers changed from: protected */
    public Map<Class<?>, List<Class<?>>> d() {
        return Collections.emptyMap();
    }

    public abstract void e();

    @Deprecated
    public final void k() {
        this.c.b().c();
        if (!o()) {
            bh bhVar = this.h;
            if (!bhVar.d.compareAndSet(false, true)) {
                return;
            }
            bhVar.c.b.execute(bhVar.h);
        }
    }

    @Deprecated
    public final void l() {
        this.c.b().d();
    }

    public final void m(Runnable runnable) {
        F();
        try {
            runnable.run();
            l();
        } finally {
            k();
        }
    }

    public final void n(avu avuVar) {
        bh bhVar = this.h;
        synchronized (bhVar) {
            if (bhVar.e) {
                return;
            }
            avuVar.h("PRAGMA temp_store = MEMORY;");
            avuVar.h("PRAGMA recursive_triggers='ON';");
            avuVar.h("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            bhVar.a(avuVar);
            bhVar.i = avuVar.l("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            bhVar.e = true;
        }
    }

    public final boolean o() {
        return this.c.b().e();
    }

    public final awj p(String str) {
        D();
        E();
        return this.c.b().l(str);
    }

    public final Cursor q(awb awbVar) {
        D();
        E();
        return this.c.b().g(awbVar);
    }
}
