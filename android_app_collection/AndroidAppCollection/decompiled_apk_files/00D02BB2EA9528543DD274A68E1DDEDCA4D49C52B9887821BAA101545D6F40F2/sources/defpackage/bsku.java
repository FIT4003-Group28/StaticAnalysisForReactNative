package defpackage;
/* compiled from: PG */
/* renamed from: bsku  reason: default package */
/* loaded from: classes4.dex */
class bsku implements dbrn<djjp, dfou> {
    public static final dfou b(djjp djjpVar) {
        dfot bZ = dfou.c.bZ();
        if ((djjpVar.a & 1) != 0) {
            dbrn<djjn, dugu> dbrnVar = bslm.a;
            djjn b = djjn.b(djjpVar.b);
            if (b == null) {
                b = djjn.UNKNOWN_ATTRACTION_CATEGORY;
            }
            dugu a = dbrnVar.a(b);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dfou dfouVar = (dfou) bZ.b;
            dfouVar.b = a.a();
            dfouVar.a |= 1;
        }
        return bZ.bK();
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ dfou a(djjp djjpVar) {
        throw null;
    }
}
