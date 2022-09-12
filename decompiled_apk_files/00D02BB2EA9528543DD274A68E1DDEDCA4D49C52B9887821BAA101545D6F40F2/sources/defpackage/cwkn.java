package defpackage;

import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: cwkn  reason: default package */
/* loaded from: classes.dex */
public final class cwkn {
    public final cznl a;
    public final dbty<cznb> c;
    public final dbty<cznb> d;
    public final dbty<cznb> e;
    public final dbty<cznb> f;
    private final cznj g;
    private final dbty<cznb> j;
    private final dbty<cznd> k;
    private final dbty<cznd> l;
    private final dbty<cznb> m;
    public final dbty<cznb> b = dbud.a(new dbty(this) { // from class: cwjz
        private final cwkn a;

        {
            this.a = this;
        }

        @Override // defpackage.dbty
        public final Object a() {
            cznb b = this.a.a.b("/client_streamz/og_android/invalid_user_profile_switch", cznf.a("app_package"));
            b.d();
            return b;
        }
    });
    private final dbty<cznb> h = dbud.a(new dbty(this) { // from class: cwke
        private final cwkn a;

        {
            this.a = this;
        }

        @Override // defpackage.dbty
        public final Object a() {
            cznb b = this.a.a.b("/client_streamz/og_android/switch_profile", cznf.a("result"), cznf.c("has_category_launcher"), cznf.c("has_category_info"), cznf.c("user_in_target_user_profiles"), cznf.b("api_version"), cznf.a("app_package"));
            b.d();
            return b;
        }
    });
    private final dbty<cznb> i = dbud.a(new dbty(this) { // from class: cwkf
        private final cwkn a;

        {
            this.a = this;
        }

        @Override // defpackage.dbty
        public final Object a() {
            cznb b = this.a.a.b("/client_streamz/og_android/load_owners_count", cznf.a("implementation"), cznf.a("result"), cznf.b("number_of_owners"), cznf.a("app_package"), cznf.c("load_cached"));
            b.d();
            return b;
        }
    });

    private cwkn(ScheduledExecutorService scheduledExecutorService, cznn cznnVar, Application application) {
        dbud.a(new dbty(this) { // from class: cwkg
            private final cwkn a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                cznb b = this.a.a.b("/client_streamz/og_android/load_owner_count", cznf.a("implementation"), cznf.a("result"), cznf.a("app_package"));
                b.d();
                return b;
            }
        });
        dbud.a(new dbty(this) { // from class: cwkh
            private final cwkn a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                cznb b = this.a.a.b("/client_streamz/og_android/legacy/load_owners", cznf.a("app_package"));
                b.d();
                return b;
            }
        });
        this.j = dbud.a(new dbty(this) { // from class: cwki
            private final cwkn a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                cznb b = this.a.a.b("/client_streamz/og_android/load_owner_avatar_count", cznf.a("implementation"), cznf.a("avatar_size"), cznf.a("result"), cznf.a("app_package"), cznf.c("load_cached"));
                b.d();
                return b;
            }
        });
        this.k = dbud.a(new dbty(this) { // from class: cwkj
            private final cwkn a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                cznd c = this.a.a.c("/client_streamz/og_android/load_owners_latency", cznf.a("implementation"), cznf.a("result"), cznf.b("number_of_owners"), cznf.a("app_package"), cznf.c("load_cached"));
                c.d();
                return c;
            }
        });
        this.l = dbud.a(new dbty(this) { // from class: cwkk
            private final cwkn a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                cznd c = this.a.a.c("/client_streamz/og_android/load_owner_avatar_latency", cznf.a("implementation"), cznf.a("avatar_size"), cznf.a("result"), cznf.a("app_package"), cznf.c("load_cached"));
                c.d();
                return c;
            }
        });
        this.m = dbud.a(new dbty(this) { // from class: cwkl
            private final cwkn a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                cznb b = this.a.a.b("/client_streamz/og_android/profile_cache/get_people_me", cznf.a("result"), cznf.a("app_package"));
                b.d();
                return b;
            }
        });
        this.c = dbud.a(new dbty(this) { // from class: cwkm
            private final cwkn a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                cznb b = this.a.a.b("/client_streamz/og_android/dark_launch/load_owners", cznf.a("mode"), cznf.c("obfuscated_gaia_id"), cznf.c("display_name"), cznf.c("given_name"), cznf.c("family_name"), cznf.c("is_g1_user"), cznf.c("avatar_url"), cznf.a("app_package"), cznf.c("load_cached"));
                b.d();
                return b;
            }
        });
        this.d = dbud.a(new dbty(this) { // from class: cwka
            private final cwkn a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                cznb b = this.a.a.b("/client_streamz/og_android/dark_launch/load_owners_metadata", cznf.c("mdi_has_display_name"), cznf.c("menagerie_has_display_name"), cznf.c("display_name_is_same"), cznf.c("mdi_has_avatar_url"), cznf.c("menagerie_has_avatar_url"), cznf.c("avatar_url_is_same"), cznf.a("app_package"), cznf.c("load_cached"));
                b.d();
                return b;
            }
        });
        this.e = dbud.a(new dbty(this) { // from class: cwkb
            private final cwkn a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                cznb b = this.a.a.b("/client_streamz/og_android/dark_launch/load_owner_avatar", cznf.a("mode"), cznf.c("url_availability"), cznf.a("app_package"), cznf.c("load_cached"));
                b.d();
                return b;
            }
        });
        dbud.a(new dbty(this) { // from class: cwkc
            private final cwkn a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                cznb b = this.a.a.b("/client_streamz/og_android/lazy_provider_count", cznf.a("app_package"));
                b.d();
                return b;
            }
        });
        this.f = dbud.a(new dbty(this) { // from class: cwkd
            private final cwkn a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                cznb b = this.a.a.b("/client_streamz/og_android/visual_elements_usage", cznf.a("app_package"), cznf.c("ve_enabled"), cznf.c("ve_provided"));
                b.d();
                return b;
            }
        });
        cznl a = cznl.a("STREAMZ_ONEGOOGLE_ANDROID");
        this.a = a;
        cznj cznjVar = a.a;
        if (cznjVar == null) {
            this.g = cznt.b(cznnVar, scheduledExecutorService, a, application);
            return;
        }
        this.g = cznjVar;
        ((cznt) cznjVar).a = cznnVar;
    }

    public static cwkn a(ScheduledExecutorService scheduledExecutorService, cznn cznnVar, Application application) {
        return new cwkn(scheduledExecutorService, cznnVar, application);
    }

    public final void b(String str, boolean z, boolean z2, boolean z3, int i, String str2) {
        this.h.a().a(str, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Integer.valueOf(i), str2);
    }

    public final void c(String str, String str2, int i, String str3, boolean z) {
        this.i.a().a(str, str2, Integer.valueOf(i), str3, Boolean.valueOf(z));
    }

    public final void d(String str, String str2, String str3, String str4, boolean z) {
        this.j.a().a(str, str2, str3, str4, Boolean.valueOf(z));
    }

    public final void e(double d, String str, String str2, int i, String str3, boolean z) {
        this.k.a().a(d, str, str2, Integer.valueOf(i), str3, Boolean.valueOf(z));
    }

    public final void f(double d, String str, String str2, String str3, String str4, boolean z) {
        this.l.a().a(d, str, str2, str3, str4, Boolean.valueOf(z));
    }

    public final void g(String str, String str2) {
        this.m.a().a(str, str2);
    }
}
