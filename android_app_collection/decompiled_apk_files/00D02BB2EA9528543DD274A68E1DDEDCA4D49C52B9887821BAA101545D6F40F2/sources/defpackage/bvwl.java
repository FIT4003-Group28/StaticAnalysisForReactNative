package defpackage;

import defpackage.dssj;
/* compiled from: PG */
/* renamed from: bvwl  reason: default package */
/* loaded from: classes4.dex */
public abstract class bvwl<RequestMessageT extends dssj, ResponseMessageT extends dssj> extends bvwh {
    public final dspy<dmfu, ResponseMessageT> b;
    private final dspy<dmfs, RequestMessageT> c;

    /* JADX INFO: Access modifiers changed from: protected */
    public bvwl(dspy<dmfs, RequestMessageT> dspyVar, dspy<dmfu, ResponseMessageT> dspyVar2) {
        this.c = dspyVar;
        this.b = dspyVar2;
    }

    protected dehn<ResponseMessageT> a(RequestMessageT requestmessaget) {
        try {
            return deha.a(g(requestmessaget));
        } catch (Exception e) {
            return deha.b(e);
        }
    }

    @Override // defpackage.bvwh
    public final ddyq c() {
        ddyf bZ = ddyq.K.bZ();
        int a = this.c.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddyq ddyqVar = (ddyq) bZ.b;
        ddyqVar.b |= 16;
        ddyqVar.B = a;
        return bZ.bK();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bvwh
    public final dehn<dmfu> d(dmfs dmfsVar) {
        Object b;
        bvrj.UI_THREAD.c();
        dsqv dsqvVar = (dsqv) this.c;
        dmfsVar.f(dsqvVar);
        Object l = dmfsVar.V.l(dsqvVar.d);
        if (l == null) {
            b = dsqvVar.b;
        } else {
            b = dsqvVar.b(l);
        }
        return deew.h(a((dssj) b), new dbrn(this) { // from class: bvwk
            private final bvwl a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                bvwl bvwlVar = this.a;
                dmft dmftVar = (dmft) dmfu.e.bZ();
                dmftVar.k(bvwlVar.b, (dssj) obj);
                return (dmfu) dmftVar.bK();
            }
        }, dege.a);
    }

    @Override // defpackage.bvwh
    public final boolean e(dmfs dmfsVar) {
        dsqv dsqvVar = (dsqv) this.c;
        dmfsVar.f(dsqvVar);
        return dmfsVar.V.k(dsqvVar.d);
    }

    @Override // defpackage.bvwh
    public final void f(dsqa dsqaVar) {
        dsqaVar.f(this.c);
    }

    protected abstract ResponseMessageT g(RequestMessageT requestmessaget);
}
