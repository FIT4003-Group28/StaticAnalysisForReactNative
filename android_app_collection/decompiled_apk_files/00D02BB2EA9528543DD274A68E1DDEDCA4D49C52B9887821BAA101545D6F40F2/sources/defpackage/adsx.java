package defpackage;
/* renamed from: adsx  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class adsx implements cqlc {
    static final cqlc a = new adsx();

    private adsx() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        advs advsVar = (advs) cqkpVar;
        int i = adug.a;
        boolean z = false;
        if (cqjv.v(advsVar.A()).booleanValue() && cqjv.v(advsVar.B()).booleanValue() && !advsVar.E().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
