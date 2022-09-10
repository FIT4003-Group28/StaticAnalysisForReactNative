package defpackage;
/* renamed from: ozx  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class ozx implements dbrn {
    static final dbrn a = new ozx();

    private ozx() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        dvyw dvywVar = (dvyw) obj;
        return (dvywVar.a & 1024) != 0 ? dvywVar.p : dvywVar.o.size() > 0 ? dvywVar.o.get(0) : "";
    }
}
