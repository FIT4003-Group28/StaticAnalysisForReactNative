package defpackage;
/* renamed from: bsyh  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bsyh implements bszo {
    static final bszo a = new bsyh();

    private bsyh() {
    }

    @Override // defpackage.bszo
    public final void a(dssi dssiVar, Object obj) {
        dtl dtlVar = (dtl) dssiVar;
        try {
            float parseFloat = Float.parseFloat((String) obj);
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
            dknu dknuVar = dteVar2.m;
            if (dknuVar == null) {
                dknuVar = dknu.f;
            }
            dsqp dsqpVar2 = (dsqp) dknuVar.cu(5);
            dsqpVar2.bC(dknuVar);
            dknt dkntVar = (dknt) dsqpVar2;
            if (dkntVar.c) {
                dkntVar.bF();
                dkntVar.c = false;
            }
            dknu dknuVar2 = (dknu) dkntVar.b;
            dknuVar2.a |= 1;
            dknuVar2.b = parseFloat;
            if (dtdVar.c) {
                dtdVar.bF();
                dtdVar.c = false;
            }
            dte dteVar3 = (dte) dtdVar.b;
            dknu bK = dkntVar.bK();
            bK.getClass();
            dteVar3.m = bK;
            dteVar3.a |= 2048;
            if (dtlVar.c) {
                dtlVar.bF();
                dtlVar.c = false;
            }
            dtm dtmVar = (dtm) dtlVar.b;
            dte bK2 = dtdVar.bK();
            bK2.getClass();
            dtmVar.b = bK2;
            dtmVar.a |= 1;
        } catch (NumberFormatException unused) {
        }
    }
}
