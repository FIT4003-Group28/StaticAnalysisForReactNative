package defpackage;
/* renamed from: qms  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class qms implements cqlc {
    static final cqlc a = new qms();

    private qms() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        qng qngVar = (qng) cqkpVar;
        int i = qmz.a;
        boolean z = false;
        if (qngVar.h().booleanValue() && qngVar.b().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
