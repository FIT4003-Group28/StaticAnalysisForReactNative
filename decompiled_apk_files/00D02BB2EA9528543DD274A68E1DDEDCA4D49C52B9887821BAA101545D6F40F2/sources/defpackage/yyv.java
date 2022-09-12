package defpackage;
/* renamed from: yyv  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class yyv implements dbsl {
    static final dbsl a = new yyv();

    private yyv() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        dqtz dqtzVar = dqtz.NORMAL_FARE;
        dqtz b = dqtz.b(((dpgn) obj).b);
        if (b == null) {
            b = dqtz.UNKNOWN_FARE;
        }
        return dqtzVar.equals(b);
    }
}
