package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bqma  reason: default package */
/* loaded from: classes4.dex */
public final class bqma extends bxel {
    public bqji a;

    @Override // defpackage.bxel
    protected final bxeq aJ() {
        return new bxeq(this) { // from class: bqlz
            private final bqma a;

            {
                this.a = this;
            }

            @Override // defpackage.bxeq
            public final void Pf(dwjb dwjbVar, dnqh dnqhVar) {
            }

            @Override // defpackage.bxeq
            public final void aK() {
            }

            @Override // defpackage.bxeq
            public final void aL(String str) {
            }

            @Override // defpackage.bxeq
            public final void aM(bxmh bxmhVar, List list) {
            }

            @Override // defpackage.bxeq
            public final boolean aN() {
                return false;
            }

            @Override // defpackage.bxeq
            public final void h(bxmh bxmhVar, bxmh bxmhVar2, dnqh dnqhVar, bxkv bxkvVar, cjqm cjqmVar) {
                bqma bqmaVar = this.a;
                dwjj dwjjVar = bxmhVar.b;
                if (dwjjVar == null) {
                    dwjjVar = dwjj.k;
                }
                dvzj dvzjVar = dwjjVar.g;
                if (dvzjVar == null) {
                    dvzjVar = dvzj.y;
                }
                String str = dvzjVar.b;
                if (str.isEmpty()) {
                    return;
                }
                ily ilyVar = new ily();
                ilyVar.k(str);
                ilo d = ilyVar.d();
                gga ggaVar = bqmaVar.aE;
                if (ggaVar != null) {
                    ggaVar.z(bqma.class);
                    ggaVar.g().f();
                }
                bqji bqjiVar = bqmaVar.a;
                dbsk.s(bqjiVar);
                bwrs<ilo> a = bwrs.a(d);
                bqjf r = bqjh.r();
                r.f(dnqhVar);
                bqjiVar.b(a, r.o());
            }

            @Override // defpackage.bxeq
            public final void i(String str, dnqh dnqhVar) {
            }
        };
    }
}
