package defpackage;
/* renamed from: yyu  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class yyu implements dbsl {
    static final dbsl a = new yyu();

    private yyu() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        dqtz dqtzVar = dqtz.IC_FARE;
        dqtz b = dqtz.b(((dpgn) obj).b);
        if (b == null) {
            b = dqtz.UNKNOWN_FARE;
        }
        return dqtzVar.equals(b);
    }
}
