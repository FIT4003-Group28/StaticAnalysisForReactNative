package defpackage;
/* renamed from: afjl  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class afjl implements dbsl {
    static final dbsl a = new afjl();

    private afjl() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        afga afgaVar = (afga) obj;
        dbsl<afga> dbslVar = afjm.a;
        return "http".equals(afgaVar.b().getScheme()) && "gmm-settings".equals(afgaVar.b().getHost());
    }
}
