package defpackage;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: PG */
/* renamed from: axyj  reason: default package */
/* loaded from: classes3.dex */
public final class axyj implements axwp, btni {
    private static final dcet<axya, axya> f;
    public final btmv a;
    public final ckcw b;
    public axya e;
    private final btrm h;
    private final dxio<akfa> i;
    private final btmk j;
    public final ReadWriteLock c = new ReentrantReadWriteLock();
    public final dcwg<azxb> d = new dcwg<>();
    private final btnc<azxb, azwv> g = new axyi(this);
    private deig<Boolean> k = deig.d();

    static {
        dceq a = dcet.a();
        a.c(axya.INITIALIZED, axya.LOADING, axya.INVALIDATING);
        a.c(axya.LOADING, axya.LOADED);
        a.c(axya.LOADED, axya.ENTRY_EVICTED, axya.INVALIDATING, axya.LOADING);
        a.c(axya.ENTRY_EVICTED, axya.LOADING, axya.INVALIDATING);
        a.c(axya.INVALIDATING, axya.INVALIDATED);
        a.c(axya.INVALIDATED, axya.LOADING, axya.INVALIDATING);
        f = a.a();
    }

    public axyj(btmv btmvVar, ckcw ckcwVar, btrm btrmVar, dxio<akfa> dxioVar, btml btmlVar) {
        this.a = btmvVar;
        this.h = btrmVar;
        this.i = dxioVar;
        this.b = ckcwVar;
        this.j = btmlVar.a(ckip.W);
    }

    @dzsi
    public static dcwa m(azxb azxbVar) {
        akqq b = azxbVar.b();
        if (b != null) {
            return dcvs.b(b.a, b.b).k();
        }
        return null;
    }

    private final void n() {
        this.h.b(azre.a(this.i.a().j(), this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.axwp
    @dzsi
    public final azwv a(azxb azxbVar) {
        dcwa m;
        this.c.writeLock().lock();
        try {
            if (!k()) {
                ((ckco) this.b.a(ckir.f)).a(ckiq.a(1));
            }
            ((ckcn) this.b.a(ckir.a)).a();
            azwv a = this.g.a(azxbVar);
            if (a != null) {
                this.j.a();
            } else {
                this.j.b();
            }
            if (a == null && !akqi.d(azxbVar.a()) && (m = m(azxbVar)) != null) {
                dcvl dcvlVar = new dcvl(this.d);
                dcvlVar.a = dcuy.h(0.15d);
                dcvk b = dcvlVar.b(m);
                if (b != null) {
                    return this.g.a((azxb) b.b.b);
                }
            }
            return a;
        } finally {
            this.c.writeLock().unlock();
        }
    }

    @Override // defpackage.btni
    public final int b(float f2) {
        ((ckcn) this.b.a(ckir.d)).a();
        return 0;
    }

    @Override // defpackage.btni
    @dzsi
    public final String c() {
        return this.g.c();
    }

    @Override // defpackage.axwp
    public final void d(azxb azxbVar, azwv azwvVar) {
        this.c.writeLock().lock();
        try {
            if (l() != axya.LOADING) {
                if (!k()) {
                    ((ckco) this.b.a(ckir.f)).a(ckiq.a(2));
                }
                ((ckcn) this.b.a(ckir.b)).a();
            }
            dcwa m = m(azxbVar);
            if (m != null) {
                this.d.b(m, azxbVar);
            }
            this.g.Pz(azxbVar, azwvVar);
            this.c.writeLock().unlock();
            if (l() == axya.LOADING) {
                return;
            }
            n();
        } catch (Throwable th) {
            this.c.writeLock().unlock();
            throw th;
        }
    }

    @Override // defpackage.axwp
    public final dcdc<azwv> e() {
        this.c.readLock().lock();
        try {
            if (!k()) {
                ((ckco) this.b.a(ckir.f)).a(ckiq.a(3));
            }
            return dcdc.r(this.g.p());
        } finally {
            this.c.readLock().unlock();
        }
    }

    @Override // defpackage.axwp
    public final void f(Iterable<azwv> iterable) {
        azxb f2;
        this.c.writeLock().lock();
        try {
            j(axya.LOADING);
            h();
            for (azwv azwvVar : iterable) {
                azws m = azwvVar.m();
                if (m != null) {
                    f2 = azxb.g(m.b(), m.c());
                } else {
                    f2 = azxb.f(azwvVar.a(), azwvVar.c());
                }
                d(f2, azwvVar);
            }
            j(axya.LOADED);
            this.c.writeLock().unlock();
            n();
        } catch (Throwable th) {
            this.c.writeLock().unlock();
            throw th;
        }
    }

    @Override // defpackage.axwp
    public final void g(azxb azxbVar) {
        this.c.writeLock().lock();
        try {
            dcwa m = m(azxbVar);
            if (m != null) {
                this.d.e(m, azxbVar);
            }
            this.g.o(azxbVar);
            this.c.writeLock().unlock();
            n();
        } catch (Throwable th) {
            this.c.writeLock().unlock();
            throw th;
        }
    }

    @Override // defpackage.axwp
    public final void h() {
        this.c.writeLock().lock();
        try {
            if (l() != axya.LOADING) {
                j(axya.INVALIDATING);
            }
            this.g.e();
            this.d.c();
            if (l() != axya.LOADING) {
                j(axya.INVALIDATED);
            }
            this.c.writeLock().unlock();
            if (l() == axya.LOADING) {
                return;
            }
            n();
        } catch (Throwable th) {
            this.c.writeLock().unlock();
            throw th;
        }
    }

    @Override // defpackage.axwp
    public final dehn<Boolean> i() {
        this.c.readLock().lock();
        try {
            return this.k;
        } finally {
            this.c.readLock().unlock();
        }
    }

    public final void j(axya axyaVar) {
        ReadWriteLock readWriteLock;
        this.c.writeLock().lock();
        try {
            if (this.e != axyaVar) {
                this.c.readLock().lock();
                if ((this.e == null && axyaVar == axya.INITIALIZED) || f.F(this.e, axyaVar)) {
                    this.c.readLock().unlock();
                    this.e = axyaVar;
                    deig<Boolean> deigVar = this.k;
                    if (deigVar != null && (!deigVar.isDone() || axyaVar != axya.INVALIDATED)) {
                        if (!this.k.isDone() && k()) {
                            this.k.j(true);
                        }
                        readWriteLock = this.c;
                    }
                    this.k = deig.d();
                    readWriteLock = this.c;
                } else {
                    String valueOf = String.valueOf(this.e);
                    String valueOf2 = String.valueOf(axyaVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34 + String.valueOf(valueOf2).length());
                    sb.append("Invalid state transition from ");
                    sb.append(valueOf);
                    sb.append(" to ");
                    sb.append(valueOf2);
                    throw new IllegalStateException(sb.toString());
                }
            } else {
                readWriteLock = this.c;
            }
            readWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            this.c.writeLock().unlock();
            throw th;
        }
    }

    final boolean k() {
        this.c.readLock().lock();
        try {
            boolean z = true;
            if (this.e != axya.LOADED) {
                if (this.e != axya.ENTRY_EVICTED) {
                    z = false;
                }
            }
            return z;
        } finally {
            this.c.readLock().unlock();
        }
    }

    @dzsi
    final axya l() {
        this.c.readLock().lock();
        try {
            return this.e;
        } finally {
            this.c.readLock().unlock();
        }
    }
}
