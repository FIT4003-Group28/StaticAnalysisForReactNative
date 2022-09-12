package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bmrh  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class bmrh implements cqlc {
    static final cqlc a = new bmrh();

    private bmrh() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bmtv bmtvVar = (bmtv) cqkpVar;
        int i = bmrw.b;
        boolean z = false;
        if (bmtvVar.V().b().booleanValue() && !bmtvVar.V().c().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
