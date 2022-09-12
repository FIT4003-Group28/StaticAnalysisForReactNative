package defpackage;
/* renamed from: bhuf  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bhuf implements dbrn {
    static final dbrn a = new bhuf();

    private bhuf() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        cdiy cdiyVar = (cdiy) obj;
        boolean z = true;
        if (!cdiyVar.d().a() && !cdiyVar.e().a()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
