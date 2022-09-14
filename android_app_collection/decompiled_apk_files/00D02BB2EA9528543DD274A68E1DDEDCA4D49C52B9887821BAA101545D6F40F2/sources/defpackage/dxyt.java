package defpackage;
/* compiled from: PG */
/* renamed from: dxyt  reason: default package */
/* loaded from: classes6.dex */
public final class dxyt implements dxyr {
    public static final cxju<dsxj> a;
    public static final cxju<Boolean> b;
    public static final cxju<Boolean> c;

    static {
        cxjs b2 = new cxjs(cxjd.a("com.google.android.gms.auth_account")).b();
        b2.i("getTokenRefactor__account_data_service_sample_percentage", dcyn.a);
        b2.h("getTokenRefactor__account_data_service_tokenAPI_usable", true);
        b2.g("getTokenRefactor__account_manager_timeout_seconds", 20L);
        b2.g("getTokenRefactor__android_id_shift", 0L);
        b2.h("getTokenRefactor__authenticator_logic_improved", false);
        try {
            a = b2.k("getTokenRefactor__blocked_packages", (dsxj) dsqw.cq(dsxj.b, new byte[]{10, 19, 99, 111, 109, 46, 97, 110, 100, 114, 111, 105, 100, 46, 118, 101, 110, 100, 105, 110, 103}), dxys.a);
            b2.h("getTokenRefactor__chimera_get_token_evolved", true);
            b2.g("getTokenRefactor__clear_token_timeout_seconds", 20L);
            b2.g("getTokenRefactor__default_task_timeout_seconds", 20L);
            b = b2.h("getTokenRefactor__gaul_accounts_api_evolved", false);
            c = b2.h("getTokenRefactor__gaul_token_api_evolved", false);
            b2.g("getTokenRefactor__get_token_timeout_seconds", 120L);
            b2.h("getTokenRefactor__gms_account_authenticator_evolved", true);
            b2.i("getTokenRefactor__gms_account_authenticator_sample_percentage", dcyn.a);
        } catch (dsrm unused) {
            throw new AssertionError("Could not parse proto flag \"getTokenRefactor__blocked_packages\"");
        }
    }

    @Override // defpackage.dxyr
    public final dsxj a() {
        return a.f();
    }

    @Override // defpackage.dxyr
    public final boolean b() {
        return b.f().booleanValue();
    }

    @Override // defpackage.dxyr
    public final boolean c() {
        return c.f().booleanValue();
    }
}
