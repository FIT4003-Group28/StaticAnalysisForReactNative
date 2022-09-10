package defpackage;
/* renamed from: cgqa  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cgqa implements cqlc {
    static final cqlc a = new cgqa();

    private cgqa() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        cgwh cgwhVar = (cgwh) cqkpVar;
        int i = cgqi.a;
        boolean z = true;
        if (!cgwhVar.f().booleanValue() && !cgwhVar.e().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
