package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ccyp  reason: default package */
/* loaded from: classes4.dex */
public final class ccyp implements ccya {
    final /* synthetic */ ccyr b;

    public ccyp(ccyr ccyrVar) {
        this.b = ccyrVar;
    }

    @Override // defpackage.ccya
    public final void a(ccwk ccwkVar) {
        if ((ccwkVar.a & 4) == 0 || ccwkVar.f.isEmpty()) {
            return;
        }
        this.b.b.a().j(ccwkVar);
        ccyr ccyrVar = this.b;
        ccwm ccwmVar = ccyrVar.d;
        dsqp dsqpVar = (dsqp) ccwmVar.cu(5);
        dsqpVar.bC(ccwmVar);
        ccwl ccwlVar = (ccwl) dsqpVar;
        int i = this.b.d.g + 1;
        if (ccwlVar.c) {
            ccwlVar.bF();
            ccwlVar.c = false;
        }
        ccwm ccwmVar2 = (ccwm) ccwlVar.b;
        ccwmVar2.a |= 32;
        ccwmVar2.g = i;
        ccyrVar.d = ccwlVar.bK();
    }

    @Override // defpackage.ccya
    public final void b() {
    }

    @Override // defpackage.ccya
    public final void c(ccwk ccwkVar) {
        this.b.b.a().l(ccwkVar);
    }

    @Override // defpackage.ccya
    public final void d(int i) {
        ccxw ccxwVar;
        cqfc cqfcVar;
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 == 2 || i2 == 3) {
                ccxwVar = this.b.c;
                ccxwVar.h = null;
                ccxwVar.i = null;
                ccxwVar.j = ccxw.f(ccxw.c);
                cqfcVar = ccxw.a;
            } else if (i2 != 4) {
                ccxw ccxwVar2 = this.b.c;
                ccxwVar2.h = null;
                ccxwVar2.i = null;
                ccxwVar2.j = null;
                ccxwVar2.l = ccxw.f(ccxw.g);
                ccxwVar2.k = null;
            } else {
                ccyr ccyrVar = this.b;
                if (ccyrVar.d.c) {
                    ccyrVar.a(null);
                } else {
                    ccyrVar.o();
                    ccxwVar = this.b.c;
                    ccxwVar.h = null;
                    ccxwVar.i = ccxw.f(ccxw.d);
                    ccxwVar.j = ccxw.f(ccxw.f);
                    cqfcVar = ccxw.c;
                }
            }
            ccxwVar.l = ccxw.f(cqfcVar);
            ccxwVar.k = ccxw.f(ccxw.f);
        } else {
            ccxw ccxwVar3 = this.b.c;
            ccxwVar3.h = ccxw.f(ccxw.e);
            ccxwVar3.i = null;
            ccxwVar3.j = ccxw.f(ccxw.f);
            ccxwVar3.l = ccxw.f(ccxw.b);
            ccxwVar3.k = ccxw.f(ccxw.f);
        }
        jmw.d(this.b.a, null);
        cqkx.p(this.b);
    }
}
