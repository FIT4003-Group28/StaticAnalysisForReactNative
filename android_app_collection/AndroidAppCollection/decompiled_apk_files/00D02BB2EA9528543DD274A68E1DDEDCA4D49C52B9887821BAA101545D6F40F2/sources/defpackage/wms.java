package defpackage;
/* renamed from: wms  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class wms implements cqlc {
    static final cqlc a = new wms();

    private wms() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        wpn wpnVar = (wpn) cqkpVar;
        int i = wmv.a;
        boolean z = false;
        if (wpnVar.b().booleanValue() && wpnVar.d().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
