package defpackage;
/* renamed from: paa  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class paa implements dbrn {
    static final dbrn a = new paa();

    private paa() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        dobr dobrVar = ((dvyw) obj).aF;
        if (dobrVar == null) {
            dobrVar = dobr.g;
        }
        doay b = doay.b(dobrVar.c);
        return b == null ? doay.UNSUPPORTED : b;
    }
}
