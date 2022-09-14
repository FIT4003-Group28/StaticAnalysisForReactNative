package defpackage;
/* compiled from: PG */
/* renamed from: cefg  reason: default package */
/* loaded from: classes4.dex */
public final class cefg extends ceez<dwvz, dwwb> {
    private final anhk e;
    private final cese f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cefg(defpackage.anhk r2, defpackage.buvk r3, defpackage.cese r4, defpackage.cgrc r5, defpackage.dwvz r6) {
        /*
            r1 = this;
            r0 = 5
            java.lang.Object r0 = r6.cu(r0)
            dsqp r0 = (defpackage.dsqp) r0
            r0.bC(r6)
            dwvu r0 = (defpackage.dwvu) r0
            n(r0, r2)
            dsqw r6 = r0.bK()
            dwvz r6 = (defpackage.dwvz) r6
            r1.<init>(r5, r3, r6)
            r1.f = r4
            r1.e = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cefg.<init>(anhk, buvk, cese, cgrc, dwvz):void");
    }

    private static void n(dwvu dwvuVar, anhk anhkVar) {
        if ((anhkVar.a().a & 8) != 0) {
            String str = anhkVar.a().d;
            if (dwvuVar.c) {
                dwvuVar.bF();
                dwvuVar.c = false;
            }
            dwvz dwvzVar = (dwvz) dwvuVar.b;
            dwvz dwvzVar2 = dwvz.n;
            str.getClass();
            dwvzVar.a |= 64;
            dwvzVar.g = str;
        }
    }

    @Override // defpackage.ceez
    public final void d() {
        cgre.g(this.a, dwvz.class, this);
    }

    @Override // defpackage.ceez
    protected final dssr<dwvz> e() {
        return (dssr) dwvz.n.cu(7);
    }

    @Override // defpackage.ceez
    protected final /* bridge */ /* synthetic */ void f(dwwb dwwbVar) {
        dwvz dwvzVar;
        dwwb dwwbVar2 = dwwbVar;
        dusk duskVar = dwwbVar2.b;
        if (duskVar == null) {
            duskVar = dusk.c;
        }
        if ((duskVar.a & 2) != 0) {
            dusk duskVar2 = dwwbVar2.b;
            if (duskVar2 == null) {
                duskVar2 = dusk.c;
            }
            duld duldVar = duskVar2.b;
            if (duldVar == null) {
                duldVar = duld.f;
            }
            duvr duvrVar = duldVar.a;
            if (duvrVar == null) {
                duvrVar = duvr.b;
            }
            dwvz dwvzVar2 = duvrVar.a;
            if (dwvzVar2 == null) {
                dwvzVar2 = dwvz.n;
            }
            dsqp dsqpVar = (dsqp) dwvzVar2.cu(5);
            dsqpVar.bC(dwvzVar2);
            dwvu dwvuVar = (dwvu) dsqpVar;
            dwvy b = dwvy.b(((dwvz) this.b).e);
            if (b == null) {
                b = dwvy.NEWEST;
            }
            if (dwvuVar.c) {
                dwvuVar.bF();
                dwvuVar.c = false;
            }
            dwvz dwvzVar3 = (dwvz) dwvuVar.b;
            dwvzVar3.e = b.f;
            dwvzVar3.a |= 16;
            duls dulsVar = ((dwvz) this.b).c;
            if (dulsVar == null) {
                dulsVar = duls.g;
            }
            if (dwvuVar.c) {
                dwvuVar.bF();
                dwvuVar.c = false;
            }
            dwvz dwvzVar4 = (dwvz) dwvuVar.b;
            dulsVar.getClass();
            dwvzVar4.c = dulsVar;
            dwvzVar4.a |= 2;
            dwvw dwvwVar = ((dwvz) this.b).f;
            if (dwvwVar == null) {
                dwvwVar = dwvw.c;
            }
            if (dwvuVar.c) {
                dwvuVar.bF();
                dwvuVar.c = false;
            }
            dwvz dwvzVar5 = (dwvz) dwvuVar.b;
            dwvwVar.getClass();
            dwvzVar5.f = dwvwVar;
            dwvzVar5.a |= 32;
            n(dwvuVar, this.e);
            dwvz dwvzVar6 = (dwvz) this.b;
            if ((dwvzVar6.a & 16384) != 0) {
                drfs drfsVar = dwvzVar6.m;
                if (drfsVar == null) {
                    drfsVar = drfs.c;
                }
                if (dwvuVar.c) {
                    dwvuVar.bF();
                    dwvuVar.c = false;
                }
                dwvz dwvzVar7 = (dwvz) dwvuVar.b;
                drfsVar.getClass();
                dwvzVar7.m = drfsVar;
                dwvzVar7.a |= 16384;
            }
            dwvzVar = dwvuVar.bK();
        } else if (!this.f.c() || (dwwbVar2.a & 4) == 0) {
            dwvzVar = null;
        } else {
            dwvz dwvzVar8 = (dwvz) this.b;
            dsqp dsqpVar2 = (dsqp) dwvzVar8.cu(5);
            dsqpVar2.bC(dwvzVar8);
            dwvu dwvuVar2 = (dwvu) dsqpVar2;
            String str = dwwbVar2.g;
            if (dwvuVar2.c) {
                dwvuVar2.bF();
                dwvuVar2.c = false;
            }
            dwvz dwvzVar9 = (dwvz) dwvuVar2.b;
            dwvz dwvzVar10 = dwvz.n;
            str.getClass();
            dwvzVar9.a |= 8;
            dwvzVar9.d = str;
            n(dwvuVar2, this.e);
            dwvzVar = dwvuVar2.bK();
        }
        this.c = dwvzVar;
    }

    @Override // defpackage.ceez
    public final void h() {
        dwvz dwvzVar = (dwvz) this.b;
        dsqp dsqpVar = (dsqp) dwvzVar.cu(5);
        dsqpVar.bC(dwvzVar);
        dwvu dwvuVar = (dwvu) dsqpVar;
        n(dwvuVar, this.e);
        this.b = dwvuVar.bK();
        super.h();
    }

    public final void m(drfs drfsVar) {
        if (drfsVar.equals(drfs.c)) {
            dwvz dwvzVar = (dwvz) this.b;
            dsqp dsqpVar = (dsqp) dwvzVar.cu(5);
            dsqpVar.bC(dwvzVar);
            dwvu dwvuVar = (dwvu) dsqpVar;
            if (dwvuVar.c) {
                dwvuVar.bF();
                dwvuVar.c = false;
            }
            dwvz dwvzVar2 = (dwvz) dwvuVar.b;
            dwvz dwvzVar3 = dwvz.n;
            dwvzVar2.m = null;
            dwvzVar2.a &= -16385;
            this.b = dwvuVar.bK();
        } else {
            dwvz dwvzVar4 = (dwvz) this.b;
            dsqp dsqpVar2 = (dsqp) dwvzVar4.cu(5);
            dsqpVar2.bC(dwvzVar4);
            dwvu dwvuVar2 = (dwvu) dsqpVar2;
            if (dwvuVar2.c) {
                dwvuVar2.bF();
                dwvuVar2.c = false;
            }
            dwvz dwvzVar5 = (dwvz) dwvuVar2.b;
            dwvz dwvzVar6 = dwvz.n;
            drfsVar.getClass();
            dwvzVar5.m = drfsVar;
            dwvzVar5.a |= 16384;
            this.b = dwvuVar2.bK();
        }
        this.c = this.b;
        h();
    }
}
