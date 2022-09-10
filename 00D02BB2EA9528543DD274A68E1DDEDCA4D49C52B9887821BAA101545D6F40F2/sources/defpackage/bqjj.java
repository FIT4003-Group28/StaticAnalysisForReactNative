package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bqjj  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class bqjj implements dbsl {
    static final dbsl a = new bqjj();

    private bqjj() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        dnwl dnwlVar = (dnwl) obj;
        dfxs dfxsVar = dnwlVar.c;
        if (dfxsVar == null) {
            dfxsVar = dfxs.h;
        }
        if ((dfxsVar.a & 2) != 0) {
            dfxs dfxsVar2 = dnwlVar.c;
            if (dfxsVar2 == null) {
                dfxsVar2 = dfxs.h;
            }
            dfwp dfwpVar = dfxsVar2.b;
            if (dfwpVar == null) {
                dfwpVar = dfwp.d;
            }
            dfwn b = dfwn.b(dfwpVar.b);
            if (b == null) {
                b = dfwn.IMAGE_UNKNOWN;
            }
            return b.equals(dfwn.MEDIA_GUESSABLE_FIFE);
        }
        return true;
    }
}
