package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: luh  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class luh implements cqlc {
    static final cqlc a = new luh();

    private luh() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        lvw lvwVar = (lvw) cqkpVar;
        int i = lut.a;
        boolean z = true;
        if (lvwVar.k().i().booleanValue() && lvwVar.m().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
