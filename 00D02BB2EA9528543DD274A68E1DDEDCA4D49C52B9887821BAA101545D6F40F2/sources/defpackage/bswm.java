package defpackage;
/* renamed from: bswm  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bswm implements bszo {
    static final bszo a = new bswm();

    private bswm() {
    }

    @Override // defpackage.bszo
    public final void a(dssi dssiVar, Object obj) {
        dtl dtlVar = (dtl) dssiVar;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (dtlVar.c) {
            dtlVar.bF();
            dtlVar.c = false;
        }
        dtm dtmVar = (dtm) dtlVar.b;
        dtm dtmVar2 = dtm.g;
        dtmVar.a |= 16;
        dtmVar.f = booleanValue;
    }
}
