package com.google.android.libraries.social.peoplekit.common.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class Stopwatch implements Parcelable {
    public static final Parcelable.Creator<Stopwatch> CREATOR = new cxqt();
    long a;
    long b;
    public boolean c;

    public Stopwatch() {
        this.c = false;
        this.a = 0L;
        this.b = 0L;
    }

    public Stopwatch(Parcel parcel) {
        this.c = parcel.readInt() != 1 ? false : true;
        this.a = parcel.readLong();
        this.b = parcel.readLong();
    }

    private static final long e() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    public final long a() {
        long j = this.b;
        return this.c ? j + (e() - this.a) : j;
    }

    public final void b() {
        this.c = false;
        this.a = 0L;
        this.b = 0L;
    }

    public final void c() {
        if (this.c) {
            return;
        }
        this.a = e();
        this.c = true;
    }

    public final void d() {
        if (!this.c) {
            return;
        }
        this.b += e() - this.a;
        this.c = false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
