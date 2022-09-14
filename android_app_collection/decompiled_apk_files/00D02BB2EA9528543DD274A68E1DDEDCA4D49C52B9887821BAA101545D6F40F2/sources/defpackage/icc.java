package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: icc  reason: default package */
/* loaded from: classes6.dex */
public final /* synthetic */ class icc implements cqlc {
    static final cqlc a = new icc();

    private icc() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        jam jamVar = (jam) cqkpVar;
        int i = ico.a;
        boolean z = true;
        if (!jamVar.k().booleanValue() && jamVar.h().booleanValue() && !cqjv.v(jamVar.j()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
