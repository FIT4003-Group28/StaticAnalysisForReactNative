package defpackage;
/* renamed from: blkk  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class blkk implements dbsl {
    static final dbsl a = new blkk();

    private blkk() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        drey dreyVar = drey.USER_QUERY_MATCH;
        drey b = drey.b(((drew) obj).f);
        if (b == null) {
            b = drey.UNKNOWN_HIGHLIGHT_TYPE;
        }
        return dreyVar.equals(b);
    }
}
