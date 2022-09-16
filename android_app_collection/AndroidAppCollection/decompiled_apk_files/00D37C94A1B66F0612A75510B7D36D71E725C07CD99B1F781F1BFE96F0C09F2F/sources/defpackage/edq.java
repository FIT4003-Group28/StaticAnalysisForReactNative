package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: edq  reason: default package */
/* loaded from: classes3.dex */
public final class edq implements wri, ecv, wls {
    private final azqb a;
    private View b;
    private ajrs c;
    private ecw d;
    private final wmk e;

    public edq(azqb azqbVar, udt udtVar, wmk wmkVar, byte[] bArr) {
        this.a = azqbVar;
        this.e = wmkVar;
        udtVar.a(this);
        wmkVar.a(this);
    }

    @Override // defpackage.wri
    public final wqg a(wqf wqfVar, xdu xduVar, xci xciVar) {
        if (wwf.e(edj.class, xduVar, xciVar)) {
            ecw ecwVar = this.d;
            if (ecwVar != null) {
                edj edjVar = new edj(this.e, ecwVar.a(), wqfVar, xduVar, xciVar, (aqtb) xciVar.e(xay.class));
                edjVar.g(this.b, this.c);
                return edjVar;
            }
            throw new wrh("No elementsRenderingApiFactory available for BelowPlayer");
        }
        return ((wrc) this.a.get()).a(wqfVar, xduVar, xciVar);
    }

    @Override // defpackage.ecv
    public final void b(ecw ecwVar) {
        this.d = ecwVar;
    }

    @Override // defpackage.ecv
    public final void c() {
        this.d = null;
    }

    @Override // defpackage.wls
    public final void f() {
        this.b = null;
        this.c = null;
    }

    @Override // defpackage.wls
    public final void g(View view, ajrs ajrsVar) {
        this.b = view;
        this.c = ajrsVar;
    }
}
