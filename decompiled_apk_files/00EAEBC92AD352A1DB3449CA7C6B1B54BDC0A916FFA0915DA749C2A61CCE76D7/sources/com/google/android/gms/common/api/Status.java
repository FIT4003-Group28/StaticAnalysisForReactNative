package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import com.reactnativecommunity.webview.RNCWebViewManager;
/* loaded from: classes.dex */
public final class Status extends com.google.android.gms.common.internal.x.a implements k, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR;

    /* renamed from: f  reason: collision with root package name */
    public static final Status f6798f = new Status(0);

    /* renamed from: g  reason: collision with root package name */
    public static final Status f6799g;

    /* renamed from: h  reason: collision with root package name */
    public static final Status f6800h;

    /* renamed from: b  reason: collision with root package name */
    private final int f6801b;

    /* renamed from: c  reason: collision with root package name */
    private final int f6802c;

    /* renamed from: d  reason: collision with root package name */
    private final String f6803d;

    /* renamed from: e  reason: collision with root package name */
    private final PendingIntent f6804e;

    static {
        new Status(14);
        new Status(8);
        f6799g = new Status(15);
        f6800h = new Status(16);
        new Status(17);
        new Status(18);
        CREATOR = new p();
    }

    public Status(int i) {
        this(i, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.f6801b = i;
        this.f6802c = i2;
        this.f6803d = str;
        this.f6804e = pendingIntent;
    }

    public Status(int i, String str) {
        this(1, i, str, null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f6801b == status.f6801b && this.f6802c == status.f6802c && r.a(this.f6803d, status.f6803d) && r.a(this.f6804e, status.f6804e);
    }

    public final int hashCode() {
        return r.a(Integer.valueOf(this.f6801b), Integer.valueOf(this.f6802c), this.f6803d, this.f6804e);
    }

    @Override // com.google.android.gms.common.api.k
    public final Status n() {
        return this;
    }

    public final int q() {
        return this.f6802c;
    }

    public final String r() {
        return this.f6803d;
    }

    public final boolean s() {
        return this.f6804e != null;
    }

    public final boolean t() {
        return this.f6802c <= 0;
    }

    public final String toString() {
        r.a a2 = r.a(this);
        a2.a("statusCode", u());
        a2.a("resolution", this.f6804e);
        return a2.toString();
    }

    public final String u() {
        String str = this.f6803d;
        return str != null ? str : d.a(this.f6802c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, q());
        com.google.android.gms.common.internal.x.c.a(parcel, 2, r(), false);
        com.google.android.gms.common.internal.x.c.a(parcel, 3, (Parcelable) this.f6804e, i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, (int) RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, this.f6801b);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
