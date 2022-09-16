package defpackage;
/* compiled from: PG */
/* renamed from: dxxv  reason: default package */
/* loaded from: classes6.dex */
public final class dxxv implements dxxu {
    public static final cxju<Boolean> a;
    public static final cxju<Boolean> b;
    public static final cxju<Boolean> c;

    static {
        cxjs cxjsVar = new cxjs("com.google.android.libraries.notifications.GCM");
        a = cxjsVar.h("RegistrationFeature__disable_registration_on_login_accounts_changed", true);
        b = cxjsVar.h("RegistrationFeature__set_registration_request_gmscore_oid", true);
        c = cxjsVar.h("RegistrationFeature__set_registration_request_storage_oid", true);
    }

    @Override // defpackage.dxxu
    public final boolean a() {
        return a.f().booleanValue();
    }

    @Override // defpackage.dxxu
    public final boolean b() {
        return b.f().booleanValue();
    }

    @Override // defpackage.dxxu
    public final boolean c() {
        return c.f().booleanValue();
    }
}
