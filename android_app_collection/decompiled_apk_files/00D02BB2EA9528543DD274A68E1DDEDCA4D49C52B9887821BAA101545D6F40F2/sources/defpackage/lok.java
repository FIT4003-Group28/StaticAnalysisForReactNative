package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: lok  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class lok implements cqlc {
    static final cqlc a = new lok();

    private lok() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        atnf atnfVar = (atnf) cqkpVar;
        int i = lon.a;
        boolean z = true;
        if (!atnfVar.J().booleanValue() && !atnfVar.w().booleanValue() && !atnfVar.L().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
