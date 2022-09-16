package defpackage;
/* compiled from: PG */
/* renamed from: brcc  reason: default package */
/* loaded from: classes4.dex */
public final class brcc implements brlm, crzp {
    public final akpm a;
    public final broq b;
    @dzsi
    public alad c;
    @dzsi
    public brln d;
    private final brmt e;
    private brmi f = brmi.NO_LABELS;

    public brcc(akpm akpmVar, broq broqVar, brmt brmtVar) {
        this.a = akpmVar;
        this.b = broqVar;
        this.e = brmtVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<brmi> crzmVar) {
        brmi brmiVar;
        if (crzmVar.l() != null) {
            brmiVar = crzmVar.l();
            dbsk.s(brmiVar);
        } else {
            brmiVar = brmi.NO_LABELS;
        }
        this.f = brmiVar;
    }

    @Override // defpackage.brlm
    public final void a(brln brlnVar) {
        brmt brmtVar;
        if (brlnVar != this.d) {
            return;
        }
        this.d = null;
        alad c = alad.c(this.a.aa());
        if (c == null || c.equals(this.c)) {
            alad c2 = alad.c(brlnVar.e.x());
            alad aladVar = this.c;
            if (aladVar == null || aladVar.equals(c2) || !this.f.equals(brmi.NO_LABELS)) {
                return;
            }
            alao.d(this.a, alad.c(brlnVar.e.x()));
        } else if (!this.f.equals(brmi.NO_LABELS) || (brmtVar = this.e) == null) {
        } else {
            brmtVar.g();
        }
    }

    @Override // defpackage.brlm
    public final void b(brln brlnVar, bttq bttqVar) {
        this.d = null;
    }

    @Override // defpackage.brlm
    public final void c(brln brlnVar) {
        this.d = null;
    }
}
