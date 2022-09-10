package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ica  reason: default package */
/* loaded from: classes6.dex */
public final /* synthetic */ class ica implements cqlc {
    static final cqlc a = new ica();

    private ica() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        jam jamVar = (jam) cqkpVar;
        int i = ico.a;
        boolean z = false;
        if (jamVar.k().booleanValue() && jamVar.h().booleanValue() && !cqjv.v(jamVar.j()).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
