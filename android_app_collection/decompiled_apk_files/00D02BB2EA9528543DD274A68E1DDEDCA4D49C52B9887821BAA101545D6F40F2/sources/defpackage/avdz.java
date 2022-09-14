package defpackage;
/* renamed from: avdz  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class avdz implements dbsl {
    static final dbsl a = new avdz();

    private avdz() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        eaow eaowVar = avel.q;
        dltl b = dltl.b(((dltm) obj).k);
        if (b == null) {
            b = dltl.USER_DEFINED;
        }
        return b != dltl.DYNAMIC_PADDING;
    }
}
