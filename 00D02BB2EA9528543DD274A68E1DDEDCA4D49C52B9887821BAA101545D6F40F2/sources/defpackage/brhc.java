package defpackage;
/* renamed from: brhc  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class brhc implements dbsl {
    static final dbsl a = new brhc();

    private brhc() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        afga afgaVar = (afga) obj;
        dbsl<afga> dbslVar = brhd.j;
        return brhd.h(afgaVar.a) && (afib.SEARCH == afgaVar.c() || afib.SEARCH_LIST == afgaVar.c());
    }
}
