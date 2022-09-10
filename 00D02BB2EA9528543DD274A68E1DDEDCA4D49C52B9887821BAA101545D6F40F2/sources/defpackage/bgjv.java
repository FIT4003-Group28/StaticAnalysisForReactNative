package defpackage;
/* renamed from: bgjv  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bgjv implements cqlc {
    static final cqlc a = new bgjv();

    private bgjv() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bgnt bgntVar = (bgnt) cqkpVar;
        int i = bgjx.a;
        boolean booleanValue = bgntVar.c().booleanValue();
        CharSequence g = bgntVar.g();
        return booleanValue ? g : g.toString();
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
