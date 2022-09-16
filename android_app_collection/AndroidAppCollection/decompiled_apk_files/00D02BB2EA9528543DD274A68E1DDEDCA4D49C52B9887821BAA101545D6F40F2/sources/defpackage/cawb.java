package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cawb  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class cawb implements cqlc {
    static final cqlc a = new cawb();

    private cawb() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        cavt cavtVar = (cavt) cqkpVar;
        cqrp cqrpVar = cawp.a;
        boolean z = true;
        if (cavtVar.c().booleanValue() && !cavtVar.i().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
