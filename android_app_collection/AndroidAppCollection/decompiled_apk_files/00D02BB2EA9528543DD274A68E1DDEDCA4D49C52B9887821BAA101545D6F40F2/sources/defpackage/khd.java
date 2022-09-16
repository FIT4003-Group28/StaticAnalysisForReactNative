package defpackage;
/* compiled from: PG */
/* renamed from: khd  reason: default package */
/* loaded from: classes7.dex */
final class khd implements brlm {
    final /* synthetic */ khe a;

    public khd(khe kheVar) {
        this.a = kheVar;
    }

    @Override // defpackage.brlm
    public final void a(brln brlnVar) {
        String B;
        brlu brluVar = brlnVar.e;
        for (int i = 0; i < brluVar.E(); i++) {
            ilo d = brluVar.D(i).d();
            if (d != null) {
                klg klgVar = this.a.j.get(d.ai().c);
                if (klgVar != null) {
                    if (dbsj.d(d.B())) {
                        if (d.aj() != null) {
                            B = d.aj().a();
                        }
                    } else {
                        B = d.B();
                    }
                    ((kli) klgVar).m(B);
                }
            }
        }
        this.a.j.clear();
    }

    @Override // defpackage.brlm
    public final void b(brln brlnVar, bttq bttqVar) {
        brlnVar.b().J.size();
        bttqVar.name();
    }

    @Override // defpackage.brlm
    public final void c(brln brlnVar) {
    }
}
