package defpackage;

import com.google.android.gms.common.Feature;
/* compiled from: PG */
/* renamed from: cmqy  reason: default package */
/* loaded from: classes5.dex */
public final class cmqy {
    public static final Feature a;
    public static final Feature b;

    static {
        new Feature("account_data_service", 6L);
        new Feature("account_data_service_legacy", 1L);
        new Feature("account_data_service_token", 4L);
        new Feature("account_data_service_visibility", 1L);
        a = new Feature("google_auth_service_token", 3L);
        b = new Feature("google_auth_service_accounts", 2L);
        new Feature("work_account_client_is_whitelisted", 1L);
        new Feature("config_sync", 1L);
    }
}
