package defpackage;

import com.google.ar.core.ImageMetadata;
/* renamed from: bswf  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bswf implements bszo {
    static final bszo a = new bswf();

    private bswf() {
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
        boolean booleanValue = bool.booleanValue();
        if (dtdVar.c) {
            dtdVar.bF();
            dtdVar.c = false;
        }
        dte dteVar2 = (dte) dtdVar.b;
        dteVar2.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        dteVar2.r = booleanValue;
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