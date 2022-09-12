package defpackage;
/* renamed from: bbkf  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bbkf implements cqlc {
    static final cqlc a = new bbkf();

    private bbkf() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bbnh bbnhVar = (bbnh) cqkpVar;
        cqjg cqjgVar = bbkw.a;
        boolean z = true;
        if (!bbnhVar.h().booleanValue() && !bbnhVar.i().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
