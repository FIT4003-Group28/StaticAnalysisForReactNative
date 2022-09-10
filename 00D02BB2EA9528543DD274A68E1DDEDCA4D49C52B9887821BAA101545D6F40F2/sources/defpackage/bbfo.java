package defpackage;
/* renamed from: bbfo  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bbfo implements cqlc {
    static final cqlc a = new bbfo();

    private bbfo() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bbhq bbhqVar = (bbhq) cqkpVar;
        cqtv cqtvVar = bbfu.a;
        if (bbhqVar.e(bbho.INTERSTITIAL_PROGRESS).booleanValue()) {
            return cjtd.a(dtxo.aS);
        }
        if (bbhqVar.e(bbho.PLACE).booleanValue()) {
            return cjtd.a(dtxo.be);
        }
        return cjtd.b;
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
