package defpackage;
/* renamed from: bips  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bips implements cqlc {
    static final cqlc a = new bips();

    private bips() {
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
