package c.e.b;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.common.util.n;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final String f4830a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4831b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4832c;

    /* renamed from: d  reason: collision with root package name */
    private final String f4833d;

    /* renamed from: e  reason: collision with root package name */
    private final String f4834e;

    /* renamed from: f  reason: collision with root package name */
    private final String f4835f;

    /* renamed from: g  reason: collision with root package name */
    private final String f4836g;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private String f4837a;

        /* renamed from: b  reason: collision with root package name */
        private String f4838b;

        /* renamed from: c  reason: collision with root package name */
        private String f4839c;

        /* renamed from: d  reason: collision with root package name */
        private String f4840d;

        /* renamed from: e  reason: collision with root package name */
        private String f4841e;

        /* renamed from: f  reason: collision with root package name */
        private String f4842f;

        /* renamed from: g  reason: collision with root package name */
        private String f4843g;

        public b a(String str) {
            s.a(str, (Object) "ApiKey must be set.");
            this.f4837a = str;
            return this;
        }

        public i a() {
            return new i(this.f4838b, this.f4837a, this.f4839c, this.f4840d, this.f4841e, this.f4842f, this.f4843g);
        }

        public b b(String str) {
            s.a(str, (Object) "ApplicationId must be set.");
            this.f4838b = str;
            return this;
        }

        public b c(String str) {
            this.f4839c = str;
            return this;
        }

        public b d(String str) {
            this.f4840d = str;
            return this;
        }

        public b e(String str) {
            this.f4841e = str;
            return this;
        }

        public b f(String str) {
            this.f4843g = str;
            return this;
        }

        public b g(String str) {
            this.f4842f = str;
            return this;
        }
    }

    private i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        s.b(!n.b(str), "ApplicationId must be set.");
        this.f4831b = str;
        this.f4830a = str2;
        this.f4832c = str3;
        this.f4833d = str4;
        this.f4834e = str5;
        this.f4835f = str6;
        this.f4836g = str7;
    }

    public static i a(Context context) {
        w wVar = new w(context);
        String a2 = wVar.a("google_app_id");
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        return new i(a2, wVar.a("google_api_key"), wVar.a("firebase_database_url"), wVar.a("ga_trackingId"), wVar.a("gcm_defaultSenderId"), wVar.a("google_storage_bucket"), wVar.a("project_id"));
    }

    public String a() {
        return this.f4830a;
    }

    public String b() {
        return this.f4831b;
    }

    public String c() {
        return this.f4832c;
    }

    public String d() {
        return this.f4833d;
    }

    public String e() {
        return this.f4834e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return r.a(this.f4831b, iVar.f4831b) && r.a(this.f4830a, iVar.f4830a) && r.a(this.f4832c, iVar.f4832c) && r.a(this.f4833d, iVar.f4833d) && r.a(this.f4834e, iVar.f4834e) && r.a(this.f4835f, iVar.f4835f) && r.a(this.f4836g, iVar.f4836g);
    }

    public String f() {
        return this.f4836g;
    }

    public String g() {
        return this.f4835f;
    }

    public int hashCode() {
        return r.a(this.f4831b, this.f4830a, this.f4832c, this.f4833d, this.f4834e, this.f4835f, this.f4836g);
    }

    public String toString() {
        r.a a2 = r.a(this);
        a2.a("applicationId", this.f4831b);
        a2.a("apiKey", this.f4830a);
        a2.a("databaseUrl", this.f4832c);
        a2.a("gcmSenderId", this.f4834e);
        a2.a("storageBucket", this.f4835f);
        a2.a("projectId", this.f4836g);
        return a2.toString();
    }
}
