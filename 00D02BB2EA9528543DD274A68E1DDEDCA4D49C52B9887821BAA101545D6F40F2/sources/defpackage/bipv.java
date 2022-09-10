package defpackage;
/* renamed from: bipv  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bipv implements cqlc {
    static final cqlc a = new bipv();

    private bipv() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        biwm biwmVar = (biwm) cqkpVar;
        int i = biqd.a;
        boolean z = false;
        if (biwmVar.a().booleanValue() || (biwmVar.j().booleanValue() && biwmVar.b().booleanValue())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
