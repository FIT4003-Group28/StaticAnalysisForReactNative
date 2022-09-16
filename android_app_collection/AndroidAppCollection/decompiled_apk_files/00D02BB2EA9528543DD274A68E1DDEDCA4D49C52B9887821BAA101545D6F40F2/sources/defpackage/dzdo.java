package defpackage;
/* compiled from: PG */
/* renamed from: dzdo  reason: default package */
/* loaded from: classes6.dex */
final class dzdo<T> implements dyzw, dzak {
    final dyzw<? super T> a;
    boolean b;
    dzak c;
    long d = 1;

    public dzdo(dyzw<? super T> dyzwVar) {
        this.a = dyzwVar;
    }

    @Override // defpackage.dzak
    public final void SQ() {
        this.c.SQ();
    }

    @Override // defpackage.dyzw
    public final void b(dzak dzakVar) {
        if (dzbd.c(this.c, dzakVar)) {
            this.c = dzakVar;
            if (this.d == 0) {
                this.b = true;
                dzakVar.SQ();
                dyzw<? super T> dyzwVar = this.a;
                dyzwVar.b(dzbe.INSTANCE);
                dyzwVar.e();
                return;
            }
            this.a.b(this);
        }
    }

    @Override // defpackage.dyzw
    public final void c(T t) {
        if (!this.b) {
            long j = this.d;
            long j2 = (-1) + j;
            this.d = j2;
            if (j <= 0) {
                return;
            }
            this.a.c(t);
            if (j2 != 0) {
                return;
            }
            e();
        }
    }

    @Override // defpackage.dyzw
    public final void d(Throwable th) {
        if (this.b) {
            dzfy.a(th);
            return;
        }
        this.b = true;
        this.c.SQ();
        this.a.d(th);
    }

    @Override // defpackage.dyzw
    public final void e() {
        if (!this.b) {
            this.b = true;
            this.c.SQ();
            this.a.e();
        }
    }
}
