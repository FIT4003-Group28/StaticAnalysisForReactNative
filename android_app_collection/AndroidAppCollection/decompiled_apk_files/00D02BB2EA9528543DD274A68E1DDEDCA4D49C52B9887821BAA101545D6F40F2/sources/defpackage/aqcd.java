package defpackage;
/* renamed from: aqcd  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aqcd implements dbrn {
    static final dbrn a = new aqcd();

    private aqcd() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        dbsg dbsgVar = (dbsg) obj;
        if (dbsgVar == null || !dbsgVar.a()) {
            throw new IllegalStateException("Registration failed");
        }
        return dcdc.f((ctyy) dbsgVar.b());
    }
}
