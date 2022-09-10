package defpackage;
/* renamed from: bsxz  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bsxz implements bszo {
    static final bszo a = new bsxz();

    private bsxz() {
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
        dteVar.a |= 1024;
        dteVar.l = booleanValue;
    }
}
