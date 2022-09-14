package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
@Deprecated
/* loaded from: classes.dex */
public final class f {

    /* renamed from: d  reason: collision with root package name */
    private static final Object f6880d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private static f f6881e;

    /* renamed from: a  reason: collision with root package name */
    private final String f6882a;

    /* renamed from: b  reason: collision with root package name */
    private final Status f6883b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f6884c;

    f(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(com.google.android.gms.common.k.common_google_play_services_unknown_issue));
        boolean z = false;
        if (identifier != 0) {
            this.f6884c = !(resources.getInteger(identifier) != 0 ? true : z);
        } else {
            this.f6884c = false;
        }
        String a2 = com.google.android.gms.common.internal.r0.a(context);
        a2 = a2 == null ? new com.google.android.gms.common.internal.w(context).a("google_app_id") : a2;
        if (TextUtils.isEmpty(a2)) {
            this.f6883b = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.f6882a = null;
            return;
        }
        this.f6882a = a2;
        this.f6883b = Status.f6798f;
    }

    public static Status a(Context context) {
        Status status;
        com.google.android.gms.common.internal.s.a(context, "Context must not be null.");
        synchronized (f6880d) {
            if (f6881e == null) {
                f6881e = new f(context);
            }
            status = f6881e.f6883b;
        }
        return status;
    }

    private static f a(String str) {
        f fVar;
        synchronized (f6880d) {
            if (f6881e == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
                sb.append("Initialize must be called before ");
                sb.append(str);
                sb.append(".");
                throw new IllegalStateException(sb.toString());
            }
            fVar = f6881e;
        }
        return fVar;
    }

    public static String a() {
        return a("getGoogleAppId").f6882a;
    }

    public static boolean b() {
        return a("isMeasurementExplicitlyDisabled").f6884c;
    }
}
