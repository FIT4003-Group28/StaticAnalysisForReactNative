package defpackage;

import defpackage.dssj;
/* compiled from: PG */
/* renamed from: bvwn  reason: default package */
/* loaded from: classes4.dex */
public abstract class bvwn<RequestMessageT extends dssj> extends bvwh {
    private final dspy<dmfs, RequestMessageT> b;

    /* JADX INFO: Access modifiers changed from: protected */
    public bvwn(dspy<dmfs, RequestMessageT> dspyVar) {
        this.b = dspyVar;
    }

    protected abstract void a(RequestMessageT requestmessaget);

    @Override // defpackage.bvwh
    public final ddyq c() {
        ddyf bZ = ddyq.K.bZ();
        int a = this.b.a();
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
        dehn<?> b2;
        bvrj.UI_THREAD.c();
        dsqv dsqvVar = (dsqv) this.b;
        dmfsVar.f(dsqvVar);
        Object l = dmfsVar.V.l(dsqvVar.d);
        if (l == null) {
            b = dsqvVar.b;
        } else {
            b = dsqvVar.b(l);
        }
        try {
            a((dssj) b);
            b2 = dehk.a;
        } catch (Exception e) {
            b2 = deha.b(e);
        }
        return deew.h(b2, bvwm.a, dege.a);
    }

    @Override // defpackage.bvwh
    public final boolean e(dmfs dmfsVar) {
        dsqv dsqvVar = (dsqv) this.b;
        dmfsVar.f(dsqvVar);
        return dmfsVar.V.k(dsqvVar.d);
    }

    @Override // defpackage.bvwh
    public final void f(dsqa dsqaVar) {
        dsqaVar.f(this.b);
    }
}
