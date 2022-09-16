package defpackage;
/* renamed from: ctau  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class ctau implements dbsl {
    static final dbsl a = new ctau();

    private ctau() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        cstd.a();
        return System.currentTimeMillis() > ((cufp) obj).f().longValue();
    }
}
