package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cxsg  reason: default package */
/* loaded from: classes5.dex */
public final class cxsg {
    public static final cxju<Boolean> a;
    public static final cxju<Integer> b;
    public static final cxju<Double> c;
    public static final cxju<Boolean> d;
    public static final cxju<Boolean> e;
    public static final cxju<Boolean> f;
    public static final cxju<Boolean> g;
    public static final cxju<Boolean> h;
    public static final cxju<Boolean> i;
    public static final cxju<Boolean> j;
    public static final cxju<Boolean> k;
    private static final cxjs l;
    private static final cxju<Boolean> m;
    private static final cxju<Boolean> n;
    private static final cxju<Boolean> o;
    private static final cxju<Boolean> p;

    static {
        cxjs a2 = new cxjs("phenotype_shared_prefs").a("PeopleKitFlags__");
        l = a2;
        a = a2.d("do_name_container_check_flag", false);
        b = a2.e("third_party_more_button_position_flag", 0);
        c = a2.f("third_party_recency_weight_flag", 1.0d);
        m = a2.d("remove_sendkit_cache_flag", false);
        d = a2.d("use_fife_crop_flag", true);
        e = a2.d("support_pasted_list_flag", true);
        n = a2.d("support_copy_chip_flag", false);
        o = a2.d("support_copy_all_flag", false);
        f = a2.d("use_populous_az_api_flag", false);
        g = a2.d("log_user_entered_provenance_flag", true);
        h = a2.d("use_populous_lean_flag", false);
        p = a2.d("use_data_load_and_ui_display_time_flag", true);
        i = a2.d("calculate_extra_space_in_chip_group_flag", true);
        j = a2.d("calculate_collapse_for_chip_group_flag", true);
        k = a2.d("skip_tls_placeholders_flag", true);
    }

    public static void a(Context context) {
        cxju.c(context);
    }

    public static boolean b() {
        return m.f().booleanValue();
    }

    public static boolean c() {
        return n.f().booleanValue();
    }

    public static boolean d() {
        return o.f().booleanValue();
    }

    public static boolean e() {
        return p.f().booleanValue();
    }
}
