package defpackage;
/* renamed from: cyef  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cyef implements dbrn {
    static final dbrn a = new cyef();

    private cyef() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        cyft cyftVar = (cyft) obj;
        cyeh cyehVar = cyeh.PROFILE_PREFERRED;
        boolean z = false;
        if (cyftVar.b() != null && cyftVar.b().a()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
