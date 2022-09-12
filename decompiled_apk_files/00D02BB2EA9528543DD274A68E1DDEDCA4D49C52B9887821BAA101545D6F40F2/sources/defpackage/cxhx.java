package defpackage;
/* renamed from: cxhx  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cxhx implements dbrn {
    static final dbrn a = new cxhx();

    private cxhx() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        dbsg dbsgVar = (dbsg) obj;
        if (dbsgVar.a()) {
            return cxhl.c((dslt) dbsgVar.b(), dsld.PERSISTENT_CACHE);
        }
        return null;
    }
}
