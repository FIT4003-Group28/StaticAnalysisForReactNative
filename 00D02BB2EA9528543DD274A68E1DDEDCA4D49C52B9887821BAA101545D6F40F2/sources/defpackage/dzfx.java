package defpackage;
/* compiled from: PG */
/* renamed from: dzfx  reason: default package */
/* loaded from: classes6.dex */
public final class dzfx<T> implements dyzw, dzak {
    final dyzw<? super T> a;
    dzak b;
    boolean c;
    dzfl<Object> d;
    volatile boolean e;

    public dzfx(dyzw<? super T> dyzwVar) {
        this.a = dyzwVar;
    }

    @Override // defpackage.dzak
    public final void SQ() {
        this.b.SQ();
    }

    @Override // defpackage.dyzw
    public final void b(dzak dzakVar) {
        if (dzbd.c(this.b, dzakVar)) {
            this.b = dzakVar;
            this.a.b(this);
        }
    }

    @Override // defpackage.dyzw
    public final void c(T t) {
        Object[] objArr;
        if (this.e) {
            return;
        }
        if (t == null) {
            this.b.SQ();
            d(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            if (this.e) {
                return;
            }
            if (this.c) {
                dzfl<Object> dzflVar = this.d;
                if (dzflVar == null) {
                    dzflVar = new dzfl<>();
                    this.d = dzflVar;
                }
                dzfr dzfrVar = dzfr.a;
                dzflVar.a(t);
                return;
            }
            this.c = true;
            this.a.c(t);
            while (true) {
                synchronized (this) {
                    dzfl<Object> dzflVar2 = this.d;
                    if (dzflVar2 == null) {
                        this.c = false;
                        return;
                    }
                    this.d = null;
                    dyzw<? super T> dyzwVar = this.a;
                    for (Object[] objArr2 = dzflVar2.a; objArr2 != null; objArr2 = objArr2[4]) {
                        for (int i = 0; i < 4 && (objArr = objArr2[i]) != null; i++) {
                            if (dzfr.c(objArr, dyzwVar)) {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.dyzw
    public final void d(Throwable th) {
        if (this.e) {
            dzfy.a(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.e) {
                if (this.c) {
                    this.e = true;
                    dzfl<Object> dzflVar = this.d;
                    if (dzflVar == null) {
                        dzflVar = new dzfl<>();
                        this.d = dzflVar;
                    }
                    dzflVar.b(dzfr.a(th));
                    return;
                }
                this.e = true;
                this.c = true;
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
        if (this.e) {
            return;
        }
        synchronized (this) {
            if (this.e) {
                return;
            }
            if (this.c) {
                dzfl<Object> dzflVar = this.d;
                if (dzflVar == null) {
                    dzflVar = new dzfl<>();
                    this.d = dzflVar;
                }
                dzflVar.a(dzfr.a);
                return;
            }
            this.e = true;
            this.c = true;
            this.a.e();
        }
    }
}
