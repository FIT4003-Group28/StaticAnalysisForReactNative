package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: lox  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class lox implements cqlc {
    static final cqlc a = new lox();

    private lox() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        lwp lwpVar = (lwp) cqkpVar;
        boolean z = true;
        if (lqi.d(lwpVar) != null && !lqi.d(lwpVar).L().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
