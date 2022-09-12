package defpackage;
/* renamed from: bsxk  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bsxk implements bszo {
    static final bszo a = new bsxk();

    private bsxk() {
    }

    @Override // defpackage.bszo
    public final void a(dssi dssiVar, Object obj) {
        dtl dtlVar = (dtl) dssiVar;
        Boolean bool = (Boolean) obj;
        dte dteVar = ((dtm) dtlVar.b).b;
        if (dteVar == null) {
            dteVar = dte.w;
        }
        dsqp dsqpVar = (dsqp) dteVar.cu(5);
        dsqpVar.bC(dteVar);
        dtd dtdVar = (dtd) dsqpVar;
        dte dteVar2 = ((dtm) dtlVar.b).b;
        if (dteVar2 == null) {
            dteVar2 = dte.w;
        }
        dfkv dfkvVar = dteVar2.e;
        if (dfkvVar == null) {
            dfkvVar = dfkv.c;
        }
        dsqp dsqpVar2 = (dsqp) dfkvVar.cu(5);
        dsqpVar2.bC(dfkvVar);
        dfks dfksVar = (dfks) dsqpVar2;
        dte dteVar3 = ((dtm) dtlVar.b).b;
        if (dteVar3 == null) {
            dteVar3 = dte.w;
        }
        dfkv dfkvVar2 = dteVar3.e;
        if (dfkvVar2 == null) {
            dfkvVar2 = dfkv.c;
        }
        dfku dfkuVar = dfkvVar2.b;
        if (dfkuVar == null) {
            dfkuVar = dfku.f;
        }
        dsqp dsqpVar3 = (dsqp) dfkuVar.cu(5);
        dsqpVar3.bC(dfkuVar);
        dfkt dfktVar = (dfkt) dsqpVar3;
        boolean booleanValue = bool.booleanValue();
        if (dfktVar.c) {
            dfktVar.bF();
            dfktVar.c = false;
        }
        dfku dfkuVar2 = (dfku) dfktVar.b;
        dfkuVar2.a |= 8;
        dfkuVar2.e = booleanValue;
        if (dfksVar.c) {
            dfksVar.bF();
            dfksVar.c = false;
        }
        dfkv dfkvVar3 = (dfkv) dfksVar.b;
        dfku bK = dfktVar.bK();
        bK.getClass();
        dfkvVar3.b = bK;
        dfkvVar3.a |= 2;
        if (dtdVar.c) {
            dtdVar.bF();
            dtdVar.c = false;
        }
        dte dteVar4 = (dte) dtdVar.b;
        dfkv bK2 = dfksVar.bK();
        bK2.getClass();
        dteVar4.e = bK2;
        dteVar4.a |= 8;
        if (dtlVar.c) {
            dtlVar.bF();
            dtlVar.c = false;
        }
        dtm dtmVar = (dtm) dtlVar.b;
        dte bK3 = dtdVar.bK();
        bK3.getClass();
        dtmVar.b = bK3;
        dtmVar.a |= 1;
    }
}
