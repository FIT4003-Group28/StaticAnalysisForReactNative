package defpackage;
/* renamed from: aqqc  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aqqc implements cqlc {
    static final cqlc a = new aqqc();

    private aqqc() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        aqqe aqqeVar = (aqqe) cqkpVar;
        int i = aqqd.a;
        boolean z = true;
        if (!aqqeVar.h().booleanValue() && !cqjv.v(aqqeVar.j()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
