package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ncq  reason: default package */
/* loaded from: classes7.dex */
public final class ncq implements brlm {
    final /* synthetic */ ncr a;

    public ncq(ncr ncrVar) {
        this.a = ncrVar;
    }

    @Override // defpackage.brlm
    public final void a(brln brlnVar) {
        ncr ncrVar = this.a;
        if (brlnVar != ncrVar.g) {
            return;
        }
        ncrVar.g = null;
        kcz<dcdc<ldm>> kczVar = this.a.h;
        dbsk.s(kczVar);
        this.a.h = null;
        dccx F = dcdc.F();
        brlu brluVar = brlnVar.e;
        int E = brluVar.E();
        for (int i = 0; i != E; i++) {
            broh D = brluVar.D(i);
            if (!D.a()) {
                ilo d = D.d();
                if (d.aj() != null) {
                    F.g(ldm.a(d));
                }
            }
        }
        kczVar.c(F.f(), brluVar.d ? 2 : 3);
    }

    @Override // defpackage.brlm
    public final void b(brln brlnVar, bttq bttqVar) {
        ncr ncrVar = this.a;
        if (brlnVar != ncrVar.g) {
            return;
        }
        ncrVar.g = null;
        kcz<dcdc<ldm>> kczVar = this.a.h;
        dbsk.s(kczVar);
        this.a.h = null;
        kczVar.a(bttqVar);
    }

    @Override // defpackage.brlm
    public final void c(brln brlnVar) {
        ncr ncrVar = this.a;
        if (brlnVar != ncrVar.g) {
            return;
        }
        ncrVar.g = null;
        kcz<dcdc<ldm>> kczVar = this.a.h;
        dbsk.s(kczVar);
        this.a.h = null;
        kczVar.b();
    }
}
