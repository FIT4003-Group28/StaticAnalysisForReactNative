package defpackage;
/* renamed from: biqb  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class biqb implements cqlc {
    static final cqlc a = new biqb();

    private biqb() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        biwm biwmVar = (biwm) cqkpVar;
        int i = biqd.a;
        boolean z = false;
        if (biwmVar.c().booleanValue() && biwmVar.d().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
