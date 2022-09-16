package defpackage;
/* renamed from: azyp  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class azyp implements dbrn {
    static final dbrn a = new azyp();

    private azyp() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        donb b = donb.b(((dond) obj).b);
        return b == null ? donb.UNKNOWN_PROVENANCE : b;
    }
}
