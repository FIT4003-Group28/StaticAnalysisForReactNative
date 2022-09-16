package defpackage;
/* compiled from: PG */
/* renamed from: iqs  reason: default package */
/* loaded from: classes6.dex */
public class iqs {
    public final iqq a;
    public final ckcw b;
    public final pey c;
    @dzsi
    public bwrs<ilo> d;
    public int e = -1;
    private final cjqy f;

    public iqs(cjqy cjqyVar, iqq iqqVar, ckcw ckcwVar, pey peyVar) {
        this.f = cjqyVar;
        this.a = iqqVar;
        this.b = ckcwVar;
        this.c = peyVar;
    }

    public final void a(jjn jjnVar, jjn jjnVar2) {
        d(new cjte(deaf.TAP), dtxy.iK, jjnVar, jjnVar2, true);
    }

    public final void b() {
        d(new cjte(deaf.AUTOMATED), dtxy.gP, jjn.COLLAPSED, jjn.HIDDEN, true);
    }

    public final void c(cjte cjteVar, ddho ddhoVar, jjn jjnVar, jjn jjnVar2) {
        d(cjteVar, ddhoVar, jjnVar, jjnVar2, false);
    }

    public final void d(cjte cjteVar, ddho ddhoVar, jjn jjnVar, jjn jjnVar2, boolean z) {
        if (jjnVar != jjnVar2) {
            ilo iloVar = (ilo) bwrs.b(this.d);
            cjtd bZ = iloVar != null ? iloVar.bZ() : null;
            cjqe f = cjqf.f(jjnVar, jjnVar2);
            ((cjpz) f).c = Integer.valueOf(this.e);
            ddqc g = f.a().g();
            if (z) {
                if (jjnVar == jjn.HIDDEN) {
                    if (g.c) {
                        g.bF();
                        g.c = false;
                    }
                    ddqk ddqkVar = (ddqk) g.b;
                    ddqk ddqkVar2 = ddqk.h;
                    ddqkVar.e = 4;
                    ddqkVar.a |= 8;
                }
                if (jjnVar2 == jjn.HIDDEN) {
                    if (g.c) {
                        g.bF();
                        g.c = false;
                    }
                    ddqk ddqkVar3 = (ddqk) g.b;
                    ddqk ddqkVar4 = ddqk.h;
                    ddqkVar3.d = 4;
                    ddqkVar3.a |= 4;
                }
            }
            cjqy cjqyVar = this.f;
            cjql cjqlVar = cjql.a;
            cjta c = cjtd.c(bZ);
            c.d = ddhoVar;
            c.n(g.bK());
            cjqyVar.n(cjqlVar, cjteVar, c.a());
        }
    }

    public final void e(@dzsi bwrs<ilo> bwrsVar) {
        this.d = bwrsVar;
        this.e = 0;
    }
}
