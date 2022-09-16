package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.b;
import java.util.Map;
/* loaded from: classes.dex */
public final class s extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<s> CREATOR = new t();

    /* renamed from: b  reason: collision with root package name */
    Bundle f9478b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, String> f9479c;

    /* renamed from: d  reason: collision with root package name */
    private c f9480d;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Bundle f9481a = new Bundle();

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, String> f9482b = new a.e.a();

        public b(String str) {
            if (TextUtils.isEmpty(str)) {
                String valueOf = String.valueOf(str);
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Invalid to: ".concat(valueOf) : new String("Invalid to: "));
            } else {
                this.f9481a.putString("google.to", str);
            }
        }

        public b a(int i) {
            this.f9481a.putString("google.ttl", String.valueOf(i));
            return this;
        }

        public b a(String str) {
            this.f9481a.putString("collapse_key", str);
            return this;
        }

        public b a(String str, String str2) {
            this.f9482b.put(str, str2);
            return this;
        }

        public s a() {
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : this.f9482b.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            bundle.putAll(this.f9481a);
            this.f9481a.remove("from");
            return new s(bundle);
        }

        public b b(String str) {
            this.f9481a.putString("google.message_id", str);
            return this;
        }

        public b c(String str) {
            this.f9481a.putString("message_type", str);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private final String f9483a;

        /* renamed from: b  reason: collision with root package name */
        private final String f9484b;

        /* renamed from: c  reason: collision with root package name */
        private final String[] f9485c;

        /* renamed from: d  reason: collision with root package name */
        private final String f9486d;

        /* renamed from: e  reason: collision with root package name */
        private final String f9487e;

        /* renamed from: f  reason: collision with root package name */
        private final String[] f9488f;

        /* renamed from: g  reason: collision with root package name */
        private final String f9489g;

        /* renamed from: h  reason: collision with root package name */
        private final String f9490h;
        private final String i;
        private final String j;
        private final String k;
        private final String l;
        private final Uri m;
        private final String n;
        private final Integer o;
        private final Integer p;
        private final Integer q;

        private c(r rVar) {
            this.f9483a = rVar.g("gcm.n.title");
            this.f9484b = rVar.e("gcm.n.title");
            this.f9485c = a(rVar, "gcm.n.title");
            this.f9486d = rVar.g("gcm.n.body");
            this.f9487e = rVar.e("gcm.n.body");
            this.f9488f = a(rVar, "gcm.n.body");
            this.f9489g = rVar.g("gcm.n.icon");
            this.i = rVar.f();
            rVar.g("gcm.n.tag");
            this.j = rVar.g("gcm.n.color");
            this.k = rVar.g("gcm.n.click_action");
            this.l = rVar.g("gcm.n.android_channel_id");
            this.m = rVar.b();
            this.f9490h = rVar.g("gcm.n.image");
            this.n = rVar.g("gcm.n.ticker");
            this.o = rVar.b("gcm.n.notification_priority");
            this.p = rVar.b("gcm.n.visibility");
            this.q = rVar.b("gcm.n.notification_count");
            rVar.a("gcm.n.sticky");
            rVar.a("gcm.n.local_only");
            rVar.a("gcm.n.default_sound");
            rVar.a("gcm.n.default_vibrate_timings");
            rVar.a("gcm.n.default_light_settings");
            rVar.f("gcm.n.event_time");
            rVar.a();
            rVar.g();
        }

        private static String[] a(r rVar, String str) {
            Object[] d2 = rVar.d(str);
            if (d2 == null) {
                return null;
            }
            String[] strArr = new String[d2.length];
            for (int i = 0; i < d2.length; i++) {
                strArr[i] = String.valueOf(d2[i]);
            }
            return strArr;
        }

        public String a() {
            return this.f9486d;
        }

        public String[] b() {
            return this.f9488f;
        }

        public String c() {
            return this.f9487e;
        }

        public String d() {
            return this.l;
        }

        public String e() {
            return this.k;
        }

        public String f() {
            return this.j;
        }

        public String g() {
            return this.f9489g;
        }

        public Uri h() {
            String str = this.f9490h;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        public Uri i() {
            return this.m;
        }

        public Integer j() {
            return this.q;
        }

        public Integer k() {
            return this.o;
        }

        public String l() {
            return this.i;
        }

        public String m() {
            return this.n;
        }

        public String n() {
            return this.f9483a;
        }

        public String[] o() {
            return this.f9485c;
        }

        public String p() {
            return this.f9484b;
        }

        public Integer q() {
            return this.p;
        }
    }

    public s(Bundle bundle) {
        this.f9478b = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Intent intent) {
        intent.putExtras(this.f9478b);
    }

    public final String q() {
        return this.f9478b.getString("collapse_key");
    }

    public final Map<String, String> r() {
        if (this.f9479c == null) {
            this.f9479c = b.a.a(this.f9478b);
        }
        return this.f9479c;
    }

    public final String s() {
        return this.f9478b.getString("from");
    }

    public final String t() {
        String string = this.f9478b.getString("google.message_id");
        return string == null ? this.f9478b.getString("message_id") : string;
    }

    public final String u() {
        return this.f9478b.getString("message_type");
    }

    public final c v() {
        if (this.f9480d == null && r.a(this.f9478b)) {
            this.f9480d = new c(new r(this.f9478b));
        }
        return this.f9480d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        t.a(this, parcel, i);
    }

    public final long x() {
        Object obj = this.f9478b.get("google.sent_time");
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return 0L;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
            sb.append("Invalid sent time: ");
            sb.append(valueOf);
            Log.w("FirebaseMessaging", sb.toString());
            return 0L;
        }
    }

    public final String y() {
        return this.f9478b.getString("google.to");
    }

    public final int z() {
        Object obj = this.f9478b.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
            sb.append("Invalid TTL: ");
            sb.append(valueOf);
            Log.w("FirebaseMessaging", sb.toString());
            return 0;
        }
    }
}
