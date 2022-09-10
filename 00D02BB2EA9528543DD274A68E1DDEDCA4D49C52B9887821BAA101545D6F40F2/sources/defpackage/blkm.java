package defpackage;
/* renamed from: blkm  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class blkm implements dbsl {
    static final dbsl a = new blkm();

    private blkm() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        drey dreyVar = drey.PLACE_TOPIC_MENTION;
        drey b = drey.b(((drew) obj).f);
        if (b == null) {
            b = drey.UNKNOWN_HIGHLIGHT_TYPE;
        }
        return dreyVar.equals(b);
    }
}
