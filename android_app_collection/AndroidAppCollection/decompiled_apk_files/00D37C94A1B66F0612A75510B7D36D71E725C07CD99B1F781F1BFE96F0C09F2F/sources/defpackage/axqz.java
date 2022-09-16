package defpackage;
/* compiled from: PG */
/* renamed from: axqz  reason: default package */
/* loaded from: classes2.dex */
public final class axqz implements axqy {
    public static final vbt a;
    public static final vbt b;
    public static final vbt c;

    static {
        vbr b2 = new vbr(vbi.a("com.google.android.gms.auth_account")).b();
        b2.c("getTokenRefactor__account_data_service_sample_percentage", 0.0d);
        b2.f("getTokenRefactor__account_data_service_tokenAPI_usable", true);
        b2.d("getTokenRefactor__account_manager_timeout_seconds", 20L);
        b2.d("getTokenRefactor__android_id_shift", 0L);
        b2.f("getTokenRefactor__authenticator_logic_improved", false);
        try {
            a = b2.g("getTokenRefactor__blocked_packages", (aoto) aopi.parseFrom(aoto.a, new byte[]{10, 19, 99, 111, 109, 46, 97, 110, 100, 114, 111, 105, 100, 46, 118, 101, 110, 100, 105, 110, 103, 10, 32, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 97, 112, 112, 115, 46, 109, 101, 101, 116, 105, 110, 103, 115, 10, 33, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 97, 112, 112, 115, 46, 109, 101, 115, 115, 97, 103, 105, 110, 103}), axqv.c);
            b2.f("getTokenRefactor__chimera_get_token_evolved", true);
            b2.d("getTokenRefactor__clear_token_timeout_seconds", 20L);
            b2.d("getTokenRefactor__default_task_timeout_seconds", 20L);
            b = b2.f("getTokenRefactor__gaul_accounts_api_evolved", false);
            c = b2.f("getTokenRefactor__gaul_token_api_evolved", false);
            b2.d("getTokenRefactor__get_token_timeout_seconds", 120L);
            b2.f("getTokenRefactor__gms_account_authenticator_evolved", true);
            b2.c("getTokenRefactor__gms_account_authenticator_sample_percentage", 0.0d);
        } catch (aopx unused) {
            throw new AssertionError("Could not parse proto flag \"getTokenRefactor__blocked_packages\"");
        }
    }

    @Override // defpackage.axqy
    public final aoto a() {
        return (aoto) a.c();
    }

    @Override // defpackage.axqy
    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    @Override // defpackage.axqy
    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }
}
