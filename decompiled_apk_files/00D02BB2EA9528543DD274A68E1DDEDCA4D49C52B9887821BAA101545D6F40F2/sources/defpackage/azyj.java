package defpackage;
/* renamed from: azyj  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class azyj implements dbrn {
    static final dbrn a = new azyj();

    private azyj() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        donb b = donb.b(((dond) obj).b);
        return b == null ? donb.UNKNOWN_PROVENANCE : b;
    }
}
