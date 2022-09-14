package defpackage;
/* renamed from: ajuy  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class ajuy implements cqlc {
    static final cqlc a = new ajuy();

    private ajuy() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        ajvb ajvbVar = (ajvb) cqkpVar;
        if (!ajvbVar.j().booleanValue()) {
            return 2131232176;
        }
        Boolean m = ajvbVar.m();
        dbsk.s(m);
        boolean booleanValue = m.booleanValue();
        Integer k = ajvbVar.k();
        dbsk.s(k);
        return Integer.valueOf(ajut.a(booleanValue, k.intValue()));
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
