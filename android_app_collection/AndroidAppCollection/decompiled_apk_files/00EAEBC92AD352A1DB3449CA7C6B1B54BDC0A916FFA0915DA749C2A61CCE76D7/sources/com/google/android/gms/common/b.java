package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;
/* loaded from: classes.dex */
public final class b extends com.google.android.gms.common.internal.x.a {

    /* renamed from: b  reason: collision with root package name */
    private final int f6941b;

    /* renamed from: c  reason: collision with root package name */
    private final int f6942c;

    /* renamed from: d  reason: collision with root package name */
    private final PendingIntent f6943d;

    /* renamed from: e  reason: collision with root package name */
    private final String f6944e;

    /* renamed from: f  reason: collision with root package name */
    public static final b f6940f = new b(0);
    public static final Parcelable.Creator<b> CREATOR = new o();

    public b(int i) {
        this(i, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f6941b = i;
        this.f6942c = i2;
        this.f6943d = pendingIntent;
        this.f6944e = str;
    }

    public b(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public b(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(int i) {
        if (i != 99) {
            if (i == 1500) {
                return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
            }
            switch (i) {
                case -1:
                    return "UNKNOWN";
                case 0:
                    return "SUCCESS";
                case 1:
                    return "SERVICE_MISSING";
                case 2:
                    return "SERVICE_VERSION_UPDATE_REQUIRED";
                case 3:
                    return "SERVICE_DISABLED";
                case 4:
                    return "SIGN_IN_REQUIRED";
                case 5:
                    return "INVALID_ACCOUNT";
                case 6:
                    return "RESOLUTION_REQUIRED";
                case 7:
                    return "NETWORK_ERROR";
                case 8:
                    return "INTERNAL_ERROR";
                case 9:
                    return "SERVICE_INVALID";
                case 10:
                    return "DEVELOPER_ERROR";
                case 11:
                    return "LICENSE_CHECK_FAILED";
                default:
                    switch (i) {
                        case 13:
                            return "CANCELED";
                        case 14:
                            return "TIMEOUT";
                        case 15:
                            return "INTERRUPTED";
                        case 16:
                            return "API_UNAVAILABLE";
                        case 17:
                            return "SIGN_IN_FAILED";
                        case 18:
                            return "SERVICE_UPDATING";
                        case 19:
                            return "SERVICE_MISSING_PERMISSION";
                        case 20:
                            return "RESTRICTED_PROFILE";
                        case 21:
                            return "API_VERSION_UPDATE_REQUIRED";
                        default:
                            StringBuilder sb = new StringBuilder(31);
                            sb.append("UNKNOWN_ERROR_CODE(");
                            sb.append(i);
                            sb.append(")");
                            return sb.toString();
                    }
            }
        }
        return "UNFINISHED";
    }

    public final void a(Activity activity, int i) {
        if (!t()) {
            return;
        }
        activity.startIntentSenderForResult(this.f6943d.getIntentSender(), i, null, 0, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f6942c == bVar.f6942c && com.google.android.gms.common.internal.r.a(this.f6943d, bVar.f6943d) && com.google.android.gms.common.internal.r.a(this.f6944e, bVar.f6944e);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.r.a(Integer.valueOf(this.f6942c), this.f6943d, this.f6944e);
    }

    public final int q() {
        return this.f6942c;
    }

    public final String r() {
        return this.f6944e;
    }

    public final PendingIntent s() {
        return this.f6943d;
    }

    public final boolean t() {
        return (this.f6942c == 0 || this.f6943d == null) ? false : true;
    }

    public final String toString() {
        r.a a2 = com.google.android.gms.common.internal.r.a(this);
        a2.a("statusCode", a(this.f6942c));
        a2.a("resolution", this.f6943d);
        a2.a("message", this.f6944e);
        return a2.toString();
    }

    public final boolean u() {
        return this.f6942c == 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f6941b);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, q());
        com.google.android.gms.common.internal.x.c.a(parcel, 3, (Parcelable) s(), i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 4, r(), false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
