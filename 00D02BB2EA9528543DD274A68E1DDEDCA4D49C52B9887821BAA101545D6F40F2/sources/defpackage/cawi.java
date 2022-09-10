package defpackage;
/* renamed from: cawi  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cawi implements cqlc {
    static final cqlc a = new cawi();

    private cawi() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        cavt cavtVar = (cavt) cqkpVar;
        cqrp cqrpVar = cawp.a;
        boolean z = false;
        if (cavtVar.c().booleanValue() && cavtVar.i().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
