package defpackage;
/* compiled from: PG */
/* renamed from: bnlo  reason: default package */
/* loaded from: classes3.dex */
public final class bnlo<T> extends btrh<T> {
    private final int d;

    public bnlo(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        bwrs<ilo> e;
        int i = this.d;
        if (i == 0) {
            bnln bnlnVar = (bnln) this.a;
            alhx alhxVar = (alhx) obj;
            if (!bnlnVar.e) {
                return;
            }
            bnlnVar.c.a(alhxVar.a);
        } else if (i == 1) {
            bnln bnlnVar2 = (bnln) this.a;
            alhl alhlVar = (alhl) obj;
            if (!bnlnVar2.e) {
                return;
            }
            bnll bnllVar = (bnll) bnlnVar2.c;
            if (!bnllVar.g() || !bnllVar.e()) {
                return;
            }
            bnllVar.c(bnllVar.h());
        } else {
            ilo iloVar = null;
            if (i == 2) {
                bnln bnlnVar3 = (bnln) this.a;
                cxd cxdVar = (cxd) obj;
                if (bnlnVar3.a.a() != null && (e = bnlnVar3.a.a().e()) != null) {
                    iloVar = e.c();
                }
                if (iloVar == null || !iloVar.cE()) {
                    return;
                }
                dbsk.l(bnlnVar3.b.K() instanceof befx);
                bnlnVar3.b.g().f();
                ((bnll) bnlnVar3.c).e.e(cxdVar.a);
            } else if (i != 3) {
                bnln bnlnVar4 = (bnln) this.a;
                alim alimVar = (alim) obj;
                if (!bnlnVar4.g.b.getPromotedPlacesParameters().c || bnlnVar4.f || bnlnVar4.d == null) {
                    return;
                }
                dcdc<dnpo> dcdcVar = alimVar.f;
                int size = dcdcVar.size();
                for (int i2 = 0; i2 < size; i2++) {
                    dnpo dnpoVar = dcdcVar.get(i2);
                    int a = dnpl.a(dnpoVar.h);
                    if (a == 0) {
                        a = 1;
                    }
                    if (ctz.a(new dsrh(dnpoVar.d, dnpo.e)) && a != 3) {
                        bnlnVar4.d.a().i(dvum.PROMOTED_PLACES, null);
                        bnlnVar4.f = true;
                        return;
                    }
                }
            } else {
                bnln bnlnVar5 = (bnln) this.a;
                bnlj bnljVar = (bnlj) obj;
                djiq djiqVar = bnljVar.a;
                if (djiqVar == null) {
                    return;
                }
                bnlm bnlmVar = bnlnVar5.g;
                djim djimVar = djiqVar.c;
                if (djimVar == null) {
                    djimVar = djim.C;
                }
                bnlmVar.a = djimVar;
                bnlnVar5.c.b(bnljVar);
            }
        }
    }
}
