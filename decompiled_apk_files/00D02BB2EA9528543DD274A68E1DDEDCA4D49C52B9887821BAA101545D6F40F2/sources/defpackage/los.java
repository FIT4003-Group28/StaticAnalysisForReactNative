package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: los  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class los implements cqlc {
    static final cqlc a = new los();

    private los() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        lwp lwpVar = (lwp) cqkpVar;
        boolean z = false;
        if (lqi.d(lwpVar) != null && lqi.d(lwpVar).L().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
