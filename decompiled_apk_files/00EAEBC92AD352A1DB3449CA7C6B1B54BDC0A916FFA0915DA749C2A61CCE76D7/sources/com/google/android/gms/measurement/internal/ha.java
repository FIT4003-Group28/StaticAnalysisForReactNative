package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
/* loaded from: classes.dex */
public final class ha {

    /* renamed from: a  reason: collision with root package name */
    private final d5 f7348a;

    public ha(d5 d5Var) {
        this.f7348a = d5Var;
    }

    private final boolean c() {
        return d() && this.f7348a.b().a() - this.f7348a.o().B.a() > this.f7348a.n().a((String) null, r.S0);
    }

    private final boolean d() {
        return this.f7348a.o().B.a() > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.f7348a.a().g();
        if (!d()) {
            return;
        }
        if (c()) {
            this.f7348a.o().A.a(null);
            Bundle bundle = new Bundle();
            bundle.putString("source", "(not set)");
            bundle.putString("medium", "(not set)");
            bundle.putString("_cis", "intent");
            bundle.putLong("_cc", 1L);
            this.f7348a.t().a("auto", "_cmpx", bundle);
        } else {
            String a2 = this.f7348a.o().A.a();
            if (TextUtils.isEmpty(a2)) {
                this.f7348a.c().t().a("Cache still valid but referrer not found");
            } else {
                long a3 = ((this.f7348a.o().B.a() / 3600000) - 1) * 3600000;
                Uri parse = Uri.parse(a2);
                Bundle bundle2 = new Bundle();
                Pair pair = new Pair(parse.getPath(), bundle2);
                for (String str : parse.getQueryParameterNames()) {
                    bundle2.putString(str, parse.getQueryParameter(str));
                }
                ((Bundle) pair.second).putLong("_cc", a3);
                this.f7348a.t().a((String) pair.first, "_cmp", (Bundle) pair.second);
            }
            this.f7348a.o().A.a(null);
        }
        this.f7348a.o().B.a(0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, Bundle bundle) {
        String str2;
        this.f7348a.a().g();
        if (!this.f7348a.g()) {
            if (bundle == null || bundle.isEmpty()) {
                str2 = null;
            } else {
                if (str == null || str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str3 : bundle.keySet()) {
                    builder.appendQueryParameter(str3, bundle.getString(str3));
                }
                str2 = builder.build().toString();
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            this.f7348a.o().A.a(str2);
            this.f7348a.o().B.a(this.f7348a.b().a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        if (!d() || !c()) {
            return;
        }
        this.f7348a.o().A.a(null);
    }
}
