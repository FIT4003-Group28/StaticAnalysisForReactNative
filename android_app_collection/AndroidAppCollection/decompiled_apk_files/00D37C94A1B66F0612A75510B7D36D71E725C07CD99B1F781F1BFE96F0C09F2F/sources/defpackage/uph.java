package defpackage;
/* compiled from: PG */
/* renamed from: uph  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class uph implements amqo {
    public final /* synthetic */ upi a;
    private final /* synthetic */ int b;

    public /* synthetic */ uph(upi upiVar, int i) {
        this.b = i;
        this.a = upiVar;
    }

    @Override // defpackage.amqo
    public final Object get() {
        switch (this.b) {
            case 0:
                vpg e = this.a.a.e("/client_streamz/og_android/lazy_provider_count", vpf.c("app_package"));
                e.c();
                return e;
            case 1:
                vpg e2 = this.a.a.e("/client_streamz/og_android/invalid_user_profile_switch", vpf.c("app_package"));
                e2.c();
                return e2;
            case 2:
                vpg e3 = this.a.a.e("/client_streamz/og_android/switch_profile", vpf.c("result"), vpf.a("has_category_launcher"), vpf.a("has_category_info"), vpf.a("user_in_target_user_profiles"), vpf.b("api_version"), vpf.c("app_package"));
                e3.c();
                return e3;
            case 3:
                vpg e4 = this.a.a.e("/client_streamz/og_android/visual_elements_usage", vpf.c("app_package"), vpf.a("ve_enabled"), vpf.a("ve_provided"));
                e4.c();
                return e4;
            case 4:
                vpg e5 = this.a.a.e("/client_streamz/og_android/load_owners_count", vpf.c("implementation"), vpf.c("result"), vpf.b("number_of_owners"), vpf.c("app_package"), vpf.a("load_cached"));
                e5.c();
                return e5;
            case 5:
                vpg e6 = this.a.a.e("/client_streamz/og_android/load_owner_count", vpf.c("implementation"), vpf.c("result"), vpf.c("app_package"));
                e6.c();
                return e6;
            case 6:
                vpg e7 = this.a.a.e("/client_streamz/og_android/legacy/load_owners", vpf.c("app_package"));
                e7.c();
                return e7;
            case 7:
                vpg e8 = this.a.a.e("/client_streamz/og_android/load_owner_avatar_count", vpf.c("implementation"), vpf.c("avatar_size"), vpf.c("result"), vpf.c("app_package"), vpf.a("load_cached"));
                e8.c();
                return e8;
            case 8:
                vpd b = this.a.a.b("/client_streamz/og_android/load_owners_latency", vpf.c("implementation"), vpf.c("result"), vpf.b("number_of_owners"), vpf.c("app_package"), vpf.a("load_cached"));
                b.c();
                return b;
            case 9:
                vpd b2 = this.a.a.b("/client_streamz/og_android/load_owner_avatar_latency", vpf.c("implementation"), vpf.c("avatar_size"), vpf.c("result"), vpf.c("app_package"), vpf.a("load_cached"));
                b2.c();
                return b2;
            default:
                vpg e9 = this.a.a.e("/client_streamz/og_android/profile_cache/get_people_me", vpf.c("result"), vpf.c("app_package"));
                e9.c();
                return e9;
        }
    }
}
