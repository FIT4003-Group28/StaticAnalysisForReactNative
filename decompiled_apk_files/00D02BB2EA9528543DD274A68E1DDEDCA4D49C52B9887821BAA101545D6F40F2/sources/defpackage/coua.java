package defpackage;

import com.google.android.gms.common.Feature;
/* compiled from: PG */
/* renamed from: coua  reason: default package */
/* loaded from: classes5.dex */
public final class coua {
    public static final Feature A;
    public static final Feature B;
    public static final Feature C;
    public static final Feature D;
    public static final Feature E;
    public static final Feature a = new Feature("pay", 10);
    public static final Feature b = new Feature("pay_attestation_signal", 1);
    public static final Feature c = new Feature("pay_pay_capabilities", 1);
    public static final Feature d = new Feature("pay_feature_check", 1);
    public static final Feature e = new Feature("pay_get_card_centric_bundle", 1);
    public static final Feature f = new Feature("pay_get_passes", 1);
    public static final Feature g = new Feature("pay_get_se_prepaid_card", 1);
    public static final Feature h = new Feature("pay_get_specific_bulletin", 1);
    public static final Feature i = new Feature("pay_global_actions", 1);
    public static final Feature j;
    public static final Feature k;
    public static final Feature l;
    public static final Feature m;
    public static final Feature n;
    public static final Feature o;
    public static final Feature p;
    public static final Feature q;
    public static final Feature r;
    public static final Feature s;
    public static final Feature t;
    public static final Feature u;
    public static final Feature v;
    public static final Feature w;
    public static final Feature x;
    public static final Feature y;
    public static final Feature z;

    static {
        new Feature("pay_gp3_support", 1L);
        j = new Feature("pay_homescreen_sorting", 3L);
        k = new Feature("pay_homescreen_bulletins", 2L);
        l = new Feature("pay_is_pay_module_available", 1L);
        m = new Feature("pay_onboarding", 2L);
        n = new Feature("pay_passes_field_update_notifications", 1L);
        o = new Feature("pay_passes_notifications", 2L);
        p = new Feature("pay_payment_method", 1L);
        q = new Feature("pay_payment_method_action_tokens", 2L);
        r = new Feature("pay_payment_method_server_action", 1L);
        s = new Feature("pay_request_module", 1L);
        t = new Feature("pay_reverse_purchase", 1L);
        u = new Feature("pay_save_passes", 2L);
        v = new Feature("pay_save_purchased_card", 1L);
        w = new Feature("pay_settings", 1L);
        x = new Feature("pay_transactions", 6L);
        y = new Feature("pay_update_bundle_with_client_settings", 1L);
        z = new Feature("pay_clock_skew_millis", 1L);
        A = new Feature("pay_se_postpaid_transactions", 1L);
        B = new Feature("pay_se_prepaid_transactions", 1L);
        C = new Feature("pay_get_clock_skew_millis", 1L);
        D = new Feature("pay_remove_se_postpaid_token", 1L);
        E = new Feature("pay_change_se_postpaid_default_status", 1L);
    }
}
