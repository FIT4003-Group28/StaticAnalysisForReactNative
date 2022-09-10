package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzgo  reason: default package */
/* loaded from: classes6.dex */
public final class dzgo<T> extends dzgr<T> implements dzfk {
    final dzgr<T> a;
    boolean b;
    dzfl<Object> c;
    volatile boolean d;

    public dzgo(dzgr<T> dzgrVar) {
        this.a = dzgrVar;
    }

    @Override // defpackage.dzfk, defpackage.dzbb
    public final boolean a(Object obj) {
        return dzfr.c(obj, this.a);
    }

    @Override // defpackage.dyzw
    public final void c(T t) {
        if (this.d) {
            return;
        }
        synchronized (this) {
            if (this.d) {
                return;
            }
            if (this.b) {
                dzfl<Object> dzflVar = this.c;
                if (dzflVar == null) {
                    dzflVar = new dzfl<>();
                    this.c = dzflVar;
                }
                dzfr dzfrVar = dzfr.a;
                dzflVar.a(t);
                return;
            }
            this.b = true;
            this.a.c(t);
            h();
        }
    }

    @Override // defpackage.dyzw
    public final void d(Throwable th) {
        if (this.d) {
            dzfy.a(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.d) {
                this.d = true;
                if (this.b) {
                    dzfl<Object> dzflVar = this.c;
                    if (dzflVar == null) {
                        dzflVar = new dzfl<>();
                        this.c = dzflVar;
                    }
                    dzflVar.b(dzfr.a(th));
                    return;
                }
                this.b = true;
                z = false;
            }
            if (z) {
                dzfy.a(th);
            } else {
                this.a.d(th);
            }
        }
    }

    @Override // defpackage.dyzw
    public final void e() {
        if (this.d) {
            return;
        }
        synchronized (this) {
            if (this.d) {
                return;
            }
            this.d = true;
            if (this.b) {
                dzfl<Object> dzflVar = this.c;
                if (dzflVar == null) {
                    dzflVar = new dzfl<>();
                    this.c = dzflVar;
                }
                dzflVar.a(dzfr.a);
                return;
            }
            this.b = true;
            this.a.e();
        }
    }

    @Override // defpackage.dyzu
    protected final void g(dyzw<? super T> dyzwVar) {
        this.a.f(dyzwVar);
    }

    final void h() {
        dzfl<Object> dzflVar;
        while (true) {
            synchronized (this) {
                dzflVar = this.c;
                if (dzflVar == null) {
                    this.b = false;
                    return;
                }
                this.c = null;
            }
            dzflVar.c(this);
        }
    }

    @Override // defpackage.dyzw
    public final void b(dzak dzakVar) {
        boolean z = true;
        if (!this.d) {
            synchronized (this) {
                if (!this.d) {
                    if (this.b) {
                        dzfl<Object> dzflVar = this.c;
                        if (dzflVar == null) {
                            dzflVar = new dzfl<>();
                            this.c = dzflVar;
                        }
                        dzflVar.a(dzfr.b(dzakVar));
                        return;
                    }
                    this.b = true;
                    z = false;
                }
            }
        }
        if (z) {
            dzakVar.SQ();
            return;
        }
        this.a.b(dzakVar);
        h();
    }
}
