package defpackage;
/* renamed from: pgr  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class pgr implements dbsl {
    static final dbsl a = new pgr();

    private pgr() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        String str = (String) obj;
        int i = pgt.a;
        return str.equals("GellerPeriodicSync") || str.equals("GellerOnDemandSync");
    }
}
