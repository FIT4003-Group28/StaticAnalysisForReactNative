package defpackage;
/* renamed from: agsu  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class agsu implements cqlc {
    static final cqlc a = new agsu();

    private agsu() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        agxe agxeVar = (agxe) cqkpVar;
        cqjg cqjgVar = agta.a;
        boolean z = true;
        if (agxeVar.m().intValue() != -1 && !cqjv.v(agxeVar.l()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
