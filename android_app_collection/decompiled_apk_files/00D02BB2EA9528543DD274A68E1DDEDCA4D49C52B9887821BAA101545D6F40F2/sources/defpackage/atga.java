package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: atga  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class atga implements cqlc {
    static final cqlc a = new atga();

    private atga() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        atna atnaVar = (atna) cqkpVar;
        int i = athe.header;
        boolean z = false;
        if (!atnaVar.ak().booleanValue()) {
            atnj w = atnaVar.w();
            dbsk.s(w);
            if (w.d().booleanValue()) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
