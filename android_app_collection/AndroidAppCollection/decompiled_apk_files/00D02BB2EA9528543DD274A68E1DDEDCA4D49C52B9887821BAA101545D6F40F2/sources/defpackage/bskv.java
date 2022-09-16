package defpackage;
/* compiled from: PG */
/* renamed from: bskv  reason: default package */
/* loaded from: classes4.dex */
class bskv implements dbrn<djjt, dfow> {
    public static final dfow b(djjt djjtVar) {
        dfov bZ = dfow.c.bZ();
        if ((djjtVar.a & 1) != 0) {
            String str = djjtVar.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dfow dfowVar = (dfow) bZ.b;
            str.getClass();
            dfowVar.a |= 1;
            dfowVar.b = str;
        }
        return bZ.bK();
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ dfow a(djjt djjtVar) {
        throw null;
    }
}
