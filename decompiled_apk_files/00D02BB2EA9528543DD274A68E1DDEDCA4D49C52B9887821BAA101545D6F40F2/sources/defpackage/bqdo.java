package defpackage;
/* renamed from: bqdo  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class bqdo implements dbsl {
    static final dbsl a = new bqdo();

    private bqdo() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        afga afgaVar = (afga) obj;
        return "http".equals(afgaVar.b().getScheme()) && "debug.com".equals(afgaVar.b().getHost()) && "/missing_road".equals(afgaVar.b().getPath());
    }
}
