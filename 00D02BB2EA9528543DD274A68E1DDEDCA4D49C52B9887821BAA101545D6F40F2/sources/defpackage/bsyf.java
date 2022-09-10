package defpackage;
/* renamed from: bsyf  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bsyf implements bszo {
    static final bszo a = new bsyf();

    private bsyf() {
    }

    @Override // defpackage.bszo
    public final void a(dssi dssiVar, Object obj) {
        dtl dtlVar = (dtl) dssiVar;
        String str = (String) obj;
        dte dteVar = ((dtm) dtlVar.b).b;
        if (dteVar == null) {
            dteVar = dte.w;
        }
        dsqp dsqpVar = (dsqp) dteVar.cu(5);
        dsqpVar.bC(dteVar);
        dtd dtdVar = (dtd) dsqpVar;
        if (dtdVar.c) {
            dtdVar.bF();
            dtdVar.c = false;
        }
        dte dteVar2 = (dte) dtdVar.b;
        str.getClass();
        dteVar2.a |= 131072;
        dteVar2.s = str;
        if (dtlVar.c) {
            dtlVar.bF();
            dtlVar.c = false;
        }
        dtm dtmVar = (dtm) dtlVar.b;
        dte bK = dtdVar.bK();
        bK.getClass();
        dtmVar.b = bK;
        dtmVar.a |= 1;
    }
}
