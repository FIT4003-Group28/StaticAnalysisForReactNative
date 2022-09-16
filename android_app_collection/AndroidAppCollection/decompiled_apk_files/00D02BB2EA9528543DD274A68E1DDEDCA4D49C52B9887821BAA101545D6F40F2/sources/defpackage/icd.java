package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: icd  reason: default package */
/* loaded from: classes6.dex */
public final /* synthetic */ class icd implements cqlc {
    static final cqlc a = new icd();

    private icd() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        jam jamVar = (jam) cqkpVar;
        int i = ico.a;
        boolean z = false;
        if (jamVar.d().booleanValue() && jamVar.h().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
