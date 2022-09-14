package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ltt  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class ltt implements cqlc {
    static final cqlc a = new ltt();

    private ltt() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        lvw lvwVar = (lvw) cqkpVar;
        int i = lut.a;
        boolean z = true;
        if (!dbsj.d(lvwVar.g()) && !dbsj.d(lvwVar.f())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
