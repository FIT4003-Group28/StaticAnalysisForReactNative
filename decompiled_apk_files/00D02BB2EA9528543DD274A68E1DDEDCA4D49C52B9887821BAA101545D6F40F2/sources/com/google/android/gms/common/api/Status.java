package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class Status extends AbstractSafeParcelable implements ReflectedParcelable, cnom {
    public static final Parcelable.Creator<Status> CREATOR;
    public static final Status a = new Status(0);
    public static final Status b = new Status(14);
    public static final Status c = new Status(8);
    public static final Status d = new Status(15);
    public static final Status e = new Status(16);
    final int f;
    public final int g;
    public final String h;
    public final PendingIntent i;
    public final ConnectionResult j;

    static {
        new Status(17);
        new Status(18);
        CREATOR = new cnop();
    }

    public Status(int i) {
        this(i, null);
    }

    public Status(int i, int i2, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.f = i;
        this.g = i2;
        this.h = str;
        this.i = pendingIntent;
        this.j = connectionResult;
    }

    @Override // defpackage.cnom
    public final Status a() {
        return this;
    }

    public final void b(Activity activity, int i) {
        if (!c()) {
            return;
        }
        PendingIntent pendingIntent = this.i;
        cnwc.a(pendingIntent);
        activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, null, 0, 0, 0);
    }

    public final boolean c() {
        return this.i != null;
    }

    public final boolean d() {
        return this.g <= 0;
    }

    public final String e() {
        String str = this.h;
        return str != null ? str : cnoc.getStatusCodeString(this.g);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f == status.f && this.g == status.g && cnvv.a(this.h, status.h) && cnvv.a(this.i, status.i) && cnvv.a(this.j, status.j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.g), this.h, this.i, this.j});
    }

    public final String toString() {
        cnvu b2 = cnvv.b(this);
        b2.a("statusCode", e());
        b2.a("resolution", this.i);
        return b2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d2 = cnwn.d(parcel);
        cnwn.g(parcel, 1, this.g);
        cnwn.k(parcel, 2, this.h, false);
        cnwn.u(parcel, 3, this.i, i);
        cnwn.u(parcel, 4, this.j, i);
        cnwn.g(parcel, 1000, this.f);
        cnwn.c(parcel, d2);
    }

    public Status(int i, String str, PendingIntent pendingIntent, byte[] bArr) {
        this(1, i, str, pendingIntent, null);
    }

    public Status(int i, String str) {
        this(i, str, null, null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(i, str, pendingIntent, null);
    }
}
