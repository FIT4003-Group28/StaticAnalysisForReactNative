package defpackage;

import android.database.Cursor;
import android.os.Looper;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: PG */
/* renamed from: bks  reason: default package */
/* loaded from: classes2.dex */
public abstract class bks {
    public Executor a;
    public blr b;
    public final bkp c;
    public boolean d;
    @Deprecated
    public List e;
    protected final Map f;
    public final Map g;
    @Deprecated
    public volatile blv h;
    public lb i;
    private final ReentrantReadWriteLock j = new ReentrantReadWriteLock();
    private final ThreadLocal k = new ThreadLocal();

    public bks() {
        DesugarCollections.synchronizedMap(new HashMap());
        this.c = a();
        this.g = new HashMap();
        this.f = new HashMap();
    }

    public static final Object l(Class cls, blr blrVar) {
        if (cls.isInstance(blrVar)) {
            return blrVar;
        }
        return null;
    }

    protected abstract bkp a();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract blr b(bkl bklVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Lock c() {
        return this.j.readLock();
    }

    public final void d() {
        if (this.d || Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
    }

    public final void e() {
        if (i() || this.k.get() == null) {
            return;
        }
        throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
    }

    @Deprecated
    public final void f() {
        d();
        d();
        blv a = this.b.a();
        this.c.a(a);
        if (!a.a.isWriteAheadLoggingEnabled()) {
            a.d();
        } else {
            a.e();
        }
    }

    public final void g() {
        this.b.a().f();
        if (!i()) {
            bkp bkpVar = this.c;
            if (!bkpVar.d.compareAndSet(false, true)) {
                return;
            }
            lb lbVar = bkpVar.j;
            bkpVar.c.a.execute(bkpVar.h);
        }
    }

    @Deprecated
    public final void h() {
        this.b.a().h();
    }

    public final boolean i() {
        return this.b.a().i();
    }

    public final bmb j(String str) {
        d();
        e();
        return this.b.a().k(str);
    }

    public final Cursor k(blt bltVar) {
        d();
        e();
        return this.b.a().a(bltVar);
    }
}
