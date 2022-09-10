package defpackage;
/* renamed from: cyee  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cyee implements dbrn {
    static final dbrn a = new cyee();

    private cyee() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        cyft cyftVar = (cyft) obj;
        cyeh cyehVar = cyeh.PROFILE_PREFERRED;
        boolean z = false;
        if (cyftVar.b() != null && cyftVar.b().h().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
