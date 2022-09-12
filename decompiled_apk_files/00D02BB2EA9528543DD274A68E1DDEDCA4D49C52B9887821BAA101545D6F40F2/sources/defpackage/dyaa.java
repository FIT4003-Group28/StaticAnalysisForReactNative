package defpackage;
/* compiled from: PG */
/* renamed from: dyaa  reason: default package */
/* loaded from: classes6.dex */
public final class dyaa implements dxzz {
    public static final cxju<Boolean> A;
    public static final cxju<Boolean> B;
    public static final cxju<Boolean> C;
    public static final cxju<Boolean> D;
    public static final cxju<Boolean> E;
    public static final cxju<Boolean> F;
    public static final cxju<Boolean> G;
    public static final cxju<Boolean> H;
    public static final cxju<Long> I;
    public static final cxju<Long> J;
    public static final cxju<Long> K;
    public static final cxju<Long> L;
    public static final cxju<Long> M;
    public static final cxju<Boolean> N;
    public static final cxju<Boolean> O;
    public static final cxju<Long> P;
    public static final cxju<Long> Q;
    public static final cxju<Boolean> R;
    public static final cxju<Boolean> S;
    public static final cxju<Long> T;
    public static final cxju<Long> U;
    public static final cxju<Boolean> a;
    public static final cxju<Boolean> b;
    public static final cxju<Boolean> c;
    public static final cxju<Boolean> d;
    public static final cxju<Boolean> e;
    public static final cxju<Boolean> f;
    public static final cxju<Boolean> g;
    public static final cxju<Boolean> h;
    public static final cxju<Boolean> i;
    public static final cxju<Boolean> j;
    public static final cxju<Boolean> k;
    public static final cxju<Boolean> l;
    public static final cxju<Boolean> m;
    public static final cxju<Boolean> n;
    public static final cxju<Boolean> o;
    public static final cxju<Boolean> p;
    public static final cxju<Boolean> q;
    public static final cxju<Boolean> r;
    public static final cxju<Boolean> s;
    public static final cxju<Boolean> t;
    public static final cxju<Boolean> u;
    public static final cxju<Boolean> v;
    public static final cxju<Boolean> w;
    public static final cxju<Boolean> x;
    public static final cxju<Boolean> y;
    public static final cxju<Boolean> z;

    static {
        cxjs c2 = new cxjs(cxjd.a("com.google.lighter.android")).c();
        c2.h("enable_periodic_pull_messages", false);
        a = c2.h("capability_reporting_enabled", false);
        c2.g("delivery_receipt_retry_time_ms", 300000L);
        c2.h("enable_delivery_receipts", true);
        c2.h("enable_delivery_receipt_retry", true);
        c2.h("enable_action_callback_failure_handling", false);
        c2.h("enable_action_callback_failure_parsing", false);
        c2.h("enable_android_restricted_api_key_auth", false);
        b = c2.h("enable_better_link_movement_method", true);
        c = c2.h("enable_bind_channel_loading_indicator", false);
        d = c2.h("enable_bind_channel_retry", false);
        e = c2.h("UserInterface__enable_bottom_sheet_overlay_style", false);
        c2.h("enable_capabilities", false);
        f = c2.h("enable_cloud_bootstrap_gmm_merchant_mode", false);
        g = c2.h("enable_handle_cloud_delete_conversation_event", false);
        h = c2.h("enable_cloud_delete_event_sending", false);
        c2.h("enable_composed_overlay_action", false);
        c2.h("enable_copy_functionality_for_text", false);
        c2.h("enable_custom_channel_builder", false);
        i = c2.h("enable_custom_content_view_on_header", false);
        j = c2.h("enable_dark_mode_in_conversation_list", false);
        c2.h("enable_grpc_preemptive_connect", false);
        c2.h("enable_header_buttons_from_profile", false);
        k = c2.h("enable_intent_message_testing", false);
        c2.h("enable_lighter_intent_welcome_message", false);
        l = c2.h("enable_link_preview", false);
        c2.h("enable_live_data_support", false);
        m = c2.h("enable_menu_item_parsing", false);
        n = c2.h("enable_overlay_richcard_message", false);
        o = c2.h("enable_photos_messaging", false);
        c2.h("enable_profile_label_styles", false);
        p = c2.h("enable_receiving_typing_indicators_if_master_flag_on", true);
        q = c2.h("enable_rich_card_v2_messaging", false);
        r = c2.h("enable_rich_card_width_and_alignment_change", false);
        s = c2.h("enable_rich_cards_messaging", false);
        t = c2.h("enable_rich_text_hyper_link", false);
        u = c2.h("enable_rich_text_proto_composing", false);
        v = c2.h("enable_rich_text_proto_parsing", false);
        w = c2.h("enable_rich_text_rendering", false);
        x = c2.h("enable_send_callback_intent_event", false);
        c2.h("enable_send_conversation_intent_opened", false);
        y = c2.h("enable_sending_typing_indicators_if_master_flag_on", true);
        z = c2.h("enable_suggestion_chip_rendering", false);
        c2.h("enable_suggestion_chip_second_line_parsing", false);
        A = c2.h("enable_suggestion_chip_storage", false);
        c2.h("enable_suggestion_hint_text_parsing", false);
        B = c2.h("enable_tombstone_action_handling", false);
        C = c2.h("enable_tombstone_action_parsing", false);
        D = c2.h("enable_tombstone_parsing", false);
        E = c2.h("enable_tombstone_rendering", false);
        F = c2.h("enable_typing_indicators", false);
        G = c2.h("enable_ui_configurations_parsing", false);
        c2.h("enable_unsupported_message_handling", false);
        H = c2.h("enable_url_action_handling", false);
        I = c2.g("lighter_bootstrap_list_conversation_page_size", 50L);
        J = c2.g("lighter_bootstrap_list_message_page_size", 50L);
        K = c2.g("lighter_bootstrap_message_deletion_duration_mills ", 1728000000L);
        L = c2.g("lighter_bootstrap_rate_limit_interval_millis", 86400000L);
        M = c2.g("lighter_bootstrap_threshold_millis", 2592000000L);
        c2.g("max_stale_receipt_retry_time_ms", 604800000L);
        c2.g("max_thumbnail_size_bytes", 16384L);
        c2.g("max_token_validity_window_in_millis", 604800000L);
        N = c2.h("override_enable_receiving_typing_indicators", false);
        O = c2.h("override_enable_sending_typing_indicators", false);
        P = c2.g("profile_refresh_interval_millis", 604800000L);
        Q = c2.g("profile_refresh_jitter_millis", 7200000L);
        R = c2.h("read_receipts_receiving_enabled", false);
        c2.h("read_receipts_self_fanout_enabled", false);
        S = c2.h("read_receipts_sending_enabled", false);
        c2.h("refresh_token_in_get_account_context", false);
        c2.h("refreshes_after_conversation_opened_intent_enabled", false);
        T = c2.g("rich_card_max_height", 0L);
        U = c2.g("rich_card_max_standalone_width", 480L);
        c2.h("should_handle_read_notifications", false);
        c2.h("show_call_button_on_header", false);
        c2.g("welcome_message_latency", 0L);
    }

    @Override // defpackage.dxzz
    public final boolean A() {
        return C.f().booleanValue();
    }

    @Override // defpackage.dxzz
    public final boolean B() {
        return D.f().booleanValue();
    }

    @Override // defpackage.dxzz
    public final boolean C() {
        return E.f().booleanValue();
    }

    @Override // defpackage.dxzz
    public final boolean D() {
        return F.f().booleanValue();
    }

    @Override // defpackage.dxzz
    public final boolean E() {
        return G.f().booleanValue();
    }

    @Override // defpackage.dxzz
    public final boolean F() {
        return H.f().booleanValue();
    }

    @Override // defpackage.dxzz
    public final long G() {
        return I.f().longValue();
    }

    @Override // defpackage.dxzz
    public final long H() {
        return J.f().longValue();
    }

    @Override // defpackage.dxzz
    public final long I() {
        return K.f().longValue();
    }

    @Override // defpackage.dxzz
    public final long J() {
        return L.f().longValue();
    }

    @Override // defpackage.dxzz
    public final long K() {
        return M.f().longValue();
    }

    @Override // defpackage.dxzz
    public final boolean L() {
        return N.f().booleanValue();
    }

    @Override // defpackage.dxzz
    public final boolean M() {
        return O.f().booleanValue();
    }

    @Override // defpackage.dxzz
    public final long N() {
        return P.f().longValue();
    }

    @Override // defpackage.dxzz
    public final long O() {
        return Q.f().longValue();
    }

    @Override // defpackage.dxzz
    public final boolean P() {
        return R.f().booleanValue();
    }

    @Override // defpackage.dxzz
    public final boolean Q() {
        return S.f().booleanValue();
    }

    @Override // defpackage.dxzz
    public final long R() {
        return T.f().longValue();
    }

    @Override // defpackage.dxzz
    public final long S() {
        return U.f().longValue();
    }

    @Override // defpackage.dxzz
    public final boolean a() {
        return a.f().booleanValue();
    }

    @Override // defpackage.dxzz
    public final boolean b() {
        return b.f().booleanValue();
    }

    @Override // defpackage.dxzz
    public final boolean c() {
        return e.f().booleanValue();
    }

    @Override // defpackage.dxzz
    public final boolean d() {
        return f.f().booleanValue();
    }

    @Override // defpackage.dxzz
    public final boolean e() {
        return g.f().booleanValue();
    }

    @Override // defpackage.dxzz
    public final boolean f() {
        return h.f().booleanValue();
    }

    @Override // defpackage.dxzz
    public final boolean g() {
        return i.f().booleanValue();
    }

    @Override // defpackage.dxzz
    public final boolean h() {
        return j.f().booleanValue();
    }

    @Override // defpackage.dxzz
    public final boolean i() {
        return k.f().booleanValue();
    }

    @Override // defpackage.dxzz
    public final boolean j() {
        return l.f().booleanValue();
    }

    @Override // defpackage.dxzz
    public final boolean k() {
        return m.f().booleanValue();
    }

    @Override // defpackage.dxzz
    public final boolean l() {
        return n.f().booleanValue();
    }

    @Override // defpackage.dxzz
    public final boolean m() {
        return o.f().booleanValue();
    }

    @Override // defpackage.dxzz
    public final boolean n() {
        return p.f().booleanValue();
    }

    @Override // defpackage.dxzz
    public final boolean o() {
        return q.f().booleanValue();
    }

    @Override // defpackage.dxzz
    public final boolean p() {
        return r.f().booleanValue();
    }

    @Override // defpackage.dxzz
    public final boolean q() {
        return s.f().booleanValue();
    }

    @Override // defpackage.dxzz
    public final boolean r() {
        return t.f().booleanValue();
    }

    @Override // defpackage.dxzz
    public final boolean s() {
        return u.f().booleanValue();
    }

    @Override // defpackage.dxzz
    public final boolean t() {
        return v.f().booleanValue();
    }

    @Override // defpackage.dxzz
    public final boolean u() {
        return w.f().booleanValue();
    }

    @Override // defpackage.dxzz
    public final boolean v() {
        return x.f().booleanValue();
    }

    @Override // defpackage.dxzz
    public final boolean w() {
        return y.f().booleanValue();
    }

    @Override // defpackage.dxzz
    public final boolean x() {
        return z.f().booleanValue();
    }

    @Override // defpackage.dxzz
    public final boolean y() {
        return A.f().booleanValue();
    }

    @Override // defpackage.dxzz
    public final boolean z() {
        return B.f().booleanValue();
    }
}
