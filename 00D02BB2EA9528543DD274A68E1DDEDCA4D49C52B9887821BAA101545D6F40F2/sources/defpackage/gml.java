package defpackage;
/* renamed from: gml  reason: default package */
/* loaded from: classes6.dex */
final /* synthetic */ class gml implements cqlc {
    static final cqlc a = new gml();

    private gml() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        jam jamVar = (jam) cqkpVar;
        int i = gna.a;
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
