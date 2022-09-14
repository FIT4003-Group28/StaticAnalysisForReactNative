package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import c.e.a.b.d.g.h;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.measurement.internal.h7;
import com.google.firebase.iid.FirebaseInstanceId;
/* loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* renamed from: c  reason: collision with root package name */
    private static volatile FirebaseAnalytics f8263c;

    /* renamed from: a  reason: collision with root package name */
    private final h f8264a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f8265b;

    private FirebaseAnalytics(h hVar) {
        s.a(hVar);
        this.f8264a = hVar;
        this.f8265b = new Object();
    }

    private final void b(String str) {
        synchronized (this.f8265b) {
            com.google.android.gms.common.util.h.d().b();
        }
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f8263c == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f8263c == null) {
                    f8263c = new FirebaseAnalytics(h.a(context));
                }
            }
        }
        return f8263c;
    }

    @Keep
    public static h7 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        h a2 = h.a(context, (String) null, (String) null, (String) null, bundle);
        if (a2 == null) {
            return null;
        }
        return new b(a2);
    }

    public final void a() {
        b((String) null);
        this.f8264a.b();
    }

    @Deprecated
    public final void a(long j) {
        this.f8264a.a(j);
    }

    public final void a(String str) {
        this.f8264a.a(str);
    }

    public final void a(String str, Bundle bundle) {
        this.f8264a.a(str, bundle);
    }

    public final void a(String str, String str2) {
        this.f8264a.a(str, str2);
    }

    public final void a(boolean z) {
        this.f8264a.a(z);
    }

    public final void b(long j) {
        this.f8264a.b(j);
    }

    @Keep
    public final String getFirebaseInstanceId() {
        return FirebaseInstanceId.n().e();
    }

    @Keep
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        this.f8264a.a(activity, str, str2);
    }
}
