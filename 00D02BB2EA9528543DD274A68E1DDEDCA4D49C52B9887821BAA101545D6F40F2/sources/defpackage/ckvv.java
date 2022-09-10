package defpackage;
/* renamed from: ckvv  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class ckvv implements dbsl {
    static final dbsl a = new ckvv();

    private ckvv() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        afga afgaVar = (afga) obj;
        dbsl<afga> dbslVar = ckvw.b;
        if (afgaVar != null && !afgaVar.b().isOpaque()) {
            return afgaVar.b().getBooleanQueryParameter("zra", false) || "https://maps.app.goo.gl/xuJBc".equals(afgaVar.b().toString());
        }
        return false;
    }
}
