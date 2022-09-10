package defpackage;
/* renamed from: pdx  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class pdx implements dbsl {
    static final dbsl a = new pdx();

    private pdx() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        int i = pdy.a;
        int i2 = ((dlkn) obj).a;
        return ((i2 & 8) == 0 || (i2 & 16) == 0) ? false : true;
    }
}
