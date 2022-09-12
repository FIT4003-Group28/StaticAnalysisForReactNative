package defpackage;
/* renamed from: bsxv  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bsxv implements bszo {
    static final bszo a = new bsxv();

    private bsxv() {
    }

    @Override // defpackage.bszo
    public final void a(dssi dssiVar, Object obj) {
        dtd dtdVar = (dtd) dssiVar;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (dtdVar.c) {
            dtdVar.bF();
            dtdVar.c = false;
        }
        dte dteVar = (dte) dtdVar.b;
        dte dteVar2 = dte.w;
        dteVar.a |= 4096;
        dteVar.n = booleanValue;
    }
}
