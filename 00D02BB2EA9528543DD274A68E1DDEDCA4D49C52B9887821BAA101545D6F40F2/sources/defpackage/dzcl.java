package defpackage;
/* compiled from: PG */
/* renamed from: dzcl  reason: default package */
/* loaded from: classes6.dex */
final class dzcl implements dyzq, dzak {
    final dyzq a;
    dzak b;
    final /* synthetic */ dzcm c;

    public dzcl(dzcm dzcmVar, dyzq dyzqVar) {
        this.c = dzcmVar;
        this.a = dyzqVar;
    }

    @Override // defpackage.dzak
    public final void SQ() {
        this.b.SQ();
    }

    @Override // defpackage.dyzq
    public final void a(dzak dzakVar) {
        if (dzbd.c(this.b, dzakVar)) {
            this.b = dzakVar;
            this.a.a(this);
        }
    }

    @Override // defpackage.dyzq
    public final void b() {
        if (this.b == dzbd.a) {
            return;
        }
        try {
            this.c.b.a();
            this.a.b();
        } catch (Throwable th) {
            dzas.a(th);
            this.a.c(th);
        }
    }

    @Override // defpackage.dyzq
    public final void c(Throwable th) {
        if (this.b != dzbd.a) {
            this.a.c(th);
        } else {
            dzfy.a(th);
        }
    }
}
