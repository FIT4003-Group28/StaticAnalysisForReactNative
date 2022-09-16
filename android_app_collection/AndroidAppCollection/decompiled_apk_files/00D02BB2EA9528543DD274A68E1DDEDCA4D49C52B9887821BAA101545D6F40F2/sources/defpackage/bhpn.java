package defpackage;
/* renamed from: bhpn  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bhpn implements cqlc {
    static final cqlc a = new bhpn();

    private bhpn() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bhsc bhscVar = (bhsc) cqkpVar;
        int i = bhrg.a;
        boolean z = true;
        if (!bhscVar.w().booleanValue() && !bhscVar.g().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
