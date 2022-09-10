package defpackage;
/* renamed from: bswx  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bswx implements bszo {
    static final bszo a = new bswx();

    private bswx() {
    }

    @Override // defpackage.bszo
    public final void a(dssi dssiVar, Object obj) {
        dtl dtlVar = (dtl) dssiVar;
        String str = (String) obj;
        if (str == null || str.isEmpty()) {
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
            dteVar2.a &= -17;
            dteVar2.f = dte.w.f;
            if (dtlVar.c) {
                dtlVar.bF();
                dtlVar.c = false;
            }
            dtm dtmVar = (dtm) dtlVar.b;
            dte bK = dtdVar.bK();
            bK.getClass();
            dtmVar.b = bK;
            dtmVar.a |= 1;
            return;
        }
        dte dteVar3 = ((dtm) dtlVar.b).b;
        if (dteVar3 == null) {
            dteVar3 = dte.w;
        }
        dsqp dsqpVar2 = (dsqp) dteVar3.cu(5);
        dsqpVar2.bC(dteVar3);
        dtd dtdVar2 = (dtd) dsqpVar2;
        if (dtdVar2.c) {
            dtdVar2.bF();
            dtdVar2.c = false;
        }
        dte dteVar4 = (dte) dtdVar2.b;
        str.getClass();
        dteVar4.a |= 16;
        dteVar4.f = str;
        if (dtlVar.c) {
            dtlVar.bF();
            dtlVar.c = false;
        }
        dtm dtmVar2 = (dtm) dtlVar.b;
        dte bK2 = dtdVar2.bK();
        bK2.getClass();
        dtmVar2.b = bK2;
        dtmVar2.a |= 1;
    }
}
