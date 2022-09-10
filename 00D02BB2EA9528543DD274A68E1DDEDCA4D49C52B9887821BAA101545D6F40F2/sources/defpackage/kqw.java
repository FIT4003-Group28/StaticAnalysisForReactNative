package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kqw  reason: default package */
/* loaded from: classes7.dex */
public final class kqw implements ndx {
    final /* synthetic */ krc a;

    public kqw(krc krcVar) {
        this.a = krcVar;
    }

    @Override // defpackage.ndx
    public final void a(String str, @dzsi ldm ldmVar, boolean z, bxmg bxmgVar) {
        this.a.n.a(bxmgVar);
        if (ldmVar == null) {
            ((ckco) this.a.n.a.a(ckjw.ax)).a(z ? ckjv.a(8) : ckjv.a(7));
            krc krcVar = this.a;
            ksu ksuVar = new ksu(this) { // from class: kqv
                private final kqw a;

                {
                    this.a = this;
                }

                @Override // defpackage.ksu
                public final void a(ldm ldmVar2) {
                    this.a.a.p(ldmVar2);
                }
            };
            ily ilyVar = new ily();
            ilyVar.u = str;
            befu p = befv.p();
            p.j(bwrs.a(ilyVar.d()));
            if (krcVar.g.f(new kqx(krcVar, str, ksuVar), p.m()) != null) {
                return;
            }
            krcVar.o();
            return;
        }
        ((ckco) this.a.n.a.a(ckjw.ax)).a(z ? ckjv.a(6) : ckjv.a(5));
        this.a.p(ldmVar);
    }
}
