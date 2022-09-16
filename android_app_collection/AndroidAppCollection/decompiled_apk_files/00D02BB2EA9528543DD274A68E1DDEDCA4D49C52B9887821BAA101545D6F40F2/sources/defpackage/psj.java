package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: psj  reason: default package */
/* loaded from: classes7.dex */
public final class psj implements brlm {
    final /* synthetic */ psk a;
    private final int b;

    public psj(psk pskVar, int i) {
        this.a = pskVar;
        this.b = i;
    }

    @Override // defpackage.brlm
    public final void a(brln brlnVar) {
        if (brlnVar != this.a.c) {
            brlnVar.j();
            return;
        }
        brlnVar.j();
        this.a.c = null;
        brlu brluVar = brlnVar.e;
        cjqn d = this.a.j.d();
        this.a.j.e(brluVar);
        this.a.j.b(brlnVar, brluVar.d);
        int d2 = brluVar.d();
        if (d2 == 0) {
            this.a.k.d(brlnVar.b().c);
        } else if (d2 == 1) {
            this.a.k.c(brluVar.A().d(), this.b);
        } else {
            this.a.k.b();
            bral g = bram.g(bwrs.a(brlnVar), this.a.a);
            g.c(d);
            g.b(false);
            this.a.i.a().E(g.a());
        }
    }

    @Override // defpackage.brlm
    public final void b(brln brlnVar, bttq bttqVar) {
        psk pskVar = this.a;
        if (brlnVar != pskVar.c) {
            brlnVar.j();
            return;
        }
        pskVar.j.c(brlnVar);
        this.a.c = null;
        this.a.k.e();
    }

    @Override // defpackage.brlm
    public final void c(brln brlnVar) {
        psk pskVar = this.a;
        if (brlnVar != pskVar.c) {
            brlnVar.j();
            return;
        }
        pskVar.c = null;
        this.a.k.f();
    }
}
